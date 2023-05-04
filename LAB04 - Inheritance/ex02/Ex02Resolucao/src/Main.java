public class Main {
    public static void main(String[] args) {
        Figurinha figurinha = new Figurinha("Jogador 2", "01/01/0001", 0.0, 0.0, "Ataque", "Argentina");
        System.out.println("\n--Figurinha 1--");
        figurinha.mostraFigurinha();
        System.out.println("\n--Figurinha 2--");
        FigurinhaExtra figurinhaExtra = new FigurinhaExtra("Ouro","Rookies");
        figurinhaExtra.mostraFigurinha();
    }
}