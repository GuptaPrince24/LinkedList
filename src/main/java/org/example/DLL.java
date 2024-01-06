package org.example;

public class DLL {
    private Node head;
    int size=0;
    private class Node {
        int data;
        Node next;
        Node prev;
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
        node.prev=curr;
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
            Node previous=head;
            for(int i=0;i<index-1;i++)
            {
                previous=previous.next;
            }
            Node curr=previous.next;
            previous.next=node;
            node.next=curr;
            curr.prev=node;
            node.prev=previous;
            size++;
        }
    }

    public void deleteFirst()
    {
        if(head!=null)
        {
            head=head.next;
            head.prev=null;
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
            Node previous = curr;
            while (curr.data != val) {
                previous = curr;
                curr = curr.next;
            }
            previous.next=curr.next;
            if(curr.next!=null)
            curr.next.prev=previous;
        }
    }

    public void reverse()
    {
        if(head==null||head.next==null)
        {
            System.out.println(head.data);
            return;
        }
        Node curr=head;
        while(curr.next!=null)
        {
            curr=curr.next;
        }
        while(curr!=null)
        {
            System.out.println(curr.data);
            curr=curr.prev;
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
