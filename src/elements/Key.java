package elements;
import java.awt.Color;
import java.awt.Graphics2D;

public class Key extends Entity {

	@Override
	public void draw(Graphics2D g, int x, int y, int width, int height) {
		Color prevColor = g.getColor();
		g.setColor(new Color(255, 188, 0));
		g.fillRect(x + width/4, y + height/4, width / 2, height /2);
		g.setColor(prevColor);
	}

}
