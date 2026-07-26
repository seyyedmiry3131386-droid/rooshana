package com.google.android.material.navigation;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.internal.NavigationMenuView;
import com.google.android.material.internal.ScrimInsetsFrameLayout;
import defpackage.ac8;
import defpackage.as7;
import defpackage.bl5;
import defpackage.ct7;
import defpackage.f40;
import defpackage.fk4;
import defpackage.gl5;
import defpackage.i;
import defpackage.il5;
import defpackage.jk4;
import defpackage.jw1;
import defpackage.kw1;
import defpackage.lf9;
import defpackage.lj4;
import defpackage.mj4;
import defpackage.mt6;
import defpackage.pa2;
import defpackage.q69;
import defpackage.qj;
import defpackage.qk5;
import defpackage.sk6;
import defpackage.ub1;
import defpackage.v6;
import defpackage.vp6;
import defpackage.vt4;
import defpackage.xp6;
import defpackage.yk;
import defpackage.yr7;
import defpackage.yt6;
import io.sentry.android.core.t0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class NavigationView extends ScrimInsetsFrameLayout implements lj4 {
    public final qk5 h;
    public final bl5 i;
    public final int j;
    public final int[] k;
    public ac8 l;
    public final v6 m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public int r;
    public final boolean s;
    public final int t;
    public final ct7 u;
    public final jk4 v;
    public final pa2 w;
    public final gl5 x;
    public static final int[] y = {R.attr.state_checked};
    public static final int[] z = {-16842910};
    public static final int A = mt6.Widget_Design_NavigationView;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new d();
        public Bundle c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.c);
        }
    }

    public NavigationView(Context context) {
        this(context, null);
    }

    private MenuInflater getMenuInflater() {
        if (this.l == null) {
            this.l = new ac8(getContext());
        }
        return this.l;
    }

    @Override // defpackage.lj4
    public final void a() {
        Pair pairI = i();
        DrawerLayout drawerLayout = (DrawerLayout) pairI.first;
        jk4 jk4Var = this.v;
        f40 f40Var = jk4Var.f;
        jk4Var.f = null;
        if (f40Var == null || Build.VERSION.SDK_INT < 34) {
            drawerLayout.b(this, true);
            return;
        }
        int i = ((DrawerLayout.LayoutParams) pairI.second).a;
        int i2 = kw1.a;
        jk4Var.c(f40Var, i, new jw1(drawerLayout, this, 0), new qj(7, drawerLayout));
    }

    @Override // defpackage.lj4
    public final void b(f40 f40Var) {
        float f = f40Var.c;
        int i = ((DrawerLayout.LayoutParams) i().second).a;
        jk4 jk4Var = this.v;
        if (jk4Var.f == null) {
            t0.m("MaterialBackHelper", "Must call startBackProgress() before updateBackProgress()");
        }
        f40 f40Var2 = jk4Var.f;
        jk4Var.f = f40Var;
        if (f40Var2 != null) {
            jk4Var.d(f, i, f40Var.d == 0);
        }
        if (this.s) {
            this.r = yk.c(jk4Var.a.getInterpolation(f), 0, this.t);
            h(getWidth(), getHeight());
        }
    }

    @Override // defpackage.lj4
    public final void c(f40 f40Var) {
        i();
        this.v.f = f40Var;
    }

    @Override // defpackage.lj4
    public final void d() {
        i();
        this.v.b();
        if (!this.s || this.r == 0) {
            return;
        }
        this.r = 0;
        h(getWidth(), getHeight());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ct7 ct7Var = this.u;
        Path path = ct7Var.e;
        if (!ct7Var.b() || path.isEmpty()) {
            super.dispatchDraw(canvas);
            return;
        }
        canvas.save();
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    public final void e(lf9 lf9Var) {
        bl5 bl5Var = this.i;
        bl5Var.getClass();
        int iD = lf9Var.d();
        if (bl5Var.z != iD) {
            bl5Var.z = iD;
            int i = (bl5Var.b.getChildCount() <= 0 && bl5Var.x) ? bl5Var.z : 0;
            NavigationMenuView navigationMenuView = bl5Var.a;
            navigationMenuView.setPadding(0, i, 0, navigationMenuView.getPaddingBottom());
        }
        NavigationMenuView navigationMenuView2 = bl5Var.a;
        navigationMenuView2.setPadding(0, navigationMenuView2.getPaddingTop(), 0, lf9Var.a());
        q69.c(bl5Var.b, lf9Var);
    }

    public final ColorStateList f(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateList = ContextCompat.getColorStateList(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(xp6.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = colorStateList.getDefaultColor();
        int[] iArr = z;
        return new ColorStateList(new int[][]{iArr, y, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    public final InsetDrawable g(sk6 sk6Var, ColorStateList colorStateList) {
        int i = yt6.NavigationView_itemShapeAppearance;
        TypedArray typedArray = (TypedArray) sk6Var.c;
        fk4 fk4Var = new fk4(as7.a(getContext(), typedArray.getResourceId(i, 0), typedArray.getResourceId(yt6.NavigationView_itemShapeAppearanceOverlay, 0)).a());
        fk4Var.s(colorStateList);
        return new InsetDrawable((Drawable) fk4Var, typedArray.getDimensionPixelSize(yt6.NavigationView_itemShapeInsetStart, 0), typedArray.getDimensionPixelSize(yt6.NavigationView_itemShapeInsetTop, 0), typedArray.getDimensionPixelSize(yt6.NavigationView_itemShapeInsetEnd, 0), typedArray.getDimensionPixelSize(yt6.NavigationView_itemShapeInsetBottom, 0));
    }

    public jk4 getBackHelper() {
        return this.v;
    }

    public MenuItem getCheckedItem() {
        return this.i.e.e;
    }

    public int getDividerInsetEnd() {
        return this.i.t;
    }

    public int getDividerInsetStart() {
        return this.i.s;
    }

    public int getHeaderCount() {
        return this.i.b.getChildCount();
    }

    public Drawable getItemBackground() {
        return this.i.m;
    }

    public int getItemHorizontalPadding() {
        return this.i.o;
    }

    public int getItemIconPadding() {
        return this.i.q;
    }

    public ColorStateList getItemIconTintList() {
        return this.i.l;
    }

    public int getItemMaxLines() {
        return this.i.y;
    }

    public ColorStateList getItemTextColor() {
        return this.i.k;
    }

    public int getItemVerticalPadding() {
        return this.i.p;
    }

    public Menu getMenu() {
        return this.h;
    }

    public int getSubheaderInsetEnd() {
        return this.i.v;
    }

    public int getSubheaderInsetStart() {
        return this.i.u;
    }

    public final void h(int i, int i2) {
        if ((getParent() instanceof DrawerLayout) && (getLayoutParams() instanceof DrawerLayout.LayoutParams)) {
            if ((this.r > 0 || this.s) && (getBackground() instanceof fk4)) {
                boolean z2 = Gravity.getAbsoluteGravity(((DrawerLayout.LayoutParams) getLayoutParams()).a, getLayoutDirection()) == 3;
                fk4 fk4Var = (fk4) getBackground();
                yr7 yr7VarH = fk4Var.b.a.h();
                yr7VarH.b(this.r);
                if (z2) {
                    yr7VarH.e = new i(0.0f);
                    yr7VarH.h = new i(0.0f);
                } else {
                    yr7VarH.f = new i(0.0f);
                    yr7VarH.g = new i(0.0f);
                }
                as7 as7VarA = yr7VarH.a();
                fk4Var.setShapeAppearanceModel(as7VarA);
                ct7 ct7Var = this.u;
                ct7Var.c = as7VarA;
                ct7Var.c();
                ct7Var.a(this);
                ct7Var.d = new RectF(0.0f, 0.0f, i, i2);
                ct7Var.c();
                ct7Var.a(this);
                ct7Var.b = true;
                ct7Var.a(this);
            }
        }
    }

    public final Pair i() {
        ViewParent parent = getParent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((parent instanceof DrawerLayout) && (layoutParams instanceof DrawerLayout.LayoutParams)) {
            return new Pair((DrawerLayout) parent, (DrawerLayout.LayoutParams) layoutParams);
        }
        throw new IllegalStateException("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        ArrayList arrayList;
        super.onAttachedToWindow();
        ub1.L(this);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            pa2 pa2Var = this.w;
            if (((mj4) pa2Var.c) != null) {
                DrawerLayout drawerLayout = (DrawerLayout) parent;
                gl5 gl5Var = this.x;
                if (gl5Var != null && (arrayList = drawerLayout.t) != null) {
                    arrayList.remove(gl5Var);
                }
                if (gl5Var != null) {
                    if (drawerLayout.t == null) {
                        drawerLayout.t = new ArrayList();
                    }
                    drawerLayout.t.add(gl5Var);
                }
                if (DrawerLayout.j(this)) {
                    pa2Var.E(true);
                }
            }
        }
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ArrayList arrayList;
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.m);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            DrawerLayout drawerLayout = (DrawerLayout) parent;
            gl5 gl5Var = this.x;
            if (gl5Var != null && (arrayList = drawerLayout.t) != null) {
                arrayList.remove(gl5Var);
            }
        }
        this.w.H();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int i3 = this.j;
        if (mode == Integer.MIN_VALUE) {
            i = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), i3), 1073741824);
        } else if (mode == 0) {
            i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a);
        this.h.t(savedState.c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.c = bundle;
        this.h.v(bundle);
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        h(i, i2);
    }

    public void setBottomInsetScrimEnabled(boolean z2) {
        this.o = z2;
    }

    public void setCheckedItem(int i) {
        MenuItem menuItemFindItem = this.h.findItem(i);
        if (menuItemFindItem != null) {
            this.i.e.y((vt4) menuItemFindItem);
        }
    }

    public void setDividerInsetEnd(int i) {
        bl5 bl5Var = this.i;
        bl5Var.t = i;
        bl5Var.a();
    }

    public void setDividerInsetStart(int i) {
        bl5 bl5Var = this.i;
        bl5Var.s = i;
        bl5Var.a();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        ub1.J(this, f);
    }

    public void setEndInsetScrimEnabled(boolean z2) {
        this.q = z2;
    }

    public void setForceCompatClippingEnabled(boolean z2) {
        ct7 ct7Var = this.u;
        if (z2 != ct7Var.a) {
            ct7Var.a = z2;
            ct7Var.a(this);
        }
    }

    public void setItemBackground(Drawable drawable) {
        bl5 bl5Var = this.i;
        bl5Var.m = drawable;
        bl5Var.k();
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(getContext().getDrawable(i));
    }

    public void setItemHorizontalPadding(int i) {
        bl5 bl5Var = this.i;
        bl5Var.o = i;
        bl5Var.k();
    }

    public void setItemHorizontalPaddingResource(int i) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i);
        bl5 bl5Var = this.i;
        bl5Var.o = dimensionPixelSize;
        bl5Var.k();
    }

    public void setItemIconPadding(int i) {
        bl5 bl5Var = this.i;
        bl5Var.q = i;
        bl5Var.k();
    }

    public void setItemIconPaddingResource(int i) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i);
        bl5 bl5Var = this.i;
        bl5Var.q = dimensionPixelSize;
        bl5Var.k();
    }

    public void setItemIconSize(int i) {
        bl5 bl5Var = this.i;
        if (bl5Var.r != i) {
            bl5Var.r = i;
            bl5Var.w = true;
            bl5Var.k();
        }
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        bl5 bl5Var = this.i;
        bl5Var.l = colorStateList;
        bl5Var.k();
    }

    public void setItemMaxLines(int i) {
        bl5 bl5Var = this.i;
        bl5Var.y = i;
        bl5Var.k();
    }

    public void setItemTextAppearance(int i) {
        bl5 bl5Var = this.i;
        bl5Var.i = i;
        bl5Var.k();
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z2) {
        bl5 bl5Var = this.i;
        bl5Var.j = z2;
        bl5Var.k();
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        bl5 bl5Var = this.i;
        bl5Var.k = colorStateList;
        bl5Var.k();
    }

    public void setItemVerticalPadding(int i) {
        bl5 bl5Var = this.i;
        bl5Var.p = i;
        bl5Var.k();
    }

    public void setItemVerticalPaddingResource(int i) {
        int dimensionPixelSize = getResources().getDimensionPixelSize(i);
        bl5 bl5Var = this.i;
        bl5Var.p = dimensionPixelSize;
        bl5Var.k();
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        bl5 bl5Var = this.i;
        if (bl5Var != null) {
            bl5Var.B = i;
            NavigationMenuView navigationMenuView = bl5Var.a;
            if (navigationMenuView != null) {
                navigationMenuView.setOverScrollMode(i);
            }
        }
    }

    public void setStartInsetScrimEnabled(boolean z2) {
        this.p = z2;
    }

    public void setSubheaderInsetEnd(int i) {
        bl5 bl5Var = this.i;
        bl5Var.v = i;
        bl5Var.b();
    }

    public void setSubheaderInsetStart(int i) {
        bl5 bl5Var = this.i;
        bl5Var.u = i;
        bl5Var.b();
    }

    public void setTopInsetScrimEnabled(boolean z2) {
        this.n = z2;
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, vp6.navigationViewStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019f A[PHI: r8
      0x019f: PHI (r8v3 android.graphics.drawable.Drawable) = 
      (r8v2 android.graphics.drawable.Drawable)
      (r8v7 android.graphics.drawable.Drawable)
      (r8v2 android.graphics.drawable.Drawable)
     binds: [B:54:0x0162, B:60:0x0188, B:58:0x0172] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public NavigationView(android.content.Context r18, android.util.AttributeSet r19, int r20) {
        /*
            Method dump skipped, instruction units count: 806
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem menuItemFindItem = this.h.findItem(menuItem.getItemId());
        if (menuItemFindItem != null) {
            this.i.e.y((vt4) menuItemFindItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }

    public void setNavigationItemSelectedListener(il5 il5Var) {
    }
}
