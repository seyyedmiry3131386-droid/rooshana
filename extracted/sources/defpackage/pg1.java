package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final class pg1 {
    public static final ya1 h = new ya1(1);
    public static final Random i = new Random();
    public rp4 d;
    public String f;
    public final am8 a = new am8();
    public final yl8 b = new yl8();
    public final HashMap c = new HashMap();
    public bm8 e = bm8.a;
    public long g = -1;

    public final void a(og1 og1Var) {
        long j = og1Var.c;
        if (j != -1) {
            this.g = j;
        }
        this.f = null;
    }

    public final synchronized void b(be beVar) {
        rp4 rp4Var;
        try {
            String str = this.f;
            if (str != null) {
                og1 og1Var = (og1) this.c.get(str);
                og1Var.getClass();
                a(og1Var);
            }
            Iterator it = this.c.values().iterator();
            while (it.hasNext()) {
                og1 og1Var2 = (og1) it.next();
                it.remove();
                if (og1Var2.e && (rp4Var = this.d) != null) {
                    rp4Var.g0(beVar, og1Var2.a);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.og1 c(int r19, defpackage.ks4 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            java.util.HashMap r3 = r0.c
            java.util.Collection r4 = r3.values()
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L16:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L9f
            java.lang.Object r8 = r4.next()
            og1 r8 = (defpackage.og1) r8
            long r9 = r8.c
            ks4 r11 = r8.d
            r12 = -1
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 != 0) goto L57
            int r9 = r8.b
            if (r1 != r9) goto L57
            if (r2 == 0) goto L57
            long r9 = r2.d
            pg1 r14 = r8.g
            java.util.HashMap r15 = r14.c
            r16 = r12
            java.lang.String r12 = r14.f
            java.lang.Object r12 = r15.get(r12)
            og1 r12 = (defpackage.og1) r12
            if (r12 == 0) goto L4b
            long r12 = r12.c
            int r15 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r15 == 0) goto L4b
            goto L50
        L4b:
            long r12 = r14.g
            r14 = 1
            long r12 = r12 + r14
        L50:
            int r12 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r12 < 0) goto L59
            r8.c = r9
            goto L59
        L57:
            r16 = r12
        L59:
            if (r2 != 0) goto L60
            int r9 = r8.b
            if (r1 != r9) goto L16
            goto L83
        L60:
            long r9 = r2.d
            if (r11 != 0) goto L71
            boolean r12 = r2.b()
            if (r12 != 0) goto L16
            long r12 = r8.c
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 != 0) goto L16
            goto L83
        L71:
            long r12 = r11.d
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 != 0) goto L16
            int r9 = r2.b
            int r10 = r11.b
            if (r9 != r10) goto L16
            int r9 = r2.c
            int r10 = r11.c
            if (r9 != r10) goto L16
        L83:
            long r9 = r8.c
            int r12 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r12 == 0) goto L9b
            int r12 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r12 >= 0) goto L8e
            goto L9b
        L8e:
            if (r12 != 0) goto L16
            java.lang.String r9 = defpackage.j29.a
            ks4 r9 = r5.d
            if (r9 == 0) goto L16
            if (r11 == 0) goto L16
            r5 = r8
            goto L16
        L9b:
            r5 = r8
            r6 = r9
            goto L16
        L9f:
            if (r5 != 0) goto Lb1
            ya1 r4 = defpackage.pg1.h
            java.lang.Object r4 = r4.get()
            java.lang.String r4 = (java.lang.String) r4
            og1 r5 = new og1
            r5.<init>(r0, r4, r1, r2)
            r3.put(r4, r5)
        Lb1:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pg1.c(int, ks4):og1");
    }

    public final synchronized String d(bm8 bm8Var, ks4 ks4Var) {
        return c(bm8Var.g(ks4Var.a, this.b).c, ks4Var).a;
    }

    public final void e(be beVar) {
        ks4 ks4Var;
        bm8 bm8Var = beVar.b;
        int i2 = beVar.c;
        ks4 ks4Var2 = beVar.d;
        boolean zP = bm8Var.p();
        HashMap map = this.c;
        if (zP) {
            String str = this.f;
            if (str != null) {
                og1 og1Var = (og1) map.get(str);
                og1Var.getClass();
                a(og1Var);
                return;
            }
            return;
        }
        og1 og1Var2 = (og1) map.get(this.f);
        this.f = c(i2, ks4Var2).a;
        f(beVar);
        if (ks4Var2 != null) {
            long j = ks4Var2.d;
            if (ks4Var2.b()) {
                if (og1Var2 != null && og1Var2.c == j && (ks4Var = og1Var2.d) != null && ks4Var.b == ks4Var2.b && ks4Var.c == ks4Var2.c) {
                    return;
                }
                c(i2, new ks4(j, ks4Var2.a));
                this.d.getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002b A[Catch: all -> 0x0050, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0010, B:9:0x0014, B:11:0x0024, B:20:0x0036, B:22:0x0042, B:24:0x0048, B:14:0x002b, B:30:0x0053, B:32:0x005f, B:33:0x0063, B:35:0x0068, B:37:0x006e, B:39:0x0085, B:40:0x00b3, B:42:0x00b7, B:43:0x00be, B:45:0x00c8, B:47:0x00cc), top: B:52:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void f(defpackage.be r10) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pg1.f(be):void");
    }

    public final synchronized void g(be beVar, int i2) {
        try {
            this.d.getClass();
            boolean z = i2 == 0;
            Iterator it = this.c.values().iterator();
            while (it.hasNext()) {
                og1 og1Var = (og1) it.next();
                if (og1Var.a(beVar)) {
                    it.remove();
                    if (og1Var.e) {
                        boolean zEquals = og1Var.a.equals(this.f);
                        if (z && zEquals) {
                            boolean z2 = og1Var.f;
                        }
                        if (zEquals) {
                            a(og1Var);
                        }
                        this.d.g0(beVar, og1Var.a);
                    }
                }
            }
            e(beVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}
