package com.company;

public class Main {

    public static void main(String[] args) {

        ChainOfResponsibility firstChain = new Glass();
        ChainOfResponsibility secondChain = new Paper();
        ChainOfResponsibility thirdChain = new Plastics();
        ChainOfResponsibility fourthChain = new Other();

        firstChain.nextChain(secondChain);
        secondChain.nextChain(thirdChain);
        thirdChain.nextChain(fourthChain);

        firstChain.requestProcess(new Message("Szkło"));
        firstChain.requestProcess(new Message("Papier"));
        firstChain.requestProcess(new Message("Paper"));
        firstChain.requestProcess(new Message("Tworzywa sztuczne"));
        firstChain.requestProcess(new Message("Plastic"));
        firstChain.requestProcess(new Message("ABC"));
        firstChain.requestProcess(new Message("Glass"));


    }
}
