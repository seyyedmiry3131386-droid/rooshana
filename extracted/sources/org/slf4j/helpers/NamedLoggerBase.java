package org.slf4j.helpers;

import defpackage.pd4;
import java.io.ObjectStreamException;
import java.io.Serializable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;
import org.slf4j.spi.LoggingEventBuilder;

/* JADX INFO: loaded from: classes4.dex */
abstract class NamedLoggerBase implements Logger, Serializable {
    private static final long serialVersionUID = 7535258609338176893L;
    protected String name;

    @Override // org.slf4j.Logger
    public final /* synthetic */ LoggingEventBuilder atDebug() {
        return pd4.a(this);
    }

    @Override // org.slf4j.Logger
    public final /* synthetic */ LoggingEventBuilder atError() {
        return pd4.b(this);
    }

    @Override // org.slf4j.Logger
    public final /* synthetic */ LoggingEventBuilder atInfo() {
        return pd4.c(this);
    }

    @Override // org.slf4j.Logger
    public final /* synthetic */ LoggingEventBuilder atLevel(Level level) {
        return pd4.d(this, level);
    }

    @Override // org.slf4j.Logger
    public final /* synthetic */ LoggingEventBuilder atTrace() {
        return pd4.e(this);
    }

    @Override // org.slf4j.Logger
    public final /* synthetic */ LoggingEventBuilder atWarn() {
        return pd4.f(this);
    }

    @Override // org.slf4j.Logger
    public String getName() {
        return this.name;
    }

    @Override // org.slf4j.Logger
    public final /* synthetic */ boolean isEnabledForLevel(Level level) {
        return pd4.g(this, level);
    }

    @Override // org.slf4j.Logger
    public final /* synthetic */ LoggingEventBuilder makeLoggingEventBuilder(Level level) {
        return pd4.h(this, level);
    }

    public Object readResolve() throws ObjectStreamException {
        return LoggerFactory.getLogger(getName());
    }
}
