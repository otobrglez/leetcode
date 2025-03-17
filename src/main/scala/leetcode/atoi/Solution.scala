package leetcode.atoi

object Solution:
  def myAtoi(s: String): Int =
    val trimmed = s.trim
    if trimmed.isEmpty then return 0

    var num  = 0L
    var sign = 1
    var i    = 0

    if trimmed.head == '-' || trimmed.head == '+' then
      sign = if trimmed.head == '-' then -1 else 1
      i += 1

    while i < trimmed.length && trimmed(i).isDigit do
      num = num * 10 + (trimmed(i) - '0')
      if sign * num <= Int.MinValue then return Int.MinValue
      if sign * num >= Int.MaxValue then return Int.MaxValue
      i += 1

    (sign * num).toInt
