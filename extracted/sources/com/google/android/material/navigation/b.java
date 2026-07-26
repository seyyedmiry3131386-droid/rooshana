package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import androidx.transition.AutoTransition;
import com.google.android.material.badge.BadgeState$State;
import com.google.android.material.internal.ParcelableSparseArray;
import defpackage.d50;
import defpackage.gu4;
import defpackage.mq1;
import defpackage.ot4;
import defpackage.p98;
import defpackage.rr8;
import defpackage.vt4;
import defpackage.xj5;
import defpackage.yj5;

/* JADX INFO: loaded from: classes.dex */
public final class b implements gu4 {
    public NavigationBarMenuView a;
    public boolean b;
    public int c;

    @Override // defpackage.gu4
    public final void c(boolean z) {
        xj5 xj5Var;
        AutoTransition autoTransition;
        if (this.b) {
            return;
        }
        if (z) {
            this.a.a();
            return;
        }
        NavigationBarMenuView navigationBarMenuView = this.a;
        xj5 xj5Var2 = navigationBarMenuView.M;
        if (xj5Var2 == null || navigationBarMenuView.g == null) {
            return;
        }
        navigationBarMenuView.L.b = true;
        xj5Var2.b();
        navigationBarMenuView.L.b = false;
        if (navigationBarMenuView.g != null && (xj5Var = navigationBarMenuView.M) != null && xj5Var.b.size() == navigationBarMenuView.g.length) {
            for (int i = 0; i < navigationBarMenuView.g.length; i++) {
                if (!(navigationBarMenuView.M.a(i) instanceof mq1) || (navigationBarMenuView.g[i] instanceof NavigationBarDividerView)) {
                    boolean z2 = navigationBarMenuView.M.a(i).hasSubMenu() && !(navigationBarMenuView.g[i] instanceof NavigationBarSubheaderView);
                    boolean z3 = (navigationBarMenuView.M.a(i).hasSubMenu() || (navigationBarMenuView.g[i] instanceof NavigationBarItemView)) ? false : true;
                    if ((navigationBarMenuView.M.a(i) instanceof mq1) || (!z2 && !z3)) {
                    }
                }
            }
            int i2 = navigationBarMenuView.h;
            int size = navigationBarMenuView.M.b.size();
            for (int i3 = 0; i3 < size; i3++) {
                MenuItem menuItemA = navigationBarMenuView.M.a(i3);
                if (menuItemA.isChecked()) {
                    navigationBarMenuView.setCheckedItem(menuItemA);
                    navigationBarMenuView.h = menuItemA.getItemId();
                    navigationBarMenuView.i = i3;
                }
            }
            if (i2 != navigationBarMenuView.h && (autoTransition = navigationBarMenuView.a) != null) {
                rr8.a(navigationBarMenuView, autoTransition);
            }
            boolean zG = NavigationBarMenuView.g(navigationBarMenuView.e, navigationBarMenuView.getCurrentVisibleContentItemCount());
            for (int i4 = 0; i4 < size; i4++) {
                navigationBarMenuView.L.b = true;
                navigationBarMenuView.g[i4].setExpanded(navigationBarMenuView.R);
                yj5 yj5Var = navigationBarMenuView.g[i4];
                if (yj5Var instanceof NavigationBarItemView) {
                    NavigationBarItemView navigationBarItemView = (NavigationBarItemView) yj5Var;
                    navigationBarItemView.setLabelVisibilityMode(navigationBarMenuView.e);
                    navigationBarItemView.setItemIconGravity(navigationBarMenuView.f);
                    navigationBarItemView.setItemGravity(navigationBarMenuView.H);
                    navigationBarItemView.setShifting(zG);
                }
                if (navigationBarMenuView.M.a(i4) instanceof vt4) {
                    navigationBarMenuView.g[i4].c((vt4) navigationBarMenuView.M.a(i4));
                }
                navigationBarMenuView.L.b = false;
            }
            return;
        }
        navigationBarMenuView.a();
    }

