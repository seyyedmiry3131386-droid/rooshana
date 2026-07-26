package defpackage;

import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class a18 {
    public final dp2 a;
    public boolean c;
    public ts5 h;
    public z08 i;
    public final AtomicReference b = new AtomicReference(null);
    public final g8 d = new g8(26, this);
    public final a67 e = new a67(15, this);
    public final zb5 f = new zb5(0, new z08[16]);
    public final Object g = new Object();
    public long j = -1;

    public a18(dp2 dp2Var) {
        this.a = dp2Var;
    }

    public final void a() {
        synchronized (this.g) {
            zb5 zb5Var = this.f;
            Object[] objArr = zb5Var.a;
            int i = zb5Var.c;
            for (int i2 = 0; i2 < i; i2++) {
                z08 z08Var = (z08) objArr[i2];
                z08Var.e.a();
                z08Var.f.a();
                z08Var.l.a();
                z08Var.m.clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.Object r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            java.lang.Object r2 = r1.g
            monitor-enter(r2)
            zb5 r3 = r1.f     // Catch: java.lang.Throwable -> L90
            int r4 = r3.c     // Catch: java.lang.Throwable -> L90
            r6 = 0
            r7 = 0
        Ld:
            if (r6 >= r4) goto L98
            java.lang.Object[] r8 = r3.a     // Catch: java.lang.Throwable -> L90
            r8 = r8[r6]     // Catch: java.lang.Throwable -> L90
            z08 r8 = (defpackage.z08) r8     // Catch: java.lang.Throwable -> L90
            rb5 r9 = r8.f     // Catch: java.lang.Throwable -> L90
            java.lang.Object r9 = r9.k(r0)     // Catch: java.lang.Throwable -> L90
            ib5 r9 = (defpackage.ib5) r9     // Catch: java.lang.Throwable -> L90
            if (r9 != 0) goto L22
        L1f:
            r16 = r6
            goto L7a
        L22:
            java.lang.Object[] r10 = r9.b     // Catch: java.lang.Throwable -> L90
            int[] r11 = r9.c     // Catch: java.lang.Throwable -> L90
            long[] r9 = r9.a     // Catch: java.lang.Throwable -> L90
            int r12 = r9.length     // Catch: java.lang.Throwable -> L90
            int r12 = r12 + (-2)
            if (r12 < 0) goto L1f
            r13 = 0
        L2e:
            r14 = r9[r13]     // Catch: java.lang.Throwable -> L90
            r16 = r6
            long r5 = ~r14     // Catch: java.lang.Throwable -> L90
            r17 = 7
            long r5 = r5 << r17
            long r5 = r5 & r14
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r5 = r5 & r17
            int r5 = (r5 > r17 ? 1 : (r5 == r17 ? 0 : -1))
            if (r5 == 0) goto L71
            int r5 = r13 - r12
            int r5 = ~r5     // Catch: java.lang.Throwable -> L90
            int r5 = r5 >>> 31
            r6 = 8
            int r5 = 8 - r5
            r17 = r6
            r6 = 0
        L4f:
            if (r6 >= r5) goto L6d
            r18 = 255(0xff, double:1.26E-321)
            long r18 = r14 & r18
            r20 = 128(0x80, double:6.3E-322)
            int r18 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r18 >= 0) goto L66
            int r18 = r13 << 3
            int r18 = r18 + r6
            r1 = r10[r18]     // Catch: java.lang.Throwable -> L90
            r18 = r11[r18]     // Catch: java.lang.Throwable -> L90
            r8.c(r0, r1)     // Catch: java.lang.Throwable -> L90
        L66:
            long r14 = r14 >> r17
            int r6 = r6 + 1
            r1 = r22
            goto L4f
        L6d:
            r1 = r17
            if (r5 != r1) goto L7a
        L71:
            if (r13 == r12) goto L7a
            int r13 = r13 + 1
            r1 = r22
            r6 = r16
            goto L2e
        L7a:
            rb5 r1 = r8.f     // Catch: java.lang.Throwable -> L90
            boolean r1 = r1.j()     // Catch: java.lang.Throwable -> L90
            if (r1 != 0) goto L85
            int r7 = r7 + 1
            goto L92
        L85:
            if (r7 <= 0) goto L92
            java.lang.Object[] r1 = r3.a     // Catch: java.lang.Throwable -> L90
            int r6 = r16 - r7
            r5 = r1[r16]     // Catch: java.lang.Throwable -> L90
            r1[r6] = r5     // Catch: java.lang.Throwable -> L90
            goto L92
        L90:
            r0 = move-exception
            goto La4
        L92:
            int r6 = r16 + 1
            r1 = r22
            goto Ld
        L98:
            java.lang.Object[] r0 = r3.a     // Catch: java.lang.Throwable -> L90
            int r1 = r4 - r7
            r5 = 0
            java.util.Arrays.fill(r0, r1, r4, r5)     // Catch: java.lang.Throwable -> L90
            r3.c = r1     // Catch: java.lang.Throwable -> L90
            monitor-exit(r2)
            return
        La4:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a18.b(java.lang.Object):void");
    }

    public final boolean c() {
        boolean z;
        Set set;
        Set set2;
        synchronized (this.g) {
            z = this.c;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            AtomicReference atomicReference = this.b;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                Object obj2 = null;
                Object objSubList = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        sz0.b("Unexpected notification");
                        throw new KotlinNothingValueException();
                    }
                    List list = (List) obj;
                    Set set3 = (Set) list.get(0);
                    if (list.size() == 2) {
                        objSubList = list.get(1);
                    } else if (list.size() > 2) {
                        objSubList = list.subList(1, list.size());
                    }
                    set2 = set3;
                    obj2 = objSubList;
                }
                while (!atomicReference.compareAndSet(obj, obj2)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set = set2;
                break;
            }
            if (set == null) {
                return z2;
            }
            synchronized (this.g) {
                zb5 zb5Var = this.f;
                Object[] objArr = zb5Var.a;
                int i = zb5Var.c;
                for (int i2 = 0; i2 < i; i2++) {
                    z2 = ((z08) objArr[i2]).a(set) || z2;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x01cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(java.lang.Object r24, defpackage.dp2 r25, defpackage.bp2 r26) {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a18.d(java.lang.Object, dp2, bp2):void");
    }

    public final void e() {
        g8 g8Var = this.d;
        g08.e(g08.a);
        synchronized (g08.c) {
            g08.h = a.A0(g8Var, g08.h);
        }
        this.h = new ts5(19, g8Var);
    }
}
