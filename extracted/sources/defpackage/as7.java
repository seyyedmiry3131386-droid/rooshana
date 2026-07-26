package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: loaded from: classes.dex */
public final class as7 {
    public static final h37 m = new h37(0.5f);
    public at2 a = new ma7();
    public at2 b = new ma7();
    public at2 c = new ma7();
    public at2 d = new ma7();
    public r61 e = new i(0.0f);
    public r61 f = new i(0.0f);
    public r61 g = new i(0.0f);
    public r61 h = new i(0.0f);
    public fz1 i;
    public fz1 j;
    public fz1 k;
    public fz1 l;

    public as7() {
        int i = 0;
        this.i = new fz1(i);
        this.j = new fz1(i);
        this.k = new fz1(i);
        this.l = new fz1(i);
    }

    public static yr7 a(Context context, int i, int i2) {
        return b(context, i, i2, new i(0));
    }

    public static yr7 b(Context context, int i, int i2, r61 r61Var) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(i2, true);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(yt6.ShapeAppearance);
        try {
            int i3 = typedArrayObtainStyledAttributes.getInt(yt6.ShapeAppearance_cornerFamily, 0);
            int i4 = typedArrayObtainStyledAttributes.getInt(yt6.ShapeAppearance_cornerFamilyTopLeft, i3);
            int i5 = typedArrayObtainStyledAttributes.getInt(yt6.ShapeAppearance_cornerFamilyTopRight, i3);
            int i6 = typedArrayObtainStyledAttributes.getInt(yt6.ShapeAppearance_cornerFamilyBottomRight, i3);
            int i7 = typedArrayObtainStyledAttributes.getInt(yt6.ShapeAppearance_cornerFamilyBottomLeft, i3);
            r61 r61VarE = e(typedArrayObtainStyledAttributes, yt6.ShapeAppearance_cornerSize, r61Var);
            r61 r61VarE2 = e(typedArrayObtainStyledAttributes, yt6.ShapeAppearance_cornerSizeTopLeft, r61VarE);
            r61 r61VarE3 = e(typedArrayObtainStyledAttributes, yt6.ShapeAppearance_cornerSizeTopRight, r61VarE);
            r61 r61VarE4 = e(typedArrayObtainStyledAttributes, yt6.ShapeAppearance_cornerSizeBottomRight, r61VarE);
            r61 r61VarE5 = e(typedArrayObtainStyledAttributes, yt6.ShapeAppearance_cornerSizeBottomLeft, r61VarE);
            yr7 yr7Var = new yr7();
            yr7Var.a = ub1.q(i4);
            yr7Var.e = r61VarE2;
            yr7Var.b = ub1.q(i5);
            yr7Var.f = r61VarE3;
            yr7Var.c = ub1.q(i6);
            yr7Var.g = r61VarE4;
            yr7Var.d = ub1.q(i7);
            yr7Var.h = r61VarE5;
            return yr7Var;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static yr7 c(Context context, AttributeSet attributeSet, int i, int i2, r61 r61Var) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yt6.MaterialShape, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(yt6.MaterialShape_shapeAppearance, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(yt6.MaterialShape_shapeAppearanceOverlay, 0);
        typedArrayObtainStyledAttributes.recycle();
        return b(context, resourceId, resourceId2, r61Var);
    }

    public static yr7 d(Context context, AttributeSet attributeSet, int i, int i2) {
        return c(context, attributeSet, i, i2, new i(0));
    }

    public static r61 e(TypedArray typedArray, int i, r61 r61Var) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            int i2 = typedValuePeekValue.type;
            if (i2 == 5) {
                return new i(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i2 == 6) {
                return new h37(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return r61Var;
    }

    public final boolean f() {
        return (this.b instanceof ma7) && (this.a instanceof ma7) && (this.c instanceof ma7) && (this.d instanceof ma7);
    }

    public final boolean g(RectF rectF) {
        boolean z = this.l.getClass().equals(fz1.class) && this.j.getClass().equals(fz1.class) && this.i.getClass().equals(fz1.class) && this.k.getClass().equals(fz1.class);
        float fA = this.e.a(rectF);
        return z && ((this.f.a(rectF) > fA ? 1 : (this.f.a(rectF) == fA ? 0 : -1)) == 0 && (this.h.a(rectF) > fA ? 1 : (this.h.a(rectF) == fA ? 0 : -1)) == 0 && (this.g.a(rectF) > fA ? 1 : (this.g.a(rectF) == fA ? 0 : -1)) == 0) && f();
    }

    public final yr7 h() {
        yr7 yr7Var = new yr7();
        yr7Var.a = this.a;
        yr7Var.b = this.b;
        yr7Var.c = this.c;
        yr7Var.d = this.d;
        yr7Var.e = this.e;
        yr7Var.f = this.f;
        yr7Var.g = this.g;
        yr7Var.h = this.h;
        yr7Var.i = this.i;
        yr7Var.j = this.j;
        yr7Var.k = this.k;
        yr7Var.l = this.l;
        return yr7Var;
    }

    public final as7 i(zr7 zr7Var) {
        yr7 yr7VarH = h();
        yr7VarH.e = zr7Var.e(this.e);
        yr7VarH.f = zr7Var.e(this.f);
        yr7VarH.h = zr7Var.e(this.h);
        yr7VarH.g = zr7Var.e(this.g);
        return yr7VarH.a();
    }

    public final String toString() {
        return "[" + this.e + ", " + this.f + ", " + this.g + ", " + this.h + "]";
    }
}
