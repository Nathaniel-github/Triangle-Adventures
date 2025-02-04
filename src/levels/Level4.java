package levels;
import elements.*;
import your_code.Gameplay;

public class Level4 implements Level {

	@Override
	public void load(World world, Player player) {
		world.add(player, 1, 2);
		world.add(new Wall(), 3, 2);
		world.add(new Enemy(), 5, 2);
		world.add(new Gate(), 6, 2);
		world.add(new Lava(), 7, 2);
		world.add(new Lava(), 6, 1);
		world.add(new Lava(), 6, 3);
	}

	@Override
	public void runPlayerCommands(Player player) {
		Gameplay.solveLevel4(player);
	}

}
