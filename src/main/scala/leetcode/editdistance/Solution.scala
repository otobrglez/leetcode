package leetcode.editdistance

object Solution:
  def minDistance(word1: String, word2: String): Int =
    val (m, n) = word1.length -> word2.length

    val dt = for
      r  <- (0 to m).toArray
      row = (0 to n).map:
              case c if r == 0 => c
              case c if c == 0 => r
              case _           => 0
    yield row.toArray

    for
      i <- 1 to m
      j <- 1 to n
    do
      if word1(i - 1) == word2(j - 1) then dt(i)(j) = dt(i - 1)(j - 1)
      else dt(i)(j) = Math.min(Math.min(dt(i - 1)(j), dt(i)(j - 1)), dt(i - 1)(j - 1)) + 1

    dt(m)(n)
