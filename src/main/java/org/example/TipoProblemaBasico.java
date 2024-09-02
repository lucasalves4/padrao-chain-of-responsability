package org.example;

public class TipoProblemaBasico implements TipoProblema {

    private static TipoProblemaBasico tipoProblemaBasico = new TipoProblemaBasico();

    private TipoProblemaBasico() {};

    public static TipoProblemaBasico getTipoProblemaBasico() {
        return tipoProblemaBasico;
    }
}
