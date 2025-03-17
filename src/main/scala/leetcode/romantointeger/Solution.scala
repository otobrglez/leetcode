package leetcode.romantointeger

object Solution:
  private val romanMap = Map('I' -> 1, 'V' -> 5, 'X' -> 10, 'L' -> 50, 'C' -> 100, 'D' -> 500, 'M' -> 1000)

  val romanToInt: String => Int = s =>
    val values = s.map(romanMap)
    values.zipWithIndex.foldLeft(0) { case (acc, (value, index)) =>
      if index < values.length - 1 && value < values(index + 1) then acc - value
      else acc + value
    }
