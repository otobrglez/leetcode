package leetcode.romantointeger

class SolutionSuite extends munit.FunSuite:
  test("example 1")(assertEquals(Solution.romanToInt("III"), 3))
  test("example 2")(assertEquals(Solution.romanToInt("LVIII"), 58))
  test("example 3")(assertEquals(Solution.romanToInt("MCMXCIV"), 1994))
