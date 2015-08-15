package com.pgw.viewpagerdemo;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.view.View;

public class MainActivity extends FragmentActivity {
	private ViewPager mPager;
	private PagerTabStrip mTitile;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
//		1.初始化ViewPager
		mPager=(ViewPager) findViewById(R.id.viewPager);
//		2.初始化ViewPager中的所有页面
		List<View> viewList=getData();
//		初始化所有的Fragment
		List<Fragment> fragmentList=getFragmentData();
		
//		初始化标题
		initPagerTabStrip();
		
//		3.初始化title数据
		List<String> tatileList=getTatileData();
//		4.创建ViewPager适配器
//		MyPagerAdapter adapter=new MyPagerAdapter(viewList,tatileData);
		
//		创建FragmentPagerAdatper
		MyFragmentPagerAdapter adapter=new MyFragmentPagerAdapter(getSupportFragmentManager(),fragmentList,tatileList);
//		5.给ViewPager设置适配器
		mPager.setAdapter(adapter);
		
		
	}
	/**
	 * 初始化标题
	 */
	private void initPagerTabStrip() {
		// TODO Auto-generated method stub
//		初始化PagerTabStrip
		mTitile=(PagerTabStrip)findViewById(R.id.tab);
//		设置背景色
		mTitile.setBackgroundColor(Color.GRAY);
//		设置字体颜色
		mTitile.setTextColor(Color.RED);
//		设置是否绘制下划线
		mTitile.setDrawFullUnderline(false);
//		设置指示器颜色
		mTitile.setTabIndicatorColor(0xff999999);
	}
	/**
	 * 初始化所有的Fragment
	 * @return
	 */
	private List<Fragment> getFragmentData() {
		List<Fragment> list=new ArrayList<Fragment>();
		list.add(new Fragment1());
		list.add(new Fragment2());
		list.add(new Fragment3());
		list.add(new Fragment4());
		
		return list;
	}
	/**
	 * 获取所有的标题
	 * @return
	 */
	private List<String> getTatileData() {
		List<String> list=new ArrayList<String>();
		list.add("第一页");
		list.add("第二页");
		list.add("第三页");
		list.add("第四页");
		
		return list;
	}
	/**
	 * 获取所有的内容页
	 * @return
	 */
	private List<View> getData() {
		List<View>list=new ArrayList<View>();
//		加载所有的View内容
		View view1=View.inflate(this, R.layout.view1, null);
		View view2=View.inflate(this, R.layout.view2, null);
		View view3=View.inflate(this, R.layout.view3, null);
		View view4=View.inflate(this, R.layout.view4, null);
		
//		将所有的内容页View添加到集合中
		list.add(view1);
		list.add(view2);
		list.add(view3);
		list.add(view4);
		return list;
	}


}
