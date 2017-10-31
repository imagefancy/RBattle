package com.game4kid.game;

/**
 * Created by xiaojun on 2017/10/31.
 */

public class Constants {
    public class PicturePath{
        //开始屏幕图片路径
        public static final String START_SCREEN_BACKGROUND_PICTURE_PATH = "startscreenbg.jpg";
        public static final String START_SCREEN_ATLAS_PATH = "startscreen.txt";
        public static final String START_SCREEN_GAME_NAME = "starscreen_game_name";
        public static final String START_SCREEN_START_GAME_BTN_UP = "starscreen_start_game_btn_up";
        public static final String START_SCREEN_START_GAME_BTN_DOWN = "starscreen_start_game_btn_down";
        public static final String START_SCREEN_OPTIONS_BTN_UP = "starscreen_options_btn_up";
        public static final String START_SCREEN_OPTIONS_BTN_DOWN = "starscreen_options_btn_down";

        //选项屏幕图片路径
        public static final String OPTIONS_SCREEN_BACKGROUND_PICTURE_PATH = "optionsscreenbg.png";
    }
    public class Zindex{
        //Z轴数值
        //在StartScreen中
        public static final String BACKGROUND_PICTURE_Z_INDEX = "100";
        public static final String START_SCREEN_GAME_NAME_PICTURE_Z_INDEX = "0";
        public static final String START_SCREEN_GAME_START_BTN_PICTURE_Z_INDEX = "0";
        public static final String START_SCREEN_OPTIONS_Z_INDEX = "0";
    }
    public class MusicAndEffectPath{
        public static final String BACKGROUND_MUSIC = "bgmusic.mp3";
    }
}
