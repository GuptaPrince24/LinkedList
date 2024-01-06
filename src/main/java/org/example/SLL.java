package org.example;

public class SLL {
    private Node head;
    int size=0;
    private class Node {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    }
    public void insertFirst(int val)
    {
        Node node = new Node(val);
        node.next=head;
        head=node;
        size++;
    }
    public void insertLast(int val)
    {
        Node node = new Node(val);
        Node curr=head;
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        curr.next=node;
        size++;
    }

    public void insert(int index, int val)
    {
        if(index==0)
            insertFirst(val);
        else if(index==size)
            insertLast(val);
        else {
            Node node = new Node(val);
            Node prev=head;
            for(int i=0;i<index-1;i++)
            {
                prev=prev.next;
            }
            Node curr=prev.next;
            prev.next=node;
            node.next=curr;
            size++;
        }
    }

    public void deleteFirst()
    {
        if(head!=null)
        {
            head=head.next;
        }
        else{
            System.out.println("List is Empty");
        }
    }

    public void deleteLast()
    {
        if(head.next==null)
            head=null;
        Node curr=head;
        Node prev=curr;
        while(curr.next!=null)
        {
            prev=curr;
            curr=curr.next;
        }
        prev.next=null;
    }
    public void delete(int val)
    {
        if(head.data==val)
        {
            head=head.next;
        }
        else {
            Node curr = head;
            Node prev = curr;
            while (curr.data != val) {
                prev = curr;
                curr = curr.next;
            }
            prev.next=curr.next;
        }
    }
    public void display()
    {
        Node curr=head;
        while(curr!=null)
        {
            System.out.println(curr.data);
            curr=curr.next;
        }
    }

}
