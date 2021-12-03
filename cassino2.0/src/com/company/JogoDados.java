package com.company;

import java.util.Random;

public class JogoDados extends Jogo {


    public int [] Dados= new int[]{1,1};
    public JogoDados(String jogador) {
        super(jogador);
    }
    @Override
    public void verJogo() {
        super.verJogo();
        System.out.println("------------------------------------------------");
        System.out.println("Dado 1:" + Dados[0] + "\t Dado 2:" + Dados[1]);
        System.out.println("-------------------------------------------------");
    }
    public JogoDados(String jogador, int montante) {
        super(jogador, montante);}

    protected IONIguais_Listener lst;
    public void setOnIguais_listeners(IONIguais_Listener l){
        this.lst=l;
        //ponte entre o evento, e o gatilho
    }

    @Override
    public void jogar(int aposta) {
    if(this.get_montante() >= aposta){
        this.set_montante(get_montante()-aposta);
        Random r = new Random();
        Dados[0]= r.nextInt(6)+1;
        Dados[1]= r.nextInt(6)+1;
        if(Dados[0]==Dados[1]){
            ONIguaisEvent evt = new ONIguaisEvent(this, aposta);
            lst.ONIguais_Handler(evt);
        }
        verJogo();
    }else{
        System.out.println("Falencia");
    }

    }

}
