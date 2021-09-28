package levels;
import elements.*;
import your_code.Gameplay;

public class Level15 implements Level {

	public void load(World world, Player player) {
		Entity[][] grid = world.getGrid();
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 5; j++) {
				if (Math.random() < 0.8 || i == 0 || nearWall(grid, i, j))
					world.add(new Key(), i, j);
				else
					world.add(new Wall(), i, j);
			}
		}
		world.add(player, 0, 0);
		
		world.add(new Door(), 6, 5);
		world.add(new Wall(), 6, 4);
		world.add(new Wall(), 7, 4);
		world.add(new Enemy(), 7, 5);	
	}
	
	private boolean nearWall(Entity[][] grid, int i, int j) {
		
		return grid[i - i==0?0:1][j] instanceof Wall || grid[i + i==7?0:1][j] instanceof Wall || grid[i][j - j==0?0:1] instanceof Wall || grid[i][j + j==4?0:1] instanceof Wall || grid[i + i==7?0:1][j + j==4?0:1] instanceof Wall || grid[i - i==0?0:1][j + j==4?0:1] instanceof Wall || grid[i + i==7?0:1][j - j==0?0:1] instanceof Wall || grid[i - i==0?0:1][j - j==0?0:1] instanceof Wall;
		
	}

	@Override
	public void runPlayerCommands(Player player) {
		Gameplay.solveLevel15(player);		
	}
	
}
