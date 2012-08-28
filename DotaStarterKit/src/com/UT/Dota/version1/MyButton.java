package com.UT.Dota.version1;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MyButton extends LinearLayout
{
	 private ImageView iv;  
	    private TextView  tv;  
	  
	    public MyButton(Context context) {  
	        this(context, null);  
	    }  
	  
	    public MyButton(Context context, AttributeSet attrs) {  
	        super(context, attrs);  
	        // 导入布局   
	        LayoutInflater.from(context).inflate(R.layout.button, this, true);  
	        iv = (ImageView) findViewById(R.id.iv);  
	        tv = (TextView) findViewById(R.id.tv);  
	  
	    }  
	  
	    /** 
	     * 设置图片资源 
	     */  
	    public void setImageResource(int resId) {  
	        iv.setImageResource(resId);  
	    }  
	  
	    /** 
	     * 设置显示的文字 
	     */  
	    public void setTextViewText(String text) {  
	        tv.setText(text);  
	    }  
}
