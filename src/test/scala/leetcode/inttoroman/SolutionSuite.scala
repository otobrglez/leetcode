package leetcode.inttoroman

class SolutionSuite extends munit.FunSuite:
  test("example 3")(assertEquals(Solution.intToRoman(3), "III"))
  test("example 58")(assertEquals(Solution.intToRoman(58), "LVIII"))
  test("example 1994")(assertEquals(Solution.intToRoman(1994), "MCMXCIV"))
