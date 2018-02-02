package datastructures.linear.doublelinkedlist;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.add(1);
        doubleLinkedList.add(2);
        doubleLinkedList.add(3);
        doubleLinkedList.add(4);

        DoubleLinkedList.printLinkedListFromHeadToTail(doubleLinkedList.getHead());
        System.out.println();
        DoubleLinkedList.printLinkedListFromTailToHead(doubleLinkedList.getTail());
    }
}
