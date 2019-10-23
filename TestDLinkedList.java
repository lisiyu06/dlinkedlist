/**
 * Author: lisiyu
 * Created: 2019/10/14
 */
public class TestDLinkedList {
    public static void main(String[] args) {
        testAddFirst();
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
}