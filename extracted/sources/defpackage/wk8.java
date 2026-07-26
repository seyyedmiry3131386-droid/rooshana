package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
public class wk8 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(wk8.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;
    public d42[] a;

    public final void a(d42 d42Var) {
        d42Var.e((e42) this);
        d42[] d42VarArr = this.a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b;
        if (d42VarArr == null) {
            d42VarArr = new d42[4];
            this.a = d42VarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= d42VarArr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(d42VarArr, atomicIntegerFieldUpdater.get(this) * 2);
            js3.o(objArrCopyOf, "copyOf(...)");
            d42VarArr = (d42[]) objArrCopyOf;
            this.a = d42VarArr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        d42VarArr[i] = d42Var;
        d42Var.b = i;
        d(i);
    }

    public final void b(d42 d42Var) {
        synchronized (this) {
            if (d42Var.b() != null) {
                c(d42Var.b);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.d42 c(int r9) {
        /*
            r8 = this;
            d42[] r0 = r8.a
            defpackage.js3.m(r0)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.wk8.b
            int r2 = r1.get(r8)
            r3 = -1
            int r2 = r2 + r3
            r1.set(r8, r2)
            int r2 = r1.get(r8)
            if (r9 >= r2) goto L7a
            int r2 = r1.get(r8)
            r8.e(r9, r2)
            int r2 = r9 + (-1)
            int r2 = r2 / 2
            if (r9 <= 0) goto L3a
            r4 = r0[r9]
            defpackage.js3.m(r4)
            r5 = r0[r2]
            defpackage.js3.m(r5)
            int r4 = r4.compareTo(r5)
            if (r4 >= 0) goto L3a
            r8.e(r9, r2)
            r8.d(r2)
            goto L7a
        L3a:
            int r2 = r9 * 2
            int r4 = r2 + 1
            int r5 = r1.get(r8)
            if (r4 < r5) goto L45
            goto L7a
        L45:
            d42[] r5 = r8.a
            defpackage.js3.m(r5)
            int r2 = r2 + 2
            int r6 = r1.get(r8)
            if (r2 >= r6) goto L63
            r6 = r5[r2]
            defpackage.js3.m(r6)
            r7 = r5[r4]
            defpackage.js3.m(r7)
            int r6 = r6.compareTo(r7)
            if (r6 >= 0) goto L63
            goto L64
        L63:
            r2 = r4
        L64:
            r4 = r5[r9]
            defpackage.js3.m(r4)
            r5 = r5[r2]
            defpackage.js3.m(r5)
            int r4 = r4.compareTo(r5)
            if (r4 > 0) goto L75
            goto L7a
        L75:
            r8.e(r9, r2)
            r9 = r2
            goto L3a
        L7a:
            int r9 = r1.get(r8)
            r9 = r0[r9]
            defpackage.js3.m(r9)
            r2 = 0
            r9.e(r2)
            r9.b = r3
            int r1 = r1.get(r8)
            r0[r1] = r2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wk8.c(int):d42");
    }

    public final void d(int i) {
        while (i > 0) {
            d42[] d42VarArr = this.a;
            js3.m(d42VarArr);
            int i2 = (i - 1) / 2;
            d42 d42Var = d42VarArr[i2];
            js3.m(d42Var);
            d42 d42Var2 = d42VarArr[i];
            js3.m(d42Var2);
            if (d42Var.compareTo(d42Var2) <= 0) {
                return;
            }
            e(i, i2);
            i = i2;
        }
    }

    public final void e(int i, int i2) {
        d42[] d42VarArr = this.a;
        js3.m(d42VarArr);
        d42 d42Var = d42VarArr[i2];
        js3.m(d42Var);
        d42 d42Var2 = d42VarArr[i];
        js3.m(d42Var2);
        d42VarArr[i] = d42Var;
        d42VarArr[i2] = d42Var2;
        d42Var.b = i;
        d42Var2.b = i2;
    }
}
