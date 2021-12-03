package com.company;

public class Main {

    public static void main(String[] args) {
	JogoDados ze = new JogoDados("zé da batota", 1000);
    ze.setOnIguais_listeners(new IONIguais_Listener() {
        @Override
        public void ONIguais_Handler(ONIguaisEvent evt) {
            JogoDados j = (JogoDados) evt.getSource();
            int premio = j.Dados[0]*2 *evt.Aposta;
            j.set_montante(j.get_montante() + premio);
            System.out.println("Parabens, ganhou " + premio);
        }
    });
    ze.verJogo();
    for(int i = 0; i < 10; i++)ze.jogar(300);
    ze.set_montante(ze.get_montante() + ze.compraFichas(new FICHA[]{FICHA.GOLD, FICHA.BLUE, FICHA.SILVER}));
    ze.verJogo();
    }
}
