package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.h69;
import defpackage.lf9;
import defpackage.mt6;
import defpackage.q69;
import defpackage.vj8;
import defpackage.vo4;
import defpackage.yt6;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ScrimInsetsFrameLayout extends FrameLayout {
    public Drawable a;
    public Rect b;
    public final Rect c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;

    public ScrimInsetsFrameLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.b == null || this.a == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        boolean z = this.d;
        Rect rect = this.c;
        if (z) {
            rect.set(0, 0, width, this.b.top);
            this.a.setBounds(rect);
            this.a.draw(canvas);
        }
        if (this.e) {
            rect.set(0, height - this.b.bottom, width, height);
            this.a.setBounds(rect);
            this.a.draw(canvas);
        }
        if (this.f) {
            Rect rect2 = this.b;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.a.setBounds(rect);
            this.a.draw(canvas);
        }
        if (this.g) {
            Rect rect3 = this.b;
            rect.set(width - rect3.right, rect3.top, width, height - rect3.bottom);
            this.a.setBounds(rect);
            this.a.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z) {
        this.e = z;
    }

    public void setDrawLeftInsetForeground(boolean z) {
        this.f = z;
    }

    public void setDrawRightInsetForeground(boolean z) {
        this.g = z;
    }

    public void setDrawTopInsetForeground(boolean z) {
        this.d = z;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.a = drawable;
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new Rect();
        this.d = true;
        this.e = true;
        this.f = true;
        this.g = true;
        TypedArray typedArrayD = vj8.d(context, attributeSet, yt6.ScrimInsetsFrameLayout, i, mt6.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.a = typedArrayD.getDrawable(yt6.ScrimInsetsFrameLayout_insetForeground);
        typedArrayD.recycle();
        setWillNotDraw(true);
        vo4 vo4Var = new vo4(9, this);
        WeakHashMap weakHashMap = q69.a;
        h69.m(this, vo4Var);
    }

    public void e(lf9 lf9Var) {
    }
}
