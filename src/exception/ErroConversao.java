package exception;

public class ErroConversao extends RuntimeException {
    private String mensagem;
    
    public ErroConversao(String mensagem){
        mensagem = this.mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
