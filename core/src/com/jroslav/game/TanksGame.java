package com.jroslav.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.ScreenUtils;

public class TanksGame extends ApplicationAdapter {
	Texture imgPlayer;
	Player player;
	private OrthographicCamera camera;
	private SpriteBatch batch;

	@Override
	public void create() {
		batch = new SpriteBatch();
		createPlayer();
		camera = new OrthographicCamera();
		camera.setToOrtho(false, 640, 480);
	}

	@Override
	public void render() {
		ScreenUtils.clear(0.1f, 0.1f, 0.01f, 1);
		camera.update();
		batch.setProjectionMatrix(camera.combined);
		
		batch.begin();
		player.draw(batch);
		batch.end();
		   

	}

	@Override
	public void dispose() {
		batch.dispose();
		imgPlayer.dispose();
	}

	private void createPlayer() {
		imgPlayer = new Texture("player.png");
		player = new Player(imgPlayer);
	}
}
