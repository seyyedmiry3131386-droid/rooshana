package com.google.android.material.navigation;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.BaselineLayout;
import defpackage.bm0;
import defpackage.cs6;
import defpackage.d50;
import defpackage.d77;
import defpackage.e50;
import defpackage.en0;
import defpackage.ft6;
import defpackage.ja1;
import defpackage.o3;
import defpackage.oq6;
import defpackage.qr6;
import defpackage.rl3;
import defpackage.s3;
import defpackage.u97;
import defpackage.ub1;
import defpackage.uj5;
import defpackage.vj5;
import defpackage.vp6;
import defpackage.vt4;
import defpackage.xq6;
import defpackage.yj5;
import defpackage.yk;
import io.sentry.android.core.t0;

/* JADX INFO: loaded from: classes.dex */
public abstract class NavigationBarItemView extends FrameLayout implements yj5 {
    public static final int[] G0 = {R.attr.state_checked};
    public static final rl3 H0 = new rl3();
    public static final vj5 I0 = new vj5();
    public BaselineLayout A;
    public int A0;
    public int B;
    public boolean B0;
    public int C;
    public boolean C0;
    public int D;
    public boolean D0;
    public int E;
    public boolean E0;
    public int F;
    public Rect F0;
    public ColorStateList G;
    public boolean H;
    public vt4 I;
    public ColorStateList J;
    public Drawable K;
    public Drawable L;
    public ValueAnimator M;
    public rl3 N;
    public float O;
    public boolean P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public boolean U;
    public int V;
    public int W;
    public boolean a;
    public ColorStateList b;
    public Drawable c;
    public int d;
    public int e;
    public int f;
    public int g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public int n;
    public boolean o;
    public final LinearLayout p;
    public final LinearLayout q;
    public final View r;
    public final FrameLayout s;
    public final ImageView t;
    public final BaselineLayout u;
    public final TextView v;
    public final TextView w;
    public final BaselineLayout x;
    public d50 x0;
    public final TextView y;
    public int y0;
    public final TextView z;
    public int z0;

