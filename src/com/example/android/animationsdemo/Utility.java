package com.example.android.animationsdemo;

import java.lang.reflect.Field;

public class Utility {

	public static String getImage(int imageid) {
		Field[] drawables = com.example.android.animationsdemo.R.drawable.class
				.getFields();
		String fName = "";
		if (drawables != null && drawables.length - 1 >= imageid) {
			 fName = drawables[imageid].getName();
		}else if (drawables.length > 0){
			fName = drawables[0].getName();
		}
		return fName;
	}
}
