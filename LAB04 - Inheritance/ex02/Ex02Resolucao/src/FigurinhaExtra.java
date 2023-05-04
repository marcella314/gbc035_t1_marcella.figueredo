public class FigurinhaExtra extends Figurinha {
    private String Categoria; //"Legends" e "Rookies"
    public String getCategoria(){return Categoria;}
    public void setCategoria(String categoria){
        Categoria=categoria;
    }
    private String Cor; //bordô, bronze, prata e ouro
    public String getCor(){
        return Cor;
    }
    public void setCor(String cor){
        Cor=cor;
    }
    public FigurinhaExtra(String Cor, String Categoria){
        super("Jogador 1","00/00/0000", 0.0, 0.0, "Ataque", "Brasil");
        setCategoria(Categoria);
        setCor(Cor);
    }
    public void mostraFigurinha(){
        System.out.printf("Nome do Jogador: %s\n",getNome());
        System.out.printf("Data de Nascimento: %s\n",getDataNascimento());
        System.out.printf("Altura: %f\n",getAltura());
        System.out.printf("Peso: %f\n",getPeso());
        System.out.printf("Posição: %s\n",getPosicao());
        System.out.printf("País: %s\n",getPais());
        System.out.println("\n--FIGURINHA RARA!!--");
        System.out.printf("Categoria: %s\n", getCategoria());
        System.out.printf("Cor: %s\n",getCor());
    }
}
