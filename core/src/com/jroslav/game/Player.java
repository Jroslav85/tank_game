package com.jroslav.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;

public class Player {

	public Vector2 vectorPlayer;
	public Sprite spritePlayer;
	
	public Player(Texture img) {
		spritePlayer = new Sprite(img);
	}
}
