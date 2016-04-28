package logging.client;

public class Logger {
    private static Level LOG_LEVEL = Level.ERROR;
    private static boolean LOGGLY_ENABLED = false;
    private String clazzName;

    public Logger(Class clazz) {
        this.clazzName = clazz != null ? clazz.getSimpleName() : "Null Class";
    }

    public static void setLogLevel(Level logLevel) {
        if (logLevel == null) {
            logLevel = Level.ERROR;
        }
        LOG_LEVEL = logLevel;
    }

    /*
     * Logger Instance
     */

    public static void setLogglyEnabled(boolean logglyEnabled) {
        LOGGLY_ENABLED = logglyEnabled;
    }

    public static Logger get(Class clazz) {
        return new Logger(clazz);
    }

    private static native void logToBrowserConsole(String level, String clazzName, String message, Object... data) /*-{
        if (level === 'TRACE') {
            console.trace("[" + level.toUpperCase() + "] " + clazzName + ": " + message, data);
        } else if (level === 'DEBUG') {
            console.debug("[" + level.toUpperCase() + "] " + clazzName + ": " + message, data);
        } else if (level === 'INFO') {
            console.info("[" + level.toUpperCase() + "] " + clazzName + ": " + message, data);
        } else if (level === 'WARN') {
            console.warn("[" + level.toUpperCase() + "] " + clazzName + ": " + message, data);
        } else {
            console.error("[" + level.toUpperCase() + "] " + clazzName + ": " + message, data);
        }
    }-*/;

    private void log(Level level, String message, Object... data) {
        if (level == null || LOG_LEVEL.getValue() < level.getValue()) {
            return;
        }

        logToBrowserConsole(level.toString(), clazzName, message, data);

        if (LOGGLY_ENABLED) {
            Loggly.push(level.toString(), clazzName + ": " + message, data);
        }
    }

    public void trace(String msg, Object... data) {
        log(Level.TRACE, msg, data);
    }

    // Logging Methods

    public void debug(String msg, Object... data) {
        log(Level.DEBUG, msg, data);
    }

    public void info(String msg, Object... data) {
        log(Level.INFO, msg, data);
    }

    public void warn(String msg, Object... data) {
        log(Level.WARN, msg, data);
    }

    public void error(String msg, Object... data) {
        log(Level.ERROR, msg, data);
    }

    public void error(Throwable exception) {
        log(Level.ERROR, null, exception);
    }

    public enum Level {
        TRACE(4),
        DEBUG(3),
        INFO(2),
        WARN(1),
        ERROR(0);

        private int value;

        Level(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
}