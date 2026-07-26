package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import defpackage.aq6;
import defpackage.av;
import defpackage.do3;
import defpackage.du6;
import defpackage.ga7;
import defpackage.ht6;
import defpackage.pp6;

/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {
    public static final int[] f = {R.attr.colorBackground};
    public static final av g = new av(7);
    public boolean a;
    public boolean b;
    public final Rect c;
    public final Rect d;
    public final do3 e;

    public CardView(Context context) {
        this(context, null);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((ga7) ((Drawable) this.e.a)).h;
    }

    public float getCardElevation() {
        return ((CardView) this.e.b).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.c.bottom;
    }

    public int getContentPaddingLeft() {
        return this.c.left;
    }

    public int getContentPaddingRight() {
        return this.c.right;
    }

    public int getContentPaddingTop() {
        return this.c.top;
    }

    public float getMaxCardElevation() {
        return ((ga7) ((Drawable) this.e.a)).e;
    }

    public boolean getPreventCornerOverlap() {
        return this.b;
    }

    public float getRadius() {
        return ((ga7) ((Drawable) this.e.a)).a;
    }

    public boolean getUseCompatPadding() {
        return this.a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        ga7 ga7Var = (ga7) ((Drawable) this.e.a);
        if (colorStateListValueOf == null) {
            ga7Var.getClass();
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        ga7Var.h = colorStateListValueOf;
        ga7Var.b.setColor(colorStateListValueOf.getColorForState(ga7Var.getState(), ga7Var.h.getDefaultColor()));
        ga7Var.invalidateSelf();
    }

    public void setCardElevation(float f2) {
        ((CardView) this.e.b).setElevation(f2);
    }

    public void setContentPadding(int i, int i2, int i3, int i4) {
        this.c.set(i, i2, i3, i4);
        g.z(this.e);
    }

    public void setMaxCardElevation(float f2) {
        g.y(this.e, f2);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.b) {
            this.b = z;
            do3 do3Var = this.e;
            g.y(do3Var, ((ga7) ((Drawable) do3Var.a)).e);
        }
    }

    public void setRadius(float f2) {
        ga7 ga7Var = (ga7) ((Drawable) this.e.a);
        if (f2 == ga7Var.a) {
            return;
        }
        ga7Var.a = f2;
        ga7Var.b(null);
        ga7Var.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.a != z) {
            this.a = z;
            do3 do3Var = this.e;
            g.y(do3Var, ((ga7) ((Drawable) do3Var.a)).e);
        }
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, pp6.cardViewStyle);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        int color;
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i);
        Rect rect = new Rect();
        this.c = rect;
        this.d = new Rect();
        do3 do3Var = new do3();
        do3Var.b = this;
        this.e = do3Var;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, du6.CardView, i, ht6.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(du6.CardView_cardBackgroundColor)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(du6.CardView_cardBackgroundColor);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f);
            int color2 = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(aq6.cardview_light_background);
            } else {
                color = getResources().getColor(aq6.cardview_dark_background);
            }
            colorStateListValueOf = ColorStateList.valueOf(color);
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(du6.CardView_cardCornerRadius, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(du6.CardView_cardElevation, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(du6.CardView_cardMaxElevation, 0.0f);
        this.a = typedArrayObtainStyledAttributes.getBoolean(du6.CardView_cardUseCompatPadding, false);
        this.b = typedArrayObtainStyledAttributes.getBoolean(du6.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(du6.CardView_contentPadding, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(du6.CardView_contentPaddingLeft, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(du6.CardView_contentPaddingTop, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(du6.CardView_contentPaddingRight, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(du6.CardView_contentPaddingBottom, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(du6.CardView_android_minWidth, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(du6.CardView_android_minHeight, 0);
        typedArrayObtainStyledAttributes.recycle();
        ga7 ga7Var = new ga7(colorStateListValueOf, dimension);
        do3Var.a = ga7Var;
        setBackgroundDrawable(ga7Var);
        setClipToOutline(true);
        setElevation(dimension2);
        g.y(do3Var, dimension3);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        ga7 ga7Var = (ga7) ((Drawable) this.e.a);
        if (colorStateList == null) {
            ga7Var.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        ga7Var.h = colorStateList;
        ga7Var.b.setColor(colorStateList.getColorForState(ga7Var.getState(), ga7Var.h.getDefaultColor()));
        ga7Var.invalidateSelf();
    }
}
