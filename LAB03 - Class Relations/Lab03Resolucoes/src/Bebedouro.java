public class Bebedouro {
    String Nome;
    public String getNome(){
        return Nome;
    }
    public void setNome(String nome){
        Nome=nome;
    }

    String Nota; //0 a 5 estrelas
    public String getNota(){
        return Nota;
    }
    public void setNota(String nota){
        Nota=nota;
    }
    Agua Agua;
    Localizacao Local;
    public Bebedouro(String Nota,String Nome, String distancia, String bloco, Agua agua ){
        setNome(Nome);
        setNota(Nota);
        Agua=agua;
        Local = new Localizacao(distancia,bloco);
    }
    public void printaBebedouro(){
        System.out.println("--Nome--");
        System.out.printf("%s\n", getNome());
        System.out.println("--Localização-- ");
        Local.printaLocal();
        System.out.printf("Nota => %s\n", getNota());
        Agua.printaAgua();
    }
}
