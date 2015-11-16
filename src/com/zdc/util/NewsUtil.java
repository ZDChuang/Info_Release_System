package com.zdc.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NewsUtil {
	public static String getTime(){
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
        return sdf.format(d);
	}
		  
}
