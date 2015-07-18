package com.example.werehereforfood.appallnight;


import android.text.format.Time;

import java.util.Date;

/**
 * Created by sean on 7/18/15.
 */
public class Session {

    String name;
    Date beginningTime;
    Date endedTime;
    Date interval;



    public Session(String name, Date beginningTime, Date endedTime, Date interval) {
        this.name = name;
        this.beginningTime = beginningTime;
        this.endedTime = endedTime;
        this.interval = interval;
    }

    public Session(String name, Date endedTime, Date interval) {
        this.name = name;
        this.endedTime = endedTime;
        this.interval = interval;
        this.beginningTime = find_time.getTime();
    }
}
