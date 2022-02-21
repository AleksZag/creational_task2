import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
    private DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("HH:mm:ss dd-MM-yyyy ");
    protected int num = 1;
    private static Logger logger;

    private Logger() {
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void log(String msg) {
        LocalDateTime callTime = LocalDateTime.now();
        System.out.println("[" + callTime.format(FORMATTER) + " " + num++ + "] " + msg);
    }


}
