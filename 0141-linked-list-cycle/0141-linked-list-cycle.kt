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
    fun hasCycle(head: ListNode?): Boolean {
        var cur = head
        val set = hashSetOf<ListNode?>()
        while (cur != null) {
            if (set.contains(cur)) return true
            set.add(cur)
            cur = cur.next
        }

        return false
    }
}