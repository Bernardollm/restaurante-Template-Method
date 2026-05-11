package Template_Method;

public class PratoExecutivo extends Prato {

    @Override
    protected String prepararIngredientes() {
        return "Preparando arroz, feijão e bife";
    }

    @Override
    protected String cozinhar() {
        return "Grelhando bife";
    }

    @Override
    protected String servir() {
        return "Servindo prato executivo";
    }
}
