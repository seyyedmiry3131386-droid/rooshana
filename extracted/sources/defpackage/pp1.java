package defpackage;

import android.view.View;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public final class pp1 implements i87, z99 {
    public boolean a;
    public boolean b;
    public boolean c;
    public final Object d;

    public pp1(int i) {
        switch (i) {
            case 1:
                this.a = true;
                this.d = new rb5();
                break;
            default:
                this.a = true;
                this.d = new ArrayDeque();
                break;
        }
    }

    public void a() {
        ArrayDeque arrayDeque = (ArrayDeque) this.d;
        if (this.c) {
            return;
        }
        try {
            this.c = true;
            while (!arrayDeque.isEmpty()) {
                if (!(this.b || !this.a)) {
                    break;
                }
                Runnable runnable = (Runnable) arrayDeque.poll();
                if (runnable != null) {
                    runnable.run();
                }
            }
        } finally {
            this.c = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b() {
        /*
            r15 = this;
            java.lang.Object r0 = r15.d
            rb5 r0 = (defpackage.rb5) r0
            java.lang.Object[] r1 = r0.c
            long[] r2 = r0.a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L56
            r4 = 0
            r5 = r4
        Lf:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L51
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L29:
            if (r10 >= r8) goto L4f
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L4b
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            boolean r12 = r11 instanceof defpackage.mb5
            if (r12 == 0) goto L4b
            mb5 r11 = (defpackage.mb5) r11
            java.lang.Object[] r12 = r11.a
            int r11 = r11.b
            r13 = r4
        L44:
            if (r13 >= r11) goto L4b
            r14 = r12[r13]
            int r13 = r13 + 1
            goto L44
        L4b:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L29
        L4f:
            if (r8 != r9) goto L56
        L51:
            if (r5 == r3) goto L56
            int r5 = r5 + 1
            goto Lf
        L56:
            r0.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pp1.b():void");
    }

    @Override // defpackage.z99
    public lf9 t(View view, lf9 lf9Var, aa9 aa9Var) {
        if (this.a) {
            aa9Var.d = lf9Var.a() + aa9Var.d;
        }
        boolean zO = o37.o(view);
        if (this.b) {
            if (zO) {
                aa9Var.c = lf9Var.b() + aa9Var.c;
            } else {
                aa9Var.a = lf9Var.b() + aa9Var.a;
            }
        }
        if (this.c) {
            if (zO) {
                aa9Var.a = lf9Var.c() + aa9Var.a;
            } else {
                aa9Var.c = lf9Var.c() + aa9Var.c;
            }
        }
        view.setPaddingRelative(aa9Var.a, aa9Var.b, aa9Var.c, aa9Var.d);
        ((ql4) this.d).t(view, lf9Var, aa9Var);
        return lf9Var;
    }

    public pp1(boolean z, boolean z2, boolean z3, ql4 ql4Var) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = ql4Var;
    }
}
