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

    // 尾插
    public void addLast(int data) {
        DLinkedNode newNode = new DLinkedNode(data);

        // 这个结点就是新的结点的前一个结点
        // head 就是新的结点的后一个结点
        DLinkedNode prev= head.prev;

        newNode.next = head;
        head.prev = newNode;

        prev.next = newNode;
        newNode.prev = prev;
    }

    // 任意位置插入
    public void addIndex(int index, int data) {
        int size = size();
        if (index < 0 || index > size) {
            return;
        }
        if (index == 0) {
            // 头插
            addFirst(data);
            return;
        }
        if (index == size) {
            // 尾插
            addLast(data);
            return;
        }
        DLinkedNode next = getPos(index);
        DLinkedNode prev = next.prev;

        DLinkedNode newNode = new DLinkedNode(data);

        prev.next = newNode;
        newNode.prev = prev;

        next.prev = newNode;
        newNode.next = next;
    }

    private DLinkedNode getPos(int index) {
        // 找到下标为 index 对应的结点
        DLinkedNode cur = head.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur;
    }

    private int size() {
        int size = 0;
        for (DLinkedNode cur = head.next;
                cur != head;
                cur = cur.next) {
            size++;
        }
        return size;
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

        System.out.print("反向：[");
        for (DLinkedNode cur = head.prev;
             cur != head; cur = cur.prev) {
            System.out.print(cur.val);
            if (cur.prev != head) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

}
