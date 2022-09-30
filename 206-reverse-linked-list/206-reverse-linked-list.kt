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
    fun reverseList(head: ListNode?): ListNode? {
        var p: ListNode? = null
        var q: ListNode? = null
        var r: ListNode? = head
        
        while (r != null) {
            p = q
            q = r
            r = r.next
            q.next = p
        }
        return q
    }
}