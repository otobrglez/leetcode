package leetcode.addtwonumbers

class ListNode(_x: Int = 0, _next: ListNode = null):
  var next: ListNode = _next
  var x: Int         = _x

object Solution:
  def listNodeFromList(xs: Int*): ListNode = xs.reverse.foldLeft(null: ListNode)((acc, x) => ListNode(x, acc))
  def listNodeFromNumber(n: Int): ListNode = listNodeFromList(n.toString.toList.map(_.asDigit)*)

  private def listNodeToList(node: ListNode): List[Int] =
    var (current, result) = node -> List.empty[Int]
    while current != null do
      result = result :+ current.x
      current = current.next
    result.reverse

  def listNodeToString(node: ListNode): String = listNodeToList(node).mkString(", ")

  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode =
    val emptyNode       = new ListNode(0)
    var (p, q, current) = (l1, l2, emptyNode)
    var carry           = 0

    while p != null || q != null do
      val x   = if p != null then p.x else 0
      val y   = if q != null then q.x else 0
      val sum = x + y + carry

      carry = sum / 10
      current.next = new ListNode(sum % 10)
      current = current.next

      if p != null then p = p.next
      if q != null then q = q.next

    if carry > 0 then current.next = new ListNode(carry)

    emptyNode.next
