package com.company.LeetCode刷题笔记.核心框架篇;

import javax.swing.tree.TreeNode;
import java.util.Arrays;

/**
 * @author ShiWei
 * @date 2021/3/2 - 10:13
 *
 */
public class 数据结构的遍历框架 {

    public static void main(String[] args) {
    }

    //1. 数组遍历框架: 典型的线性迭代结构
    public void arrayTraverse(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //迭代访问arr[i]
            System.out.println(arr[i]);
        }
    }

    //2. 链表遍历框架: 兼具迭代和递归的结构
    //迭代
    public void linkedListIterateTraverse(ListNode head) {
        for (ListNode node = head; node != null; node = node.next) {
            //迭代遍历node
            System.out.println(node.val);
        }
    }
    //递归
    /*
    * 1. 链表也有前序和后序遍历.
    * 2. 在前序遍历的时候打印head.val就是正序打印链表.
    * 3. 在后序遍历的位置打印head.val就是倒序打印链表.
    * */
    public void linkedListRecurveTraverse(ListNode head) {
        //前序遍历head.val
        linkedListRecurveTraverse(head.next);
        //后序遍历head.val
    }

    //3. 二叉树遍历框架: 典型的非线性递归结构
    public void binaryTreeTraverse(BinaryTreeNode root) {
        //前序遍历root.val
        binaryTreeTraverse(root.left);
        //中序遍历root.val
        binaryTreeTraverse(root.right);
        //后序遍历root.val
    }

    //4. N叉树遍历框架
    public void NTreeTraverse(NTreeNode root) {
        //前序遍历root.val
        for (NTreeNode node : root.children) {
            NTreeTraverse(node);
        }
        //后序遍历root.val
    }
}

//链表节点
class ListNode {
    int val; //节点存储的值
    ListNode next; //指向下一个节点的指针

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}

//二叉树节点
class BinaryTreeNode {
    int val; //存储节点的值
    BinaryTreeNode left; //指向左侧子节点的指针
    BinaryTreeNode right; //指向右侧子节点的指针

    public BinaryTreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }

    @Override
    public String toString() {
        return "BinaryTreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}

//N叉树节点
class NTreeNode {
    int val; //存储节点的值
    NTreeNode[] children; //存储该节点的所有子节点

    public NTreeNode(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return "NTreeNode{" +
                "val=" + val +
                ", children=" + Arrays.toString(children) +
                '}';
    }
}
