package org.semadevelopment.farmadventure.game.scoring;

import org.semadevelopment.farmadventure.game.FarmType;
import org.semadevelopment.farmadventure.game.SeasonScore;

public class FarmScore {
	public FarmType getFarmType() {
		return farmType;
	}
	public void setFarmType(FarmType farmType) {
		this.farmType = farmType;
	}
	public int getOverallScore() {
		return overallScore;
	}
	public void setOverallScore(int overallScore) {
		this.overallScore = overallScore;
	}
	public SeasonScore[] getSeasonScores() {
		return seasonScores;
	}
	public void setSeasonScores(SeasonScore[] seasonScores) {
		this.seasonScores = seasonScores;
	}
	private FarmType farmType;
	private int overallScore;
	private SeasonScore[] seasonScores;
}
