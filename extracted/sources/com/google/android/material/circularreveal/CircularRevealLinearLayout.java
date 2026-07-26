package com.google.android.material.circularreveal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import defpackage.ds0;
import defpackage.es0;
import defpackage.rb4;

/* JADX INFO: loaded from: classes.dex */
public class CircularRevealLinearLayout extends LinearLayout implements es0 {
    public final rb4 a;

    public CircularRevealLinearLayout(Context context) {
        this(context, null);
    }

    @Override // defpackage.es0
    public final void b() {
        this.a.getClass();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        rb4 rb4Var = this.a;
        if (rb4Var != null) {
            rb4Var.o(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return (Drawable) this.a.f;
    }

    @Override // defpackage.es0
    public int getCircularRevealScrimColor() {
        return ((Paint) this.a.d).getColor();
    }

    @Override // defpackage.es0
    public ds0 getRevealInfo() {
        return this.a.z();
    }

    @Override // android.view.View
    public final boolean isOpaque() {
        rb4 rb4Var = this.a;
        return rb4Var != null ? rb4Var.D() : super.isOpaque();
    }

    @Override // defpackage.es0
    public final void j() {
        this.a.getClass();
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
        this.a.K(drawable);
    }

    @Override // defpackage.es0
    public void setCircularRevealScrimColor(int i) {
        this.a.L(i);
    }

    @Override // defpackage.es0
    public void setRevealInfo(ds0 ds0Var) {
        this.a.O(ds0Var);
    }

    public CircularRevealLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new rb4((es0) this);
    }
}
