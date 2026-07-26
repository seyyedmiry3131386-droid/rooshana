package com.google.accompanist.drawablepainter;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.compose.runtime.g;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.c24;
import defpackage.ey7;
import defpackage.g16;
import defpackage.hv1;
import defpackage.js3;
import defpackage.m37;
import defpackage.ok4;
import defpackage.rv1;
import defpackage.s08;
import defpackage.tc0;
import defpackage.tm0;
import defpackage.uy6;
import defpackage.ve;
import defpackage.wb5;
import defpackage.x2;
import kotlin.NoWhenBranchMatchedException;
import kotlin.a;

/* JADX INFO: loaded from: classes.dex */
public final class DrawablePainter extends g16 implements m37 {
    public final Drawable f;
    public final wb5 g;
    public final wb5 h;
    public final c24 i;

    public DrawablePainter(Drawable drawable) {
        js3.p(drawable, "drawable");
        this.f = drawable;
        this.g = g.h(0);
        Object obj = rv1.a;
        this.h = g.h(new ey7((drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? 9205357640488583168L : uy6.a(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight())));
        this.i = a.a(new x2(20, this));
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // defpackage.m37
    public final void a() {
        c();
    }

    @Override // defpackage.g16
    public final boolean b(float f) {
        this.f.setAlpha(ok4.t(ok4.V(f * 255), 0, 255));
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.m37
    public final void c() {
        Drawable drawable = this.f;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    @Override // defpackage.g16
    public final boolean d(tc0 tc0Var) {
        this.f.setColorFilter(tc0Var != null ? tc0Var.a : null);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.m37
    public final void e() {
        Drawable.Callback callback = (Drawable.Callback) this.i.getValue();
        Drawable drawable = this.f;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // defpackage.g16
    public final void f(LayoutDirection layoutDirection) {
        int i;
        js3.p(layoutDirection, "layoutDirection");
        int iOrdinal = layoutDirection.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            i = 0;
        }
        this.f.setLayoutDirection(i);
    }

    @Override // defpackage.g16
    public final long h() {
        return ((ey7) ((s08) this.h).getValue()).a;
    }

    @Override // defpackage.g16
    public final void i(hv1 hv1Var) {
        js3.p(hv1Var, "<this>");
        tm0 tm0VarV = hv1Var.X().v();
        ((Number) ((s08) this.g).getValue()).intValue();
        try {
            tm0VarV.e();
            int i = Build.VERSION.SDK_INT;
            Drawable drawable = this.f;
            if (i < 28 || i >= 31 || !(drawable instanceof AnimatedImageDrawable)) {
                drawable.setBounds(0, 0, ok4.V(ey7.e(hv1Var.d())), ok4.V(ey7.c(hv1Var.d())));
            } else {
                tm0VarV.a(ey7.e(hv1Var.d()) / ey7.e(h()), ey7.c(hv1Var.d()) / ey7.c(h()));
            }
            drawable.draw(ve.a(tm0VarV));
            tm0VarV.o();
        } catch (Throwable th) {
            tm0VarV.o();
            throw th;
        }
    }
}