    public NavigationBarItemView(Context context) {
        super(context);
        this.a = false;
        this.B = -1;
        this.C = 0;
        this.D = 0;
        this.E = 0;
        this.F = 0;
        this.H = false;
        this.N = H0;
        this.O = 0.0f;
        this.P = false;
        this.Q = 0;
        this.R = 0;
        this.S = -2;
        this.T = 0;
        this.U = false;
        this.V = 0;
        this.W = 0;
        this.z0 = 0;
        this.A0 = 49;
        this.B0 = false;
        this.C0 = false;
        this.D0 = false;
        this.E0 = false;
        this.F0 = new Rect();
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.p = (LinearLayout) findViewById(qr6.navigation_bar_item_content_container);
        LinearLayout linearLayout = (LinearLayout) findViewById(qr6.navigation_bar_item_inner_content_container);
        this.q = linearLayout;
        this.r = findViewById(qr6.navigation_bar_item_active_indicator_view);
        this.s = (FrameLayout) findViewById(qr6.navigation_bar_item_icon_container);
        this.t = (ImageView) findViewById(qr6.navigation_bar_item_icon_view);
        BaselineLayout baselineLayout = (BaselineLayout) findViewById(qr6.navigation_bar_item_labels_group);
        this.u = baselineLayout;
        TextView textView = (TextView) findViewById(qr6.navigation_bar_item_small_label_view);
        this.v = textView;
        TextView textView2 = (TextView) findViewById(qr6.navigation_bar_item_large_label_view);
        this.w = textView2;
        float dimension = getResources().getDimension(oq6.default_navigation_text_size);
        float dimension2 = getResources().getDimension(oq6.default_navigation_active_text_size);
        BaselineLayout baselineLayout2 = new BaselineLayout(getContext());
        this.x = baselineLayout2;
        baselineLayout2.setVisibility(8);
        this.x.setDuplicateParentStateEnabled(true);
        this.x.setMeasurePaddingFromBaseline(this.D0);
        TextView textView3 = new TextView(getContext());
        this.y = textView3;
        textView3.setMaxLines(1);
        TextView textView4 = this.y;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView4.setEllipsize(truncateAt);
        this.y.setDuplicateParentStateEnabled(true);
        this.y.setIncludeFontPadding(false);
        this.y.setGravity(16);
        this.y.setTextSize(dimension);
        TextView textView5 = new TextView(getContext());
        this.z = textView5;
        textView5.setMaxLines(1);
        this.z.setEllipsize(truncateAt);
        this.z.setDuplicateParentStateEnabled(true);
        this.z.setVisibility(4);
        this.z.setIncludeFontPadding(false);
        this.z.setGravity(16);
        this.z.setTextSize(dimension2);
        this.x.addView(this.y);
        this.x.addView(this.z);
        this.A = baselineLayout;
        setBackgroundResource(getItemBackgroundResId());
        this.d = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.e = baselineLayout.getPaddingBottom();
        this.f = 0;
        this.g = 0;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        this.y.setImportantForAccessibility(2);
        this.z.setImportantForAccessibility(2);
        setFocusable(true);
        a();
        this.T = getResources().getDimensionPixelSize(oq6.m3_navigation_item_expanded_active_indicator_height_default);
        linearLayout.addOnLayoutChangeListener(new en0(2, this));
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < iIndexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof NavigationBarItemView) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    private int getSuggestedIconWidth() {
        d50 d50Var = this.x0;
        int minimumWidth = d50Var == null ? 0 : d50Var.getMinimumWidth() - this.x0.e.b.w.intValue();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.s.getLayoutParams();
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.t.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.leftMargin);
    }

    public static void i(int i, int i2, int i3, View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i2;
        layoutParams.gravity = i3;
        view.setLayoutParams(layoutParams);
    }

    private void setLabelPivots(TextView textView) {
        textView.setPivotX(textView.getWidth() / 2);
        textView.setPivotY(textView.getBaseline());
    }

    public final void a() {
        float textSize = this.v.getTextSize();
        float textSize2 = this.w.getTextSize();
        this.h = textSize - textSize2;
        this.i = (textSize2 * 1.0f) / textSize;
        this.j = (textSize * 1.0f) / textSize2;
        float textSize3 = this.y.getTextSize();
        float textSize4 = this.z.getTextSize();
        this.k = textSize3 - textSize4;
        this.l = (textSize4 * 1.0f) / textSize3;
        this.m = (textSize3 * 1.0f) / textSize4;
    }

    public final void b() {
        Drawable rippleDrawable = this.c;
        RippleDrawable rippleDrawable2 = null;
        boolean z = true;
        if (this.b != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.P && getActiveIndicatorDrawable() != null && activeIndicatorDrawable != null) {
                rippleDrawable2 = new RippleDrawable(u97.c(this.b), null, activeIndicatorDrawable);
                z = false;
            } else if (rippleDrawable == null) {
                rippleDrawable = new RippleDrawable(u97.a(this.b), null, null);
            }
        }
        FrameLayout frameLayout = this.s;
        frameLayout.setPadding(0, 0, 0, 0);
        frameLayout.setForeground(rippleDrawable2);
        setBackground(rippleDrawable);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z);
        }
    }

    @Override // defpackage.iu4
    public final void c(vt4 vt4Var) {
        this.I = vt4Var;
        setCheckable(vt4Var.isCheckable());
        setChecked(vt4Var.isChecked());
        setEnabled(vt4Var.isEnabled());
        setIcon(vt4Var.getIcon());
        setTitle(vt4Var.e);
        setId(vt4Var.a);
        if (!TextUtils.isEmpty(vt4Var.q)) {
            setContentDescription(vt4Var.q);
        }
        CharSequence charSequence = !TextUtils.isEmpty(vt4Var.r) ? vt4Var.r : vt4Var.e;
        if (Build.VERSION.SDK_INT > 23) {
            d77.e(this, charSequence);
        }
        l();
        this.a = true;
    }

    public final void d(float f, float f2) {
        rl3 rl3Var = this.N;
        rl3Var.getClass();
        float fA = yk.a(0.4f, 1.0f, f);
        View view = this.r;
        view.setScaleX(fA);
        view.setScaleY(rl3Var.v(f));
        view.setAlpha(yk.b(0.0f, 1.0f, f2 == 0.0f ? 0.8f : 0.0f, f2 == 0.0f ? 1.0f : 0.2f, f));
        this.O = f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.P) {
            this.s.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        int i = this.t.getLayoutParams().width > 0 ? this.g : 0;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.x.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.rightMargin = getLayoutDirection() == 1 ? i : 0;
            layoutParams.leftMargin = getLayoutDirection() != 1 ? i : 0;
        }
    }

    public final void f(TextView textView, TextView textView2, float f, float f2) {
        i(this.y0 == 0 ? (int) (this.d + f2) : 0, 0, this.A0, this.p);
        int i = this.y0;
        i(i == 0 ? 0 : this.F0.top, i == 0 ? 0 : this.F0.bottom, i == 0 ? 17 : 8388627, this.q);
        int i2 = this.e;
        BaselineLayout baselineLayout = this.u;
        baselineLayout.setPadding(baselineLayout.getPaddingLeft(), baselineLayout.getPaddingTop(), baselineLayout.getPaddingRight(), i2);
        this.A.setVisibility(0);
        textView.setScaleX(1.0f);
        textView.setScaleY(1.0f);
        textView.setVisibility(0);
        textView2.setScaleX(f);
        textView2.setScaleY(f);
        textView2.setVisibility(4);
    }

    public final void g() {
        int i = this.d;
        i(i, i, this.y0 == 0 ? 17 : this.A0, this.p);
        i(0, 0, 17, this.q);
        BaselineLayout baselineLayout = this.u;
        baselineLayout.setPadding(baselineLayout.getPaddingLeft(), baselineLayout.getPaddingTop(), baselineLayout.getPaddingRight(), 0);
        this.A.setVisibility(8);
    }

    public Drawable getActiveIndicatorDrawable() {
        return this.r.getBackground();
    }

    public d50 getBadge() {
        return this.x0;
    }

    public BaselineLayout getExpandedLabelGroup() {
        return this.x;
    }

    public int getItemBackgroundResId() {
        return xq6.mtrl_navigation_bar_item_background;
    }

    @Override // defpackage.iu4
    public vt4 getItemData() {
        return this.I;
    }

    public int getItemDefaultMarginResId() {
        return oq6.mtrl_navigation_bar_item_default_margin;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.B;
    }

    public BaselineLayout getLabelGroup() {
        return this.u;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        LinearLayout linearLayout = this.p;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        return linearLayout.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        if (this.y0 == 1) {
            LinearLayout linearLayout = this.q;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
            return linearLayout.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
        }
        BaselineLayout baselineLayout = this.u;
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) baselineLayout.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), baselineLayout.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(android.widget.TextView r5, int r6) {
        /*
            r4 = this;
            boolean r0 = r4.E0
            if (r0 == 0) goto L8
            r5.setTextAppearance(r6)
            return
        L8:
            r5.setTextAppearance(r6)
            android.content.Context r0 = r5.getContext()
            r1 = 0
            if (r6 != 0) goto L13
            goto L29
        L13:
            int[] r2 = defpackage.lu6.TextAppearance
            android.content.res.TypedArray r6 = r0.obtainStyledAttributes(r6, r2)
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            int r3 = defpackage.lu6.TextAppearance_android_textSize
            boolean r3 = r6.getValue(r3, r2)
            r6.recycle()
            if (r3 != 0) goto L2b
        L29:
            r6 = r1
            goto L56
        L2b:
            int r6 = r2.getComplexUnit()
            r3 = 2
            if (r6 != r3) goto L48
            int r6 = r2.data
            float r6 = android.util.TypedValue.complexToFloat(r6)
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r6 = r6 * r0
            int r6 = java.lang.Math.round(r6)
            goto L56
        L48:
            int r6 = r2.data
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r6 = android.util.TypedValue.complexToDimensionPixelSize(r6, r0)
        L56:
            if (r6 == 0) goto L5c
            float r6 = (float) r6
            r5.setTextSize(r1, r6)
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationBarItemView.h(android.widget.TextView, int):void");
    }

    public final void j(int i) {
        if (i > 0 || getVisibility() != 0) {
            int iMin = Math.min(this.Q, i - (this.V * 2));
            int iMax = this.R;
            if (this.y0 == 1) {
                int measuredWidth = i - (this.W * 2);
                int i2 = this.S;
                if (i2 != -1) {
                    measuredWidth = i2 == -2 ? this.p.getMeasuredWidth() : Math.min(i2, measuredWidth);
                }
                iMin = measuredWidth;
                iMax = Math.max(this.T, this.q.getMeasuredHeight());
            }
            View view = this.r;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            if (this.U && this.n == 2) {
                iMax = iMin;
            }
            layoutParams.height = iMax;
            layoutParams.width = Math.max(0, iMin);
            view.setLayoutParams(layoutParams);
        }
    }

    public final void k(TextView textView, int i) {
        if (textView == null) {
            return;
        }
        h(textView, i);
        a();
        textView.setMinimumHeight(ja1.x(textView.getContext(), i));
        ColorStateList colorStateList = this.G;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
        TextView textView2 = this.w;
        textView2.setTypeface(textView2.getTypeface(), this.H ? 1 : 0);
        TextView textView3 = this.z;
        textView3.setTypeface(textView3.getTypeface(), this.H ? 1 : 0);
    }

    public final void l() {
        vt4 vt4Var = this.I;
        if (vt4Var != null) {
            setVisibility((!vt4Var.isVisible() || (!this.B0 && this.C0)) ? 8 : 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        vt4 vt4Var = this.I;
        if (vt4Var != null && vt4Var.isCheckable() && this.I.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, G0);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        d50 d50Var = this.x0;
        if (d50Var != null && d50Var.isVisible()) {
            vt4 vt4Var = this.I;
            CharSequence charSequence = vt4Var.e;
            if (!TextUtils.isEmpty(vt4Var.q)) {
                charSequence = this.I.q;
            }
            accessibilityNodeInfo.setContentDescription(((Object) charSequence) + ", " + ((Object) this.x0.d()));
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) s3.a(0, 1, getItemVisiblePosition(), 1, false, isSelected()).a);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) o3.g.a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(ft6.item_view_role_description));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new bm0(i, 3, this));
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        this.r.setBackground(drawable);
        b();
    }

    public void setActiveIndicatorEnabled(boolean z) {
        this.P = z;
        b();
        this.r.setVisibility(z ? 0 : 8);
        requestLayout();
    }

    public void setActiveIndicatorExpandedHeight(int i) {
        this.T = i;
        j(getWidth());
    }

    public void setActiveIndicatorExpandedMarginHorizontal(int i) {
        this.W = i;
        if (this.y0 == 1) {
            setPadding(i, 0, i, 0);
        }
        j(getWidth());
    }

    public void setActiveIndicatorExpandedPadding(Rect rect) {
        this.F0 = rect;
    }

    public void setActiveIndicatorExpandedWidth(int i) {
        this.S = i;
        j(getWidth());
    }

    public void setActiveIndicatorHeight(int i) {
        this.R = i;
        j(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i) {
        if (this.f != i) {
            this.f = i;
            ((LinearLayout.LayoutParams) this.u.getLayoutParams()).topMargin = i;
            if (this.x.getLayoutParams() != null) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.x.getLayoutParams();
                layoutParams.rightMargin = getLayoutDirection() == 1 ? i : 0;
                if (getLayoutDirection() == 1) {
                    i = 0;
                }
                layoutParams.leftMargin = i;
                requestLayout();
            }
        }
    }

    public void setActiveIndicatorMarginHorizontal(int i) {
        this.V = i;
        j(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z) {
        this.U = z;
    }

    public void setActiveIndicatorWidth(int i) {
        this.Q = i;
        j(getWidth());
    }

    public void setBadge(d50 d50Var) {
        d50 d50Var2 = this.x0;
        if (d50Var2 == d50Var) {
            return;
        }
        ImageView imageView = this.t;
        if (d50Var2 != null && imageView != null) {
            t0.m("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            if (this.x0 != null) {
                setClipChildren(true);
                setClipToPadding(true);
                d50 d50Var3 = this.x0;
                if (d50Var3 != null) {
                    if (d50Var3.e() != null) {
                        d50Var3.e().setForeground(null);
                    } else {
                        imageView.getOverlay().remove(d50Var3);
                    }
                }
                this.x0 = null;
            }
        }
        this.x0 = d50Var;
        int i = this.z0;
        e50 e50Var = d50Var.e;
        if (e50Var.l != i) {
            e50Var.l = i;
            d50Var.k();
        }
        if (imageView == null || this.x0 == null) {
            return;
        }
        setClipChildren(false);
        setClipToPadding(false);
        d50 d50Var4 = this.x0;
        Rect rect = new Rect();
        imageView.getDrawingRect(rect);
        d50Var4.setBounds(rect);
        d50Var4.j(imageView, null);
        if (d50Var4.e() != null) {
            d50Var4.e().setForeground(d50Var4);
        } else {
            imageView.getOverlay().add(d50Var4);
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setChecked(boolean z) {
        TextView textView = this.w;
        setLabelPivots(textView);
        TextView textView2 = this.v;
        setLabelPivots(textView2);
        TextView textView3 = this.z;
        setLabelPivots(textView3);
        TextView textView4 = this.y;
        setLabelPivots(textView4);
        float f = z ? 1.0f : 0.0f;
        if (this.P && this.a && isAttachedToWindow()) {
            ValueAnimator valueAnimator = this.M;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.M = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.O, f);
            this.M = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new uj5(this, f));
            this.M.setInterpolator(ub1.H(getContext(), vp6.motionEasingEmphasizedInterpolator, yk.b));
            this.M.setDuration(ub1.G(getContext(), vp6.motionDurationLong2, getResources().getInteger(cs6.material_motion_duration_long_1)));
            this.M.start();
        } else {
            d(f, f);
        }
        float f2 = this.h;
        float f3 = this.i;
        float f4 = this.j;
        if (this.y0 == 1) {
            f2 = this.k;
            f3 = this.l;
            f4 = this.m;
            textView = textView3;
            textView2 = textView4;
        }
        int i = this.n;
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        g();
                    }
                } else if (z) {
                    f(textView, textView2, f3, f2);
                } else {
                    f(textView2, textView, f4, 0.0f);
                }
            } else if (z) {
                f(textView, textView2, f3, 0.0f);
            } else {
                g();
            }
        } else if (this.o) {
            if (z) {
                f(textView, textView2, f3, 0.0f);
            } else {
                g();
            }
        } else if (z) {
            f(textView, textView2, f3, f2);
        } else {
            f(textView2, textView, f4, 0.0f);
        }
        refreshDrawableState();
        setSelected(z);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.v.setEnabled(z);
        this.w.setEnabled(z);
        this.y.setEnabled(z);
        this.z.setEnabled(z);
        this.t.setEnabled(z);
    }

    @Override // defpackage.yj5
    public void setExpanded(boolean z) {
        this.B0 = z;
        l();
    }

    public void setHorizontalTextAppearanceActive(int i) {
        this.E = i;
        if (i == 0) {
            i = this.C;
        }
        k(this.z, i);
    }

    public void setHorizontalTextAppearanceInactive(int i) {
        this.F = i;
        if (i == 0) {
            i = this.D;
        }
        TextView textView = this.y;
        if (textView == null) {
            return;
        }
        h(textView, i);
        a();
        textView.setMinimumHeight(ja1.x(textView.getContext(), i));
        ColorStateList colorStateList = this.G;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.K) {
            return;
        }
        this.K = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = drawable.mutate();
            this.L = drawable;
            ColorStateList colorStateList = this.J;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }
        this.t.setImageDrawable(drawable);
    }

    public void setIconLabelHorizontalSpacing(int i) {
        if (this.g != i) {
            this.g = i;
            e();
            requestLayout();
        }
    }

    public void setIconSize(int i) {
        ImageView imageView = this.t;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        imageView.setLayoutParams(layoutParams);
        e();
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.J = colorStateList;
        if (this.I == null || (drawable = this.L) == null) {
            return;
        }
        drawable.setTintList(colorStateList);
        this.L.invalidateSelf();
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : getContext().getDrawable(i));
    }

    public void setItemGravity(int i) {
        this.A0 = i;
        requestLayout();
    }

    public void setItemIconGravity(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (this.y0 != i) {
            this.y0 = i;
            this.z0 = 0;
            BaselineLayout baselineLayout = this.u;
            this.A = baselineLayout;
            LinearLayout linearLayout = this.q;
            int i8 = 8;
            if (i == 1) {
                if (this.x.getParent() == null) {
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 17;
                    linearLayout.addView(this.x, layoutParams);
                    e();
                }
                Rect rect = this.F0;
                int i9 = rect.left;
                int i10 = rect.right;
                int i11 = rect.top;
                i2 = rect.bottom;
                this.z0 = 1;
                int i12 = this.W;
                this.A = this.x;
                i6 = i11;
                i5 = i10;
                i4 = i9;
                i3 = i12;
                i7 = 0;
            } else {
                i2 = 0;
                i3 = 0;
                i4 = 0;
                i5 = 0;
                i6 = 0;
                i7 = 8;
                i8 = 0;
            }
            baselineLayout.setVisibility(i8);
            this.x.setVisibility(i7);
            ((FrameLayout.LayoutParams) this.p.getLayoutParams()).gravity = this.A0;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams2.leftMargin = i4;
            layoutParams2.rightMargin = i5;
            layoutParams2.topMargin = i6;
            layoutParams2.bottomMargin = i2;
            setPadding(i3, 0, i3, 0);
            j(getWidth());
            b();
        }
    }

    public void setItemPaddingBottom(int i) {
        if (this.e != i) {
            this.e = i;
            vt4 vt4Var = this.I;
            if (vt4Var != null) {
                setChecked(vt4Var.isChecked());
            }
        }
    }

    public void setItemPaddingTop(int i) {
        if (this.d != i) {
            this.d = i;
            vt4 vt4Var = this.I;
            if (vt4Var != null) {
                setChecked(vt4Var.isChecked());
            }
        }
    }

    public void setItemPosition(int i) {
        this.B = i;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.b = colorStateList;
        b();
    }

    public void setLabelFontScalingEnabled(boolean z) {
        this.E0 = z;
        setTextAppearanceActive(this.C);
        setTextAppearanceInactive(this.D);
        setHorizontalTextAppearanceActive(this.E);
        setHorizontalTextAppearanceInactive(this.F);
    }

    public void setLabelMaxLines(int i) {
        TextView textView = this.v;
        textView.setMaxLines(i);
        TextView textView2 = this.w;
        textView2.setMaxLines(i);
        this.y.setMaxLines(i);
        this.z.setMaxLines(i);
        if (Build.VERSION.SDK_INT > 34) {
            textView.setGravity(17);
            textView2.setGravity(17);
        } else if (i > 1) {
            textView.setEllipsize(null);
            textView2.setEllipsize(null);
            textView.setGravity(17);
            textView2.setGravity(17);
        } else {
            textView.setGravity(16);
            textView2.setGravity(16);
        }
        requestLayout();
    }

    public void setLabelVisibilityMode(int i) {
        if (this.n != i) {
            this.n = i;
            if (this.U && i == 2) {
                this.N = I0;
            } else {
                this.N = H0;
            }
            j(getWidth());
            vt4 vt4Var = this.I;
            if (vt4Var != null) {
                setChecked(vt4Var.isChecked());
            }
        }
    }

    public void setMeasureBottomPaddingFromLabelBaseline(boolean z) {
        this.D0 = z;
        this.u.setMeasurePaddingFromBaseline(z);
        this.v.setIncludeFontPadding(z);
        this.w.setIncludeFontPadding(z);
        this.x.setMeasurePaddingFromBaseline(z);
        this.y.setIncludeFontPadding(z);
        this.z.setIncludeFontPadding(z);
        requestLayout();
    }

    @Override // defpackage.yj5
    public void setOnlyShowWhenExpanded(boolean z) {
        this.C0 = z;
        l();
    }

    public void setShifting(boolean z) {
        if (this.o != z) {
            this.o = z;
            vt4 vt4Var = this.I;
            if (vt4Var != null) {
                setChecked(vt4Var.isChecked());
            }
        }
    }

    public void setShortcut(boolean z, char c) {
    }

    public void setTextAppearanceActive(int i) {
        this.C = i;
        k(this.w, i);
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z) {
        this.H = z;
        setTextAppearanceActive(this.C);
        setHorizontalTextAppearanceActive(this.E);
        TextView textView = this.w;
        textView.setTypeface(textView.getTypeface(), this.H ? 1 : 0);
        TextView textView2 = this.z;
        textView2.setTypeface(textView2.getTypeface(), this.H ? 1 : 0);
    }

    public void setTextAppearanceInactive(int i) {
        this.D = i;
        TextView textView = this.v;
        if (textView == null) {
            return;
        }
        h(textView, i);
        a();
        textView.setMinimumHeight(ja1.x(textView.getContext(), i));
        ColorStateList colorStateList = this.G;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.G = colorStateList;
        if (colorStateList != null) {
            this.v.setTextColor(colorStateList);
            this.w.setTextColor(colorStateList);
            this.y.setTextColor(colorStateList);
            this.z.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.v.setText(charSequence);
        this.w.setText(charSequence);
        this.y.setText(charSequence);
        this.z.setText(charSequence);
        vt4 vt4Var = this.I;
        if (vt4Var == null || TextUtils.isEmpty(vt4Var.q)) {
            setContentDescription(charSequence);
        }
        vt4 vt4Var2 = this.I;
        if (vt4Var2 != null && !TextUtils.isEmpty(vt4Var2.r)) {
            charSequence = this.I.r;
        }
        if (Build.VERSION.SDK_INT > 23) {
            d77.e(this, charSequence);
        }
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.c = drawable;
        b();
    }
}
