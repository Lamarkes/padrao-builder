
import java.util.List;

public class Sanduiche {
    private String tipoPao;
    private String recheio;
    private List<String> molhos;
    private String extra;

    public Sanduiche(String tipoPao, String recheio, List<String> molhos, String extra) {
        this.tipoPao = tipoPao;
        this.recheio = recheio;
        this.molhos = molhos;
        this.extra = extra;
    }

    public void imprimirSanduiche() {
        System.out.println("Sanduíche: " + tipoPao + " com " + recheio);
        System.out.println("Molhos: " + String.join(", ", molhos));
        System.out.println("Extra: " + extra);
    }
}
