/*
Qual a diferença entre o throw e throws ? Justifique explicado o que cada comando faz

throws tem que ser tratado, já o throw permite que a função continue mesmo com o erro.

Indique a diferença entre checked e uncheked exceptions
Checked exceptions exigem captura e tratamento, já o Unchecked exceptions não exigem captura e tratamento. Ambas param a jvm se a exceção não for tratada.
*/
public class Main {
    public static void main(String[] args) {
        Funcionario newFunc = new Funcionario("12031639676","marcella", 20000);
        try{
            newFunc.aumentaSalario(20);
        }catch (IllegalStateException e){
            System.out.println(e.getMessage());
        }
        System.out.println("sal: "+newFunc.getSalario());
    }
}