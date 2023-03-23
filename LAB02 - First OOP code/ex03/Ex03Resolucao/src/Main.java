public class Main {
    public static void main(String[] args) {
        Figurinha[] album = new Figurinha[3];
        Figurinha n1 = new Figurinha();
        Figurinha n2 = new Figurinha();
        Figurinha n3 = new Figurinha();

        album[0] = n1;
        album[1] = n2;
        album[2] = n3;

        instancia(album[0], album[1], album[2]); //módulo para instanciar
        printa(album); //módulo para printar
    }

    public static void instancia(Figurinha n1, Figurinha n2, Figurinha n3) {

        //instanciando primeiro objeto
        n1.setNome("Neymar");
        n1.setData_nascimento("05/02/1992");
        n1.setAltura("1.75m");
        n1.setPeso("68kg");
        n1.setPosicao("Atacante");
        n1.setPais("Brasil");

        //instanciando segundo objeto
        n2.setNome("Richarlison");
        n2.setData_nascimento("10/05/1997");
        n2.setAltura("1.84m");
        n2.setPeso("83kg");
        n2.setPosicao("Atacante");
        n2.setPais("Brasil");

        //instanciando terceiro objeto
        n3.setNome("Vinícius Júnior");
        n3.setData_nascimento("12/07/2000");
        n3.setAltura("1.76m");
        n3.setPeso("73kg");
        n3.setPosicao("Ponta-Esquerda");
        n3.setPais("Brasil");
    }

    public static void printa(Figurinha[] album) {
        
        for (int i = 0; i < 3; i++) {
            System.out.println("----------------------------");
            System.out.printf("Figurinha %d\n",i+1);
            System.out.println("Nome: ");
            System.out.println(album[i].getNome());
            System.out.println("Data de Nascimento: ");
            System.out.println(album[i].getData_nascimento());
            System.out.println("Altura: ");
            System.out.println(album[i].getAltura());
            System.out.println("Peso: ");
            System.out.println(album[i].getPeso());
            System.out.println("Posição: ");
            System.out.println(album[i].getPosicao());
            System.out.println("País: ");
            System.out.println(album[i].getPais());
            System.out.println("----------------------------");
        }
    }
}
