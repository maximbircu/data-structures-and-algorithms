package datastructures.linear.arraylist;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Integer> test = new MyArrayList<>();
        test.add(1);
        test.add(2);
        test.add(3);
        test.add(4);

        for (int i = 0; i < test.size(); i++) {
            System.out.println(test.get(i));
        }

        test.remove(3);

        for (int i = 0; i < test.size(); i++) {
            System.out.println(test.get(i));
        }
    }
}
