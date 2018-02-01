package datastructures.linear.list.linkedlist;

import com.sun.istack.internal.Nullable;

import java.util.function.Consumer;

class LinkedList {
    private Node head;
    private Node tail;

    void add(int data) {
        if (head == null) {
            tail = head = new Node(data);
        } else {
            tail.next = new Node(data);
            tail = tail.next;
        }
    }

    void applyOnEachElement(Consumer<Integer> consumer) {
        applyOnEach(head, consumer);
    }

    boolean remove(int data) {
        if(data == head.data){
            head = head.next;
            return true;
        }
        Node prevNode = head;
        Node currentNode = head.next;
        while (currentNode != null) {
            if(currentNode.data == data) {
                prevNode.next = currentNode.next;
                return true;
            }
            prevNode = currentNode;
            currentNode = currentNode.next;
        }
        return false;
    }

    boolean insertAfter(int predecessorData, int value) {
        Node predecessor = find(predecessorData);
        if (predecessor == null) {
            return false;
        }
        Node nodeToInsert = new Node(value);
        nodeToInsert.next = predecessor.next;
        predecessor.next = nodeToInsert;
        return true;
    }

    @Nullable
    Node find(int element) {
        Node node = head;
        while (node != null) {
            if (node.data == element) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    private void applyOnEach(Node node, Consumer<Integer> consumer) {
        if (node == null) {
            return;
        }
        consumer.accept(node.data);
        applyOnEach(node.next, consumer);
    }

    Node getHead() {
        return head;
    }

    Node getTail() {
        return tail;
    }
}
