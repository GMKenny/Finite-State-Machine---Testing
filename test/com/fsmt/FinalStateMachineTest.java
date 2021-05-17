package com.fsmt;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class FinalStateMachineTest {

    @Test
    public void createNodes() {
        FinalStateMachine fSM = new FinalStateMachine(5);
        assertEquals("size of nodes: 5", fSM.getNodeSize());
    }

    @Test
    public void setInputText() {
        FinalStateMachine fSM = new FinalStateMachine(3);
        fSM.setInputText("ABA");
        assertEquals("ABA", fSM.getInputText());
    }

    @Test
    public void setConnectionPerNode() {
        FinalStateMachine fSM = new FinalStateMachine(3);
        // Test input.
        fSM.setInputText("A");
        // Duplicate test.
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
        // Expected outcome.
        String outcome = "\nError: String CAABAAB has no connection B with node N2";
        // No connection test.
        fSM.setConnectionPerNode("A", 1, 2);
        fSM.setConnectionPerNode("B", 1, 3);
        fSM.setConnectionPerNode("C", 1, 1);
        fSM.setConnectionPerNode("A", 2, 1);
        fSM.setConnectionPerNode("A", 3, 1);
        assertEquals(outcome, fSM.processInputToString());

    }
}