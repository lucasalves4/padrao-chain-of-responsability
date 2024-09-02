package org.example;

public class FuncionarioSuporteBasico extends Suporte{

    public FuncionarioSuporteBasico(Suporte superior) {
        listaProblemas.add(TipoProblemaBasico.getTipoProblemaBasico());
        setSuporteSuperior(superior);
    }

    public String getDescricaoSuporte() {
        return "Suporte Básico";
    }
}
