package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class n46 implements t18 {
    public final ph0 a;
    public final gh0 b;
    public vl7 c;
    public int d;
    public boolean e;
    public long f;

    public n46(ph0 ph0Var) {
        this.a = ph0Var;
        gh0 gh0VarH = ph0Var.h();
        this.b = gh0VarH;
        vl7 vl7Var = gh0VarH.a;
        this.c = vl7Var;
        this.d = vl7Var != null ? vl7Var.b : -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.e = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r3 == r5.b) goto L15;
     */
    @Override // defpackage.t18
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long f0(defpackage.gh0 r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            defpackage.js3.p(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L6b
            boolean r3 = r8.e
            if (r3 != 0) goto L63
            vl7 r3 = r8.c
            gh0 r4 = r8.b
            if (r3 == 0) goto L2b
            vl7 r5 = r4.a
            if (r3 != r5) goto L23
            int r3 = r8.d
            defpackage.js3.m(r5)
            int r5 = r5.b
            if (r3 != r5) goto L23
            goto L2b
        L23:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            r9.<init>(r10)
            throw r9
        L2b:
            if (r2 != 0) goto L2e
            return r0
        L2e:
            long r0 = r8.f
            r2 = 1
            long r0 = r0 + r2
            ph0 r2 = r8.a
            boolean r0 = r2.request(r0)
            if (r0 != 0) goto L3e
            r9 = -1
            return r9
        L3e:
            vl7 r0 = r8.c
            if (r0 != 0) goto L4c
            vl7 r0 = r4.a
            if (r0 == 0) goto L4c
            r8.c = r0
            int r0 = r0.b
            r8.d = r0
        L4c:
            long r0 = r4.b
            long r2 = r8.f
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            gh0 r2 = r8.b
            long r4 = r8.f
            r3 = r9
            r2.k(r3, r4, r6)
            long r9 = r8.f
            long r9 = r9 + r6
            r8.f = r9
            return r6
        L63:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            r9.<init>(r10)
            throw r9
        L6b:
            java.lang.String r9 = "byteCount < 0: "
            java.lang.String r9 = defpackage.bl4.r(r10, r9)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n46.f0(gh0, long):long");
    }

    @Override // defpackage.t18
    public final dm8 i() {
        return this.a.i();
    }
}
