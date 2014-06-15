public class Logger {
    public static final int DEFAULT_LEVEL = 3;

    private int level;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        if (level <= 0) {
            level = DEFAULT_LEVEL;// default value
        }
        this.level = level;
    }

    public Logger(int level) {
        setLevel(level);
    }

    public Logger() {
        this(DEFAULT_LEVEL);
    }

    public void log(int logLevel, String message) {
        if (logLevel <= this.level) {
            System.out.printf("Log level %d => %s\n", logLevel, message);
        }
    }

    public void log(String message) {
        log(DEFAULT_LEVEL, message);
    }

}
