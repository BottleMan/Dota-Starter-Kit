package com.UT.Dota.version1;

import java.util.ArrayList;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * Android实现左右滑动指引效果
 * 
 * @Description: Android实现左右滑动指引效果
 * 
 * @File: MyGuideViewActivity.java
 * 
 * @Package com.test.guide
 * 
 * @Author Hanyongjian
 * 
 * @Company HuajunTec
 * 
 * @Date 2012-4-6 下午11:15:18
 * 
 * @Version V1.0
 */
public class JwActivity extends Activity
{
	private ViewPager viewPager;
	private ArrayList<View> pageViews;
	private ImageView imageView;
	private ImageView[] imageViews;
	
	// 包裹滑动图片LinearLayout
	private ViewGroup jw;
	// 包裹小圆点的LinearLayout
	private ViewGroup group;
	private Context context;
	
	/**************************声明mybutton***********************************/
	private LinearLayout llbtDataConfig0 = null; // main布局中包裹本按钮的容器60个
	private MyButton btDataConfig0 = null;
	
	private LinearLayout llbtDataConfig1 = null; 
	private MyButton btDataConfig1 = null;
	
	private LinearLayout llbtDataConfig2 = null; 
	private MyButton btDataConfig2 = null;
	
	
	private LinearLayout llbtDataConfig3 = null; 
	private MyButton btDataConfig3 = null;
	
	
	private LinearLayout llbtDataConfig4 = null; 
	private MyButton btDataConfig4 = null;
	
	
	private LinearLayout llbtDataConfig5 = null; 
	private MyButton btDataConfig5 = null;
	
	
	private LinearLayout llbtDataConfig6 = null; 
	private MyButton btDataConfig6 = null;
	
	
	private LinearLayout llbtDataConfig7 = null; 
	private MyButton btDataConfig7 = null;
	
	
	private LinearLayout llbtDataConfig8 = null; 
	private MyButton btDataConfig8 = null;
	
	private LinearLayout llbtDataConfig9 = null; 
	private MyButton btDataConfig9 = null;
	
	
	private LinearLayout llbtDataConfig10 = null; 
	private MyButton btDataConfig10 = null;
	
	
	private LinearLayout llbtDataConfig11 = null; 
	private MyButton btDataConfig11 = null;
	
	
	private LinearLayout llbtDataConfig12 = null; 
	private MyButton btDataConfig12 = null;
	
	
	private LinearLayout llbtDataConfig13 = null; 
	private MyButton btDataConfig13 = null;
	
	
	private LinearLayout llbtDataConfig14 = null; 
	private MyButton btDataConfig14 = null;
	
	
	private LinearLayout llbtDataConfig15 = null; 
	private MyButton btDataConfig15 = null;
	
	
	private LinearLayout llbtDataConfig16 = null; 
	private MyButton btDataConfig16 = null;
	
	
	private LinearLayout llbtDataConfig17 = null; 
	private MyButton btDataConfig17 = null;
	
	private LinearLayout llbtDataConfig18 = null; 
	private MyButton btDataConfig18 = null;
	
	
	private LinearLayout llbtDataConfig19 = null; 
	private MyButton btDataConfig19 = null;
	
	
	private LinearLayout llbtDataConfig20 = null; 
	private MyButton btDataConfig20 = null;
	
	
	private LinearLayout llbtDataConfig21 = null; 
	private MyButton btDataConfig21 = null;
	
	
	private LinearLayout llbtDataConfig22 = null; 
	private MyButton btDataConfig22 = null;
	
	
	private LinearLayout llbtDataConfig23 = null; 
	private MyButton btDataConfig23 = null;
	
	
	
	private LinearLayout llbtDataConfig24 = null; 
	private MyButton btDataConfig24 = null;
	
	
	
	private LinearLayout llbtDataConfig25 = null; 
	private MyButton btDataConfig25 = null;
	
	
	private LinearLayout llbtDataConfig26 = null; 
	private MyButton btDataConfig26 = null;
	
	
	
	private LinearLayout llbtDataConfig27 = null; 
	private MyButton btDataConfig27 = null;
	
	
	
	private LinearLayout llbtDataConfig28 = null; 
	private MyButton btDataConfig28 = null;
	
	
	
	private LinearLayout llbtDataConfig29 = null; 
	private MyButton btDataConfig29 = null;
	
	
	private LinearLayout llbtDataConfig30 = null; 
	private MyButton btDataConfig30 = null;
	
	
	private LinearLayout llbtDataConfig31 = null; 
	private MyButton btDataConfig31 = null;
	
	
	private LinearLayout llbtDataConfig32 = null; 
	private MyButton btDataConfig32 = null;
	
	
	private LinearLayout llbtDataConfig33 = null; 
	private MyButton btDataConfig33 = null;
	
	
	private LinearLayout llbtDataConfig34 = null; 
	private MyButton btDataConfig34 = null;
	
	
	private LinearLayout llbtDataConfig35 = null; 
	private MyButton btDataConfig35 = null;
	
	
	private LinearLayout llbtDataConfig36 = null; 
	private MyButton btDataConfig36 = null;
	
	
	private LinearLayout llbtDataConfig37 = null; 
	private MyButton btDataConfig37 = null;
	
	
	private LinearLayout llbtDataConfig38 = null; 
	private MyButton btDataConfig38 = null;
	
	
	private LinearLayout llbtDataConfig39 = null; 
	private MyButton btDataConfig39 = null;
	
	
	private LinearLayout llbtDataConfig40 = null; 
	private MyButton btDataConfig40 = null;
	
	
	private LinearLayout llbtDataConfig41 = null; 
	private MyButton btDataConfig41 = null;
	
	
	private LinearLayout llbtDataConfig42 = null; 
	private MyButton btDataConfig42 = null;
	
	
	private LinearLayout llbtDataConfig43 = null; 
	private MyButton btDataConfig43 = null;
	
	
	private LinearLayout llbtDataConfig44 = null; 
	private MyButton btDataConfig44 = null;
	
	
	private LinearLayout llbtDataConfig45 = null; 
	private MyButton btDataConfig45 = null;
	
	
	private LinearLayout llbtDataConfig46 = null; 
	private MyButton btDataConfig46 = null;
	
	
	private LinearLayout llbtDataConfig47 = null; 
	private MyButton btDataConfig47 = null;
	
	
	private LinearLayout llbtDataConfig48 = null; 
	private MyButton btDataConfig48 = null;
	
	
	private LinearLayout llbtDataConfig49 = null; 
	private MyButton btDataConfig49 = null;
	
	private LinearLayout llbtDataConfig50 = null; 
	private MyButton btDataConfig50 = null;
	
	private LinearLayout llbtDataConfig51 = null; 
	private MyButton btDataConfig51 = null;
	
	

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);

		this.context = getApplicationContext();
		// 设置无标题窗口
		requestWindowFeature(Window.FEATURE_NO_TITLE);

		LayoutInflater inflater = getLayoutInflater();
		pageViews = new ArrayList<View>();
		pageViews.add(inflater.inflate(R.layout.jwl, null));
		pageViews.add(inflater.inflate(R.layout.jwm, null));
		pageViews.add(inflater.inflate(R.layout.jwz, null));

		imageViews = new ImageView[pageViews.size()];
		jw = (ViewGroup) inflater.inflate(R.layout.jw, null);

		group = (ViewGroup) jw.findViewById(R.id.viewGroup);
		viewPager = (ViewPager) jw.findViewById(R.id.guidePages);

		for (int i = 0; i < pageViews.size(); i++)
		{
			imageView = new ImageView(context);
			imageView.setLayoutParams(new LayoutParams(20, 20));
			imageView.setPadding(20, 0, 20, 0);
			imageViews[i] = imageView;
			group.addView(imageViews[i]);
		}

		// *******************************************button空间上界****************************************

		btDataConfig0 = new MyButton(context);
		btDataConfig0.setImageResource(R.drawable.kunnka);
		btDataConfig0.setTextViewText("船长");

		// 获取包裹本按钮的容器
		llbtDataConfig0 = (LinearLayout) pageViews.get(0).findViewById(
				R.id.btn_kunkka);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig0.addView(btDataConfig0);
		btDataConfig0.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.kunkka_name);
				intent.putExtra("ID1", R.drawable.kunnka_gif);
				intent.putExtra("ID2", R.string.kunkka_liliang);
				intent.putExtra("ID3", R.string.kunkka_minjie);
				intent.putExtra("ID4", R.string.kunkka_zhili);
				intent.putExtra("ID5", R.string.kunkka_initial_quality);
				intent.putExtra("ID6", R.string.kunkka_location);
				intent.putExtra("ID7", R.string.kunkka_skill_descript1);
				intent.putExtra("ID8", R.string.kunkka_skill_descript2);
				intent.putExtra("ID9", R.string.kunkka_skill_descript3);
				intent.putExtra("ID10", R.string.kunkka_skill_descript5);
				intent.putExtra("ID11", R.string.kunkka_skill_descript5);
				intent.putExtra("ID12", R.drawable.kunkka_skill_image1);
				intent.putExtra("ID13", R.drawable.kunkka_skill_image2);
				intent.putExtra("ID14", R.drawable.kunkka_skill_image3);
				intent.putExtra("ID15", R.drawable.kunkka_skill_image5);
				intent.putExtra("ID16", R.drawable.kunkka_skill_image5);

				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
