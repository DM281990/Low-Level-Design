package entity.piece.impl;

import entity.board.Block;
import entity.board.Board;
import entity.piece.Piece;
// Bishop = diagonal
public class Bishop extends Piece {
    public Bishop(boolean white) {
        super(white);
    }
    public boolean canMove(Board board, Block startBlock, Block endBlock) {
        return false;
    }
}