package controladortransito.Model;

/**
 * Enum de direcoes possiveis que um Objeto 'Nodo' poderá ter
 *
 * @author Giancarlo
 */
public enum Direcao {
    
    CIMA(1),
    DIREITA(2),
    BAIXO(3),
    ESQUERDA(4),
    
    CRUZAMENTO_CIMA(5),
    CRUZAMENTO_DIREITA(6),
    CRUZAMENTO_BAIXO(7),
    CRUZAMENTO_ESQUERDA(8),
    
    CRUZAMENTO_CIMA_DIRETIA(9),
    CRUZAMENTO_CIMA_ESQUERDA(10),
    CRUZAMENTO_BAIXO_DIREITA(11),
    CRUZAMENTO_BAIXO_ESQUERDA(12);
    
    private final int numId;

    private Direcao(int numId) {
        this.numId = numId;
    }

    public int getNumId() {
        return numId;
    }
}
