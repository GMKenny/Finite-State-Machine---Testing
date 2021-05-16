package com.fsmt;

import java.util.HashMap;


public class Node {

    private HashMap<String, Node> nodeConnection = new HashMap<String, Node>();
    private final String name;

    public Node(String name) {
        this.name = name;
    }

    public String getNodeName(){
        return name;
    }

    public void createConnection(String name, Node node){
        if (!nodeConnection.containsKey(name)){
            nodeConnection.put(name, node);
        }
    }

    public Node nextNode(String name){
        return nodeConnection.get(name);
    }

}
