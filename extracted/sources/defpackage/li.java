package defpackage;

import android.graphics.Paint;
import android.text.TextPaint;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class li extends TextPaint {
    public jx9 a;
    public qg8 b;
    public int c;
    public ur7 d;
    public zu0 e;
    public ch0 f;
    public ck1 g;
    public ey7 h;
    public iv1 i;

    public final jx9 a() {
        jx9 jx9Var = this.a;
        if (jx9Var != null) {
            return jx9Var;
        }
        jx9 jx9Var2 = new jx9(this);
        this.a = jx9Var2;
        return jx9Var2;
    }

    public final void b(int i) {
        if (i == this.c) {
            return;
        }
        a().o(i);
        this.c = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(final defpackage.ch0 r6, final long r7, float r9) {
        /*
            r5 = this;
            r0 = 0
            if (r6 != 0) goto Ld
            r5.g = r0
            r5.f = r0
            r5.h = r0
            r5.setShader(r0)
            return
        Ld:
            boolean r1 = r6 instanceof defpackage.k18
            if (r1 == 0) goto L1d
            k18 r6 = (defpackage.k18) r6
            long r6 = r6.a
            long r6 = defpackage.l87.e(r9, r6)
            r5.d(r6)
            return
        L1d:
            boolean r1 = r6 instanceof defpackage.sr7
            if (r1 == 0) goto L71
            ch0 r1 = r5.f
            boolean r1 = defpackage.js3.i(r1, r6)
            r2 = 0
            if (r1 == 0) goto L38
            ey7 r1 = r5.h
            if (r1 != 0) goto L30
            r1 = r2
            goto L36
        L30:
            long r3 = r1.a
            boolean r1 = defpackage.ey7.b(r3, r7)
        L36:
            if (r1 != 0) goto L58
        L38:
            r3 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 == 0) goto L42
            r2 = 1
        L42:
            if (r2 == 0) goto L58
            r5.f = r6
            ey7 r1 = new ey7
            r1.<init>(r7)
            r5.h = r1
            ki r1 = new ki
            r1.<init>()
            ck1 r6 = androidx.compose.runtime.g.c(r1)
            r5.g = r6
        L58:
            jx9 r6 = r5.a()
            ck1 r7 = r5.g
            if (r7 == 0) goto L67
            java.lang.Object r7 = r7.getValue()
            android.graphics.Shader r7 = (android.graphics.Shader) r7
            goto L68
        L67:
            r7 = r0
        L68:
            r6.s(r7)
            r5.e = r0
            defpackage.ok4.X(r5, r9)
            return
        L71:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.li.c(ch0, long, float):void");
    }

    public final void d(long j) {
        zu0 zu0Var = this.e;
        if (zu0Var == null ? false : zu0.c(zu0Var.a, j)) {
            return;
        }
        if (j != 16) {
            this.e = new zu0(j);
            setColor(gu9.E(j));
            this.g = null;
            this.f = null;
            this.h = null;
            setShader(null);
        }
    }

    public final void e(iv1 iv1Var) {
        if (iv1Var == null || js3.i(this.i, iv1Var)) {
            return;
        }
        this.i = iv1Var;
        if (iv1Var.equals(dc2.a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(iv1Var instanceof p88)) {
            throw new NoWhenBranchMatchedException();
        }
        a().x(1);
        p88 p88Var = (p88) iv1Var;
        a().w(p88Var.a);
        jx9 jx9VarA = a();
        ((Paint) jx9VarA.b).setStrokeMiter(p88Var.b);
        a().v(p88Var.d);
        a().u(p88Var.c);
        ((Paint) a().b).setPathEffect(null);
    }

    public final void f(ur7 ur7Var) {
        if (ur7Var == null || js3.i(this.d, ur7Var)) {
            return;
        }
        this.d = ur7Var;
        if (ur7Var.equals(ur7.d)) {
            clearShadowLayer();
            return;
        }
        ur7 ur7Var2 = this.d;
        float f = ur7Var2.c;
        if (f == 0.0f) {
            f = Float.MIN_VALUE;
        }
        setShadowLayer(f, Float.intBitsToFloat((int) (ur7Var2.b >> 32)), Float.intBitsToFloat((int) (this.d.b & 4294967295L)), gu9.E(this.d.a));
    }

    public final void g(qg8 qg8Var) {
        if (qg8Var == null || js3.i(this.b, qg8Var)) {
            return;
        }
        this.b = qg8Var;
        int i = qg8Var.a;
        setUnderlineText((i | 1) == i);
        int i2 = this.b.a;
        setStrikeThruText((i2 | 2) == i2);
    }
}
