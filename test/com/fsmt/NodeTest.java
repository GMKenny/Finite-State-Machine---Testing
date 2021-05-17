package com.fsmt;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class NodeTest {

    @Test
    public void getNodeName() {
        Node nodeOne = new Node("N1");
        assertEquals("N1", nodeOne.getNodeName());

    }

    @Test
    public void createConnection() {
        Node nodeOne = new Node("N1");
        Node nodeTwo = new Node("N2");
        Node nodeThree = new Node("N3");
        // duplicate test
        nodeOne.createConnection("A",nodeTwo);
        nodeOne.createConnection("A",nodeThree);
        assertEquals(nodeTwo, nodeOne.nextNode("A"));
    }

}