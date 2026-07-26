package ir.mservices.market.app.home;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import defpackage.bi5;
import defpackage.f88;
import defpackage.g27;
import defpackage.js3;
import defpackage.ms6;
import defpackage.n15;
import defpackage.ow5;
import defpackage.pk5;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.xf5;
import defpackage.yh7;
import ir.mservices.market.activity.BaseFragmentContentActivity;
import ir.mservices.market.core.analytics.ActionBarEventBuilder;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.search.SearchFragment;

/* JADX INFO: loaded from: classes3.dex */
public final class OtherHomeFragment extends Hilt_OtherHomeFragment {
    public xf5 C1;
    public final bi5 D1 = new bi5(g27.a(ow5.class), new n15(11, this));

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        String strL = L(rs6.page_name_main_other);
        js3.o(strL, "getString(...)");
        return strL;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String I0() {
        String strConcat;
        String str = ((ow5) this.D1.getValue()).a;
        if (str != null) {
            if (f88.n0(str)) {
                str = null;
            }
            if (str != null && (strConcat = "Category: ".concat(str)) != null) {
                return strConcat;
            }
        }
        return null;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String Q0(BaseFragmentContentActivity baseFragmentContentActivity) {
        String str = ((ow5) this.D1.getValue()).a;
        if (str == null) {
            return "";
        }
        if (f88.n0(str)) {
            str = null;
        }
        return str == null ? "" : str;
    }

    @Override // ir.mservices.market.common.search.BaseSearchFragment
    public final SearchFragment R1() {
        return null;
    }

    @Override // ir.mservices.market.common.search.BaseSearchFragment
    public final boolean T1() {
        return false;
    }

    @Override // ir.mservices.market.common.search.BaseSearchFragment
    public final String U1() {
        return "";
    }

    @Override // ir.mservices.market.common.search.BaseSearchFragment
    public final boolean W1(int i) {
        return false;
    }

    @Override // ir.mservices.market.common.search.BaseSearchFragment
    public final boolean X1() {
        return false;
    }

    @Override // ir.mservices.market.common.search.BaseSearchFragment
    public final void Z1() {
    }

    @Override // ir.mservices.market.common.search.BaseSearchFragment
    public final void a2() {
    }

    @Override // ir.mservices.market.common.search.BaseSearchFragment
    public final void b2() {
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final void f1(Menu menu, MenuInflater menuInflater) {
        js3.p(menu, "menu");
        js3.p(menuInflater, "menuInflater");
        menuInflater.inflate(ms6.list_search, menu);
        MenuItem menuItemFindItem = menu.findItem(rr6.action_search);
        Drawable icon = menuItemFindItem.getIcon();
        if (icon != null) {
            icon.setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
        }
        xf5 xf5Var = this.C1;
        if (xf5Var == null) {
            js3.V("myketUIUtils");
            throw null;
        }
        xf5.j(xf5Var, this, menuItemFindItem);
        super.f1(menu, menuInflater);
    }

    @Override // ir.mservices.market.app.home.HomeFragment
    public final String f2() {
        return ((ow5) this.D1.getValue()).b;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean g1(MenuItem menuItem) {
        js3.p(menuItem, "menuItem");
        if (menuItem.getItemId() == rr6.action_search) {
            ActionBarEventBuilder actionBarEventBuilder = new ActionBarEventBuilder();
            actionBarEventBuilder.b("list_search");
            actionBarEventBuilder.a();
            ActionBarEventBuilder actionBarEventBuilder2 = new ActionBarEventBuilder();
            actionBarEventBuilder2.b("app_list_search_category");
            actionBarEventBuilder2.a();
            pk5.g(this.J0, new NavIntentDirections.Search(new yh7("", "List")), -1);
        }
        return false;
    }

    @Override // ir.mservices.market.app.home.HomeFragment
    public final boolean i2() {
        return false;
    }
}
