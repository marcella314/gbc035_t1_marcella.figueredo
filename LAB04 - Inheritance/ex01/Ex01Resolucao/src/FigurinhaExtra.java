public class FigurinhaExtra {
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
    Figurinha figurinhaRara;
    public FigurinhaExtra(String Cor, String Categoria,Figurinha figurinhaRara){
        setCategoria(Categoria);
        setCor(Cor);
        this.figurinhaRara=figurinhaRara;
    }
    public void MostraFigurinhaExtra(){
        System.out.println("\n--FIGURINHA RARA!!--");
        figurinhaRara.mostraFigurinha();
        System.out.printf("Categoria: %s\n", getCategoria());
        System.out.printf("Cor: %s\n",getCor());
    }
}
