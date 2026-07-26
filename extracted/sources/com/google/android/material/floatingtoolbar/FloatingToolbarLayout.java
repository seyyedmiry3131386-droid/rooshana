package com.google.android.material.floatingtoolbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.as7;
import defpackage.ca7;
import defpackage.fk4;
import defpackage.h69;
import defpackage.mk4;
import defpackage.mt6;
import defpackage.q69;
import defpackage.sk6;
import defpackage.vj8;
import defpackage.vp6;
import defpackage.yt6;
import io.sentry.android.core.t0;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class FloatingToolbarLayout extends FrameLayout {
    public static final int j = mt6.Widget_Material3_FloatingToolbar;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public Rect e;
    public int f;
    public int g;
    public int h;
    public int i;

    public FloatingToolbarLayout(Context context) {
        this(context, null);
    }

    public final void a() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Rect rect = this.e;
        if (rect == null) {
            t0.m("FloatingToolbarLayout", "Unable to update margins because original view margins are not set");
            return;
        }
        int i = rect.left + (this.a ? this.h : 0);
        int i2 = rect.right + (this.c ? this.i : 0);
        int i3 = rect.top + (this.b ? this.g : 0);
        int i4 = rect.bottom + (this.d ? this.f : 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams.bottomMargin == i4 && marginLayoutParams.leftMargin == i && marginLayoutParams.rightMargin == i2 && marginLayoutParams.topMargin == i3) {
            return;
        }
        marginLayoutParams.bottomMargin = i4;
        marginLayoutParams.leftMargin = i;
        marginLayoutParams.rightMargin = i2;
        marginLayoutParams.topMargin = i3;
        requestLayout();
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            this.e = null;
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        this.e = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        a();
    }

    public FloatingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, vp6.floatingToolbarStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FloatingToolbarLayout(Context context, AttributeSet attributeSet, int i) {
        int i2 = j;
        super(mk4.a(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        sk6 sk6VarE = vj8.e(context2, attributeSet, yt6.FloatingToolbar, i, i2, new int[0]);
        int i3 = yt6.FloatingToolbar_backgroundTint;
        TypedArray typedArray = (TypedArray) sk6VarE.c;
        if (typedArray.hasValue(i3)) {
            int color = typedArray.getColor(yt6.FloatingToolbar_backgroundTint, 0);
            fk4 fk4Var = new fk4(as7.d(context2, attributeSet, i, i2).a());
            fk4Var.s(ColorStateList.valueOf(color));
            setBackground(fk4Var);
        }
        this.a = typedArray.getBoolean(yt6.FloatingToolbar_marginLeftSystemWindowInsets, true);
        this.b = typedArray.getBoolean(yt6.FloatingToolbar_marginTopSystemWindowInsets, false);
        this.c = typedArray.getBoolean(yt6.FloatingToolbar_marginRightSystemWindowInsets, true);
        this.d = typedArray.getBoolean(yt6.FloatingToolbar_marginBottomSystemWindowInsets, true);
        ca7 ca7Var = new ca7(22, this);
        WeakHashMap weakHashMap = q69.a;
        h69.m(this, ca7Var);
        sk6VarE.G();
    }
}
