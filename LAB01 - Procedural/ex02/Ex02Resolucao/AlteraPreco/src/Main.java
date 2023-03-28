import java.util.Scanner; //importando a classe Scanner
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String[] nome= new String[4];
        float[] preco= new float[4];
        int[] qtd_estoque=new int[4];

       for(int i=0; i<4; i++) {
            System.out.println("\nInforme o nome, o preço e a qtd. em estoque do produto 1:\n");
            nome[i]=ler.next();
            preco[i]=ler.nextFloat();
            qtd_estoque[i]= ler.nextInt();
       }
       System.out.println("\nAumentandoa o preco em 10% do produto 1 e 3");
       altera_preco(preco,-110,0); //negativo errado?
       altera_preco(preco,10,2);

       System.out.println("\nReduzindo o preço em 5% do produto 2");
       if(altera_preco(preco,-5,1)==-1){
           System.out.println("\nErro: preço nao alterado. Porcentagem invalida\n");
       }else{
           System.out.println("\nPreço alterado com sucesso");
       }

       System.out.println("\nAlterando o preço do prod. 3");
       if (altera_preco(preco,-110,2)==-1) {
           System.out.println("Erro: preço nao alterado. Porcentagem inválida\n");
       }

       System.out.println("\nProdutos Cadastrados:");
        for(int i=0; i<4; i++){
            System.out.printf("\nProduto: %s \nPreco: %.2f \nEstoque: %d\n", nome[i],preco[i],qtd_estoque[i]);
        }
    }

    private static int altera_preco(float[] preco, float porcentagem, int pos) {
        float temp;
        if(porcentagem> -100){
            temp = 1+(porcentagem/100);
            preco[pos]=(preco[pos])*temp;
            System.out.printf("%.2f",preco[pos]);
            return 0;
        }else{
            return -1;
        }
    }
}

