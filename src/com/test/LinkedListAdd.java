package com.test;

/**
 * @author LiuYao
 * @Honey YuQin
 * @Duration 2.0
 * @Date 2022/11/7 21:15
 * @Description 两数相加
 * 1.这个题目链表两数相加，第一次思路:一个一个节点遍历两数相加，先不考虑进位，但是如果用.next就会覆盖前一个值，
 * 存入不进空节点，导致数据只有末尾一个值；
 * **题解：
 * 2.先不考虑进位，将节点的值取出int赋值；将两个int值相加（作用：如果用l1.val+l2.val在两个链表节点数不相同情况无法相加，这样方法可以补位）
 * 3.先设置一个空的链表放入相加之后的数据，但是也要另一个相似的链表来给第一个空的链表一个一个赋值，目的是要不断向后遍历，那在Java中必须要使用
 * a = a.next这样的话就会覆盖前一个结点，导致数据也会被覆盖;
 * 4.判断条件如果为node1.next，那么只要不是一个数字，那么此循环就成为死循环;相同，如果用node2.next,现阶段理解node2因为需要不断的后移，
 * 他就会覆盖前一个数据，node2.next永远为空，无法作为循环条件，因此只有l1或l2作为循环条件，那么循环体中也要对l1和l2进行后移，就算会覆盖
 * 之前的值，也没有关系，因为之前的值已经保存在n1,n2中，所以循环条件可以确定。
 * 5.进位要设置一个初始为0的int型值，如果sum>10,那么sum/10 = 1,那么在下一个数相加时，就得加上1，!!!还有一种情况最为特殊
 * 6.如果最后两数相加产生进位，那么在返回的链表中，最后一位必然是此进位，也就是1，那么就要提前设置最后一个节点，当然循环不可能再继续了，
 * 因为所有的数已经遍历完成，此次循环结束就应该退出，所以 要有如下语句在循环体中:
 * if(x>0){
 *  node2.next = new ListNode(x);
 * }
 * 这样的话下一个节点也会刚好是进位;
 * 至此，两数相加完成，分析结束;
 * 最后，我认为如果有两个指针将方便很多，只需要将指针不断后移，也不会存在覆盖前面的值，所以由此看出，选中一个数据结构来存放数据
 * 并进行操作的话会方便很多。
 **/
@SuppressWarnings({"all"})
public class LinkedListAdd {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(2));
        ListNode l2 = new ListNode(1, new ListNode(2));
        ListNode l3 = new ListNode();
        ListNode node1 = null;
        ListNode node2 = null;
        int x = 0;
        while(l2 != null||l1 != null){
            int sum = 0;
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;
            sum = n1 + n2 + x;
            if(node1 == null){
                node1 = node2 = new ListNode(sum%10);
            }else {
                node2.next = new ListNode(sum%10);
                node2 = node2.next;
            }
            x = sum / 10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
            if(x>0){
                node2.next = new ListNode(x);
            }
        }

        System.out.println(node1.val);
        System.out.println(node1.next.val);
    }
}
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
