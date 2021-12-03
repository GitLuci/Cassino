package com.company;

import java.util.EventObject;

public class ONIguaisEvent extends EventObject {
    public int Aposta;
    public ONIguaisEvent(Object source, int aposta) {
        super(source);
        this.Aposta=aposta;
    }
}
