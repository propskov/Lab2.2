package File;

public class Duration {
        private int hour;
        private int minute;
        private int second;

        public Duration(int hour, int minute,int second) {
            setHour(hour);
            setMinute(minute);
            setSecond(second);
        }
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }
    public void setSecond(int second) {
        if (second < 0 || second > 60)
            throw new IllegalArgumentException("В минуты всего 60 секунд");
        this.second = second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
    public void setMinute(int minute) {
        if (minute < 0 || minute > 60)
            throw new IllegalArgumentException("В часе всего 60 минут");
        this.minute = minute;
    }

}

