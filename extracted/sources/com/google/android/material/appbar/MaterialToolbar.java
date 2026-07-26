package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import defpackage.ek6;
import defpackage.fk4;
import defpackage.mk4;
import defpackage.mt6;
import defpackage.te;
import defpackage.tt3;
import defpackage.ub1;
import defpackage.vj8;
import defpackage.xp6;
import defpackage.yt6;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {
    public static final int f = mt6.Widget_MaterialComponents_Toolbar;
    public static final ImageView.ScaleType[] g = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public Integer a;
    public boolean b;
    public boolean c;
    public ImageView.ScaleType d;
    public Boolean e;

    public MaterialToolbar(Context context) {
        this(context, null);
    }

    public final void B(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i += iMax;
            i2 -= iMax;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i2, textView.getBottom());
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.d;
    }

    public Integer getNavigationIconTint() {
        return this.a;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ub1.L(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        ek6 ek6Var = tt3.e;
        int i5 = 0;
        ImageView imageView2 = null;
        if (this.b || this.c) {
            ArrayList arrayListZ = tt3.z(this, getTitle());
            TextView textView = arrayListZ.isEmpty() ? null : (TextView) Collections.min(arrayListZ, ek6Var);
            ArrayList arrayListZ2 = tt3.z(this, getSubtitle());
            TextView textView2 = arrayListZ2.isEmpty() ? null : (TextView) Collections.max(arrayListZ2, ek6Var);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i6 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i7 = 0; i7 < getChildCount(); i7++) {
                    View childAt = getChildAt(i7);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i6 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i6 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.b && textView != null) {
                    B(textView, pair);
                }
                if (this.c && textView2 != null) {
                    B(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i5 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i5);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i5++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.e;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.d;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        ub1.J(this, f2);
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.e;
        if (bool == null || bool.booleanValue() != z) {
            this.e = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.d != scaleType) {
            this.d = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.a != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.a.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.a = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.c != z) {
            this.c = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.b != z) {
            this.b = z;
            requestLayout();
        }
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, xp6.toolbarStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
        ColorStateList colorStateListT;
        int i2 = f;
        super(mk4.a(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        TypedArray typedArrayD = vj8.d(context2, attributeSet, yt6.MaterialToolbar, i, i2, new int[0]);
        if (typedArrayD.hasValue(yt6.MaterialToolbar_navigationIconTint)) {
            setNavigationIconTint(typedArrayD.getColor(yt6.MaterialToolbar_navigationIconTint, -1));
        }
        this.b = typedArrayD.getBoolean(yt6.MaterialToolbar_titleCentered, false);
        this.c = typedArrayD.getBoolean(yt6.MaterialToolbar_subtitleCentered, false);
        int i3 = typedArrayD.getInt(yt6.MaterialToolbar_logoScaleType, -1);
        if (i3 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = g;
            if (i3 < scaleTypeArr.length) {
                this.d = scaleTypeArr[i3];
            }
        }
        if (typedArrayD.hasValue(yt6.MaterialToolbar_logoAdjustViewBounds)) {
            this.e = Boolean.valueOf(typedArrayD.getBoolean(yt6.MaterialToolbar_logoAdjustViewBounds, false));
        }
        typedArrayD.recycle();
        Drawable background = getBackground();
        if (background == null) {
            colorStateListT = ColorStateList.valueOf(0);
        } else {
            colorStateListT = te.t(background);
        }
        if (colorStateListT != null) {
            fk4 fk4Var = new fk4();
            fk4Var.s(colorStateListT);
            fk4Var.o(context2);
            fk4Var.r(getElevation());
            setBackground(fk4Var);
        }
    }
}
