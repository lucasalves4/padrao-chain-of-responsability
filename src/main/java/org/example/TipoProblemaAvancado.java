package org.example;

public class TipoProblemaAvancado implements TipoProblema{

    private static TipoProblemaAvancado tipoProblemaAvancado = new TipoProblemaAvancado();

    private TipoProblemaAvancado() {};

    public static TipoProblemaAvancado getTipoProblemaAvancado() {
        return tipoProblemaAvancado;
    }
}
