package com.chess.kchess

import ChessPiece
import Color.PieceColor

object PieceMoves {


    const val MAX = 7
    const val MIN = 0


    fun pawnPosibleMoves(chessPiece: ChessPiece): MutableList<Int> {

        val posibleMoves = mutableListOf<Int>()
        val position = chessPiece.position
        val x = position.x
        val y = position.y
        if (chessPiece.pieceColor == PieceColor.BLACK) {

            if (y == MAX - 1) {
                posibleMoves.add(y - 1)
                posibleMoves.add(y - 2)
            } else if (y < MAX - 1 && y > MIN) {

                posibleMoves.add(y - 1)
            }

        } else {

        }




        return posibleMoves
    }
}