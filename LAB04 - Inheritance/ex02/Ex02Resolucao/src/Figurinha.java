public class Figurinha {
    protected String Nome;
    public String getNome(){
        return Nome;
    }
    public void setNome(String nome){Nome=nome;}
    protected String DataNascimento;
    public String getDataNascimento(){
        return DataNascimento;
    }
    public void setDataNascimento(String dataNascimento){DataNascimento=dataNascimento;}
    protected double Altura;
    public double getAltura(){return Altura;}
    public void setAltura(double altura){Altura=altura;}
    protected double Peso;
    public double getPeso(){
        return Peso;
    }
    public void setPeso(double peso){Peso=peso;}
    protected String Posicao;
    public String getPosicao(){
        return Posicao;
    }
    public void setPosicao(String posicao){
        Posicao=posicao;
    }
    protected String Pais;
    public String getPais(){
        return Pais;
    }
    public void setPais(String pais){
        Pais=pais;
    }
    public Figurinha(String Nome, String DataNascimento, double Altura, double Peso, String Posicao, String Pais){
        setNome(Nome);
        setDataNascimento(DataNascimento);
        setAltura(Altura);
        setPeso(Peso);
        setPosicao(Posicao);
        setPais(Pais);
    }

    public void mostraFigurinha(){
        System.out.printf("Nome do Jogador: %s\n",getNome());
        System.out.printf("Data de Nascimento: %s\n",getDataNascimento());
        System.out.printf("Altura: %f\n",getAltura());
        System.out.printf("Peso: %f\n",getPeso());
        System.out.printf("Posição: %s\n",getPosicao());
        System.out.printf("País: %s\n",getPais());
    }
}
