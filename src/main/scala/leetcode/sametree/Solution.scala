package leetcode.sametree

final class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null):
  var value: Int      = _value
  var left: TreeNode  = _left
  var right: TreeNode = _right

object Solution:
  val isSameTree: (TreeNode, TreeNode) => Boolean =
    case (null, null)                     => true
    case (p, q) if p != null && q != null =>
      p.value == q.value && isSameTree(p.left, q.left) && isSameTree(p.right, q.right)
    case _                                => false
