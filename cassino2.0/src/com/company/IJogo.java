package com.company;


public interface IJogo {
    static final int MAXAPOSTA=1000;
    //Metodo abstrato todo metodo que só tem assinatura e ; é um metodo sem corpo
    void jogar(int aposta);
    void verJogo();
// metodo default agora tem corpo, já implementado
    default int compraFichas(FICHA[]fichas){
        int soma=0;
        for(FICHA f : fichas) soma +=f.get_valor();
        return soma;
    }
    //usado no proprio interface
    static void publicidade(){
        System.out.println("Casino ESTORIL");
    }


}
