package com.company;

//enum é uma lista de constantes
//region enum
public enum FICHA {
        RED(50),
        BLUE(100),
        GREEN(150),
        SILVER(250),
        GOLD(500);
        private int _valor;
//endregion enum

        //region Construtor
        FICHA(int valor) {
            this._valor=valor;
        }
        //endregion Construtor
    //region GETT and Setters
        public int get_valor() {
            return _valor;
        }
        //endregion
}
