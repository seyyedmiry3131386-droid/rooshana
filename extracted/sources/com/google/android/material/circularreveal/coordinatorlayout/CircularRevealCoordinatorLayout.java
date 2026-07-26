package com.google.android.material.circularreveal.coordinatorlayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import defpackage.ds0;
import defpackage.es0;
import defpackage.rb4;

/* JADX INFO: loaded from: classes.dex */
public class CircularRevealCoordinatorLayout extends CoordinatorLayout implements es0 {
    public final rb4 y;

    public CircularRevealCoordinatorLayout(Context context) {
        this(context, null);
    }

    @Override // defpackage.es0
    public final void b() {
        this.y.getClass();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        rb4 rb4Var = this.y;
        if (rb4Var != null) {
            rb4Var.o(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return (Drawable) this.y.f;
    }

    @Override // defpackage.es0
    public int getCircularRevealScrimColor() {
        return ((Paint) this.y.d).getColor();
    }

    @Override // defpackage.es0
    public ds0 getRevealInfo() {
        return this.y.z();
    }

    @Override // android.view.View
    public final boolean isOpaque() {
        rb4 rb4Var = this.y;
        return rb4Var != null ? rb4Var.D() : super.isOpaque();
    }

    @Override // defpackage.es0
    public final void j() {
        this.y.getClass();
    }

    @Override // defpackage.es0
    public final void k(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // defpackage.es0
    public final boolean l() {
        return super.isOpaque();
    }

    @Override // defpackage.es0
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.y.K(drawable);
    }

    @Override // defpackage.es0
    public void setCircularRevealScrimColor(int i) {
        this.y.L(i);
    }

    @Override // defpackage.es0
    public void setRevealInfo(ds0 ds0Var) {
        this.y.O(ds0Var);
    }

    public CircularRevealCoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.y = new rb4((es0) this);
    }
}
