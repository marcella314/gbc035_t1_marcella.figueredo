public class Selecao {
    String nome;
    String nome_tecnico;
    String num_titulos;
    Figurinha[] jogadores= new Figurinha[11];
    public void criaJogadores(){
        for(int i=0;i<11;i++) {
            jogadores[i] = new Figurinha();
            instanciaFigurinhas(jogadores[i], i);
        }
    }
    public void instanciaFigurinhas(Figurinha n, int i) {
            n.setNome("Jogador "+i);
            n.setData_nascimento("00/00/0000");
            n.setAltura("0.00m");
            n.setPeso("0kg");
            n.setPosicao("Atacante");
            n.setPais(this.nome);
    }
    public void instanciaSelecao(String nome, String nome_tecnico, String num_titulos){
        this.nome=nome;
        this.nome_tecnico=nome_tecnico;
        this.num_titulos=num_titulos;
    }
}
