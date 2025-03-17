package leetcode.addtwonumbers

class SolutionSuite extends munit.FunSuite:

  test("example 1") {
    val (a, b) = (Solution.listNodeFromList(2, 4, 3), Solution.listNodeFromList(5, 6, 4))

    val result = Solution.addTwoNumbers(a, b)
    val expect = Solution.listNodeFromList(7, 0, 8)

    assertEquals(
      Solution.listNodeToString(result),
      Solution.listNodeToString(expect)
    )
  }

  test("example 2") {
    val (a, b) = (Solution.listNodeFromList(0), Solution.listNodeFromList(0))

    val result = Solution.addTwoNumbers(a, b)
    val expect = Solution.listNodeFromList(0)

    assertEquals(
      Solution.listNodeToString(result),
      Solution.listNodeToString(expect)
    )
  }

  test("example 3") {
    val (a, b) = (Solution.listNodeFromList(9, 9, 9, 9, 9, 9, 9), Solution.listNodeFromList(9, 9, 9, 9))

    val result = Solution.addTwoNumbers(a, b)
    val expect = Solution.listNodeFromList(8, 9, 9, 9, 0, 0, 0, 1)

    assertEquals(
      Solution.listNodeToString(result),
      Solution.listNodeToString(expect)
    )
  }

  test("example 4") {
    val (a, b) = (Solution.listNodeFromList(9), Solution.listNodeFromList(1, 9, 9, 9, 9, 9, 9, 9, 9, 9))

    val result = Solution.addTwoNumbers(a, b)
    val expect = Solution.listNodeFromList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1)

    assertEquals(
      Solution.listNodeToString(result),
      Solution.listNodeToString(expect)
    )
  }
