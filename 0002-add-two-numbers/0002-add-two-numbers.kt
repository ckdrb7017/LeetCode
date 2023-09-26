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
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var list1 = l1
        var list2 = l2
        var currentNode: ListNode? = ListNode(-1)
        var startNode: ListNode? = currentNode
        var isOverTen = false
        
        while ((list1 == null && list2 == null).not()) {
            val num1 = list1?.`val` ?: 0
            val num2 = list2?.`val` ?: 0
            val overTenNum = if (isOverTen) 1 else 0
            val sum = num1 + num2 + overTenNum

            currentNode?.next = ListNode(if (sum >= 10) sum - 10 else sum)

            list1 = list1?.next
            list2 = list2?.next
            currentNode = currentNode?.next
            isOverTen = (num1 + num2 + overTenNum >= 10)

        }

        if(currentNode?.next == null && isOverTen){
            currentNode?.next = ListNode(1)
        }
        
        startNode = startNode?.next
        return startNode
    }
}