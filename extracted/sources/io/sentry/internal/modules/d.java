package io.sentry.internal.modules;

import io.sentry.SentryLevel;
import io.sentry.r;
import io.sentry.u0;
import io.sentry.util.AutoClosableReentrantLock;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d implements a {
    public static final Charset d = Charset.forName("UTF-8");
    public final u0 a;
    public final AutoClosableReentrantLock b = new AutoClosableReentrantLock();
    public volatile Map c = null;

    public d(u0 u0Var) {
        this.a = u0Var;
    }

    @Override // io.sentry.internal.modules.a
    public final Map a() {
        if (this.c == null) {
            r rVarA = this.b.a();
            try {
                if (this.c == null) {
                    this.c = b();
                }
                rVarA.close();
            } catch (Throwable th) {
                try {
                    rVarA.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return this.c;
    }

    public abstract Map b();

    public final TreeMap c(InputStream inputStream) {
        u0 u0Var = this.a;
        TreeMap treeMap = new TreeMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, d));
            try {
                for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                    int iLastIndexOf = line.lastIndexOf(58);
                    treeMap.put(line.substring(0, iLastIndexOf), line.substring(iLastIndexOf + 1));
                }
                u0Var.i(SentryLevel.DEBUG, "Extracted %d modules from resources.", Integer.valueOf(treeMap.size()));
                bufferedReader.close();
                return treeMap;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            u0Var.f(SentryLevel.ERROR, "Error extracting modules.", e);
            return treeMap;
        } catch (RuntimeException e2) {
            u0Var.e(SentryLevel.ERROR, e2, "%s file is malformed.", "sentry-external-modules.txt");
            return treeMap;
        }
    }
}
