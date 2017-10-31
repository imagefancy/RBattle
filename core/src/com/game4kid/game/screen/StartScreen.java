package com.game4kid.game.screen;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.ImageButton;
import com.badlogic.gdx.scenes.scene2d.utils.TextureRegionDrawable;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.game4kid.game.Constants;

/**
 * Created by xiaojun on 2017/10/31.
 */

public class StartScreen implements Screen {

    private static final String TAG = StartScreen.class.getName();

    private Game game;
    private Stage stage;

    //背景图片
    Image backgroundPicture;


    //游戏名字
    Image gameNamePicture;

    //打包图片
    TextureAtlas atlas;

    //“开始游戏”“游戏选项”按钮按钮
    ImageButton gameStartBtn;
    ImageButton optionsBtn;

    //构造函数，入参为Game
    public StartScreen(final Game game) {
        this.game = game;

        stage = new Stage(new ScreenViewport());


        //加载背景图
        backgroundPicture = new Image(new Texture(Gdx.files.internal(Constants.PicturePath.START_SCREEN_BACKGROUND_PICTURE_PATH)));
        backgroundPicture.setPosition(0, 0);
        //backgroundPicture.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        backgroundPicture.setZIndex(Integer.parseInt(Constants.Zindex.BACKGROUND_PICTURE_Z_INDEX));
        stage.addActor(backgroundPicture);

        //加载打包图片
        atlas = new TextureAtlas(Gdx.files.internal(Constants.PicturePath.START_SCREEN_ATLAS_PATH));
        //添加游戏名字图片
        gameNamePicture = new Image(new TextureAtlas.AtlasRegion(atlas.findRegion(Constants.PicturePath.START_SCREEN_GAME_NAME)));
        gameNamePicture.setPosition(Gdx.graphics.getWidth() * 3 / 4 - gameNamePicture.getWidth() / 2, Gdx.graphics.getHeight() * 3 / 4 - gameNamePicture.getHeight() / 2);
        gameNamePicture.setZIndex(Integer.parseInt(Constants.Zindex.START_SCREEN_GAME_NAME_PICTURE_Z_INDEX));
        stage.addActor(gameNamePicture);

        //加入“开始游戏”按钮 和 “游戏选项按钮”
        gameStartBtn = new ImageButton(new TextureRegionDrawable(atlas.findRegion(Constants.PicturePath.START_SCREEN_START_GAME_BTN_UP)),
                                       new TextureRegionDrawable(atlas.findRegion(Constants.PicturePath.START_SCREEN_START_GAME_BTN_DOWN)));
        gameStartBtn.setPosition(Gdx.graphics.getWidth() * 3 / 4 - gameStartBtn.getWidth() / 2, Gdx.graphics.getHeight() * 2 / 6 - gameStartBtn.getHeight() / 2);
        gameStartBtn.setZIndex(Integer.parseInt(Constants.Zindex.START_SCREEN_GAME_START_BTN_PICTURE_Z_INDEX));
        gameStartBtn.addListener(new InputListener(){
            @Override
            public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
                //切换去游戏界面
                /*game.setScreen(xxxxx);*/
            }

            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                return true;
            }
        });
        stage.addActor(gameStartBtn);

        optionsBtn = new ImageButton(new TextureRegionDrawable(atlas.findRegion(Constants.PicturePath.START_SCREEN_OPTIONS_BTN_UP)),
                                        new TextureRegionDrawable(atlas.findRegion(Constants.PicturePath.START_SCREEN_OPTIONS_BTN_DOWN)));
        optionsBtn.setPosition(Gdx.graphics.getWidth() * 3 / 4 - optionsBtn.getWidth() / 2, Gdx.graphics.getHeight() * 1 / 6 - optionsBtn.getHeight() / 2);
        optionsBtn.setZIndex(Integer.parseInt(Constants.Zindex.START_SCREEN_OPTIONS_Z_INDEX));
        optionsBtn.addListener(new InputListener(){
            @Override
            public void touchUp(InputEvent event, float x, float y, int pointer, int button) {
                //切换去选项界面
               game.setScreen(new OptionScreen(game));
            }

            @Override
            public boolean touchDown(InputEvent event, float x, float y, int pointer, int button) {
                return true;
            }
        });
        stage.addActor(optionsBtn);

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
