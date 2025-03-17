package leetcode.twosum

import scala.util.boundary
import scala.util.boundary.break

object Solution:
  def twoSum(nums: Array[Int], target: Int): Array[Int] = boundary {
    val numberIndexMap = scala.collection.mutable.Map[Int, Int]()

    for (currentNumber, currentIndex) <- nums.zipWithIndex do
      val numberNeeded = target - currentNumber

      if numberIndexMap.contains(numberNeeded) then break(Array(numberIndexMap(numberNeeded), currentIndex))

      numberIndexMap(currentNumber) = currentIndex

    Array.empty
  }
