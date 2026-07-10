# _template_android

Android アプリケーションのテンプレートプロジェクトです。

## プロジェクト構造

- `app/`: Android アプリケーションモジュール
  - `src/main/java/`: ソースコード (DDD アーキテクチャを意識した構成)
  - `src/main/res/`: リソースファイル
- `gradle/`: Gradle 設定ファイルと Version Catalog (`libs.versions.toml`)
- `.github/workflows/`: CI/CD ワークフロー定義

## 注意事項

### パッケージ名とリポジトリ名

CI/CD ワークフローでは `${{ github.event.repository.name }}` を利用してパッケージ名を指定している箇所があります。Android のパッケージ名にはハイフン (`-`) を使用できないため、リポジトリ名にハイフンが含まれている場合は、ワークフローファイルを直接編集して適切なパッケージ名を設定してください。

## 特徴

### 自動バージョン管理

`app/build.gradle.kts` では、GitHub Actions の `GITHUB_RUN_NUMBER` を利用して `versionCode` と `versionName` を自動的に設定しています。
ローカルビルド時はデフォルト値が使用されます。

### ビルドタイプごとのアプリ名設定

`build.gradle.kts` の `resValue` を使用して、ビルドタイプ（`debug`, `release`）ごとにアプリ名を動的に変更しています。
これにより、同じデバイス上にリリース版とデバッグ版を共存させることが容易になります。
※ `strings.xml` に `app_name` を定義せず、`buildFeatures { resValues = true }` を有効にしています。

### アダプティブアイコン

`app/src/main/res/mipmap-anydpi/` 内の `ic_launcher.xml` および `ic_launcher_round.xml` では、`foreground` に直接 `@mipmap/ic_launcher_foreground` (ビットマップリソース) を指定しています。これにより、中間的な drawable XML を介さずにアイコンを設定しています。

## 開発ガイドライン

- **ネーミングルール**: 変数名は `lowerCamelCase` を使用してください。クラス名は `PascalCase` を使用してください。
- **アーキテクチャ**: DDD (Domain-Driven Design) の考え方を取り入れ、ロジックの集約を図ってください。
- **静的解析**: 変更後は `./gradlew lintDebug` を実行し、問題がないことを確認してください。