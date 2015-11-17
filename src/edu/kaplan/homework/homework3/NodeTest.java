package edu.kaplan.homework.homework3;

public class NodeTest {
    public static void main(String[] args) {
         Node head = new Node(3);//3
        head.add(new Node(4));//4
        head.add(new Node(5));//5
        head.add(new Node(6));


        head.print(head);
        head.removeLast();
      //  head.setElement(54);//-------------
        head.print(head);
        head.removeLast();
        head.print(head);
        head.removeLast();
        head.print(head);


    }

}
