package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import defpackage.af9;
import defpackage.ba4;
import defpackage.f69;
import defpackage.fu4;
import defpackage.ge9;
import defpackage.h69;
import defpackage.if9;
import defpackage.jc1;
import defpackage.kc1;
import defpackage.lf9;
import defpackage.lm5;
import defpackage.mm5;
import defpackage.no3;
import defpackage.ot4;
import defpackage.pr6;
import defpackage.q69;
import defpackage.rf0;
import defpackage.s5;
import defpackage.t5;
import defpackage.u5;
import defpackage.v5;
import defpackage.ve9;
import defpackage.we9;
import defpackage.xe9;
import defpackage.xp6;
import defpackage.y89;
import defpackage.ye9;
import defpackage.ze9;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
public class ActionBarOverlayLayout extends ViewGroup implements jc1, lm5, mm5 {
    public static final int[] C = {xp6.actionBarSize, R.attr.windowContentOverlay};
    public static final lf9 D;
    public static final Rect E;
    public final ba4 A;
    public final v5 B;
    public int a;
    public int b;
    public ContentFrameLayout c;
    public ActionBarContainer d;
    public kc1 e;
    public Drawable f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public final Rect m;
    public final Rect n;
    public final Rect o;
    public final Rect p;
    public lf9 q;
    public lf9 r;
    public lf9 s;
    public lf9 t;
    public u5 u;
    public OverScroller v;
    public ViewPropertyAnimator w;
    public final s5 x;
    public final t5 y;
    public final t5 z;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        af9 ze9Var = i >= 34 ? new ze9() : i >= 31 ? new ye9() : i >= 30 ? new xe9() : i >= 29 ? new we9() : new ve9();
        ze9Var.g(no3.c(0, 1, 0, 1));
        D = ze9Var.b();
        E = new Rect();
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public static boolean a(View view, Rect rect, boolean z) {
        boolean z2;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    public final boolean b() {
        ActionMenuView actionMenuView;
        m();
        Toolbar toolbar = ((m) this.e).a;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.mMenuView) != null && actionMenuView.s;
    }

