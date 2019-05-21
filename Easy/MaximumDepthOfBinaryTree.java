package com.wyh.me.leetcode.easy;

import com.wyh.me.leetcode.util.TreeNode;

/**
 * Title: MaximumDepthOfBinaryTree.java<br>
 * Description:
 *
 * Given a binary tree, find its maximum depth.
 *
 * The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 *
 * Note: A leaf is a node with no children.
 *
 * Example:
 *
 * Given binary tree [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * return its depth = 3.
 *
 * <br>
 * Copyright: Copyright (c) 2019<br>
 *
 * @author wyh
 * @date 2019年03月12日 11:21:00
 */
public class MaximumDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int lDepth = maxDepth(root.left);
        int rDepth = maxDepth(root.right);
        if (lDepth > rDepth) {
            return lDepth + 1;
        }
        else {
            return rDepth + 1;
        }
    }

}
