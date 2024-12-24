package entity.piece.impl;

import entity.board.Block;
import entity.board.Board;
import entity.piece.Piece;

//Knight== Ghoda
public class Knight extends Piece {
    public Knight(boolean white) {
        super(white);
    }
    public boolean canMove(Board board, Block startBlock, Block endBlock) {
        return false;
    }
}