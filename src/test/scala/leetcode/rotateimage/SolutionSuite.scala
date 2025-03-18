package leetcode.rotateimage

import munit.ScalaCheckSuite

class SolutionSuite extends ScalaCheckSuite:
  test("reversing") {
    val in  = Array(Array(1, 2, 3), Array(4, 5, 6), Array(7, 8, 9))
    val out = Array(Array(7, 4, 1), Array(8, 5, 2), Array(9, 6, 3))

    Solution.rotate(in)

    assertEquals(in.map(_.toSeq).toSeq, out.map(_.toSeq).toSeq)
  }
