package org.semadevelopment.farmadventure.game;

import org.semadevelopment.farmadventure.game.items.Item;
import org.semadevelopment.farmadventure.game.items.Plantable;
import org.semadevelopment.farmadventure.game.items.Upgrade;
import org.semadevelopment.farmadventure.game.workers.Worker;

public class FarmState {
	private FarmType farmType;
	private Season season;
	private float timeLeft;
	private int currentScore;
	private int stage; // What 'stage' of the farm - 1 of 4, for example
	private Plantable[] plantables;
	private Upgrade[] upgrades;
	private Worker[] workers;
	private Irrigation[] irrigation;
	private FarmPlots farmPlots;
}
