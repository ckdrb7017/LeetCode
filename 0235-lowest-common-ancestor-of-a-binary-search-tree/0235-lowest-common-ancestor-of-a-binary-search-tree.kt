/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int = 0) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        if(root == null) return root
        if(root.`val` > p!!.`val` && root.`val` > q!!.`val`){
            return lowestCommonAncestor(root.left, p, q)
        } else if(root.`val` < p.`val` && root.`val` < q!!.`val`){
            return lowestCommonAncestor(root.right, p, q)
        }
        return root
    }
}