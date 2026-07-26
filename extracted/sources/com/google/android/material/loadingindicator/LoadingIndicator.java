package com.google.android.material.loadingindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ProgressBar;
import defpackage.fl;
import defpackage.m91;
import defpackage.mk4;
import defpackage.mt6;
import defpackage.q39;
import defpackage.vp6;
import defpackage.wa4;
import defpackage.xa4;
import defpackage.xp6;
import defpackage.xq6;
import defpackage.ya4;
import defpackage.za4;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class LoadingIndicator extends View implements Drawable.Callback {
    public static final int c = mt6.Widget_Material3_LoadingIndicator;
    public final xa4 a;
    public final LoadingIndicatorSpec b;

    public LoadingIndicator(Context context) {
        this(context, null);
    }

    public final boolean a() {
        if (!isAttachedToWindow() || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                return getWindowVisibility() == 0;
            }
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return ProgressBar.class.getName();
    }

    public int getContainerColor() {
        return this.b.e;
    }

    public int getContainerHeight() {
        return this.b.c;
    }

    public int getContainerWidth() {
        return this.b.b;
    }

    public xa4 getDrawable() {
        return this.a;
    }

    public int[] getIndicatorColor() {
        return this.b.d;
    }

    public int getIndicatorSize() {
        return this.b.a;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int iSave = canvas.save();
        if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
            canvas.translate(getPaddingLeft(), getPaddingTop());
        }
        if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingRight() + getPaddingLeft()), getHeight() - (getPaddingBottom() + getPaddingTop()));
        }
        this.a.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        za4 za4Var = this.a.d;
        LoadingIndicatorSpec loadingIndicatorSpec = za4Var.a;
        int paddingRight = getPaddingRight() + getPaddingLeft() + Math.max(loadingIndicatorSpec.c, loadingIndicatorSpec.a);
        LoadingIndicatorSpec loadingIndicatorSpec2 = za4Var.a;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + Math.max(loadingIndicatorSpec2.b, loadingIndicatorSpec2.a);
        if (mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(size, paddingRight), 1073741824);
        } else if (mode == 0) {
            i = View.MeasureSpec.makeMeasureSpec(paddingRight, 1073741824);
        }
        if (mode2 == Integer.MIN_VALUE) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(size2, paddingBottom), 1073741824);
        } else if (mode2 == 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(paddingBottom, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.a.setBounds(0, 0, i, i2);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        this.a.a(a(), false, i == 0);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.a.a(a(), false, i == 0);
    }

    public void setAnimatorDurationScaleProvider(fl flVar) {
        this.a.a = flVar;
    }

    public void setContainerColor(int i) {
        LoadingIndicatorSpec loadingIndicatorSpec = this.b;
        if (loadingIndicatorSpec.e != i) {
            loadingIndicatorSpec.e = i;
            invalidate();
        }
    }

    public void setContainerHeight(int i) {
        LoadingIndicatorSpec loadingIndicatorSpec = this.b;
        if (loadingIndicatorSpec.c != i) {
            loadingIndicatorSpec.c = i;
            requestLayout();
            invalidate();
        }
    }

    public void setContainerWidth(int i) {
        LoadingIndicatorSpec loadingIndicatorSpec = this.b;
        if (loadingIndicatorSpec.b != i) {
            loadingIndicatorSpec.b = i;
            requestLayout();
            invalidate();
        }
    }

    public void setIndicatorColor(int... iArr) {
        if (iArr.length == 0) {
            iArr = new int[]{m91.q(getContext(), xp6.colorPrimary, -1)};
        }
        if (Arrays.equals(getIndicatorColor(), iArr)) {
            return;
        }
        this.b.d = iArr;
        wa4 wa4Var = this.a.e;
        wa4Var.a = 1;
        wa4Var.a(0.0f);
        wa4Var.h.a = wa4Var.f.d[0];
        invalidate();
    }

    public void setIndicatorSize(int i) {
        LoadingIndicatorSpec loadingIndicatorSpec = this.b;
        if (loadingIndicatorSpec.a != i) {
            loadingIndicatorSpec.a = i;
            requestLayout();
            invalidate();
        }
    }

    public LoadingIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, vp6.loadingIndicatorStyle);
    }

    public LoadingIndicator(Context context, AttributeSet attributeSet, int i) {
        super(mk4.a(context, attributeSet, i, c), attributeSet, i);
        Context context2 = getContext();
        LoadingIndicatorSpec loadingIndicatorSpec = new LoadingIndicatorSpec(context2, attributeSet, i);
        za4 za4Var = new za4(loadingIndicatorSpec);
        wa4 wa4Var = new wa4();
        wa4Var.f = loadingIndicatorSpec;
        wa4Var.h = new ya4();
        xa4 xa4Var = new xa4(context2, loadingIndicatorSpec, za4Var, wa4Var);
        xa4Var.h = q39.a(context2.getResources(), xq6.ic_mtrl_arrow_circle, null);
        this.a = xa4Var;
        xa4Var.setCallback(this);
        this.b = xa4Var.d.a;
        setAnimatorDurationScaleProvider(new fl());
    }
}
