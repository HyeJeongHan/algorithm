package om.project.algorithm

import com.project.algorithm.codility.MaxCounters
import org.junit.Assert
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class MaxCountersTest {
    @Test
    fun test() {

        val testClass = MaxCounters()

        Assert.assertArrayEquals(intArrayOf(3,2,2,4,2), testClass.maxCounters(5, intArrayOf(3, 4, 4, 6, 1, 4, 4)))
    }
}
