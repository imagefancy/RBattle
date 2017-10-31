package com.game4kid.game;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.game4kid.game.screen.StartScreen;

public class RBattle extends Game {

	private static final String TAG = RBattle.class.getName();

	//背景音乐
	Music bgmusic;

	@Override
	public void create () {
		//设置调试开关打开,打印级别为debug
		Gdx.app.setLogLevel(Application.LOG_DEBUG);

		bgmusic = Gdx.audio.newMusic(Gdx.files.internal(Constants.MusicAndEffectPath.BACKGROUND_MUSIC));
		bgmusic.setVolume(0.5f);
		bgmusic.setLooping(true);
		bgmusic.play();

		//转到StartScreen
		this.setScreen(new StartScreen(this));


	}

	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {
		bgmusic.dispose();
	}
}
