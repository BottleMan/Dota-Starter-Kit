package com.UT.Dota.version1;

import org.anddev.andengine.engine.Engine;
import org.anddev.andengine.engine.camera.Camera;
import org.anddev.andengine.engine.options.EngineOptions;
import org.anddev.andengine.engine.options.EngineOptions.ScreenOrientation;
import org.anddev.andengine.engine.options.resolutionpolicy.RatioResolutionPolicy;
import org.anddev.andengine.entity.scene.Scene;
import org.anddev.andengine.entity.scene.background.ColorBackground;
import org.anddev.andengine.entity.shape.IShape;
import org.anddev.andengine.entity.shape.modifier.DelayModifier;
import org.anddev.andengine.entity.shape.modifier.FadeInModifier;
import org.anddev.andengine.entity.shape.modifier.FadeOutModifier;
import org.anddev.andengine.entity.shape.modifier.IShapeModifier.IShapeModifierListener;
import org.anddev.andengine.entity.shape.modifier.MoveXModifier;
import org.anddev.andengine.entity.shape.modifier.ParallelShapeModifier;
import org.anddev.andengine.entity.shape.modifier.ScaleModifier;
import org.anddev.andengine.entity.shape.modifier.SequenceShapeModifier;
import org.anddev.andengine.entity.sprite.Sprite;
import org.anddev.andengine.opengl.texture.Texture;
import org.anddev.andengine.opengl.texture.TextureOptions;
import org.anddev.andengine.opengl.texture.region.TextureRegion;
import org.anddev.andengine.opengl.texture.region.TextureRegionFactory;
import org.anddev.andengine.ui.activity.BaseGameActivity;
import org.anddev.andengine.util.modifier.IModifier;
import org.anddev.andengine.util.modifier.ParallelModifier;

import android.content.Context;
import android.content.Intent;

public class SplashScreen extends BaseGameActivity
{
	/**
	 * Called when the activity is first created.
	 */

	final private static int CAMERA_WIDTH = 480;
	final private static int CAMERA_HEIGHT = 800;

	private Texture bgTexture;
	private Texture logoTexture;
	private Texture nameTexture;
	private TextureRegion bgTextureRegion;
	private TextureRegion logoTextureRegion;
	private TextureRegion nameTextureRegion;

	private Context context;

	public Engine onLoadEngine()
	{
		context = getApplicationContext();
		Camera mCamera = new Camera(0, 0, CAMERA_WIDTH, CAMERA_HEIGHT);
		Engine mEngine = new Engine(new EngineOptions(true, ScreenOrientation.PORTRAIT, new RatioResolutionPolicy(CAMERA_WIDTH, CAMERA_HEIGHT), mCamera));
		return mEngine;
	}

	public void onLoadResources()
	{
		bgTexture = new Texture(512, 1024, TextureOptions.DEFAULT);
		logoTexture = new Texture(512, 1024, TextureOptions.DEFAULT);
		nameTexture = new Texture(512, 1024, TextureOptions.DEFAULT);
		TextureRegionFactory.setAssetBasePath("gfx/");
		bgTextureRegion = TextureRegionFactory.createFromAsset(bgTexture, context, "splash_screen_bg.png", 0, 0);
		nameTextureRegion = TextureRegionFactory.createFromAsset(logoTexture, context, "splash_screen_name.png", 0, 0);
		logoTextureRegion = TextureRegionFactory.createFromAsset(nameTexture, context, "splash_screen_logo.png", 0, 0);

		mEngine.getTextureManager().loadTextures(bgTexture, logoTexture, nameTexture);

	}

	public Scene onLoadScene()
	{
		final Scene mScene = new Scene(1);
		mScene.setBackground(new ColorBackground(1, 1, 1, 0.5f));

		final Sprite bgSprite = new Sprite(0, 0, bgTextureRegion);
		mScene.getTopLayer().addEntity(bgSprite);

		//设置背景逐渐显现
		bgSprite.addShapeModifier(new SequenceShapeModifier(new IShapeModifierListener()
		{

			public void onModifierFinished(IModifier<IShape> pModifier, IShape pItem)
			{
				final Sprite logoSprite = new Sprite(-480, 0, logoTextureRegion);
				final Sprite nameSprite = new Sprite(480, 0, nameTextureRegion);
				mScene.getTopLayer().addEntity(nameSprite);
				mScene.getTopLayer().addEntity(logoSprite);

				//设置logo从左到右出现
				logoSprite.addShapeModifier(new SequenceShapeModifier(new IShapeModifierListener()
				{
					//当走到位置之后等待2.5f之后进入主界面
					public void onModifierFinished(IModifier<IShape> pModifier, IShape pItem)
					{
						Intent intent = new Intent(context, MainMenu.class);
						SplashScreen.this.startActivity(intent);
						overridePendingTransition(R.anim.zoomin, R.anim.zoomout);
						SplashScreen.this.finish();
					}
				}, 
				new MoveXModifier(1f, -480, 0), 
				new DelayModifier(4f)
				));

				//设置软件名字从右到左出现
				nameSprite.addShapeModifier(new SequenceShapeModifier(new IShapeModifierListener()
				{
					//当名字出现之后开始闪动
					public void onModifierFinished(IModifier<IShape> pModifier, IShape pItem)
					{

					}
				}, 
				new MoveXModifier(1f, 480, 0),
				new ParallelShapeModifier(new FadeOutModifier(1f), new ScaleModifier(1f, 1f, 0.99f)),
				new ParallelShapeModifier(new FadeInModifier(1f), new ScaleModifier(1f, 0.99f, 1f)),
				new ParallelShapeModifier(new FadeOutModifier(1f), new ScaleModifier(1f, 1f, 0.99f))
				));

			}
		}, new FadeInModifier(2f)));

		return mScene;
	}

	public void onLoadComplete()
	{

	}
}