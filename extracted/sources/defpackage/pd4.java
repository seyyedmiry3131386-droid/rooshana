package defpackage;

import org.slf4j.Logger;
import org.slf4j.event.Level;
import org.slf4j.spi.DefaultLoggingEventBuilder;
import org.slf4j.spi.LoggingEventBuilder;
import org.slf4j.spi.NOPLoggingEventBuilder;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class pd4 {
    public static LoggingEventBuilder a(Logger logger) {
        return logger.isDebugEnabled() ? logger.makeLoggingEventBuilder(Level.DEBUG) : NOPLoggingEventBuilder.singleton();
    }

    public static LoggingEventBuilder b(Logger logger) {
        return logger.isErrorEnabled() ? logger.makeLoggingEventBuilder(Level.ERROR) : NOPLoggingEventBuilder.singleton();
    }

    public static LoggingEventBuilder c(Logger logger) {
        return logger.isInfoEnabled() ? logger.makeLoggingEventBuilder(Level.INFO) : NOPLoggingEventBuilder.singleton();
    }

    public static LoggingEventBuilder d(Logger logger, Level level) {
        return logger.isEnabledForLevel(level) ? logger.makeLoggingEventBuilder(level) : NOPLoggingEventBuilder.singleton();
    }

    public static LoggingEventBuilder e(Logger logger) {
        return logger.isTraceEnabled() ? logger.makeLoggingEventBuilder(Level.TRACE) : NOPLoggingEventBuilder.singleton();
    }

    public static LoggingEventBuilder f(Logger logger) {
        return logger.isWarnEnabled() ? logger.makeLoggingEventBuilder(Level.WARN) : NOPLoggingEventBuilder.singleton();
    }

    public static boolean g(Logger logger, Level level) {
        int i = level.toInt();
        if (i == 0) {
            return logger.isTraceEnabled();
        }
        if (i == 10) {
            return logger.isDebugEnabled();
        }
        if (i == 20) {
            return logger.isInfoEnabled();
        }
        if (i == 30) {
            return logger.isWarnEnabled();
        }
        if (i == 40) {
            return logger.isErrorEnabled();
        }
        throw new IllegalArgumentException("Level [" + level + "] not recognized.");
    }

    public static LoggingEventBuilder h(Logger logger, Level level) {
        return new DefaultLoggingEventBuilder(logger, level);
    }
}
