package homework;

import java.util.ArrayList;
import java.util.List;

public class Node<T>{
    private T data = null;
    private ArrayList<Node> children = new ArrayList<Node>();
    private Node parent = null;
    private boolean visited;

    public Node(T data) {
        this.data = data;
        this.visited = true;
    }

    public void addChild(Node child) {
        child.setParent(this);
        this.children.add(child);
    }

    public void addChild(T data) {
        Node<T> newChild = new Node<T>(data);
        newChild.setParent(this);
        children.add(newChild);
    }

    public void addChildren(List<Node> children) {
        for(Node t : children) {
            t.setParent(this);
        }
        this.children.addAll(children);
    }

    public List<Node> getChildren() {
        return children;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    private void setParent(Node parent) {
        this.parent = parent;
    }

    public Node getParent() {
        return parent;
    }

    public boolean isVisited() {
        return visited;
    }
}
