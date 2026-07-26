package defpackage;

import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* JADX INFO: loaded from: classes3.dex */
public final class ug extends Handler {
    public static final ug a = new ug();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        js3.p(logRecord, "record");
        CopyOnWriteArraySet copyOnWriteArraySet = tg.a;
        String loggerName = logRecord.getLoggerName();
        js3.o(loggerName, "getLoggerName(...)");
        int iIntValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        int i = iIntValue > level.intValue() ? 5 : logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = logRecord.getMessage();
        js3.o(message, "getMessage(...)");
        tg.a(loggerName, i, message, logRecord.getThrown());
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
