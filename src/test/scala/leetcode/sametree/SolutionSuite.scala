package leetcode.sametree

class SolutionSuite extends munit.FunSuite:

  test("example 1") {
    val in = TreeNode(1, TreeNode(2), TreeNode(3))

    assertEquals(
      Solution.isSameTree(in, in),
      true
    )
  }

  test("example 2") {
    val a = TreeNode(1, TreeNode(2), null)
    val b = TreeNode(1, null, TreeNode(2))

    assertEquals(
      Solution.isSameTree(a, b),
      false
    )
  }

  test("example 2") {
    val a = TreeNode(1, TreeNode(2), TreeNode(1))
    val b = TreeNode(1, TreeNode(1), TreeNode(2))

    assertEquals(
      Solution.isSameTree(a, b),
      false
    )
  }
