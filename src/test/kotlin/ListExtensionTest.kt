import org.hamcrest.core.Is.`is`
import org.junit.Assert.assertThat
import org.junit.Test

class ListExtensionTest {

    @Test
    fun singletonTest() {
        val expect = singleton(123)
        assertThat(listOf(123), `is`(expect))
    }

    @Test
    fun repeatTest() {
        val expect = repeat(3, 3)
        assertThat(listOf(3,3,3), `is`(expect))
    }

    @Test
    fun rangeTest() {
        val expect = range(1, 3)
        assertThat(listOf(1, 2, 3), `is`(expect))
    }

    @Test
    fun appendTest() {
        val expend = listOf(1, 2, 3).append(listOf(4, 5))
        assertThat(listOf(1,2,3,4,5), `is`(expend))
    }

    @Test
    fun concatTest() {
        val expect = listOf(listOf(1,2,3), listOf(4,5,6), listOf(7,8,9)).concat()
        assertThat(listOf(1,2,3,4,5,6,7,8,9), `is`(expect))
    }

    @Test
    fun headTest() {
        val expect = listOf(1, 2, 3).head()
        assertThat(1, `is`(expect))
    }

    @Test
    fun tailTest() {
        val expect = listOf(1, 2, 3).tail()
        assertThat(3, `is`(expect))
    }
}