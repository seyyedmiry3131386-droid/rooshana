package defpackage;

import android.graphics.Canvas;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class yg {
    public final ch a;
    public final int b;
    public final long c;
    public final pi8 d;
    public final CharSequence e;
    public final Object f;

    /* JADX WARN: Removed duplicated region for block: B:102:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public yg(defpackage.ch r21, int r22, int r23, long r24) {
        /*
            Method dump skipped, instruction units count: 840
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yg.<init>(ch, int, int, long):void");
    }

    public final pi8 a(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        w96 w96Var;
        float fD = d();
        ch chVar = this.a;
        li liVar = chVar.g;
        int i8 = chVar.l;
        c14 c14Var = chVar.i;
        gj8 gj8Var = chVar.b;
        zg zgVar = ah.a;
        da6 da6Var = gj8Var.c;
        return new pi8(charSequence, fD, liVar, i, truncateAt, i8, (da6Var == null || (w96Var = da6Var.b) == null) ? false : w96Var.a, i3, i5, i6, i7, i4, i2, c14Var);
    }

    public final float b() {
        return this.d.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long c(defpackage.sy6 r12, int r13, defpackage.p58 r14) {
        /*
            r11 = this;
            android.graphics.RectF r4 = defpackage.uy6.s(r12)
            r12 = 1
            r8 = 0
            if (r13 != 0) goto L9
            goto Ld
        L9:
            if (r13 != r12) goto Ld
            r13 = r12
            goto Le
        Ld:
            r13 = r8
        Le:
            g8 r6 = new g8
            r0 = 1
            r6.<init>(r0, r14)
            pi8 r0 = r11.d
            android.text.Layout r1 = r0.f
            int r14 = android.os.Build.VERSION.SDK_INT
            r2 = 34
            if (r14 < r2) goto L24
            int[] r13 = defpackage.i3.j(r0, r4, r13, r6)
            goto Lb9
        L24:
            rb4 r2 = r0.c()
            if (r13 != r12) goto L3b
            bn6 r13 = new bn6
            java.lang.CharSequence r14 = r1.getText()
            aj0 r3 = r0.j()
            r5 = 19
            r13.<init>(r14, r3, r5)
        L39:
            r5 = r13
            goto L52
        L3b:
            java.lang.CharSequence r13 = r1.getText()
            android.text.TextPaint r3 = r0.a
            r5 = 29
            if (r14 < r5) goto L4c
            bv2 r14 = new bv2
            r14.<init>(r13, r3)
        L4a:
            r13 = r14
            goto L39
        L4c:
            cv2 r14 = new cv2
            r14.<init>(r13)
            goto L4a
        L52:
            float r13 = r4.top
            int r13 = (int) r13
            int r13 = r1.getLineForVertical(r13)
            float r14 = r4.top
            float r3 = r0.e(r13)
            int r14 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r14 <= 0) goto L6a
            int r13 = r13 + 1
            int r14 = r0.g
            if (r13 < r14) goto L6a
            goto La9
        L6a:
            r3 = r13
            float r13 = r4.bottom
            int r13 = (int) r13
            int r13 = r1.getLineForVertical(r13)
            if (r13 != 0) goto L7f
            float r14 = r4.bottom
            float r7 = r0.g(r8)
            int r14 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r14 >= 0) goto L7f
            goto La9
        L7f:
            r7 = 1
            int r14 = defpackage.cc7.t(r0, r1, r2, r3, r4, r5, r6, r7)
        L84:
            r9 = r3
            r10 = -1
            if (r14 != r10) goto L92
            if (r9 >= r13) goto L92
            int r3 = r9 + 1
            r7 = 1
            int r14 = defpackage.cc7.t(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L84
        L92:
            if (r14 != r10) goto L95
            goto La9
        L95:
            r7 = 0
            r3 = r13
            int r13 = defpackage.cc7.t(r0, r1, r2, r3, r4, r5, r6, r7)
        L9b:
            if (r13 != r10) goto La7
            if (r9 >= r3) goto La7
            int r3 = r3 + (-1)
            r7 = 0
            int r13 = defpackage.cc7.t(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L9b
        La7:
            if (r13 != r10) goto Lab
        La9:
            r13 = 0
            goto Lb9
        Lab:
            int r14 = r14 + r12
            int r14 = r5.k(r14)
            int r13 = r13 - r12
            int r13 = r5.l(r13)
            int[] r13 = new int[]{r14, r13}
        Lb9:
            if (r13 != 0) goto Lbe
            long r12 = defpackage.zi8.b
            return r12
        Lbe:
            r14 = r13[r8]
            r12 = r13[r12]
            long r12 = defpackage.uy6.b(r14, r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yg.c(sy6, int, p58):long");
    }

    public final float d() {
        return h31.h(this.c);
    }

    public final void e(tm0 tm0Var) {
        Canvas canvasA = ve.a(tm0Var);
        pi8 pi8Var = this.d;
        if (pi8Var.d) {
            canvasA.save();
            canvasA.clipRect(0.0f, 0.0f, d(), b());
        }
        int i = pi8Var.h;
        if (canvasA.getClipBounds(pi8Var.p)) {
            if (i != 0) {
                canvasA.translate(0.0f, i);
            }
            ThreadLocal threadLocal = ti8.a;
            Object qf8Var = threadLocal.get();
            if (qf8Var == null) {
                qf8Var = new qf8();
                threadLocal.set(qf8Var);
            }
            qf8 qf8Var2 = (qf8) qf8Var;
            qf8Var2.a = canvasA;
            try {
                pi8Var.f.draw(qf8Var2);
                if (i != 0) {
                    canvasA.translate(0.0f, (-1) * i);
                }
            } finally {
                qf8Var2.a = null;
            }
        }
        if (pi8Var.d) {
            canvasA.restore();
        }
    }

    public final void f(tm0 tm0Var, long j, ur7 ur7Var, qg8 qg8Var, iv1 iv1Var) {
        li liVar = this.a.g;
        int i = liVar.c;
        liVar.d(j);
        liVar.f(ur7Var);
        liVar.g(qg8Var);
        liVar.e(iv1Var);
        liVar.b(3);
        e(tm0Var);
        liVar.b(i);
    }

    public final void g(tm0 tm0Var, ch0 ch0Var, float f, ur7 ur7Var, qg8 qg8Var, iv1 iv1Var) {
        li liVar = this.a.g;
        int i = liVar.c;
        float fD = d();
        liVar.c(ch0Var, (((long) Float.floatToRawIntBits(b())) & 4294967295L) | (Float.floatToRawIntBits(fD) << 32), f);
        liVar.f(ur7Var);
        liVar.g(qg8Var);
        liVar.e(iv1Var);
        liVar.b(3);
        e(tm0Var);
        liVar.b(i);
    }
}
