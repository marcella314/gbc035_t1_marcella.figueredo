public class Main {
    public static void main(String[] args){
        Figurinha n1= new Figurinha();
        Figurinha n2= new Figurinha();
        Figurinha n3= new Figurinha();

        //instanciando primeiro objeto
        n1.nome="Neymar";
        n1.data_nascimento="05/02/1992";
        n1.altura="1.75m";
        n1.peso="68kg";
        n1.posicao="Atacante";
        n1.pais="Brasil";

        //instanciando segundo objeto
        n2.nome="Richarlison";
        n2.data_nascimento="10/05/1997";
        n2.altura="1.84m";
        n2.peso="83kg";
        n2.posicao="Atacante";
        n2.pais="Brasil";

        //instanciando terceiro objeto
        n3.nome="Vinícius Júnior";
        n3.data_nascimento="12/07/2000";
        n3.altura="1.76m";
        n3.peso="73kg";
        n3.posicao="Ponta-Esquerda";
        n3.pais="Brasil";

        System.out.println("\nFigurinha 1");
        System.out.printf("Nome: %s",n1.nome);
        System.out.printf("\nData de Nascimento: %s",n1.data_nascimento);
        System.out.printf("\nAltura: %s",n1.altura);
        System.out.printf("\nPeso: %s",n1.peso);
        System.out.printf("\nPosição: %s",n1.posicao);
        System.out.printf("\nPaís: %s",n1.pais);

        System.out.println("\n\nFigurinha 2");
        System.out.printf("Nome: %s",n2.nome);
        System.out.printf("\nData de Nascimento: %s",n2.data_nascimento);
        System.out.printf("\nAltura: %s",n2.altura);
        System.out.printf("\nPeso: %s",n2.peso);
        System.out.printf("\nPosição: %s",n2.posicao);
        System.out.printf("\nPaís: %s",n2.pais);

        System.out.println("\n\nFigurinha 3");
        System.out.printf("Nome: %s",n3.nome);
        System.out.printf("\nData de Nascimento: %s",n3.data_nascimento);
        System.out.printf("\nAltura: %s",n3.altura);
        System.out.printf("\nPeso: %s",n3.peso);
        System.out.printf("\nPosição: %s",n3.posicao);
        System.out.printf("\nPaís: %s\n",n3.pais);

    }
}