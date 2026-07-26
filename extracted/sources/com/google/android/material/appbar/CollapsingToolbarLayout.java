package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import defpackage.dk1;
import defpackage.h69;
import defpackage.ja1;
import defpackage.lf9;
import defpackage.mk4;
import defpackage.mt6;
import defpackage.oq6;
import defpackage.ot6;
import defpackage.pt2;
import defpackage.pz1;
import defpackage.q69;
import defpackage.qr6;
import defpackage.qu0;
import defpackage.ru0;
import defpackage.ub1;
import defpackage.vj8;
import defpackage.vp6;
import defpackage.yh0;
import defpackage.yk;
import defpackage.yt6;
import defpackage.z79;
import defpackage.ze0;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    public static final int L = mt6.Widget_Design_CollapsingToolbar;
    public d A;
    public int B;
    public int C;
    public int D;
    public lf9 E;
    public int F;
    public boolean G;
    public int H;
    public int I;
    public boolean J;
    public int K;
    public boolean a;
    public final int b;
    public ViewGroup c;
    public View d;
    public View e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public final Rect k;
    public final qu0 l;
    public final qu0 m;
    public final pz1 n;
    public boolean o;
    public boolean p;
    public final int q;
    public Drawable r;
    public Drawable s;
    public int t;
    public boolean u;
    public ValueAnimator v;
    public long w;
    public final TimeInterpolator x;
    public final TimeInterpolator y;
    public int z;

    public static class LayoutParams extends FrameLayout.LayoutParams {
        public int a;
        public float b;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0;
            this.b = 0.5f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yt6.CollapsingToolbarLayout_Layout);
            this.a = typedArrayObtainStyledAttributes.getInt(yt6.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            this.b = typedArrayObtainStyledAttributes.getFloat(yt6.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public CollapsingToolbarLayout(Context context) {
        this(context, null);
    }

    public static z79 b(View view) {
        z79 z79Var = (z79) view.getTag(qr6.view_offset_helper);
        if (z79Var != null) {
            return z79Var;
        }
        z79 z79Var2 = new z79(view);
        view.setTag(qr6.view_offset_helper, z79Var2);
        return z79Var2;
    }

    private int getDefaultContentScrimColorForTitleCollapseFadeMode() {
        Context context = getContext();
        TypedValue typedValueG = yh0.G(context, vp6.colorSurfaceContainer);
        ColorStateList colorStateListValueOf = null;
        if (typedValueG != null) {
            int i = typedValueG.resourceId;
            if (i != 0) {
                colorStateListValueOf = ContextCompat.getColorStateList(context, i);
            } else {
                int i2 = typedValueG.data;
                if (i2 != 0) {
                    colorStateListValueOf = ColorStateList.valueOf(i2);
                }
            }
        }
        if (colorStateListValueOf != null) {
            return colorStateListValueOf.getDefaultColor();
        }
        float dimension = getResources().getDimension(oq6.design_appbar_elevation);
        pz1 pz1Var = this.n;
        return pz1Var.a(pz1Var.d, dimension);
    }

    public final void a() {
        if (this.a) {
            ViewGroup viewGroup = null;
            this.c = null;
            this.d = null;
            int i = this.b;
            if (i != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i);
                this.c = viewGroup2;
                if (viewGroup2 != null) {
                    ViewParent parent = viewGroup2.getParent();
                    View view = viewGroup2;
                    while (parent != this && parent != null) {
                        if (parent instanceof View) {
                            view = (View) parent;
                        }
                        parent = parent.getParent();
                        view = view;
                    }
                    this.d = view;
                }
            }
            if (this.c == null) {
                int childCount = getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = getChildAt(i2);
                    if ((childAt instanceof Toolbar) || (childAt instanceof android.widget.Toolbar)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                }
                this.c = viewGroup;
            }
            c();
            this.a = false;
        }
    }

    public final void c() {
        View view;
        if (!this.o && (view = this.e) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.e);
            }
        }
        if (!this.o || this.c == null) {
            return;
        }
        if (this.e == null) {
            this.e = new View(getContext());
        }
        if (this.e.getParent() == null) {
            this.c.addView(this.e, -1, -1);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final void d() {
        if (this.r == null && this.s == null) {
            return;
        }
        setScrimsShown(getHeight() + this.B < getScrimVisibleHeightTrigger());
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        a();
        if (this.c == null && (drawable = this.r) != null && this.t > 0) {
            drawable.mutate().setAlpha(this.t);
            this.r.draw(canvas);
        }
        if (this.o && this.p) {
            ViewGroup viewGroup = this.c;
            qu0 qu0Var = this.m;
            qu0 qu0Var2 = this.l;
            if (viewGroup == null || this.r == null || this.t <= 0 || this.D != 1 || qu0Var2.b >= qu0Var2.e) {
                qu0Var2.f(canvas);
                qu0Var.f(canvas);
            } else {
                int iSave = canvas.save();
                canvas.clipRect(this.r.getBounds(), Region.Op.DIFFERENCE);
                qu0Var2.f(canvas);
                qu0Var.f(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        if (this.s == null || this.t <= 0) {
            return;
        }
        lf9 lf9Var = this.E;
        int iD = lf9Var != null ? lf9Var.d() : 0;
        if (iD > 0) {
            this.s.setBounds(0, -this.B, getWidth(), iD - this.B);
            this.s.mutate().setAlpha(this.t);
            this.s.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        View view2;
        Drawable drawable = this.r;
        if (drawable == null || this.t <= 0 || ((view2 = this.d) == null || view2 == this ? view != this.c : view != view2)) {
            z = false;
        } else {
            int width = getWidth();
            int height = getHeight();
            if (this.D == 1 && view != null && this.o) {
                height = view.getBottom();
            }
            drawable.setBounds(0, 0, width, height);
            this.r.mutate().setAlpha(this.t);
            this.r.draw(canvas);
            z = true;
        }
        return super.drawChild(canvas, view, j) || z;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        ColorStateList colorStateList;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.s;
        boolean z = false;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.r;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        qu0 qu0Var = this.l;
        if (qu0Var != null) {
            qu0Var.S = drawableState;
            ColorStateList colorStateList2 = qu0Var.p;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = qu0Var.o) != null && colorStateList.isStateful())) {
                qu0Var.l(false);
                z = true;
            }
            state |= z;
        }
        if (state) {
            invalidate();
        }
    }

    public final void e(boolean z, int i, int i2, int i3, int i4) {
        View view;
        int titleMarginBottom;
        int titleMarginEnd;
        int titleMarginTop;
        if (!this.o || (view = this.e) == null) {
            return;
        }
        int titleMarginStart = 0;
        boolean z2 = view.isAttachedToWindow() && this.e.getVisibility() == 0;
        this.p = z2;
        if (z2 || z) {
            boolean z3 = getLayoutDirection() == 1;
            View view2 = this.d;
            if (view2 == null) {
                view2 = this.c;
            }
            int height = ((getHeight() - b(view2).b) - view2.getHeight()) - ((FrameLayout.LayoutParams) ((LayoutParams) view2.getLayoutParams())).bottomMargin;
            View view3 = this.e;
            Rect rect = this.k;
            dk1.a(this, view3, rect);
            ViewGroup viewGroup = this.c;
            if (viewGroup instanceof Toolbar) {
                Toolbar toolbar = (Toolbar) viewGroup;
                titleMarginStart = toolbar.getTitleMarginStart();
                titleMarginEnd = toolbar.getTitleMarginEnd();
                titleMarginTop = toolbar.getTitleMarginTop();
                titleMarginBottom = toolbar.getTitleMarginBottom();
            } else if (Build.VERSION.SDK_INT < 24 || !(viewGroup instanceof android.widget.Toolbar)) {
                titleMarginBottom = 0;
                titleMarginEnd = 0;
                titleMarginTop = 0;
            } else {
                android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
                titleMarginStart = toolbar2.getTitleMarginStart();
                titleMarginEnd = toolbar2.getTitleMarginEnd();
                titleMarginTop = toolbar2.getTitleMarginTop();
                titleMarginBottom = toolbar2.getTitleMarginBottom();
            }
            int i5 = rect.left + (z3 ? titleMarginEnd : titleMarginStart);
            int i6 = rect.right - (z3 ? titleMarginStart : titleMarginEnd);
            int i7 = rect.top + height + titleMarginTop;
            int i8 = (rect.bottom + height) - titleMarginBottom;
            qu0 qu0Var = this.m;
            TextPaint textPaint = qu0Var.V;
            textPaint.setTextSize(qu0Var.n);
            textPaint.setTypeface(qu0Var.x);
            textPaint.setLetterSpacing(qu0Var.g0);
            int iDescent = (int) (i8 - (textPaint.descent() + (-textPaint.ascent())));
            qu0 qu0Var2 = this.l;
            TextPaint textPaint2 = qu0Var2.V;
            textPaint2.setTextSize(qu0Var2.n);
            textPaint2.setTypeface(qu0Var2.x);
            textPaint2.setLetterSpacing(qu0Var2.g0);
            int iDescent2 = (int) (textPaint2.descent() + (-textPaint2.ascent()) + i7);
            if (TextUtils.isEmpty(qu0Var.H)) {
                qu0Var2.o(i5, i7, i6, i8);
            } else {
                qu0Var2.o(i5, i7, i6, iDescent);
                qu0Var.o(i5, iDescent2, i6, i8);
            }
            if (this.q == 0) {
                dk1.a(this, this, rect);
                int i9 = rect.left + (z3 ? titleMarginEnd : titleMarginStart);
                int i10 = rect.right;
                if (!z3) {
                    titleMarginStart = titleMarginEnd;
                }
                int i11 = i10 - titleMarginStart;
                if (TextUtils.isEmpty(qu0Var.H)) {
                    qu0Var2.p(i9, i7, i11, i8);
                } else {
                    qu0Var2.p(i9, i7, i11, iDescent);
                    qu0Var.p(i9, iDescent2, i11, i8);
                }
            }
            int i12 = z3 ? this.h : this.f;
            int i13 = rect.top + this.g;
            int i14 = (i3 - i) - (z3 ? this.f : this.h);
            int i15 = (i4 - i2) - this.i;
            if (TextUtils.isEmpty(qu0Var.H)) {
                this.l.u(true, i12, i13, i14, i15);
                qu0Var2.l(z);
            } else {
                this.l.u(false, i12, i13, i14, (int) ((i15 - (qu0Var.i() + this.I)) - this.j));
                this.m.u(false, i12, (int) (qu0Var2.i() + this.H + i13 + this.j), i14, i15);
                qu0Var2.l(z);
                qu0Var.l(z);
            }
        }
    }

    public final void f() {
        ViewGroup viewGroup = this.c;
        if (viewGroup == null || !this.o) {
            return;
        }
        CharSequence subtitle = null;
        CharSequence title = viewGroup instanceof Toolbar ? ((Toolbar) viewGroup).getTitle() : viewGroup instanceof android.widget.Toolbar ? ((android.widget.Toolbar) viewGroup).getTitle() : null;
        if (TextUtils.isEmpty(this.l.H) && !TextUtils.isEmpty(title)) {
            setTitle(title);
        }
        ViewGroup viewGroup2 = this.c;
        if (viewGroup2 instanceof Toolbar) {
            subtitle = ((Toolbar) viewGroup2).getSubtitle();
        } else if (viewGroup2 instanceof android.widget.Toolbar) {
            subtitle = ((android.widget.Toolbar) viewGroup2).getSubtitle();
        }
        if (!TextUtils.isEmpty(this.m.H) || TextUtils.isEmpty(subtitle)) {
            return;
        }
        setSubtitle(subtitle);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.a = 0;
        layoutParams.b = 0.5f;
        return layoutParams;
    }

    public float getCollapsedSubtitleTextSize() {
        return this.m.n;
    }

    public Typeface getCollapsedSubtitleTypeface() {
        Typeface typeface = this.m.x;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public int getCollapsedTitleGravity() {
        return this.l.l;
    }

    public float getCollapsedTitleTextSize() {
        return this.l.n;
    }

    public Typeface getCollapsedTitleTypeface() {
        Typeface typeface = this.l.x;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public Drawable getContentScrim() {
        return this.r;
    }

    public float getExpandedSubtitleTextSize() {
        return this.m.m;
    }

    public Typeface getExpandedSubtitleTypeface() {
        Typeface typeface = this.m.A;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public int getExpandedTitleGravity() {
        return this.l.k;
    }

    public int getExpandedTitleMarginBottom() {
        return this.i;
    }

    public int getExpandedTitleMarginEnd() {
        return this.h;
    }

    public int getExpandedTitleMarginStart() {
        return this.f;
    }

    public int getExpandedTitleMarginTop() {
        return this.g;
    }

    public int getExpandedTitleSpacing() {
        return this.j;
    }

    public float getExpandedTitleTextSize() {
        return this.l.m;
    }

    public Typeface getExpandedTitleTypeface() {
        Typeface typeface = this.l.A;
        return typeface != null ? typeface : Typeface.DEFAULT;
    }

    public int getHyphenationFrequency() {
        return this.l.s0;
    }

    public int getLineCount() {
        StaticLayout staticLayout = this.l.j0;
        if (staticLayout != null) {
            return staticLayout.getLineCount();
        }
        return 0;
    }

    public float getLineSpacingAdd() {
        return this.l.j0.getSpacingAdd();
    }

    public float getLineSpacingMultiplier() {
        return this.l.j0.getSpacingMultiplier();
    }

    public int getMaxLines() {
        return this.l.o0;
    }

    public int getScrimAlpha() {
        return this.t;
    }

    public long getScrimAnimationDuration() {
        return this.w;
    }

    public int getScrimVisibleHeightTrigger() {
        int i = this.z;
        if (i >= 0) {
            return i + this.F + this.H + this.I + this.K;
        }
        lf9 lf9Var = this.E;
        int iD = lf9Var != null ? lf9Var.d() : 0;
        int minimumHeight = getMinimumHeight();
        return minimumHeight > 0 ? Math.min((minimumHeight * 2) + iD, getHeight()) : getHeight() / 3;
    }

    public Drawable getStatusBarScrim() {
        return this.s;
    }

    public CharSequence getSubtitle() {
        if (this.o) {
            return this.m.H;
        }
        return null;
    }

    public CharSequence getTitle() {
        if (this.o) {
            return this.l.H;
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.D;
    }

    public TimeInterpolator getTitlePositionInterpolator() {
        return this.l.W;
    }

    public TextUtils.TruncateAt getTitleTextEllipsize() {
        return this.l.G;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.D == 1) {
                appBarLayout.setLiftOnScroll(false);
            }
            setFitsSystemWindows(appBarLayout.getFitsSystemWindows());
            if (this.A == null) {
                this.A = new d(this);
            }
            appBarLayout.a(this.A);
            requestApplyInsets();
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        qu0 qu0Var = this.l;
        qu0Var.k(configuration);
        if (this.C != configuration.orientation && this.J && qu0Var.b == 1.0f) {
            ViewParent parent = getParent();
            if (parent instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) parent;
                if (appBarLayout.getPendingAction() == 0) {
                    appBarLayout.setPendingAction(2);
                }
            }
        }
        this.C = configuration.orientation;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        ViewParent parent = getParent();
        d dVar = this.A;
        if (dVar != null && (parent instanceof AppBarLayout) && (arrayList = ((AppBarLayout) parent).h) != null) {
            arrayList.remove(dVar);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        lf9 lf9Var = this.E;
        if (lf9Var != null) {
            int iD = lf9Var.d();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!childAt.getFitsSystemWindows() && childAt.getTop() < iD) {
                    WeakHashMap weakHashMap = q69.a;
                    childAt.offsetTopAndBottom(iD);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            z79 z79VarB = b(getChildAt(i6));
            View view = z79VarB.a;
            z79VarB.b = view.getTop();
            z79VarB.c = view.getLeft();
        }
        e(false, i, i2, i3, i4);
        f();
        d();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            b(getChildAt(i7)).a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c3  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r10, int r11) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.CollapsingToolbarLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.r;
        if (drawable != null) {
            ViewGroup viewGroup = this.c;
            if (this.D == 1 && viewGroup != null && this.o) {
                i2 = viewGroup.getBottom();
            }
            drawable.setBounds(0, 0, i, i2);
        }
    }

    public void setCollapsedSubtitleTextAppearance(int i) {
        this.m.q(i);
    }

    public void setCollapsedSubtitleTextColor(int i) {
        setCollapsedSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedSubtitleTextSize(float f) {
        qu0 qu0Var = this.m;
        if (qu0Var.n != f) {
            qu0Var.n = f;
            qu0Var.l(false);
        }
    }

    public void setCollapsedSubtitleTypeface(Typeface typeface) {
        qu0 qu0Var = this.m;
        if (qu0Var.t(typeface)) {
            qu0Var.l(false);
        }
    }

    public void setCollapsedTitleGravity(int i) {
        this.l.s(i);
        this.m.s(i);
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.l.q(i);
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTextSize(float f) {
        qu0 qu0Var = this.l;
        if (qu0Var.n != f) {
            qu0Var.n = f;
            qu0Var.l(false);
        }
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        qu0 qu0Var = this.l;
        if (qu0Var.t(typeface)) {
            qu0Var.l(false);
        }
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.r;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.r = drawableMutate;
            if (drawableMutate != null) {
                int width = getWidth();
                int height = getHeight();
                ViewGroup viewGroup = this.c;
                if (this.D == 1 && viewGroup != null && this.o) {
                    height = viewGroup.getBottom();
                }
                drawableMutate.setBounds(0, 0, width, height);
                this.r.setCallback(this);
                this.r.setAlpha(this.t);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(int i) {
        setContentScrim(getContext().getDrawable(i));
    }

    public void setExpandedSubtitleColor(int i) {
        setExpandedSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedSubtitleTextAppearance(int i) {
        this.m.w(i);
    }

    public void setExpandedSubtitleTextColor(ColorStateList colorStateList) {
        qu0 qu0Var = this.m;
        if (qu0Var.o != colorStateList) {
            qu0Var.o = colorStateList;
            qu0Var.l(false);
        }
    }

    public void setExpandedSubtitleTextSize(float f) {
        this.m.y(f);
    }

    public void setExpandedSubtitleTypeface(Typeface typeface) {
        qu0 qu0Var = this.m;
        if (qu0Var.z(typeface)) {
            qu0Var.l(false);
        }
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleGravity(int i) {
        this.l.x(i);
        this.m.x(i);
    }

    public void setExpandedTitleMargin(int i, int i2, int i3, int i4) {
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        requestLayout();
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.i = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.h = i;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.f = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.g = i;
        requestLayout();
    }

    public void setExpandedTitleSpacing(int i) {
        this.j = i;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.l.w(i);
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        qu0 qu0Var = this.l;
        if (qu0Var.o != colorStateList) {
            qu0Var.o = colorStateList;
            qu0Var.l(false);
        }
    }

    public void setExpandedTitleTextSize(float f) {
        this.l.y(f);
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        qu0 qu0Var = this.l;
        if (qu0Var.z(typeface)) {
            qu0Var.l(false);
        }
    }

    public void setExtraMultilineHeightEnabled(boolean z) {
        this.J = z;
    }

    public void setForceApplySystemWindowInsetTop(boolean z) {
        this.G = z;
    }

    public void setHyphenationFrequency(int i) {
        this.l.s0 = i;
    }

    public void setLineSpacingAdd(float f) {
        this.l.q0 = f;
    }

    public void setLineSpacingMultiplier(float f) {
        this.l.r0 = f;
    }

    public void setMaxLines(int i) {
        this.l.v(i);
        this.m.v(i);
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.l.K = z;
    }

    public void setScrimAlpha(int i) {
        ViewGroup viewGroup;
        if (i != this.t) {
            if (this.r != null && (viewGroup = this.c) != null) {
                viewGroup.postInvalidateOnAnimation();
            }
            this.t = i;
            postInvalidateOnAnimation();
        }
    }

    public void setScrimAnimationDuration(long j) {
        this.w = j;
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.z != i) {
            this.z = i;
            d();
        }
    }

    public void setScrimsShown(boolean z) {
        setScrimsShown(z, isLaidOut() && !isInEditMode());
    }

    public void setStaticLayoutBuilderConfigurer(ru0 ru0Var) {
        qu0 qu0Var = this.l;
        qu0Var.getClass();
        if (ru0Var != null) {
            qu0Var.l(true);
        }
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.s;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.s = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.s.setState(getDrawableState());
                }
                this.s.setLayoutDirection(getLayoutDirection());
                this.s.setVisible(getVisibility() == 0, false);
                this.s.setCallback(this);
                this.s.setAlpha(this.t);
            }
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(getContext().getDrawable(i));
    }

    public void setSubtitle(CharSequence charSequence) {
        this.m.B(charSequence);
    }

    public void setTitle(CharSequence charSequence) {
        this.l.B(charSequence);
        setContentDescription(getTitle());
    }

    public void setTitleCollapseMode(int i) {
        this.D = i;
        boolean z = i == 1;
        this.l.c = z;
        this.m.c = z;
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            if (this.D == 1) {
                appBarLayout.setLiftOnScroll(false);
            }
        }
        if (z && this.r == null) {
            setContentScrimColor(getDefaultContentScrimColorForTitleCollapseFadeMode());
        }
    }

    public void setTitleEllipsize(TextUtils.TruncateAt truncateAt) {
        qu0 qu0Var = this.l;
        qu0Var.G = truncateAt;
        qu0Var.l(false);
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.o) {
            this.o = z;
            setContentDescription(getTitle());
            c();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(TimeInterpolator timeInterpolator) {
        qu0 qu0Var = this.l;
        qu0Var.W = timeInterpolator;
        qu0Var.l(false);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.s;
        if (drawable != null && drawable.isVisible() != z) {
            this.s.setVisible(z, false);
        }
        Drawable drawable2 = this.r;
        if (drawable2 == null || drawable2.isVisible() == z) {
            return;
        }
        this.r.setVisible(z, false);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.r || drawable == this.s;
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, vp6.collapsingToolbarLayoutStyle);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void setCollapsedSubtitleTextColor(ColorStateList colorStateList) {
        this.m.r(colorStateList);
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.l.r(colorStateList);
    }

    public void setScrimsShown(boolean z, boolean z2) {
        if (this.u != z) {
            if (z2) {
                int i = z ? 255 : 0;
                a();
                ValueAnimator valueAnimator = this.v;
                if (valueAnimator == null) {
                    ValueAnimator valueAnimator2 = new ValueAnimator();
                    this.v = valueAnimator2;
                    valueAnimator2.setInterpolator(i > this.t ? this.x : this.y);
                    this.v.addUpdateListener(new ze0(1, this));
                } else if (valueAnimator.isRunning()) {
                    this.v.cancel();
                }
                this.v.setDuration(this.w);
                this.v.setIntValues(this.t, i);
                this.v.start();
            } else {
                setScrimAlpha(z ? 255 : 0);
            }
            this.u = z;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i) {
        ColorStateList colorStateListR;
        ColorStateList colorStateListR2;
        TextUtils.TruncateAt truncateAt;
        int i2 = L;
        super(mk4.a(context, attributeSet, i, i2), attributeSet, i);
        this.a = true;
        this.k = new Rect();
        this.z = -1;
        this.F = 0;
        this.H = 0;
        this.I = 0;
        this.K = 0;
        Context context2 = getContext();
        this.C = getResources().getConfiguration().orientation;
        qu0 qu0Var = new qu0(this);
        this.l = qu0Var;
        DecelerateInterpolator decelerateInterpolator = yk.e;
        qu0Var.X = decelerateInterpolator;
        qu0Var.l(false);
        qu0Var.K = false;
        this.n = new pz1(context2);
        int[] iArr = yt6.CollapsingToolbarLayout;
        vj8.a(context2, attributeSet, i, i2);
        vj8.b(context2, attributeSet, iArr, i, i2, new int[0]);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, i2);
        int i3 = typedArrayObtainStyledAttributes.getInt(yt6.CollapsingToolbarLayout_expandedTitleGravity, 8388691);
        int i4 = typedArrayObtainStyledAttributes.getInt(yt6.CollapsingToolbarLayout_collapsedTitleGravity, 8388627);
        this.q = typedArrayObtainStyledAttributes.getInt(yt6.CollapsingToolbarLayout_collapsedTitleGravityMode, 1);
        qu0Var.x(i3);
        qu0Var.s(i4);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(yt6.CollapsingToolbarLayout_expandedTitleMargin, 0);
        this.i = dimensionPixelSize;
        this.h = dimensionPixelSize;
        this.g = dimensionPixelSize;
        this.f = dimensionPixelSize;
        if (typedArrayObtainStyledAttributes.hasValue(yt6.CollapsingToolbarLayout_expandedTitleMarginStart)) {
            this.f = typedArrayObtainStyledAttributes.getDimensionPixelSize(yt6.CollapsingToolbarLayout_expandedTitleMarginStart, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(yt6.CollapsingToolbarLayout_expandedTitleMarginEnd)) {
            this.h = typedArrayObtainStyledAttributes.getDimensionPixelSize(yt6.CollapsingToolbarLayout_expandedTitleMarginEnd, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(yt6.CollapsingToolbarLayout_expandedTitleMarginTop)) {
            this.g = typedArrayObtainStyledAttributes.getDimensionPixelSize(yt6.CollapsingToolbarLayout_expandedTitleMarginTop, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(yt6.CollapsingToolbarLayout_expandedTitleMarginBottom)) {
            this.i = typedArrayObtainStyledAttributes.getDimensionPixelSize(yt6.CollapsingToolbarLayout_expandedTitleMarginBottom, 0);
        }
        if (typedArrayObtainStyledAttributes.hasValue(yt6.CollapsingToolbarLayout_expandedTitleSpacing)) {
            this.j = typedArrayObtainStyledAttributes.getDimensionPixelSize(yt6.CollapsingToolbarLayout_expandedTitleSpacing, 0);
        }
        this.o = typedArrayObtainStyledAttributes.getBoolean(yt6.CollapsingToolbarLayout_titleEnabled, true);
        setTitle(typedArrayObtainStyledAttributes.getText(yt6.CollapsingToolbarLayout_title));
        qu0Var.w(mt6.TextAppearance_Design_CollapsingToolbar_Expanded);
        qu0Var.q(ot6.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (typedArrayObtainStyledAttributes.hasValue(yt6.CollapsingToolbarLayout_expandedTitleTextAppearance)) {
            qu0Var.w(typedArrayObtainStyledAttributes.getResourceId(yt6.CollapsingToolbarLayout_expandedTitleTextAppearance, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(yt6.CollapsingToolbarLayout_collapsedTitleTextAppearance)) {
            qu0Var.q(typedArrayObtainStyledAttributes.getResourceId(yt6.CollapsingToolbarLayout_collapsedTitleTextAppearance, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(yt6.CollapsingToolbarLayout_titleTextEllipsize)) {
            int i5 = typedArrayObtainStyledAttributes.getInt(yt6.CollapsingToolbarLayout_titleTextEllipsize, -1);
            if (i5 == 0) {
                truncateAt = TextUtils.TruncateAt.START;
            } else if (i5 == 1) {
                truncateAt = TextUtils.TruncateAt.MIDDLE;
            } else if (i5 != 3) {
                truncateAt = TextUtils.TruncateAt.END;
            } else {
                truncateAt = TextUtils.TruncateAt.MARQUEE;
            }
            setTitleEllipsize(truncateAt);
        }
        if (typedArrayObtainStyledAttributes.hasValue(yt6.CollapsingToolbarLayout_expandedTitleTextColor) && qu0Var.o != (colorStateListR2 = ja1.r(context2, typedArrayObtainStyledAttributes, yt6.CollapsingToolbarLayout_expandedTitleTextColor))) {
            qu0Var.o = colorStateListR2;
            qu0Var.l(false);
        }
        if (typedArrayObtainStyledAttributes.hasValue(yt6.CollapsingToolbarLayout_collapsedTitleTextColor)) {
            qu0Var.r(ja1.r(context2, typedArrayObtainStyledAttributes, yt6.CollapsingToolbarLayout_collapsedTitleTextColor));
        }
        this.z = typedArrayObtainStyledAttributes.getDimensionPixelSize(yt6.CollapsingToolbarLayout_scrimVisibleHeightTrigger, -1);
        if (typedArrayObtainStyledAttributes.hasValue(yt6.CollapsingToolbarLayout_titleMaxLines)) {
            qu0Var.v(typedArrayObtainStyledAttributes.getInt(yt6.CollapsingToolbarLayout_titleMaxLines, 1));
        } else if (typedArrayObtainStyledAttributes.hasValue(yt6.CollapsingToolbarLayout_maxLines)) {
            qu0Var.v(typedArrayObtainStyledAttributes.getInt(yt6.CollapsingToolbarLayout_maxLines, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(yt6.CollapsingToolbarLayout_titlePositionInterpolator)) {
            qu0Var.W = AnimationUtils.loadInterpolator(context2, typedArrayObtainStyledAttributes.getResourceId(yt6.CollapsingToolbarLayout_titlePositionInterpolator, 0));
            qu0Var.l(false);
        }
        qu0 qu0Var2 = new qu0(this);
        this.m = qu0Var2;
        qu0Var2.X = decelerateInterpolator;
        qu0Var2.l(false);
        qu0Var2.K = false;
        if (typedArrayObtainStyledAttributes.hasValue(yt6.CollapsingToolbarLayout_subtitle)) {
            setSubtitle(typedArrayObtainStyledAttributes.getText(yt6.CollapsingToolbarLayout_subtitle));
        }
        qu0Var2.x(i3);
        qu0Var2.s(i4);
        qu0Var2.w(ot6.TextAppearance_AppCompat_Headline);
        qu0Var2.q(ot6.TextAppearance_AppCompat_Widget_ActionBar_Subtitle);
        if (typedArrayObtainStyledAttributes.hasValue(yt6.CollapsingToolbarLayout_expandedSubtitleTextAppearance)) {
            qu0Var2.w(typedArrayObtainStyledAttributes.getResourceId(yt6.CollapsingToolbarLayout_expandedSubtitleTextAppearance, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(yt6.CollapsingToolbarLayout_collapsedSubtitleTextAppearance)) {
            qu0Var2.q(typedArrayObtainStyledAttributes.getResourceId(yt6.CollapsingToolbarLayout_collapsedSubtitleTextAppearance, 0));
        }
        if (typedArrayObtainStyledAttributes.hasValue(yt6.CollapsingToolbarLayout_expandedSubtitleTextColor) && qu0Var2.o != (colorStateListR = ja1.r(context2, typedArrayObtainStyledAttributes, yt6.CollapsingToolbarLayout_expandedSubtitleTextColor))) {
            qu0Var2.o = colorStateListR;
            qu0Var2.l(false);
        }
        if (typedArrayObtainStyledAttributes.hasValue(yt6.CollapsingToolbarLayout_collapsedSubtitleTextColor)) {
            qu0Var2.r(ja1.r(context2, typedArrayObtainStyledAttributes, yt6.CollapsingToolbarLayout_collapsedSubtitleTextColor));
        }
        if (typedArrayObtainStyledAttributes.hasValue(yt6.CollapsingToolbarLayout_subtitleMaxLines)) {
            qu0Var2.v(typedArrayObtainStyledAttributes.getInt(yt6.CollapsingToolbarLayout_subtitleMaxLines, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(yt6.CollapsingToolbarLayout_titlePositionInterpolator)) {
            qu0Var2.W = AnimationUtils.loadInterpolator(context2, typedArrayObtainStyledAttributes.getResourceId(yt6.CollapsingToolbarLayout_titlePositionInterpolator, 0));
            qu0Var2.l(false);
        }
        this.w = typedArrayObtainStyledAttributes.getInt(yt6.CollapsingToolbarLayout_scrimAnimationDuration, 600);
        this.x = ub1.H(context2, vp6.motionEasingStandardInterpolator, yk.c);
        this.y = ub1.H(context2, vp6.motionEasingStandardInterpolator, yk.d);
        setContentScrim(typedArrayObtainStyledAttributes.getDrawable(yt6.CollapsingToolbarLayout_contentScrim));
        setStatusBarScrim(typedArrayObtainStyledAttributes.getDrawable(yt6.CollapsingToolbarLayout_statusBarScrim));
        setTitleCollapseMode(typedArrayObtainStyledAttributes.getInt(yt6.CollapsingToolbarLayout_titleCollapseMode, 0));
        this.b = typedArrayObtainStyledAttributes.getResourceId(yt6.CollapsingToolbarLayout_toolbarId, -1);
        this.G = typedArrayObtainStyledAttributes.getBoolean(yt6.CollapsingToolbarLayout_forceApplySystemWindowInsetTop, false);
        this.J = typedArrayObtainStyledAttributes.getBoolean(yt6.CollapsingToolbarLayout_extraMultilineHeightEnabled, false);
        typedArrayObtainStyledAttributes.recycle();
        setWillNotDraw(false);
        pt2 pt2Var = new pt2(15, this);
        WeakHashMap weakHashMap = q69.a;
        h69.m(this, pt2Var);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LayoutParams layoutParams2 = new LayoutParams(layoutParams);
        layoutParams2.a = 0;
        layoutParams2.b = 0.5f;
        return layoutParams2;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-1, -1);
        layoutParams.a = 0;
        layoutParams.b = 0.5f;
        return layoutParams;
    }
}
