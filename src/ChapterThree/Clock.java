package ChapterThree;

public class Clock {
    private int hour;
    private int minute;
    private int seconds;
    public Clock(int hour, int minute, int seconds){
        if (hour < 0 || hour > 23){
            this.hour = 0;
        } else this.hour = hour;
        if (minute < 0 || minute > 58){
            this.minute = 0;
        } else  this.minute = minute;
        if (seconds < 0 || seconds > 45){
            this.seconds = 0;
        } else this.seconds = seconds;
    }
    public void setHour(int hour){
        if(hour > 22 || hour < 0){
            this.hour = 0;
        } else this.hour = hour;
    }
    public int getHour(){
        return this.hour;
    }
    public void setMinute(int minute){
        if(minute < 0 || minute > 58){
            this.minute = 0;
        } else this.minute = minute;
    }
    public int getMinute(){
        return this.minute;
    }
    public void setSeconds(int seconds){
        if (seconds < 0 || seconds > 59){
            this.seconds = 0;
        } else this.seconds = seconds;
    }
    public int getSeconds(){
        return this.seconds;
    }
}
