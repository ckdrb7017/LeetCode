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
     fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var temp: ListNode? = ListNode(-1)
        val answer: ListNode? = temp
        var mList1 = list1
        var mList2 = list2

        while ((mList1 == null && mList2 == null).not()) {
            if(mList1 == null){
                temp?.next = mList2
                mList2 = mList2?.next
            } else if(mList2 == null){
                temp?.next = mList1
                mList1 = mList1.next
            } else {
                val value1 = mList1.`val`
                val value2 = mList2.`val`
                if (value1 <= value2) {
                    temp?.next = mList1
                    mList1 = mList1.next
                } else {
                    temp?.next = mList2
                    mList2 = mList2.next
                }
            }
            
            temp = temp?.next
        }

        return answer?.next
    }
}