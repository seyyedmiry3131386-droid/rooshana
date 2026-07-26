package io.sentry.android.core.anr;

import io.sentry.SentryLevel;
import io.sentry.b6;
import io.sentry.cache.tape.g;
import io.sentry.cache.tape.j;
import io.sentry.hints.i;
import io.sentry.u0;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements AutoCloseable {
    public final g a;

    public d(b6 b6Var, File file) {
        j jVar;
        u0 logger = b6Var.getLogger();
        try {
            try {
                try {
                    jVar = new j(file, j.d(file), 120);
                } catch (Throwable th) {
                    throw th;
                }
            } catch (IOException e) {
                logger.f(SentryLevel.ERROR, "Failed to create stacktrace queue", e);
                jVar = null;
            }
        } catch (IOException unused) {
            if (!file.delete()) {
                throw new IOException("Could not delete file");
            }
            RandomAccessFile randomAccessFileD = j.d(file);
            try {
                jVar = new j(file, randomAccessFileD, 120);
            } finally {
                randomAccessFileD.close();
            }
        }
        if (jVar == null) {
            this.a = new io.sentry.cache.tape.b();
        } else {
            this.a = new io.sentry.cache.tape.e(jVar, new i());
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
