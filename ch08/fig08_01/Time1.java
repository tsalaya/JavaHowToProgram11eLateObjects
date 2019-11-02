public class Time1 {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public Time1(int h, int m, int s) {
        boolean hourValid = (h >= 0 && h <= 24);
        boolean minuteValid = (m >= 0 && h <= 60);
        boolean secondValid = (s >= 0 && h <= 60);

        if (!(hourValid && minuteValid && secondValid)) {
            throw new IllegalArgumentException("Hour or Minute or Second is out of valid range!");
        }

        this.hour = h;
        this.minute = m;
        this.second = s;
    }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }

    public String toString() {
        return String.format("%02d:%02d:%02d %s", (this.hour == 0 || this.hour == 12) ? 12 : this.hour % 12,
                this.minute, this.second, this.hour < 12 ? "AM" : "PM");
    }
}
