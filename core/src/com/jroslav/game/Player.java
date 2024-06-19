package com.jroslav.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Player {

	public Vector2 positionPlayer;
	public Sprite spritePlayer;
	private int speed = 250;
	private float angle = 0f;

	public Player(Texture img) {
		spritePlayer = new Sprite(img);
		positionPlayer = new Vector2(Gdx.graphics.getWidth() / 2,
				spritePlayer.getHeight() / 2);
	}

	public void draw(SpriteBatch batch) {
		update(Gdx.graphics.getDeltaTime());
		spritePlayer.setPosition(positionPlayer.x, positionPlayer.y);
		spritePlayer.draw(batch);
	}

	public void update(float deltaTime) {
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if (Gdx.input.isKeyPressed(Keys.W)) {
			if (spritePlayer.getRotation() == 0f || spritePlayer.getRotation() == 360f) {
				positionPlayer.y += deltaTime * speed;
			}
			if (spritePlayer.getRotation() == 90f) {
				positionPlayer.x -= deltaTime * speed;
			}
			if (spritePlayer.getRotation() == 180f) {
				positionPlayer.y -= deltaTime * speed;
			}
			if (spritePlayer.getRotation() == 270f) {
				positionPlayer.x += deltaTime * speed;
			}
		}
		if (Gdx.input.isKeyPressed(Keys.S)) {
			if (spritePlayer.getRotation() == 0f || spritePlayer.getRotation() == 360f) {
				positionPlayer.y -= deltaTime * speed;
			}
			if (spritePlayer.getRotation() == 90f) {
				positionPlayer.x += deltaTime * speed;
			}
			if (spritePlayer.getRotation() == 180f) {
				positionPlayer.y += deltaTime * speed;
			}
			if (spritePlayer.getRotation() == 270f) {
				positionPlayer.x -= deltaTime * speed;
			}
		}

		if (Gdx.input.isKeyPressed(Keys.A)) {
			if (spritePlayer.getRotation() == 360f) {
				spritePlayer.setRotation(0f);
			}
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			spritePlayer.rotate(90f);
		}
		if (Gdx.input.isKeyPressed(Keys.D)) {
			if (spritePlayer.getRotation() == 0f) {
				spritePlayer.setRotation(360f);
			}
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			spritePlayer.rotate(-90f);
		}
		System.out.println(spritePlayer.getRotation());
	}

}
