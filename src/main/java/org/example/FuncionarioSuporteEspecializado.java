package org.example;

public class FuncionarioSuporteEspecializado extends Suporte {

    public FuncionarioSuporteEspecializado(Suporte superior) {
        listaProblemas.add(TipoProblemaMedio.getTipoProblemaMedio());
        setSuporteSuperior(superior);
    }

    public String getDescricaoSuporte() {
        return "Suporte Especializado";
    }
}
