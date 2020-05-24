package boardgame;

public class Piece {
    protected Position position;
    private Board board;

    public Piece(Board board) {
        this.board = board;
        position = null; //Por padrão Java já coloca Null, só pra ficar didádico
    }
//Queremos que o tabuleiro seja acessado apenas pela camada de tabuleiro, não pela camada da partida
// Apenas é para ser acessado pela classe tabuleiro e por suas subclasses. Mais ninguém.
    protected Board getBoard() {
        return board;
    }

}
