package uk.samani.game.entities;

import uk.samani.game.InputHandler;
import uk.samani.game.level.Level;

public class PlayerMP extends Player{

	public PlayerMP(Level level, int x, int y, InputHandler input,
			String username) {
		super(level, x, y, input, username);
	}

}
