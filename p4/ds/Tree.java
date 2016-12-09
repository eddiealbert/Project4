package ds;

import java.util.ArrayList;
import java.util.List;

public class Tree<String> {
    private Node<String> root;

    public Tree(String rootData) {
        root = new Node<String>();
        root.data = rootData;
        root.children = new ArrayList<Node<String>>();
    }

    public static class Node<T> {
        private T data;
        private Node<T> parent;
        private List<Node<T>> children;
    }
}
