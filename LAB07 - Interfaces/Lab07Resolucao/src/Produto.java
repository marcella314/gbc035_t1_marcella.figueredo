public class Produto implements Classificavel{
    private int cod;
    public Produto(int cod){
        this.cod=cod;
    }
    @Override
    public boolean eMenorQue(Classificavel obj) {
            Produto compara = (Produto) obj;
            if (this.cod<compara.cod){
                return true;
            }else {
                return false;
            }
    }
    public void imprime(){
        System.out.println("Cod: "+cod);
    }
}
