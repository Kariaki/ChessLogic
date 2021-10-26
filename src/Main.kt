var board: MutableList<BoardSquare> = mutableListOf()

fun main() {

    val range = 0..7

    var count = 0

    for (i in range) {
        for (j in range) {
            if (isOdd(i))
                oddEven(i, j, count)
            else
                evenOdd(i, j, count)

            count++
        }

    }

    board.stream().forEach {
        println(it)
    }


}

fun getSquareNames(position: Int): String {

    val a = charArrayOf('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h')
    val rank = 8 - (position / 8)
    val file = position % 8
    return "${a[file]}${rank}"


}

fun oddEven(i: Int, j: Int, count: Int) {

    val squareName = getSquareNames(count)
    val chessPiece = if (i == 1) {
        ChessPiece(Position(i, j), PieceType.PAWN, PieceColor.WHITE)
    } else if (i == 6) {

        ChessPiece(Position(i, j), PieceType.PAWN, PieceColor.BLACK)
    } else {

        null
    }

    val boardSquare = if (isOdd(j)) {
        BoardSquare(squareColor = SquareColor.WHITE, squareName = squareName, chessPiece = chessPiece)
    } else {
        BoardSquare(squareColor = SquareColor.BLACK, squareName = squareName, chessPiece = chessPiece)
    }

    board.add(boardSquare)
}

fun evenOdd(i: Int, j: Int, count: Int) {

    val squareName = getSquareNames(count)
    val chessPiece = if (i == 1) {
        ChessPiece(Position(i, j), PieceType.PAWN, PieceColor.WHITE)
    } else if (i == 6) {

        ChessPiece(Position(i, j), PieceType.PAWN, PieceColor.BLACK)
    } else {

        null
    }
    val boardSquare = if (isOdd(j)) {
        BoardSquare(squareColor = SquareColor.BLACK, squareName = squareName, chessPiece = chessPiece)

    } else {
        BoardSquare(squareColor = SquareColor.WHITE, squareName = squareName, chessPiece = chessPiece)
    }

    board.add(boardSquare)

}

fun isOdd(value: Int): Boolean = value % 2 != 0