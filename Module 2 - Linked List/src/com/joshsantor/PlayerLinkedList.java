package com.joshsantor;

public class PlayerLinkedList {
    private PlayerNode head;
    public Player player;

    public void addToFront(Player player){
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
    }

    public void printHead(){
        System.out.print(head.getPlayer());
    }

    public void removeFront(){
        head = head.getNextPlayer();
    }

    public void countElements() {
        int elementCounter = 0;
        PlayerNode current = head;
        while (current != null) {
            elementCounter++;
            current = current.getNextPlayer();
        }
        System.out.println("\n\nThe number of elements inside the list is : " + elementCounter);
    }



    public void contains(int id, String name, int level){
        PlayerNode currentPlayer = head;
        Player currentPlayerInfo;
        int checkId;
        String checkName;
        int checkLevel;
        int containCheck = 0;
        while (currentPlayer != null){
            currentPlayerInfo = currentPlayer.getPlayer();
            checkId = currentPlayerInfo.getId();
            checkName = currentPlayerInfo.getName();
            checkLevel = currentPlayerInfo.getLevel();
            if (id == checkId && name == checkName && level == checkLevel){
                containCheck = 1;
                break;
            }
            currentPlayer = currentPlayer.getNextPlayer();
        }
        if (containCheck == 1){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public void indexOf(int id, String name, int level){
        PlayerNode currentPlayer = head;
        Player currentPlayerInfo;
        int checkId;
        String checkName;
        int checkLevel;
        int indexCheck = 0;
        int indexExist = 0;
        while (currentPlayer != null){
            currentPlayerInfo = currentPlayer.getPlayer();
            checkId = currentPlayerInfo.getId();
            checkName = currentPlayerInfo.getName();
            checkLevel = currentPlayerInfo.getLevel();
            if (id == checkId && name == checkName && level == checkLevel){
                indexExist = 1;
                System.out.println(indexCheck);
                break;
            }
            currentPlayer = currentPlayer.getNextPlayer();
            indexCheck++;
        } if (indexExist != 1){
            System.out.println("Does not exist in the linked list");
        }

    }



    public void printList(){
        PlayerNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current.getPlayer());
            System.out.print(" -> ");
            current = current.getNextPlayer();
        }
        System.out.println("null");
    }
}
