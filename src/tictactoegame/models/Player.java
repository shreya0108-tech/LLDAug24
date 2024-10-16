package tictactoegame.models;

public class Player {
    private PlayerType playerType;
    private Symbol symbol;
    private String name;
    private Long id;

    public Player(PlayerType playerType, Symbol symbol, String name, Long id) {
        this.playerType = playerType;
        this.symbol = symbol;
        this.name = name;
        this.id = id;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
