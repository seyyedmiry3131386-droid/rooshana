package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import androidx.recyclerview.widget.l;
import defpackage.aj4;
import defpackage.at2;
import defpackage.b07;
import defpackage.cz3;
import defpackage.dw1;
import defpackage.dz3;
import defpackage.en0;
import defpackage.ez3;
import defpackage.fn0;
import defpackage.gn0;
import defpackage.hn0;
import defpackage.i95;
import defpackage.in0;
import defpackage.jn0;
import defpackage.oq6;
import defpackage.qq4;
import defpackage.rm7;
import defpackage.st6;
import defpackage.yk;
import defpackage.yt6;
import defpackage.zz6;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class CarouselLayoutManager extends k implements zz6 {
    public int A;
    public int B;
    public final int C;
    public int p;
    public int q;
    public int r;
    public final gn0 s;
    public final i95 t;
    public ez3 u;
    public dz3 v;
    public int w;
    public HashMap x;
    public jn0 y;
    public final View.OnLayoutChangeListener z;

    public CarouselLayoutManager() {
        i95 i95Var = new i95();
        this.s = new gn0();
        this.w = 0;
        this.z = new en0(0, this);
        this.B = -1;
        this.C = 0;
        this.t = i95Var;
        Y0();
        a1(0);
    }

    public static qq4 R0(List list, float f, boolean z) {
        float f2 = Float.MAX_VALUE;
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        float f3 = -3.4028235E38f;
        float f4 = Float.MAX_VALUE;
        float f5 = Float.MAX_VALUE;
        for (int i5 = 0; i5 < list.size(); i5++) {
            cz3 cz3Var = (cz3) list.get(i5);
            float f6 = z ? cz3Var.b : cz3Var.a;
            float fAbs = Math.abs(f6 - f);
            if (f6 <= f && fAbs <= f2) {
                i = i5;
                f2 = fAbs;
            }
            if (f6 > f && fAbs <= f4) {
                i3 = i5;
                f4 = fAbs;
            }
            if (f6 <= f5) {
                i2 = i5;
                f5 = f6;
            }
            if (f6 > f3) {
                i4 = i5;
                f3 = f6;
            }
        }
        if (i == -1) {
            i = i2;
        }
        if (i3 == -1) {
            i3 = i4;
        }
        cz3 cz3Var2 = (cz3) list.get(i);
        cz3 cz3Var3 = (cz3) list.get(i3);
        qq4 qq4Var = new qq4();
        if (cz3Var2.a > cz3Var3.a) {
            throw new IllegalArgumentException();
        }
        qq4Var.a = cz3Var2;
        qq4Var.b = cz3Var3;
        return qq4Var;
    }

    @Override // androidx.recyclerview.widget.k
    public final void D0(RecyclerView recyclerView, int i) {
        fn0 fn0Var = new fn0(this, recyclerView.getContext(), 0);
        fn0Var.a = i;
        E0(fn0Var);
    }

    public final float G0(float f, float f2) {
        return T0() ? f - f2 : f + f2;
    }

    public final void H0(l lVar, int i, int i2) {
        if (i < 0 || i >= C()) {
            return;
        }
        float fL0 = L0(i);
        View viewD = lVar.d(i);
        W0(viewD);
        float fG0 = G0(fL0, this.v.a / 2.0f);
        qq4 qq4VarR0 = R0(this.v.c, fG0, false);
        float fK0 = K0(fG0, qq4VarR0);
        float f = this.v.a / 2.0f;
        c(viewD, i2, false);
        W0(viewD);
        this.y.h(viewD, (int) (fK0 - f), (int) (fK0 + f));
        b1(viewD, fG0, qq4VarR0);
    }

    public final void I0(int i, b07 b07Var, l lVar) {
        float fL0 = L0(i);
        while (i < b07Var.b()) {
            float fG0 = G0(fL0, this.v.a / 2.0f);
            qq4 qq4VarR0 = R0(this.v.c, fG0, false);
            float fK0 = K0(fG0, qq4VarR0);
            if (U0(fK0, qq4VarR0)) {
                return;
            }
            fL0 = G0(fL0, this.v.a);
            if (!V0(fK0, qq4VarR0)) {
                View viewD = lVar.d(i);
                float f = this.v.a / 2.0f;
                c(viewD, -1, false);
                W0(viewD);
                this.y.h(viewD, (int) (fK0 - f), (int) (fK0 + f));
                b1(viewD, fG0, qq4VarR0);
            }
            i++;
        }
    }

    public final void J0(l lVar, int i) {
        float fL0 = L0(i);
        while (i >= 0) {
            float fG0 = G0(fL0, this.v.a / 2.0f);
            qq4 qq4VarR0 = R0(this.v.c, fG0, false);
            float fK0 = K0(fG0, qq4VarR0);
            if (V0(fK0, qq4VarR0)) {
                return;
            }
            float f = this.v.a;
            fL0 = T0() ? fL0 + f : fL0 - f;
            if (!U0(fK0, qq4VarR0)) {
                View viewD = lVar.d(i);
                float f2 = this.v.a / 2.0f;
                c(viewD, 0, false);
                W0(viewD);
                this.y.h(viewD, (int) (fK0 - f2), (int) (fK0 + f2));
                b1(viewD, fG0, qq4VarR0);
            }
            i--;
        }
    }

    public final float K0(float f, qq4 qq4Var) {
        cz3 cz3Var = (cz3) qq4Var.a;
        float f2 = cz3Var.b;
        cz3 cz3Var2 = (cz3) qq4Var.b;
        float f3 = cz3Var2.b;
        float f4 = cz3Var.a;
        float f5 = cz3Var2.a;
        float fB = yk.b(f2, f3, f4, f5, f);
        if (cz3Var2 != this.v.b() && cz3Var != this.v.d()) {
            return fB;
        }
        return dw1.f(1.0f, cz3Var2.c, f - f5, fB);
    }

    @Override // androidx.recyclerview.widget.k
    public final boolean L() {
        return true;
    }

    public final float L0(int i) {
        return G0(this.y.f() - this.p, this.v.a * i);
    }

    public final void M0(l lVar, b07 b07Var) {
        while (w() > 0) {
            View viewV = v(0);
            Rect rect = new Rect();
            super.z(rect, viewV);
            float fCenterX = S0() ? rect.centerX() : rect.centerY();
            if (!V0(fCenterX, R0(this.v.c, fCenterX, true))) {
                break;
            } else {
                n0(viewV, lVar);
            }
        }
        while (w() - 1 >= 0) {
            View viewV2 = v(w() - 1);
            Rect rect2 = new Rect();
            super.z(rect2, viewV2);
            float fCenterX2 = S0() ? rect2.centerX() : rect2.centerY();
            if (!U0(fCenterX2, R0(this.v.c, fCenterX2, true))) {
                break;
            } else {
                n0(viewV2, lVar);
            }
        }
        if (w() == 0) {
            J0(lVar, this.w - 1);
            I0(this.w, b07Var, lVar);
        } else {
            int iH = k.H(v(0));
            int iH2 = k.H(v(w() - 1));
            J0(lVar, iH - 1);
            I0(iH2 + 1, b07Var, lVar);
        }
    }

    public final int N0() {
        return S0() ? this.n : this.o;
    }

    public final dz3 O0(int i) {
        dz3 dz3Var;
        HashMap map = this.x;
        return (map == null || (dz3Var = (dz3) map.get(Integer.valueOf(at2.S(i, 0, Math.max(0, C() + (-1)))))) == null) ? (dz3) this.u.c : dz3Var;
    }

    public final int P0(int i, dz3 dz3Var) {
        if (!T0()) {
            return (int) ((dz3Var.a / 2.0f) + ((i * dz3Var.a) - dz3Var.a().a));
        }
        float fN0 = N0() - dz3Var.c().a;
        float f = dz3Var.a;
        return (int) ((fN0 - (i * f)) - (f / 2.0f));
    }

    public final int Q0(int i, dz3 dz3Var) {
        int i2 = Integer.MAX_VALUE;
        for (cz3 cz3Var : dz3Var.c.subList(dz3Var.d, dz3Var.e + 1)) {
            float f = dz3Var.a;
            float f2 = (f / 2.0f) + (i * f);
            int iN0 = (T0() ? (int) ((N0() - cz3Var.a) - f2) : (int) (f2 - cz3Var.a)) - this.p;
            if (Math.abs(i2) > Math.abs(iN0)) {
                i2 = iN0;
            }
        }
        return i2;
    }

    @Override // androidx.recyclerview.widget.k
    public final void S(RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        i95 i95Var = this.t;
        float dimension = i95Var.a;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(oq6.m3_carousel_small_item_size_min);
        }
        i95Var.a = dimension;
        float dimension2 = i95Var.b;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(oq6.m3_carousel_small_item_size_max);
        }
        i95Var.b = dimension2;
        Y0();
        recyclerView.addOnLayoutChangeListener(this.z);
    }

    public final boolean S0() {
        return this.y.a == 0;
    }

    @Override // androidx.recyclerview.widget.k
    public final void T(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.z);
    }

    public final boolean T0() {
        return S0() && this.b.getLayoutDirection() == 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    @Override // androidx.recyclerview.widget.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View U(android.view.View r5, int r6, androidx.recyclerview.widget.l r7, defpackage.b07 r8) {
        /*
            r4 = this;
            int r8 = r4.w()
            if (r8 != 0) goto L8
            goto L76
        L8:
            jn0 r8 = r4.y
            int r8 = r8.a
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = -1
            r2 = 1
            if (r6 == r2) goto L33
            r3 = 2
            if (r6 == r3) goto L29
            r3 = 17
            if (r6 == r3) goto L38
            r3 = 33
            if (r6 == r3) goto L35
            r3 = 66
            if (r6 == r3) goto L2b
            r3 = 130(0x82, float:1.82E-43)
            if (r6 == r3) goto L27
        L25:
            r6 = r0
            goto L41
        L27:
            if (r8 != r2) goto L25
        L29:
            r6 = r2
            goto L41
        L2b:
            if (r8 != 0) goto L25
            boolean r6 = r4.T0()
            if (r6 == 0) goto L29
        L33:
            r6 = r1
            goto L41
        L35:
            if (r8 != r2) goto L25
            goto L33
        L38:
            if (r8 != 0) goto L25
            boolean r6 = r4.T0()
            if (r6 == 0) goto L33
            goto L29
        L41:
            if (r6 != r0) goto L44
            goto L76
        L44:
            r8 = 0
            if (r6 != r1) goto L6b
            int r5 = androidx.recyclerview.widget.k.H(r5)
            if (r5 != 0) goto L4e
            goto L76
        L4e:
            android.view.View r5 = r4.v(r8)
            int r5 = androidx.recyclerview.widget.k.H(r5)
            int r5 = r5 - r2
            r4.H0(r7, r5, r8)
            boolean r5 = r4.T0()
            if (r5 == 0) goto L66
            int r5 = r4.w()
            int r8 = r5 + (-1)
        L66:
            android.view.View r5 = r4.v(r8)
            return r5
        L6b:
            int r5 = androidx.recyclerview.widget.k.H(r5)
            int r6 = r4.C()
            int r6 = r6 - r2
            if (r5 != r6) goto L78
        L76:
            r5 = 0
            return r5
        L78:
            int r5 = r4.w()
            int r5 = r5 - r2
            android.view.View r5 = r4.v(r5)
            int r5 = androidx.recyclerview.widget.k.H(r5)
            int r5 = r5 + r2
            r4.H0(r7, r5, r1)
            boolean r5 = r4.T0()
            if (r5 == 0) goto L90
            goto L96
        L90:
            int r5 = r4.w()
            int r8 = r5 + (-1)
        L96:
            android.view.View r5 = r4.v(r8)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.U(android.view.View, int, androidx.recyclerview.widget.l, b07):android.view.View");
    }

    public final boolean U0(float f, qq4 qq4Var) {
        cz3 cz3Var = (cz3) qq4Var.a;
        float f2 = cz3Var.d;
        cz3 cz3Var2 = (cz3) qq4Var.b;
        float fB = yk.b(f2, cz3Var2.d, cz3Var.b, cz3Var2.b, f) / 2.0f;
        float f3 = T0() ? f + fB : f - fB;
        return T0() ? f3 < 0.0f : f3 > ((float) N0());
    }

    @Override // androidx.recyclerview.widget.k
    public final void V(AccessibilityEvent accessibilityEvent) {
        super.V(accessibilityEvent);
        if (w() > 0) {
            accessibilityEvent.setFromIndex(k.H(v(0)));
            accessibilityEvent.setToIndex(k.H(v(w() - 1)));
        }
    }

    public final boolean V0(float f, qq4 qq4Var) {
        cz3 cz3Var = (cz3) qq4Var.a;
        float f2 = cz3Var.d;
        cz3 cz3Var2 = (cz3) qq4Var.b;
        float fG0 = G0(f, yk.b(f2, cz3Var2.d, cz3Var.b, cz3Var2.b, f) / 2.0f);
        return T0() ? fG0 > ((float) N0()) : fG0 < 0.0f;
    }

    public final void W0(View view) {
        if (!(view instanceof aj4)) {
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        Rect rect = new Rect();
        RecyclerView recyclerView = this.b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.P(view));
        }
        int i = rect.left + rect.right;
        int i2 = rect.top + rect.bottom;
        ez3 ez3Var = this.u;
        view.measure(k.x(S0(), this.n, this.l, F() + E() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + i, (int) ((ez3Var == null || this.y.a != 0) ? ((ViewGroup.MarginLayoutParams) layoutParams).width : ((dz3) ez3Var.c).a)), k.x(f(), this.o, this.m, D() + G() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + i2, (int) ((ez3Var == null || this.y.a != 1) ? ((ViewGroup.MarginLayoutParams) layoutParams).height : ((dz3) ez3Var.c).a)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x05e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void X0(androidx.recyclerview.widget.l r33) {
        /*
            Method dump skipped, instruction units count: 1740
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.carousel.CarouselLayoutManager.X0(androidx.recyclerview.widget.l):void");
    }

    public final void Y0() {
        this.u = null;
        r0();
    }

    @Override // androidx.recyclerview.widget.k
    public final void Z(int i, int i2) {
        d1();
    }

    public final int Z0(int i, b07 b07Var, l lVar) {
        if (w() != 0 && i != 0) {
            if (this.u == null) {
                X0(lVar);
            }
            int iC = C();
            ez3 ez3Var = this.u;
            if (iC > (T0() ? ez3Var.b() : ez3Var.d()).b) {
                int i2 = this.p;
                int i3 = this.q;
                int i4 = this.r;
                int i5 = i2 + i;
                if (i5 < i3) {
                    i = i3 - i2;
                } else if (i5 > i4) {
                    i = i4 - i2;
                }
                this.p = i2 + i;
                c1(this.u);
                float f = this.v.a / 2.0f;
                float fL0 = L0(k.H(v(0)));
                Rect rect = new Rect();
                float f2 = T0() ? this.v.c().b : this.v.a().b;
                float f3 = Float.MAX_VALUE;
                for (int i6 = 0; i6 < w(); i6++) {
                    View viewV = v(i6);
                    float fG0 = G0(fL0, f);
                    qq4 qq4VarR0 = R0(this.v.c, fG0, false);
                    float fK0 = K0(fG0, qq4VarR0);
                    super.z(rect, viewV);
                    b1(viewV, fG0, qq4VarR0);
                    this.y.j(viewV, rect, f, fK0);
                    float fAbs = Math.abs(f2 - fK0);
                    if (fAbs < f3) {
                        this.B = k.H(viewV);
                        f3 = fAbs;
                    }
                    fL0 = G0(fL0, this.v.a);
                }
                M0(lVar, b07Var);
                return i;
            }
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.k
    public final void a0() {
        d1();
    }

    public final void a1(int i) {
        jn0 in0Var;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(rm7.n(i, "invalid orientation:"));
        }
        d(null);
        jn0 jn0Var = this.y;
        if (jn0Var == null || i != jn0Var.a) {
            if (i == 0) {
                in0Var = new in0(this);
            } else {
                if (i != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                in0Var = new hn0(this);
            }
            this.y = in0Var;
            Y0();
        }
    }

    @Override // defpackage.zz6
    public final PointF b(int i) {
        if (this.u == null) {
            return null;
        }
        int iP0 = P0(i, O0(i)) - this.p;
        return S0() ? new PointF(iP0, 0.0f) : new PointF(0.0f, iP0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b1(View view, float f, qq4 qq4Var) {
        if (view instanceof aj4) {
            cz3 cz3Var = (cz3) qq4Var.a;
            float f2 = cz3Var.c;
            cz3 cz3Var2 = (cz3) qq4Var.b;
            float fB = yk.b(f2, cz3Var2.c, cz3Var.a, cz3Var2.a, f);
            float height = view.getHeight();
            float width = view.getWidth();
            RectF rectFB = this.y.b(height, width, yk.b(0.0f, height / 2.0f, 0.0f, 1.0f, fB), yk.b(0.0f, width / 2.0f, 0.0f, 1.0f, fB));
            float fK0 = K0(f, qq4Var);
            RectF rectF = new RectF(fK0 - (rectFB.width() / 2.0f), fK0 - (rectFB.height() / 2.0f), (rectFB.width() / 2.0f) + fK0, (rectFB.height() / 2.0f) + fK0);
            RectF rectF2 = new RectF(this.y.d(), this.y.g(), this.y.e(), this.y.c());
            this.t.getClass();
            this.y.a(rectFB, rectF, rectF2);
            this.y.i(rectFB, rectF, rectF2);
            ((aj4) view).setMaskRectF(rectFB);
        }
    }

    @Override // androidx.recyclerview.widget.k
    public final void c0(int i, int i2) {
        d1();
    }

    public final void c1(ez3 ez3Var) {
        int i = this.r;
        int i2 = this.q;
        if (i <= i2) {
            this.v = T0() ? ez3Var.b() : ez3Var.d();
        } else {
            this.v = ez3Var.c(this.p, i2, i);
        }
        List list = this.v.c;
        gn0 gn0Var = this.s;
        gn0Var.getClass();
        gn0Var.b = DesugarCollections.unmodifiableList(list);
    }

    public final void d1() {
        int iC = C();
        int i = this.A;
        if (iC == i || this.u == null) {
            return;
        }
        i95 i95Var = this.t;
        if ((i < i95Var.c && C() >= i95Var.c) || (i >= i95Var.c && C() < i95Var.c)) {
            Y0();
        }
        this.A = iC;
    }

    @Override // androidx.recyclerview.widget.k
    public final boolean e() {
        return S0();
    }

    @Override // androidx.recyclerview.widget.k
    public final void e0(l lVar, b07 b07Var) {
        if (b07Var.b() <= 0 || N0() <= 0.0f) {
            l0(lVar);
            this.w = 0;
            return;
        }
        boolean zT0 = T0();
        ez3 ez3Var = this.u;
        int i = 1;
        boolean z = ez3Var == null;
        if (z || ((dz3) ez3Var.c).f != N0()) {
            X0(lVar);
        }
        ez3 ez3Var2 = this.u;
        boolean zT02 = T0();
        dz3 dz3VarB = zT02 ? ez3Var2.b() : ez3Var2.d();
        float f = (zT02 ? dz3VarB.c() : dz3VarB.a()).a;
        float f2 = dz3VarB.a / 2.0f;
        int iF = (int) (this.y.f() - (T0() ? f + f2 : f - f2));
        ez3 ez3Var3 = this.u;
        boolean zT03 = T0();
        dz3 dz3VarD = zT03 ? ez3Var3.d() : ez3Var3.b();
        cz3 cz3VarA = zT03 ? dz3VarD.a() : dz3VarD.c();
        int iB = (int) ((((zT03 ? -1 : 1) * cz3VarA.d) / 2.0f) + ((((b07Var.b() - 1) * dz3VarD.a) * (zT03 ? -1.0f : 1.0f)) - (cz3VarA.a - this.y.f())));
        int iMin = zT03 ? Math.min(0, iB) : Math.max(0, iB);
        this.q = zT0 ? iMin : iF;
        if (zT0) {
            iMin = iF;
        }
        this.r = iMin;
        if (z) {
            this.p = iF;
            ez3 ez3Var4 = this.u;
            int iC = C();
            int i2 = this.q;
            int i3 = this.r;
            boolean zT04 = T0();
            List list = (List) ez3Var4.d;
            List list2 = (List) ez3Var4.e;
            float f3 = ((dz3) ez3Var4.c).a;
            HashMap map = new HashMap();
            int i4 = 0;
            int i5 = 0;
            while (i4 < iC) {
                int i6 = zT04 ? (iC - i4) - i : i4;
                int i7 = i;
                if (i6 * f3 * (zT04 ? -1 : i7) > i3 - ez3Var4.b || i4 >= iC - list2.size()) {
                    map.put(Integer.valueOf(i6), (dz3) list2.get(at2.S(i5, 0, list2.size() - 1)));
                    i5++;
                }
                i4++;
                i = i7;
            }
            int i8 = i;
            int i9 = 0;
            for (int i10 = iC - 1; i10 >= 0; i10--) {
                int i11 = zT04 ? (iC - i10) - 1 : i10;
                if (i11 * f3 * (zT04 ? -1 : i8) < i2 + ez3Var4.a || i10 < list.size()) {
                    map.put(Integer.valueOf(i11), (dz3) list.get(at2.S(i9, 0, list.size() - 1)));
                    i9++;
                }
            }
            this.x = map;
            int i12 = this.B;
            if (i12 != -1) {
                this.p = P0(i12, O0(i12));
            }
        }
        int i13 = this.p;
        int i14 = this.q;
        int i15 = this.r;
        this.p = (i13 < i14 ? i14 - i13 : i13 > i15 ? i15 - i13 : 0) + i13;
        this.w = at2.S(this.w, 0, b07Var.b());
        c1(this.u);
        q(lVar);
        M0(lVar, b07Var);
        this.A = C();
    }

    @Override // androidx.recyclerview.widget.k
    public final boolean f() {
        return !S0();
    }

    @Override // androidx.recyclerview.widget.k
    public final void f0(b07 b07Var) {
        if (w() == 0) {
            this.w = 0;
        } else {
            this.w = k.H(v(0));
        }
    }

    @Override // androidx.recyclerview.widget.k
    public final int k(b07 b07Var) {
        if (w() == 0 || this.u == null || C() <= 1) {
            return 0;
        }
        return (int) (this.n * (((dz3) this.u.c).a / m(b07Var)));
    }

    @Override // androidx.recyclerview.widget.k
    public final int l(b07 b07Var) {
        return this.p;
    }

    @Override // androidx.recyclerview.widget.k
    public final int m(b07 b07Var) {
        return this.r - this.q;
    }

    @Override // androidx.recyclerview.widget.k
    public final int n(b07 b07Var) {
        if (w() == 0 || this.u == null || C() <= 1) {
            return 0;
        }
        return (int) (this.o * (((dz3) this.u.c).a / p(b07Var)));
    }

    @Override // androidx.recyclerview.widget.k
    public final int o(b07 b07Var) {
        return this.p;
    }

    @Override // androidx.recyclerview.widget.k
    public final int p(b07 b07Var) {
        return this.r - this.q;
    }

    @Override // androidx.recyclerview.widget.k
    public final boolean q0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int iQ0;
        if (this.u == null || (iQ0 = Q0(k.H(view), O0(k.H(view)))) == 0) {
            return false;
        }
        int i = this.p;
        int i2 = this.q;
        int i3 = this.r;
        int i4 = i + iQ0;
        if (i4 < i2) {
            iQ0 = i2 - i;
        } else if (i4 > i3) {
            iQ0 = i3 - i;
        }
        int iQ02 = Q0(k.H(view), this.u.c(i + iQ0, i2, i3));
        if (S0()) {
            recyclerView.scrollBy(iQ02, 0);
            return true;
        }
        recyclerView.scrollBy(0, iQ02);
        return true;
    }

    @Override // androidx.recyclerview.widget.k
    public final RecyclerView.LayoutParams s() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // androidx.recyclerview.widget.k
    public final int s0(int i, b07 b07Var, l lVar) {
        if (S0()) {
            return Z0(i, b07Var, lVar);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.k
    public final void t0(int i) {
        this.B = i;
        if (this.u == null) {
            return;
        }
        this.p = P0(i, O0(i));
        this.w = at2.S(i, 0, Math.max(0, C() - 1));
        c1(this.u);
        r0();
    }

    @Override // androidx.recyclerview.widget.k
    public final int u0(int i, b07 b07Var, l lVar) {
        if (f()) {
            return Z0(i, b07Var, lVar);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.k
    public final void z(Rect rect, View view) {
        super.z(rect, view);
        float fCenterY = rect.centerY();
        if (S0()) {
            fCenterY = rect.centerX();
        }
        qq4 qq4VarR0 = R0(this.v.c, fCenterY, true);
        cz3 cz3Var = (cz3) qq4VarR0.a;
        float f = cz3Var.d;
        cz3 cz3Var2 = (cz3) qq4VarR0.b;
        float fB = yk.b(f, cz3Var2.d, cz3Var.b, cz3Var2.b, fCenterY);
        float fWidth = S0() ? (rect.width() - fB) / 2.0f : 0.0f;
        float fHeight = S0() ? 0.0f : (rect.height() - fB) / 2.0f;
        rect.set((int) (rect.left + fWidth), (int) (rect.top + fHeight), (int) (rect.right - fWidth), (int) (rect.bottom - fHeight));
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.s = new gn0();
        this.w = 0;
        this.z = new en0(0, this);
        this.B = -1;
        this.C = 0;
        this.t = new i95();
        Y0();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yt6.Carousel);
            this.C = typedArrayObtainStyledAttributes.getInt(yt6.Carousel_carousel_alignment, 0);
            Y0();
            a1(typedArrayObtainStyledAttributes.getInt(st6.RecyclerView_android_orientation, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
