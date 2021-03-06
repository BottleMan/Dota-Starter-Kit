﻿package com.UT.Dota.version1;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class HeroActivity extends Activity
{
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hero);

		((ImageButton) findViewById(R.id.button4))
				.setOnClickListener(new OnClickListener()
				{
					public void onClick(View v)
					{
						startActivity(new Intent(HeroActivity.this,
								JwActivity.class));

					}
				});

		((ImageButton) findViewById(R.id.button5))
				.setOnClickListener(new OnClickListener()
				{
					public void onClick(View v)
					{
						startActivity(new Intent(HeroActivity.this,
								TzActivity.class));

					}
				});

	}
	private static final int MENU_ABOUT = Menu.FIRST;
	private static final int MENU_Quit = Menu.FIRST + 1;

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// TODO Auto-generated method stub
		super.onCreateOptionsMenu(menu);
		menu.add(0, MENU_ABOUT, 0, R.string.menu_about).setIcon(
				android.R.drawable.ic_menu_help);
		menu.add(0, MENU_Quit, 0, R.string.menu_quit).setIcon(
				android.R.drawable.ic_menu_close_clear_cancel);
		return super.onCreateOptionsMenu(menu);
	}

	public boolean onOptionsItemSelected(MenuItem item)
	{
		// TODO Auto-generated method stub
		switch (item.getItemId())
		{
		case MENU_ABOUT:
			startActivity(new Intent(HeroActivity.this,
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
		new AlertDialog.Builder(HeroActivity.this)
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
								// TODO Auto-generated method stub
								dialoginterface.cancel();
							}
						}).show();
	}
}