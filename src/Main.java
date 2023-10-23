
public class Main {
    public static void main(String[] args) {
        SanduicheBuilder builder = new SanduicheBuilder();


        Sanduiche sanduiche1 = builder.setTipoPao("Italiano")
                .setRecheio("frango")
                .addMolho("Maionese")
                .addMolho("Mostarda")
                .setExtra("azeitonas")
                .build();
        sanduiche1.imprimirSanduiche();

        System.out.println("============");

        Sanduiche sanduiche2 = builder.setTipoPao("Francês")
                .setRecheio("camarão")
                .addMolho("Ketchup")
                .setExtra("bacon")
                .build();
        sanduiche2.imprimirSanduiche();

        System.out.println("============");

        Sanduiche sanduiche3 = builder.setTipoPao("Americano")
                .setRecheio("atum")
                .addMolho("Maionese")
                .addMolho("Mostarda")
                .setExtra("cheddar")
                .build();
        sanduiche3.imprimirSanduiche();
    }
}