public class Main {
    public static void main(String[] args) {
        Bebedouro b1= new Bebedouro("****", "Bebedouro do 1X","60m", "1X", new Agua("Gelada", "Boa"));
        Bebedouro b2= new Bebedouro("**", "Bebedouro da FACOM","5m", "1B", new Agua("Quente", "Mediana"));
        Estudante e1=new Estudante("12121bcc029", "BCC");

        //EX01 Relação entre Bebedouro e Estudante => Associação.
        // O Estudante usa o Bebedor, MAS os dois são INDEPENDENTES.
        System.out.println("\n----------Ex01----------");
        System.out.println("      ESTUDANTE 1   ");
        e1.printaEstudante();
        e1.beberAgua(b1);
        System.out.println("\n--Os objetos são independentes!--\n");

        //EX02 Relação entre Agua e Bebedouro => Agregação.
        //Se a classe Agua for destruída, a classe Bebedouro também será destruída.
        //MAS, se a classe Bebedouro for destruída, a classe Agua NÃO será destruída.
        System.out.println("----------Ex02----------");
        System.out.println("      BEBEDOOURO 2   ");
        b2.printaBebedouro();
        System.out.println("--O objeto a1 é independente, já o objeto b1 não é independente!--\n");

        //EX03 Relação entre Bebedouro e Localização => Composição.
        //Se a classe Bebedouro for destruída, a classe Localização TAMBÉM será destruída.
        System.out.println("----------Ex03----------");
        System.out.println("      BEBEDOOURO 1   ");
        b1.printaBebedouro();
        System.out.println("\n--O objeto parte também é removido!--\n");
    }
}