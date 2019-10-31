/**
 * Author: lisiyu
 * Created: 2019/10/14
 */
public class TestDLinkedList {
    public static void main(String[] args) {
        testAddFirst();
        testAddLast();
        testAddIndex();
    }

    public static void testAddFirst() {
        System.out.println("测试双向链表中的头插");
        DLinkedList dLinkedList = new DLinkedList();
        dLinkedList.addFirst(1);
        dLinkedList.addFirst(2);
        dLinkedList.addFirst(3);
        dLinkedList.addFirst(4);
        dLinkedList.display();
    }

    public static void testAddLast() {
        System.out.println("测试双向链表中的尾插");
        DLinkedList dLinkedList = new DLinkedList();
        dLinkedList.addLast(1);
        dLinkedList.addLast(2);
        dLinkedList.addLast(3);
        dLinkedList.addLast(4);
        dLinkedList.display();
    }

    public static void testAddIndex() {
        System.out.println("测试双向链表中的指定位置插入");
        DLinkedList dLinkedList = new DLinkedList();
        dLinkedList.addLast(1);
        dLinkedList.addLast(2);
        dLinkedList.addLast(3);
        dLinkedList.addLast(4);

        dLinkedList.addIndex(2, 100);
        dLinkedList.display();
    }
}