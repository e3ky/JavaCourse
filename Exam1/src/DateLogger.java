import java.text.SimpleDateFormat;
import java.util.Date;

public class DateLogger extends Logger {

    @Override
    public void log(int logLevel, String message) {
        if (super.getLevel() >= logLevel) {
            System.out.print(getCurrentTimeStamp());
        }
        super.log(logLevel, message);
    }

    @Override
    public void log(String message) {
        log(DEFAULT_LEVEL, message);
    }

    public String getCurrentTimeStamp() {

        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("|hh:mm:ss dd.MM.YYYY| ");
        String formattedDate = dateFormat.format(date);
        // |22:14:01 14.06.2014| 3 => My message
        return formattedDate;
    }

}