    @Override // defpackage.gu4
    public final boolean e(p98 p98Var) {
        return false;
    }

    @Override // defpackage.gu4
    public final boolean f() {
        return false;
    }

    @Override // defpackage.gu4
    public final boolean g(vt4 vt4Var) {
        return false;
    }

    @Override // defpackage.gu4
    public final int getId() {
        return this.c;
    }

    @Override // defpackage.gu4
    public final void h(Parcelable parcelable) {
        if (parcelable instanceof NavigationBarPresenter$SavedState) {
            NavigationBarMenuView navigationBarMenuView = this.a;
            NavigationBarPresenter$SavedState navigationBarPresenter$SavedState = (NavigationBarPresenter$SavedState) parcelable;
            int i = navigationBarPresenter$SavedState.a;
            int size = navigationBarMenuView.M.b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                MenuItem menuItemA = navigationBarMenuView.M.a(i2);
                if (i == menuItemA.getItemId()) {
                    navigationBarMenuView.h = i;
                    navigationBarMenuView.i = i2;
                    navigationBarMenuView.setCheckedItem(menuItemA);
                    break;
                }
                i2++;
            }
            Context context = this.a.getContext();
            ParcelableSparseArray parcelableSparseArray = navigationBarPresenter$SavedState.b;
            SparseArray sparseArray = new SparseArray(parcelableSparseArray.size());
            for (int i3 = 0; i3 < parcelableSparseArray.size(); i3++) {
                int iKeyAt = parcelableSparseArray.keyAt(i3);
                BadgeState$State badgeState$State = (BadgeState$State) parcelableSparseArray.valueAt(i3);
                sparseArray.put(iKeyAt, badgeState$State != null ? new d50(context, badgeState$State) : null);
            }
            NavigationBarMenuView navigationBarMenuView2 = this.a;
            SparseArray sparseArray2 = navigationBarMenuView2.v;
            for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                int iKeyAt2 = sparseArray.keyAt(i4);
                if (sparseArray2.indexOfKey(iKeyAt2) < 0) {
                    sparseArray2.append(iKeyAt2, (d50) sparseArray.get(iKeyAt2));
                }
            }
            yj5[] yj5VarArr = navigationBarMenuView2.g;
            if (yj5VarArr != null) {
                for (yj5 yj5Var : yj5VarArr) {
                    if (yj5Var instanceof NavigationBarItemView) {
                        NavigationBarItemView navigationBarItemView = (NavigationBarItemView) yj5Var;
                        d50 d50Var = (d50) sparseArray2.get(navigationBarItemView.getId());
                        if (d50Var != null) {
                            navigationBarItemView.setBadge(d50Var);
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.gu4
    public final boolean j(vt4 vt4Var) {
        return false;
    }

    @Override // defpackage.gu4
    public final void l(Context context, ot4 ot4Var) {
        this.a.b(ot4Var);
    }

    @Override // defpackage.gu4
    public final Parcelable m() {
        NavigationBarPresenter$SavedState navigationBarPresenter$SavedState = new NavigationBarPresenter$SavedState();
        navigationBarPresenter$SavedState.a = this.a.getSelectedItemId();
        SparseArray<d50> badgeDrawables = this.a.getBadgeDrawables();
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i = 0; i < badgeDrawables.size(); i++) {
            int iKeyAt = badgeDrawables.keyAt(i);
            d50 d50VarValueAt = badgeDrawables.valueAt(i);
            parcelableSparseArray.put(iKeyAt, d50VarValueAt != null ? d50VarValueAt.e.a : null);
        }
        navigationBarPresenter$SavedState.b = parcelableSparseArray;
        return navigationBarPresenter$SavedState;
    }

    @Override // defpackage.gu4
    public final void d(ot4 ot4Var, boolean z) {
    }
}
