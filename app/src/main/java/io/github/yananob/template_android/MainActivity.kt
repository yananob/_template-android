package io.github.yananob.template_android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import io.github.yananob.template_android.ui.theme.TemplateAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TemplateAndroidTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

/**
 * 挨拶メッセージの文字列を生成する
 *
 * @param name 挨拶対象の名前
 * @return 整形された挨拶文字列
 */
fun formatGreetingMessage(name: String): String = "Hello $name!"

/**
 * 画面に挨拶メッセージを表示する Composable
 *
 * @param name 表示する対象の名前
 * @param modifier レイアウト修飾子
 */
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = formatGreetingMessage(name),
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TemplateAndroidTheme {
        Greeting("Android")
    }
}
