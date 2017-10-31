package com.game4kid.game.screen;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.game4kid.game.Constants;

import javax.swing.text.html.Option;

/**
 * Created by xiaojun on 2017/10/31.
 */

public class OptionScreen implements Screen {
    private Game game;
    private Stage stage;
    private Image backgroundPicture;

    public OptionScreen(Game game){
        this.game = game;

        //增加背景图片
        backgroundPicture = new Image(new Texture(Gdx.files.internal(Constants.PicturePath.OPTIONS_SCREEN_BACKGROUND_PICTURE_PATH)));
        backgroundPicture.setPosition(0,0);
        backgroundPicture.setZIndex(Integer.parseInt(Constants.Zindex.BACKGROUND_PICTURE_Z_INDEX));
        stage.addActor(backgroundPicture);

        //增加“确认按钮”，“取消”按钮

    }

    @Override
    public void dispose() {
        stage.dispose();
    }

    @Override
    public void hide() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void render(float delta) {
        stage.act();
        stage.draw();
    }

    @Override
    public void show() {
        //舞台放入输入处理
        Gdx.input.setInputProcessor(stage);
    }
}
