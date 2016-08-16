package com.mixiaoxiao.weather.widget;

import com.mixiaoxiao.weather.MainActivity;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class FontTextView extends TextView{

	public FontTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
		if(isInEditMode()){
			return ;
		}
//		setIncludeFontPadding(false);
		setTypeface(MainActivity.getTypeface(context));
	}

}
