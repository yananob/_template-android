# Android Template Repository (_template-android)

Jetpack Compose および Modern Android Development (MAD) のベストプラクティスに基づいた Android アプリケーション開発用テンプレートリポジトリです。

## プロジェクト概要

- **UI フレームワーク**: Jetpack Compose (Material Design 3)
- **ビルドツール**: Gradle (Kotlin DSL)
- **ターゲット SDK**: Android 16 (API Level 36) / SDK Minor 1
- **最小動作 SDK**: Android 9.0 (API Level 28)
- **開発言語**: Kotlin

## ディレクトリ構成

```text
.
├── app/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/io/github/yananob/template_android/
│   │   │   │   ├── MainActivity.kt        # メインアクティビティ
│   │   │   │   └── ui/theme/              # テーマ・カラー・タイポグラフィ定義
│   │   │   └── res/                       # リソースファイル (Drawable, Mipmap等)
│   │   ├── test/                          # ユニットテスト
│   │   └── androidTest/                   # インストゥルメンテーションテスト
│   └── build.gradle.kts                   # アプリモジュールのビルド設定
├── gradle/
│   └── libs.versions.toml                 # Gradle Version Catalog (依存関係管理)
├── AGENTS.md                              # 開発・リファクタリング規約指示書
└── README.md                              # 本ドキュメント
```

## ビルドおよびテスト手順

### テストおよび静的解析の実行

プロジェクトの静的解析（Android Lint）およびユニットテストを実行するには、以下のコマンドを使用します。

```bash
./gradlew lintDebug test
```

### デバッグビルドの作成

```bash
./gradlew assembleDebug
```

## 開発規約およびリファクタリング方針

- **命名規約**:
  - 変数: `lowerCamelCase`
  - クラス / Composable 関数: `PascalCase`
- **アーキテクチャ方針**:
  - ドメイン駆動設計（DDD）の考え方に基づき、ロジックを適切にカプセル化・再利用します。
- **言語方針**:
  - コード内のコメント、コミットメッセージ、ドキュメントは日本語で記述します。
