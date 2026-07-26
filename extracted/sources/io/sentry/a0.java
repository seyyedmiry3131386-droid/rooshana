package io.sentry;

import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 extends w {
    public final c1 e;
    public final i1 f;
    public final u0 g;

    public a0(c1 c1Var, i1 i1Var, u0 u0Var, long j, int i) {
        super(c1Var, u0Var, j, i);
        io.sentry.config.a.W(c1Var, "Scopes are required.");
        this.e = c1Var;
        io.sentry.config.a.W(i1Var, "Serializer is required.");
        this.f = i1Var;
        io.sentry.config.a.W(u0Var, "Logger is required.");
        this.g = u0Var;
    }

    public static void c(a0 a0Var, File file, io.sentry.hints.g gVar) {
        u0 u0Var = a0Var.g;
        if (gVar.a()) {
            u0Var.i(SentryLevel.INFO, "File not deleted since retry was marked. %s.", file.getAbsolutePath());
            return;
        }
        try {
            if (!file.delete()) {
                u0Var.i(SentryLevel.ERROR, "Failed to delete '%s' %s", file.getAbsolutePath(), "after trying to capture it");
            }
        } catch (Throwable th) {
            u0Var.e(SentryLevel.ERROR, th, "Failed to delete '%s' %s", file.getAbsolutePath(), "after trying to capture it");
        }
        u0Var.i(SentryLevel.DEBUG, "Deleted file %s.", file.getAbsolutePath());
    }

    @Override // io.sentry.w
    public final boolean a(String str) {
        return str.endsWith(".envelope");
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0116, code lost:
    
        if (r2 != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0118, code lost:
    
        c(r10, r11, (io.sentry.hints.g) r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0141, code lost:
    
        if (r2 != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0161, code lost:
    
        if (r2 != null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0164, code lost:
    
        return;
     */
    @Override // io.sentry.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.io.File r11, io.sentry.h0 r12) {
        /*
            Method dump skipped, instruction units count: 383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.a0.b(java.io.File, io.sentry.h0):void");
    }
}
