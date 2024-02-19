package org.example.E10.SistemaOperativoUtils;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class TestSistemaOperativoUtils {
    @Test
    public void TestEsWindows(){
        Assumptions.assumeTrue(SistemaOperativoUtils.esWindows());
    }

    @Test
    public void TestEsMac(){
        Assumptions.assumeTrue(SistemaOperativoUtils.esMac());
    }

    @Test
    public void TestEsLinux(){
        Assumptions.assumeTrue(SistemaOperativoUtils.esLinux());
    }

}
