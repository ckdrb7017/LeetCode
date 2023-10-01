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
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        var currentNode = ListNode(-1)
        var movingNode = head
        var prevNode: ListNode? = currentNode
        var length = 0

        while (movingNode != null){
            movingNode = movingNode.next
            length++
        }

        movingNode = head
        currentNode.next = movingNode
        var count = 0
        while (true){
            if(count == length-n){
                break
            }
            prevNode = movingNode
            movingNode = movingNode?.next
            count++
        }

        if(prevNode == null) return null

        prevNode?.next = movingNode?.next

        return currentNode.next
    }
}