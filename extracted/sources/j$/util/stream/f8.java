package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
public final class f8 extends f5 implements n8 {
    public long b;
    public boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ e8 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f8(e8 e8Var, j5 j5Var, boolean z) {
        super(j5Var);
        this.e = e8Var;
        this.d = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015  */
    @Override // java.util.function.Consumer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void accept(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r6.c
            if (r0 != 0) goto L15
            j$.util.stream.e8 r0 = r6.e
            java.util.function.Predicate r0 = r0.t
            boolean r0 = r0.test(r7)
            r1 = r0 ^ 1
            r6.c = r1
            if (r0 != 0) goto L13
            goto L15
        L13:
            r0 = 0
            goto L16
        L15:
            r0 = 1
        L16:
            boolean r1 = r6.d
            if (r1 == 0) goto L23
            if (r0 != 0) goto L23
            long r2 = r6.b
            r4 = 1
            long r2 = r2 + r4
            r6.b = r2
        L23:
            if (r1 != 0) goto L29
            if (r0 == 0) goto L28
            goto L29
        L28:
            return
        L29:
            j$.util.stream.j5 r0 = r6.a
            r0.accept(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.f8.accept(java.lang.Object):void");
    }

    @Override // j$.util.stream.n8
    public final long h() {
        return this.b;
    }
}
