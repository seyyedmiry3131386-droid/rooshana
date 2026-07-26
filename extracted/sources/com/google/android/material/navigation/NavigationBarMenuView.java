package com.google.android.material.navigation;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.transition.AutoTransition;
import defpackage.as7;
import defpackage.cs6;
import defpackage.d50;
import defpackage.di6;
import defpackage.fk4;
import defpackage.is6;
import defpackage.ju4;
import defpackage.mq1;
import defpackage.ot4;
import defpackage.pt2;
import defpackage.r5;
import defpackage.ub1;
import defpackage.vp6;
import defpackage.vt4;
import defpackage.xj5;
import defpackage.xp6;
import defpackage.yj5;
import defpackage.yk;
import defpackage.zz3;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class NavigationBarMenuView extends ViewGroup implements ju4 {
    public static final int[] W = {R.attr.state_checked};
    public static final int[] x0 = {-16842910};
    public boolean A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public as7 I;
    public boolean J;
    public ColorStateList K;
    public b L;
    public xj5 M;
    public boolean N;
    public boolean O;
    public int P;
    public int Q;
    public boolean R;
    public MenuItem S;
    public int T;
    public boolean U;
    public final Rect V;
    public final AutoTransition a;
    public final r5 b;
    public di6 c;
    public final SparseArray d;
    public int e;
    public int f;
    public yj5[] g;
    public int h;
    public int i;
    public ColorStateList j;
    public int k;
    public ColorStateList l;
    public final ColorStateList m;
    public int n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public Drawable s;
    public ColorStateList t;
    public int u;
    public final SparseArray v;
    public int w;
    public int x;
    public int y;
    public int z;

    public NavigationBarMenuView(Context context) {
        super(context);
        this.d = new SparseArray();
        this.h = -1;
        this.i = -1;
        this.v = new SparseArray();
        this.w = -1;
        this.x = -1;
        this.y = -1;
        this.z = -1;
        this.H = 49;
        this.J = false;
        this.P = 1;
        this.Q = 0;
        this.S = null;
        this.T = 7;
        this.U = false;
        this.V = new Rect();
        this.m = c();
        if (isInEditMode()) {
            this.a = null;
        } else {
            AutoTransition autoTransition = new AutoTransition();
            this.a = autoTransition;
            autoTransition.T(0);
            autoTransition.o();
            autoTransition.H(ub1.G(getContext(), vp6.motionDurationMedium4, getResources().getInteger(cs6.material_motion_duration_long_1)));
            autoTransition.J(ub1.H(getContext(), vp6.motionEasingStandard, yk.b));
            autoTransition.P(new zz3(1));
        }
        this.b = new r5(6, this);
        setImportantForAccessibility(1);
    }

    public static boolean g(int i, int i2) {
        return i == -1 ? i2 > 3 : i == 0;
    }

    private int getCollapsedVisibleItemCount() {
        return Math.min(this.T, this.M.e);
    }

    private NavigationBarItemView getNewItem() {
        di6 di6Var = this.c;
        NavigationBarItemView navigationBarItemView = di6Var != null ? (NavigationBarItemView) di6Var.e() : null;
        return navigationBarItemView == null ? f(getContext()) : navigationBarItemView;
    }

    private void setBadgeIfNeeded(NavigationBarItemView navigationBarItemView) {
        d50 d50Var;
        int id = navigationBarItemView.getId();
        if (id == -1 || (d50Var = (d50) this.v.get(id)) == null) {
            return;
        }
        navigationBarItemView.setBadge(d50Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        View viewE;
        removeAllViews();
        yj5[] yj5VarArr = this.g;
        if (yj5VarArr != null && this.c != null) {
            for (yj5 yj5Var : yj5VarArr) {
                if (yj5Var instanceof NavigationBarItemView) {
                    NavigationBarItemView navigationBarItemView = (NavigationBarItemView) yj5Var;
                    this.c.d(navigationBarItemView);
                    ImageView imageView = navigationBarItemView.t;
                    if (navigationBarItemView.x0 != null) {
                        if (imageView != null) {
                            navigationBarItemView.setClipChildren(true);
                            navigationBarItemView.setClipToPadding(true);
                            d50 d50Var = navigationBarItemView.x0;
                            if (d50Var != null) {
                                if (d50Var.e() != null) {
                                    d50Var.e().setForeground(null);
                                } else {
                                    imageView.getOverlay().remove(d50Var);
                                }
                            }
                        }
                        navigationBarItemView.x0 = null;
                    }
                    navigationBarItemView.I = null;
                    navigationBarItemView.O = 0.0f;
                    navigationBarItemView.a = false;
                }
            }
        }
        this.L.b = true;
        this.M.b();
        this.L.b = false;
        int i = this.M.c;
        if (i == 0) {
            this.h = 0;
            this.i = 0;
            this.g = null;
            this.c = null;
            return;
        }
        if (this.c == null || this.Q != i) {
            this.Q = i;
            this.c = new di6(i);
        }
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < this.M.b.size(); i2++) {
            hashSet.add(Integer.valueOf(this.M.a(i2).getItemId()));
        }
        int i3 = 0;
        while (true) {
            SparseArray sparseArray = this.v;
            if (i3 >= sparseArray.size()) {
                break;
            }
            int iKeyAt = sparseArray.keyAt(i3);
            if (!hashSet.contains(Integer.valueOf(iKeyAt))) {
                sparseArray.delete(iKeyAt);
            }
            i3++;
        }
        int size = this.M.b.size();
        this.g = new yj5[size];
        boolean zG = g(this.e, getCurrentVisibleContentItemCount());
        int size2 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            MenuItem menuItemA = this.M.a(i5);
            boolean z = menuItemA instanceof mq1;
            if (z) {
                Context context = getContext();
                NavigationBarDividerView navigationBarDividerView = new NavigationBarDividerView(context);
                LayoutInflater.from(context).inflate(is6.m3_navigation_menu_divider, (ViewGroup) navigationBarDividerView, true);
                navigationBarDividerView.a();
                navigationBarDividerView.setOnlyShowWhenExpanded(true);
                navigationBarDividerView.setDividersEnabled(this.U);
                viewE = navigationBarDividerView;
            } else if (menuItemA.hasSubMenu()) {
                if (size2 > 0) {
                    throw new IllegalArgumentException("Only one layer of submenu is supported; a submenu inside a submenu is not supported by the Navigation Bar.");
                }
                NavigationBarSubheaderView navigationBarSubheaderView = new NavigationBarSubheaderView(getContext());
                int i6 = this.q;
                if (i6 == 0) {
                    i6 = this.o;
                }
                navigationBarSubheaderView.setTextAppearance(i6);
                navigationBarSubheaderView.setTextColor(this.l);
                navigationBarSubheaderView.setOnlyShowWhenExpanded(true);
                navigationBarSubheaderView.c((vt4) menuItemA);
                size2 = menuItemA.getSubMenu().size();
                viewE = navigationBarSubheaderView;
            } else if (size2 > 0) {
                size2--;
                viewE = e(i5, (vt4) menuItemA, zG, true);
            } else {
                vt4 vt4Var = (vt4) menuItemA;
                boolean z2 = i4 >= this.T;
                i4++;
                viewE = e(i5, vt4Var, zG, z2);
            }
            if (!z && menuItemA.isCheckable() && this.i == -1) {
                this.i = i5;
            }
            this.g[i5] = viewE;
            addView(viewE);
        }
        int iMin = Math.min(size - 1, this.i);
        this.i = iMin;
        setCheckedItem(this.g[iMin].getItemData());
    }

    @Override // defpackage.ju4
    public final void b(ot4 ot4Var) {
        this.M = new xj5(ot4Var);
    }

    public final ColorStateList c() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateList = ContextCompat.getColorStateList(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(xp6.colorPrimary, typedValue, true)) {
            return null;
        }
        int i = typedValue.data;
        int defaultColor = colorStateList.getDefaultColor();
        int[] iArr = x0;
        return new ColorStateList(new int[][]{iArr, W, ViewGroup.EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(iArr, defaultColor), i, defaultColor});
    }

    public final fk4 d() {
        if (this.I == null || this.K == null) {
            return null;
        }
        fk4 fk4Var = new fk4(this.I);
        fk4Var.s(this.K);
        return fk4Var;
    }

    public final NavigationBarItemView e(int i, vt4 vt4Var, boolean z, boolean z2) {
        this.L.b = true;
        vt4Var.setCheckable(true);
        this.L.b = false;
        NavigationBarItemView newItem = getNewItem();
        newItem.setShifting(z);
        newItem.setLabelMaxLines(this.P);
        newItem.setIconTintList(this.j);
        newItem.setIconSize(this.k);
        newItem.setTextColor(this.m);
        newItem.setTextAppearanceInactive(this.n);
        newItem.setTextAppearanceActive(this.o);
        newItem.setHorizontalTextAppearanceInactive(this.p);
        newItem.setHorizontalTextAppearanceActive(this.q);
        newItem.setTextAppearanceActiveBoldEnabled(this.r);
        newItem.setTextColor(this.l);
        int i2 = this.w;
        if (i2 != -1) {
            newItem.setItemPaddingTop(i2);
        }
        int i3 = this.x;
        if (i3 != -1) {
            newItem.setItemPaddingBottom(i3);
        }
        newItem.setMeasureBottomPaddingFromLabelBaseline(this.N);
        newItem.setLabelFontScalingEnabled(this.O);
        int i4 = this.y;
        if (i4 != -1) {
            newItem.setActiveIndicatorLabelPadding(i4);
        }
        int i5 = this.z;
        if (i5 != -1) {
            newItem.setIconLabelHorizontalSpacing(i5);
        }
        newItem.setActiveIndicatorWidth(this.B);
        newItem.setActiveIndicatorHeight(this.C);
        newItem.setActiveIndicatorExpandedWidth(this.D);
        newItem.setActiveIndicatorExpandedHeight(this.E);
        newItem.setActiveIndicatorMarginHorizontal(this.F);
        newItem.setItemGravity(this.H);
        newItem.setActiveIndicatorExpandedPadding(this.V);
        newItem.setActiveIndicatorExpandedMarginHorizontal(this.G);
        newItem.setActiveIndicatorDrawable(d());
        newItem.setActiveIndicatorResizeable(this.J);
        newItem.setActiveIndicatorEnabled(this.A);
        Drawable drawable = this.s;
        if (drawable != null) {
            newItem.setItemBackground(drawable);
        } else {
            newItem.setItemBackground(this.u);
        }
        newItem.setItemRippleColor(this.t);
        newItem.setLabelVisibilityMode(this.e);
        newItem.setItemIconGravity(this.f);
        newItem.setOnlyShowWhenExpanded(z2);
        newItem.setExpanded(this.R);
        newItem.c(vt4Var);
        newItem.setItemPosition(i);
        int i6 = vt4Var.a;
        newItem.setOnTouchListener((View.OnTouchListener) this.d.get(i6));
        newItem.setOnClickListener(this.b);
        int i7 = this.h;
        if (i7 != 0 && i6 == i7) {
            this.i = i;
        }
        setBadgeIfNeeded(newItem);
        return newItem;
    }

    public abstract NavigationBarItemView f(Context context);

    public int getActiveIndicatorLabelPadding() {
        return this.y;
    }

    public SparseArray<d50> getBadgeDrawables() {
        return this.v;
    }

    public int getCurrentVisibleContentItemCount() {
        return this.R ? this.M.d : getCollapsedVisibleItemCount();
    }

    public int getHorizontalItemTextAppearanceActive() {
        return this.q;
    }

    public int getHorizontalItemTextAppearanceInactive() {
        return this.p;
    }

    public int getIconLabelHorizontalSpacing() {
        return this.z;
    }

    public ColorStateList getIconTintList() {
        return this.j;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.K;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.A;
    }

    public int getItemActiveIndicatorExpandedHeight() {
        return this.E;
    }

    public int getItemActiveIndicatorExpandedMarginHorizontal() {
        return this.G;
    }

    public int getItemActiveIndicatorExpandedWidth() {
        return this.D;
    }

    public int getItemActiveIndicatorHeight() {
        return this.C;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.F;
    }

    public as7 getItemActiveIndicatorShapeAppearance() {
        return this.I;
    }

    public int getItemActiveIndicatorWidth() {
        return this.B;
    }

    public Drawable getItemBackground() {
        yj5[] yj5VarArr = this.g;
        if (yj5VarArr != null && yj5VarArr.length > 0) {
            for (yj5 yj5Var : yj5VarArr) {
                if (yj5Var instanceof NavigationBarItemView) {
                    return ((NavigationBarItemView) yj5Var).getBackground();
                }
            }
        }
        return this.s;
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.u;
    }

    public int getItemGravity() {
        return this.H;
    }

    public int getItemIconGravity() {
        return this.f;
    }

    public int getItemIconSize() {
        return this.k;
    }

    public int getItemPaddingBottom() {
        return this.x;
    }

    public int getItemPaddingTop() {
        return this.w;
    }

    public ColorStateList getItemRippleColor() {
        return this.t;
    }

    public int getItemTextAppearanceActive() {
        return this.o;
    }

    public int getItemTextAppearanceInactive() {
        return this.n;
    }

    public ColorStateList getItemTextColor() {
        return this.l;
    }

    public int getLabelMaxLines() {
        return this.P;
    }

    public int getLabelVisibilityMode() {
        return this.e;
    }

    public xj5 getMenu() {
        return this.M;
    }

    public boolean getScaleLabelTextWithFont() {
        return this.O;
    }

    public int getSelectedItemId() {
        return this.h;
    }

    public int getSelectedItemPosition() {
        return this.i;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) pt2.v(1, getCurrentVisibleContentItemCount(), 1).b);
    }

    public void setActiveIndicatorLabelPadding(int i) {
        this.y = i;
        yj5[] yj5VarArr = this.g;
        if (yj5VarArr != null) {
            for (yj5 yj5Var : yj5VarArr) {
                if (yj5Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) yj5Var).setActiveIndicatorLabelPadding(i);
                }
            }
        }
    }

    public void setCheckedItem(MenuItem menuItem) {
        if (this.S == menuItem || !menuItem.isCheckable()) {
            return;
        }
        MenuItem menuItem2 = this.S;
        if (menuItem2 != null && menuItem2.isChecked()) {
            this.S.setChecked(false);
        }
        menuItem.setChecked(true);
        this.S = menuItem;
    }

    public void setCollapsedMaxItemCount(int i) {
        this.T = i;
    }

    public void setExpanded(boolean z) {
        this.R = z;
        yj5[] yj5VarArr = this.g;
        if (yj5VarArr != null) {
            for (yj5 yj5Var : yj5VarArr) {
                yj5Var.setExpanded(z);
            }
        }
    }

    public void setHorizontalItemTextAppearanceActive(int i) {
        this.q = i;
        yj5[] yj5VarArr = this.g;
        if (yj5VarArr != null) {
            for (yj5 yj5Var : yj5VarArr) {
                if (yj5Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) yj5Var).setHorizontalTextAppearanceActive(i);
                }
            }
        }
    }

    public void setHorizontalItemTextAppearanceInactive(int i) {
        this.p = i;
        yj5[] yj5VarArr = this.g;
        if (yj5VarArr != null) {
            for (yj5 yj5Var : yj5VarArr) {
                if (yj5Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) yj5Var).setHorizontalTextAppearanceInactive(i);
                }
            }
        }
    }

    public void setIconLabelHorizontalSpacing(int i) {
        this.z = i;
        yj5[] yj5VarArr = this.g;
        if (yj5VarArr != null) {
            for (yj5 yj5Var : yj5VarArr) {
                if (yj5Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) yj5Var).setIconLabelHorizontalSpacing(i);
                }
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.j = colorStateList;
        yj5[] yj5VarArr = this.g;
        if (yj5VarArr != null) {
            for (yj5 yj5Var : yj5VarArr) {
                if (yj5Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) yj5Var).setIconTintList(colorStateList);
                }
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.K = colorStateList;
        yj5[] yj5VarArr = this.g;
        if (yj5VarArr != null) {
            for (yj5 yj5Var : yj5VarArr) {
                if (yj5Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) yj5Var).setActiveIndicatorDrawable(d());
                }
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.A = z;
        yj5[] yj5VarArr = this.g;
        if (yj5VarArr != null) {
            for (yj5 yj5Var : yj5VarArr) {
                if (yj5Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) yj5Var).setActiveIndicatorEnabled(z);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedHeight(int i) {
        this.E = i;
        yj5[] yj5VarArr = this.g;
        if (yj5VarArr != null) {
            for (yj5 yj5Var : yj5VarArr) {
                if (yj5Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) yj5Var).setActiveIndicatorExpandedHeight(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedMarginHorizontal(int i) {
        this.G = i;
        yj5[] yj5VarArr = this.g;
        if (yj5VarArr != null) {
            for (yj5 yj5Var : yj5VarArr) {
                if (yj5Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) yj5Var).setActiveIndicatorExpandedMarginHorizontal(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedPadding(int i, int i2, int i3, int i4) {
        Rect rect = this.V;
        rect.left = i;
        rect.top = i2;
        rect.right = i3;
        rect.bottom = i4;
        yj5[] yj5VarArr = this.g;
        if (yj5VarArr != null) {
            for (yj5 yj5Var : yj5VarArr) {
                if (yj5Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) yj5Var).setActiveIndicatorExpandedPadding(rect);
                }
            }
        }
    }

    public void setItemActiveIndicatorExpandedWidth(int i) {
        this.D = i;
        yj5[] yj5VarArr = this.g;
        if (yj5VarArr != null) {
            for (yj5 yj5Var : yj5VarArr) {
                if (yj5Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) yj5Var).setActiveIndicatorExpandedWidth(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.C = i;
        yj5[] yj5VarArr = this.g;
        if (yj5VarArr != null) {
            for (yj5 yj5Var : yj5VarArr) {
                if (yj5Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) yj5Var).setActiveIndicatorHeight(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.F = i;
        yj5[] yj5VarArr = this.g;
        if (yj5VarArr != null) {
            for (yj5 yj5Var : yj5VarArr) {
                if (yj5Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) yj5Var).setActiveIndicatorMarginHorizontal(i);
                }
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z) {
        this.J = z;
        yj5[] yj5VarArr = this.g;
        if (yj5VarArr != null) {
            for (yj5 yj5Var : yj5VarArr) {
                if (yj5Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) yj5Var).setActiveIndicatorResizeable(z);
                }
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(as7 as7Var) {
        this.I = as7Var;
        yj5[] yj5VarArr = this.g;
        if (yj5VarArr != null) {
            for (yj5 yj5Var : yj5VarArr) {
                if (yj5Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) yj5Var).setActiveIndicatorDrawable(d());
                }
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.B = i;
        yj5[] yj5VarArr = this.g;
        if (yj5VarArr != null) {
            for (yj5 yj5Var : yj5VarArr) {
                if (yj5Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) yj5Var).setActiveIndicatorWidth(i);
                }
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.s = drawable;
        yj5[] yj5VarArr = this.g;
        if (yj5VarArr != null) {
            for (yj5 yj5Var : yj5VarArr) {
                if (yj5Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) yj5Var).setItemBackground(drawable);
                }
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.u = i;
        yj5[] yj5VarArr = this.g;
        if (yj5VarArr != null) {
            for (yj5 yj5Var : yj5VarArr) {
                if (yj5Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) yj5Var).setItemBackground(i);
                }
            }
        }
    }

    public void setItemGravity(int i) {
        this.H = i;
        yj5[] yj5VarArr = this.g;
        if (yj5VarArr != null) {
            for (yj5 yj5Var : yj5VarArr) {
                if (yj5Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) yj5Var).setItemGravity(i);
                }
            }
        }
    }

    public void setItemIconGravity(int i) {
        this.f = i;
        yj5[] yj5VarArr = this.g;
        if (yj5VarArr != null) {
            for (yj5 yj5Var : yj5VarArr) {
                if (yj5Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) yj5Var).setItemIconGravity(i);
                }
            }
        }
    }

    public void setItemIconSize(int i) {
        this.k = i;
        yj5[] yj5VarArr = this.g;
        if (yj5VarArr != null) {
            for (yj5 yj5Var : yj5VarArr) {
                if (yj5Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) yj5Var).setIconSize(i);
                }
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void setItemOnTouchListener(int i, View.OnTouchListener onTouchListener) {
        SparseArray sparseArray = this.d;
        if (onTouchListener == null) {
            sparseArray.remove(i);
        } else {
            sparseArray.put(i, onTouchListener);
        }
        yj5[] yj5VarArr = this.g;
        if (yj5VarArr != null) {
            for (yj5 yj5Var : yj5VarArr) {
                if ((yj5Var instanceof NavigationBarItemView) && yj5Var.getItemData() != null && yj5Var.getItemData().a == i) {
                    ((NavigationBarItemView) yj5Var).setOnTouchListener(onTouchListener);
                }
            }
        }
    }

    public void setItemPaddingBottom(int i) {
        this.x = i;
        yj5[] yj5VarArr = this.g;
        if (yj5VarArr != null) {
            for (yj5 yj5Var : yj5VarArr) {
                if (yj5Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) yj5Var).setItemPaddingBottom(this.x);
                }
            }
        }
    }

    public void setItemPaddingTop(int i) {
        this.w = i;
        yj5[] yj5VarArr = this.g;
        if (yj5VarArr != null) {
            for (yj5 yj5Var : yj5VarArr) {
                if (yj5Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) yj5Var).setItemPaddingTop(i);
                }
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.t = colorStateList;
        yj5[] yj5VarArr = this.g;
        if (yj5VarArr != null) {
            for (yj5 yj5Var : yj5VarArr) {
                if (yj5Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) yj5Var).setItemRippleColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.o = i;
        yj5[] yj5VarArr = this.g;
        if (yj5VarArr != null) {
            for (yj5 yj5Var : yj5VarArr) {
                if (yj5Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) yj5Var).setTextAppearanceActive(i);
                }
            }
        }
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z) {
        this.r = z;
        yj5[] yj5VarArr = this.g;
        if (yj5VarArr != null) {
            for (yj5 yj5Var : yj5VarArr) {
                if (yj5Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) yj5Var).setTextAppearanceActiveBoldEnabled(z);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        this.n = i;
        yj5[] yj5VarArr = this.g;
        if (yj5VarArr != null) {
            for (yj5 yj5Var : yj5VarArr) {
                if (yj5Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) yj5Var).setTextAppearanceInactive(i);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.l = colorStateList;
        yj5[] yj5VarArr = this.g;
        if (yj5VarArr != null) {
            for (yj5 yj5Var : yj5VarArr) {
                if (yj5Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) yj5Var).setTextColor(colorStateList);
                }
            }
        }
    }

    public void setLabelFontScalingEnabled(boolean z) {
        this.O = z;
        yj5[] yj5VarArr = this.g;
        if (yj5VarArr != null) {
            for (yj5 yj5Var : yj5VarArr) {
                if (yj5Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) yj5Var).setLabelFontScalingEnabled(z);
                }
            }
        }
    }

    public void setLabelMaxLines(int i) {
        this.P = i;
        yj5[] yj5VarArr = this.g;
        if (yj5VarArr != null) {
            for (yj5 yj5Var : yj5VarArr) {
                if (yj5Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) yj5Var).setLabelMaxLines(i);
                }
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.e = i;
    }

    public void setMeasurePaddingFromLabelBaseline(boolean z) {
        this.N = z;
        yj5[] yj5VarArr = this.g;
        if (yj5VarArr != null) {
            for (yj5 yj5Var : yj5VarArr) {
                if (yj5Var instanceof NavigationBarItemView) {
                    ((NavigationBarItemView) yj5Var).setMeasureBottomPaddingFromLabelBaseline(z);
                }
            }
        }
    }

    public void setPresenter(b bVar) {
        this.L = bVar;
    }

    public void setSubmenuDividersEnabled(boolean z) {
        if (this.U == z) {
            return;
        }
        this.U = z;
        yj5[] yj5VarArr = this.g;
        if (yj5VarArr != null) {
            for (yj5 yj5Var : yj5VarArr) {
                if (yj5Var instanceof NavigationBarDividerView) {
                    ((NavigationBarDividerView) yj5Var).setDividersEnabled(z);
                }
            }
        }
    }
}
