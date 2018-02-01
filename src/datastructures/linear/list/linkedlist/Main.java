package datastructures.linear.list.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);


        linkedList.applyOnEachElement(System.out::print);
        System.out.print(String.format("\nFind node with data: %d", linkedList.find(4).data));

        if(linkedList.insertAfter(3,10)){
            System.out.println();
            linkedList.applyOnEachElement(System.out::print);
        } else {
            System.out.println("Can't insert value");
        }

        if(linkedList.remove(10)){
            System.out.println();
            linkedList.applyOnEachElement(System.out::print);
        } else {
            System.out.println("Can't remove value");
        }

    }
}
