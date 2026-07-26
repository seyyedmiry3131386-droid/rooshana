package com.google.android.material.search;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.as7;
import defpackage.fk4;
import defpackage.is6;
import defpackage.ja1;
import defpackage.m91;
import defpackage.mk4;
import defpackage.mt6;
import defpackage.ol3;
import defpackage.oq6;
import defpackage.qh7;
import defpackage.qr6;
import defpackage.rf0;
import defpackage.tt3;
import defpackage.ub1;
import defpackage.vj8;
import defpackage.vp6;
import defpackage.xp6;
import defpackage.xq6;
import defpackage.yt6;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes.dex */
public class SearchBar extends Toolbar {
    public static final int x = mt6.Widget_Material3_SearchBar;
    public final TextView a;
    public final TextView b;
    public final FrameLayout c;
    public final int d;
    public boolean e;
    public final ColorStateList f;
    public final boolean g;
    public final boolean h;
    public final ol3 i;
    public final Drawable j;
    public final boolean k;
    public final boolean l;
    public View m;
    public final Integer n;
    public Drawable o;
    public int p;
    public boolean q;
    public final fk4 r;
    public boolean s;
    public int t;
    public ActionMenuView u;
    public ImageButton v;
    public final qh7 w;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public String c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readString();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.c);
        }
    }

    public SearchBar(Context context) {
        this(context, null);
    }

    private AppBarLayout getAppBarLayoutParentIfExists() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof AppBarLayout) {
                return (AppBarLayout) parent;
            }
        }
        return null;
    }

    private void setNavigationIconDecorative(boolean z) {
        ImageButton imageButtonY = tt3.y(this);
        if (imageButtonY == null) {
            return;
        }
        imageButtonY.setClickable(!z);
        imageButtonY.setFocusable(!z);
        Drawable background = imageButtonY.getBackground();
        if (background != null) {
            this.o = background;
        }
        imageButtonY.setBackgroundDrawable(z ? null : this.o);
        C();
    }

    public final void B() {
        AppBarLayout appBarLayoutParentIfExists = getAppBarLayoutParentIfExists();
        if (appBarLayoutParentIfExists == null || this.f == null) {
            return;
        }
        appBarLayoutParentIfExists.s.add(this.w);
    }

    public final void C() {
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        boolean z = getLayoutDirection() == 1;
        ImageButton imageButtonY = tt3.y(this);
        int width = (imageButtonY == null || !imageButtonY.isClickable()) ? 0 : z ? getWidth() - imageButtonY.getLeft() : imageButtonY.getRight();
        ActionMenuView actionMenuViewX = tt3.x(this);
        int right = actionMenuViewX != null ? z ? actionMenuViewX.getRight() : getWidth() - actionMenuViewX.getLeft() : 0;
        float f = -(z ? right : width);
        if (!z) {
            width = right;
        }
        setHandwritingBoundsOffsets(f, 0.0f, -width, 0.0f);
    }

    public final void D() {
        if (getLayoutParams() instanceof AppBarLayout.LayoutParams) {
            AppBarLayout.LayoutParams layoutParams = (AppBarLayout.LayoutParams) getLayoutParams();
            if (this.q) {
                if (layoutParams.a == 0) {
                    layoutParams.a = 53;
                }
            } else if (layoutParams.a == 53) {
                layoutParams.a = 0;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.g && this.m == null && !(view instanceof ActionMenuView)) {
            this.m = view;
            view.setAlpha(0.0f);
        }
        super.addView(view, i, layoutParams);
    }

    public View getCenterView() {
        return this.m;
    }

    public float getCompatElevation() {
        fk4 fk4Var = this.r;
        return fk4Var != null ? fk4Var.b.n : getElevation();
    }

    public float getCornerSize() {
        return this.r.l();
    }

    public int getDefaultMarginVerticalResource() {
        return oq6.m3_searchbar_margin_vertical;
    }

    public int getDefaultNavigationIconResource() {
        return xq6.ic_search_black_24;
    }

    public CharSequence getHint() {
        return this.a.getHint();
    }

    public int getMaxWidth() {
        return this.t;
    }

    public int getMenuResId() {
        return this.p;
    }

    public TextView getPlaceholderTextView() {
        return this.b;
    }

    public int getStrokeColor() {
        return this.r.b.e.getDefaultColor();
    }

    public float getStrokeWidth() {
        return this.r.b.k;
    }

    public CharSequence getText() {
        return this.a.getText();
    }

    public boolean getTextCentered() {
        return this.s;
    }

    public TextView getTextView() {
        return this.a;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ub1.K(this, this.r);
        if (this.h && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(oq6.m3_searchbar_margin_horizontal);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(getDefaultMarginVerticalResource());
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            int i = marginLayoutParams.leftMargin;
            if (i == 0) {
                i = dimensionPixelSize;
            }
            marginLayoutParams.leftMargin = i;
            int i2 = marginLayoutParams.topMargin;
            if (i2 == 0) {
                i2 = dimensionPixelSize2;
            }
            marginLayoutParams.topMargin = i2;
            int i3 = marginLayoutParams.rightMargin;
            if (i3 != 0) {
                dimensionPixelSize = i3;
            }
            marginLayoutParams.rightMargin = dimensionPixelSize;
            int i4 = marginLayoutParams.bottomMargin;
            if (i4 != 0) {
                dimensionPixelSize2 = i4;
            }
            marginLayoutParams.bottomMargin = dimensionPixelSize2;
        }
        D();
        if (this.e) {
            B();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AppBarLayout appBarLayoutParentIfExists = getAppBarLayoutParentIfExists();
        if (appBarLayoutParentIfExists != null) {
            appBarLayoutParentIfExists.s.remove(this.w);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        accessibilityNodeInfo.setEditable(isEnabled());
        CharSequence text = getText();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        if (Build.VERSION.SDK_INT >= 26) {
            accessibilityNodeInfo.setHintText(getHint());
            accessibilityNodeInfo.setShowingHintText(zIsEmpty);
        }
        if (zIsEmpty) {
            text = getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.m;
        if (view != null && view != null) {
            int measuredWidth = view.getMeasuredWidth();
            int measuredWidth2 = (getMeasuredWidth() / 2) - (measuredWidth / 2);
            int i5 = measuredWidth + measuredWidth2;
            int measuredHeight = view.getMeasuredHeight();
            int measuredHeight2 = (getMeasuredHeight() / 2) - (measuredHeight / 2);
            int i6 = measuredHeight + measuredHeight2;
            if (getLayoutDirection() == 1) {
                view.layout(getMeasuredWidth() - i5, measuredHeight2, getMeasuredWidth() - measuredWidth2, i6);
            } else {
                view.layout(measuredWidth2, measuredHeight2, i5, i6);
            }
        }
        C();
        TextView textView = this.a;
        if (textView == null || !this.s) {
            return;
        }
        int measuredWidth3 = getMeasuredWidth() / 2;
        FrameLayout frameLayout = this.c;
        int measuredWidth4 = measuredWidth3 - (frameLayout.getMeasuredWidth() / 2);
        int measuredWidth5 = frameLayout.getMeasuredWidth() + measuredWidth4;
        int measuredHeight3 = (getMeasuredHeight() / 2) - (frameLayout.getMeasuredHeight() / 2);
        int measuredHeight4 = frameLayout.getMeasuredHeight() + measuredHeight3;
        boolean z2 = getLayoutDirection() == 1;
        if (this.u == null) {
            this.u = tt3.x(this);
        }
        View view2 = this.u;
        if (this.v == null) {
            this.v = tt3.y(this);
        }
        ImageButton imageButton = this.v;
        int measuredWidth6 = (frameLayout.getMeasuredWidth() / 2) - (textView.getMeasuredWidth() / 2);
        int measuredWidth7 = textView.getMeasuredWidth() + measuredWidth6;
        int i7 = measuredWidth6 + measuredWidth4;
        int i8 = measuredWidth7 + measuredWidth4;
        View view3 = z2 ? view2 : imageButton;
        if (z2) {
            view2 = imageButton;
        }
        int iMax = view3 != null ? Math.max(view3.getRight() - i7, 0) : 0;
        int i9 = i7 + iMax;
        int i10 = i8 + iMax;
        int iMax2 = view2 != null ? Math.max(i10 - view2.getLeft(), 0) : 0;
        int i11 = i9 - iMax2;
        int i12 = i10 - iMax2;
        int iMax3 = ((iMax - iMax2) + Math.max(Math.max(getPaddingLeft() - i11, getContentInsetLeft() - i11), 0)) - Math.max(Math.max(i12 - (getMeasuredWidth() - getPaddingRight()), i12 - (getMeasuredWidth() - getContentInsetRight())), 0);
        frameLayout.layout(measuredWidth4 + iMax3, measuredHeight3, measuredWidth5 + iMax3, measuredHeight4);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.t;
        if (i3 >= 0 && i3 < View.MeasureSpec.getSize(i)) {
            i = View.MeasureSpec.makeMeasureSpec(this.t, View.MeasureSpec.getMode(i));
        }
        super.onMeasure(i, i2);
        View view = this.m;
        if (view != null) {
            view.measure(i, i2);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a);
        setText(savedState.c);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        CharSequence text = getText();
        savedState.c = text == null ? null : text.toString();
        return savedState;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void p(int i) {
        super.p(i);
        this.p = i;
    }

    public void setCenterView(View view) {
        View view2 = this.m;
        if (view2 != null) {
            removeView(view2);
            this.m = null;
        }
        if (view != null) {
            addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z) {
        this.q = z;
        D();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        fk4 fk4Var = this.r;
        if (fk4Var != null) {
            fk4Var.r(f);
        }
    }

    public void setHint(CharSequence charSequence) {
        this.a.setHint(charSequence);
    }

    public void setLiftOnScroll(boolean z) {
        this.e = z;
        if (z) {
            B();
            return;
        }
        AppBarLayout appBarLayoutParentIfExists = getAppBarLayoutParentIfExists();
        if (appBarLayoutParentIfExists != null) {
            appBarLayoutParentIfExists.s.remove(this.w);
        }
    }

    public void setMaxWidth(int i) {
        if (this.t != i) {
            this.t = i;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        int iP;
        if (this.k && drawable != null) {
            Integer num = this.n;
            if (num != null) {
                iP = num.intValue();
            } else {
                iP = m91.p(drawable == this.j ? vp6.colorOnSurfaceVariant : vp6.colorOnSurface, this);
            }
            drawable = drawable.mutate();
            drawable.setTint(iP);
        }
        super.setNavigationIcon(drawable);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        if (this.l) {
            return;
        }
        super.setNavigationOnClickListener(onClickListener);
        setNavigationIconDecorative(onClickListener == null);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z) {
        this.i.getClass();
    }

    public void setPlaceholderText(String str) {
        this.b.setText(str);
    }

    public void setStrokeColor(int i) {
        if (getStrokeColor() != i) {
            this.r.y(ColorStateList.valueOf(i));
        }
    }

    public void setStrokeWidth(float f) {
        if (getStrokeWidth() != f) {
            this.r.z(f);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    public void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
        this.b.setText(charSequence);
    }

    public void setTextCentered(boolean z) {
        this.s = z;
        TextView textView = this.a;
        if (textView == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        if (z) {
            layoutParams.gravity = 1;
            textView.setGravity(1);
        } else {
            layoutParams.gravity = 0;
            textView.setGravity(0);
        }
        textView.setLayoutParams(layoutParams);
        this.b.setLayoutParams(layoutParams);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {
        public boolean g;

        public ScrollingViewBehavior() {
            this.g = false;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
            super.h(coordinatorLayout, view, view2);
            if (!this.g && (view2 instanceof AppBarLayout)) {
                this.g = true;
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                appBarLayout.setBackgroundColor(0);
                appBarLayout.setTargetElevation(0.0f);
            }
            return false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.g = false;
        }
    }

    public SearchBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, vp6.materialSearchBarStyle);
    }

    public void setHint(int i) {
        this.a.setHint(i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SearchBar(Context context, AttributeSet attributeSet, int i) {
        boolean z;
        int i2 = x;
        super(mk4.a(context, attributeSet, i, i2), attributeSet, i);
        this.p = -1;
        this.w = new qh7(this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "title") == null) {
                if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "subtitle") != null) {
                    throw new UnsupportedOperationException("SearchBar does not support subtitle. Use hint or text instead.");
                }
            } else {
                throw new UnsupportedOperationException("SearchBar does not support title. Use hint or text instead.");
            }
        }
        Drawable drawableV = rf0.v(context2, getDefaultNavigationIconResource());
        this.j = drawableV;
        ol3 ol3Var = new ol3(23);
        new LinkedHashSet();
        new LinkedHashSet();
        new LinkedHashSet();
        this.i = ol3Var;
        TypedArray typedArrayD = vj8.d(context2, attributeSet, yt6.SearchBar, i, i2, new int[0]);
        as7 as7VarA = as7.d(context2, attributeSet, i, i2).a();
        int color = typedArrayD.getColor(yt6.SearchBar_backgroundTint, 0);
        this.d = color;
        this.f = ja1.r(context2, typedArrayD, yt6.SearchBar_liftOnScrollColor);
        float dimension = typedArrayD.getDimension(yt6.SearchBar_elevation, 0.0f);
        this.h = typedArrayD.getBoolean(yt6.SearchBar_defaultMarginsEnabled, true);
        this.q = typedArrayD.getBoolean(yt6.SearchBar_defaultScrollFlagsEnabled, true);
        boolean z2 = typedArrayD.getBoolean(yt6.SearchBar_hideNavigationIcon, false);
        this.l = typedArrayD.getBoolean(yt6.SearchBar_forceDefaultNavigationOnClickListener, false);
        this.k = typedArrayD.getBoolean(yt6.SearchBar_tintNavigationIcon, true);
        if (typedArrayD.hasValue(yt6.SearchBar_navigationIconTint)) {
            this.n = Integer.valueOf(typedArrayD.getColor(yt6.SearchBar_navigationIconTint, -1));
        }
        int resourceId = typedArrayD.getResourceId(yt6.SearchBar_android_textAppearance, -1);
        String string = typedArrayD.getString(yt6.SearchBar_android_text);
        String string2 = typedArrayD.getString(yt6.SearchBar_android_hint);
        float dimension2 = typedArrayD.getDimension(yt6.SearchBar_strokeWidth, -1.0f);
        int color2 = typedArrayD.getColor(yt6.SearchBar_strokeColor, 0);
        this.s = typedArrayD.getBoolean(yt6.SearchBar_textCentered, false);
        this.e = typedArrayD.getBoolean(yt6.SearchBar_liftOnScroll, false);
        this.t = typedArrayD.getDimensionPixelSize(yt6.SearchBar_android_maxWidth, -1);
        typedArrayD.recycle();
        if (z2) {
            z = true;
        } else {
            setNavigationIcon(getNavigationIcon() != null ? getNavigationIcon() : drawableV);
            z = true;
            setNavigationIconDecorative(true);
        }
        setClickable(z);
        setFocusable(z);
        LayoutInflater.from(context2).inflate(is6.mtrl_search_bar, this);
        this.g = z;
        TextView textView = (TextView) findViewById(qr6.open_search_bar_text_view);
        this.a = textView;
        TextView textView2 = (TextView) findViewById(qr6.open_search_bar_placeholder_text_view);
        this.b = textView2;
        this.c = (FrameLayout) findViewById(qr6.open_search_bar_text_view_container);
        setElevation(dimension);
        if (resourceId != -1) {
            textView.setTextAppearance(resourceId);
            textView2.setTextAppearance(resourceId);
        }
        setText(string);
        setHint(string2);
        setTextCentered(this.s);
        fk4 fk4Var = new fk4(as7VarA);
        this.r = fk4Var;
        fk4Var.o(getContext());
        this.r.r(dimension);
        if (dimension2 >= 0.0f) {
            fk4 fk4Var2 = this.r;
            fk4Var2.z(dimension2);
            fk4Var2.y(ColorStateList.valueOf(color2));
        }
        int iP = m91.p(xp6.colorControlHighlight, this);
        this.r.s(ColorStateList.valueOf(color));
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iP);
        fk4 fk4Var3 = this.r;
        setBackground(new RippleDrawable(colorStateListValueOf, fk4Var3, fk4Var3));
    }

    public void setText(int i) {
        this.a.setText(i);
        this.b.setText(i);
    }
}
