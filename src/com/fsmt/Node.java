package com.fsmt;

import java.util.HashMap;


public class Node {

    private HashMap<String, Node> nodeConnection = new HashMap<String, Node>();
    private final String name;

    public Node(String name) {
        this.name = name;
    }



}
