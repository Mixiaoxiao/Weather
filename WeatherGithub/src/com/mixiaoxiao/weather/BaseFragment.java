package com.mixiaoxiao.weather;

import com.mixiaoxiao.dynamicweather.BaseDrawer;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.widget.Toast;

public abstract class BaseFragment extends Fragment{

	public abstract String getTitle();
	public abstract void onSelected();
	public abstract BaseDrawer.Type getDrawerType();
	
	protected void notifyActivityUpdate() {
		if (getUserVisibleHint()) {
			Activity activity = getActivity();
			if (activity != null) {
				((MainActivity) activity).updateCurDrawerType();
				//Toast.makeText(activity, getTitle() + " notifyActivityUpdate->" + getDrawerType().toString(), Toast.LENGTH_SHORT).show();
			}else{
				//toast(getTitle() + " notifyActivityUpdate getActivity() is NULL!");
			}
		}
	}
	protected void toast(String msg) {
		Toast.makeText(getActivity(), msg, Toast.LENGTH_SHORT).show();
	}
}
