package Template_Method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PratoTest {

    @Test
    void devePrepararPratoExecutivo() {

        Prato prato = new PratoExecutivo();

        assertEquals(
                "Preparando arroz, feijão e bife | "
                        + "Grelhando bife | "
                        + "Servindo prato executivo",

                prato.prepararPrato()
        );
    }

    @Test
    void devePrepararPratoVegetariano() {

        Prato prato = new PratoVegetariano();

        assertEquals(
                "Preparando legumes e salada | "
                        + "Cozinhando legumes | "
                        + "Servindo prato vegetariano",

                prato.prepararPrato()
        );
    }
}
