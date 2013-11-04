package org.semadevelopment.farmadventure.game;

public class FarmPlots {
	private FarmPlot[][] plots;
	private int width;
	private int height;
	
	public FarmPlots(int height, int width)
	{
		this.width = width;
		this.height = height;
		
		plots = new FarmPlot[height][width];
		
		for(int i = 0; i < height; i++)
		{
			for(int j = 0; j < width; j++)
			{
				plots[i][j] = new FarmPlot();
			}
		}
	}
	
	public FarmPlot getPlot(int x, int y) {
		return plots[x][y];
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
}
