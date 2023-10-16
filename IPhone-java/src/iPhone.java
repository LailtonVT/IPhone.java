public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    
    @Override
    public void tocar(){
        System.out.println("Tocando musica...");
    }
    @Override
    public void pausar(){
        System.out.println("Pausando a musica...");
    }
    @Override
    public void selecionarMusica(){
        System.out.println("Selecionando a musica...");
    }

    @Override
    public void ligar(){
        System.out.println("Ligando o telefone...");
    }
    @Override
    public void atender(){
        System.out.println("Atendendo chamada...");
    }
    @Override
    public void iniciarConversaVoz(){
        System.out.println("Iniciando conversa de voz...");
    }
    
    @Override
    public void exibirPagina(String urlString){
        System.out.println("Exibindo pagina: " + urlString);
    }
    @Override
    public void adicionarNovaAba(String urlString){
        System.out.println("Adicionando nova aba: " + urlString);
    }
    @Override
    public void atualizarPagina(){
        System.out.println("Atualizando a pagina");
    }
    
    
    public static void main(String[] args){
        iPhone myIPhone = new iPhone();

        myIPhone.ligar();
        myIPhone.tocar();
        myIPhone.exibirPagina("www.exemplo.com.br");
        
    }
}
