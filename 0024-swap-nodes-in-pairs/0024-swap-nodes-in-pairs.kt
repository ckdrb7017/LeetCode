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
     fun swapPairs(head: ListNode?): ListNode? {
        if (head?.next == null) return head
        var prevNode = ListNode(0)
        var currentNode = head
        var nextNode = head.next
        val answer = nextNode

        while(currentNode?.next != null){
            prevNode.next = nextNode
            currentNode.next = nextNode?.next
            nextNode?.next = currentNode
            prevNode = currentNode
            currentNode = currentNode.next
            nextNode = currentNode?.next
        }

        return answer
    }
}