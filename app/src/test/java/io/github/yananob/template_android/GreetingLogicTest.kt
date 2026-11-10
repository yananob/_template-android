package io.github.yananob.template_android

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * 挨拶メッセージ生成ロジック [formatGreetingMessage] のユニットテスト
 */
class GreetingLogicTest {

    @Test
    fun formatGreetingMessage_withValidName_returnsFormattedString() {
        val result = formatGreetingMessage("Android")
        assertEquals("Hello Android!", result)
    }

    @Test
    fun formatGreetingMessage_withEmptyName_returnsFormattedString() {
        val result = formatGreetingMessage("")
        assertEquals("Hello !", result)
    }

    @Test
    fun formatGreetingMessage_withWhitespace_returnsFormattedString() {
        val result = formatGreetingMessage("World")
        assertEquals("Hello World!", result)
    }
}
