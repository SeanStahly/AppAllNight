package com.example.werehereforfood.appallnight;

/**
 * Created by Nilay on 7/18/2015.
 */
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class find_time
{


    public static Date getTime()
    {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        return cal.getTime();
    }
}
