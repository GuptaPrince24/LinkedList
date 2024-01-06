package org.example;

public class CLL {
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
        if(head==null)
        node.next=node;
        else
            node.next=head;
        head=node;
        size++;
    }
    public void insertLast(int val)
    {
        Node node = new Node(val);
        Node curr=head;
        while(curr.next!=head)
        {
            curr=curr.next;
        }
        curr.next=node;
        node.next=head;
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
            if( head.next==head) {
                head = null;
            }
            else
            {
                Node curr=head;
                while(curr.next!=head)
                {
                    curr=curr.next;
                }
                head=head.next;
                curr.next=head;
            }
        }
        else{
            System.out.println("List is Empty");
        }
    }

    public void deleteLast()
    {
        if(head.next==head) {
            head = null;
            return;
        }
        Node curr=head;
        Node prev=curr;
        while(curr.next!=head)
        {
            prev=curr;
            curr=curr.next;
        }
        prev.next=head;
    }
    public void delete(int val)
    {
        if(head.data==val)
        {
            Node curr=head;
            while(curr.next!=head)
            {
                curr=curr.next;
            }
            head=head.next;
            curr.next=head;
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

    public Node reverse()
    {
        if(head==null||head.next==head)
            return head;
        Node curr=head;
        Node prev=null;
        Node next=curr.next;
        while(curr.next!=head)
        {
            curr.next=prev;
            prev=curr;
            curr=next;
            if(next!=head)
                next=next.next;
        }
        curr.next=prev;
        prev=curr;
        head.next=prev;
        head=prev;
        return head;
    }
    public void display()
    {
        Node curr=head;
        if(head!=null)
        while(curr.next!=head)
        {
            System.out.println(curr.data);
            curr=curr.next;
        }
        System.out.println(curr.data);
    }
}
