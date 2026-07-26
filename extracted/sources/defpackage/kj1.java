package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class kj1 implements Iterator, dx3 {
    public int a = -1;
    public int b;
    public int c;
    public uq3 d;
    public int e;
    public final /* synthetic */ lj1 f;

    public kj1(lj1 lj1Var) {
        this.f = lj1Var;
        int iT = ok4.t(0, 0, lj1Var.a.length());
        this.b = iT;
        this.c = iT;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r7 = this;
            int r0 = r7.c
            r1 = 0
            if (r0 >= 0) goto Lb
            r7.a = r1
            r0 = 0
            r7.d = r0
            return
        Lb:
            lj1 r2 = r7.f
            int r3 = r2.b
            r4 = -1
            r5 = 1
            if (r3 <= 0) goto L1a
            int r6 = r7.e
            int r6 = r6 + r5
            r7.e = r6
            if (r6 >= r3) goto L22
        L1a:
            java.lang.CharSequence r3 = r2.a
            int r3 = r3.length()
            if (r0 <= r3) goto L34
        L22:
            uq3 r0 = new uq3
            int r1 = r7.b
            java.lang.CharSequence r2 = r2.a
            int r2 = defpackage.f88.h0(r2)
            r0.<init>(r1, r2, r5)
            r7.d = r0
            r7.c = r4
            goto L79
        L34:
            qp2 r0 = r2.c
            java.lang.CharSequence r3 = r2.a
            int r6 = r7.c
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r0 = r0.invoke(r3, r6)
            kotlin.Pair r0 = (kotlin.Pair) r0
            if (r0 != 0) goto L58
            uq3 r0 = new uq3
            int r1 = r7.b
            java.lang.CharSequence r2 = r2.a
            int r2 = defpackage.f88.h0(r2)
            r0.<init>(r1, r2, r5)
            r7.d = r0
            r7.c = r4
            goto L79
        L58:
            java.lang.Object r2 = r0.a
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.b
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r3 = r7.b
            uq3 r3 = defpackage.ok4.Z(r3, r2)
            r7.d = r3
            int r2 = r2 + r0
            r7.b = r2
            if (r0 != 0) goto L76
            r1 = r5
        L76:
            int r2 = r2 + r1
            r7.c = r2
        L79:
            r7.a = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kj1.a():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.a == -1) {
            a();
        }
        return this.a == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.a == -1) {
            a();
        }
        if (this.a == 0) {
            throw new NoSuchElementException();
        }
        uq3 uq3Var = this.d;
        js3.n(uq3Var, "null cannot be cast to non-null type kotlin.ranges.IntRange");
        this.d = null;
        this.a = -1;
        return uq3Var;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
