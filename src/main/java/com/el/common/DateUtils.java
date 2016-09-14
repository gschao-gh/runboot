package com.el.common;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2016/9/14.
 */
public class DateUtils {

    /**
     * @author gschao
     * @date 2016 09 14
     * 得到系统时间
     * @return
     */
     public static String getSystime(){
         Date date = new Date();
         SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
         return sdf.format(date);
     }




}
