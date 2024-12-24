package entity.piece.impl;

import entity.board.Block;
import entity.board.Board;
import entity.piece.Piece;

public class King extends Piece {
    public King(boolean white) {
        super(white);
    }
    public boolean canMove(Board board, Block startBlock, Block endBlock) {
        //logic
        return false;
    }
}
