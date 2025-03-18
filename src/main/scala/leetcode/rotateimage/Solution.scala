package leetcode.rotateimage

object Solution:
  def rotate(matrix: Array[Array[Int]]): Unit =
    val n = matrix.length

    for i <- 0 until n do
      for j <- i + 1 until n do
        val temp = matrix(i)(j)
        matrix(i)(j) = matrix(j)(i)
        matrix(j)(i) = temp

    for i <- 0 until n do
      for j <- 0 until n / 2 do
        val temp = matrix(i)(j)
        matrix(i)(j) = matrix(i)(n - 1 - j)
        matrix(i)(n - 1 - j) = temp
