package main.java;

public class Node {

    short data;
    Node next;

    Node(short data){
        this.data = data;
    }

    static short countNodes(Node headNode){
        short numNodes = 0;
        System.out.println("The data inside each node is:");
        while(headNode != null){
            numNodes ++;
            System.out.println(headNode.data);
            headNode = headNode.next;
        }

        System.out.println("-----------------------------");

        return numNodes;
    }
}
