package leetcode.pathsum

class SolutionSuite extends munit.FunSuite:
  test("example 1") {
    val has = Solution.hasPathSum(
      TreeNode(
        5,
        TreeNode(4, TreeNode(11, TreeNode(7), TreeNode(2)), TreeNode(1)),
        TreeNode(8, TreeNode(13), TreeNode(4, TreeNode(5), TreeNode(1)))
      ),
      22
    )
    assertEquals(has, true)
  }
