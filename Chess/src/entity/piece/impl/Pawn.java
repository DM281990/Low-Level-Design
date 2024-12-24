package entity.piece.impl;

import entity.board.Block;
import entity.board.Board;
import entity.piece.Piece;

public class Pawn extends Piece {
    public Pawn(boolean white) {
        super(white);
    }
    public boolean canMove(Board board, Block startBlock, Block endBlock) {
        return false;
    }
}