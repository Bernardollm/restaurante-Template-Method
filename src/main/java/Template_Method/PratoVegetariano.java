package Template_Method;

public class PratoVegetariano extends Prato {

    @Override
    protected String prepararIngredientes() {
        return "Preparando legumes e salada";
    }

    @Override
    protected String cozinhar() {
        return "Cozinhando legumes";
    }

    @Override
    protected String servir() {
        return "Servindo prato vegetariano";
    }
}