    @Override // defpackage.lm5
    public final void c(int i, View view) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // defpackage.mm5
    public final void d(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        f(view, i, i2, i3, i4, i5);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f != null) {
            if (this.d.getVisibility() == 0) {
                translationY = (int) (this.d.getTranslationY() + this.d.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f.setBounds(0, translationY, getWidth(), this.f.getIntrinsicHeight() + translationY);
            this.f.draw(canvas);
        }
    }

    public final void e() {
        removeCallbacks(this.y);
        removeCallbacks(this.z);
        ViewPropertyAnimator viewPropertyAnimator = this.w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // defpackage.lm5
    public final void f(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // defpackage.lm5
    public final boolean g(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        ba4 ba4Var = this.A;
        return ba4Var.b | ba4Var.a;
    }

    public CharSequence getTitle() {
        m();
        return ((m) this.e).a.getTitle();
    }

    @Override // defpackage.lm5
    public final void h(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // defpackage.lm5
    public final void i(View view, int i, int i2, int[] iArr, int i3) {
    }

    public final void j(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(C);
        this.a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.v = new OverScroller(context);
    }

    public final void k(int i) {
        m();
        if (i == 2) {
            this.e.getClass();
        } else if (i == 5) {
            this.e.getClass();
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final boolean l() {
        b bVar;
        m();
        ActionMenuView actionMenuView = ((m) this.e).a.mMenuView;
        if (actionMenuView == null || (bVar = actionMenuView.t) == null) {
            return false;
        }
        return bVar.v != null || bVar.k();
    }

    public final void m() {
        kc1 wrapper;
        if (this.c == null) {
            this.c = (ContentFrameLayout) findViewById(pr6.action_bar_activity_content);
            this.d = (ActionBarContainer) findViewById(pr6.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(pr6.action_bar);
            if (callbackFindViewById instanceof kc1) {
                wrapper = (kc1) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.e = wrapper;
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        m();
        lf9 lf9VarH = lf9.h(this, windowInsets);
        boolean zA = a(this.d, new Rect(lf9VarH.b(), lf9VarH.d(), lf9VarH.c(), lf9VarH.a()), false);
        WeakHashMap weakHashMap = q69.a;
        Rect rect = this.m;
        h69.b(this, lf9VarH, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        if9 if9Var = lf9VarH.a;
        lf9 lf9VarN = if9Var.n(i, i2, i3, i4);
        this.q = lf9VarN;
        boolean z = true;
        if (!this.r.equals(lf9VarN)) {
            this.r = this.q;
            zA = true;
        }
        Rect rect2 = this.n;
        if (rect2.equals(rect)) {
            z = zA;
        } else {
            rect2.set(rect);
        }
        if (z) {
            requestLayout();
        }
        return if9Var.a().a.c().a.b().g();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        j(getContext());
        WeakHashMap weakHashMap = q69.a;
        f69.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.i || !z) {
            return false;
        }
        this.v.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.v.getFinalY() > this.d.getHeight()) {
            e();
            this.z.run();
        } else {
            e();
            this.y.run();
        }
        this.j = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.k + i2;
        this.k = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        ge9 ge9Var;
        y89 y89Var;
        this.A.a = i;
        this.k = getActionBarHideOffset();
        e();
        u5 u5Var = this.u;
        if (u5Var == null || (y89Var = (ge9Var = (ge9) u5Var).J) == null) {
            return;
        }
        y89Var.a();
        ge9Var.J = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.d.getVisibility() != 0) {
            return false;
        }
        return this.i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.i || this.j) {
            return;
        }
        if (this.k <= this.d.getHeight()) {
            e();
            postDelayed(this.y, 600L);
        } else {
            e();
            postDelayed(this.z, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        m();
        int i2 = this.l ^ i;
        this.l = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        u5 u5Var = this.u;
        if (u5Var != null) {
            ge9 ge9Var = (ge9) u5Var;
            ge9Var.E = !z2;
            if (z || !z2) {
                if (ge9Var.G) {
                    ge9Var.G = false;
                    ge9Var.v0(true);
                }
            } else if (!ge9Var.G) {
                ge9Var.G = true;
                ge9Var.v0(true);
            }
        }
        if ((i2 & 256) == 0 || this.u == null) {
            return;
        }
        WeakHashMap weakHashMap = q69.a;
        f69.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.b = i;
        u5 u5Var = this.u;
        if (u5Var != null) {
            ((ge9) u5Var).D = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        e();
        this.d.setTranslationY(-Math.max(0, Math.min(i, this.d.getHeight())));
    }

    public void setActionBarVisibilityCallback(u5 u5Var) {
        this.u = u5Var;
        if (getWindowToken() != null) {
            ((ge9) this.u).D = this.b;
            int i = this.l;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = q69.a;
                f69.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.h = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.i) {
            this.i = z;
            if (z) {
                return;
            }
            e();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        m();
        m mVar = (m) this.e;
        mVar.d = i != 0 ? rf0.v(mVar.a.getContext(), i) : null;
        mVar.e();
    }

    public void setLogo(int i) {
        m();
        m mVar = (m) this.e;
        mVar.e = i != 0 ? rf0.v(mVar.a.getContext(), i) : null;
        mVar.e();
    }

    @Override // defpackage.jc1
    public void setMenu(Menu menu, fu4 fu4Var) {
        m();
        m mVar = (m) this.e;
        Toolbar toolbar = mVar.a;
        if (mVar.m == null) {
            b bVar = new b(toolbar.getContext());
            mVar.m = bVar;
            bVar.i = pr6.action_menu_presenter;
        }
        b bVar2 = mVar.m;
        bVar2.e = fu4Var;
        toolbar.setMenu((ot4) menu, bVar2);
    }

    @Override // defpackage.jc1
    public void setMenuPrepared() {
        m();
        ((m) this.e).l = true;
    }

    public void setOverlayMode(boolean z) {
        this.g = z;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // defpackage.jc1
    public void setWindowCallback(Window.Callback callback) {
        m();
        ((m) this.e).k = callback;
    }

    @Override // defpackage.jc1
    public void setWindowTitle(CharSequence charSequence) {
        m();
        m mVar = (m) this.e;
        if (mVar.g) {
            return;
        }
        Toolbar toolbar = mVar.a;
        mVar.h = charSequence;
        if ((mVar.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (mVar.g) {
                q69.r(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 0;
        this.m = new Rect();
        this.n = new Rect();
        this.o = new Rect();
        this.p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        lf9 lf9Var = lf9.b;
        this.q = lf9Var;
        this.r = lf9Var;
        this.s = lf9Var;
        this.t = lf9Var;
        this.x = new s5(0, this);
        this.y = new t5(this, 0);
        this.z = new t5(this, 1);
        j(context);
        this.A = new ba4();
        v5 v5Var = new v5(context);
        v5Var.setWillNotDraw(true);
        this.B = v5Var;
        addView(v5Var);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        m();
        m mVar = (m) this.e;
        mVar.d = drawable;
        mVar.e();
    }
}
