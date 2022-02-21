package ss4_lop_va_doi_tuong_trong_java.bai_tap.build_stopwatch_class;


import java.util.Date;

public class StopWatch {
    private long timeStart;
    private long timeEnd;

    public long  getTimeStart() {
        return this.timeStart = System.currentTimeMillis();
    }
    public long getTimeEnd() {
        return this.timeEnd = System.currentTimeMillis();
    }
    public long getElapsedTime() {
        return this.timeEnd - this.timeStart;
    }
    public void start() {
         getTimeStart();
    }
    public void stop() {
         getTimeEnd();
    }
}
