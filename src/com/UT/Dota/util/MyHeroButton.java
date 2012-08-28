package com.UT.Dota.util;

import org.anddev.andengine.engine.Engine;
import org.anddev.andengine.entity.scene.Scene;
import org.anddev.andengine.entity.sprite.Sprite;
import org.anddev.andengine.entity.text.Text;
import org.anddev.andengine.opengl.font.Font;
import org.anddev.andengine.opengl.font.FontFactory;
import org.anddev.andengine.opengl.texture.Texture;
import org.anddev.andengine.opengl.texture.TextureOptions;
import org.anddev.andengine.opengl.texture.region.TextureRegion;
import org.anddev.andengine.opengl.texture.region.TextureRegionFactory;

import android.R.color;
import android.content.Context;
import android.graphics.Color;

public class MyHeroButton
{
	private Engine mEngine;
	private Scene mScene;
	private Context mContext;
	
	private Texture mTexture;
	private TextureRegion mTextureRegion;
	private Sprite mSprite;
	
	private Texture mfonTexture;
	private Font mFont;
	private Text mText;
	
	private String imageUrlString;
	private String heroNameString;
	
	public MyHeroButton(Context pContext, Engine mEngine, String imageUrlString)
	{
		this.mContext = pContext;
		this.mEngine = mEngine;
		this.imageUrlString = imageUrlString;
		
		//设置名称显示的字体纹理
		mfonTexture = new Texture(128, 128, TextureOptions.DEFAULT);
		mFont = FontFactory.createFromAsset(mfonTexture, mContext, "font/hero_font.ttf", 32, true, Color.WHITE);
		
		//头像的大小都是45*45
		mTexture = new Texture(64, 64, TextureOptions.DEFAULT);
		TextureRegionFactory.setAssetBasePath("gfx/");
		mTextureRegion = TextureRegionFactory.createFromAsset(mTexture, mContext, imageUrlString, 0, 0);
		this.mEngine.getTextureManager().loadTexture(mTexture);
		
	}
	
	public void showToScene(Scene scene, int pX, int pY)
	{
		mSprite = new Sprite(pX, pY, mTextureRegion);
		scene.getTopLayer().addEntity(mSprite);
		
	}

}
