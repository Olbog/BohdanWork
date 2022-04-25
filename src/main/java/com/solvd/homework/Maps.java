package com.solvd.homework;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.LinkedList;
import java.util.List;

public class Maps <T> {
    private static final Logger LOGGER = LogManager.getLogger(Maps.class);

    static String map;
    static {
        map = "The world's map";
    }

    public static void loading() {
        LOGGER.info(map + " is loading...");
    }

    private Node<T> head;

    public void addFirst(T t){
        Node<T> firstNode = new Node<>(t);
        firstNode.next = head;
        head = firstNode;
    }
    public void addLast(T t){
        if(head == null){
            head = new Node<>(t);
            return;
        }
        Node<T> currenNode= head;
        while (currenNode.next != null){
            currenNode = currenNode.next;
        }
        currenNode.next = new Node<>(t);


    }
    public int get(T t){
        if(head == null){
            return -1;
        }
        if(head.value == t){
            return 0;
        }
        Node<T> currentNode = head;
        int result = 0;
        while (currentNode.next != null){
            ++result;
            if(currentNode.next.value == t){
                return result;
            }
            currentNode = currentNode.next;
        }
        return -1;
    }

    public void remove (T t){
        if (head == null){
            return;
        }
        if(head.value == t){
            head = head.next;
            return;
        }
        Node<T> currentNode = head;
        while (currentNode.next != null){
            if(currentNode.next.value == t){
                currentNode.next = currentNode.next.next;
                return;
            }
            currentNode = currentNode.next;
        }
    }

    @Override
    public String toString() {
        return "Maps{" +
                "head=" + head +
                '}';
    }

    private static class Node<T> {
        private final T value;
        private Node <T> next;

        public Node(T value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.addLast("Europe");
        linkedList.addLast("Asia");
        linkedList.addLast("South America");
        linkedList.addLast("North America");
        linkedList.addLast("Australia");
        LOGGER.info("LL: " + linkedList);

        String Europe = linkedList.get(Integer.parseInt("Europe"));
        String Asia = linkedList.get(Integer.parseInt("Asia"));
    }
}