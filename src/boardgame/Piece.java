package boardgame;

public abstract class Piece {
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

    public abstract boolean[][] possibleMoves();

    public boolean possibleMove (Position position){
        return possibleMoves()[position.getRow()][position.getColumn()];
    }
    public boolean isThereAnyPossibleMove() {
        boolean[][] mat = possibleMoves();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j]) {
                    return true;
                }
            }

        }
        return false;
    }

}
