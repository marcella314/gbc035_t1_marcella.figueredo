public class Servico implements Classificavel{
    double preco;
    public Servico(double preco){
        this.preco=preco;
    }
    public boolean eMenorQue(Classificavel obj) {
        Servico compara = (Servico) obj;
        if (this.preco<compara.preco){
            return true;
        }else {
            return false;
        }
    }
    public void imprime(){
        System.out.println("Preço: "+preco);
    }

}
