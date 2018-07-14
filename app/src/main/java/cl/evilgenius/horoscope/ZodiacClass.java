package cl.evilgenius.horoscope;

public class ZodiacClass {

    private int day, month;
    private String zod="";

    public ZodiacClass(int day, int month, String zod1) {
        this.day = day;
        this.month = month;
        this.zod = zod1;
    }

    public ZodiacClass() {

    }

    public String getZod() {
        return zod;
    }

    public void setZod(String zod) {
        this.zod = zod;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String zodiacSign(int day, int month) {
        this.zod = "";
        switch (month) {
            case 1:
                if (day > 21) {
                    zod = "AQUARIUS";
                } else {
                    zod = "CAPRICORN";
                }
                break;
            case 2:
                if (day > 19) {
                    zod = "PISCES";
                } else {
                    zod = "AQUARIUS";
                }
                break;
            case 3:
                if (day > 20) {
                    zod = "ARIES";

                } else {
                    zod = "PISCES";
                }
                break;
            case 4:
                if (day > 20) {
                    zod = "TAURUS";
                } else {
                    zod = "ARIES";
                }
                break;
            case 5:
                if (day > 21) {
                    zod = "GEMINI";
                } else {
                    zod = "TAURUS";
                }
                break;
            case 6:
                if (day > 20) {
                    zod = "CANCER";
                } else {
                    zod = "GEMINI";
                }
                break;
            case 7:
                if (day > 22) {
                    zod = "LEO";
                } else {
                    zod = "CANCER";
                }
                break;
            case 8:
                if (day > 21) {
                    zod = "VIRGO";
                } else {
                    zod = "LEO";
                }
                break;
            case 9:
                if (day > 22) {
                    zod = "LIBRA";
                } else {
                    zod = "VIRGO";
                }
                break;
            case 10:
                if (day > 22) {
                    zod = "SCORPIO";
                } else {
                    zod = "LIBRA";
                }
                break;
            case 11:
                if (day > 21) {
                    zod = "SAGITTARIUS";
                } else {
                    zod = "SCORPIO";
                }
                break;
            case 12:
                if (day > 21) {
                    zod = "CAPRICORN";
                } else {
                    zod = "SAGITTARIUS";
                }
                break;
        }
        return zod;
    }
}
