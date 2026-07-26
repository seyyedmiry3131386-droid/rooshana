package com.google.android.material.circularreveal.cardview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.material.card.MaterialCardView;
import defpackage.ds0;
import defpackage.es0;
import defpackage.rb4;

/* JADX INFO: loaded from: classes.dex */
public class CircularRevealCardView extends MaterialCardView implements es0 {
    public final rb4 p;

    public CircularRevealCardView(Context context) {
        this(context, null);
    }

    @Override // defpackage.es0
    public final void b() {
        this.p.getClass();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        rb4 rb4Var = this.p;
        if (rb4Var != null) {
            rb4Var.o(canvas);
        } else {
            super.draw(canvas);
        }
    }

    public Drawable getCircularRevealOverlayDrawable() {
        return (Drawable) this.p.f;
    }

    @Override // defpackage.es0
    public int getCircularRevealScrimColor() {
        return ((Paint) this.p.d).getColor();
    }

    @Override // defpackage.es0
    public ds0 getRevealInfo() {
        return this.p.z();
    }

    @Override // android.view.View
    public final boolean isOpaque() {
        rb4 rb4Var = this.p;
        return rb4Var != null ? rb4Var.D() : super.isOpaque();
    }

    @Override // defpackage.es0
    public final void j() {
        this.p.getClass();
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
        this.p.K(drawable);
    }

    @Override // defpackage.es0
    public void setCircularRevealScrimColor(int i) {
        this.p.L(i);
    }

    @Override // defpackage.es0
    public void setRevealInfo(ds0 ds0Var) {
        this.p.O(ds0Var);
    }

    public CircularRevealCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.p = new rb4((es0) this);
    }
}
