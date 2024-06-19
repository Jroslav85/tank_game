package com.jroslav.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class TanksGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture imgPlayer;
	Player player;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		createPlayer();
	}

	@Override
	public void render () {
		ScreenUtils.clear(0.1f, 0.1f, 0, 1);
		batch.begin();
		batch.draw(imgPlayer, 0, 0);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		imgPlayer.dispose();
	}
	
	private void createPlayer() {
		imgPlayer = new Texture("player.png");
		player = new Player(imgPlayer);
	}
}
