/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun splitListToParts(head: ListNode?, k: Int): Array<ListNode?> {
        var node = head
        var size = 1
        val res = Array<ListNode?>(k) { null }

        if (head == null) return res

        if (k == 1) {
            res[0] = head
            return res
        }

        while (node?.next != null) {
            node = node.next
            size++
        }

        var currentNode: ListNode? = ListNode(0)
        currentNode?.next = head
        var resNode: ListNode? = null

        for (i in 0 until k) {
            resNode = currentNode

            val repeatNum = if (size % k > i) size / k + 1 else size/k
            repeat(repeatNum) {
                currentNode = currentNode?.next
            }
            res[i] = resNode?.next
            resNode?.next = null
        }


        return res
    }
}