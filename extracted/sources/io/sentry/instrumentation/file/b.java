package io.sentry.instrumentation.file;

import io.sentry.b6;
import io.sentry.k1;
import java.io.Closeable;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public final File a;
    public final k1 b;
    public final b6 c;
    public final Closeable d;

    public /* synthetic */ b(File file, k1 k1Var, Closeable closeable, b6 b6Var) {
        this.a = file;
        this.b = k1Var;
        this.d = closeable;
        this.c = b6Var;
    }
}
