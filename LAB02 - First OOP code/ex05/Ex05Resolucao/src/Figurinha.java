public class Figurinha {
    String nome;
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    String data_nascimento;
    String getData_nascimento(){
        return data_nascimento;
    }
    public void setData_nascimento(String data_nascimento){
        this.data_nascimento=data_nascimento;
    }
    String altura;
   public String getAltura(){
        return altura;
    }
    public void setAltura(String altura){
        this.altura=altura;
    }
    String peso;
    public String getPeso(){
        return peso;
    }
    public void setPeso(String peso){
        this.peso=peso;
    }
    String posicao;
    public String getPosicao(){
        return posicao;
    }
    public void setPosicao(String posicao){
        this.posicao=posicao;
    }
    String pais;
    public Figurinha(String p){
        pais=p;
    }
}