package com.company;

public class Other implements ChainOfResponsibility {

    private ChainOfResponsibility chain;

    @Override
    public void nextChain(ChainOfResponsibility nextChain) {
        chain = nextChain;
    }

    @Override
    public void requestProcess(Message message) {
        if (
                !message.getMessage().equals("Szkło")
                || !message.getMessage().equals("Papier")
                || !message.getMessage().equals("Tworzywa sztuczne"
                )) {
            System.out.println("Pojemnik na pozostałe elementy: " + message.getMessage());
        } else {
            chain.requestProcess(message);
        }
    }
}
