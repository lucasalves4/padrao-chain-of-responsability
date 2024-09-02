package org.example;

public class TipoProblemaMedio implements TipoProblema{

    private static TipoProblemaMedio tipoProblemaMedio = new TipoProblemaMedio();

    private TipoProblemaMedio() {};

    public static TipoProblemaMedio getTipoProblemaMedio() {
        return tipoProblemaMedio;
    }
}
