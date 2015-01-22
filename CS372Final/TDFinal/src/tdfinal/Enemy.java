package tdfinal;

import java.awt.*;

public class Enemy extends Rectangle {
	public int xCoord, yCoord;
	public int eWalk;
	public int up = 0, down = 1, right = 2, left = 3;
	public int dir = down;
	public int xSize = 30;
	public int ySize = 38;
	public int enemyID = Values.enemyAir;
	
	public boolean isAlive = false;

	public Enemy() {
		
	}
	
	public void Create(int enemyID) {
		for(int i = 0; i < Screen.manager.world.length; i++) {
			if(Screen.manager.world[0][i].trackID == 0)
			setBounds(Screen.manager.world[0][i].x, Screen.manager.world[0][i].y, xSize, ySize);
			xCoord = x;
			yCoord = 0;
		}
		this.enemyID = enemyID;
		isAlive = true;
	}
	
	public int moveFrame = 0, moveSpeed = 20;
	public void move() {
		if(moveFrame >= moveSpeed) {
			if(dir == down)	
				y += 1;
			else if(dir == right)
				x += 1;
			else if(dir == up)
				y -= 1;
			else if(dir == left)
				x -= 1;
			moveFrame = 0;
		}			
		else
			moveFrame += 1;
			
	}
	
	public void draw(Graphics g) {
		if(isAlive) {
			g.drawImage(Screen.tileset_enemies[enemyID], x, y, width, height, null);
		}
	}
}
