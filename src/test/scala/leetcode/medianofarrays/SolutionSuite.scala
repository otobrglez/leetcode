package leetcode.medianofarrays

class SolutionSuite extends munit.FunSuite:
  test("example 1")(assertEquals(Solution.findMedianSortedArrays(Array(1, 3), Array(2)), 2.0))
  test("example 2")(assertEquals(Solution.findMedianSortedArrays(Array(1, 3), Array(3, 4)), 3.0))
