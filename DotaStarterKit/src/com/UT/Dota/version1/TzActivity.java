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
import android.util.Log;
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

public class TzActivity extends Activity
{
	private ViewPager viewPager;
	private ArrayList<View> pageViews;
	private ImageView imageView;
	private ImageView[] imageViews;

	// 包裹滑动图片LinearLayout
	private ViewGroup tz;
	// 包裹小圆点的LinearLayout
	private ViewGroup group;
	private Context context;

	private LinearLayout llbtDataConfig0 = null; // main布局中包裹本按钮的容器
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

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);

		this.context = getApplicationContext();
		// 设置无标题窗口
		requestWindowFeature(Window.FEATURE_NO_TITLE);

		LayoutInflater inflater = getLayoutInflater();
		pageViews = new ArrayList<View>();
		pageViews.add(inflater.inflate(R.layout.tzl, null));
		pageViews.add(inflater.inflate(R.layout.tzm, null));
		pageViews.add(inflater.inflate(R.layout.tzz, null));

		imageViews = new ImageView[pageViews.size()];
		tz = (ViewGroup) inflater.inflate(R.layout.tz, null);

		group = (ViewGroup) tz.findViewById(R.id.viewGroup02);
		viewPager = (ViewPager) tz.findViewById(R.id.guidePages02);

		for (int i = 0; i < pageViews.size(); i++)
		{
			imageView = new ImageView(context);
			imageView.setLayoutParams(new LayoutParams(20, 20));
			imageView.setPadding(20, 0, 20, 0);
			imageViews[i] = imageView;

			group.addView(imageViews[i]);
		}


		// *******************************************button空间上界****************************************

		// *******************斧王************************************
		btDataConfig0 = new MyButton(context);
		btDataConfig0.setImageResource(R.drawable.axe);
		btDataConfig0.setTextViewText("斧王");

		// 获取包裹本按钮的容器
		llbtDataConfig0 = (LinearLayout) pageViews.get(0).findViewById(
				R.id.btn_axe);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig0.addView(btDataConfig0);
		btDataConfig0.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.axe_name);
				intent.putExtra("ID1", R.drawable.axe_gif);
				intent.putExtra("ID2", R.string.axe_liliang);
				intent.putExtra("ID3", R.string.axe_minjie);
				intent.putExtra("ID4", R.string.axe_zhili);
				intent.putExtra("ID5", R.string.axe_initial_quality);
				intent.putExtra("ID6", R.string.axe_location);
				intent.putExtra("ID7", R.string.axe_skill_descript1);
				intent.putExtra("ID8", R.string.axe_skill_descript2);
				intent.putExtra("ID9", R.string.axe_skill_descript3);
				intent.putExtra("ID10", R.string.axe_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.axe_skill_image1);
				intent.putExtra("ID13", R.drawable.axe_skill_image2);
				intent.putExtra("ID14", R.drawable.axe_skill_image3);
				intent.putExtra("ID15", R.drawable.axe_skill_image4);
				intent.putExtra("ID16", 0);

				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		// *******************斧王************************************

		// *******************混沌骑士************************************
		btDataConfig1 = new MyButton(context);
		btDataConfig1.setImageResource(R.drawable.ck);
		btDataConfig1.setTextViewText("混沌骑士");

		// 获取包裹本按钮的容器
		llbtDataConfig1 = (LinearLayout) pageViews.get(0).findViewById(
				R.id.btn_ck);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig1.addView(btDataConfig1);
		btDataConfig1.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.ck_name);
				intent.putExtra("ID1", R.drawable.ck_gif);
				intent.putExtra("ID2", R.string.ck_liliang);
				intent.putExtra("ID3", R.string.ck_minjie);
				intent.putExtra("ID4", R.string.ck_zhili);
				intent.putExtra("ID5", R.string.ck_initial_quality);
				intent.putExtra("ID6", R.string.ck_location);
				intent.putExtra("ID7", R.string.ck_skill_descript1);
				intent.putExtra("ID8", R.string.ck_skill_descript2);
				intent.putExtra("ID9", R.string.ck_skill_descript3);
				intent.putExtra("ID10", R.string.ck_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.ck_skill_image1);
				intent.putExtra("ID13", R.drawable.ck_skill_image2);
				intent.putExtra("ID14", R.drawable.ck_skill_image3);
				intent.putExtra("ID15", R.drawable.ck_skill_image4);
				intent.putExtra("ID16", 0);

				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		// *******************混沌骑士************************************

		// *******************末日使者************************************
		btDataConfig2 = new MyButton(context);
		btDataConfig2.setImageResource(R.drawable.doom);
		btDataConfig2.setTextViewText("末日使者");

		// 获取包裹本按钮的容器
		llbtDataConfig2 = (LinearLayout) pageViews.get(0).findViewById(
				R.id.btn_doom);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig2.addView(btDataConfig2);
		btDataConfig2.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.doom_name);
				intent.putExtra("ID1", R.drawable.doom_gif);
				intent.putExtra("ID2", R.string.doom_liliang);
				intent.putExtra("ID3", R.string.doom_minjie);
				intent.putExtra("ID4", R.string.doom_zhili);
				intent.putExtra("ID5", R.string.doom_initial_quality);
				intent.putExtra("ID6", R.string.doom_location);
				intent.putExtra("ID7", R.string.doom_skill_descript1);
				intent.putExtra("ID8", R.string.doom_skill_descript2);
				intent.putExtra("ID9", R.string.doom_skill_descript3);
				intent.putExtra("ID10", R.string.doom_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.doom_skill_image1);
				intent.putExtra("ID13", R.drawable.doom_skill_image2);
				intent.putExtra("ID14", R.drawable.doom_skill_image3);
				intent.putExtra("ID15", R.drawable.doom_skill_image4);
				intent.putExtra("ID16", 0);

				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		// *******************末日使者************************************

		// *******************小狗************************************
		btDataConfig3 = new MyButton(context);
		btDataConfig3.setImageResource(R.drawable.naix);
		btDataConfig3.setTextViewText("小狗");

		// 获取包裹本按钮的容器
		llbtDataConfig3 = (LinearLayout) pageViews.get(0).findViewById(
				R.id.btn_naix);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig3.addView(btDataConfig3);
		btDataConfig3.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.naix_name);
				intent.putExtra("ID1", R.drawable.naix_gif);
				intent.putExtra("ID2", R.string.naix_liliang);
				intent.putExtra("ID3", R.string.naix_minjie);
				intent.putExtra("ID4", R.string.naix_zhili);
				intent.putExtra("ID5", R.string.naix_initial_quality);
				intent.putExtra("ID6", R.string.naix_location);
				intent.putExtra("ID7", R.string.naix_skill_descript1);
				intent.putExtra("ID8", R.string.naix_skill_descript2);
				intent.putExtra("ID9", R.string.naix_skill_descript3);
				intent.putExtra("ID10", R.string.naix_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.naix_skill_image1);
				intent.putExtra("ID13", R.drawable.naix_skill_image2);
				intent.putExtra("ID14", R.drawable.naix_skill_image3);
				intent.putExtra("ID15", R.drawable.naix_skill_image4);
				intent.putExtra("ID16", 0);

				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		// *******************小狗************************************
		Log.d("test", "here10");
		// *******************地狱领主************************************
		btDataConfig4 = new MyButton(context);
		btDataConfig4.setImageResource(R.drawable.loa);
		btDataConfig4.setTextViewText("地狱领主");

		// 获取包裹本按钮的容器
		llbtDataConfig4 = (LinearLayout) pageViews.get(0).findViewById(
				R.id.btn_loa);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig4.addView(btDataConfig4);
		btDataConfig4.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.loa_name);
				intent.putExtra("ID1", R.drawable.loa_gif);
				intent.putExtra("ID2", R.string.loa_liliang);
				intent.putExtra("ID3", R.string.loa_minjie);
				intent.putExtra("ID4", R.string.loa_zhili);
				intent.putExtra("ID5", R.string.loa_initial_quality);
				intent.putExtra("ID6", R.string.loa_location);
				intent.putExtra("ID7", R.string.loa_skill_descript1);
				intent.putExtra("ID8", R.string.loa_skill_descript2);
				intent.putExtra("ID9", R.string.loa_skill_descript3);
				intent.putExtra("ID10", R.string.loa_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.loa_skill_image1);
				intent.putExtra("ID13", R.drawable.loa_skill_image2);
				intent.putExtra("ID14", R.drawable.loa_skill_image3);
				intent.putExtra("ID15", R.drawable.loa_skill_image4);
				intent.putExtra("ID16", 0);

				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		// *******************地狱领主************************************

		// *******************狼人************************************
		btDataConfig5 = new MyButton(context);
		btDataConfig5.setImageResource(R.drawable.lyc);
		btDataConfig5.setTextViewText("狼人");

		// 获取包裹本按钮的容器
		llbtDataConfig5 = (LinearLayout) pageViews.get(0).findViewById(
				R.id.btn_lyc);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig5.addView(btDataConfig5);
		btDataConfig5.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.lyc_name);
				intent.putExtra("ID1", R.drawable.lyc_gif);
				intent.putExtra("ID2", R.string.lyc_liliang);
				intent.putExtra("ID3", R.string.lyc_minjie);
				intent.putExtra("ID4", R.string.lyc_zhili);
				intent.putExtra("ID5", R.string.lyc_initial_quality);
				intent.putExtra("ID6", R.string.lyc_location);
				intent.putExtra("ID7", R.string.lyc_skill_descript1);
				intent.putExtra("ID8", R.string.lyc_skill_descript2);
				intent.putExtra("ID9", R.string.lyc_skill_descript3);
				intent.putExtra("ID10", R.string.lyc_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.lyc_skill_image1);
				intent.putExtra("ID13", R.drawable.lyc_skill_image2);
				intent.putExtra("ID14", R.drawable.lyc_skill_image3);
				intent.putExtra("ID15", R.drawable.lyc_skill_image4);
				intent.putExtra("ID16", 0);

				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		// *******************狼人************************************

		// *******************暗夜魔王************************************
		btDataConfig6 = new MyButton(context);
		btDataConfig6.setImageResource(R.drawable.ns);
		btDataConfig6.setTextViewText("暗夜魔王");

		// 获取包裹本按钮的容器
		llbtDataConfig6 = (LinearLayout) pageViews.get(0).findViewById(
				R.id.btn_ns);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig6.addView(btDataConfig6);
		btDataConfig6.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.ns_name);
				intent.putExtra("ID1", R.drawable.ns_gif);
				intent.putExtra("ID2", R.string.ns_liliang);
				intent.putExtra("ID3", R.string.ns_minjie);
				intent.putExtra("ID4", R.string.ns_zhili);
				intent.putExtra("ID5", R.string.ns_initial_quality);
				intent.putExtra("ID6", R.string.ns_location);
				intent.putExtra("ID7", R.string.ns_skill_descript1);
				intent.putExtra("ID8", R.string.ns_skill_descript2);
				intent.putExtra("ID9", R.string.ns_skill_descript3);
				intent.putExtra("ID10", R.string.ns_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.ns_skill_image1);
				intent.putExtra("ID13", R.drawable.ns_skill_image2);
				intent.putExtra("ID14", R.drawable.ns_skill_image3);
				intent.putExtra("ID15", R.drawable.ns_skill_image4);
				intent.putExtra("ID16", 0);

				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		// *******************暗夜魔王***********************************

		// *******************深渊领主************************************
		btDataConfig7 = new MyButton(context);
		btDataConfig7.setImageResource(R.drawable.pl);
		btDataConfig7.setTextViewText("深渊领主");

		// 获取包裹本按钮的容器
		llbtDataConfig7 = (LinearLayout) pageViews.get(0).findViewById(
				R.id.btn_pl);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig7.addView(btDataConfig7);
		btDataConfig7.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.pl_name);
				intent.putExtra("ID1", R.drawable.pl_gif);
				intent.putExtra("ID2", R.string.pl_liliang);
				intent.putExtra("ID3", R.string.pl_minjie);
				intent.putExtra("ID4", R.string.pl_zhili);
				intent.putExtra("ID5", R.string.pl_initial_quality);
				intent.putExtra("ID6", R.string.pl_location);
				intent.putExtra("ID7", R.string.pl_skill_descript1);
				intent.putExtra("ID8", R.string.pl_skill_descript2);
				intent.putExtra("ID9", R.string.pl_skill_descript3);
				intent.putExtra("ID10", R.string.pl_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.pl_skill_image1);
				intent.putExtra("ID13", R.drawable.pl_skill_image2);
				intent.putExtra("ID14", R.drawable.pl_skill_image3);
				intent.putExtra("ID15", R.drawable.pl_skill_image4);
				intent.putExtra("ID16", 0);

				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		// *******************深渊领主************************************

		// *******************屠夫************************************
		btDataConfig8 = new MyButton(context);
		btDataConfig8.setImageResource(R.drawable.pudge);
		btDataConfig8.setTextViewText("屠夫");

		// 获取包裹本按钮的容器
		llbtDataConfig8 = (LinearLayout) pageViews.get(0).findViewById(
				R.id.btn_pudge);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig8.addView(btDataConfig8);
		btDataConfig8.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.pudge_name);
				intent.putExtra("ID1", R.drawable.pudge_gif);
				intent.putExtra("ID2", R.string.pudge_liliang);
				intent.putExtra("ID3", R.string.pudge_minjie);
				intent.putExtra("ID4", R.string.pudge_zhili);
				intent.putExtra("ID5", R.string.pudge_initial_quality);
				intent.putExtra("ID6", R.string.pudge_location);
				intent.putExtra("ID7", R.string.pudge_skill_descript1);
				intent.putExtra("ID8", R.string.pudge_skill_descript2);
				intent.putExtra("ID9", R.string.pudge_skill_descript3);
				intent.putExtra("ID10", R.string.pudge_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.pudge_skill_image1);
				intent.putExtra("ID13", R.drawable.pudge_skill_image2);
				intent.putExtra("ID14", R.drawable.pudge_skill_image3);
				intent.putExtra("ID15", R.drawable.pudge_skill_image4);
				intent.putExtra("ID16", 0);

				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		// *******************屠夫************************************

		// *******************骷髅王************************************
		btDataConfig9 = new MyButton(context);
		btDataConfig9.setImageResource(R.drawable.snk);
		btDataConfig9.setTextViewText("骷髅王");

		// 获取包裹本按钮的容器
		llbtDataConfig9 = (LinearLayout) pageViews.get(0).findViewById(
				R.id.btn_snk);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig9.addView(btDataConfig9);
		btDataConfig9.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.snk_name);
				intent.putExtra("ID1", R.drawable.snk_gif);
				intent.putExtra("ID2", R.string.snk_liliang);
				intent.putExtra("ID3", R.string.snk_minjie);
				intent.putExtra("ID4", R.string.snk_zhili);
				intent.putExtra("ID5", R.string.snk_initial_quality);
				intent.putExtra("ID6", R.string.snk_location);
				intent.putExtra("ID7", R.string.snk_skill_descript1);
				intent.putExtra("ID8", R.string.snk_skill_descript2);
				intent.putExtra("ID9", R.string.snk_skill_descript3);
				intent.putExtra("ID10", R.string.snk_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.snk_skill_image1);
				intent.putExtra("ID13", R.drawable.snk_skill_image2);
				intent.putExtra("ID14", R.drawable.snk_skill_image3);
				intent.putExtra("ID15", R.drawable.snk_skill_image4);
				intent.putExtra("ID16", 0);

				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		// *******************骷髅王************************************

		// *******************鱼人守卫************************************
		btDataConfig10 = new MyButton(context);
		btDataConfig10.setImageResource(R.drawable.sg);
		btDataConfig10.setTextViewText("鱼人守卫");

		// 获取包裹本按钮的容器
		llbtDataConfig10 = (LinearLayout) pageViews.get(0).findViewById(
				R.id.btn_sg);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig10.addView(btDataConfig10);
		btDataConfig10.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.sg_name);
				intent.putExtra("ID1", R.drawable.sg_gif);
				intent.putExtra("ID2", R.string.sg_liliang);
				intent.putExtra("ID3", R.string.sg_minjie);
				intent.putExtra("ID4", R.string.sg_zhili);
				intent.putExtra("ID5", R.string.sg_initial_quality);
				intent.putExtra("ID6", R.string.sg_location);
				intent.putExtra("ID7", R.string.sg_skill_descript1);
				intent.putExtra("ID8", R.string.sg_skill_descript2);
				intent.putExtra("ID9", R.string.sg_skill_descript3);
				intent.putExtra("ID10", R.string.sg_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.sg_skill_image1);
				intent.putExtra("ID13", R.drawable.sg_skill_image2);
				intent.putExtra("ID14", R.drawable.sg_skill_image3);
				intent.putExtra("ID15", R.drawable.sg_skill_image4);
				intent.putExtra("ID16", 0);

				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		// *******************鱼人守卫************************************

		// *******************不朽尸王************************************
		btDataConfig11 = new MyButton(context);
		btDataConfig11.setImageResource(R.drawable.ud);
		btDataConfig11.setTextViewText("不朽尸王");

		// 获取包裹本按钮的容器
		llbtDataConfig11 = (LinearLayout) pageViews.get(0).findViewById(
				R.id.btn_ud);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig11.addView(btDataConfig11);
		btDataConfig11.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.ud_name);
				intent.putExtra("ID1", R.drawable.ud_gif);
				intent.putExtra("ID2", R.string.ud_liliang);
				intent.putExtra("ID3", R.string.ud_minjie);
				intent.putExtra("ID4", R.string.ud_zhili);
				intent.putExtra("ID5", R.string.ud_initial_quality);
				intent.putExtra("ID6", R.string.ud_location);
				intent.putExtra("ID7", R.string.ud_skill_descript1);
				intent.putExtra("ID8", R.string.ud_skill_descript2);
				intent.putExtra("ID9", R.string.ud_skill_descript3);
				intent.putExtra("ID10", R.string.ud_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.ud_skill_image1);
				intent.putExtra("ID13", R.drawable.ud_skill_image2);
				intent.putExtra("ID14", R.drawable.ud_skill_image3);
				intent.putExtra("ID15", R.drawable.ud_skill_image4);
				intent.putExtra("ID16", 0);

				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		// *******************不朽尸王************************************

		// *******************潮汐猎人************************************
		btDataConfig12 = new MyButton(context);
		btDataConfig12.setImageResource(R.drawable.th);
		btDataConfig12.setTextViewText("潮汐猎人");

		// 获取包裹本按钮的容器
		llbtDataConfig12 = (LinearLayout) pageViews.get(0).findViewById(
				R.id.btn_th);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig12.addView(btDataConfig12);
		btDataConfig12.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.th_name);
				intent.putExtra("ID1", R.drawable.th_gif);
				intent.putExtra("ID2", R.string.th_liliang);
				intent.putExtra("ID3", R.string.th_minjie);
				intent.putExtra("ID4", R.string.th_zhili);
				intent.putExtra("ID5", R.string.th_initial_quality);
				intent.putExtra("ID6", R.string.th_location);
				intent.putExtra("ID7", R.string.th_skill_descript1);
				intent.putExtra("ID8", R.string.th_skill_descript2);
				intent.putExtra("ID9", R.string.th_skill_descript3);
				intent.putExtra("ID10", R.string.th_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.th_skill_image1);
				intent.putExtra("ID13", R.drawable.th_skill_image2);
				intent.putExtra("ID14", R.drawable.th_skill_image3);
				intent.putExtra("ID15", R.drawable.th_skill_image4);
				intent.putExtra("ID16", 0);

				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		// *******************潮汐猎人************************************

		// *******************半人猛犸************************************
		btDataConfig13 = new MyButton(context);
		btDataConfig13.setImageResource(R.drawable.mag);
		btDataConfig13.setTextViewText("半人猛犸");

		// 获取包裹本按钮的容器
		llbtDataConfig13 = (LinearLayout) pageViews.get(0).findViewById(
				R.id.btn_mag);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig13.addView(btDataConfig13);
		btDataConfig13.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.mag_name);
				intent.putExtra("ID1", R.drawable.mag_gif);
				intent.putExtra("ID2", R.string.mag_liliang);
				intent.putExtra("ID3", R.string.mag_minjie);
				intent.putExtra("ID4", R.string.mag_zhili);
				intent.putExtra("ID5", R.string.mag_initial_quality);
				intent.putExtra("ID6", R.string.mag_location);
				intent.putExtra("ID7", R.string.mag_skill_descript1);
				intent.putExtra("ID8", R.string.mag_skill_descript2);
				intent.putExtra("ID9", R.string.mag_skill_descript3);
				intent.putExtra("ID10", R.string.mag_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.mag_skill_image1);
				intent.putExtra("ID13", R.drawable.mag_skill_image2);
				intent.putExtra("ID14", R.drawable.mag_skill_image3);
				intent.putExtra("ID15", R.drawable.mag_skill_image4);
				intent.putExtra("ID16", 0);

				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		// *******************半人猛犸************************************

		// *******************裂魂人************************************
		btDataConfig14 = new MyButton(context);
		btDataConfig14.setImageResource(R.drawable.sb);
		btDataConfig14.setTextViewText("裂魂人");

		// 获取包裹本按钮的容器
		llbtDataConfig14 = (LinearLayout) pageViews.get(0).findViewById(
				R.id.btn_sb);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig14.addView(btDataConfig14);
		btDataConfig14.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.sb_name);
				intent.putExtra("ID1", R.drawable.sb_gif);
				intent.putExtra("ID2", R.string.sb_liliang);
				intent.putExtra("ID3", R.string.sb_minjie);
				intent.putExtra("ID4", R.string.sb_zhili);
				intent.putExtra("ID5", R.string.sb_initial_quality);
				intent.putExtra("ID6", R.string.sb_location);
				intent.putExtra("ID7", R.string.sb_skill_descript1);
				intent.putExtra("ID8", R.string.sb_skill_descript2);
				intent.putExtra("ID9", R.string.sb_skill_descript3);
				intent.putExtra("ID10", R.string.sb_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.sb_skill_image1);
				intent.putExtra("ID13", R.drawable.sb_skill_image2);
				intent.putExtra("ID14", R.drawable.sb_skill_image3);
				intent.putExtra("ID15", R.drawable.sb_skill_image4);
				intent.putExtra("ID16", 0);

				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		// *******************裂魂人************************************

		// *******************沙王************************************
		btDataConfig15 = new MyButton(context);
		btDataConfig15.setImageResource(R.drawable.sk);
		btDataConfig15.setTextViewText("沙王");

		// 获取包裹本按钮的容器
		llbtDataConfig15 = (LinearLayout) pageViews.get(0).findViewById(
				R.id.btn_sk);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig15.addView(btDataConfig15);
		btDataConfig15.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.sk_name);
				intent.putExtra("ID1", R.drawable.sk_gif);
				intent.putExtra("ID2", R.string.sk_liliang);
				intent.putExtra("ID3", R.string.sk_minjie);
				intent.putExtra("ID4", R.string.sk_zhili);
				intent.putExtra("ID5", R.string.sk_initial_quality);
				intent.putExtra("ID6", R.string.sk_location);
				intent.putExtra("ID7", R.string.sk_skill_descript1);
				intent.putExtra("ID8", R.string.sk_skill_descript2);
				intent.putExtra("ID9", R.string.sk_skill_descript3);
				intent.putExtra("ID10", R.string.sk_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.sk_skill_image1);
				intent.putExtra("ID13", R.drawable.sk_skill_image2);
				intent.putExtra("ID14", R.drawable.sk_skill_image3);
				intent.putExtra("ID15", R.drawable.sk_skill_image4);
				intent.putExtra("ID16", 0);

				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		// *******************沙王************************************

		// ************************敏捷型英雄***************************

		// *******************血魔************************************
		btDataConfig16 = new MyButton(context);
		btDataConfig16.setImageResource(R.drawable.bs);
		btDataConfig16.setTextViewText("血魔");

		// 获取包裹本按钮的容器
		llbtDataConfig16 = (LinearLayout) pageViews.get(1).findViewById(
				R.id.btn_bs);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig16.addView(btDataConfig16);
		btDataConfig16.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.bs_name);
				intent.putExtra("ID1", R.drawable.bs_gif);
				intent.putExtra("ID2", R.string.bs_liliang);
				intent.putExtra("ID3", R.string.bs_minjie);
				intent.putExtra("ID4", R.string.bs_zhili);
				intent.putExtra("ID5", R.string.bs_initial_quality);
				intent.putExtra("ID6", R.string.bs_location);
				intent.putExtra("ID7", R.string.bs_skill_descript1);
				intent.putExtra("ID8", R.string.bs_skill_descript2);
				intent.putExtra("ID9", R.string.bs_skill_descript3);
				intent.putExtra("ID10", R.string.bs_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.bs_skill_image1);
				intent.putExtra("ID13", R.drawable.bs_skill_image2);
				intent.putExtra("ID14", R.drawable.bs_skill_image3);
				intent.putExtra("ID15", R.drawable.bs_skill_image4);
				intent.putExtra("ID16", 0);

				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		// *******************血魔************************************

		// *******************骷髅射手************************************
		btDataConfig17 = new MyButton(context);
		btDataConfig17.setImageResource(R.drawable.bone);
		btDataConfig17.setTextViewText("骷髅射手");

		// 获取包裹本按钮的容器
		llbtDataConfig17 = (LinearLayout) pageViews.get(1).findViewById(
				R.id.btn_bone);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig17.addView(btDataConfig17);
		btDataConfig17.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.bone_name);
				intent.putExtra("ID1", R.drawable.bone_gif);
				intent.putExtra("ID2", R.string.bone_liliang);
				intent.putExtra("ID3", R.string.bone_minjie);
				intent.putExtra("ID4", R.string.bone_zhili);
				intent.putExtra("ID5", R.string.bone_initial_quality);
				intent.putExtra("ID6", R.string.bone_location);
				intent.putExtra("ID7", R.string.bone_skill_descript1);
				intent.putExtra("ID8", R.string.bone_skill_descript2);
				intent.putExtra("ID9", R.string.bone_skill_descript3);
				intent.putExtra("ID10", R.string.bone_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.bone_skill_image1);
				intent.putExtra("ID13", R.drawable.bone_skill_image2);
				intent.putExtra("ID14", R.drawable.bone_skill_image3);
				intent.putExtra("ID15", R.drawable.bone_skill_image4);
				intent.putExtra("ID16", 0);

				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		// *******************骷髅射手************************************

		// *******************育母蜘蛛************************************
		btDataConfig18 = new MyButton(context);
		btDataConfig18.setImageResource(R.drawable.br);
		btDataConfig18.setTextViewText("育母蜘蛛");

		// 获取包裹本按钮的容器
		llbtDataConfig18 = (LinearLayout) pageViews.get(1).findViewById(
				R.id.btn_br);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig18.addView(btDataConfig18);
		btDataConfig18.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.br_name);
				intent.putExtra("ID1", R.drawable.br_gif);
				intent.putExtra("ID2", R.string.br_liliang);
				intent.putExtra("ID3", R.string.br_minjie);
				intent.putExtra("ID4", R.string.br_zhili);
				intent.putExtra("ID5", R.string.br_initial_quality);
				intent.putExtra("ID6", R.string.br_location);
				intent.putExtra("ID7", R.string.br_skill_descript1);
				intent.putExtra("ID8", R.string.br_skill_descript2);
				intent.putExtra("ID9", R.string.br_skill_descript3);
				intent.putExtra("ID10", R.string.br_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.br_skill_image1);
				intent.putExtra("ID13", R.drawable.br_skill_image2);
				intent.putExtra("ID14", R.drawable.br_skill_image3);
				intent.putExtra("ID15", R.drawable.br_skill_image4);
				intent.putExtra("ID16", 0);

				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		// *******************育母蜘蛛************************************

		// *******************地穴刺客************************************
		btDataConfig19 = new MyButton(context);
		btDataConfig19.setImageResource(R.drawable.na);
		btDataConfig19.setTextViewText("地穴刺客");

		// 获取包裹本按钮的容器
		llbtDataConfig19 = (LinearLayout) pageViews.get(1).findViewById(
				R.id.btn_na);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig19.addView(btDataConfig19);
		btDataConfig19.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.na_name);
				intent.putExtra("ID1", R.drawable.na_gif);
				intent.putExtra("ID2", R.string.na_liliang);
				intent.putExtra("ID3", R.string.na_minjie);
				intent.putExtra("ID4", R.string.na_zhili);
				intent.putExtra("ID5", R.string.na_initial_quality);
				intent.putExtra("ID6", R.string.na_location);
				intent.putExtra("ID7", R.string.na_skill_descript1);
				intent.putExtra("ID8", R.string.na_skill_descript2);
				intent.putExtra("ID9", R.string.na_skill_descript3);
				intent.putExtra("ID10", R.string.na_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.na_skill_image1);
				intent.putExtra("ID13", R.drawable.na_skill_image2);
				intent.putExtra("ID14", R.drawable.na_skill_image3);
				intent.putExtra("ID15", R.drawable.na_skill_image4);
				intent.putExtra("ID16", 0);

				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		// *******************地穴刺客************************************

		// *******************地穴编织者************************************
		btDataConfig20 = new MyButton(context);
		btDataConfig20.setImageResource(R.drawable.nw);
		btDataConfig20.setTextViewText("地穴编织者");

		// 获取包裹本按钮的容器
		llbtDataConfig20 = (LinearLayout) pageViews.get(1).findViewById(
				R.id.btn_nw);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig20.addView(btDataConfig20);
		btDataConfig20.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.nw_name);
				intent.putExtra("ID1", R.drawable.nw_gif);
				intent.putExtra("ID2", R.string.nw_liliang);
				intent.putExtra("ID3", R.string.nw_minjie);
				intent.putExtra("ID4", R.string.nw_zhili);
				intent.putExtra("ID5", R.string.nw_initial_quality);
				intent.putExtra("ID6", R.string.nw_location);
				intent.putExtra("ID7", R.string.nw_skill_descript1);
				intent.putExtra("ID8", R.string.nw_skill_descript2);
				intent.putExtra("ID9", R.string.nw_skill_descript3);
				intent.putExtra("ID10", R.string.nw_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.nw_skill_image1);
				intent.putExtra("ID13", R.drawable.nw_skill_image2);
				intent.putExtra("ID14", R.drawable.nw_skill_image3);
				intent.putExtra("ID15", R.drawable.nw_skill_image4);
				intent.putExtra("ID16", 0);

				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		// *******************地穴编织者************************************

		// *******************幻影刺客************************************
		btDataConfig21 = new MyButton(context);
		btDataConfig21.setImageResource(R.drawable.pa);
		btDataConfig21.setTextViewText("幻影刺客");

		// 获取包裹本按钮的容器
		llbtDataConfig21 = (LinearLayout) pageViews.get(1).findViewById(
				R.id.btn_pa);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig21.addView(btDataConfig21);
		btDataConfig21.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.pa_name);
				intent.putExtra("ID1", R.drawable.pa_gif);
				intent.putExtra("ID2", R.string.pa_liliang);
				intent.putExtra("ID3", R.string.pa_minjie);
				intent.putExtra("ID4", R.string.pa_zhili);
				intent.putExtra("ID5", R.string.pa_initial_quality);
				intent.putExtra("ID6", R.string.pa_location);
				intent.putExtra("ID7", R.string.pa_skill_descript1);
				intent.putExtra("ID8", R.string.pa_skill_descript2);
				intent.putExtra("ID9", R.string.pa_skill_descript3);
				intent.putExtra("ID10", R.string.pa_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.pa_skill_image1);
				intent.putExtra("ID13", R.drawable.pa_skill_image2);
				intent.putExtra("ID14", R.drawable.pa_skill_image3);
				intent.putExtra("ID15", R.drawable.pa_skill_image4);
				intent.putExtra("ID16", 0);

				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		// *******************幻影刺客************************************

		// *******************影魔************************************
		btDataConfig22 = new MyButton(context);
		btDataConfig22.setImageResource(R.drawable.sf);
		btDataConfig22.setTextViewText("影魔");

		// 获取包裹本按钮的容器
		llbtDataConfig22 = (LinearLayout) pageViews.get(1).findViewById(
				R.id.btn_sf);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig22.addView(btDataConfig22);
		btDataConfig22.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.sf_name);
				intent.putExtra("ID1", R.drawable.sf_gif);
				intent.putExtra("ID2", R.string.sf_liliang);
				intent.putExtra("ID3", R.string.sf_minjie);
				intent.putExtra("ID4", R.string.sf_zhili);
				intent.putExtra("ID5", R.string.sf_initial_quality);
				intent.putExtra("ID6", R.string.sf_location);
				intent.putExtra("ID7", R.string.sf_skill_descript1);
				intent.putExtra("ID8", R.string.sf_skill_descript2);
				intent.putExtra("ID9", R.string.sf_skill_descript3);
				intent.putExtra("ID10", R.string.sf_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.sf_skill_image1);
				intent.putExtra("ID13", R.drawable.sf_skill_image2);
				intent.putExtra("ID14", R.drawable.sf_skill_image3);
				intent.putExtra("ID15", R.drawable.sf_skill_image4);
				intent.putExtra("ID16", 0);

				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		// *******************影魔************************************

		// *******************灵魂守卫************************************
		btDataConfig23 = new MyButton(context);
		btDataConfig23.setImageResource(R.drawable.tb);
		btDataConfig23.setTextViewText("灵魂守卫");

		// 获取包裹本按钮的容器
		llbtDataConfig23 = (LinearLayout) pageViews.get(1).findViewById(
				R.id.btn_tb);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig23.addView(btDataConfig23);
		btDataConfig23.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.tb_name);
				intent.putExtra("ID1", R.drawable.tb_gif);
				intent.putExtra("ID2", R.string.tb_liliang);
				intent.putExtra("ID3", R.string.tb_minjie);
				intent.putExtra("ID4", R.string.tb_zhili);
				intent.putExtra("ID5", R.string.tb_initial_quality);
				intent.putExtra("ID6", R.string.tb_location);
				intent.putExtra("ID7", R.string.tb_skill_descript1);
				intent.putExtra("ID8", R.string.tb_skill_descript2);
				intent.putExtra("ID9", R.string.tb_skill_descript3);
				intent.putExtra("ID10", R.string.tb_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.tb_skill_image1);
				intent.putExtra("ID13", R.drawable.tb_skill_image2);
				intent.putExtra("ID14", R.drawable.tb_skill_image3);
				intent.putExtra("ID15", R.drawable.tb_skill_image4);
				intent.putExtra("ID16", 0);

				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		// *******************灵魂守卫************************************

		// *******************幽鬼************************************
		btDataConfig24 = new MyButton(context);
		btDataConfig24.setImageResource(R.drawable.spe);
		btDataConfig24.setTextViewText("幽鬼");

		// 获取包裹本按钮的容器
		llbtDataConfig24 = (LinearLayout) pageViews.get(1).findViewById(
				R.id.btn_spe);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig24.addView(btDataConfig24);
		btDataConfig24.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.spe_name);
				intent.putExtra("ID1", R.drawable.spe_gif);
				intent.putExtra("ID2", R.string.spe_liliang);
				intent.putExtra("ID3", R.string.spe_minjie);
				intent.putExtra("ID4", R.string.spe_zhili);
				intent.putExtra("ID5", R.string.spe_initial_quality);
				intent.putExtra("ID6", R.string.spe_location);
				intent.putExtra("ID7", R.string.spe_skill_descript1);
				intent.putExtra("ID8", R.string.spe_skill_descript2);
				intent.putExtra("ID9", R.string.spe_skill_descript3);
				intent.putExtra("ID10", R.string.spe_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.spe_skill_image1);
				intent.putExtra("ID13", R.drawable.spe_skill_image2);
				intent.putExtra("ID14", R.drawable.spe_skill_image3);
				intent.putExtra("ID15", R.drawable.spe_skill_image4);
				intent.putExtra("ID16", 0);

				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		// *******************幽鬼************************************

		// *******************剧毒术士************************************
		btDataConfig25 = new MyButton(context);
		btDataConfig25.setImageResource(R.drawable.veno);
		btDataConfig25.setTextViewText("剧毒术士");

		// 获取包裹本按钮的容器
		llbtDataConfig25 = (LinearLayout) pageViews.get(1).findViewById(
				R.id.btn_veno);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig25.addView(btDataConfig25);
		btDataConfig25.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.veno_name);
				intent.putExtra("ID1", R.drawable.veno_gif);
				intent.putExtra("ID2", R.string.veno_liliang);
				intent.putExtra("ID3", R.string.veno_minjie);
				intent.putExtra("ID4", R.string.veno_zhili);
				intent.putExtra("ID5", R.string.veno_initial_quality);
				intent.putExtra("ID6", R.string.veno_location);
				intent.putExtra("ID7", R.string.veno_skill_descript1);
				intent.putExtra("ID8", R.string.veno_skill_descript2);
				intent.putExtra("ID9", R.string.veno_skill_descript3);
				intent.putExtra("ID10", R.string.veno_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.veno_skill_image1);
				intent.putExtra("ID13", R.drawable.veno_skill_image2);
				intent.putExtra("ID14", R.drawable.veno_skill_image3);
				intent.putExtra("ID15", R.drawable.veno_skill_image4);
				intent.putExtra("ID16", 0);

				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		// *******************剧毒术士************************************

		// *******************冥界亚龙************************************
		btDataConfig26 = new MyButton(context);
		btDataConfig26.setImageResource(R.drawable.vip);
		btDataConfig26.setTextViewText("冥界亚龙");

		// 获取包裹本按钮的容器
		llbtDataConfig26 = (LinearLayout) pageViews.get(1).findViewById(
				R.id.btn_vip);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig26.addView(btDataConfig26);
		btDataConfig26.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.vip_name);
				intent.putExtra("ID1", R.drawable.vip_gif);
				intent.putExtra("ID2", R.string.vip_liliang);
				intent.putExtra("ID3", R.string.vip_minjie);
				intent.putExtra("ID4", R.string.vip_zhili);
				intent.putExtra("ID5", R.string.vip_initial_quality);
				intent.putExtra("ID6", R.string.vip_location);
				intent.putExtra("ID7", R.string.vip_skill_descript1);
				intent.putExtra("ID8", R.string.vip_skill_descript2);
				intent.putExtra("ID9", R.string.vip_skill_descript3);
				intent.putExtra("ID10", R.string.vip_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.vip_skill_image1);
				intent.putExtra("ID13", R.drawable.vip_skill_image2);
				intent.putExtra("ID14", R.drawable.vip_skill_image3);
				intent.putExtra("ID15", R.drawable.vip_skill_image4);
				intent.putExtra("ID16", 0);

				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		// *******************冥界亚龙************************************

		// *******************地卜师************************************
		btDataConfig27 = new MyButton(context);
		btDataConfig27.setImageResource(R.drawable.meepo);
		btDataConfig27.setTextViewText("地卜师");

		// 获取包裹本按钮的容器
		llbtDataConfig27 = (LinearLayout) pageViews.get(1).findViewById(
				R.id.btn_meepo);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig27.addView(btDataConfig27);
		btDataConfig27.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.meepo_name);
				intent.putExtra("ID1", R.drawable.meepo_gif);
				intent.putExtra("ID2", R.string.meepo_liliang);
				intent.putExtra("ID3", R.string.meepo_minjie);
				intent.putExtra("ID4", R.string.meepo_zhili);
				intent.putExtra("ID5", R.string.meepo_initial_quality);
				intent.putExtra("ID6", R.string.meepo_location);
				intent.putExtra("ID7", R.string.meepo_skill_descript1);
				intent.putExtra("ID8", R.string.meepo_skill_descript2);
				intent.putExtra("ID9", R.string.meepo_skill_descript3);
				intent.putExtra("ID10", R.string.meepo_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.meepo_skill_image1);
				intent.putExtra("ID13", R.drawable.meepo_skill_image2);
				intent.putExtra("ID14", R.drawable.meepo_skill_image3);
				intent.putExtra("ID15", R.drawable.meepo_skill_image4);
				intent.putExtra("ID16", 0);

				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		// *******************地卜师************************************

		// *******************闪电幽魂************************************
		btDataConfig28 = new MyButton(context);
		btDataConfig28.setImageResource(R.drawable.razor);
		btDataConfig28.setTextViewText("闪电幽魂");

		// 获取包裹本按钮的容器
		llbtDataConfig28 = (LinearLayout) pageViews.get(1).findViewById(
				R.id.btn_razor);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig28.addView(btDataConfig28);
		btDataConfig28.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.razor_name);
				intent.putExtra("ID1", R.drawable.razor_gif);
				intent.putExtra("ID2", R.string.razor_liliang);
				intent.putExtra("ID3", R.string.razor_minjie);
				intent.putExtra("ID4", R.string.razor_zhili);
				intent.putExtra("ID5", R.string.razor_initial_quality);
				intent.putExtra("ID6", R.string.razor_location);
				intent.putExtra("ID7", R.string.razor_skill_descript1);
				intent.putExtra("ID8", R.string.razor_skill_descript2);
				intent.putExtra("ID9", R.string.razor_skill_descript3);
				intent.putExtra("ID10", R.string.razor_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.razor_skill_image1);
				intent.putExtra("ID13", R.drawable.razor_skill_image2);
				intent.putExtra("ID14", R.drawable.razor_skill_image3);
				intent.putExtra("ID15", R.drawable.razor_skill_image4);
				intent.putExtra("ID16", 0);

				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		// *******************闪电幽魂************************************

		// *******************鱼人夜行者************************************
		btDataConfig29 = new MyButton(context);
		btDataConfig29.setImageResource(R.drawable.nc);
		btDataConfig29.setTextViewText("鱼人夜行者");

		// 获取包裹本按钮的容器
		llbtDataConfig29 = (LinearLayout) pageViews.get(1).findViewById(
				R.id.btn_nc);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig29.addView(btDataConfig29);
		btDataConfig29.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.nc_name);
				intent.putExtra("ID1", R.drawable.nc_gif);
				intent.putExtra("ID2", R.string.nc_liliang);
				intent.putExtra("ID3", R.string.nc_minjie);
				intent.putExtra("ID4", R.string.nc_zhili);
				intent.putExtra("ID5", R.string.nc_initial_quality);
				intent.putExtra("ID6", R.string.nc_location);
				intent.putExtra("ID7", R.string.nc_skill_descript1);
				intent.putExtra("ID8", R.string.nc_skill_descript2);
				intent.putExtra("ID9", R.string.nc_skill_descript3);
				intent.putExtra("ID10", R.string.nc_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.nc_skill_image1);
				intent.putExtra("ID13", R.drawable.nc_skill_image2);
				intent.putExtra("ID14", R.drawable.nc_skill_image3);
				intent.putExtra("ID15", R.drawable.nc_skill_image4);
				intent.putExtra("ID16", 0);

				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		// *******************鱼人夜行者************************************

		// *******************虚空假面************************************
		btDataConfig30 = new MyButton(context);
		btDataConfig30.setImageResource(R.drawable.fv);
		btDataConfig30.setTextViewText("虚空假面");

		// 获取包裹本按钮的容器
		llbtDataConfig30 = (LinearLayout) pageViews.get(1).findViewById(
				R.id.btn_fv);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig30.addView(btDataConfig30);
		btDataConfig30.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.fv_name);
				intent.putExtra("ID1", R.drawable.fv_gif);
				intent.putExtra("ID2", R.string.fv_liliang);
				intent.putExtra("ID3", R.string.fv_minjie);
				intent.putExtra("ID4", R.string.fv_zhili);
				intent.putExtra("ID5", R.string.fv_initial_quality);
				intent.putExtra("ID6", R.string.fv_location);
				intent.putExtra("ID7", R.string.fv_skill_descript1);
				intent.putExtra("ID8", R.string.fv_skill_descript2);
				intent.putExtra("ID9", R.string.fv_skill_descript3);
				intent.putExtra("ID10", R.string.fv_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.fv_skill_image1);
				intent.putExtra("ID13", R.drawable.fv_skill_image2);
				intent.putExtra("ID14", R.drawable.fv_skill_image3);
				intent.putExtra("ID15", R.drawable.fv_skill_image4);
				intent.putExtra("ID16", 0);

				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		// *******************虚空假面************************************

		// *******************美杜莎************************************
		btDataConfig31 = new MyButton(context);
		btDataConfig31.setImageResource(R.drawable.med);
		btDataConfig31.setTextViewText("美杜莎");

		// 获取包裹本按钮的容器
		llbtDataConfig31 = (LinearLayout) pageViews.get(1).findViewById(
				R.id.btn_med);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig31.addView(btDataConfig31);
		btDataConfig31.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.med_name);
				intent.putExtra("ID1", R.drawable.med_gif);
				intent.putExtra("ID2", R.string.med_liliang);
				intent.putExtra("ID3", R.string.med_minjie);
				intent.putExtra("ID4", R.string.med_zhili);
				intent.putExtra("ID5", R.string.med_initial_quality);
				intent.putExtra("ID6", R.string.med_location);
				intent.putExtra("ID7", R.string.med_skill_descript1);
				intent.putExtra("ID8", R.string.med_skill_descript2);
				intent.putExtra("ID9", R.string.med_skill_descript3);
				intent.putExtra("ID10", R.string.med_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.med_skill_image1);
				intent.putExtra("ID13", R.drawable.med_skill_image2);
				intent.putExtra("ID14", R.drawable.med_skill_image3);
				intent.putExtra("ID15", R.drawable.med_skill_image4);
				intent.putExtra("ID16", 0);

				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		// *******************美杜莎************************************

		// ************************智力型英雄***************************

		// *******************痛苦之源************************************
		btDataConfig32 = new MyButton(context);
		btDataConfig32.setImageResource(R.drawable.bane);
		btDataConfig32.setTextViewText("痛苦之源");

		// 获取包裹本按钮的容器
		llbtDataConfig32 = (LinearLayout) pageViews.get(2).findViewById(
				R.id.btn_bane);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig32.addView(btDataConfig32);
		btDataConfig32.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.bane_name);
				intent.putExtra("ID1", R.drawable.bane_gif);
				intent.putExtra("ID2", R.string.bane_liliang);
				intent.putExtra("ID3", R.string.bane_minjie);
				intent.putExtra("ID4", R.string.bane_zhili);
				intent.putExtra("ID5", R.string.bane_initial_quality);
				intent.putExtra("ID6", R.string.bane_location);
				intent.putExtra("ID7", R.string.bane_skill_descript1);
				intent.putExtra("ID8", R.string.bane_skill_descript2);
				intent.putExtra("ID9", R.string.bane_skill_descript3);
				intent.putExtra("ID10", R.string.bane_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.bane_skill_image1);
				intent.putExtra("ID13", R.drawable.bane_skill_image2);
				intent.putExtra("ID14", R.drawable.bane_skill_image3);
				intent.putExtra("ID15", R.drawable.bane_skill_image4);
				intent.putExtra("ID16", 0);

				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		// *******************痛苦之源************************************

		// *******************黑暗贤者************************************
		btDataConfig33 = new MyButton(context);
		btDataConfig33.setImageResource(R.drawable.ds);
		btDataConfig33.setTextViewText("黑暗贤者");

		// 获取包裹本按钮的容器
		llbtDataConfig33 = (LinearLayout) pageViews.get(2).findViewById(
				R.id.btn_ds);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig33.addView(btDataConfig33);
		btDataConfig33.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.ds_name);
				intent.putExtra("ID1", R.drawable.ds_gif);
				intent.putExtra("ID2", R.string.ds_liliang);
				intent.putExtra("ID3", R.string.ds_minjie);
				intent.putExtra("ID4", R.string.ds_zhili);
				intent.putExtra("ID5", R.string.ds_initial_quality);
				intent.putExtra("ID6", R.string.ds_location);
				intent.putExtra("ID7", R.string.ds_skill_descript1);
				intent.putExtra("ID8", R.string.ds_skill_descript2);
				intent.putExtra("ID9", R.string.ds_skill_descript3);
				intent.putExtra("ID10", R.string.ds_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.ds_skill_image1);
				intent.putExtra("ID13", R.drawable.ds_skill_image2);
				intent.putExtra("ID14", R.drawable.ds_skill_image3);
				intent.putExtra("ID15", R.drawable.ds_skill_image4);
				intent.putExtra("ID16", 0);

				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		// *******************黑暗贤者************************************

		// *******************死亡先知************************************
		btDataConfig34 = new MyButton(context);
		btDataConfig34.setImageResource(R.drawable.dp);
		btDataConfig34.setTextViewText("死亡先知");

		// 获取包裹本按钮的容器
		llbtDataConfig34 = (LinearLayout) pageViews.get(2).findViewById(
				R.id.btn_dp);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig34.addView(btDataConfig34);
		btDataConfig34.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.dp_name);
				intent.putExtra("ID1", R.drawable.dp_gif);
				intent.putExtra("ID2", R.string.dp_liliang);
				intent.putExtra("ID3", R.string.dp_minjie);
				intent.putExtra("ID4", R.string.dp_zhili);
				intent.putExtra("ID5", R.string.dp_initial_quality);
				intent.putExtra("ID6", R.string.dp_location);
				intent.putExtra("ID7", R.string.dp_skill_descript1);
				intent.putExtra("ID8", R.string.dp_skill_descript2);
				intent.putExtra("ID9", R.string.dp_skill_descript3);
				intent.putExtra("ID10", R.string.dp_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.dp_skill_image1);
				intent.putExtra("ID13", R.drawable.dp_skill_image2);
				intent.putExtra("ID14", R.drawable.dp_skill_image3);
				intent.putExtra("ID15", R.drawable.dp_skill_image4);
				intent.putExtra("ID16", 0);

				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		// *******************死亡先知************************************

		// *******************恶魔巫师************************************
		btDataConfig35 = new MyButton(context);
		btDataConfig35.setImageResource(R.drawable.lion);
		btDataConfig35.setTextViewText("恶魔巫师");

		// 获取包裹本按钮的容器
		llbtDataConfig35 = (LinearLayout) pageViews.get(2).findViewById(
				R.id.btn_lion);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig35.addView(btDataConfig35);
		btDataConfig35.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.lion_name);
				intent.putExtra("ID1", R.drawable.lion_gif);
				intent.putExtra("ID2", R.string.lion_liliang);
				intent.putExtra("ID3", R.string.lion_minjie);
				intent.putExtra("ID4", R.string.lion_zhili);
				intent.putExtra("ID5", R.string.lion_initial_quality);
				intent.putExtra("ID6", R.string.lion_location);
				intent.putExtra("ID7", R.string.lion_skill_descript1);
				intent.putExtra("ID8", R.string.lion_skill_descript2);
				intent.putExtra("ID9", R.string.lion_skill_descript3);
				intent.putExtra("ID10", R.string.lion_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.lion_skill_image1);
				intent.putExtra("ID13", R.drawable.lion_skill_image2);
				intent.putExtra("ID14", R.drawable.lion_skill_image3);
				intent.putExtra("ID15", R.drawable.lion_skill_image4);
				intent.putExtra("ID16", 0);

				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		// *******************恶魔巫师************************************

		// *******************谜团************************************
		btDataConfig36 = new MyButton(context);
		btDataConfig36.setImageResource(R.drawable.em);
		btDataConfig36.setTextViewText("谜团");

		// 获取包裹本按钮的容器
		llbtDataConfig36 = (LinearLayout) pageViews.get(2).findViewById(
				R.id.btn_em);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig36.addView(btDataConfig36);
		btDataConfig36.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.em_name);
				intent.putExtra("ID1", R.drawable.em_gif);
				intent.putExtra("ID2", R.string.em_liliang);
				intent.putExtra("ID3", R.string.em_minjie);
				intent.putExtra("ID4", R.string.em_zhili);
				intent.putExtra("ID5", R.string.em_initial_quality);
				intent.putExtra("ID6", R.string.em_location);
				intent.putExtra("ID7", R.string.em_skill_descript1);
				intent.putExtra("ID8", R.string.em_skill_descript2);
				intent.putExtra("ID9", R.string.em_skill_descript3);
				intent.putExtra("ID10", R.string.em_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.em_skill_image1);
				intent.putExtra("ID13", R.drawable.em_skill_image2);
				intent.putExtra("ID14", R.drawable.em_skill_image3);
				intent.putExtra("ID15", R.drawable.em_skill_image4);
				intent.putExtra("ID16", 0);

				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		// *******************谜团************************************

		// *******************巫妖************************************
		btDataConfig37 = new MyButton(context);
		btDataConfig37.setImageResource(R.drawable.lich);
		btDataConfig37.setTextViewText("巫妖");

		// 获取包裹本按钮的容器
		llbtDataConfig37 = (LinearLayout) pageViews.get(2).findViewById(
				R.id.btn_lich);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig37.addView(btDataConfig37);
		btDataConfig37.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.lich_name);
				intent.putExtra("ID1", R.drawable.lich_gif);
				intent.putExtra("ID2", R.string.lich_liliang);
				intent.putExtra("ID3", R.string.lich_minjie);
				intent.putExtra("ID4", R.string.lich_zhili);
				intent.putExtra("ID5", R.string.lich_initial_quality);
				intent.putExtra("ID6", R.string.lich_location);
				intent.putExtra("ID7", R.string.lich_skill_descript1);
				intent.putExtra("ID8", R.string.lich_skill_descript2);
				intent.putExtra("ID9", R.string.lich_skill_descript3);
				intent.putExtra("ID10", R.string.lich_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.lich_skill_image1);
				intent.putExtra("ID13", R.drawable.lich_skill_image2);
				intent.putExtra("ID14", R.drawable.lich_skill_image3);
				intent.putExtra("ID15", R.drawable.lich_skill_image4);
				intent.putExtra("ID16", 0);

				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		// *******************巫妖************************************

		// *******************死灵法师************************************
		btDataConfig38 = new MyButton(context);
		btDataConfig38.setImageResource(R.drawable.nec);
		btDataConfig38.setTextViewText("死灵法师");

		// 获取包裹本按钮的容器
		llbtDataConfig38 = (LinearLayout) pageViews.get(2).findViewById(
				R.id.btn_nec);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig38.addView(btDataConfig38);
		btDataConfig38.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.nec_name);
				intent.putExtra("ID1", R.drawable.nec_gif);
				intent.putExtra("ID2", R.string.nec_liliang);
				intent.putExtra("ID3", R.string.nec_minjie);
				intent.putExtra("ID4", R.string.nec_zhili);
				intent.putExtra("ID5", R.string.nec_initial_quality);
				intent.putExtra("ID6", R.string.nec_location);
				intent.putExtra("ID7", R.string.nec_skill_descript1);
				intent.putExtra("ID8", R.string.nec_skill_descript2);
				intent.putExtra("ID9", R.string.nec_skill_descript3);
				intent.putExtra("ID10", R.string.nec_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.nec_skill_image1);
				intent.putExtra("ID13", R.drawable.nec_skill_image2);
				intent.putExtra("ID14", R.drawable.nec_skill_image3);
				intent.putExtra("ID15", R.drawable.nec_skill_image4);
				intent.putExtra("ID16", 0);

				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		// *******************死灵法师************************************

		// *******************遗忘法师************************************
		btDataConfig39 = new MyButton(context);
		btDataConfig39.setImageResource(R.drawable.pugna);
		btDataConfig39.setTextViewText("遗忘法师");

		// 获取包裹本按钮的容器
		llbtDataConfig39 = (LinearLayout) pageViews.get(2).findViewById(
				R.id.btn_pugna);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig39.addView(btDataConfig39);
		btDataConfig39.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.pugna_name);
				intent.putExtra("ID1", R.drawable.pugna_gif);
				intent.putExtra("ID2", R.string.pugna_liliang);
				intent.putExtra("ID3", R.string.pugna_minjie);
				intent.putExtra("ID4", R.string.pugna_zhili);
				intent.putExtra("ID5", R.string.pugna_initial_quality);
				intent.putExtra("ID6", R.string.pugna_location);
				intent.putExtra("ID7", R.string.pugna_skill_descript1);
				intent.putExtra("ID8", R.string.pugna_skill_descript2);
				intent.putExtra("ID9", R.string.pugna_skill_descript3);
				intent.putExtra("ID10", R.string.pugna_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.pugna_skill_image1);
				intent.putExtra("ID13", R.drawable.pugna_skill_image2);
				intent.putExtra("ID14", R.drawable.pugna_skill_image3);
				intent.putExtra("ID15", R.drawable.pugna_skill_image4);
				intent.putExtra("ID16", 0);

				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		// *******************遗忘法师************************************

		// *******************黑曜毁灭者************************************
		btDataConfig40 = new MyButton(context);
		btDataConfig40.setImageResource(R.drawable.od);
		btDataConfig40.setTextViewText("黑曜毁灭者");

		// 获取包裹本按钮的容器
		llbtDataConfig40 = (LinearLayout) pageViews.get(2).findViewById(
				R.id.btn_od);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig40.addView(btDataConfig40);
		btDataConfig40.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.od_name);
				intent.putExtra("ID1", R.drawable.od_gif);
				intent.putExtra("ID2", R.string.od_liliang);
				intent.putExtra("ID3", R.string.od_minjie);
				intent.putExtra("ID4", R.string.od_zhili);
				intent.putExtra("ID5", R.string.od_initial_quality);
				intent.putExtra("ID6", R.string.od_location);
				intent.putExtra("ID7", R.string.od_skill_descript1);
				intent.putExtra("ID8", R.string.od_skill_descript2);
				intent.putExtra("ID9", R.string.od_skill_descript3);
				intent.putExtra("ID10", R.string.od_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.od_skill_image1);
				intent.putExtra("ID13", R.drawable.od_skill_image2);
				intent.putExtra("ID14", R.drawable.od_skill_image3);
				intent.putExtra("ID15", R.drawable.od_skill_image4);
				intent.putExtra("ID16", 0);

				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		// *******************黑曜毁灭者************************************

		// *******************痛苦女王************************************
		btDataConfig41 = new MyButton(context);
		btDataConfig41.setImageResource(R.drawable.qop);
		btDataConfig41.setTextViewText("痛苦女王");

		// 获取包裹本按钮的容器
		llbtDataConfig41 = (LinearLayout) pageViews.get(2).findViewById(
				R.id.btn_qop);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig41.addView(btDataConfig41);
		btDataConfig41.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.qop_name);
				intent.putExtra("ID1", R.drawable.qop_gif);
				intent.putExtra("ID2", R.string.qop_liliang);
				intent.putExtra("ID3", R.string.qop_minjie);
				intent.putExtra("ID4", R.string.qop_zhili);
				intent.putExtra("ID5", R.string.qop_initial_quality);
				intent.putExtra("ID6", R.string.qop_location);
				intent.putExtra("ID7", R.string.qop_skill_descript1);
				intent.putExtra("ID8", R.string.qop_skill_descript2);
				intent.putExtra("ID9", R.string.qop_skill_descript3);
				intent.putExtra("ID10", R.string.qop_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.qop_skill_image1);
				intent.putExtra("ID13", R.drawable.qop_skill_image2);
				intent.putExtra("ID14", R.drawable.qop_skill_image3);
				intent.putExtra("ID15", R.drawable.qop_skill_image4);
				intent.putExtra("ID16", 0);

				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		// *******************痛苦女王************************************

		// *******************术士************************************
		btDataConfig42 = new MyButton(context);
		btDataConfig42.setImageResource(R.drawable.wl);
		btDataConfig42.setTextViewText("术士");

		// 获取包裹本按钮的容器
		llbtDataConfig42 = (LinearLayout) pageViews.get(2).findViewById(
				R.id.btn_wl);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig42.addView(btDataConfig42);
		btDataConfig42.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.wl_name);
				intent.putExtra("ID1", R.drawable.wl_gif);
				intent.putExtra("ID2", R.string.wl_liliang);
				intent.putExtra("ID3", R.string.wl_minjie);
				intent.putExtra("ID4", R.string.wl_zhili);
				intent.putExtra("ID5", R.string.wl_initial_quality);
				intent.putExtra("ID6", R.string.wl_location);
				intent.putExtra("ID7", R.string.wl_skill_descript1);
				intent.putExtra("ID8", R.string.wl_skill_descript2);
				intent.putExtra("ID9", R.string.wl_skill_descript3);
				intent.putExtra("ID10", R.string.wl_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.wl_skill_image1);
				intent.putExtra("ID13", R.drawable.wl_skill_image2);
				intent.putExtra("ID14", R.drawable.wl_skill_image3);
				intent.putExtra("ID15", R.drawable.wl_skill_image4);
				intent.putExtra("ID16", 0);

				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		// *******************术士************************************

		// *******************暗影恶魔************************************
		btDataConfig43 = new MyButton(context);
		btDataConfig43.setImageResource(R.drawable.sd);
		btDataConfig43.setTextViewText("暗影恶魔");

		// 获取包裹本按钮的容器
		llbtDataConfig43 = (LinearLayout) pageViews.get(2).findViewById(
				R.id.btn_sd);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig43.addView(btDataConfig43);
		btDataConfig43.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.sd_name);
				intent.putExtra("ID1", R.drawable.sd_gif);
				intent.putExtra("ID2", R.string.sd_liliang);
				intent.putExtra("ID3", R.string.sd_minjie);
				intent.putExtra("ID4", R.string.sd_zhili);
				intent.putExtra("ID5", R.string.sd_initial_quality);
				intent.putExtra("ID6", R.string.sd_location);
				intent.putExtra("ID7", R.string.sd_skill_descript1);
				intent.putExtra("ID8", R.string.sd_skill_descript2);
				intent.putExtra("ID9", R.string.sd_skill_descript3);
				intent.putExtra("ID10", R.string.sd_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.sd_skill_image1);
				intent.putExtra("ID13", R.drawable.sd_skill_image2);
				intent.putExtra("ID14", R.drawable.sd_skill_image3);
				intent.putExtra("ID15", R.drawable.sd_skill_image4);
				intent.putExtra("ID16", 0);

				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		// *******************暗影恶魔************************************

		// *******************蝙蝠骑士************************************
		btDataConfig44 = new MyButton(context);
		btDataConfig44.setImageResource(R.drawable.bat);
		btDataConfig44.setTextViewText("蝙蝠骑士");

		// 获取包裹本按钮的容器
		llbtDataConfig44 = (LinearLayout) pageViews.get(2).findViewById(
				R.id.btn_bat);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig44.addView(btDataConfig44);
		btDataConfig44.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.bat_name);
				intent.putExtra("ID1", R.drawable.bat_gif);
				intent.putExtra("ID2", R.string.bat_liliang);
				intent.putExtra("ID3", R.string.bat_minjie);
				intent.putExtra("ID4", R.string.bat_zhili);
				intent.putExtra("ID5", R.string.bat_initial_quality);
				intent.putExtra("ID6", R.string.bat_location);
				intent.putExtra("ID7", R.string.bat_skill_descript1);
				intent.putExtra("ID8", R.string.bat_skill_descript2);
				intent.putExtra("ID9", R.string.bat_skill_descript3);
				intent.putExtra("ID10", R.string.bat_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.bat_skill_image1);
				intent.putExtra("ID13", R.drawable.bat_skill_image2);
				intent.putExtra("ID14", R.drawable.bat_skill_image3);
				intent.putExtra("ID15", R.drawable.bat_skill_image4);
				intent.putExtra("ID16", 0);

				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		// *******************蝙蝠骑士************************************

		// *******************暗影牧师************************************
		btDataConfig45 = new MyButton(context);
		btDataConfig45.setImageResource(R.drawable.sp);
		btDataConfig45.setTextViewText("暗影牧师");

		// 获取包裹本按钮的容器
		llbtDataConfig45 = (LinearLayout) pageViews.get(2).findViewById(
				R.id.btn_sp);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig45.addView(btDataConfig45);
		btDataConfig45.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.sp_name);
				intent.putExtra("ID1", R.drawable.sp_gif);
				intent.putExtra("ID2", R.string.sp_liliang);
				intent.putExtra("ID3", R.string.sp_minjie);
				intent.putExtra("ID4", R.string.sp_zhili);
				intent.putExtra("ID5", R.string.sp_initial_quality);
				intent.putExtra("ID6", R.string.sp_location);
				intent.putExtra("ID7", R.string.sp_skill_descript1);
				intent.putExtra("ID8", R.string.sp_skill_descript2);
				intent.putExtra("ID9", R.string.sp_skill_descript3);
				intent.putExtra("ID10", R.string.sp_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.sp_skill_image1);
				intent.putExtra("ID13", R.drawable.sp_skill_image2);
				intent.putExtra("ID14", R.drawable.sp_skill_image3);
				intent.putExtra("ID15", R.drawable.sp_skill_image4);
				intent.putExtra("ID16", 0);

				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		// *******************暗影牧师************************************

		// *******************死灵飞龙************************************
		btDataConfig46 = new MyButton(context);
		btDataConfig46.setImageResource(R.drawable.vis);
		btDataConfig46.setTextViewText("死灵飞龙");

		// 获取包裹本按钮的容器
		llbtDataConfig46 = (LinearLayout) pageViews.get(2).findViewById(
				R.id.btn_vis);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig46.addView(btDataConfig46);
		btDataConfig46.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.vis_name);
				intent.putExtra("ID1", R.drawable.vis_gif);
				intent.putExtra("ID2", R.string.vis_liliang);
				intent.putExtra("ID3", R.string.vis_minjie);
				intent.putExtra("ID4", R.string.vis_zhili);
				intent.putExtra("ID5", R.string.vis_initial_quality);
				intent.putExtra("ID6", R.string.vis_location);
				intent.putExtra("ID7", R.string.vis_skill_descript1);
				intent.putExtra("ID8", R.string.vis_skill_descript2);
				intent.putExtra("ID9", R.string.vis_skill_descript3);
				intent.putExtra("ID10", R.string.vis_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.vis_skill_image1);
				intent.putExtra("ID13", R.drawable.vis_skill_image2);
				intent.putExtra("ID14", R.drawable.vis_skill_image3);
				intent.putExtra("ID15", R.drawable.vis_skill_image4);
				intent.putExtra("ID16", 0);

				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		// *******************死灵飞龙************************************

		// *******************受折磨的灵魂************************************
		btDataConfig47 = new MyButton(context);
		btDataConfig47.setImageResource(R.drawable.ts);
		btDataConfig47.setTextViewText("受折磨的灵魂");

		// 获取包裹本按钮的容器
		llbtDataConfig47 = (LinearLayout) pageViews.get(2).findViewById(
				R.id.btn_ts);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig47.addView(btDataConfig47);
		btDataConfig47.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.ts_name);
				intent.putExtra("ID1", R.drawable.ts_gif);
				intent.putExtra("ID2", R.string.ts_liliang);
				intent.putExtra("ID3", R.string.ts_minjie);
				intent.putExtra("ID4", R.string.ts_zhili);
				intent.putExtra("ID5", R.string.ts_initial_quality);
				intent.putExtra("ID6", R.string.ts_location);
				intent.putExtra("ID7", R.string.ts_skill_descript1);
				intent.putExtra("ID8", R.string.ts_skill_descript2);
				intent.putExtra("ID9", R.string.ts_skill_descript3);
				intent.putExtra("ID10", R.string.ts_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.ts_skill_image1);
				intent.putExtra("ID13", R.drawable.ts_skill_image2);
				intent.putExtra("ID14", R.drawable.ts_skill_image3);
				intent.putExtra("ID15", R.drawable.ts_skill_image4);
				intent.putExtra("ID16", 0);

				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		// *******************受折磨的灵魂************************************

		// *******************巫医************************************
		btDataConfig48 = new MyButton(context);
		btDataConfig48.setImageResource(R.drawable.wd);
		btDataConfig48.setTextViewText("巫医");

		// 获取包裹本按钮的容器
		llbtDataConfig48 = (LinearLayout) pageViews.get(2).findViewById(
				R.id.btn_wd);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig48.addView(btDataConfig48);
		btDataConfig48.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.wd_name);
				intent.putExtra("ID1", R.drawable.wd_gif);
				intent.putExtra("ID2", R.string.wd_liliang);
				intent.putExtra("ID3", R.string.wd_minjie);
				intent.putExtra("ID4", R.string.wd_zhili);
				intent.putExtra("ID5", R.string.wd_initial_quality);
				intent.putExtra("ID6", R.string.wd_location);
				intent.putExtra("ID7", R.string.wd_skill_descript1);
				intent.putExtra("ID8", R.string.wd_skill_descript2);
				intent.putExtra("ID9", R.string.wd_skill_descript3);
				intent.putExtra("ID10", R.string.wd_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.wd_skill_image1);
				intent.putExtra("ID13", R.drawable.wd_skill_image2);
				intent.putExtra("ID14", R.drawable.wd_skill_image3);
				intent.putExtra("ID15", R.drawable.wd_skill_image4);
				intent.putExtra("ID16", 0);

				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		// *******************巫医************************************

		// *******************极寒幽魂************************************
		btDataConfig49 = new MyButton(context);
		btDataConfig49.setImageResource(R.drawable.aa);
		btDataConfig49.setTextViewText("极寒幽魂");

		// 获取包裹本按钮的容器
		llbtDataConfig49 = (LinearLayout) pageViews.get(2).findViewById(
				R.id.btn_aa);

		// 将我们自定义的Button添加进这个容器
		llbtDataConfig49.addView(btDataConfig49);
		btDataConfig49.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();

				intent.putExtra("ID0", R.string.aa_name);
				intent.putExtra("ID1", R.drawable.aa_gif);
				intent.putExtra("ID2", R.string.aa_liliang);
				intent.putExtra("ID3", R.string.aa_minjie);
				intent.putExtra("ID4", R.string.aa_zhili);
				intent.putExtra("ID5", R.string.aa_initial_quality);
				intent.putExtra("ID6", R.string.aa_location);
				intent.putExtra("ID7", R.string.aa_skill_descript1);
				intent.putExtra("ID8", R.string.aa_skill_descript2);
				intent.putExtra("ID9", R.string.aa_skill_descript3);
				intent.putExtra("ID10", R.string.aa_skill_descript4);
				intent.putExtra("ID11", 0);
				intent.putExtra("ID12", R.drawable.aa_skill_image1);
				intent.putExtra("ID13", R.drawable.aa_skill_image2);
				intent.putExtra("ID14", R.drawable.aa_skill_image3);
				intent.putExtra("ID15", R.drawable.aa_skill_image4);
				intent.putExtra("ID16", 0);

				intent.setClass(context, HerodisplayActivity.class);
				startActivity(intent);
			}
		});
		// *******************极寒幽魂************************************

		// *******************************************button空间下界****************************************
		setContentView(tz);
		
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
			Toast.makeText(getApplicationContext(), "左右滑动查看更多英雄", Toast.LENGTH_SHORT).show();
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
			startActivity(new Intent(TzActivity.this,
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
		new AlertDialog.Builder(TzActivity.this)
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
