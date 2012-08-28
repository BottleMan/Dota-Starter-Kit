package com.UT.Dota.version1;

import android.app.Activity;
import android.os.Bundle;

public class DetailActivity extends Activity 
{
	
	private int index;
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        
        index = getIntent().getIntExtra("heroindex", 0);
        index = 1;
        int id = getResources().getIdentifier(getPackageName() + ":array/hero" + index, null, null);
        
        String[] strings = null;
        strings = getResources().getStringArray(id);
    }

    private void setView(){
    	
    }
    
    private void setList(){
    	
    }
    
}