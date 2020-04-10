package om.project.algorithm

import com.project.algorithm.codility.PermCheck
import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class PermCheckTest {
    @Test
    fun test() {

        val testClass = PermCheck()

        assertEquals(0, testClass.permCheck(intArrayOf(2)))
    }
}
