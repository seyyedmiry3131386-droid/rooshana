package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kb2 implements ui3 {
    public final s26 a;
    public final tb2 b;
    public final String c;
    public final AutoCloseable d;
    public final Object e = new Object();
    public boolean f;
    public tv6 g;

    public kb2(s26 s26Var, tb2 tb2Var, String str, AutoCloseable autoCloseable) {
        this.a = s26Var;
        this.b = tb2Var;
        this.c = str;
        this.d = autoCloseable;
    }

    @Override // defpackage.ui3
    public final s26 Q0() {
        s26 s26Var;
        synchronized (this.e) {
            if (this.f) {
                throw new IllegalStateException("closed");
            }
            s26Var = this.a;
        }
        return s26Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0014 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.e
            monitor-enter(r0)
            r1 = 1
            r2.f = r1     // Catch: java.lang.Throwable -> L1c
            tv6 r1 = r2.g     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L10
            r1.close()     // Catch: java.lang.RuntimeException -> Le java.lang.Exception -> L10 java.lang.Throwable -> L1c
            goto L10
        Le:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L1c
        L10:
            java.lang.AutoCloseable r1 = r2.d     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1a
            defpackage.rm7.x(r1)     // Catch: java.lang.RuntimeException -> L18 java.lang.Exception -> L1a java.lang.Throwable -> L1c
            goto L1a
        L18:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L1c
        L1a:
            monitor-exit(r0)
            return
        L1c:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kb2.close():void");
    }

    @Override // defpackage.ui3
    public final ph0 d1() {
        synchronized (this.e) {
            if (this.f) {
                throw new IllegalStateException("closed");
            }
            tv6 tv6Var = this.g;
            if (tv6Var != null) {
                return tv6Var;
            }
            tv6 tv6VarJ = rf0.j(this.b.k0(this.a));
            this.g = tv6VarJ;
            return tv6VarJ;
        }
    }

    @Override // defpackage.ui3
    public final tb2 getFileSystem() {
        return this.b;
    }

    @Override // defpackage.ui3
    public final wn5 j() {
        return null;
    }
}
