/**
 * Author: lisiyu
 * Created: 2019/10/14
 */

// 双向链表

class DLinkedNode {
    int val = 0;
    DLinkedNode prev = null;
    DLinkedNode next = null;

    DLinkedNode(int val) {
        this.val = val;
    }
}

public class DLinkedList {
    DLinkedNode head = null;

    public DLinkedList() {
        // 创建傀儡节点
        head = new DLinkedNode(-1);
        // 带环
        head.next = head;
        head.prev = head;
    }

    //头插
    public void addFirst(int data) {
        // 1. 创建一个新的结点
        DLinkedNode newNode = new DLinkedNode(data);

        DLinkedNode next = head.next;

        head.next = newNode;
        newNode.next = next;

        newNode.prev = head;
        next.prev = newNode;
    }

    public void display() {
        System.out.print("正向：[");
        for (DLinkedNode cur = head.next;
                cur != head;
                cur = cur.next) {
            System.out.print(cur.val);
            if (cur.next != head) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.print("反向: [");
        for (DLinkedNode cur = head.prev;
             cur != head; cur = cur.prev) {
            System.out.print(cur.val);
            if (cur.prev != head) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

}
