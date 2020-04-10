package om.project.algorithm

import com.project.algorithm.codility.CountDiv
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class CountDivTest {
    @Test
    fun test() {

        val testClass = CountDiv()

        assertEquals(3, testClass.countDiv(6, 11, 2))
    }
}
