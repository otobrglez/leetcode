package leetcode.twosum

class SolutionSuite extends munit.FunSuite:
  test("example 1") {
    val nums   = Array(2, 7, 11, 15)
    val target = 9
    assertEquals(Solution.twoSum(nums, target).toSeq, Array(0, 1).toSeq)
  }

  test("example 2") {
    val nums   = Array(3, 2, 4)
    val target = 6
    assertEquals(Solution.twoSum(nums, target).toSeq, Array(1, 2).toSeq)
  }

  test("example 3") {
    val nums   = Array(3, 3)
    val target = 6
    assertEquals(Solution.twoSum(nums, target).toSeq, Array(0, 1).toSeq)
  }
