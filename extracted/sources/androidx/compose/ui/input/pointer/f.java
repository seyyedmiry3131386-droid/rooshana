package androidx.compose.ui.input.pointer;

import defpackage.ah6;
import defpackage.at2;
import defpackage.bd8;
import defpackage.bt2;
import defpackage.dh6;
import defpackage.dp2;
import defpackage.dw1;
import defpackage.eh6;
import defpackage.g51;
import defpackage.gx4;
import defpackage.li1;
import defpackage.o40;
import defpackage.ok4;
import defpackage.om0;
import defpackage.qj1;
import defpackage.qp2;
import defpackage.ro8;
import defpackage.tx8;
import defpackage.ub7;
import defpackage.vg6;
import defpackage.y40;
import defpackage.zb5;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: classes.dex */
public final class f extends gx4 implements eh6, qj1, dh6 {
    public Object o;
    public Object p;
    public PointerInputEventHandler q;
    public li1 r;
    public vg6 s = bd8.a;
    public final zb5 t;
    public final zb5 u;
    public final zb5 v;
    public vg6 w;
    public long x;

    public f(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.o = obj;
        this.p = obj2;
        this.q = pointerInputEventHandler;
        zb5 zb5Var = new zb5(0, new e[16]);
        this.t = zb5Var;
        this.u = zb5Var;
        this.v = new zb5(0, new e[16]);
        this.x = 0L;
    }

