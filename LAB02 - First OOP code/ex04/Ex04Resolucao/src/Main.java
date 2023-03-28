/*O codigo instancia duas seleções, cada uma contendo nome,
nome do tecnico, numero de titulos e informações dos jogadores.
para instanciar os jogadores a classe figurinha foi utilizada
por meio de um vetor de objetos de 11 posições chamado "jogadores".
modulos foram usados tanto para instanciar a seleçao e as figurinhas do vetor
quanto para printar as figurinhas. um modulo "cria jogadores"
também foi utilizado para atribuir uma figurinha para cada posição
do vetor, e fazer a chamada do modulo que instancia tais figurinhas.*/
public class Main {
    public static void main(String[] args) {
        Selecao sel1 = new Selecao();
        Selecao sel2 = new Selecao();

        sel1.instanciaSelecao("Brasil","Tite","5 títulos");
        sel1.criaJogadores();

        sel2.instanciaSelecao("Argentina","Maradona","3 títulos");
        sel2.criaJogadores();

        //printando sel1
        System.out.println("\n--SELEÇÃO 1--");
        System.out.printf("Nome: %s",sel1.nome);
        System.out.printf("\nNome do Técnico: %s",sel1.nome_tecnico);
        System.out.printf("\nNúmero de Títulos: %s",sel1.num_titulos);
        System.out.println("\n\n--Jogadores--");
        printa(sel1.jogadores);

        //printando sel2
        System.out.println("\n--SELEÇÃO 2--");
        System.out.printf("Nome: %s",sel2.nome);
        System.out.printf("\nNome do Técnico: %s",sel2.nome_tecnico);
        System.out.printf("\nNúmero de Títulos: %s",sel2.num_titulos);
        System.out.println("\n\n--Jogadores--");
        printa(sel2.jogadores);
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
            System.out.println(jogadores[i].getPais());
        }
    }
}
