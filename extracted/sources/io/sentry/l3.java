package io.sentry;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
public final class l3 implements Runnable {
    public static final Charset b = Charset.forName("UTF-8");
    public final b6 a;

    public l3(b6 b6Var) {
        this.a = b6Var;
    }

    public final Date a(File file) {
        b6 b6Var = this.a;
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), b));
            try {
                String line = bufferedReader.readLine();
                b6Var.getLogger().i(SentryLevel.DEBUG, "Crash marker file has %s timestamp.", line);
                Date dateB = io.sentry.config.a.B(line);
                bufferedReader.close();
                return dateB;
            } finally {
            }
        } catch (IOException e) {
            b6Var.getLogger().f(SentryLevel.ERROR, "Error reading the crash marker file.", e);
            return null;
        } catch (IllegalArgumentException e2) {
            b6Var.getLogger().e(SentryLevel.ERROR, e2, "Error converting the crash timestamp.", new Object[0]);
            return null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        b6 b6Var = this.a;
        String cacheDirPath = b6Var.getCacheDirPath();
        if (cacheDirPath == null) {
            b6Var.getLogger().i(SentryLevel.INFO, "Cache dir is not set, not finalizing the previous session.", new Object[0]);
            return;
        }
        io.sentry.cache.d envelopeDiskCache = b6Var.getEnvelopeDiskCache();
        if ((envelopeDiskCache instanceof io.sentry.cache.c) && !((io.sentry.cache.c) envelopeDiskCache).h()) {
            b6Var.getLogger().i(SentryLevel.WARNING, "Timed out waiting to flush previous session to its own file in session finalizer.", new Object[0]);
            return;
        }
        Charset charset = io.sentry.cache.c.i;
        File file = new File(cacheDirPath, "previous_session.json");
        i1 serializer = b6Var.getSerializer();
        if (file.exists()) {
            b6Var.getLogger().i(SentryLevel.WARNING, "Current session is not ended, we'd need to end it.", new Object[0]);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), b));
                try {
                    i6 i6Var = (i6) serializer.c(bufferedReader, i6.class);
                    if (i6Var == null) {
                        b6Var.getLogger().i(SentryLevel.ERROR, "Stream from path %s resulted in a null envelope.", file.getAbsolutePath());
                    } else {
                        File file2 = new File(b6Var.getCacheDirPath(), ".sentry-native/last_crash");
                        Session$State session$State = i6Var.g;
                        Session$State session$State2 = Session$State.Crashed;
                        if (session$State == session$State2) {
                            m4 m4Var = m4.c;
                            r rVarA = m4Var.b.a();
                            try {
                                m4Var.a = false;
                                rVarA.close();
                                m4Var.a();
                            } finally {
                            }
                        } else if (file2.exists()) {
                            b6Var.getLogger().i(SentryLevel.INFO, "Crash marker file exists, last Session is gonna be Crashed.", new Object[0]);
                            Date dateA = a(file2);
                            i6Var.d(session$State2, null, true, null);
                            i6Var.b(dateA);
                        } else if (i6Var.n == null) {
                            i6Var.b(io.sentry.config.a.z());
                        }
                        if (file2.exists() && !file2.delete()) {
                            b6Var.getLogger().i(SentryLevel.ERROR, "Failed to delete the crash marker file. %s.", file2.getAbsolutePath());
                        }
                        h4.b().i(new io.sentry.internal.debugmeta.c((io.sentry.protocol.v) null, b6Var.getSdkVersion(), u4.d(serializer, i6Var)), new h0());
                    }
                    bufferedReader.close();
                } finally {
                }
            } catch (Throwable th) {
                b6Var.getLogger().f(SentryLevel.ERROR, "Error processing previous session.", th);
            }
            if (file.delete()) {
                return;
            }
            b6Var.getLogger().i(SentryLevel.WARNING, "Failed to delete the previous session file.", new Object[0]);
        }
    }
}
