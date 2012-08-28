package com.UT.Dota.version1;

import org.anddev.andengine.engine.Engine;
import org.anddev.andengine.engine.camera.Camera;
import org.anddev.andengine.engine.options.EngineOptions;
import org.anddev.andengine.engine.options.EngineOptions.ScreenOrientation;
import org.anddev.andengine.engine.options.resolutionpolicy.RatioResolutionPolicy;
import org.anddev.andengine.entity.scene.Scene;
import org.anddev.andengine.ui.activity.BaseGameActivity;

import android.content.Context;

import com.UT.Dota.config.Config;


public class SentinelHero extends BaseGameActivity
{
	
	Context context;

	public Engine onLoadEngine()
	{
		context = getApplicationContext();
		Camera mCamera = new Camera(0, 0, Config.CAMERA_WIDTH, Config.CAMERA_HEIGHT);
		Engine mEngine = new Engine(new EngineOptions(true, ScreenOrientation.PORTRAIT, new RatioResolutionPolicy(Config.CAMERA_WIDTH, Config.CAMERA_HEIGHT), mCamera));
		return mEngine;
	}

	public void onLoadResources()
	{
		// TODO Auto-generated method stub

	}

	public Scene onLoadScene()
	{
		// TODO Auto-generated method stub
//		LinearLayout linearLayout = new LinearLayout(context);
//		TabHost tabHost = new TabHost(context);
//		tabHost.
		
		return null;
	}

	public void onLoadComplete()
	{
		// TODO Auto-generated method stub

	}

}
