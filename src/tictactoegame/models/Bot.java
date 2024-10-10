package tictactoegame.models;

public class Bot extends Player{
    BotDifficultyLevel botDifficultyLevel;

    public Bot(BotDifficultyLevel botDifficultyLevel,Symbol symbol, String name, Long id) {
            super(PlayerType.bot,symbol,name,id);
            this.botDifficultyLevel = botDifficultyLevel;
    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }
}
