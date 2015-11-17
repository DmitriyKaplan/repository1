package edu.kaplan.homework.homework3;

public class Node {
    private int element;
    private Node next;

    public Node(int element){
        this.element = element;
    }

    public int getElement() {
        return element;
    }

    public void setElement(int elem) {
        element = elem;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    public void add(Node node) {
        Node last = this;//присваиваем этому ноду значение объекта
        while (last.getNext() != null) {
            last = last.getNext();
        }
        last.setNext(node);
    }
    public void removeLast() {
        Node last = this;
        while (last.getNext().getNext() != null) {
            last = last.getNext();
        }
        last.setNext(null);
    }
    public void print(Node head) {
        String arrow = "2";
       /* if (head.getNext().equals(null) ) {
            arrow = "--- ";
        } else arrow = " ";*/
        System.out.print(head.getElement() + arrow);
        if (head.getNext() != null) {
             arrow = " -->";
            print(head.getNext());

        }
        System.out.println();
    }
}
