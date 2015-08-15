package com.pgw.viewpagerdemo;

import java.util.List;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

public class MyPagerAdapter extends PagerAdapter {
	private List<View> viewList;
	private List<String> titleData;

	public MyPagerAdapter(List<View> viewList, List<String> tatileData) {
		this.viewList = viewList;
		this.titleData=tatileData;
	}

	// 获取页面的个数
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return viewList.size();
	}

	// view和对象是否相等
	@Override
	public boolean isViewFromObject(View arg0, Object arg1) {
		return arg0 == arg1;
	}

	// 实例化页面时调用
	@Override
	public Object instantiateItem(ViewGroup container, int position) {
		container.addView(viewList.get(position));
		return viewList.get(position);
	}

	// 销毁页面时调用
	@Override
	public void destroyItem(ViewGroup container, int position, Object object) {
		container.removeView(viewList.get(position));
	}
	
//	设置标题
	@Override
	public CharSequence getPageTitle(int position) {
		return titleData.get(position);
	}
	

}
