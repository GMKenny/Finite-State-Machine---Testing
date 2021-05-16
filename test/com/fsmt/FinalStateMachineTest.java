package com.fsmt;

import org.junit.Test;

import static org.junit.Assert.*;

public class FinalStateMachineTest {

    @Test
    public void createNodes() {
        FinalStateMachine fSM = new FinalStateMachine(5);
        System.out.println(fSM.getNodeSize());
    }

    @Test
    public void setInputText() {
        FinalStateMachine fSM = new FinalStateMachine(3);
        fSM.setInputText("ABA");
        System.out.println(fSM.getInputText());
    }

    @Test
    public void setConnectionPerNode() {
        FinalStateMachine fSM = new FinalStateMachine(3);
        // Test input.
        fSM.setInputText("A");
        // duplicate test.
        fSM.setConnectionPerNode("A", 1, 2);
        fSM.setConnectionPerNode("A", 2, 3);
        fSM.setConnectionPerNode("B", 2, 3);

        System.out.println(fSM.processInputToString());
    }

    @Test
    public void processInputToString() {
        FinalStateMachine fSM = new FinalStateMachine(3);
        // Test input.
        fSM.setInputText("CAABAAB");
        // No connection test.
        fSM.setConnectionPerNode("A", 1, 2);
        fSM.setConnectionPerNode("B", 1, 3);
        fSM.setConnectionPerNode("C", 1, 1);
        fSM.setConnectionPerNode("A", 2, 1);
        fSM.setConnectionPerNode("A", 3, 1);

        System.out.println(fSM.processInputToString());



    }
}