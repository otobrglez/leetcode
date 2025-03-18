package leetcode.reverseinteger

object Solution:
  private val range = Range(Int.MinValue, Int.MaxValue)

  def reverse(x: Int): Int =
    var number = math.abs(x)
    var result = 0

    while number != 0 do
      val digit = number % 10
      number /= 10

      if result > range.max / 10 || result < range.min / 10 then return 0
      result = result * 10 + digit

    if x < 0 then result * -1 else result
