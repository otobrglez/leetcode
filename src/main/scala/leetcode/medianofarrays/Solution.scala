package leetcode.medianofarrays

object Solution:
  def findMedianSortedArrays(nums1: Array[Int], nums2: Array[Int]): Double =
    if nums1.length > nums2.length then return findMedianSortedArrays(nums2, nums1)

    val (m, n)      = nums1.length -> nums2.length
    val totalLength = m + n
    val halfLength  = (totalLength + 1) / 2

    // Binary search on nums1
    var left  = 0
    var right = m

    while left <= right do
      val partitionX = (left + right) / 2
      val partitionY = halfLength - partitionX

      val maxX = if partitionX == 0 then Int.MinValue else nums1(partitionX - 1)
      val minX = if partitionX == m then Int.MaxValue else nums1(partitionX)
      val maxY = if partitionY == 0 then Int.MinValue else nums2(partitionY - 1)
      val minY = if partitionY == n then Int.MaxValue else nums2(partitionY)

      (maxX <= minY && maxY <= minX, totalLength % 2) match
        case (true, 1)  => return math.max(maxX, maxY).toDouble
        case (true, 0)  => return (math.max(maxX, maxY) + math.min(minX, minY)).toDouble / 2
        case (false, _) =>
          if maxX > minY then right = partitionX - 1
          else left = partitionX + 1
        case (true, _)  => ???

    throw new IllegalArgumentException("Input arrays are not sorted")
