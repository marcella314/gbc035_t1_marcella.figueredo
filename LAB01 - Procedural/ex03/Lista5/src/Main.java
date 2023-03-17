import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void ex01(){
            Scanner ler = new Scanner(System.in);

            int[] v= new int[6];

            System.out.println("<< Listando um vetor >>");
            System.out.println("Entre com o numero 1: ");
            v[0]=ler.nextInt();
            System.out.println("Entre com o numero 2: ");
            v[1]=ler.nextInt();
            System.out.println("Entre com o numero 3: ");
            v[2]=ler.nextInt();
            System.out.println("Entre com o numero 4: ");
            v[3]=ler.nextInt();
            System.out.println("Entre com o numero 5: ");
            v[4]=ler.nextInt();
            System.out.println("Entre com o numero 6: ");
            v[5]=ler.nextInt();

            System.out.println("Os valores lidos sao: ");
            System.out.printf("%s",Arrays.toString(v));
        }
    public static void ex02(){
        Scanner ler = new Scanner(System.in);

        System.out.println("<< Listando um vetor >>");

        int[] n=new int[6];
        for(int i=0; i<6; i++){
            System.out.println("Entre com o número: ");
            n[i]=ler.nextInt();
        }
        System.out.printf("Os valores lidos são: %s", Arrays.toString(n));
    }

    public static void ex03() {
        Scanner ler = new Scanner(System.in);
            int[] n=new int[6];
            for(int i=5; i>=0; i--){
                System.out.println("Digite um número: ");
                n[i]=ler.nextInt();
            }
            System.out.printf("A ordem inversa dos números é: %s", Arrays.toString(n));
        }
    public static void ex04(){
        Scanner ler = new Scanner(System.in);

        int[] n=new int[6];

        for(int i=0; i<6; i++){ //usar while
            System.out.println("Digite um número: ");
            n[i]=ler.nextInt();

            if(n[i]%2!=0) {
                System.out.println("Erro: Valor inválido!");
                System.out.println("Digite um número: ");
                n[i]=ler.nextInt();
            }
        }
        System.out.printf("Os números pares digitados foram: %s", Arrays.toString(n));
    }
    public static void ex05() {
        Scanner ler = new Scanner(System.in);

        int[] n = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número: ");
            n[i] = ler.nextInt();
        }
        int[] max = new int[1];
        max[0] = n[0];

        for (int j = 1; j < 5; j++) {
            if (max[0] < n[j]) {
                max[0] = n[j];
            }
        }
        int[] min = new int[1];
        min[0] = n[0];

        for (int k = 1; k < 5; k++) {
            if (min[0] > n[k]) {
                min[0] = n[k];
            }
        }

        float[] media = new float[1];
        float[] soma = new float[1];
        soma[0] = n[0];
        for (int l = 1; l < 5; l++) {
            soma[0] = soma[0] + n[l];
        }
        media[0] = soma[0] / 5;

        System.out.printf("Os valores digitados são: %s", Arrays.toString(n));
        System.out.printf("\nO maior valor é: %s", Arrays.toString(max));
        System.out.printf("\nO menor valor é: %s", Arrays.toString(min));
        System.out.printf("\nA media dos valores é: %s", Arrays.toString(media));
    }
    public static void ex06(){
        Scanner ler = new Scanner(System.in);

        int[] n=new int[5];
        for(int i=0; i<5; i++){
            System.out.println("Digite um número: ");
            n[i]=ler.nextInt();
        }

        //MAIOR VALOR
        int[] max=new int[1];
        max[0]=n[0];
        int j1=0;

        for(int j=1; j<5; j++){
            if(max[0]<n[j]){
                max[0]=n[j];
                j1=j;
            }
        }

        //MENOR VALOR
        int[] min=new int[1];
        min[0]=n[0];
        int k1=0;

        for(int k=1; k<5; k++){
            if(min[0]>n[k]){
                min[0]=n[k];
                k1=k;
            }
        }

        float[] media=new float[1];
        float[] soma=new float[1];
        soma[0]=n[0];
        for(int l=1; l<5; l++){
            soma[0]=soma[0]+n[l];
        }
        media[0]=soma[0]/5;

        System.out.printf("Os valores digitados são: %s", Arrays.toString(n));
        System.out.printf("\nO maior valor é: %s, localizado na posição %d do vetor", Arrays.toString(max),j1);
        System.out.printf("\nO menor valor é: %s, localizado na posição %d do vetor", Arrays.toString(min), k1);
        System.out.printf("\nA media dos valores é: %s", Arrays.toString(media));
    }
    public static void ex07(){
        Scanner ler = new Scanner(System.in);

        int[] notas=new int[5];
        for(int i=0; i<5; i++){
            int y=i+1;
            System.out.printf("Entre com a nota do aluno %d: ",y);
            notas[i]=ler.nextInt();
        }

        System.out.println("\nNotas Normalizadas");

        int maior=notas[0];
        int maior_grande=0;
        for(int j=0; j<5; j++){
            if(notas[j]>maior){
                maior=notas[j];
                maior_grande=j;
            }
        }

        for(int j=0; j<5; j++){
            int count=100/notas[maior_grande];
            notas[j]=notas[j]*count;
            int x=j+1;
            System.out.printf("\nA nota do aluno %d é %s", x, notas[j]);
        }
    }
    public static void ex08(){
        Scanner ler = new Scanner(System.in);

        //recebendo as entradas
        int[] n = new int[5];
        for (int i = 0; i < 5; i++) {
            int y = i + 1;
            System.out.printf("Digite o valor %d: ", y);
            n[i] = ler.nextInt();
        }

        //calculando a media
        double media=0;
        double soma=0;
        soma=n[0];
        for(int i=1; i<5; i++){
            soma=soma+n[i];
        }
        media=soma/5;

        //efetuando as subtrações
        double[] sub= new double[5];

        for(int j=0; j<5; j++){
            sub[j]=n[j]-media;
        }

        //efetuando as potenciações
        double[] pot=new double[5];
        for(int k=0; k<5; k++){
            pot[k]=sub[k]*sub[k];
        }

        //somando as potenciações
        double soma1=0;
        soma1=pot[0];

        for(int l=1; l<5; l++){
            soma1=soma1+pot[l];
        }

        //efetuando a divisão
        double quase_la=0;
        quase_la=soma1/5;

        //efetuando a radiciação
        double desvio=0;
        desvio=Math.sqrt(quase_la);

        System.out.printf("\nA média é %.0f e o desvio-padrão é %s", media, desvio);
    }
    public static void ex09(){
        Scanner ler = new Scanner(System.in);

        int numAlunos=0;

        System.out.println("Entre com o numero de alunos:");
        numAlunos=ler.nextInt();

        if(numAlunos>100) {
            System.out.println("Número de alunos excede o máximo possível!");
            System.out.println("Por favor insira um número de alunos menor ou igual a 100.");

            System.out.println("Entre com o numero de alunos:");
            numAlunos=ler.nextInt();
            float[] notas=new float[numAlunos];
            for(int i=0;i<numAlunos;i++){
                System.out.printf("Digite a nota do aluno %d:",i);
                notas[i]=ler.nextFloat();
            }

            float media=0;
            float soma=0;
            soma=notas[0];
            for(int i=1; i<numAlunos; i++){
                soma=soma+notas[i];
            }
            media=soma/numAlunos;

            System.out.println("\nRelatório de Notas");

            for(int j=0;j<numAlunos;j++){
                System.out.printf("\nA nota do aluno %d é: %s",j+1,notas[j]);
            }
            System.out.printf("\nA media da turma é %.1f",media);

            return;
        }

        float[] notas=new float[numAlunos];
        for(int i=0;i<numAlunos;i++){
            System.out.printf("Digite a nota do aluno %d:",i+1);
            notas[i]=ler.nextFloat();
        }

        float media=0;
        float soma=0;
        soma=notas[0];
        for(int i=1; i<numAlunos; i++){
            soma=soma+notas[i];
        }
        media=soma/numAlunos;

        System.out.println("\nRelatório de Notas");

        for(int j=0;j<numAlunos;j++){
            System.out.printf("\nA nota do aluno %d é: %s",j+1,notas[j]);
        }
        System.out.printf("\nA media da turma é %.1f",media);
    }
    public static void ex10(){
        Scanner ler = new Scanner(System.in);
        int[] A=new int[3];
        int[] B=new int[3];
        int[] C=new int[3];

        for(int i=0;i<3;i++){
            System.out.printf("Digite o valor %d de A:",i+1);
            A[i]=ler.nextInt();
        }
        for(int i=0;i<3;i++){
            System.out.printf("Digite o valor %d de B:",i+1);
            B[i]=ler.nextInt();
        }
        for(int i=0;i<3;i++){
            C[i]=A[i]-B[i];
        }
        System.out.println("O vetor C, definido como C=A-B é");
        for(int i=0;i<3;i++){
            System.out.printf("%d,",C[i]);
        }
    }
    public static void ex11(){
        Scanner ler = new Scanner(System.in);

        int[] v=new int[5];
        int[] v1=new int[5];
        int[] v2=new int[5];

        for(int i=0;i<5;i++){
            System.out.printf("Digite o valor %d: ",i+1);
            v[i]=ler.nextInt();
        }

        for(int i=0;i<5;i++) {
            if (v[i] % 2 != 0) {
               v1[i]=v[i];
            }else v2[i]=v[i];
        }
        System.out.println("Impares:");
        for(int i=0;i<5;i++) {
            if(v1[i]!=0){
                System.out.printf("%d ",v1[i]);
            }
        }
        System.out.println("\nPares:");
        for(int i=0;i<5;i++) {
            if(v2[i]!=0){
                System.out.printf("%d ",v2[i]);
            }
        }
    }
    public static void ex12(){
        Scanner ler = new Scanner(System.in);
        float verde_count, azul_count, amarela_count, vermelha_count, bolinhas_count;
        float verde_prob,azul_prob,amarela_prob,vermelha_prob;

        System.out.println("Digite a quantidade de bolinhas \nVerde:");
        verde_count= ler.nextFloat();
        System.out.println("\nAzul:");
        azul_count= ler.nextFloat();
        System.out.println("\nAmarela:");
        amarela_count= ler.nextFloat();
        System.out.println("\nVermelha:");
        vermelha_count= ler.nextFloat();

        bolinhas_count=verde_count+azul_count+amarela_count+vermelha_count;

        verde_prob=verde_count/bolinhas_count;
        azul_prob=azul_count/bolinhas_count;
        amarela_prob=amarela_count/bolinhas_count;
        vermelha_prob=vermelha_count/bolinhas_count;

        float[] maior=new float[4];
        maior[0]=verde_prob;
        maior[1]=azul_prob;
        maior[2]=amarela_prob;
        maior[3]=vermelha_prob;

        float max;
        int k;
        max = maior[0];

        for (int j = 0; j < 4; j++) {
            if (max < maior[j]) {
                max = maior[j];
            }
        }

        System.out.println("Probabilidades \n");
        if(verde_prob*100!=max*100){
            System.out.printf("Verde: %.1f porcento",verde_prob*100);
        }else{
            System.out.printf("Verde: %.1f porcento <<Maior Probabilidade",verde_prob*100);
        }
        if(azul_prob*100!=max*100){
            System.out.printf("\nAzul: %.1f porcento",azul_prob*100);
        }else{
            System.out.printf("\nAzul: %.1f porcento <<Maior Probabilidade",azul_prob*100);
        }
        if(amarela_prob*100!=max*100){
            System.out.printf("\nAmarela: %.1f porcento",amarela_prob*100);
        }else{
            System.out.printf("\nAmarela: %.1f porcento <<Maior Probabilidade",amarela_prob*100);
        }
        if(vermelha_prob*100!=max*100){
            System.out.printf("\nVermelha: %.1f porcento",vermelha_prob*100);
        }else{
            System.out.printf("\nVermelha: %.1f porcento <<Maior Probabilidade",vermelha_prob*100);
        }
    }
    public static void ex13(){
        Scanner ler = new Scanner(System.in);

        int[] vetor=new int[5];

        for(int i=0;i<5;i++){
            System.out.printf("Entre com o numero %d: ",i+1);
            vetor[i]=ler.nextInt();
        }

        for(int i=0;i<5;i++){
            if(vetor[i]<0){
                vetor[i]=0;
            }
        }
        System.out.println("Zerando os negativos, obtem-se: ");

        for(int i=0;i<5;i++){
            System.out.printf(" %d",vetor[i]);
        }
    }

    public static void ex15(){
        Scanner ler = new Scanner(System.in);

        int[] vetor=new int[8];
        boolean repetido;

        for(int i=0; i<8; i++){
            System.out.printf("Entre com o número %d:", i+1);
            vetor[i]= ler.nextInt();
        }

        System.out.println("Valor(es) repetido(s):");

        for(int i=0;i<8;i++) {
            repetido=false;
            for (int j = 0; j < i; j++) {
                if (vetor[j] == vetor[i]) {
                    repetido = true;
                    break;
                }
            }

            if (!repetido) {
                for (int j = i + 1; j < 8; j++) {
                    if (vetor[j] == vetor[i]) {
                        System.out.printf(" %d", vetor[i]);
                        break;
                    }
                }
            }
        }
    }
    public static void ex16(){
        Scanner ler = new Scanner(System.in);

        int count;
        int[] vetor=new int[8];

        for(int i=0; i<8; i++){
            System.out.printf("Entre com o número %d:", i+1);
            vetor[i]= ler.nextInt();
        }
        System.out.println("Valor(es) repetido(s):");

        for(int i= 0; i < 8; i++) {
            count=0;
            for(int j = i + 1; j < 8; j++) {
                if (vetor[i] == vetor[j]) {
                    count++;
                }
            }
            if (count> 0) {
                System.out.printf("%d aparece %d vez(es)\n", vetor[i], count +1);
            }
        }
    }
    public static void main(String[] args) {
        //ex01();
        //ex02();
        //ex03();
        //ex04();
        //ex05();
        //ex06();
        //ex07();
        //ex08();
        //ex09();
        //ex10();
        //ex11();
        //ex12();
        //ex13();
        //ex14(); //Não consegui fazer a ex14.
        //ex15();
        //ex16(); //Não consegui fazer funcionar perfeitamente pra quando o número se repete mais de 2 vezes.

    }


}