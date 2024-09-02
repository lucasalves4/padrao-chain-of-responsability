package org.example;

public class FuncionarioSuporteAvancado extends Suporte{

    public FuncionarioSuporteAvancado(Suporte superior) {
        listaProblemas.add(TipoProblemaAvancado.getTipoProblemaAvancado());
        setSuporteSuperior(superior);
    }

    public String getDescricaoSuporte() {
        return "Suporte Avançado";
    }
}
