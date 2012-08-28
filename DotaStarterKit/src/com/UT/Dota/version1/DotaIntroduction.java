package com.UT.Dota.version1;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;



public class  DotaIntroduction extends Activity 
{
	private TextView dota1;
	private TextView jianjie;
	private TextView tese;
	private TextView jianshi;
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jj);
        dota1 = (TextView)  findViewById(R.id.dota);
        String str0 = getString(R.string.dotajj);
        dota1.setText(Html.fromHtml(str0));
        
        jianjie = (TextView)  findViewById(R.id.jianjie);
        String str1 = getString(R.string.jianjie);
        jianjie.setText(Html.fromHtml(str1));
        
        tese = (TextView)  findViewById(R.id.tese);
        String str2 = getString(R.string.tese);
        tese.setText(Html.fromHtml(str2));
        
        jianshi = (TextView)  findViewById(R.id.jianshi);
        String str3 = getString(R.string.jianshi);
        jianshi.setText(Html.fromHtml(str3));
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
    		startActivity(new Intent(DotaIntroduction.this,
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
    	new AlertDialog.Builder(DotaIntroduction.this)
    			.setTitle(R.string.quit_title)
    			.setMessage(R.string.quit_msg)
    			.setPositiveButton(R.string.ok_label,
    					new DialogInterface.OnClickListener()
    					{
    						public void onClick(
    								DialogInterface dialoginterface, int i)
    						{
    							ActivityManager am = (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);

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
