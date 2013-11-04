package org.semadevelopment.farmadventure.game.save;

import org.semadevelopment.farmadventure.game.FarmState;
import org.semadevelopment.farmadventure.game.items.Item;
import org.semadevelopment.farmadventure.game.scoring.FarmScore;

public class GameSave {
	private FarmScore[] farmScores;
	private FarmState currentLevel;
	private Item[] unlockedItems;
	
	public FarmScore[] getFarmScores() {
		return farmScores;
	}
	public void setFarmScores(FarmScore[] farmScores) {
		this.farmScores = farmScores;
	}
	public FarmState getCurrentLevel() {
		return currentLevel;
	}
	public void setCurrentLevel(FarmState currentLevel) {
		this.currentLevel = currentLevel;
	}
	public Item[] getUnlockedItems() {
		return unlockedItems;
	}
	public void setUnlockedItems(Item[] unlockedItems) {
		this.unlockedItems = unlockedItems;
	}
}
