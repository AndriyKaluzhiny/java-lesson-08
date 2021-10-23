public enum Month {
    JANUARY(Season.WINTER, 31), FEBRUARY(Season.WINTER, 28), MARCH(Season.AUTUMN, 31),
        APRIL(Season.AUTUMN, 30), MAY(Season.AUTUMN, 31), JUNE(Season.SUMMER, 30),
            JULY(Season.SUMMER, 31), AUGUST(Season.SUMMER,31), SEPTEMBER(Season.FALL,30),
                OCTOBER(Season.FALL,31), NOVEMBER(Season.FALL,30), DECEMBER(Season.WINTER,31);

    Season s;
    int days;

    Month(Season s, int days) {
        this.s = s;
        this.days = days;
    }

    public int getDays() {
        return days;
    }

    public Season getS() {
        return s;
    }

    public String DaystoString() {
        return "" + getDays();
    }
}
