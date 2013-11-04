package org.semadevelopment.farmadventure.game;

import org.semadevelopment.farmadventure.engines.audio.AudioEngine;
import org.semadevelopment.farmadventure.engines.graphics.GraphicsEngine;
import org.semadevelopment.farmadventure.engines.input.InputEngine;
import org.semadevelopment.farmadventure.game.configuration.Configuration;
import org.semadevelopment.farmadventure.game.marketplace.Marketplace;

public class FarmGame {
	private FarmState farmState;
	private InputEngine inputEngine;
	private AudioEngine audioEngine;
	private GraphicsEngine graphicsEngine;
	private Marketplace marketplace;
	private EventHandler eventHandler;
	private Configuration configuration;
}
