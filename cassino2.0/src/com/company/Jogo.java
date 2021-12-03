package com.company;

public abstract class Jogo implements IJogo{
    //bloco de inicialização deve vim antes dos metodos construtores
    {
        _montante=0;
    }

    @Override
    public void verJogo() {
        System.out.println("------------------------------");
        System.out.println("Jogador:" + _jogador);
        System.out.println("Montante:" + _montante);
        System.out.println("------------------------------");
    }

    @Override
    public abstract void jogar(int aposta);

    private String _jogador;
    protected int _montante;

//region Getters e Setters
    public String get_jogador() {
        return _jogador;
    }

    public int get_montante() {
        return _montante;
    }

    public void set_montante(int _montante) {
        if(_montante >= 0)this._montante = _montante;
    }
//endregion Getters e Setters

    //metodo construtor usado quando instancio o objeto
    // metodos com o mesmo nome e parametros diferentes = overloading
    public Jogo(String jogador){
        this._jogador=jogador;
    }
    public Jogo(String jogador,int montante){
        this(jogador);
        //este esta chamando o metodo construtor acima
        this._montante=montante;
    }
}
