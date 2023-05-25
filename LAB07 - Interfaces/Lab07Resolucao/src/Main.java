public class Main {
    public static void main(String[] args) {
        Cliente[] novoCliente = new Cliente[3];
        novoCliente[0]= new Cliente("Jao");
        novoCliente[1]= new Cliente("pedro");
        novoCliente[2]= new Cliente("carlos");
        Produto[] novoProd = new Produto[3];
        novoProd[0]= new Produto(10);
        novoProd[1]= new Produto(20);
        novoProd[2]= new Produto(15);
        Servico[] novoServ = new Servico[3];
        novoServ[0]= new Servico(20.5);
        novoServ[1]= new Servico(19.8);
        novoServ[2]= new Servico(35.2);
        imprime(novoCliente);
        imprime(novoServ);
        imprime(novoProd);
        insertionSort(novoCliente);
        insertionSort(novoServ);
        insertionSort(novoProd);
        imprime(novoCliente);
        imprime(novoServ);
        imprime(novoProd);
    }
    public static Classificavel[] insertionSort(Classificavel[] vetor){
        int n= vetor.length;
        for(int i=1; i<n;i++){
            Classificavel chave = vetor[i];
            int j=i-1;
            while (j>=0 && chave.eMenorQue(vetor[j])){
                vetor[j+1]=vetor[j];
                j=j-1;
            }
            vetor[j+1]=chave;
        }
        return vetor;
    }
    public static void imprime(Classificavel[] vetor){
        for(int i=0; i<vetor.length;i++)
            vetor[i].imprime();
    }
}