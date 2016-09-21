package snake;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class RenderPanel extends JPanel {
	public static int curColor = 0;
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		Snake snake = Snake.snake;
		super.paintComponent(g);
		g.setColor(new Color(curColor));
		g.fillRect(0, 0, snake.width, snake.height);
		
		curColor++;
		
		
		g.setColor(Color.GREEN);
		for (Point point : snake.snakeParts) {
			g.fillRect(point.x * snake.SCALE, point.y * snake.SCALE, snake.SCALE, snake.SCALE);
		}
		g.setColor(Color.RED);
		g.fillRect(snake.cherry.x * snake.SCALE, snake.cherry.y * snake.SCALE, snake.SCALE, snake.SCALE);
		g.drawString("level " + snake.level +" score: " + snake.score, 150,20);//snake.dim.width/2,  snake.dim.height /2);
	}
}
