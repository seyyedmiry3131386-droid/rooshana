package ir.mservices.market.social.list.add.movie;

import defpackage.bi5;
import defpackage.de;
import defpackage.g27;
import defpackage.is3;
import defpackage.js3;
import defpackage.k12;
import defpackage.rs6;
import defpackage.xz4;
import ir.mservices.market.social.list.items.SelectedItemsAction;
import ir.mservices.market.social.list.items.SelectedItemsFragment;
import ir.mservices.market.social.list.search.SearchProfileListFragment;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieAddProfileListFragment extends Hilt_MovieAddProfileListFragment {
    public final bi5 g1 = new bi5(g27.a(xz4.class), new de(28, this));

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        String strL = L(rs6.page_name_add_custom_movie_list);
        js3.o(strL, "getString(...)");
        return strL;
    }

    @Override // ir.mservices.market.social.list.add.BaseAddProfileListFragment
    public final DialogDataModel m1() {
        return ((xz4) this.g1.getValue()).d;
    }

    @Override // ir.mservices.market.social.list.add.BaseAddProfileListFragment
    public final String o1(int i) {
        if (i == 1) {
            String strM = M(rs6.profile_list_movie_title_count, Integer.valueOf(i));
            js3.o(strM, "getString(...)");
            return strM;
        }
        if (i > 1) {
            String strM2 = M(rs6.profile_list_movie_title_counts, Integer.valueOf(i));
            js3.o(strM2, "getString(...)");
            return strM2;
        }
        String strL = L(rs6.profile_list_movie_title);
        js3.o(strL, "getString(...)");
        return strL;
    }

    @Override // ir.mservices.market.social.list.add.BaseAddProfileListFragment
    public final SelectedItemsFragment p1() {
        return new SelectedItemsFragment();
    }

    @Override // ir.mservices.market.social.list.add.BaseAddProfileListFragment
    public final SelectedItemsAction q1() {
        return SelectedItemsAction.SaveMovieAction.INSTANCE;
    }

    @Override // ir.mservices.market.social.list.add.BaseAddProfileListFragment
    public final SearchProfileListFragment r1() {
        SearchProfileListFragment searchProfileListFragment = new SearchProfileListFragment();
        searchProfileListFragment.u0(is3.g(new Pair("BUNDLE_KEY_IS_APP", Boolean.FALSE)));
        return searchProfileListFragment;
    }

    @Override // ir.mservices.market.social.list.add.BaseAddProfileListFragment
    public final String s1(String str) {
        js3.p(str, "title");
        String string = K().getString(rs6.selected_movie_item_toast_massage, str);
        js3.o(string, "getString(...)");
        return string;
    }

    @Override // ir.mservices.market.social.list.add.BaseAddProfileListFragment
    public final void u1(k12 k12Var) {
        js3.p(k12Var, "emptyViewBinding");
        k12Var.x.setText(L(rs6.profile_list_movie_empty_view_description));
        k12Var.v.setText(L(rs6.add_movie_action_button));
    }

    @Override // ir.mservices.market.social.list.add.BaseAddProfileListFragment
    public final boolean v1() {
        return false;
    }
}
