package tictactoegame.models;

import java.util.List;

public class Game {
    private Board board;
    private List<Player> player;
    private List<Move> moves;
    private Player winner;
    private int nextPlayerMoveIndex;

    public Game(Board board, List<Player> player, List<Move> moves, Player winner, int nextPlayerMoveIndex) {
        this.board = board;
        this.player = player;
        this.moves = moves;
        this.winner = winner;
        this.nextPlayerMoveIndex = nextPlayerMoveIndex;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayer() {
        return player;
    }

    public void setPlayer(List<Player> player) {
        this.player = player;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public int getNextPlayerMoveIndex() {
        return nextPlayerMoveIndex;
    }

    public void setNextPlayerMoveIndex(int nextPlayerMoveIndex) {
        this.nextPlayerMoveIndex = nextPlayerMoveIndex;
    }
}
