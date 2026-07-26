package defpackage;

import java.io.Closeable;

/* JADX INFO: loaded from: classes.dex */
public interface dc8 extends Closeable {
    cc8 g0();

    String getDatabaseName();

    cc8 p0();

    void setWriteAheadLoggingEnabled(boolean z);
}
