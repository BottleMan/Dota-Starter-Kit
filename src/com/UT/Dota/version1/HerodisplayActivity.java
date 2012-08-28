package com.UT.Dota.version1;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.text.Html;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ant.liao.GifView;

public class HerodisplayActivity extends Activity
{
	private GifView gif;
	private TextView nameTextView;
	private TextView liliangTextView;
	private TextView minjieTextView;
	private TextView zhiliTextView;
	private TextView initialTextView;
	private TextView locationTextView;
	private TextView skill1;
	private TextView skill2;
	private TextView skill3;
	private TextView skill4;
	// private TextView skill5;
	private ImageView skillImage1;
	private ImageView skillImage2;
	private ImageView skillImage3;
	private ImageView skillImage4;

	Bitmap bmp1 = null;
	Bitmap bmp2 = null;
	Bitmap bmp3 = null;
	Bitmap bmp4 = null;

	// private ImageView skillImage5;

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.herodisplay);

		/****** 接收 *********/
		Intent intent = getIntent();

		Bundle bundle0 = intent.getExtras();
		Bundle bundle1 = intent.getExtras();
		Bundle bundle2 = intent.getExtras();
		Bundle bundle3 = intent.getExtras();
		Bundle bundle4 = intent.getExtras();
		Bundle bundle5 = intent.getExtras();
		Bundle bundle6 = intent.getExtras();
		Bundle bundle7 = intent.getExtras();
		Bundle bundle8 = intent.getExtras();
		Bundle bundle9 = intent.getExtras();
		Bundle bundle10 = intent.getExtras();
		// Bundle bundle11 = intent.getExtras();
		Bundle bundle12 = intent.getExtras();
		Bundle bundle13 = intent.getExtras();
		Bundle bundle14 = intent.getExtras();
		Bundle bundle15 = intent.getExtras();
		// Bundle bundle16 = intent.getExtras();

		int ID0 = bundle0.getInt("ID0");
		int ID1 = bundle1.getInt("ID1");
		int ID2 = bundle2.getInt("ID2");
		int ID3 = bundle3.getInt("ID3");
		int ID4 = bundle4.getInt("ID4");
		int ID5 = bundle5.getInt("ID5");
		int ID6 = bundle6.getInt("ID6");
		int ID7 = bundle7.getInt("ID7");
		int ID8 = bundle8.getInt("ID8");
		int ID9 = bundle9.getInt("ID9");
		int ID10 = bundle10.getInt("ID10");
		// int ID11 = bundle11.getInt("ID11");
		int ID12 = bundle12.getInt("ID12");
		int ID13 = bundle13.getInt("ID13");
		int ID14 = bundle14.getInt("ID14");
		int ID15 = bundle15.getInt("ID15");
		// int ID16 = bundle16.getInt("ID16");

		gif = (GifView) findViewById(R.id.hero_portrait);
		nameTextView = (TextView) findViewById(R.id.hero_name);
		liliangTextView = (TextView) findViewById(R.id.hero_liliang);
		minjieTextView = (TextView) findViewById(R.id.hero_minjie);
		zhiliTextView = (TextView) findViewById(R.id.hero_zhili);
		initialTextView = (TextView) findViewById(R.id.hero_initial_quality);
		locationTextView = (TextView) findViewById(R.id.hero_location);
		skill1 = (TextView) findViewById(R.id.hero_skill_descript1);
		skill2 = (TextView) findViewById(R.id.hero_skill_descript2);
		skill3 = (TextView) findViewById(R.id.hero_skill_descript3);
		skill4 = (TextView) findViewById(R.id.hero_skill_descript4);
		// skill5 = (TextView) findViewById(R.id.hero_skill_descript5);
		skillImage1 = (ImageView) findViewById(R.id.hero_skill_image1);
		skillImage2 = (ImageView) findViewById(R.id.hero_skill_image2);
		skillImage3 = (ImageView) findViewById(R.id.hero_skill_image3);
		skillImage4 = (ImageView) findViewById(R.id.hero_skill_image4);
		// skillImage5 = (ImageView) findViewById(R.id.hero_skill_image5);

		String string = getString(ID0);
		nameTextView.setText(Html.fromHtml(string));

		gif.setGifImage(ID1);
		liliangTextView.setText(ID2);
		minjieTextView.setText(ID3);
		zhiliTextView.setText(ID4);

		string = getString(ID5);
		initialTextView.setText(Html.fromHtml(string));

		string = getString(ID6);
		locationTextView.setText(Html.fromHtml(string));

		string = getString(ID7);
		skill1.setText(Html.fromHtml(string));

		string = getString(ID8);
		skill2.setText(Html.fromHtml(string));

		string = getString(ID9);
		skill3.setText(Html.fromHtml(string));

		string = getString(ID10);
		skill4.setText(Html.fromHtml(string));

		// string = getString(ID11);
		// skill5.setText(Html.fromHtml(string));

		/*
		 * // Options 只保存图片尺寸大小，不保存图片到内存 
		 * 
		 * BitmapFactory.Options opts = new BitmapFactory.Options();
		 * 缩放的比例，缩放是很难按准备的比例进行缩放的，其值表明缩放的倍数，SDK中建议其值是2的指数值,值越大会导致图片不清晰
		 * 
		 * opts.inSampleSize = 4;
		 */

		// 获取位图

		bmp1 = BitmapFactory.decodeResource(getResources(), ID12);
		// 转换为BitmapDrawable对象
		BitmapDrawable bmpDraw = new BitmapDrawable(bmp1);
		// 显示位图
		skillImage1.setImageDrawable(bmpDraw);

		bmp2 = BitmapFactory.decodeResource(getResources(), ID13);
		// 转换为BitmapDrawable对象
		bmpDraw = new BitmapDrawable(bmp2);
		// 显示位图
		skillImage2.setImageDrawable(bmpDraw);

		bmp3 = BitmapFactory.decodeResource(getResources(), ID14);
		// 转换为BitmapDrawable对象
		bmpDraw = new BitmapDrawable(bmp3);
		// 显示位图
		skillImage3.setImageDrawable(bmpDraw);

		bmp4 = BitmapFactory.decodeResource(getResources(), ID15);
		// 转换为BitmapDrawable对象
		bmpDraw = new BitmapDrawable(bmp4);
		// 显示位图
		skillImage4.setImageDrawable(bmpDraw);

		/*
		 * skillImage1.setBackgroundResource(ID12);
		 * skillImage2.setBackgroundResource(ID13);
		 * skillImage3.setBackgroundResource(ID14);
		 * skillImage4.setBackgroundResource(ID15);
		 */
		// skillImage5.setBackgroundResource(ID16);
	}

	@Override
	protected void onDestroy()
	{
		super.onDestroy();
		unbindDrawables(findViewById(R.id.hero_display));
		System.gc();
	}

	private void unbindDrawables(View view)
	{
		if (view.getBackground() != null)
		{
			view.getBackground().setCallback(null);
		}
		if (view instanceof ViewGroup)
		{
			for (int i = 0; i < ((ViewGroup) view).getChildCount(); i++)
			{
				unbindDrawables(((ViewGroup) view).getChildAt(i));
			}
			((ViewGroup) view).removeAllViews();
		}
	}

	private static final int MENU_ABOUT = Menu.FIRST;
	private static final int MENU_Quit = Menu.FIRST + 1;

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		super.onCreateOptionsMenu(menu);
		menu.add(0, MENU_ABOUT, 0, R.string.menu_about).setIcon(
				android.R.drawable.ic_menu_help);
		menu.add(0, MENU_Quit, 0, R.string.menu_quit).setIcon(
				android.R.drawable.ic_menu_close_clear_cancel);
		return super.onCreateOptionsMenu(menu);
	}

	public boolean onOptionsItemSelected(MenuItem item)
	{
		switch (item.getItemId())
		{
		case MENU_ABOUT:
			startActivity(new Intent(HerodisplayActivity.this,
					AboutActivity.class));
			break;
		case MENU_Quit:
			openOptionsDialog();
			break;
		}
		return super.onOptionsItemSelected(item);
	}

	private void openOptionsDialog()
	{
		new AlertDialog.Builder(HerodisplayActivity.this)
				.setTitle(R.string.quit_title)
				.setMessage(R.string.quit_msg)
				.setPositiveButton(R.string.ok_label,
						new DialogInterface.OnClickListener()
						{
							public void onClick(
									DialogInterface dialoginterface, int i)
							{
								ActivityManager am = (ActivityManager)getSystemService (Context.ACTIVITY_SERVICE);

								am.restartPackage(getPackageName());
							}
						})
				.setNegativeButton(R.string.cancel_label,
						new DialogInterface.OnClickListener()
						{

							public void onClick(
									DialogInterface dialoginterface, int i)
							{
								dialoginterface.cancel();
							}
						}).show();
	}
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		
		//按下键盘上返回按钮
		if(keyCode == KeyEvent.KEYCODE_BACK){
			HerodisplayActivity.this.finish();
		}
		return true;
	}
}