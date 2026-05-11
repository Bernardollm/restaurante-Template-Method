package Template_Method;

public abstract class Prato {

    public final String prepararPrato() {

        return prepararIngredientes() + " | "
                + cozinhar() + " | "
                + servir();
    }

    protected abstract String prepararIngredientes();

    protected abstract String cozinhar();

    protected abstract String servir();
}