    @Override // defpackage.dh6
    public final void B() {
        vg6 vg6Var = this.w;
        if (vg6Var == null) {
            return;
        }
        List list = vg6Var.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((ah6) list.get(i)).d) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ah6 ah6Var = (ah6) list.get(i2);
                    long j = ah6Var.a;
                    long j2 = ah6Var.c;
                    long j3 = ah6Var.b;
                    float f = ah6Var.e;
                    boolean z = ah6Var.d;
                    arrayList.add(new ah6(j, j3, j2, false, f, j3, j2, z, z, ah6Var.i, 0L));
                }
                vg6 vg6Var2 = new vg6(arrayList, null);
                this.s = vg6Var2;
                D0(vg6Var2, PointerEventPass.a);
                D0(vg6Var2, PointerEventPass.b);
                D0(vg6Var2, PointerEventPass.c);
                this.w = null;
                return;
            }
        }
    }

    public final Object C0(qp2 qp2Var, g51 g51Var) {
        om0 om0Var = new om0(1, ok4.I(g51Var));
        om0Var.v();
        final e eVar = new e(this, om0Var);
        synchronized (this.u) {
            this.t.b(eVar);
            g51 g51VarI = ok4.I(ok4.x(eVar, eVar, qp2Var));
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            new ub7(g51VarI).resumeWith(tx8.a);
        }
        om0Var.x(new dp2() { // from class: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$awaitPointerEventScope$2$2
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                Throwable th = (Throwable) obj;
                e eVar2 = eVar;
                om0 om0Var2 = eVar2.c;
                if (om0Var2 != null) {
                    om0Var2.n(th);
                }
                eVar2.c = null;
                return tx8.a;
            }
        });
        return om0Var.u();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004c A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:6:0x000d, B:13:0x001b, B:14:0x0020, B:17:0x0023, B:20:0x002f, B:22:0x0037, B:24:0x003b, B:25:0x0040, B:26:0x0043, B:28:0x004c, B:30:0x0054, B:32:0x0058), top: B:41:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D0(defpackage.vg6 r7, androidx.compose.ui.input.pointer.PointerEventPass r8) {
        /*
            r6 = this;
            zb5 r0 = r6.u
            monitor-enter(r0)
            zb5 r1 = r6.v     // Catch: java.lang.Throwable -> L6c
            zb5 r2 = r6.t     // Catch: java.lang.Throwable -> L6c
            int r3 = r1.c     // Catch: java.lang.Throwable -> L6c
            r1.c(r3, r2)     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r0)
            int r0 = r8.ordinal()     // Catch: java.lang.Throwable -> L21
            r1 = 0
            if (r0 == 0) goto L43
            r2 = 1
            if (r0 == r2) goto L23
            r2 = 2
            if (r0 != r2) goto L1b
            goto L43
        L1b:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException     // Catch: java.lang.Throwable -> L21
            r7.<init>()     // Catch: java.lang.Throwable -> L21
            throw r7     // Catch: java.lang.Throwable -> L21
        L21:
            r7 = move-exception
            goto L66
        L23:
            zb5 r0 = r6.v     // Catch: java.lang.Throwable -> L21
            int r3 = r0.c     // Catch: java.lang.Throwable -> L21
            int r3 = r3 - r2
            java.lang.Object[] r0 = r0.a     // Catch: java.lang.Throwable -> L21
            int r2 = r0.length     // Catch: java.lang.Throwable -> L21
            if (r3 >= r2) goto L60
        L2d:
            if (r3 < 0) goto L60
            r2 = r0[r3]     // Catch: java.lang.Throwable -> L21
            androidx.compose.ui.input.pointer.e r2 = (androidx.compose.ui.input.pointer.e) r2     // Catch: java.lang.Throwable -> L21
            androidx.compose.ui.input.pointer.PointerEventPass r4 = r2.d     // Catch: java.lang.Throwable -> L21
            if (r8 != r4) goto L40
            om0 r4 = r2.c     // Catch: java.lang.Throwable -> L21
            if (r4 == 0) goto L40
            r2.c = r1     // Catch: java.lang.Throwable -> L21
            r4.resumeWith(r7)     // Catch: java.lang.Throwable -> L21
        L40:
            int r3 = r3 + (-1)
            goto L2d
        L43:
            zb5 r0 = r6.v     // Catch: java.lang.Throwable -> L21
            java.lang.Object[] r2 = r0.a     // Catch: java.lang.Throwable -> L21
            int r0 = r0.c     // Catch: java.lang.Throwable -> L21
            r3 = 0
        L4a:
            if (r3 >= r0) goto L60
            r4 = r2[r3]     // Catch: java.lang.Throwable -> L21
            androidx.compose.ui.input.pointer.e r4 = (androidx.compose.ui.input.pointer.e) r4     // Catch: java.lang.Throwable -> L21
            androidx.compose.ui.input.pointer.PointerEventPass r5 = r4.d     // Catch: java.lang.Throwable -> L21
            if (r8 != r5) goto L5d
            om0 r5 = r4.c     // Catch: java.lang.Throwable -> L21
            if (r5 == 0) goto L5d
            r4.c = r1     // Catch: java.lang.Throwable -> L21
            r5.resumeWith(r7)     // Catch: java.lang.Throwable -> L21
        L5d:
            int r3 = r3 + 1
            goto L4a
        L60:
            zb5 r7 = r6.v
            r7.h()
            return
        L66:
            zb5 r8 = r6.v
            r8.h()
            throw r7
        L6c:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.f.D0(vg6, androidx.compose.ui.input.pointer.PointerEventPass):void");
    }

    public final void E0() {
        li1 li1Var = this.r;
        if (li1Var != null) {
            li1Var.v(new PointerInputResetException());
            this.r = null;
        }
    }

    @Override // defpackage.qj1
    public final long F(float f) {
        return dw1.d(this, L(f));
    }

    @Override // defpackage.dh6
    public final /* synthetic */ void I() {
    }

    @Override // defpackage.qj1
    public final float J(int i) {
        return i / getDensity();
    }

    @Override // defpackage.qj1
    public final float L(float f) {
        return f / getDensity();
    }

    @Override // defpackage.qj1
    public final float O() {
        return y40.H(this).A.O();
    }

    @Override // defpackage.qj1
    public final float S(float f) {
        return getDensity() * f;
    }

    @Override // defpackage.qj1
    public final /* synthetic */ int b0(float f) {
        return o40.a(this, f);
    }

    @Override // defpackage.dh6
    public final /* synthetic */ boolean e0() {
        return false;
    }

    @Override // defpackage.qj1
    public final float getDensity() {
        return y40.H(this).A.getDensity();
    }

    @Override // defpackage.qj1
    public final /* synthetic */ long h0(long j) {
        return o40.d(j, this);
    }

    @Override // defpackage.dh6
    public final void i0() {
        E0();
    }

    @Override // defpackage.qj1
    public final /* synthetic */ float j0(long j) {
        return o40.c(j, this);
    }

    @Override // defpackage.dh6
    public final long m() {
        return ro8.a;
    }

    @Override // defpackage.qj1
    public final /* synthetic */ long o(long j) {
        return o40.b(j, this);
    }

    @Override // defpackage.qj1
    public final /* synthetic */ float s(long j) {
        return dw1.b(j, this);
    }

    @Override // defpackage.dh6
    public final void t(vg6 vg6Var, PointerEventPass pointerEventPass, long j) {
        this.x = j;
        if (pointerEventPass == PointerEventPass.a) {
            this.s = vg6Var;
        }
        if (this.r == null) {
            this.r = bt2.G(o0(), null, CoroutineStart.d, new SuspendingPointerInputModifierNodeImpl$onPointerEvent$1(this, null), 1);
        }
        D0(vg6Var, pointerEventPass);
        List list = vg6Var.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                vg6Var = null;
                break;
            } else if (!at2.Q((ah6) list.get(i))) {
                break;
            } else {
                i++;
            }
        }
        this.w = vg6Var;
    }

    @Override // defpackage.gx4
    public final void t0() {
        E0();
    }

    @Override // defpackage.gx4
    public final void u0() {
        E0();
    }
}
