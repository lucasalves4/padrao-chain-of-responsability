package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProblemaTest {

    FuncionarioSuporteBasico suporteBasico;
    FuncionarioSuporteEspecializado suporteEspecializado;
    FuncionarioSuporteAvancado suporteAvancado;

    @BeforeEach
    void setUp() {
        suporteAvancado = new FuncionarioSuporteAvancado(null);
        suporteEspecializado = new FuncionarioSuporteEspecializado(suporteAvancado);
        suporteBasico = new FuncionarioSuporteBasico(suporteEspecializado);
    }

    @Test
    void deveRetornarSuporteBasicoParaResolverProblemaBasico() {
        assertEquals("Suporte Básico", suporteBasico.resolverProblema(new Problema(TipoProblemaBasico.getTipoProblemaBasico())));
    }

    @Test
    void deveRetornarSuporteEspecializadoParaResolverProblemaMedio() {
        assertEquals("Suporte Especializado", suporteEspecializado.resolverProblema(new Problema(TipoProblemaMedio.getTipoProblemaMedio())));
    }

    @Test
    void deveRetornarSuporteAvancadoParaResolverProblemaAvancado() {
        assertEquals("Suporte Avançado", suporteAvancado.resolverProblema(new Problema(TipoProblemaAvancado.getTipoProblemaAvancado())));
    }

}