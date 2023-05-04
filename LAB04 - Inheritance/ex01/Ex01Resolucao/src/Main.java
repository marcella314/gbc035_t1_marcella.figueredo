public class Main {
    public static void main(String[] args) {

        //criando figurinha normal
        Figurinha figurinha = new Figurinha("Jogador 1","00/00/0000", 00, 00, "Ataque", "Brasil");
        System.out.println("\n--FIGURINHA--");

        figurinha.mostraFigurinha(); //mostrando figurinha normal

        //criando figruinha rara
        FigurinhaExtra figurinhaExtra = new FigurinhaExtra("Ouro", "Rookies", new Figurinha("Jogador 2","01/01/0001", 00, 00, "Lateral Esquerda", "Argentina"));

        figurinhaExtra.MostraFigurinhaExtra();//mostrando figurinha rara
    }
}