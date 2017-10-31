package com.game4kid.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;
import com.badlogic.gdx.utils.Disposable;

/**
 * Created by xiaojun on 2017/10/31.
 */
//这是是MVC中的Model
public class GameData{
    public Preferences preferences;

    //
    public String gameVersion;

    //构造函数
    public GameData(){
        preferences = Gdx.app.getPreferences();
    }
}
