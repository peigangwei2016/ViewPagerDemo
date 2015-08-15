package com.pgw.viewpagerdemo;

import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.View;
import android.view.ViewGroup;

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

	private List<String> tatileList;
	private List<Fragment> fragmentList;

	public MyFragmentPagerAdapter(FragmentManager fm, List<Fragment> fragmentList, List<String> tatileList) {
		super(fm);
		this.fragmentList=fragmentList;
		this.tatileList=tatileList;
	}

	@Override
	public Fragment getItem(int position) {
		return fragmentList.get(position);
	}

	@Override
	public int getCount() {
		return fragmentList.size();
	}
	
	@Override
	public CharSequence getPageTitle(int position) {
		return tatileList.get(position);
	}
	
	@Override
	public Object instantiateItem(ViewGroup container, int position) {
		// TODO Auto-generated method stub
		return super.instantiateItem(container, position);
	}
	
	@Override
	public void destroyItem(ViewGroup container, int position, Object object) {
		// TODO Auto-generated method stub
		super.destroyItem(container, position, object);
	}

}
