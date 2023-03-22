public class Main {
    public static void main(String[] args) {
        Figurinha n1= new Figurinha();
        Figurinha n2= new Figurinha();
        Figurinha n3= new Figurinha();

        instancia(n1,n2,n3); //módulo para instanciar
        printa(n1,n2,n3); //módulo para printar

    }
    public static void instancia(Figurinha n1, Figurinha n2, Figurinha n3){

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
    public static void printa(Figurinha n1, Figurinha n2, Figurinha n3){

        //printando figurinha 1
        System.out.println("-------------------------");
        System.out.println("Figurinha 1");
        System.out.println("Nome:");
        System.out.println(n1.getNome());
        System.out.println("\nData de Nascimento:");
        System.out.println(n1.getData_nascimento());
        System.out.println("\nAltura:");
        System.out.println(n1.getAltura());
        System.out.println("\nPeso:");
        System.out.println(n1.getPeso());
        System.out.println("\nPosição:");
        System.out.println(n1.getPosicao());
        System.out.println("\nPaís:");
        System.out.println(n1.getPais());
        System.out.println("-------------------------");

        //printando figurinha 2
        System.out.println("-------------------------");
        System.out.println("Figurinha 2");
        System.out.println("Nome:");
        System.out.println(n2.getNome());
        System.out.println("\nData de Nascimento:");
        System.out.println(n2.getData_nascimento());
        System.out.println("\nAltura:");
        System.out.println(n2.getAltura());
        System.out.println("\nPeso:");
        System.out.println(n2.getPeso());
        System.out.println("\nPosição:");
        System.out.println(n2.getPosicao());
        System.out.println("\nPaís:");
        System.out.println(n2.getPais());
        System.out.println("-------------------------");

        //printando figurinha 3
        System.out.println("-------------------------");
        System.out.println("Figurinha 3");
        System.out.println("Nome:");
        System.out.println(n3.getNome());
        System.out.println("\nData de Nascimento:");
        System.out.println(n3.getData_nascimento());
        System.out.println("\nAltura:");
        System.out.println(n3.getAltura());
        System.out.println("\nPeso:");
        System.out.println(n3.getPeso());
        System.out.println("\nPosição:");
        System.out.println(n3.getPosicao());
        System.out.println("\nPaís:");
        System.out.println(n3.getPais());
        System.out.println("-------------------------");
    }
}