package com.google.android.material.tabs;

import android.R;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.viewpager.widget.ViewPager;
import defpackage.ae8;
import defpackage.be8;
import defpackage.ce8;
import defpackage.ci6;
import defpackage.d50;
import defpackage.d77;
import defpackage.de8;
import defpackage.dg7;
import defpackage.di6;
import defpackage.ee8;
import defpackage.f89;
import defpackage.fk4;
import defpackage.ft6;
import defpackage.hl5;
import defpackage.is6;
import defpackage.ja1;
import defpackage.jr9;
import defpackage.kz1;
import defpackage.kz5;
import defpackage.lu6;
import defpackage.mk4;
import defpackage.mt6;
import defpackage.nd0;
import defpackage.o3;
import defpackage.o37;
import defpackage.oq6;
import defpackage.pt2;
import defpackage.q69;
import defpackage.r81;
import defpackage.rf0;
import defpackage.s3;
import defpackage.te;
import defpackage.u97;
import defpackage.ub1;
import defpackage.vj8;
import defpackage.vp6;
import defpackage.yh0;
import defpackage.yk;
import defpackage.yt6;
import defpackage.ze0;
import io.sentry.android.core.t0;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@f89
public class TabLayout extends HorizontalScrollView {
    public static final int x0 = mt6.Widget_Design_TabLayout;
    public static final di6 y0 = new di6(16);
    public int A;
    public final int B;
    public int C;
    public int D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public boolean I;
    public a J;
    public final TimeInterpolator K;
    public be8 L;
    public final ArrayList M;
    public nd0 N;
    public ValueAnimator O;
    public ViewPager P;
    public kz5 Q;
    public r81 R;
    public ee8 S;
    public ae8 T;
    public boolean U;
    public int V;
    public final ci6 W;
    public int a;
    public final ArrayList b;
    public b c;
    public final de8 d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public ColorStateList l;
    public ColorStateList m;
    public ColorStateList n;
    public Drawable o;
    public int p;
    public final PorterDuff.Mode q;
    public final float r;
    public final float s;
    public final float t;
    public final int u;
    public int v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    public final class TabView extends LinearLayout {
        public static final /* synthetic */ int l = 0;
        public b a;
        public TextView b;
        public ImageView c;
        public View d;
        public d50 e;
        public View f;
        public TextView g;
        public ImageView h;
        public Drawable i;
        public int j;

        public TabView(Context context) {
            hl5 hl5Var;
            super(context);
            this.j = 2;
            e(context);
            setPaddingRelative(TabLayout.this.e, TabLayout.this.f, TabLayout.this.g, TabLayout.this.h);
            setGravity(17);
            setOrientation(!TabLayout.this.E ? 1 : 0);
            setClickable(true);
            Context context2 = getContext();
            if (Build.VERSION.SDK_INT >= 24) {
                hl5Var = new hl5(4, jr9.p(context2));
            } else {
                hl5Var = new hl5(4, (Object) null);
            }
            q69.s(this, hl5Var);
        }

        private d50 getBadge() {
            return this.e;
        }

        private d50 getOrCreateBadge() {
            if (this.e == null) {
                this.e = new d50(getContext(), null);
            }
            b();
            d50 d50Var = this.e;
            if (d50Var != null) {
                return d50Var;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        public final void a() {
            if (this.e != null) {
                setClipChildren(true);
                setClipToPadding(true);
                ViewGroup viewGroup = (ViewGroup) getParent();
                if (viewGroup != null) {
                    viewGroup.setClipChildren(true);
                    viewGroup.setClipToPadding(true);
                }
                View view = this.d;
                if (view != null) {
                    d50 d50Var = this.e;
                    if (d50Var != null) {
                        if (d50Var.e() != null) {
                            d50Var.e().setForeground(null);
                        } else {
                            view.getOverlay().remove(d50Var);
                        }
                    }
                    this.d = null;
                }
            }
        }

        public final void b() {
            b bVar;
            if (this.e != null) {
                if (this.f != null) {
                    a();
                    return;
                }
                ImageView imageView = this.c;
                if (imageView != null && (bVar = this.a) != null && bVar.a != null) {
                    if (this.d == imageView) {
                        c(imageView);
                        return;
                    }
                    a();
                    ImageView imageView2 = this.c;
                    if (this.e == null || imageView2 == null) {
                        return;
                    }
                    setClipChildren(false);
                    setClipToPadding(false);
                    ViewGroup viewGroup = (ViewGroup) getParent();
                    if (viewGroup != null) {
                        viewGroup.setClipChildren(false);
                        viewGroup.setClipToPadding(false);
                    }
                    d50 d50Var = this.e;
                    Rect rect = new Rect();
                    imageView2.getDrawingRect(rect);
                    d50Var.setBounds(rect);
                    d50Var.j(imageView2, null);
                    if (d50Var.e() != null) {
                        d50Var.e().setForeground(d50Var);
                    } else {
                        imageView2.getOverlay().add(d50Var);
                    }
                    this.d = imageView2;
                    return;
                }
                TextView textView = this.b;
                if (textView == null || this.a == null) {
                    a();
                    return;
                }
                if (this.d == textView) {
                    c(textView);
                    return;
                }
                a();
                TextView textView2 = this.b;
                if (this.e == null || textView2 == null) {
                    return;
                }
                setClipChildren(false);
                setClipToPadding(false);
                ViewGroup viewGroup2 = (ViewGroup) getParent();
                if (viewGroup2 != null) {
                    viewGroup2.setClipChildren(false);
                    viewGroup2.setClipToPadding(false);
                }
                d50 d50Var2 = this.e;
                Rect rect2 = new Rect();
                textView2.getDrawingRect(rect2);
                d50Var2.setBounds(rect2);
                d50Var2.j(textView2, null);
                if (d50Var2.e() != null) {
                    d50Var2.e().setForeground(d50Var2);
                } else {
                    textView2.getOverlay().add(d50Var2);
                }
                this.d = textView2;
            }
        }

        public final void c(View view) {
            d50 d50Var = this.e;
            if (d50Var == null || view != this.d) {
                return;
            }
            Rect rect = new Rect();
            view.getDrawingRect(rect);
            d50Var.setBounds(rect);
            d50Var.j(view, null);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0020  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void d() {
            /*
                r3 = this;
                r3.f()
                com.google.android.material.tabs.b r0 = r3.a
                if (r0 == 0) goto L20
                com.google.android.material.tabs.TabLayout r1 = r0.f
                if (r1 == 0) goto L18
                int r1 = r1.getSelectedTabPosition()
                r2 = -1
                if (r1 == r2) goto L20
                int r0 = r0.d
                if (r1 != r0) goto L20
                r0 = 1
                goto L21
            L18:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Tab not attached to a TabLayout"
                r0.<init>(r1)
                throw r0
            L20:
                r0 = 0
            L21:
                r3.setSelected(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.TabView.d():void");
        }

        @Override // android.view.ViewGroup, android.view.View
        public final void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.i;
            if ((drawable == null || !drawable.isStateful()) ? false : this.i.setState(drawableState)) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        public final void e(Context context) {
            TabLayout tabLayout = TabLayout.this;
            int i = tabLayout.u;
            if (i != 0) {
                Drawable drawableV = rf0.v(context, i);
                this.i = drawableV;
                if (drawableV != null && drawableV.isStateful()) {
                    this.i.setState(getDrawableState());
                }
            } else {
                this.i = null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            Drawable rippleDrawable = gradientDrawable;
            if (tabLayout.n != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                ColorStateList colorStateListA = u97.a(tabLayout.n);
                boolean z = tabLayout.I;
                GradientDrawable gradientDrawable3 = gradientDrawable;
                if (z) {
                    gradientDrawable3 = null;
                }
                rippleDrawable = new RippleDrawable(colorStateListA, gradientDrawable3, z ? null : gradientDrawable2);
            }
            setBackground(rippleDrawable);
            tabLayout.invalidate();
        }

        public final void f() {
            int i;
            ViewParent parent;
            b bVar = this.a;
            View view = bVar != null ? bVar.e : null;
            if (view != null) {
                ViewParent parent2 = view.getParent();
                if (parent2 != this) {
                    if (parent2 != null) {
                        ((ViewGroup) parent2).removeView(view);
                    }
                    View view2 = this.f;
                    if (view2 != null && (parent = view2.getParent()) != null) {
                        ((ViewGroup) parent).removeView(this.f);
                    }
                    addView(view);
                }
                this.f = view;
                TextView textView = this.b;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.c;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.c.setImageDrawable(null);
                }
                TextView textView2 = (TextView) view.findViewById(R.id.text1);
                this.g = textView2;
                if (textView2 != null) {
                    this.j = textView2.getMaxLines();
                }
                this.h = (ImageView) view.findViewById(R.id.icon);
            } else {
                View view3 = this.f;
                if (view3 != null) {
                    removeView(view3);
                    this.f = null;
                }
                this.g = null;
                this.h = null;
            }
            if (this.f == null) {
                if (this.c == null) {
                    ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(is6.design_layout_tab_icon, (ViewGroup) this, false);
                    this.c = imageView2;
                    addView(imageView2, 0);
                }
                if (this.b == null) {
                    TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(is6.design_layout_tab_text, (ViewGroup) this, false);
                    this.b = textView3;
                    addView(textView3);
                    this.j = this.b.getMaxLines();
                }
                TextView textView4 = this.b;
                TabLayout tabLayout = TabLayout.this;
                textView4.setTextAppearance(tabLayout.i);
                if (!isSelected() || (i = tabLayout.k) == -1) {
                    this.b.setTextAppearance(tabLayout.j);
                } else {
                    this.b.setTextAppearance(i);
                }
                ColorStateList colorStateList = tabLayout.l;
                if (colorStateList != null) {
                    this.b.setTextColor(colorStateList);
                }
                g(this.b, this.c, true);
                b();
                ImageView imageView3 = this.c;
                if (imageView3 != null) {
                    imageView3.addOnLayoutChangeListener(new c(this, imageView3));
                }
                TextView textView5 = this.b;
                if (textView5 != null) {
                    textView5.addOnLayoutChangeListener(new c(this, textView5));
                }
            } else {
                TextView textView6 = this.g;
                if (textView6 != null || this.h != null) {
                    g(textView6, this.h, false);
                }
            }
            if (bVar == null || TextUtils.isEmpty(bVar.c)) {
                return;
            }
            setContentDescription(bVar.c);
        }

        public final void g(TextView textView, ImageView imageView, boolean z) {
            boolean z2;
            Drawable drawable;
            b bVar = this.a;
            Drawable drawableMutate = (bVar == null || (drawable = bVar.a) == null) ? null : drawable.mutate();
            TabLayout tabLayout = TabLayout.this;
            if (drawableMutate != null) {
                drawableMutate.setTintList(tabLayout.m);
                PorterDuff.Mode mode = tabLayout.q;
                if (mode != null) {
                    drawableMutate.setTintMode(mode);
                }
            }
            b bVar2 = this.a;
            CharSequence charSequence = bVar2 != null ? bVar2.b : null;
            if (imageView != null) {
                if (drawableMutate != null) {
                    imageView.setImageDrawable(drawableMutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean zIsEmpty = TextUtils.isEmpty(charSequence);
            if (textView != null) {
                if (zIsEmpty) {
                    z2 = false;
                } else {
                    this.a.getClass();
                    z2 = true;
                }
                textView.setText(!zIsEmpty ? charSequence : null);
                textView.setVisibility(z2 ? 0 : 8);
                if (!zIsEmpty) {
                    setVisibility(0);
                }
            } else {
                z2 = false;
            }
            if (z && imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int i = (z2 && imageView.getVisibility() == 0) ? (int) o37.i(getContext(), 8) : 0;
                if (tabLayout.E) {
                    if (i != marginLayoutParams.getMarginEnd()) {
                        marginLayoutParams.setMarginEnd(i);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (i != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = i;
                    marginLayoutParams.setMarginEnd(0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            b bVar3 = this.a;
            CharSequence charSequence2 = bVar3 != null ? bVar3.c : null;
            if (Build.VERSION.SDK_INT > 23) {
                if (zIsEmpty) {
                    charSequence = charSequence2;
                }
                d77.e(this, charSequence);
            }
        }

        public int getContentHeight() {
            View[] viewArr = {this.b, this.c, this.f};
            int iMax = 0;
            int iMin = 0;
            boolean z = false;
            for (int i = 0; i < 3; i++) {
                View view = viewArr[i];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z ? Math.min(iMin, view.getTop()) : view.getTop();
                    iMax = z ? Math.max(iMax, view.getBottom()) : view.getBottom();
                    z = true;
                }
            }
            return iMax - iMin;
        }

        public int getContentWidth() {
            View[] viewArr = {this.b, this.c, this.f};
            int iMax = 0;
            int iMin = 0;
            boolean z = false;
            for (int i = 0; i < 3; i++) {
                View view = viewArr[i];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z ? Math.min(iMin, view.getLeft()) : view.getLeft();
                    iMax = z ? Math.max(iMax, view.getRight()) : view.getRight();
                    z = true;
                }
            }
            return iMax - iMin;
        }

        public b getTab() {
            return this.a;
        }

        @Override // android.view.View
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            d50 d50Var = this.e;
            if (d50Var != null && d50Var.isVisible()) {
                accessibilityNodeInfo.setContentDescription(this.e.d());
            }
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) s3.a(0, 1, this.a.d, 1, false, isSelected()).a);
            if (isSelected()) {
                accessibilityNodeInfo.setClickable(false);
                accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) o3.g.a);
            }
            accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(ft6.item_view_role_description));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public final void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            TabLayout tabLayout = TabLayout.this;
            int tabMaxWidth = tabLayout.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i = View.MeasureSpec.makeMeasureSpec(tabLayout.v, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            if (this.b != null) {
                float f = tabLayout.r;
                if (isSelected() && tabLayout.k != -1) {
                    f = tabLayout.s;
                }
                int i3 = this.j;
                ImageView imageView = this.c;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.b;
                    if (textView != null && textView.getLineCount() > 1) {
                        f = tabLayout.t;
                    }
                } else {
                    i3 = 1;
                }
                float textSize = this.b.getTextSize();
                int lineCount = this.b.getLineCount();
                int maxLines = this.b.getMaxLines();
                if (f != textSize || (maxLines >= 0 && i3 != maxLines)) {
                    if (tabLayout.D == 1 && f > textSize && lineCount == 1) {
                        Layout layout = this.b.getLayout();
                        if (layout == null) {
                            return;
                        }
                        if ((f / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                            return;
                        }
                    }
                    this.b.setTextSize(0, f);
                    this.b.setMaxLines(i3);
                    super.onMeasure(i, i2);
                }
            }
        }

        @Override // android.view.View
        public final boolean performClick() {
            boolean zPerformClick = super.performClick();
            if (this.a == null) {
                return zPerformClick;
            }
            if (!zPerformClick) {
                playSoundEffect(0);
            }
            b bVar = this.a;
            TabLayout tabLayout = bVar.f;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.n(bVar, true);
            return true;
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            isSelected();
            super.setSelected(z);
            TextView textView = this.b;
            if (textView != null) {
                textView.setSelected(z);
            }
            ImageView imageView = this.c;
            if (imageView != null) {
                imageView.setSelected(z);
            }
            View view = this.f;
            if (view != null) {
                view.setSelected(z);
            }
        }

        public void setTab(b bVar) {
            if (bVar != this.a) {
                this.a = bVar;
                d();
            }
        }
    }

    public TabLayout(Context context) {
        this(context, null);
    }

    private int getDefaultHeight() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            b bVar = (b) arrayList.get(i);
            if (bVar != null && bVar.a != null && !TextUtils.isEmpty(bVar.b)) {
                return !this.E ? 72 : 48;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i = this.w;
        if (i != -1) {
            return i;
        }
        int i2 = this.D;
        if (i2 == 0 || i2 == 2) {
            return this.y;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    public static ColorStateList h(int i, int i2) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i2, i});
    }

    private void setSelectedTabView(int i) {
        de8 de8Var = this.d;
        int childCount = de8Var.getChildCount();
        if (i < childCount) {
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = de8Var.getChildAt(i2);
                if ((i2 != i || childAt.isSelected()) && (i2 == i || !childAt.isSelected())) {
                    childAt.setSelected(i2 == i);
                    childAt.setActivated(i2 == i);
                } else {
                    childAt.setSelected(i2 == i);
                    childAt.setActivated(i2 == i);
                    if (childAt instanceof TabView) {
                        ((TabView) childAt).f();
                    }
                }
                i2++;
            }
        }
    }

    public final void a(be8 be8Var) {
        ArrayList arrayList = this.M;
        if (arrayList.contains(be8Var)) {
            return;
        }
        arrayList.add(be8Var);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        c(view);
    }

    public final void b(b bVar, boolean z) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        if (bVar.f != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        bVar.d = size;
        arrayList.add(size, bVar);
        int size2 = arrayList.size();
        int i = -1;
        for (int i2 = size + 1; i2 < size2; i2++) {
            if (((b) arrayList.get(i2)).d == this.a) {
                i = i2;
            }
            ((b) arrayList.get(i2)).d = i2;
        }
        this.a = i;
        TabView tabView = bVar.g;
        tabView.setSelected(false);
        tabView.setActivated(false);
        int i3 = bVar.d;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (this.D == 1 && this.A == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        this.d.addView(tabView, i3, layoutParams);
        if (z) {
            TabLayout tabLayout = bVar.f;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.n(bVar, true);
        }
    }

    public final void c(View view) {
        if (!(view instanceof TabItem)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        TabItem tabItem = (TabItem) view;
        b bVarK = k();
        CharSequence charSequence = tabItem.a;
        if (charSequence != null) {
            bVarK.b(charSequence);
        }
        Drawable drawable = tabItem.b;
        if (drawable != null) {
            bVarK.a(drawable);
        }
        int i = tabItem.c;
        if (i != 0) {
            bVarK.e = LayoutInflater.from(bVarK.g.getContext()).inflate(i, (ViewGroup) bVarK.g, false);
            TabView tabView = bVarK.g;
            if (tabView != null) {
                tabView.d();
            }
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            bVarK.c = tabItem.getContentDescription();
            TabView tabView2 = bVarK.g;
            if (tabView2 != null) {
                tabView2.d();
            }
        }
        b(bVarK, this.b.isEmpty());
    }

    public final void d(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null && isLaidOut()) {
            de8 de8Var = this.d;
            int childCount = de8Var.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (de8Var.getChildAt(i2).getWidth() > 0) {
                }
            }
            int scrollX = getScrollX();
            int iG = g(i, 0.0f);
            if (scrollX != iG) {
                i();
                this.O.setIntValues(scrollX, iG);
                this.O.start();
            }
            ValueAnimator valueAnimator = de8Var.a;
            if (valueAnimator != null && valueAnimator.isRunning() && de8Var.b.a != i) {
                de8Var.a.cancel();
            }
            de8Var.d(i, this.B, true);
            return;
        }
        setScrollPosition(i, 0.0f, true);
    }

    public final void f() {
        int i = this.D;
        int iMax = (i == 0 || i == 2) ? Math.max(0, this.z - this.e) : 0;
        de8 de8Var = this.d;
        de8Var.setPaddingRelative(iMax, 0, 0, 0);
        int i2 = this.D;
        if (i2 == 0) {
            int i3 = this.A;
            if (i3 == 0) {
                t0.m("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
            } else if (i3 == 1) {
                de8Var.setGravity(1);
            } else if (i3 == 2) {
            }
            de8Var.setGravity(8388611);
        } else if (i2 == 1 || i2 == 2) {
            if (this.A == 2) {
                t0.m("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            de8Var.setGravity(1);
        }
        r(true);
    }

    public final int g(int i, float f) {
        de8 de8Var;
        View childAt;
        int i2 = this.D;
        if ((i2 != 0 && i2 != 2) || (childAt = (de8Var = this.d).getChildAt(i)) == null) {
            return 0;
        }
        int i3 = i + 1;
        View childAt2 = i3 < de8Var.getChildCount() ? de8Var.getChildAt(i3) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i4 = (int) ((width + width2) * 0.5f * f);
        return getLayoutDirection() == 0 ? left + i4 : left - i4;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        b bVar = this.c;
        if (bVar != null) {
            return bVar.d;
        }
        return -1;
    }

    public int getTabCount() {
        return this.b.size();
    }

    public int getTabGravity() {
        return this.A;
    }

    public ColorStateList getTabIconTint() {
        return this.m;
    }

    public int getTabIndicatorAnimationMode() {
        return this.H;
    }

    public int getTabIndicatorGravity() {
        return this.C;
    }

    public int getTabMaxWidth() {
        return this.v;
    }

    public int getTabMode() {
        return this.D;
    }

    public ColorStateList getTabRippleColor() {
        return this.n;
    }

    public Drawable getTabSelectedIndicator() {
        return this.o;
    }

    public ColorStateList getTabTextColors() {
        return this.l;
    }

    public final void i() {
        if (this.O == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.O = valueAnimator;
            valueAnimator.setInterpolator(this.K);
            this.O.setDuration(this.B);
            this.O.addUpdateListener(new ze0(5, this));
        }
    }

    public final b j(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return (b) this.b.get(i);
    }

    public final b k() {
        b bVar = (b) y0.e();
        if (bVar == null) {
            bVar = new b();
            bVar.d = -1;
        }
        bVar.f = this;
        ci6 ci6Var = this.W;
        TabView tabView = ci6Var != null ? (TabView) ci6Var.e() : null;
        if (tabView == null) {
            tabView = new TabView(getContext());
        }
        tabView.setTab(bVar);
        tabView.setFocusable(true);
        tabView.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(bVar.c)) {
            tabView.setContentDescription(bVar.b);
        } else {
            tabView.setContentDescription(bVar.c);
        }
        bVar.g = tabView;
        return bVar;
    }

    public final void l() {
        int currentItem;
        m();
        kz5 kz5Var = this.Q;
        if (kz5Var != null) {
            int size = ((dg7) kz5Var).h.size();
            for (int i = 0; i < size; i++) {
                b bVarK = k();
                this.Q.getClass();
                bVarK.b(null);
                b(bVarK, false);
            }
            ViewPager viewPager = this.P;
            if (viewPager == null || size <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            n(j(currentItem), true);
        }
    }

    public final void m() {
        de8 de8Var = this.d;
        int childCount = de8Var.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            TabView tabView = (TabView) de8Var.getChildAt(childCount);
            de8Var.removeViewAt(childCount);
            if (tabView != null) {
                tabView.setTab(null);
                tabView.setSelected(false);
                this.W.d(tabView);
            }
            requestLayout();
        }
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            it.remove();
            bVar.f = null;
            bVar.g = null;
            bVar.a = null;
            bVar.b = null;
            bVar.c = null;
            bVar.d = -1;
            bVar.e = null;
            y0.d(bVar);
        }
        this.c = null;
    }

    public final void n(b bVar, boolean z) {
        b bVar2 = this.c;
        ArrayList arrayList = this.M;
        if (bVar2 == bVar) {
            if (bVar2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((be8) arrayList.get(size)).a();
                }
                d(bVar.d);
                return;
            }
            return;
        }
        int i = bVar != null ? bVar.d : -1;
        if (z) {
            if ((bVar2 == null || bVar2.d == -1) && i != -1) {
                setScrollPosition(i, 0.0f, true);
            } else {
                d(i);
            }
            if (i != -1) {
                setSelectedTabView(i);
            }
        }
        this.c = bVar;
        if (bVar2 != null && bVar2.f != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((be8) arrayList.get(size2)).getClass();
            }
        }
        if (bVar != null) {
            for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                ((be8) arrayList.get(size3)).b(bVar);
            }
        }
    }

    public final void o(kz5 kz5Var, boolean z) {
        r81 r81Var;
        kz5 kz5Var2 = this.Q;
        if (kz5Var2 != null && (r81Var = this.R) != null) {
            kz5Var2.a.unregisterObserver(r81Var);
        }
        this.Q = kz5Var;
        if (z && kz5Var != null) {
            if (this.R == null) {
                this.R = new r81(2, this);
            }
            kz5Var.a.registerObserver(this.R);
        }
        l();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ub1.L(this);
        if (this.P == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                q((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.U) {
            setupWithViewPager(null);
            this.U = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        TabView tabView;
        Drawable drawable;
        int i = 0;
        while (true) {
            de8 de8Var = this.d;
            if (i >= de8Var.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = de8Var.getChildAt(i);
            if ((childAt instanceof TabView) && (drawable = (tabView = (TabView) childAt).i) != null) {
                drawable.setBounds(tabView.getLeft(), tabView.getTop(), tabView.getRight(), tabView.getBottom());
                tabView.i.draw(canvas);
            }
            i++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) pt2.v(1, getTabCount(), 1).b);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (getTabMode() == 0 || getTabMode() == 2) && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = defpackage.o37.i(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 0
            r4 = 1073741824(0x40000000, float:2.0)
            r5 = 1
            if (r1 == r2) goto L2e
            if (r1 == 0) goto L1f
            goto L41
        L1f:
            int r8 = r6.getPaddingTop()
            int r8 = r8 + r0
            int r0 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            goto L41
        L2e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L41
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L41
            android.view.View r1 = r6.getChildAt(r3)
            r1.setMinimumHeight(r0)
        L41:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L5f
            int r1 = r6.x
            if (r1 <= 0) goto L50
            goto L5d
        L50:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = defpackage.o37.i(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L5d:
            r6.v = r1
        L5f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto Laa
            android.view.View r7 = r6.getChildAt(r3)
            int r0 = r6.D
            if (r0 == 0) goto L82
            if (r0 == r5) goto L76
            r1 = 2
            if (r0 == r1) goto L82
            goto Laa
        L76:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L81
            goto L8c
        L81:
            return
        L82:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto Laa
        L8c:
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r1 = r1 + r0
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            int r0 = r0.height
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r8, r1, r0)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r4)
            r7.measure(r0, r8)
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || getTabMode() == 0 || getTabMode() == 2) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void p(float f, int i, boolean z, boolean z2, boolean z3) {
        float f2 = i + f;
        int iRound = Math.round(f2);
        if (iRound >= 0) {
            de8 de8Var = this.d;
            if (iRound >= de8Var.getChildCount()) {
                return;
            }
            if (z2) {
                de8Var.b.a = Math.round(f2);
                ValueAnimator valueAnimator = de8Var.a;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    de8Var.a.cancel();
                }
                de8Var.c(de8Var.getChildAt(i), de8Var.getChildAt(i + 1), f);
            }
            ValueAnimator valueAnimator2 = this.O;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.O.cancel();
            }
            int iG = g(i, f);
            int scrollX = getScrollX();
            boolean z4 = (i < getSelectedTabPosition() && iG >= scrollX) || (i > getSelectedTabPosition() && iG <= scrollX) || i == getSelectedTabPosition();
            if (getLayoutDirection() == 1) {
                z4 = (i < getSelectedTabPosition() && iG <= scrollX) || (i > getSelectedTabPosition() && iG >= scrollX) || i == getSelectedTabPosition();
            }
            if (z4 || this.V == 1 || z3) {
                if (i < 0) {
                    iG = 0;
                }
                scrollTo(iG, 0);
            }
            if (z) {
                setSelectedTabView(iRound);
            }
        }
    }

    public final void q(ViewPager viewPager, boolean z, boolean z2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ViewPager viewPager2 = this.P;
        if (viewPager2 != null) {
            ee8 ee8Var = this.S;
            if (ee8Var != null && (arrayList2 = viewPager2.R) != null) {
                arrayList2.remove(ee8Var);
            }
            ae8 ae8Var = this.T;
            if (ae8Var != null && (arrayList = this.P.U) != null) {
                arrayList.remove(ae8Var);
            }
        }
        nd0 nd0Var = this.N;
        if (nd0Var != null) {
            this.M.remove(nd0Var);
            this.N = null;
        }
        if (viewPager != null) {
            this.P = viewPager;
            if (this.S == null) {
                this.S = new ee8(this);
            }
            ee8 ee8Var2 = this.S;
            ee8Var2.c = 0;
            ee8Var2.b = 0;
            viewPager.b(ee8Var2);
            nd0 nd0Var2 = new nd0(4, viewPager);
            this.N = nd0Var2;
            a(nd0Var2);
            kz5 adapter = viewPager.getAdapter();
            if (adapter != null) {
                o(adapter, z);
            }
            if (this.T == null) {
                this.T = new ae8(this);
            }
            ae8 ae8Var2 = this.T;
            ae8Var2.a = z;
            if (viewPager.U == null) {
                viewPager.U = new ArrayList();
            }
            viewPager.U.add(ae8Var2);
            setScrollPosition(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.P = null;
            o(null, false);
        }
        this.U = z2;
    }

    public final void r(boolean z) {
        int i = 0;
        while (true) {
            de8 de8Var = this.d;
            if (i >= de8Var.getChildCount()) {
                return;
            }
            View childAt = de8Var.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.D == 1 && this.A == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            if (z) {
                childAt.requestLayout();
            }
            i++;
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        ub1.J(this, f);
    }

    public void setInlineLabel(boolean z) {
        if (this.E == z) {
            return;
        }
        this.E = z;
        int i = 0;
        while (true) {
            de8 de8Var = this.d;
            if (i >= de8Var.getChildCount()) {
                f();
                return;
            }
            View childAt = de8Var.getChildAt(i);
            if (childAt instanceof TabView) {
                TabView tabView = (TabView) childAt;
                tabView.setOrientation(!TabLayout.this.E ? 1 : 0);
                TextView textView = tabView.g;
                if (textView == null && tabView.h == null) {
                    tabView.g(tabView.b, tabView.c, true);
                } else {
                    tabView.g(textView, tabView.h, false);
                }
            }
            i++;
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(ce8 ce8Var) {
        setOnTabSelectedListener((be8) ce8Var);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        i();
        this.O.addListener(animatorListener);
    }

    public void setScrollPosition(int i, float f, boolean z) {
        setScrollPosition(i, f, z, true);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable drawableMutate = drawable.mutate();
        this.o = drawableMutate;
        int i = this.p;
        if (i != 0) {
            drawableMutate.setTint(i);
        } else {
            drawableMutate.setTintList(null);
        }
        int intrinsicHeight = this.G;
        if (intrinsicHeight == -1) {
            intrinsicHeight = this.o.getIntrinsicHeight();
        }
        this.d.b(intrinsicHeight);
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.p = i;
        Drawable drawable = this.o;
        if (i != 0) {
            drawable.setTint(i);
        } else {
            drawable.setTintList(null);
        }
        r(false);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.C != i) {
            this.C = i;
            this.d.postInvalidateOnAnimation();
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.G = i;
        this.d.b(i);
    }

    public void setTabGravity(int i) {
        if (this.A != i) {
            this.A = i;
            f();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.m != colorStateList) {
            this.m = colorStateList;
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                TabView tabView = ((b) arrayList.get(i)).g;
                if (tabView != null) {
                    tabView.d();
                }
            }
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(ContextCompat.getColorStateList(getContext(), i));
    }

    public void setTabIndicatorAnimationMode(int i) {
        this.H = i;
        if (i == 0) {
            this.J = new a();
            return;
        }
        if (i == 1) {
            this.J = new kz1(0);
        } else {
            if (i == 2) {
                this.J = new kz1(1);
                return;
            }
            throw new IllegalArgumentException(i + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z) {
        this.F = z;
        int i = de8.c;
        de8 de8Var = this.d;
        de8Var.a(de8Var.b.getSelectedTabPosition());
        de8Var.postInvalidateOnAnimation();
    }

    public void setTabMode(int i) {
        if (i != this.D) {
            this.D = i;
            f();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.n == colorStateList) {
            return;
        }
        this.n = colorStateList;
        int i = 0;
        while (true) {
            de8 de8Var = this.d;
            if (i >= de8Var.getChildCount()) {
                return;
            }
            View childAt = de8Var.getChildAt(i);
            if (childAt instanceof TabView) {
                Context context = getContext();
                int i2 = TabView.l;
                ((TabView) childAt).e(context);
            }
            i++;
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(ContextCompat.getColorStateList(getContext(), i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                TabView tabView = ((b) arrayList.get(i)).g;
                if (tabView != null) {
                    tabView.d();
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(kz5 kz5Var) {
        o(kz5Var, false);
    }

    public void setUnboundedRipple(boolean z) {
        if (this.I == z) {
            return;
        }
        this.I = z;
        int i = 0;
        while (true) {
            de8 de8Var = this.d;
            if (i >= de8Var.getChildCount()) {
                return;
            }
            View childAt = de8Var.getChildAt(i);
            if (childAt instanceof TabView) {
                Context context = getContext();
                int i2 = TabView.l;
                ((TabView) childAt).e(context);
            }
            i++;
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(ViewPager viewPager) {
        setupWithViewPager(viewPager, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    public TabLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, vp6.tabStyle);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        c(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(be8 be8Var) {
        be8 be8Var2 = this.L;
        if (be8Var2 != null) {
            this.M.remove(be8Var2);
        }
        this.L = be8Var;
        if (be8Var != null) {
            a(be8Var);
        }
    }

    public void setScrollPosition(int i, float f, boolean z, boolean z2) {
        p(f, i, z, z2, true);
    }

    public void setupWithViewPager(ViewPager viewPager, boolean z) {
        q(viewPager, z, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TabLayout(Context context, AttributeSet attributeSet, int i) {
        int i2 = x0;
        super(mk4.a(context, attributeSet, i, i2), attributeSet, i);
        this.a = -1;
        this.b = new ArrayList();
        this.k = -1;
        this.p = 0;
        this.v = Integer.MAX_VALUE;
        this.G = -1;
        this.M = new ArrayList();
        this.W = new ci6(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        de8 de8Var = new de8(this, context2);
        this.d = de8Var;
        super.addView(de8Var, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayD = vj8.d(context2, attributeSet, yt6.TabLayout, i, i2, yt6.TabLayout_tabTextAppearance);
        ColorStateList colorStateListT = te.t(getBackground());
        if (colorStateListT != null) {
            fk4 fk4Var = new fk4();
            fk4Var.s(colorStateListT);
            fk4Var.o(context2);
            fk4Var.r(getElevation());
            setBackground(fk4Var);
        }
        setSelectedTabIndicator(ja1.v(context2, typedArrayD, yt6.TabLayout_tabIndicator));
        setSelectedTabIndicatorColor(typedArrayD.getColor(yt6.TabLayout_tabIndicatorColor, 0));
        de8Var.b(typedArrayD.getDimensionPixelSize(yt6.TabLayout_tabIndicatorHeight, -1));
        setSelectedTabIndicatorGravity(typedArrayD.getInt(yt6.TabLayout_tabIndicatorGravity, 0));
        setTabIndicatorAnimationMode(typedArrayD.getInt(yt6.TabLayout_tabIndicatorAnimationMode, 0));
        setTabIndicatorFullWidth(typedArrayD.getBoolean(yt6.TabLayout_tabIndicatorFullWidth, true));
        int dimensionPixelSize = typedArrayD.getDimensionPixelSize(yt6.TabLayout_tabPadding, 0);
        this.h = dimensionPixelSize;
        this.g = dimensionPixelSize;
        this.f = dimensionPixelSize;
        this.e = dimensionPixelSize;
        this.e = typedArrayD.getDimensionPixelSize(yt6.TabLayout_tabPaddingStart, dimensionPixelSize);
        this.f = typedArrayD.getDimensionPixelSize(yt6.TabLayout_tabPaddingTop, dimensionPixelSize);
        this.g = typedArrayD.getDimensionPixelSize(yt6.TabLayout_tabPaddingEnd, dimensionPixelSize);
        this.h = typedArrayD.getDimensionPixelSize(yt6.TabLayout_tabPaddingBottom, dimensionPixelSize);
        if (yh0.H(context2, vp6.isMaterial3Theme, false)) {
            this.i = vp6.textAppearanceTitleSmall;
        } else {
            this.i = vp6.textAppearanceButton;
        }
        int resourceId = typedArrayD.getResourceId(yt6.TabLayout_tabTextAppearance, mt6.TextAppearance_Design_Tab);
        this.j = resourceId;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, lu6.TextAppearance);
        try {
            this.r = typedArrayObtainStyledAttributes.getDimensionPixelSize(lu6.TextAppearance_android_textSize, 0);
            this.l = ja1.r(context2, typedArrayObtainStyledAttributes, lu6.TextAppearance_android_textColor);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArrayD.hasValue(yt6.TabLayout_tabSelectedTextAppearance)) {
                this.k = typedArrayD.getResourceId(yt6.TabLayout_tabSelectedTextAppearance, resourceId);
            }
            int i3 = this.k;
            if (i3 != -1) {
                typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(i3, lu6.TextAppearance);
                try {
                    this.s = typedArrayObtainStyledAttributes.getDimensionPixelSize(lu6.TextAppearance_android_textSize, (int) r3);
                    ColorStateList colorStateListR = ja1.r(context2, typedArrayObtainStyledAttributes, lu6.TextAppearance_android_textColor);
                    if (colorStateListR != null) {
                        this.l = h(this.l.getDefaultColor(), colorStateListR.getColorForState(new int[]{R.attr.state_selected}, colorStateListR.getDefaultColor()));
                    }
                } finally {
                }
            }
            if (typedArrayD.hasValue(yt6.TabLayout_tabTextColor)) {
                this.l = ja1.r(context2, typedArrayD, yt6.TabLayout_tabTextColor);
            }
            if (typedArrayD.hasValue(yt6.TabLayout_tabSelectedTextColor)) {
                this.l = h(this.l.getDefaultColor(), typedArrayD.getColor(yt6.TabLayout_tabSelectedTextColor, 0));
            }
            this.m = ja1.r(context2, typedArrayD, yt6.TabLayout_tabIconTint);
            this.q = o37.t(typedArrayD.getInt(yt6.TabLayout_tabIconTintMode, -1), null);
            this.n = ja1.r(context2, typedArrayD, yt6.TabLayout_tabRippleColor);
            this.B = typedArrayD.getInt(yt6.TabLayout_tabIndicatorAnimationDuration, 300);
            this.K = ub1.H(context2, vp6.motionEasingEmphasizedInterpolator, yk.b);
            this.w = typedArrayD.getDimensionPixelSize(yt6.TabLayout_tabMinWidth, -1);
            this.x = typedArrayD.getDimensionPixelSize(yt6.TabLayout_tabMaxWidth, -1);
            this.u = typedArrayD.getResourceId(yt6.TabLayout_tabBackground, 0);
            this.z = typedArrayD.getDimensionPixelSize(yt6.TabLayout_tabContentStart, 0);
            this.D = typedArrayD.getInt(yt6.TabLayout_tabMode, 1);
            this.A = typedArrayD.getInt(yt6.TabLayout_tabGravity, 0);
            this.E = typedArrayD.getBoolean(yt6.TabLayout_tabInlineLabel, false);
            this.I = typedArrayD.getBoolean(yt6.TabLayout_tabUnboundedRipple, false);
            typedArrayD.recycle();
            Resources resources = getResources();
            this.t = resources.getDimensionPixelSize(oq6.design_tab_text_size_2line);
            this.y = resources.getDimensionPixelSize(oq6.design_tab_scrollable_min_width);
            f();
        } finally {
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        c(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c(view);
    }

    public void setTabTextColors(int i, int i2) {
        setTabTextColors(h(i, i2));
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(rf0.v(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
