package datastructures.tree.binarytrees.binarysearchtree;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Node root = new Node(3);
        addNode(root, new Node(1));
        addNode(root, new Node(2));
        addNode(root, new Node(4));
        addNode(root, new Node(6));
        addNode(root, new Node(5));

        System.out.println(String.format("Min = %d", min(root)));
        System.out.println(String.format("Max = %d", max(root)));
        System.out.println(String.format("Depth = %d", depth(root)));

        System.out.print("Breadth first: ");
        breadthFirst(root);

        System.out.println();
        System.out.print("Preorder: ");
        preOrder(root);

        System.out.println();
        System.out.print("Inorder: ");
        inOrder(root);

        System.out.println();
        System.out.print("Postorder: ");
        postOrder(root);
    }

    private static int depth(Node root) {
        return root != null ? Math.max(depth(root.left), depth(root.right)) + 1 : -1;
    }

    private static Integer min(Node root) {
        if (root == null) {
            return null;
        }
        if (root.left == null) {
            return root.data;
        } else {
            return min(root.left);
        }
    }

    private static Integer max(Node root) {
        if (root == null) {
            return null;
        }
        if (root.right == null) {
            return root.data;
        } else {
            return max(root.right);
        }
    }

    private static void addNode(Node root, Node nodeToInsert) {
        if (root.data < nodeToInsert.data) {
            if (root.right == null) {
                root.right = nodeToInsert;
            } else {
                addNode(root.right, nodeToInsert);
            }
        } else {
            if (root.left == null) {
                root.left = nodeToInsert;
            } else {
                addNode(root.left, nodeToInsert);
            }
        }
    }

    private static void breadthFirst(Node root) {
        Queue<Node> nodesToVisit = new ArrayDeque<>();
        nodesToVisit.add(root);
        while (nodesToVisit.size() > 0) {
            Node node = nodesToVisit.poll();
            if (node == null) {
                continue;
            }
            System.out.print(String.format("%d ", node.data));
            if (node.left != null) {
                nodesToVisit.add(node.left);
            }

            if (node.right != null) {
                nodesToVisit.add(node.right);
            }
        }
    }

    private static void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(String.format("%d ", root.data));
        preOrder(root.left);
        preOrder(root.right);
    }

    private static void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(String.format("%d ", root.data));
        inOrder(root.right);
    }

    private static void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(String.format("%d ", root.data));
    }
}
