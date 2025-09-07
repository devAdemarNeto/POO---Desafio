public class Main {

    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        // Testando reprodutor musical
        meuIphone.selecionarMusica("Imagine - John Lennon");
        meuIphone.tocar();
        meuIphone.pausar();

        // Testando telefone
        meuIphone.ligar("1199999-9999");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando navegador
        meuIphone.exibirPagina("www.apple.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
