package com.fsmt;

import java.util.HashMap;


public class FinalStateMachine {

    private String inputString;
    private final HashMap<String, Node> allNodes = new HashMap<String, Node>();

    public FinalStateMachine(int nodeAmount) {
        this.createNodes(nodeAmount);
    }


    public void createNodes(int nodeAmount){
        for (int i = 1; i < nodeAmount + 1; i++){
            Node node = new Node(("N" + i));
            allNodes.put(node.getNodeName(), node);
        }
    }






}
