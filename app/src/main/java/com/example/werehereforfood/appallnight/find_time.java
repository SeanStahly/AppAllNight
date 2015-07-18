package com.example.werehereforfood.appallnight;

/**
 * Created by Nilay on 7/18/2015.
 */
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class find_time
{
    public static void main(String[] args)
    {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        System.out.println(sdf.format(cal.getTime()));
    }
}
