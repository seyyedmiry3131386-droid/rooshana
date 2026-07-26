package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class es4 implements gq4 {
    public final qf3 a;
    public final int b;

    public es4(qf3 qf3Var, int i) {
        this.a = qf3Var;
        this.b = i;
    }

    @Override // defpackage.gq4
    public final void a(int i, wp7 wp7Var) {
        this.a.y(i, wp7Var.b(), Bundle.EMPTY);
    }

    @Override // defpackage.gq4
    public final void b() {
        z67.f(this.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        if (r2 != 4) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gq4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(int r10, defpackage.q54 r11) {
        /*
            r9 = this;
            java.lang.String r0 = defpackage.q54.j
            java.lang.Object r1 = r11.c
            int r2 = r11.d
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            java.lang.String r4 = defpackage.q54.g
            int r5 = r11.a
            r3.putInt(r4, r5)
            java.lang.String r4 = defpackage.q54.h
            long r5 = r11.b
            r3.putLong(r4, r5)
            mp4 r4 = r11.e
            if (r4 == 0) goto L43
            java.lang.String r5 = defpackage.q54.i
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            java.lang.String r7 = defpackage.mp4.e
            android.os.Bundle r8 = r4.a
            r6.putBundle(r7, r8)
            java.lang.String r7 = defpackage.mp4.f
            boolean r8 = r4.b
            r6.putBoolean(r7, r8)
            java.lang.String r7 = defpackage.mp4.g
            boolean r8 = r4.c
            r6.putBoolean(r7, r8)
            java.lang.String r7 = defpackage.mp4.h
            boolean r4 = r4.d
            r6.putBoolean(r7, r4)
            r3.putBundle(r5, r6)
        L43:
            yp7 r11 = r11.f
            if (r11 == 0) goto L50
            java.lang.String r4 = defpackage.q54.l
            android.os.Bundle r11 = r11.b()
            r3.putBundle(r4, r11)
        L50:
            java.lang.String r11 = defpackage.q54.k
            r3.putInt(r11, r2)
            if (r1 != 0) goto L58
            goto L99
        L58:
            r11 = 1
            if (r2 == r11) goto L9f
            r11 = 2
            r4 = 0
            if (r2 == r11) goto L90
            r11 = 3
            if (r2 == r11) goto L66
            r11 = 4
            if (r2 == r11) goto L9f
            goto L99
        L66:
            zh0 r11 = new zh0
            com.google.common.collect.ImmutableList r1 = (com.google.common.collect.ImmutableList) r1
            lj3 r2 = com.google.common.collect.ImmutableList.m()
            r5 = r4
        L6f:
            int r6 = r1.size()
            if (r5 >= r6) goto L85
            java.lang.Object r6 = r1.get(r5)
            jp4 r6 = (defpackage.jp4) r6
            android.os.Bundle r6 = r6.c(r4)
            r2.O(r6)
            int r5 = r5 + 1
            goto L6f
        L85:
            com.google.common.collect.ImmutableList r1 = r2.S()
            r11.<init>(r1)
            r3.putBinder(r0, r11)
            goto L99
        L90:
            jp4 r1 = (defpackage.jp4) r1
            android.os.Bundle r11 = r1.c(r4)
            r3.putBundle(r0, r11)
        L99:
            qf3 r11 = r9.a
            r11.E(r10, r3)
            return
        L9f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.es4.c(int, q54):void");
    }

    @Override // defpackage.gq4
    public final void d(int i) {
        this.a.d(i);
    }

    @Override // defpackage.gq4
    public final void e(int i, cb6 cb6Var) {
        this.a.t(i, cb6Var.c());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != es4.class) {
            return false;
        }
        return Objects.equals(this.a.asBinder(), ((es4) obj).a.asBinder());
    }

    @Override // defpackage.gq4
    public final void f(int i, bq7 bq7Var) {
        this.a.k0(i, bq7Var.b());
    }

    @Override // defpackage.gq4
    public final void g(int i, PendingIntent pendingIntent) {
        this.a.g(i, pendingIntent);
    }

    public final int hashCode() {
        return Objects.hash(this.a.asBinder());
    }

    @Override // defpackage.gq4
    public final void i(int i, he6 he6Var, cb6 cb6Var, boolean z, boolean z2) {
        Bundle bundleQ;
        int i2 = this.b;
        vy2.s(i2 != 0);
        boolean z3 = z || !cb6Var.a(17);
        boolean z4 = z2 || !cb6Var.a(30);
        qf3 qf3Var = this.a;
        if (i2 < 2) {
            qf3Var.e0(i, he6Var.n(cb6Var, z, true).q(i2), z3);
            return;
        }
        he6 he6VarN = he6Var.n(cb6Var, z, z2);
        if (qf3Var instanceof so4) {
            bundleQ = new Bundle();
            bundleQ.putBinder(he6.l0, new ge6(he6VarN));
        } else {
            bundleQ = he6VarN.q(i2);
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean(fe6.d, z3);
        bundle.putBoolean(fe6.e, z4);
        qf3Var.B(i, bundleQ, bundle);
    }

    @Override // defpackage.gq4
    public final void j(int i, aq7 aq7Var, boolean z, boolean z2, int i2) {
        this.a.w(i, aq7Var.a(z, z2).c(i2));
    }
}
