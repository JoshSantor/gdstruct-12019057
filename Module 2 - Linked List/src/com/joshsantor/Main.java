package com.joshsantor;

public class Main {

    public static void main(String[] args) {

        Player asuna = new Player(1, "Asuna", 100);
        Player lethalBacon = new Player(2, "LethalBacon", 205);
        Player hpDeskJet = new Player (3, "HPDeskJet", 34);

        PlayerLinkedList playerLinkedList = new PlayerLinkedList();

        playerLinkedList.addToFront(asuna);
        playerLinkedList.addToFront(lethalBacon);
        playerLinkedList.addToFront(hpDeskJet);


        System.out.println("Linked List\n");
        playerLinkedList.printList();

        System.out.println("\nDoes Id: 2, Player Name: Asuna, level: 100 exist?");
        playerLinkedList.contains(2,"Asuna",100);

        System.out.println("Index of Player Name: Asuna");
        playerLinkedList.indexOf(1,"Asuna",100);

        playerLinkedList.countElements();

        System.out.println("\nHead before deletion");
        playerLinkedList.printHead();

        System.out.println("\n\nPrevious Head Deleted....");
        playerLinkedList.removeFront();
        System.out.println("\nCurrent Head");
        playerLinkedList.printHead();
    }
}
