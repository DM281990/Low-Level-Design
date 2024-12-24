package entity.piece.impl;

import entity.board.Block;
import entity.board.Board;
import entity.piece.Piece;

//Rook== Haathi
public class Rook extends Piece {
    public Rook(boolean white) {
        super(white);
    }
    public boolean canMove(Board board, Block startBlock, Block endBlock) {
        return false;
    }
}