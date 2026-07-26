package org.slf4j.event;

import java.util.List;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes4.dex */
public interface LoggingEvent {
    Object[] getArgumentArray();

    List<Object> getArguments();

    String getCallerBoundary();

    List<KeyValuePair> getKeyValuePairs();

    Level getLevel();

    String getLoggerName();

    List<Marker> getMarkers();

    String getMessage();

    String getThreadName();

    Throwable getThrowable();

    long getTimeStamp();
}
