package com.fsmt;


public class Main {

    public static void main(String[] args) {
        FinalStateMachine fSM = new FinalStateMachine(5);

        fSM.setConnectionPerNode("A", 1, 2);
        fSM.setConnectionPerNode("B", 1, 3);
        fSM.setConnectionPerNode("C", 1, 1);
        fSM.setConnectionPerNode("A", 2, 4);
        fSM.setConnectionPerNode("C", 2, 1);
        fSM.setConnectionPerNode("A", 3, 4);
        fSM.setConnectionPerNode("B", 3, 1);
        fSM.setConnectionPerNode("A", 4, 4);
        fSM.setConnectionPerNode("C", 4, 5);
        fSM.setConnectionPerNode("A", 5, 1);
        fSM.setConnectionPerNode("B", 5, 2);
        fSM.setConnectionPerNode("C", 5, 3);
        fSM.setConnectionPerNode("D", 5, 5);

        fSM.setInputText("CACBACABACD");
        System.out.println(fSM.processInputToString());

        fSM.setInputText("AAACDAD");
        System.out.println(fSM.processInputToString());

        fSM.deleteNodes();
        fSM.createNodes(3);
        fSM.setConnectionPerNode("A", 1, 2);
        fSM.setConnectionPerNode("B", 1, 3);
        fSM.setConnectionPerNode("A", 2, 1);
        fSM.setConnectionPerNode("B", 2, 2);
        fSM.setConnectionPerNode("C", 2, 3);

        fSM.setInputText("AAABBC");
        System.out.println(fSM.processInputToString());

    }
}
