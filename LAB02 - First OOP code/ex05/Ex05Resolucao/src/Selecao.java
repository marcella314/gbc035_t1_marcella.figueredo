public class Selecao {
    String nome;
    String nome_tecnico;
    String num_titulos;
    Figurinha[] jogadores= new Figurinha[11];

    public void instanciaFigurinhas(Figurinha n, int i) {
        n.setNome("Jogador "+i);
        n.setData_nascimento("00/00/0000");
        n.setAltura("0.00m");
        n.setPeso("0kg");
        n.setPosicao("Atacante");
    }
    public void instanciaSelecao(String num_titulos){
        this.num_titulos=num_titulos;
    }
    public Selecao(String ns, String nt){
        nome=ns;
        nome_tecnico=nt;
        for(int i=0;i<11;i++) {
            jogadores[i] = new Figurinha("Brasil");
            instanciaFigurinhas(jogadores[i], i);
        }
    }
}