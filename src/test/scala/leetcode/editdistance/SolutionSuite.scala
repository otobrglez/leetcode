package leetcode.editdistance

class SolutionSuite extends munit.FunSuite:

  test("test horse -> ros")(assertEquals(Solution.minDistance("horse", "ros"), 3))
  test("test intention -> execution")(assertEquals(Solution.minDistance("intention", "execution"), 5))
