package org.example;

import java.util.ArrayList;

public abstract class Suporte {

    protected ArrayList listaProblemas = new ArrayList();
    private Suporte suporteSuperior;

    public Suporte getSuporteSuperior() {
        return suporteSuperior;
    }

    public void setSuporteSuperior(Suporte suporteSuperior) {
        this.suporteSuperior = suporteSuperior;
    }

    public abstract String getDescricaoSuporte();

    public String resolverProblema(Problema problema) {
        if (listaProblemas.contains(problema.getTipoProblema())) {
            return getDescricaoSuporte();
        }
        else {
            if (suporteSuperior != null) {
                return suporteSuperior.resolverProblema(problema);
            }
            else
            {
                return "Não foi possível resolver o problema";
            }
        }
    }
}
