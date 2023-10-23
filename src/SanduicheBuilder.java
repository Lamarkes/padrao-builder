
import java.util.ArrayList;
import java.util.List;

public class SanduicheBuilder {
    private String tipoPao;
    private String recheio;
    private List<String> molhos;
    private String extra;

    public SanduicheBuilder setTipoPao(String tipoPao) {
        this.tipoPao = tipoPao;
        return this;
    }

    public SanduicheBuilder setRecheio(String recheio) {
        this.recheio = recheio;
        return this;
    }

    public SanduicheBuilder addMolho(String molho) {
        if (molhos == null) {
            molhos = new ArrayList<>();
        }
        molhos.add(molho);
        return this;
    }

    public SanduicheBuilder setExtra(String extra) {
        this.extra = extra;
        return this;
    }

    public Sanduiche build() {
        return new Sanduiche(tipoPao, recheio, molhos, extra);
    }
}