//*******************0.kunkka***************************************************		
		btDataConfig1 = new MyButton(context);
		btDataConfig1.setImageResource(R.drawable.bm);
		btDataConfig1.setTextViewText("兽王");

		// 获取包裹本按钮的容器
		llbtDataConfig1 = (LinearLayout) pageViews.get(0).findViewById(
				R.id.btn_bm);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig1.addView(btDataConfig1);
		btDataConfig1.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.bm_name);
				intent.putExtra("ID1", R.drawable.bm_gif);
				intent.putExtra("ID2", R.string.bm_liliang);
				intent.putExtra("ID3", R.string.bm_minjie);
				intent.putExtra("ID4", R.string.bm_zhili);
				intent.putExtra("ID5", R.string.bm_initial_quality);
				intent.putExtra("ID6", R.string.bm_location);
				intent.putExtra("ID7", R.string.bm_skill_descript1);
				intent.putExtra("ID8", R.string.bm_skill_descript2);
				intent.putExtra("ID9", R.string.bm_skill_descript4);
				intent.putExtra("ID10", R.string.bm_skill_descript5);
				//intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.bm_skill_image1);
				intent.putExtra("ID13", R.drawable.bm_skill_image2);
				intent.putExtra("ID14", R.drawable.bm_skill_image4);
				intent.putExtra("ID15", R.drawable.bm_skill_image5);
				//intent.putExtra("ID16", 0);
				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		//*******************1.bm***************************************************
		
		btDataConfig2 = new MyButton(context);
		btDataConfig2.setImageResource(R.drawable.cent);
		btDataConfig2.setTextViewText("半人马酋长");

		// 获取包裹本按钮的容器
		llbtDataConfig2 = (LinearLayout) pageViews.get(0).findViewById(
				R.id.btn_cent);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig2.addView(btDataConfig2);
		btDataConfig2.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.cent_name);
				intent.putExtra("ID1", R.drawable.cent_gif);
				intent.putExtra("ID2", R.string.cent_liliang);
				intent.putExtra("ID3", R.string.cent_minjie);
				intent.putExtra("ID4", R.string.cent_zhili);
				intent.putExtra("ID5", R.string.cent_initial_quality);
				intent.putExtra("ID6", R.string.cent_location);
				intent.putExtra("ID7", R.string.cent_skill_descript1);
				intent.putExtra("ID8", R.string.cent_skill_descript2);
				intent.putExtra("ID9", R.string.cent_skill_descript3);
				intent.putExtra("ID10", R.string.cent_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.cent_skill_image1);
				intent.putExtra("ID13", R.drawable.cent_skill_image2);
				intent.putExtra("ID14", R.drawable.cent_skill_image3);
				intent.putExtra("ID15", R.drawable.cent_skill_image4);
				intent.putExtra("ID16", 0);
				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		//*******************2.cent***************************************************
		
		btDataConfig3 = new MyButton(context);
		btDataConfig3.setImageResource(R.drawable.es);
		btDataConfig3.setTextViewText("撼地神牛");

		// 获取包裹本按钮的容器
		llbtDataConfig3 = (LinearLayout) pageViews.get(0).findViewById(
				R.id.btn_es);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig3.addView(btDataConfig3);
		btDataConfig3.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.es_name);
				intent.putExtra("ID1", R.drawable.es_gif);
				intent.putExtra("ID2", R.string.es_liliang);
				intent.putExtra("ID3", R.string.es_minjie);
				intent.putExtra("ID4", R.string.es_zhili);
				intent.putExtra("ID5", R.string.es_initial_quality);
				intent.putExtra("ID6", R.string.es_location);
				intent.putExtra("ID7", R.string.es_skill_descript1);
				intent.putExtra("ID8", R.string.es_skill_descript2);
				intent.putExtra("ID9", R.string.es_skill_descript3);
				intent.putExtra("ID10", R.string.es_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.es_skill_image1);
				intent.putExtra("ID13", R.drawable.es_skill_image2);
				intent.putExtra("ID14", R.drawable.es_skill_image3);
				intent.putExtra("ID15", R.drawable.es_skill_image4);
				intent.putExtra("ID16", 0);
				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		//*******************3.es***************************************************
		
		
		btDataConfig4 = new MyButton(context);
		btDataConfig4.setImageResource(R.drawable.ok);
		btDataConfig4.setTextViewText("全能骑士");

		// 获取包裹本按钮的容器
		llbtDataConfig4 = (LinearLayout) pageViews.get(0).findViewById(
				R.id.btn_ok);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig4.addView(btDataConfig4);
		btDataConfig4.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.ok_name);
				intent.putExtra("ID1", R.drawable.ok_gif);
				intent.putExtra("ID2", R.string.ok_liliang);
				intent.putExtra("ID3", R.string.ok_minjie);
				intent.putExtra("ID4", R.string.ok_zhili);
				intent.putExtra("ID5", R.string.ok_initial_quality);
				intent.putExtra("ID6", R.string.ok_location);
				intent.putExtra("ID7", R.string.ok_skill_descript1);
				intent.putExtra("ID8", R.string.ok_skill_descript2);
				intent.putExtra("ID9", R.string.ok_skill_descript3);
				intent.putExtra("ID10", R.string.ok_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.ok_skill_image1);
				intent.putExtra("ID13", R.drawable.ok_skill_image2);
				intent.putExtra("ID14", R.drawable.ok_skill_image3);
				intent.putExtra("ID15", R.drawable.ok_skill_image4);
				intent.putExtra("ID16", 0);
				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		//*******************4.ok***************************************************
		
		btDataConfig5 = new MyButton(context);
		btDataConfig5.setImageResource(R.drawable.panda);
		btDataConfig5.setTextViewText("熊猫酒仙");

		// 获取包裹本按钮的容器
		llbtDataConfig5 = (LinearLayout) pageViews.get(0).findViewById(
				R.id.btn_panda);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig5.addView(btDataConfig5);
		btDataConfig5.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.panda_name);
				intent.putExtra("ID1", R.drawable.panda_gif);
				intent.putExtra("ID2", R.string.panda_liliang);
				intent.putExtra("ID3", R.string.panda_minjie);
				intent.putExtra("ID4", R.string.panda_zhili);
				intent.putExtra("ID5", R.string.panda_initial_quality);
				intent.putExtra("ID6", R.string.panda_location);
				intent.putExtra("ID7", R.string.panda_skill_descript1);
				intent.putExtra("ID8", R.string.panda_skill_descript2);
				intent.putExtra("ID9", R.string.panda_skill_descript3);
				intent.putExtra("ID10", R.string.panda_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.panda_skill_image1);
				intent.putExtra("ID13", R.drawable.panda_skill_image2);
				intent.putExtra("ID14", R.drawable.panda_skill_image3);
				intent.putExtra("ID15", R.drawable.panda_skill_image4);
				intent.putExtra("ID16", 0);
				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		//*******************5.panda***************************************************
		
		btDataConfig6 = new MyButton(context);
		btDataConfig6.setImageResource(R.drawable.sven);
		btDataConfig6.setTextViewText("流浪剑客");

		// 获取包裹本按钮的容器
		llbtDataConfig6 = (LinearLayout) pageViews.get(0).findViewById(
				R.id.btn_sven);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig6.addView(btDataConfig6);
		btDataConfig6.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.sven_name);
				intent.putExtra("ID1", R.drawable.sven_gif);
				intent.putExtra("ID2", R.string.sven_liliang);
				intent.putExtra("ID3", R.string.sven_minjie);
				intent.putExtra("ID4", R.string.sven_zhili);
				intent.putExtra("ID5", R.string.sven_initial_quality);
				intent.putExtra("ID6", R.string.sven_location);
				intent.putExtra("ID7", R.string.sven_skill_descript1);
				intent.putExtra("ID8", R.string.sven_skill_descript2);
				intent.putExtra("ID9", R.string.sven_skill_descript3);
				intent.putExtra("ID10", R.string.sven_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.sven_skill_image1);
				intent.putExtra("ID13", R.drawable.sven_skill_image2);
				intent.putExtra("ID14", R.drawable.sven_skill_image3);
				intent.putExtra("ID15", R.drawable.sven_skill_image4);
				intent.putExtra("ID16", 0);
				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		//*******************6.sven***************************************************

		
		
		btDataConfig7 = new MyButton(context);
		btDataConfig7.setImageResource(R.drawable.tiny);
		btDataConfig7.setTextViewText("山岭巨人 ");

		// 获取包裹本按钮的容器
		llbtDataConfig7 = (LinearLayout) pageViews.get(0).findViewById(
				R.id.btn_tiny);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig7.addView(btDataConfig7);
		btDataConfig7.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.tiny_name);
				intent.putExtra("ID1", R.drawable.tiny_gif);
				intent.putExtra("ID2", R.string.tiny_liliang);
				intent.putExtra("ID3", R.string.tiny_minjie);
				intent.putExtra("ID4", R.string.tiny_zhili);
				intent.putExtra("ID5", R.string.tiny_initial_quality);
				intent.putExtra("ID6", R.string.tiny_location);
				intent.putExtra("ID7", R.string.tiny_skill_descript1);
				intent.putExtra("ID8", R.string.tiny_skill_descript2);
				intent.putExtra("ID9", R.string.tiny_skill_descript3);
				intent.putExtra("ID10", R.string.tiny_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.tiny_skill_image1);
				intent.putExtra("ID13", R.drawable.tiny_skill_image2);
				intent.putExtra("ID14", R.drawable.tiny_skill_image3);
				intent.putExtra("ID15", R.drawable.tiny_skill_image4);
				intent.putExtra("ID16", 0);
				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		//*******************7.tiny***************************************************

		
		btDataConfig8 = new MyButton(context);
		btDataConfig8.setImageResource(R.drawable.tc);
		btDataConfig8.setTextViewText("牛头人酋长");

		// 获取包裹本按钮的容器
		llbtDataConfig8 = (LinearLayout) pageViews.get(0).findViewById(
				R.id.btn_tc);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig8.addView(btDataConfig8);
		btDataConfig8.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.tc_name);
				intent.putExtra("ID1", R.drawable.tc_gif);
				intent.putExtra("ID2", R.string.tc_liliang);
				intent.putExtra("ID3", R.string.tc_minjie);
				intent.putExtra("ID4", R.string.tc_zhili);
				intent.putExtra("ID5", R.string.tc_initial_quality);
				intent.putExtra("ID6", R.string.tc_location);
				intent.putExtra("ID7", R.string.tc_skill_descript1);
				intent.putExtra("ID8", R.string.tc_skill_descript2);
				intent.putExtra("ID9", R.string.tc_skill_descript3);
				intent.putExtra("ID10", R.string.tc_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.tc_skill_image1);
				intent.putExtra("ID13", R.drawable.tc_skill_image2);
				intent.putExtra("ID14", R.drawable.tc_skill_image3);
				intent.putExtra("ID15", R.drawable.tc_skill_image4);
				intent.putExtra("ID16", 0);
				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		//*******************8.tc***************************************************
		
		
		btDataConfig9 = new MyButton(context);
		btDataConfig9.setImageResource(R.drawable.tp);
		btDataConfig9.setTextViewText("树精卫士");

		// 获取包裹本按钮的容器
		llbtDataConfig9 = (LinearLayout) pageViews.get(0).findViewById(
				R.id.btn_tp);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig9.addView(btDataConfig9);
		btDataConfig9.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.tp_name);
				intent.putExtra("ID1", R.drawable.tp_gif);
				intent.putExtra("ID2", R.string.tp_liliang);
				intent.putExtra("ID3", R.string.tp_minjie);
				intent.putExtra("ID4", R.string.tp_zhili);
				intent.putExtra("ID5", R.string.tp_initial_quality);
				intent.putExtra("ID6", R.string.tp_location);
				intent.putExtra("ID7", R.string.tp_skill_descript1);
				intent.putExtra("ID8", R.string.tp_skill_descript2);
				intent.putExtra("ID9", R.string.tp_skill_descript3);
				intent.putExtra("ID10", R.string.tp_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.tp_skill_image1);
				intent.putExtra("ID13", R.drawable.tp_skill_image2);
				intent.putExtra("ID14", R.drawable.tp_skill_image3);
				intent.putExtra("ID15", R.drawable.tp_skill_image4);
				intent.putExtra("ID16", 0);
				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		//*******************9.tp***************************************************

		

		btDataConfig10 = new MyButton(context);
		btDataConfig10.setImageResource(R.drawable.wisp);
		btDataConfig10.setTextViewText("精灵守卫");

		// 获取包裹本按钮的容器
		llbtDataConfig10 = (LinearLayout) pageViews.get(0).findViewById(
				R.id.btn_wisp);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig10.addView(btDataConfig10);
		btDataConfig10.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.wisp_name);
				intent.putExtra("ID1", R.drawable.wisp_gif);
				intent.putExtra("ID2", R.string.wisp_liliang);
				intent.putExtra("ID3", R.string.wisp_minjie);
				intent.putExtra("ID4", R.string.wisp_zhili);
				intent.putExtra("ID5", R.string.wisp_initial_quality);
				intent.putExtra("ID6", R.string.wisp_location);
				intent.putExtra("ID7", R.string.wisp_skill_descript1);
				intent.putExtra("ID8", R.string.wisp_skill_descript2);
				intent.putExtra("ID9", R.string.wisp_skill_descript3);
				intent.putExtra("ID10", R.string.wisp_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.wisp_skill_image1);
				intent.putExtra("ID13", R.drawable.wisp_skill_image2);
				intent.putExtra("ID14", R.drawable.wisp_skill_image3);
				intent.putExtra("ID15", R.drawable.wisp_skill_image4);
				intent.putExtra("ID16", 0);
				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		//*******************10.wisp***************************************************

		
		
		btDataConfig11 = new MyButton(context);
		btDataConfig11.setImageResource(R.drawable.ga);
		btDataConfig11.setTextViewText("炼金术士");

		// 获取包裹本按钮的容器
		llbtDataConfig11 = (LinearLayout) pageViews.get(0).findViewById(
				R.id.btn_ga);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig11.addView(btDataConfig11);
		btDataConfig11.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.ga_name);
				intent.putExtra("ID1", R.drawable.ga_gif);
				intent.putExtra("ID2", R.string.ga_liliang);
				intent.putExtra("ID3", R.string.ga_minjie);
				intent.putExtra("ID4", R.string.ga_zhili);
				intent.putExtra("ID5", R.string.ga_initial_quality);
				intent.putExtra("ID6", R.string.ga_location);
				intent.putExtra("ID7", R.string.ga_skill_descript1);
				intent.putExtra("ID8", R.string.ga_skill_descript2);
				intent.putExtra("ID9", R.string.ga_skill_descript3);
				intent.putExtra("ID10", R.string.ga_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.ga_skill_image1);
				intent.putExtra("ID13", R.drawable.ga_skill_image2);
				intent.putExtra("ID14", R.drawable.ga_skill_image3);
				intent.putExtra("ID15", R.drawable.ga_skill_image4);
				intent.putExtra("ID16", 0);
				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		//*******************11.ga***************************************************
		
		
		btDataConfig12 = new MyButton(context);
		btDataConfig12.setImageResource(R.drawable.cg);
		btDataConfig12.setTextViewText("发条地精");

		// 获取包裹本按钮的容器
		llbtDataConfig12 = (LinearLayout) pageViews.get(0).findViewById(
				R.id.btn_cg);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig12.addView(btDataConfig12);
		btDataConfig12.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.cg_name);
				intent.putExtra("ID1", R.drawable.cg_gif);
				intent.putExtra("ID2", R.string.cg_liliang);
				intent.putExtra("ID3", R.string.cg_minjie);
				intent.putExtra("ID4", R.string.cg_zhili);
				intent.putExtra("ID5", R.string.cg_initial_quality);
				intent.putExtra("ID6", R.string.cg_location);
				intent.putExtra("ID7", R.string.cg_skill_descript1);
				intent.putExtra("ID8", R.string.cg_skill_descript2);
				intent.putExtra("ID9", R.string.cg_skill_descript3);
				intent.putExtra("ID10", R.string.cg_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.cg_skill_image1);
				intent.putExtra("ID13", R.drawable.cg_skill_image2);
				intent.putExtra("ID14", R.drawable.cg_skill_image3);
				intent.putExtra("ID15", R.drawable.cg_skill_image4);
				intent.putExtra("ID16", 0);
				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		//*******************12.cg***************************************************
		
		
		
		btDataConfig13 = new MyButton(context);
		btDataConfig13.setImageResource(R.drawable.dk);
		btDataConfig13.setTextViewText("龙骑士");

		// 获取包裹本按钮的容器
		llbtDataConfig13 = (LinearLayout) pageViews.get(0).findViewById(
				R.id.btn_dk);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig13.addView(btDataConfig13);
		btDataConfig13.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.dk_name);
				intent.putExtra("ID1", R.drawable.dk_gif);
				intent.putExtra("ID2", R.string.dk_liliang);
				intent.putExtra("ID3", R.string.dk_minjie);
				intent.putExtra("ID4", R.string.dk_zhili);
				intent.putExtra("ID5", R.string.dk_initial_quality);
				intent.putExtra("ID6", R.string.dk_location);
				intent.putExtra("ID7", R.string.dk_skill_descript1);
				intent.putExtra("ID8", R.string.dk_skill_descript2);
				intent.putExtra("ID9", R.string.dk_skill_descript3);
				intent.putExtra("ID10", R.string.dk_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.dk_skill_image1);
				intent.putExtra("ID13", R.drawable.dk_skill_image2);
				intent.putExtra("ID14", R.drawable.dk_skill_image3);
				intent.putExtra("ID15", R.drawable.dk_skill_image4);
				intent.putExtra("ID16", 0);
				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		//*******************13.dk***************************************************



		btDataConfig14 = new MyButton(context);
		btDataConfig14.setImageResource(R.drawable.sw);
		btDataConfig14.setTextViewText("神灵武士");

		// 获取包裹本按钮的容器
		llbtDataConfig14 = (LinearLayout) pageViews.get(0).findViewById(
				R.id.btn_sw);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig14.addView(btDataConfig14);
		btDataConfig14.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.sw_name);
				intent.putExtra("ID1", R.drawable.sw_gif);
				intent.putExtra("ID2", R.string.sw_liliang);
				intent.putExtra("ID3", R.string.sw_minjie);
				intent.putExtra("ID4", R.string.sw_zhili);
				intent.putExtra("ID5", R.string.sw_initial_quality);
				intent.putExtra("ID6", R.string.sw_location);
				intent.putExtra("ID7", R.string.sw_skill_descript1);
				intent.putExtra("ID8", R.string.sw_skill_descript2);
				intent.putExtra("ID9", R.string.sw_skill_descript3);
				intent.putExtra("ID10", R.string.sw_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.sw_skill_image1);
				intent.putExtra("ID13", R.drawable.sw_skill_image2);
				intent.putExtra("ID14", R.drawable.sw_skill_image3);
				intent.putExtra("ID15", R.drawable.sw_skill_image4);
				intent.putExtra("ID16", 0);
				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		//*******************14.sw***************************************************
		
		
		
		

		btDataConfig15 = new MyButton(context);
		btDataConfig15.setImageResource(R.drawable.bb);
		btDataConfig15.setTextViewText("刚背兽");

		// 获取包裹本按钮的容器
		llbtDataConfig15 = (LinearLayout) pageViews.get(0).findViewById(
				R.id.btn_bb);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig15.addView(btDataConfig15);
		btDataConfig15.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.bb_name);
				intent.putExtra("ID1", R.drawable.bb_gif);
				intent.putExtra("ID2", R.string.bb_liliang);
				intent.putExtra("ID3", R.string.bb_minjie);
				intent.putExtra("ID4", R.string.bb_zhili);
				intent.putExtra("ID5", R.string.bb_initial_quality);
				intent.putExtra("ID6", R.string.bb_location);
				intent.putExtra("ID7", R.string.bb_skill_descript1);
				intent.putExtra("ID8", R.string.bb_skill_descript2);
				intent.putExtra("ID9", R.string.bb_skill_descript3);
				intent.putExtra("ID10", R.string.bb_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.bb_skill_image1);
				intent.putExtra("ID13", R.drawable.bb_skill_image2);
				intent.putExtra("ID14", R.drawable.bb_skill_image3);
				intent.putExtra("ID15", R.drawable.bb_skill_image4);
				intent.putExtra("ID16", 0);
				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		//*******************15.bb***************************************************
		
		
		
		btDataConfig16 = new MyButton(context);
		btDataConfig16.setImageResource(R.drawable.phx);
		btDataConfig16.setTextViewText("凤凰");

		// 获取包裹本按钮的容器
		llbtDataConfig16 = (LinearLayout) pageViews.get(0).findViewById(
				R.id.btn_phx);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig16.addView(btDataConfig16);
		btDataConfig16.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.phx_name);
				intent.putExtra("ID1", R.drawable.phx_gif);
				intent.putExtra("ID2", R.string.phx_liliang);
				intent.putExtra("ID3", R.string.phx_minjie);
				intent.putExtra("ID4", R.string.phx_zhili);
				intent.putExtra("ID5", R.string.phx_initial_quality);
				intent.putExtra("ID6", R.string.phx_location);
				intent.putExtra("ID7", R.string.phx_skill_descript1);
				intent.putExtra("ID8", R.string.phx_skill_descript2);
				intent.putExtra("ID9", R.string.phx_skill_descript3);
				intent.putExtra("ID10", R.string.phx_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.phx_skill_image1);
				intent.putExtra("ID13", R.drawable.phx_skill_image2);
				intent.putExtra("ID14", R.drawable.phx_skill_image3);
				intent.putExtra("ID15", R.drawable.phx_skill_image4);
				intent.putExtra("ID16", 0);
				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		//*******************16.phx***************************************************
	
		
		
		btDataConfig17 = new MyButton(context);
		btDataConfig17.setImageResource(R.drawable.imir);
		btDataConfig17.setTextViewText("巨牙海民");

		// 获取包裹本按钮的容器
		llbtDataConfig17 = (LinearLayout) pageViews.get(0).findViewById(
				R.id.btn_imir);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig17.addView(btDataConfig17);
		btDataConfig17.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.imir_name);
				intent.putExtra("ID1", R.drawable.imir_gif);
				intent.putExtra("ID2", R.string.imir_liliang);
				intent.putExtra("ID3", R.string.imir_minjie);
				intent.putExtra("ID4", R.string.imir_zhili);
				intent.putExtra("ID5", R.string.imir_initial_quality);
				intent.putExtra("ID6", R.string.imir_location);
				intent.putExtra("ID7", R.string.imir_skill_descript1);
				intent.putExtra("ID8", R.string.imir_skill_descript2);
				intent.putExtra("ID9", R.string.imir_skill_descript3);
				intent.putExtra("ID10", R.string.imir_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.imir_skill_image1);
				intent.putExtra("ID13", R.drawable.imir_skill_image2);
				intent.putExtra("ID14", R.drawable.imir_skill_image3);
				intent.putExtra("ID15", R.drawable.imir_skill_image4);
				intent.putExtra("ID16", 0);
				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		//*******************17.imir***************************************************
		//******************近卫力量***************************************************
		
		
		btDataConfig18 = new MyButton(context);
		btDataConfig18.setImageResource(R.drawable.am);
		btDataConfig18.setTextViewText("敌法师");

		// 获取包裹本按钮的容器
		llbtDataConfig18 = (LinearLayout) pageViews.get(1).findViewById(
				R.id.btn_am);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig18.addView(btDataConfig18);
		btDataConfig18.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.am_name);
				intent.putExtra("ID1", R.drawable.am_gif);
				intent.putExtra("ID2", R.string.am_liliang);
				intent.putExtra("ID3", R.string.am_minjie);
				intent.putExtra("ID4", R.string.am_zhili);
				intent.putExtra("ID5", R.string.am_initial_quality);
				intent.putExtra("ID6", R.string.am_location);
				intent.putExtra("ID7", R.string.am_skill_descript1);
				intent.putExtra("ID8", R.string.am_skill_descript2);
				intent.putExtra("ID9", R.string.am_skill_descript3);
				intent.putExtra("ID10", R.string.am_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.am_skill_image1);
				intent.putExtra("ID13", R.drawable.am_skill_image2);
				intent.putExtra("ID14", R.drawable.am_skill_image3);
				intent.putExtra("ID15", R.drawable.am_skill_image4);
				intent.putExtra("ID16", 0);
				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		//*******************18.am***************************************************
		
		
		
		btDataConfig19 = new MyButton(context);
		btDataConfig19.setImageResource(R.drawable.sniper);
		btDataConfig19.setTextViewText("火枪");

		// 获取包裹本按钮的容器
		llbtDataConfig19 = (LinearLayout) pageViews.get(1).findViewById(
				R.id.btn_sniper);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig19.addView(btDataConfig19);
		btDataConfig19.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.snipper_name);
				intent.putExtra("ID1", R.drawable.sniper_gif);
				intent.putExtra("ID2", R.string.snipper_liliang);
				intent.putExtra("ID3", R.string.snipper_minjie);
				intent.putExtra("ID4", R.string.snipper_zhili);
				intent.putExtra("ID5", R.string.snipper_initial_quality);
				intent.putExtra("ID6", R.string.snipper_location);
				intent.putExtra("ID7", R.string.snipper_skill_descript1);
				intent.putExtra("ID8", R.string.snipper_skill_descript2);
				intent.putExtra("ID9", R.string.snipper_skill_descript3);
				intent.putExtra("ID10", R.string.snipper_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.sniper_skill_image1);
				intent.putExtra("ID13", R.drawable.sniper_skill_image2);
				intent.putExtra("ID14", R.drawable.sniper_skill_image3);
				intent.putExtra("ID15", R.drawable.sniper_skill_image4);
				intent.putExtra("ID16", 0);
				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		//*******************19.sniper***************************************************
		
		
		
		btDataConfig20 = new MyButton(context);
		btDataConfig20.setImageResource(R.drawable.jugg);
		btDataConfig20.setTextViewText("剑圣");

		// 获取包裹本按钮的容器
		llbtDataConfig20 = (LinearLayout) pageViews.get(1).findViewById(
				R.id.btn_jugg);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig20.addView(btDataConfig20);
		btDataConfig20.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.jugg_name);
				intent.putExtra("ID1", R.drawable.jugg_gif);
				intent.putExtra("ID2", R.string.jugg_liliang);
				intent.putExtra("ID3", R.string.jugg_minjie);
				intent.putExtra("ID4", R.string.jugg_zhili);
				intent.putExtra("ID5", R.string.jugg_initial_quality);
				intent.putExtra("ID6", R.string.jugg_location);
				intent.putExtra("ID7", R.string.jugg_skill_descript1);
				intent.putExtra("ID8", R.string.jugg_skill_descript2);
				intent.putExtra("ID9", R.string.jugg_skill_descript3);
				intent.putExtra("ID10", R.string.jugg_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.jugg_skill_image1);
				intent.putExtra("ID13", R.drawable.jugg_skill_image2);
				intent.putExtra("ID14", R.drawable.jugg_skill_image3);
				intent.putExtra("ID15", R.drawable.jugg_skill_image4);
				intent.putExtra("ID16", 0);
				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		//*******************20.jugg***************************************************
		
		
		

		btDataConfig21 = new MyButton(context);
		btDataConfig21.setImageResource(R.drawable.ld);
		btDataConfig21.setTextViewText("德鲁伊");

		// 获取包裹本按钮的容器
		llbtDataConfig21 = (LinearLayout) pageViews.get(1).findViewById(
				R.id.btn_ld);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig21.addView(btDataConfig21);
		btDataConfig21.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.ld_name);
				intent.putExtra("ID1", R.drawable.ld_gif);
				intent.putExtra("ID2", R.string.ld_liliang);
				intent.putExtra("ID3", R.string.ld_minjie);
				intent.putExtra("ID4", R.string.ld_zhili);
				intent.putExtra("ID5", R.string.ld_initial_quality);
				intent.putExtra("ID6", R.string.ld_location);
				intent.putExtra("ID7", R.string.ld_skill_descript1);
				intent.putExtra("ID8", R.string.ld_skill_descript2);
				intent.putExtra("ID9", R.string.ld_skill_descript3);
				intent.putExtra("ID10", R.string.ld_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.ld_skill_image1);
				intent.putExtra("ID13", R.drawable.ld_skill_image2);
				intent.putExtra("ID14", R.drawable.ld_skill_image3);
				intent.putExtra("ID15", R.drawable.ld_skill_image4);
				intent.putExtra("ID16", 0);
				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		//*******************21.ld***************************************************
		
		
		
		
		btDataConfig22 = new MyButton(context);
		btDataConfig22.setImageResource(R.drawable.luna);
		btDataConfig22.setTextViewText("月之骑士");

		// 获取包裹本按钮的容器
		llbtDataConfig22 = (LinearLayout) pageViews.get(1).findViewById(
				R.id.btn_luna);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig22.addView(btDataConfig22);
		btDataConfig22.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.luna_name);
				intent.putExtra("ID1", R.drawable.luna_gif);
				intent.putExtra("ID2", R.string.luna_liliang);
				intent.putExtra("ID3", R.string.luna_minjie);
				intent.putExtra("ID4", R.string.luna_zhili);
				intent.putExtra("ID5", R.string.luna_initial_quality);
				intent.putExtra("ID6", R.string.luna_location);
				intent.putExtra("ID7", R.string.luna_skill_descript1);
				intent.putExtra("ID8", R.string.luna_skill_descript2);
				intent.putExtra("ID9", R.string.luna_skill_descript3);
				intent.putExtra("ID10", R.string.luna_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.luna_shill_image1);
				intent.putExtra("ID13", R.drawable.luna_shill_image2);
				intent.putExtra("ID14", R.drawable.luna_shill_image3);
				intent.putExtra("ID15", R.drawable.luna_shill_image4);
				intent.putExtra("ID16", 0);
				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		//*******************22.luna***************************************************
		
		
		btDataConfig23 = new MyButton(context);
		btDataConfig23.setImageResource(R.drawable.mor);
		btDataConfig23.setTextViewText("变体精灵");

		// 获取包裹本按钮的容器
		llbtDataConfig23 = (LinearLayout) pageViews.get(1).findViewById(
				R.id.btn_mor);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig23.addView(btDataConfig23);
		btDataConfig23.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.mor_name);
				intent.putExtra("ID1", R.drawable.mor_gif);
				intent.putExtra("ID2", R.string.mor_liliang);
				intent.putExtra("ID3", R.string.mor_minjie);
				intent.putExtra("ID4", R.string.mor_zhili);
				intent.putExtra("ID5", R.string.mor_initial_quality);
				intent.putExtra("ID6", R.string.mor_location);
				intent.putExtra("ID7", R.string.mor_skill_descript1);
				intent.putExtra("ID8", R.string.mor_skill_descript2);
				intent.putExtra("ID9", R.string.mor_skill_descript3);
				intent.putExtra("ID10", R.string.mor_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.mor_skill_image1);
				intent.putExtra("ID13", R.drawable.mor_skill_image2);
				intent.putExtra("ID14", R.drawable.mor_skill_image3);
				intent.putExtra("ID15", R.drawable.mor_skill_image4);
				intent.putExtra("ID16", 0);
				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		//*******************23.mor***************************************************
		
		
		
		btDataConfig24 = new MyButton(context);
		btDataConfig24.setImageResource(R.drawable.naga);
		btDataConfig24.setTextViewText("娜迦海妖");

		// 获取包裹本按钮的容器
		llbtDataConfig24 = (LinearLayout) pageViews.get(1).findViewById(
				R.id.btn_naga);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig24.addView(btDataConfig24);
		btDataConfig24.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.naga_name);
				intent.putExtra("ID1", R.drawable.naga_gif);
				intent.putExtra("ID2", R.string.naga_liliang);
				intent.putExtra("ID3", R.string.naga_minjie);
				intent.putExtra("ID4", R.string.naga_zhili);
				intent.putExtra("ID5", R.string.naga_initial_quality);
				intent.putExtra("ID6", R.string.naga_location);
				intent.putExtra("ID7", R.string.naga_skill_descript1);
				intent.putExtra("ID8", R.string.naga_skill_descript2);
				intent.putExtra("ID9", R.string.naga_skill_descript3);
				intent.putExtra("ID10", R.string.naga_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.naga_skill_image1);
				intent.putExtra("ID13", R.drawable.naga_skill_image2);
				intent.putExtra("ID14", R.drawable.naga_skill_image3);
				intent.putExtra("ID15", R.drawable.naga_skill_image4);
				intent.putExtra("ID16", 0);
				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		//*******************24.naga***************************************************
		
		
		

		btDataConfig25 = new MyButton(context);
		btDataConfig25.setImageResource(R.drawable.lancer);
		btDataConfig25.setTextViewText("幻影长矛手");

		// 获取包裹本按钮的容器
		llbtDataConfig25 = (LinearLayout) pageViews.get(1).findViewById(
				R.id.btn_lancer);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig25.addView(btDataConfig25);
		btDataConfig25.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.lancer_name);
				intent.putExtra("ID1", R.drawable.lancer_gif);
				intent.putExtra("ID2", R.string.lancer_liliang);
				intent.putExtra("ID3", R.string.lancer_minjie);
				intent.putExtra("ID4", R.string.lancer_zhili);
				intent.putExtra("ID5", R.string.lancer_initial_quality);
				intent.putExtra("ID6", R.string.lancer_location);
				intent.putExtra("ID7", R.string.lancer_skill_descript1);
				intent.putExtra("ID8", R.string.lancer_skill_descript2);
				intent.putExtra("ID9", R.string.lancer_skill_descript3);
				intent.putExtra("ID10", R.string.lancer_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.lancer_skill_image1);
				intent.putExtra("ID13", R.drawable.lancer_skill_image2);
				intent.putExtra("ID14", R.drawable.lancer_skill_image3);
				intent.putExtra("ID15", R.drawable.lancer_skill_image4);
				intent.putExtra("ID16", 0);
				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		//*******************25.lancer***************************************************
		
		

		btDataConfig26 = new MyButton(context);
		btDataConfig26.setImageResource(R.drawable.pom);
		btDataConfig26.setTextViewText("月之女祭司");

		// 获取包裹本按钮的容器
		llbtDataConfig26 = (LinearLayout) pageViews.get(1).findViewById(
				R.id.btn_pom);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig26.addView(btDataConfig26);
		btDataConfig26.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.pom_name);
				intent.putExtra("ID1", R.drawable.pom_gif);
				intent.putExtra("ID2", R.string.pom_liliang);
				intent.putExtra("ID3", R.string.pom_minjie);
				intent.putExtra("ID4", R.string.pom_zhili);
				intent.putExtra("ID5", R.string.pom_initial_quality);
				intent.putExtra("ID6", R.string.pom_location);
				intent.putExtra("ID7", R.string.pom_skill_descript1);
				intent.putExtra("ID8", R.string.pom_skill_descript2);
				intent.putExtra("ID9", R.string.pom_skill_descript3);
				intent.putExtra("ID10", R.string.pom_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.pom_skill_image1);
				intent.putExtra("ID13", R.drawable.pom_skill_image2);
				intent.putExtra("ID14", R.drawable.pom_skill_image3);
				intent.putExtra("ID15", R.drawable.pom_skill_image4);
				intent.putExtra("ID16", 0);
				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		//*******************26.pom***************************************************
		
		
		
		

		btDataConfig27 = new MyButton(context);
		btDataConfig27.setImageResource(R.drawable.sa);
		btDataConfig27.setTextViewText("隐形刺客");

		// 获取包裹本按钮的容器
		llbtDataConfig27 = (LinearLayout) pageViews.get(1).findViewById(
				R.id.btn_sa);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig27.addView(btDataConfig27);
		btDataConfig27.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.sa_name);
				intent.putExtra("ID1", R.drawable.sa_gif);
				intent.putExtra("ID2", R.string.sa_liliang);
				intent.putExtra("ID3", R.string.sa_minjie);
				intent.putExtra("ID4", R.string.sa_zhili);
				intent.putExtra("ID5", R.string.sa_initial_quality);
				intent.putExtra("ID6", R.string.sa_location);
				intent.putExtra("ID7", R.string.sa_skill_descript1);
				intent.putExtra("ID8", R.string.sa_skill_descript2);
				intent.putExtra("ID9", R.string.sa_skill_descript3);
				intent.putExtra("ID10", R.string.sa_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.sa_skill_image1);
				intent.putExtra("ID13", R.drawable.sa_skill_image2);
				intent.putExtra("ID14", R.drawable.sa_skill_image3);
				intent.putExtra("ID15", R.drawable.sa_skill_image4);
				intent.putExtra("ID16", 0);
				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		//*******************27.sa***************************************************

		
		
		btDataConfig28 = new MyButton(context);
		btDataConfig28.setImageResource(R.drawable.troll);
		btDataConfig28.setTextViewText("巨魔战将");

		// 获取包裹本按钮的容器
		llbtDataConfig28 = (LinearLayout) pageViews.get(1).findViewById(
				R.id.btn_troll);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig28.addView(btDataConfig28);
		btDataConfig28.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.troll_name);
				intent.putExtra("ID1", R.drawable.troll_gif);
				intent.putExtra("ID2", R.string.troll_liliang);
				intent.putExtra("ID3", R.string.troll_minjie);
				intent.putExtra("ID4", R.string.troll_zhili);
				intent.putExtra("ID5", R.string.troll_initial_quality);
				intent.putExtra("ID6", R.string.troll_location);
				intent.putExtra("ID7", R.string.troll_skill_descript1);
				intent.putExtra("ID8", R.string.troll_skill_descript2);
				intent.putExtra("ID9", R.string.troll_skill_descript3);
				intent.putExtra("ID10", R.string.troll_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.troll_skill_image1);
				intent.putExtra("ID13", R.drawable.troll_skill_image2);
				intent.putExtra("ID14", R.drawable.troll_skill_image3);
				intent.putExtra("ID15", R.drawable.troll_skill_image4);
				intent.putExtra("ID16", 0);
				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		//*******************28.troll***************************************************
		
		
		btDataConfig29 = new MyButton(context);
		btDataConfig29.setImageResource(R.drawable.av);
		btDataConfig29.setTextViewText("矮人直升机");

		// 获取包裹本按钮的容器
		llbtDataConfig29 = (LinearLayout) pageViews.get(1).findViewById(
				R.id.btn_av);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig29.addView(btDataConfig29);
		btDataConfig29.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.av_name);
				intent.putExtra("ID1", R.drawable.av_gif);
				intent.putExtra("ID2", R.string.av_liliang);
				intent.putExtra("ID3", R.string.av_minjie);
				intent.putExtra("ID4", R.string.av_zhili);
				intent.putExtra("ID5", R.string.av_initial_quality);
				intent.putExtra("ID6", R.string.av_location);
				intent.putExtra("ID7", R.string.av_skill_descript1);
				intent.putExtra("ID8", R.string.av_skill_descript2);
				intent.putExtra("ID9", R.string.av_skill_descript3);
				intent.putExtra("ID10", R.string.av_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.av_skill_image1);
				intent.putExtra("ID13", R.drawable.av_skill_image2);
				intent.putExtra("ID14", R.drawable.av_skill_image3);
				intent.putExtra("ID15", R.drawable.av_skill_image4);
				intent.putExtra("ID16", 0);
				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		//*******************29.av***************************************************

		
		
		btDataConfig30 = new MyButton(context);
		btDataConfig30.setImageResource(R.drawable.dr);
		btDataConfig30.setTextViewText("黑暗游侠");

		// 获取包裹本按钮的容器
		llbtDataConfig30 = (LinearLayout) pageViews.get(1).findViewById(
				R.id.btn_dr);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig30.addView(btDataConfig30);
		btDataConfig30.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.dr_name);
				intent.putExtra("ID1", R.drawable.dr_gif);
				intent.putExtra("ID2", R.string.dr_liliang);
				intent.putExtra("ID3", R.string.dr_minjie);
				intent.putExtra("ID4", R.string.dr_zhili);
				intent.putExtra("ID5", R.string.dr_initial_quality);
				intent.putExtra("ID6", R.string.dr_location);
				intent.putExtra("ID7", R.string.dr_skill_descript1);
				intent.putExtra("ID8", R.string.dr_skill_descript2);
				intent.putExtra("ID9", R.string.dr_skill_descript3);
				intent.putExtra("ID10", R.string.dr_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.dr_skill_image1);
				intent.putExtra("ID13", R.drawable.dr_skill_image2);
				intent.putExtra("ID14", R.drawable.dr_skill_image3);
				intent.putExtra("ID15", R.drawable.dr_skill_image4);
				intent.putExtra("ID16", 0);
				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		//*******************30.dr***************************************************

		
		
		
		btDataConfig31 = new MyButton(context);
		btDataConfig31.setImageResource(R.drawable.ta);
		btDataConfig31.setTextViewText("圣堂刺客");

		// 获取包裹本按钮的容器
		llbtDataConfig31 = (LinearLayout) pageViews.get(1).findViewById(
				R.id.btn_ta);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig31.addView(btDataConfig31);
		btDataConfig31.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.ta_name);
				intent.putExtra("ID1", R.drawable.ta_gif);
				intent.putExtra("ID2", R.string.ta_liliang);
				intent.putExtra("ID3", R.string.ta_minjie);
				intent.putExtra("ID4", R.string.ta_zhili);
				intent.putExtra("ID5", R.string.ta_initial_quality);
				intent.putExtra("ID6", R.string.ta_location);
				intent.putExtra("ID7", R.string.ta_skill_descript1);
				intent.putExtra("ID8", R.string.ta_skill_descript2);
				intent.putExtra("ID9", R.string.ta_skill_descript3);
				intent.putExtra("ID10", R.string.ta_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.ta_skill_image1);
				intent.putExtra("ID13", R.drawable.ta_skill_image2);
				intent.putExtra("ID14", R.drawable.ta_skill_image3);
				intent.putExtra("ID15", R.drawable.ta_skill_image4);
				intent.putExtra("ID16", 0);
				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		//*******************31.ta***************************************************
		
		
		btDataConfig32 = new MyButton(context);
		btDataConfig32.setImageResource(R.drawable.ursa);
		btDataConfig32.setTextViewText("熊战士");

		// 获取包裹本按钮的容器
		llbtDataConfig32 = (LinearLayout) pageViews.get(1).findViewById(
				R.id.btn_ursa);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig32.addView(btDataConfig32);
		btDataConfig32.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.ursa_name);
				intent.putExtra("ID1", R.drawable.ursa_gif);
				intent.putExtra("ID2", R.string.ursa_liliang);
				intent.putExtra("ID3", R.string.ursa_minjie);
				intent.putExtra("ID4", R.string.ursa_zhili);
				intent.putExtra("ID5", R.string.ursa_initial_quality);
				intent.putExtra("ID6", R.string.ursa_location);
				intent.putExtra("ID7", R.string.ursa_skill_descript1);
				intent.putExtra("ID8", R.string.ursa_skill_descript2);
				intent.putExtra("ID9", R.string.ursa_skill_descript3);
				intent.putExtra("ID10", R.string.ursa_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.ursa_skill_image1);
				intent.putExtra("ID13", R.drawable.ursa_skill_image2);
				intent.putExtra("ID14", R.drawable.ursa_skill_image3);
				intent.putExtra("ID15", R.drawable.ursa_skill_image4);
				intent.putExtra("ID16", 0);
				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		//*******************32.ursa***************************************************

		
		
		btDataConfig33 = new MyButton(context);
		btDataConfig33.setImageResource(R.drawable.vs);
		btDataConfig33.setTextViewText("复仇之魂");

		// 获取包裹本按钮的容器
		llbtDataConfig33 = (LinearLayout) pageViews.get(1).findViewById(
				R.id.btn_vs);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig33.addView(btDataConfig33);
		btDataConfig33.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.vs_name);
				intent.putExtra("ID1", R.drawable.vs_gif);
				intent.putExtra("ID2", R.string.vs_liliang);
				intent.putExtra("ID3", R.string.vs_minjie);
				intent.putExtra("ID4", R.string.vs_zhili);
				intent.putExtra("ID5", R.string.vs_initial_quality);
				intent.putExtra("ID6", R.string.vs_location);
				intent.putExtra("ID7", R.string.vs_skill_descript1);
				intent.putExtra("ID8", R.string.vs_skill_descript2);
				intent.putExtra("ID9", R.string.vs_skill_descript3);
				intent.putExtra("ID10", R.string.vs_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.vs_skill_image1);
				intent.putExtra("ID13", R.drawable.vs_skill_image2);
				intent.putExtra("ID14", R.drawable.vs_skill_image3);
				intent.putExtra("ID15", R.drawable.vs_skill_image4);
				intent.putExtra("ID16", 0);
				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		//*******************33.vs***************************************************


		
		btDataConfig34 = new MyButton(context);
		btDataConfig34.setImageResource(R.drawable.bh);
		btDataConfig34.setTextViewText("赏金猎人");

		// 获取包裹本按钮的容器
		llbtDataConfig34 = (LinearLayout) pageViews.get(1).findViewById(
				R.id.btn_bh);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig34.addView(btDataConfig34);
		btDataConfig34.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.bh_name);
				intent.putExtra("ID1", R.drawable.bh_gif);
				intent.putExtra("ID2", R.string.bh_liliang);
				intent.putExtra("ID3", R.string.bh_minjie);
				intent.putExtra("ID4", R.string.bh_zhili);
				intent.putExtra("ID5", R.string.bh_initial_quality);
				intent.putExtra("ID6", R.string.bh_location);
				intent.putExtra("ID7", R.string.bh_skill_descript1);
				intent.putExtra("ID8", R.string.bh_skill_descript2);
				intent.putExtra("ID9", R.string.bh_skill_descript3);
				intent.putExtra("ID10", R.string.bh_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.bh_skill_image1);
				intent.putExtra("ID13", R.drawable.bh_skill_image2);
				intent.putExtra("ID14", R.drawable.bh_skill_image3);
				intent.putExtra("ID15", R.drawable.bh_skill_image4);
				intent.putExtra("ID16", 0);
				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		//*******************34.bh***************************************************
		//******************近卫敏捷***************************************************
		
		
		btDataConfig35 = new MyButton(context);
		btDataConfig35.setImageResource(R.drawable.cm);
		btDataConfig35.setTextViewText("水晶室女");

		// 获取包裹本按钮的容器
		llbtDataConfig35 = (LinearLayout) pageViews.get(2).findViewById(
				R.id.btn_cm);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig35.addView(btDataConfig35);
		btDataConfig35.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.cm_name);
				intent.putExtra("ID1", R.drawable.cm_gif);
				intent.putExtra("ID2", R.string.cm_liliang);
				intent.putExtra("ID3", R.string.cm_minjie);
				intent.putExtra("ID4", R.string.cm_zhili);
				intent.putExtra("ID5", R.string.cm_initial_quality);
				intent.putExtra("ID6", R.string.cm_location);
				intent.putExtra("ID7", R.string.cm_skill_descript1);
				intent.putExtra("ID8", R.string.cm_skill_descript2);
				intent.putExtra("ID9", R.string.cm_skill_descript3);
				intent.putExtra("ID10", R.string.cm_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.cm_skill_image1);
				intent.putExtra("ID13", R.drawable.cm_skill_image2);
				intent.putExtra("ID14", R.drawable.cm_skill_image3);
				intent.putExtra("ID15", R.drawable.cm_skill_image4);
				intent.putExtra("ID16", 0);
				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		//*******************35.cm***************************************************

		
		
		btDataConfig36 = new MyButton(context);
		btDataConfig36.setImageResource(R.drawable.eh);
		btDataConfig36.setTextViewText("魅惑魔女");

		// 获取包裹本按钮的容器
		llbtDataConfig36 = (LinearLayout) pageViews.get(2).findViewById(
				R.id.btn_eh);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig36.addView(btDataConfig36);
		btDataConfig36.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.eh_name);
				intent.putExtra("ID1", R.drawable.eh_gif);
				intent.putExtra("ID2", R.string.eh_liliang);
				intent.putExtra("ID3", R.string.eh_minjie);
				intent.putExtra("ID4", R.string.eh_zhili);
				intent.putExtra("ID5", R.string.eh_initial_quality);
				intent.putExtra("ID6", R.string.eh_location);
				intent.putExtra("ID7", R.string.eh_skill_descript1);
				intent.putExtra("ID8", R.string.eh_skill_descript2);
				intent.putExtra("ID9", R.string.eh_skill_descript3);
				intent.putExtra("ID10", R.string.eh_skill_descripit4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.eh_skill_image1);
				intent.putExtra("ID13", R.drawable.eh_skill_image2);
				intent.putExtra("ID14", R.drawable.eh_skill_image3);
				intent.putExtra("ID15", R.drawable.eh_skill_image4);
				intent.putExtra("ID16", 0);
				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		//*******************36.eh***************************************************

		
		
		btDataConfig37 = new MyButton(context);
		btDataConfig37.setImageResource(R.drawable.puck);
		btDataConfig37.setTextViewText("仙女龙");

		// 获取包裹本按钮的容器
		llbtDataConfig37 = (LinearLayout) pageViews.get(2).findViewById(
				R.id.btn_puck);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig37.addView(btDataConfig37);
		btDataConfig37.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.puck_name);
				intent.putExtra("ID1", R.drawable.puck_gif);
				intent.putExtra("ID2", R.string.puck_liliang);
				intent.putExtra("ID3", R.string.puck_minjie);
				intent.putExtra("ID4", R.string.puck_zhili);
				intent.putExtra("ID5", R.string.puck_initial_quality);
				intent.putExtra("ID6", R.string.puck_location);
				intent.putExtra("ID7", R.string.puck_skill_descript1);
				intent.putExtra("ID8", R.string.puck_skill_descript2);
				intent.putExtra("ID9", R.string.puck_skill_descript3);
				intent.putExtra("ID10", R.string.puck_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.puck_skill_image1);
				intent.putExtra("ID13", R.drawable.puck_skill_image2);
				intent.putExtra("ID14", R.drawable.puck_skill_image3);
				intent.putExtra("ID15", R.drawable.puck_skill_image4);
				intent.putExtra("ID16", 0);
				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		//*******************37.puck***************************************************

		
		
		btDataConfig38 = new MyButton(context);
		btDataConfig38.setImageResource(R.drawable.chen);
		btDataConfig38.setTextViewText("圣骑士");

		// 获取包裹本按钮的容器
		llbtDataConfig38 = (LinearLayout) pageViews.get(2).findViewById(
				R.id.btn_chen);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig38.addView(btDataConfig38);
		btDataConfig38.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.chen_name);
				intent.putExtra("ID1", R.drawable.chen_gif);
				intent.putExtra("ID2", R.string.chen_liliang);
				intent.putExtra("ID3", R.string.chen_minjie);
				intent.putExtra("ID4", R.string.chen_zhili);
				intent.putExtra("ID5", R.string.chen_initial_quality);
				intent.putExtra("ID6", R.string.chen_location);
				intent.putExtra("ID7", R.string.chen_skill_descript1);
				intent.putExtra("ID8", R.string.chen_skill_descript2);
				intent.putExtra("ID9", R.string.chen_skill_descript3);
				intent.putExtra("ID10", R.string.chen_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.chen_skill_image1);
				intent.putExtra("ID13", R.drawable.chen_skill_image2);
				intent.putExtra("ID14", R.drawable.chen_skill_image3);
				intent.putExtra("ID15", R.drawable.chen_skill_image4);
				intent.putExtra("ID16", 0);
				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		//*******************38.chen***************************************************

		
		btDataConfig39 = new MyButton(context);
		btDataConfig39.setImageResource(R.drawable.kotl);
		btDataConfig39.setTextViewText("光之守卫");

		// 获取包裹本按钮的容器
		llbtDataConfig39 = (LinearLayout) pageViews.get(2).findViewById(
				R.id.btn_kotl);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig39.addView(btDataConfig39);
		btDataConfig39.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.kotl_name);
				intent.putExtra("ID1", R.drawable.kotl_gif);
				intent.putExtra("ID2", R.string.kotl_liliang);
				intent.putExtra("ID3", R.string.kotl_minjie);
				intent.putExtra("ID4", R.string.kotl_zhili);
				intent.putExtra("ID5", R.string.kotl_initial_quality);
				intent.putExtra("ID6", R.string.kotl_location);
				intent.putExtra("ID7", R.string.kotl_skill_descript1);
				intent.putExtra("ID8", R.string.kotl_skill_descript2);
				intent.putExtra("ID9", R.string.kotl_skill_descript3);
				intent.putExtra("ID10", R.string.kotl_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.kotl_skill_image1);
				intent.putExtra("ID13", R.drawable.kotl_skill_image2);
				intent.putExtra("ID14", R.drawable.kotl_skill_image3);
				intent.putExtra("ID15", R.drawable.kotl_skill_image4);
				intent.putExtra("ID16", 0);
				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		//*******************39.kotl***************************************************

		
		btDataConfig40 = new MyButton(context);
		btDataConfig40.setImageResource(R.drawable.zeus);
		btDataConfig40.setTextViewText("众神之王");

		// 获取包裹本按钮的容器
		llbtDataConfig40 = (LinearLayout) pageViews.get(2).findViewById(
				R.id.btn_zeus);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig40.addView(btDataConfig40);
		btDataConfig40.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.zeus_name);
				intent.putExtra("ID1", R.drawable.zeus_gif);
				intent.putExtra("ID2", R.string.zeus_liliang);
				intent.putExtra("ID3", R.string.zeus_minjie);
				intent.putExtra("ID4", R.string.zeus_zhili);
				intent.putExtra("ID5", R.string.zeus_initial_quality);
				intent.putExtra("ID6", R.string.zeus_location);
				intent.putExtra("ID7", R.string.zeus_skill_descript1);
				intent.putExtra("ID8", R.string.zeus_skill_descript2);
				intent.putExtra("ID9", R.string.zeus_skill_descript3);
				intent.putExtra("ID10", R.string.zeus_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.zeus_skill_image1);
				intent.putExtra("ID13", R.drawable.zeus_skill_image2);
				intent.putExtra("ID14", R.drawable.zeus_skill_image3);
				intent.putExtra("ID15", R.drawable.zeus_skill_image4);
				intent.putExtra("ID16", 0);
				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		//*******************40.zeus***************************************************


		
		btDataConfig41 = new MyButton(context);
		btDataConfig41.setImageResource(R.drawable.fur);
		btDataConfig41.setTextViewText("先知");

		// 获取包裹本按钮的容器
		llbtDataConfig41 = (LinearLayout) pageViews.get(2).findViewById(
				R.id.btn_fur);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig41.addView(btDataConfig41);
		btDataConfig41.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.fur_name);
				intent.putExtra("ID1", R.drawable.fur_gif);
				intent.putExtra("ID2", R.string.fur_liliang);
				intent.putExtra("ID3", R.string.fur_minjie);
				intent.putExtra("ID4", R.string.fur_zhili);
				intent.putExtra("ID5", R.string.fur_initial_quality);
				intent.putExtra("ID6", R.string.fur_location);
				intent.putExtra("ID7", R.string.fur_skill_descript1);
				intent.putExtra("ID8", R.string.fur_skill_descript2);
				intent.putExtra("ID9", R.string.fur_skill_descript3);
				intent.putExtra("ID10", R.string.fur_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.fur_skill_image1);
				intent.putExtra("ID13", R.drawable.fur_skill_image2);
				intent.putExtra("ID14", R.drawable.fur_skill_image3);
				intent.putExtra("ID15", R.drawable.fur_skill_image4);
				intent.putExtra("ID16", 0);
				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		//*******************41.fur***************************************************


		
		btDataConfig42 = new MyButton(context);
		btDataConfig42.setImageResource(R.drawable.sil);
		btDataConfig42.setTextViewText("沉默术士");

		// 获取包裹本按钮的容器
		llbtDataConfig42 = (LinearLayout) pageViews.get(2).findViewById(
				R.id.btn_sil);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig42.addView(btDataConfig42);
		btDataConfig42.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.sil_name);
				intent.putExtra("ID1", R.drawable.sil_gif);
				intent.putExtra("ID2", R.string.sil_liliang);
				intent.putExtra("ID3", R.string.sil_minjie);
				intent.putExtra("ID4", R.string.sil_zhili);
				intent.putExtra("ID5", R.string.sil_initial_quality);
				intent.putExtra("ID6", R.string.sil_location);
				intent.putExtra("ID7", R.string.sil_skill_descript1);
				intent.putExtra("ID8", R.string.sil_skill_descript2);
				intent.putExtra("ID9", R.string.sil_skill_descript3);
				intent.putExtra("ID10", R.string.sil_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.sil_skill_image1);
				intent.putExtra("ID13", R.drawable.sil_skill_image2);
				intent.putExtra("ID14", R.drawable.sil_skill_image3);
				intent.putExtra("ID15", R.drawable.sil_skill_image4);
				intent.putExtra("ID16", 0);
				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		//*******************42.sil***************************************************


		

		btDataConfig43 = new MyButton(context);
		btDataConfig43.setImageResource(R.drawable.lina);
		btDataConfig43.setTextViewText("火女");

		// 获取包裹本按钮的容器
		llbtDataConfig43 = (LinearLayout) pageViews.get(2).findViewById(
				R.id.btn_lina);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig43.addView(btDataConfig43);
		btDataConfig43.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.lina_name);
				intent.putExtra("ID1", R.drawable.lina_gif);
				intent.putExtra("ID2", R.string.lina_liliang);
				intent.putExtra("ID3", R.string.lina_minjie);
				intent.putExtra("ID4", R.string.lina_zhili);
				intent.putExtra("ID5", R.string.lina_initial_quality);
				intent.putExtra("ID6", R.string.lina_location);
				intent.putExtra("ID7", R.string.lina_skill_descript1);
				intent.putExtra("ID8", R.string.lina_skill_descript2);
				intent.putExtra("ID9", R.string.lina_skill_descript3);
				intent.putExtra("ID10", R.string.lina_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.lina_skill_image1);
				intent.putExtra("ID13", R.drawable.lina_skill_image2);
				intent.putExtra("ID14", R.drawable.lina_skill_image3);
				intent.putExtra("ID15", R.drawable.lina_skill_image4);
				intent.putExtra("ID16", 0);
				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		//*******************43.lina***************************************************
		
		
		btDataConfig44 = new MyButton(context);
		btDataConfig44.setImageResource(R.drawable.storm);
		btDataConfig44.setTextViewText("风暴之灵");

		// 获取包裹本按钮的容器
		llbtDataConfig44 = (LinearLayout) pageViews.get(2).findViewById(
				R.id.btn_storm);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig44.addView(btDataConfig44);
		btDataConfig44.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.storm_name);
				intent.putExtra("ID1", R.drawable.storm_dif);
				intent.putExtra("ID2", R.string.storm_liliang);
				intent.putExtra("ID3", R.string.storm_minjie);
				intent.putExtra("ID4", R.string.storm_zhili);
				intent.putExtra("ID5", R.string.storm_initial_quality);
				intent.putExtra("ID6", R.string.storm_location);
				intent.putExtra("ID7", R.string.storm_skill_descript1);
				intent.putExtra("ID8", R.string.storm_skill_descript2);
				intent.putExtra("ID9", R.string.storm_skill_descript3);
				intent.putExtra("ID10", R.string.storm_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.storm_skill_image1);
				intent.putExtra("ID13", R.drawable.storm_skill_image2);
				intent.putExtra("ID14", R.drawable.storm_skill_image3);
				intent.putExtra("ID15", R.drawable.storm_skill_image4);
				intent.putExtra("ID16", 0);
				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		//*******************44.storm***************************************************
		
		
		btDataConfig45 = new MyButton(context);
		btDataConfig45.setImageResource(R.drawable.wr);
		btDataConfig45.setTextViewText("风行者");

		// 获取包裹本按钮的容器
		llbtDataConfig45 = (LinearLayout) pageViews.get(2).findViewById(
				R.id.btn_wr);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig45.addView(btDataConfig45);
		btDataConfig45.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.wr_name);
				intent.putExtra("ID1", R.drawable.wr_gif);
				intent.putExtra("ID2", R.string.wr_liliang);
				intent.putExtra("ID3", R.string.wr_minjie);
				intent.putExtra("ID4", R.string.wr_zhili);
				intent.putExtra("ID5", R.string.wr_initial_quality);
				intent.putExtra("ID6", R.string.wr_location);
				intent.putExtra("ID7", R.string.wr_skill_descript1);
				intent.putExtra("ID8", R.string.wr_skill_descript2);
				intent.putExtra("ID9", R.string.wr_skill_descript3);
				intent.putExtra("ID10", R.string.wr_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.wr_skill_image1);
				intent.putExtra("ID13", R.drawable.wr_skill_image2);
				intent.putExtra("ID14", R.drawable.wr_skill_image3);
				intent.putExtra("ID15", R.drawable.wr_skill_image4);
				intent.putExtra("ID16", 0);
				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		//*******************45.wr***************************************************
		
		
		btDataConfig46 = new MyButton(context);
		btDataConfig46.setImageResource(R.drawable.sear);
		btDataConfig46.setTextViewText("萨尔");

		// 获取包裹本按钮的容器
		llbtDataConfig46 = (LinearLayout) pageViews.get(2).findViewById(
				R.id.btn_sear);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig46.addView(btDataConfig46);
		btDataConfig46.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.sear_name);
				intent.putExtra("ID1", R.drawable.sear_gif);
				intent.putExtra("ID2", R.string.sear_liliang);
				intent.putExtra("ID3", R.string.sear_minjie);
				intent.putExtra("ID4", R.string.sear_zhili);
				intent.putExtra("ID5", R.string.sear_initial_quality);
				intent.putExtra("ID6", R.string.sear_location);
				intent.putExtra("ID7", R.string.sear_skill_descript1);
				intent.putExtra("ID8", R.string.sear_skill_descript2);
				intent.putExtra("ID9", R.string.sear_skill_descript3);
				intent.putExtra("ID10", R.string.sear_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.sear_skill_image1);
				intent.putExtra("ID13", R.drawable.sear_skill_image2);
				intent.putExtra("ID14", R.drawable.sear_skill_image3);
				intent.putExtra("ID15", R.drawable.sear_skill_image4);
				intent.putExtra("ID16", 0);
				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		//*******************46.sear***************************************************
		
		
		

		btDataConfig47 = new MyButton(context);
		btDataConfig47.setImageResource(R.drawable.om);
		btDataConfig47.setTextViewText("食人魔魔法师");

		// 获取包裹本按钮的容器
		llbtDataConfig47 = (LinearLayout) pageViews.get(2).findViewById(
				R.id.btn_om);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig47.addView(btDataConfig47);
		btDataConfig47.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.om_name);
				intent.putExtra("ID1", R.drawable.om_gif);
				intent.putExtra("ID2", R.string.om_liliang);
				intent.putExtra("ID3", R.string.om_minjie);
				intent.putExtra("ID4", R.string.om_zhili);
				intent.putExtra("ID5", R.string.om_initial_quality);
				intent.putExtra("ID6", R.string.om_location);
				intent.putExtra("ID7", R.string.om_skill_descript1);
				intent.putExtra("ID8", R.string.om_skill_descript2);
				intent.putExtra("ID9", R.string.om_skill_descript3);
				intent.putExtra("ID10", R.string.om_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.om_skill_image1);
				intent.putExtra("ID13", R.drawable.om_skill_image2);
				intent.putExtra("ID14", R.drawable.om_skill_image3);
				intent.putExtra("ID15", R.drawable.om_skill_image4);
				intent.putExtra("ID16", 0);
				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		//*******************47.om***************************************************
		
		
		
		btDataConfig48 = new MyButton(context);
		btDataConfig48.setImageResource(R.drawable.goblin);
		btDataConfig48.setTextViewText("地精工程师");

		// 获取包裹本按钮的容器
		llbtDataConfig48 = (LinearLayout) pageViews.get(2).findViewById(
				R.id.btn_goblin);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig48.addView(btDataConfig48);
		btDataConfig48.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.goblin_name);
				intent.putExtra("ID1", R.drawable.goblin_gif);
				intent.putExtra("ID2", R.string.goblin_liliang);
				intent.putExtra("ID3", R.string.goblin_minjie);
				intent.putExtra("ID4", R.string.goblin_zhili);
				intent.putExtra("ID5", R.string.goblin_initial_quality);
				intent.putExtra("ID6", R.string.goblin_location);
				intent.putExtra("ID7", R.string.goblin_skill_descript1);
				intent.putExtra("ID8", R.string.goblin_skill_descript2);
				intent.putExtra("ID9", R.string.goblin_skill_descript3);
				intent.putExtra("ID10", R.string.goblin_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.goblin_skill_image1);
				intent.putExtra("ID13", R.drawable.goblin_skill_image2);
				intent.putExtra("ID14", R.drawable.goblin_skill_image3);
				intent.putExtra("ID15", R.drawable.goblin_skill_image4);
				intent.putExtra("ID16", 0);
				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		//*******************48.goblin***************************************************
		
		
		btDataConfig49 = new MyButton(context);
		btDataConfig49.setImageResource(R.drawable.thd);
		btDataConfig49.setTextViewText("双头龙");

		// 获取包裹本按钮的容器
		llbtDataConfig49 = (LinearLayout) pageViews.get(2).findViewById(
				R.id.btn_thd);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig49.addView(btDataConfig49);
		btDataConfig49.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.thd_name);
				intent.putExtra("ID1", R.drawable.thd_gif);
				intent.putExtra("ID2", R.string.thd_liliang);
				intent.putExtra("ID3", R.string.thd_minjie);
				intent.putExtra("ID4", R.string.thd_zhili);
				intent.putExtra("ID5", R.string.thd_initial_quality);
				intent.putExtra("ID6", R.string.thd_location);
				intent.putExtra("ID7", R.string.thd_skill_descript1);
				intent.putExtra("ID8", R.string.thd_skill_descript2);
				intent.putExtra("ID9", R.string.thd_skill_descript3);
				intent.putExtra("ID10", R.string.thd_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.thd_skill_image1);
				intent.putExtra("ID13", R.drawable.thd_skill_image2);
				intent.putExtra("ID14", R.drawable.thd_skill_image3);
				intent.putExtra("ID15", R.drawable.thd_skill_image4);
				intent.putExtra("ID16", 0);
				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		//*******************49.thd***************************************************
		
		
		btDataConfig50 = new MyButton(context);
		btDataConfig50.setImageResource(R.drawable.tk);
		btDataConfig50.setTextViewText("修补匠");

		// 获取包裹本按钮的容器
		llbtDataConfig50 = (LinearLayout) pageViews.get(2).findViewById(
				R.id.btn_tk);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig50.addView(btDataConfig50);
		btDataConfig50.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.tk_name);
				intent.putExtra("ID1", R.drawable.tk_gif);
				intent.putExtra("ID2", R.string.tk_liliang);
				intent.putExtra("ID3", R.string.tk_minjie);
				intent.putExtra("ID4", R.string.tk_zhili);
				intent.putExtra("ID5", R.string.tk_initial_quality);
				intent.putExtra("ID6", R.string.tk_location);
				intent.putExtra("ID7", R.string.tk_skill_descript1);
				intent.putExtra("ID8", R.string.tk_skill_descript2);
				intent.putExtra("ID9", R.string.tk_skill_descript3);
				intent.putExtra("ID10", R.string.tk_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.tk_skill_image1);
				intent.putExtra("ID13", R.drawable.tk_skill_image2);
				intent.putExtra("ID14", R.drawable.tk_skill_image3);
				intent.putExtra("ID15", R.drawable.tk_skill_image4);
				intent.putExtra("ID16", 0);
				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		//*******************50.tk***************************************************
		

		btDataConfig51 = new MyButton(context);
		btDataConfig51.setImageResource(R.drawable.ss);
		btDataConfig51.setTextViewText("暗影萨满");

		// 获取包裹本按钮的容器
		llbtDataConfig51 = (LinearLayout) pageViews.get(2).findViewById(
				R.id.btn_ss);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig51.addView(btDataConfig51);
		btDataConfig51.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.ss_name);
				intent.putExtra("ID1", R.drawable.ss_gif);
				intent.putExtra("ID2", R.string.ss_liliang);
				intent.putExtra("ID3", R.string.ss_minjie);
				intent.putExtra("ID4", R.string.ss_zhili);
				intent.putExtra("ID5", R.string.ss_initial_quality);
				intent.putExtra("ID6", R.string.ss_location);
				intent.putExtra("ID7", R.string.ss_skill_descript1);
				intent.putExtra("ID8", R.string.ss_skill_descript2);
				intent.putExtra("ID9", R.string.ss_skill_descript3);
				intent.putExtra("ID10", R.string.ss_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.ss_skill_image1);
				intent.putExtra("ID13", R.drawable.ss_skill_image2);
				intent.putExtra("ID14", R.drawable.ss_skill_image3);
				intent.putExtra("ID15", R.drawable.ss_skill_image4);
				intent.putExtra("ID16", 0);
				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		//*******************51.ss***************************************************
		// *******************************************button空间下界****************************************
		setContentView(jw);
		viewPager.setAdapter(new GuidePageAdapter());
	}

	// 指引页面数据适配器
	class GuidePageAdapter extends PagerAdapter
	{

		@Override
		public int getCount()
		{
			return pageViews.size();
		}

		@Override
		public boolean isViewFromObject(View arg0, Object arg1)
		{
			return arg0 == arg1;
		}

		@Override
		public int getItemPosition(Object object)
		{
			// TODO Auto-generated method stub
			return super.getItemPosition(object);
		}

		@Override
		public void destroyItem(View arg0, int arg1, Object arg2)
		{
			// TODO Auto-generated method stub
			((ViewPager) arg0).removeView(pageViews.get(arg1));
//			if(arg1 == 2 || arg1 == 0){
				Toast.makeText(getApplicationContext(), "左右滑动查看更多英雄", Toast.LENGTH_SHORT).show();
//			}
		}

		@Override
		public Object instantiateItem(View arg0, int arg1)
		{
			// TODO Auto-generated method stub
			((ViewPager) arg0).addView(pageViews.get(arg1));
			return pageViews.get(arg1);
		}

		@Override
		public void restoreState(Parcelable arg0, ClassLoader arg1)
		{
			// TODO Auto-generated method stub

		}

		@Override
		public Parcelable saveState()
		{
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void startUpdate(View arg0)
		{
			// TODO Auto-generated method stub

		}

		@Override
		public void finishUpdate(View arg0)
		{
			// TODO Auto-generated method stub

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
		// TODO Auto-generated method stub
		switch (item.getItemId())
		{
		case MENU_ABOUT:
			startActivity(new Intent(JwActivity.this,
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
		new AlertDialog.Builder(JwActivity.this)
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
