package leetcode.pathsum

class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null):
  var value: Int      = _value
  var left: TreeNode  = _left
  var right: TreeNode = _right

object Solution:
  val hasPathSum: (TreeNode, Int) => Boolean =
    case null -> _                                                    => false
    case root -> targetSum if root.left == null && root.right == null => root.value == targetSum
    case root -> targetSum                                            =>
      val remainingSum = targetSum - root.value
      hasPathSum(root.left, remainingSum) || hasPathSum(root.right, remainingSum)
