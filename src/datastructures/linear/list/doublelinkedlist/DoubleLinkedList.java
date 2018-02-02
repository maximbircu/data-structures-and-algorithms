package datastructures.linear.list.doublelinkedlist;

class DoubleLinkedList {
    private Node head;
    private Node tail;

    void add(int data) {
        Node nodeToInsert = new Node(data);
        if (head == null) {
            head = tail = nodeToInsert;
            return;
        }
        nodeToInsert.previous = tail;
        tail.next = nodeToInsert;
        tail = nodeToInsert;
    }

    static void printLinkedListFromHeadToTail(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(String.format("%d ", node.data));
        printLinkedListFromHeadToTail(node.next);
    }

    static void printLinkedListFromTailToHead(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(String.format("%d ", node.data));
        printLinkedListFromTailToHead(node.previous);
    }

    Node getHead() {
        return head;
    }

    Node getTail() {
        return tail;
    }
}
