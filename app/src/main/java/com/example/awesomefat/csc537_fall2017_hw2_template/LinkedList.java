package com.example.awesomefat.csc537_fall2017_hw2_template;

/**
 * Created by awesomefat on 10/31/17.
 */

public class LinkedList
{
    private Node head;

    public LinkedList()
    {
        this.head = null;
    }

    public int removeEnd()
    {
        if(this.head.getNextNode() == null)
        {
            int valToReturn = this.head.getPayload();
            this.head = null;
            return valToReturn;
        }
        else
        {
            Node currNode = this.head;
            while(currNode.getNextNode().getNextNode() != null)
            {
                currNode = currNode.getNextNode();
            }
            int valToReturn = currNode.getNextNode().getPayload();
            currNode.setNextNode(null);
            return valToReturn;
        }
    }
    public void addEnd(int payload)
    {
        Node n = new Node(payload);
        if(this.head == null)
        {
            this.head = n;
        }
        else
        {
            Node currPos = this.head;
            while(currPos.getNextNode() != null)
            {
                currPos = currPos.getNextNode();
            }
            currPos.setNextNode(n);
        }
    }

    public int removeFront()
    {
        Node temp = this.head;
        this.head = this.head.getNextNode();
        temp.setNextNode(null);
        return temp.getPayload();
    }

    public void addFront(int payload)
    {
        Node n = new Node(payload);
        if(this.head == null)
        {
            this.head = n;
        }
        else
        {
            //there is already at least one thing in the list
            n.setNextNode(this.head);
            this.head = n;
        }
    }

    public void display()
    {
        if(this.head == null)
        {
            System.out.println("Empty List");
        }
        else
        {
            this.head.display();
        }
    }
}
