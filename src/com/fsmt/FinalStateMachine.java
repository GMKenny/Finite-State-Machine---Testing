package com.fsmt;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;


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

    public String getNodeSize(){
        return "size of nodes: " + allNodes.size();
    }

    public void setInputText(String inputString){
        this.inputString = inputString;
    }

    public String getInputText(){
        return inputString;
    }

    public void deleteNodes(){
        allNodes.clear();
    }

    public void setConnectionPerNode(String connection, int startNode, int endNode){
        allNodes.get("N"+startNode).createConnection(connection, allNodes.get("N"+endNode));
    }


    public String processInputToString(){
        String nextNode = "N1";
        String outputString = getInputText() + " Gives the following route: ";
        for (int i = 0; i < inputString.length(); i++) {

            String character = String.valueOf(inputString.charAt(i));
            outputString += "\n" + character + ", from " + nextNode + " to ";

            try {
                nextNode = allNodes.get(nextNode).nextNode(character).getNodeName();
            }
            catch(Exception e){
                return "\nError: String " + getInputText() + " has no connection " + character + " with node " + nextNode;
            }
            outputString += nextNode;
        }
        return "\n" + outputString + "\nThe end node is " + nextNode;
    }



}
