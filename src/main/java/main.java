package main.java;

public class main {
    public static void main(String[] args) {

        Node node1 = new Node((short) 5);
        Node node2 = new Node((short) 1);
        Node node3 = new Node((short) 3);
        Node node4 = new Node((short) 10);

        Node head = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        System.out.println("The number of nodes is: " + Node.countNodes(head));
    }

}
