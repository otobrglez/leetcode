package leetcode.pathsum

// This was converted to case class. Original is without it.

final case class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null):
  var value: Int      = _value
  var left: TreeNode  = _left
  var right: TreeNode = _right

object Solution:
  val hasPathSum: (TreeNode, Int) => Boolean =
    case null -> _                                                    => false
    case root -> targetSum if root.left == null && root.right == null => root.value == targetSum
    case TreeNode(_value, _left, _right) -> targetSum                 =>
      val remainingSum = targetSum - _value
      hasPathSum(_left, remainingSum) || hasPathSum(_right, remainingSum)
