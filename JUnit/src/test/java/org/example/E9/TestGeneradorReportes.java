package org.example.E9;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.List;

import static org.example.E9.GeneradorReportes.GeneradorReportes.generarReporte;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class TestGeneradorReportes {
    @TestFactory
    public List<DynamicTest> testGenerarReporte() {
        List<String> lista = Arrays.asList("reporte1", "reporte2", "reporte3");

        return List.of(
                dynamicTest("Dinamic Test", () -> {
                    assertEquals("Reporte:\n- reporte1\n- reporte2\n- reporte3\n", generarReporte(lista));
                })
        );
    }
}
