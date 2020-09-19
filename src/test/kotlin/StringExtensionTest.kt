import org.hamcrest.core.Is.`is`
import org.junit.Assert.assertThat
import org.junit.Test

class StringExtensionTest {

    @Test
    fun concatTest() {
        val expected = listOf("never", "the", "less").concat()
        assertThat("nevertheless", `is`(expected))
    }

    @Test
    fun joinTest() {
        val expected = listOf("H", "w", "ii", "n").join("a")
        assertThat("Hawaiian", `is`(expected))
    }

    @Test
    fun wordsTest() {
        val expected = "How are \t you? \n Good?".words()
        assertThat(listOf("How", "are", "you?", "Good?"), `is`(expected))
    }

    @Test
    fun linesTest() {
        val expected = "How are you?\nGood?".lines()
        assertThat(listOf("How are you?", "Good?"), `is`(expected))
    }
}