package androidx.compose.ui.graphics.layer;

import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.ai0;
import defpackage.dp2;
import defpackage.eh;
import defpackage.ey7;
import defpackage.fv2;
import defpackage.ia7;
import defpackage.js3;
import defpackage.jx9;
import defpackage.nr5;
import defpackage.p3;
import defpackage.qj1;
import defpackage.rq4;
import defpackage.sy6;
import defpackage.tt3;
import defpackage.tx8;
import defpackage.u26;
import defpackage.vm0;
import defpackage.vw5;
import defpackage.ww5;
import defpackage.xw5;
import defpackage.zq3;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final fv2 a;
    public Outline f;
    public float j;
    public rq4 k;
    public u26 l;
    public eh m;
    public boolean n;
    public vm0 o;
    public jx9 p;
    public int q;
    public boolean s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public RectF x;
    public qj1 b = rq4.a;
    public LayoutDirection c = LayoutDirection.a;
    public dp2 d = new dp2() { // from class: androidx.compose.ui.graphics.layer.GraphicsLayer$drawBlock$1
        @Override // defpackage.dp2
        public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return tx8.a;
        }
    };
    public final dp2 e = new GraphicsLayer$clipDrawBlock$1(this);
    public boolean g = true;
    public long h = 0;
    public long i = 9205357640488583168L;
    public final ai0 r = new ai0();

    static {
        String lowerCase = Build.FINGERPRINT.toLowerCase(Locale.ROOT);
        js3.o(lowerCase, "toLowerCase(...)");
        lowerCase.equals("robolectric");
    }

    public a(fv2 fv2Var) {
        this.a = fv2Var;
        fv2Var.G(false);
        this.t = 0L;
        this.u = 0L;
        this.v = 9205357640488583168L;
    }

    public final void a() {
        Outline outline;
        if (this.g) {
            boolean z = this.w;
            Outline outline2 = null;
            fv2 fv2Var = this.a;
            if (z || fv2Var.M() > 0.0f) {
                u26 u26Var = this.l;
                if (u26Var != null) {
                    RectF rectF = this.x;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.x = rectF;
                    }
                    boolean z2 = u26Var instanceof eh;
                    if (!z2) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    ((eh) u26Var).a.computeBounds(rectF, false);
                    int i = Build.VERSION.SDK_INT;
                    if (i > 28 || ((eh) u26Var).a.isConvex()) {
                        outline = this.f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f = outline;
                        }
                        if (i >= 30) {
                            p3.w(outline, u26Var);
                        } else {
                            if (!z2) {
                                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                            }
                            outline.setConvexPath(((eh) u26Var).a);
                        }
                        this.n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.n = true;
                        outline = null;
                    }
                    this.l = u26Var;
                    if (outline != null) {
                        outline.setAlpha(fv2Var.a());
                        outline2 = outline;
                    }
                    fv2Var.f(outline2, (4294967295L & ((long) Math.round(rectF.height()))) | (((long) Math.round(rectF.width())) << 32));
                    if (this.n && this.w) {
                        fv2Var.G(false);
                        fv2Var.h();
                    } else {
                        fv2Var.G(this.w);
                    }
                } else {
                    fv2Var.G(this.w);
                    Outline outline4 = this.f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f = outline4;
                    }
                    Outline outline5 = outline4;
                    long jM = tt3.M(this.u);
                    long j = this.h;
                    long j2 = this.i;
                    if (j2 != 9205357640488583168L) {
                        jM = j2;
                    }
                    int i2 = (int) (j >> 32);
                    int i3 = (int) (j & 4294967295L);
                    int i4 = (int) (jM >> 32);
                    int i5 = (int) (jM & 4294967295L);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i3)), Math.round(Float.intBitsToFloat(i4) + Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i5) + Float.intBitsToFloat(i3)), this.j);
                    outline5.setAlpha(fv2Var.a());
                    fv2Var.f(outline5, (4294967295L & ((long) Math.round(Float.intBitsToFloat(i5)))) | (((long) Math.round(Float.intBitsToFloat(i4))) << 32));
                }
            } else {
                fv2Var.G(false);
                fv2Var.f(null, 0L);
            }
        }
        this.g = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r15 = this;
            boolean r0 = r15.s
            if (r0 == 0) goto L75
            int r0 = r15.q
            if (r0 != 0) goto L75
            ai0 r0 = r15.r
            java.lang.Object r1 = r0.b
            androidx.compose.ui.graphics.layer.a r1 = (androidx.compose.ui.graphics.layer.a) r1
            if (r1 == 0) goto L1c
            int r2 = r1.q
            int r2 = r2 + (-1)
            r1.q = r2
            r1.b()
            r1 = 0
            r0.b = r1
        L1c:
            java.lang.Object r0 = r0.d
            sb5 r0 = (defpackage.sb5) r0
            if (r0 == 0) goto L70
            java.lang.Object[] r1 = r0.b
            long[] r2 = r0.a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L6d
            r4 = 0
            r5 = r4
        L2d:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L68
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L47:
            if (r10 >= r8) goto L66
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L62
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            androidx.compose.ui.graphics.layer.a r11 = (androidx.compose.ui.graphics.layer.a) r11
            int r12 = r11.q
            int r12 = r12 + (-1)
            r11.q = r12
            r11.b()
        L62:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L47
        L66:
            if (r8 != r9) goto L6d
        L68:
            if (r5 == r3) goto L6d
            int r5 = r5 + 1
            goto L2d
        L6d:
            r0.e()
        L70:
            fv2 r0 = r15.a
            r0.h()
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.layer.a.b():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(defpackage.hv1 r15) {
        /*
            r14 = this;
            ai0 r0 = r14.r
            java.lang.Object r1 = r0.b
            androidx.compose.ui.graphics.layer.a r1 = (androidx.compose.ui.graphics.layer.a) r1
            r0.c = r1
            java.lang.Object r1 = r0.d
            sb5 r1 = (defpackage.sb5) r1
            if (r1 == 0) goto L29
            boolean r2 = r1.c()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r0.e
            sb5 r2 = (defpackage.sb5) r2
            if (r2 != 0) goto L23
            sb5 r2 = defpackage.de7.a
            sb5 r2 = new sb5
            r2.<init>()
            r0.e = r2
        L23:
            r2.j(r1)
            r1.e()
        L29:
            r1 = 1
            r0.a = r1
            dp2 r1 = r14.d
            r1.invoke(r15)
            r15 = 0
            r0.a = r15
            java.lang.Object r1 = r0.c
            androidx.compose.ui.graphics.layer.a r1 = (androidx.compose.ui.graphics.layer.a) r1
            if (r1 == 0) goto L43
            int r2 = r1.q
            int r2 = r2 + (-1)
            r1.q = r2
            r1.b()
        L43:
            java.lang.Object r0 = r0.e
            sb5 r0 = (defpackage.sb5) r0
            if (r0 == 0) goto L9c
            boolean r1 = r0.c()
            if (r1 == 0) goto L9c
            java.lang.Object[] r1 = r0.b
            long[] r2 = r0.a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L99
            r4 = r15
        L59:
            r5 = r2[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L94
            int r7 = r4 - r3
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r15
        L73:
            if (r9 >= r7) goto L92
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L8e
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            androidx.compose.ui.graphics.layer.a r10 = (androidx.compose.ui.graphics.layer.a) r10
            int r11 = r10.q
            int r11 = r11 + (-1)
            r10.q = r11
            r10.b()
        L8e:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L73
        L92:
            if (r7 != r8) goto L99
        L94:
            if (r4 == r3) goto L99
            int r4 = r4 + 1
            goto L59
        L99:
            r0.e()
        L9c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.layer.a.c(hv1):void");
    }

    public final rq4 d() {
        rq4 ww5Var;
        rq4 rq4Var = this.k;
        u26 u26Var = this.l;
        if (rq4Var != null) {
            return rq4Var;
        }
        if (u26Var != null) {
            vw5 vw5Var = new vw5(u26Var);
            this.k = vw5Var;
            return vw5Var;
        }
        long jM = tt3.M(this.u);
        long j = this.h;
        long j2 = this.i;
        if (j2 != 9205357640488583168L) {
            jM = j2;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jM >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jM & 4294967295L)) + fIntBitsToFloat2;
        float f = this.j;
        if (f > 0.0f) {
            ww5Var = new xw5(ia7.a(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, (((long) Float.floatToRawIntBits(f)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f)))));
        } else {
            ww5Var = new ww5(new sy6(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.k = ww5Var;
        return ww5Var;
    }

    public final void e(qj1 qj1Var, LayoutDirection layoutDirection, long j, dp2 dp2Var) {
        boolean zB = zq3.b(this.u, j);
        fv2 fv2Var = this.a;
        if (!zB) {
            this.u = j;
            long j2 = this.t;
            fv2Var.m((int) (j2 >> 32), (int) (j2 & 4294967295L), j);
            if (this.i == 9205357640488583168L) {
                this.g = true;
                a();
            }
        }
        this.b = qj1Var;
        this.c = layoutDirection;
        this.d = dp2Var;
        fv2Var.o(qj1Var, layoutDirection, this, this.e);
    }

    public final void f(long j, long j2, float f) {
        if (nr5.c(this.h, j) && ey7.b(this.i, j2) && this.j == f && this.l == null) {
            return;
        }
        this.k = null;
        this.l = null;
        this.g = true;
        this.n = false;
        this.h = j;
        this.i = j2;
        this.j = f;
        a();
    }
}
