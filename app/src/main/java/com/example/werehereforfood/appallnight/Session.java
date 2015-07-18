package com.example.werehereforfood.appallnight;


import android.text.format.Time;

import java.util.Date;

/**
 * Created by sean on 7/18/15.
 */
public class Session {

    private String name;
    private Date beginningTime;
    private Date endedTime;
    private Date interval;
    private Date lastTimeSent;
    private final static long FIVE_MINS = 300000;



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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBeginningTime() {
        return beginningTime;
    }

    public void setBeginningTime(Date beginningTime) {
        this.beginningTime = beginningTime;
    }

    public Date getEndedTime() {
        return endedTime;
    }

    public void setEndedTime(Date endedTime) {
        this.endedTime = endedTime;
    }

    public Date getInterval() {
        return interval;
    }

    public void setInterval(Date interval) {
        this.interval = interval;
    }

    public Date getLastTimeSent() {
        return lastTimeSent;
    }

    public void setLastTimeSent(Date lastTimeSent) {
        this.lastTimeSent = lastTimeSent;
    }

    private Runnable playAlarmThread = new Runnable() {
        public void run() {
            lastTimeSent = find_time.getTime();
            while (find_time.getTime().after(beginningTime) && find_time.getTime().before(endedTime)) {
                if (find_time.getTime().getTime() - lastTimeSent.getTime() > interval.getTime()){
                    //Add stuff here
                    //start puzzle/game/thing
                    //notification
                    while (find_time.getTime().getTime() - lastTimeSent.getTime() > interval.getTime()) {
                        if (find_time.getTime().getTime() - lastTimeSent.getTime() > (interval.getTime() + FIVE_MINS)) {
                            //alarm and text
                        }
                    }


                }
            }
        }
    };
}
