public class Main {
    public static void main(String[] args) {
        Selecao sel1 = new Selecao("Brasil", "Tite");
        sel1.instanciaSelecao("5 títulos");

        //printando sel1
        System.out.println("\n--SELEÇÃO 1--");
        System.out.printf("Nome: %s",sel1.nome);
        System.out.printf("\nNome do Técnico: %s",sel1.nome_tecnico);
        System.out.printf("\nNúmero de Títulos: %s",sel1.num_titulos);
        System.out.println("\n\n--Jogadores--");
        printa(sel1.jogadores);
    }
    public static void printa(Figurinha[] jogadores) {
        for (int i = 0; i < 11; i++) {
            System.out.printf("\nNome: ");
            System.out.println(jogadores[i].getNome());
            System.out.printf("Data de Nascimento: ");
            System.out.println(jogadores[i].getData_nascimento());
            System.out.printf("Altura: ");
            System.out.println(jogadores[i].getAltura());
            System.out.printf("Peso: ");
            System.out.println(jogadores[i].getPeso());
            System.out.printf("Posição: ");
            System.out.println(jogadores[i].getPosicao());
            System.out.printf("País: ");
            System.out.println(jogadores[i].pais);
        }
    }
}
