import java.util.Date;

public class Practice3_StopWhatch {
    private long starTime;
    private long endTime;
    Practice3_StopWhatch(){
    };

    private long getStarTime(){
        return this.starTime;
    }

    private long getEndTime(){
        return this.endTime;
    }

    public void starTime(){
        System.out.println(java.time.LocalTime.now());
    }

    public void start(){
        this.starTime = new Date().getTime();
    }

    public void stop(){
        this.endTime = new Date().getTime();
    }

    public long getElapsedTime(){
        return this.endTime - this.starTime;
    }
    }

