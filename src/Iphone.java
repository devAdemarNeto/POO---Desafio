public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    //Metodos do Repordutor Musical
    @Override
    public void tocar(){
        System.out.println("Reproduzindo musica...");
    }

    @Override
    public void pausar(){
        System.out.println("Música pausada...");
    }

    @Override
    public void selecionarMusica(String musica){
        System.out.println("Selecionando musica: " + musica);
    }

    //Metodos do Aparelho Telefonico

    @Override
    public void ligar(String numero){
        System.out.println("Ligando para o numero: " + numero);
    }

    @Override
    public void atender(){
        System.out.println("Atendendo Chamada...");
    }

    @Override
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz...");
    }

    // Metodos do Navegador de Internet
    @Override
    public void exibirPagina(String url){
        System.out.println("Entrando na pagina: " + url);
    }

    @Override
    public void adicionarNovaAba(){
        System.out.println("Nova aba adicionada no navegador");
    }


    @Override
    public void atualizarPagina(){
        System.out.println("Pagina atualizada");
    }
}
