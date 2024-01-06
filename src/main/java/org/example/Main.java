package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        CLL obj= new CLL();
        obj.insertFirst(1);
        obj.insertLast(2);
        obj.display();
        obj.insert(1,10);
        obj.display();
        obj.reverse();
        obj.display();
    }
}