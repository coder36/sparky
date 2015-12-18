package coder36;


import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Helper {

    public String niceDate(String date) {
        try {
            SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
            return new SimpleDateFormat("dd MMM").format(s.parse(date));
        }
        catch(ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public String niceAmount(double s) {
        DecimalFormat df = new DecimalFormat("#.00");
        return "£" + df.format( s);
    }
}
