package ir.mservices.market.social.profile.listMore.movie.list;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.h;
import defpackage.bd;
import defpackage.bi5;
import defpackage.bp2;
import defpackage.c24;
import defpackage.d16;
import defpackage.ds6;
import defpackage.dt2;
import defpackage.dw1;
import defpackage.g27;
import defpackage.is3;
import defpackage.j71;
import defpackage.js3;
import defpackage.jx2;
import defpackage.ms6;
import defpackage.n15;
import defpackage.o79;
import defpackage.ot4;
import defpackage.p3;
import defpackage.pk5;
import defpackage.pl6;
import defpackage.pq6;
import defpackage.q79;
import defpackage.rq4;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.t61;
import defpackage.ts5;
import defpackage.vk6;
import defpackage.x79;
import defpackage.xf5;
import ir.mservices.market.activity.BaseFragmentContentActivity;
import ir.mservices.market.common.ui.recycler.layoutManager.PaddingLayoutManager$Padding;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.social.profile.list.data.ReportListType;
import ir.mservices.market.social.profile.list.movie.data.ProfileMovieListDto;
import ir.mservices.market.social.profile.listMore.movie.list.ProfileMovieListMoreAction;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.fragments.dialog.ReportDialogFragment;
import ir.mservices.market.version2.fragments.dialog.f;
import ir.mservices.market.viewModel.c;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
public final class ProfileMovieListMoreFragment extends Hilt_ProfileMovieListMoreFragment {
    public static final /* synthetic */ int l1 = 0;
    public xf5 i1;
    public final bi5 j1 = new bi5(g27.a(pl6.class), new n15(27, this));
    public final o79 k1;

    public ProfileMovieListMoreFragment() {
        final ProfileMovieListMoreFragment$special$$inlined$viewModels$default$1 profileMovieListMoreFragment$special$$inlined$viewModels$default$1 = new ProfileMovieListMoreFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.social.profile.listMore.movie.list.ProfileMovieListMoreFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) profileMovieListMoreFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.k1 = new o79(g27.a(ProfileMovieListMoreViewModel.class), new bp2() { // from class: ir.mservices.market.social.profile.listMore.movie.list.ProfileMovieListMoreFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.social.profile.listMore.movie.list.ProfileMovieListMoreFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                q79 q79VarH;
                x79 x79Var = (x79) c24VarB.getValue();
                jx2 jx2Var = x79Var instanceof jx2 ? (jx2) x79Var : null;
                return (jx2Var == null || (q79VarH = jx2Var.h()) == null) ? this.g.h() : q79VarH;
            }
        }, new bp2() { // from class: ir.mservices.market.social.profile.listMore.movie.list.ProfileMovieListMoreFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                x79 x79Var = (x79) c24VarB.getValue();
                jx2 jx2Var = x79Var instanceof jx2 ? (jx2) x79Var : null;
                return jx2Var != null ? jx2Var.i() : j71.b;
            }
        });
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, defpackage.mm2
    public final void B(Bundle bundle, String str) {
        String string;
        js3.p(str, "requestKey");
        js3.p(bundle, "result");
        if (str.equalsIgnoreCase(Q1())) {
            Object objP = dt2.p(bundle, "BUNDLE_KEY_DATA", DialogDataModel.class);
            js3.n(objP, "null cannot be cast to non-null type ir.mservices.market.version2.fragments.dialog.DialogDataModel");
            DialogDataModel dialogDataModel = (DialogDataModel) objP;
            String str2 = dialogDataModel.b;
            if ("DIALOG_KEY_DELETE_LIST".equalsIgnoreCase(str2)) {
                if (dialogDataModel.d == DialogResult.a) {
                    S1().r(ProfileMovieListMoreAction.DeleteListAction.INSTANCE);
                }
            } else if ("DIALOG_KEY_REPORT_LIST".equalsIgnoreCase(str2) && dialogDataModel.d == DialogResult.a && (string = dialogDataModel.c.getString("BUNDLE_KEY_LIST_TYPE")) != null) {
                ProfileMovieListMoreViewModel profileMovieListMoreViewModelS1 = S1();
                int i = bundle.getInt("SELECT_INDEX");
                SparseArray sparseArray = new SparseArray();
                sparseArray.put(0, ReportListType.MOVIE_TITLE);
                Object obj = sparseArray.get(i);
                js3.o(obj, "get(...)");
                profileMovieListMoreViewModelS1.r(new ProfileMovieListMoreAction.ReportListAction(string, (ReportListType) obj));
            }
        }
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        String strL = L(rs6.page_name_movie_list_more);
        js3.o(strL, "getString(...)");
        return strL;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final boolean H1() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String Q0(BaseFragmentContentActivity baseFragmentContentActivity) {
        return R1().b.a;
    }

    public final String Q1() {
        return dw1.n("ProfileMovieListMoreFragment_", this.H0);
    }

    public final pl6 R1() {
        return (pl6) this.j1.getValue();
    }

    public final ProfileMovieListMoreViewModel S1() {
        return (ProfileMovieListMoreViewModel) this.k1.getValue();
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final void f1(Menu menu, MenuInflater menuInflater) {
        MenuItem menuItemFindItem;
        MenuItem menuItemFindItem2;
        MenuItem menuItemFindItem3;
        js3.p(menu, "menu");
        js3.p(menuInflater, "menuInflater");
        menuInflater.inflate(ms6.profile_list_more, menu);
        MenuItem menuItemFindItem4 = menu.findItem(rr6.action_more);
        Drawable icon = menuItemFindItem4.getIcon();
        if (icon != null) {
            icon.setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
        }
        xf5 xf5Var = this.i1;
        if (xf5Var == null) {
            js3.V("myketUIUtils");
            throw null;
        }
        xf5.j(xf5Var, this, menuItemFindItem4);
        ot4 ot4VarS0 = S0(ms6.profile_list_more_items, menu.findItem(rr6.action_more));
        String str = R1().c;
        if (ot4VarS0 != null && (menuItemFindItem3 = ot4VarS0.findItem(rr6.edit_list)) != null) {
            rq4.O(menuItemFindItem3, str == null, ot4VarS0, menuItemFindItem4);
        }
        if (ot4VarS0 != null && (menuItemFindItem2 = ot4VarS0.findItem(rr6.delete_list)) != null) {
            rq4.O(menuItemFindItem2, str == null, ot4VarS0, menuItemFindItem4);
        }
        if (ot4VarS0 != null && (menuItemFindItem = ot4VarS0.findItem(rr6.report_list)) != null) {
            rq4.O(menuItemFindItem, str != null, ot4VarS0, menuItemFindItem4);
        }
        super.f1(menu, menuInflater);
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean g1(MenuItem menuItem) {
        js3.p(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        if (itemId == rr6.edit_list) {
            S1().r(ProfileMovieListMoreAction.GetMoviePoliciesAction.INSTANCE);
            return true;
        }
        if (itemId == rr6.delete_list) {
            pk5.g(this.J0, new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(Q1(), "DIALOG_KEY_DELETE_LIST", null, 12), null, L(rs6.profile_list_delete_message), L(rs6.profile_list_delete_list), L(rs6.button_cancel), false)), -1);
            return false;
        }
        if (itemId == rr6.report_list) {
            ProfileMovieListDto profileMovieListDto = R1().b.c;
            Bundle bundleG = is3.g(new Pair("BUNDLE_KEY_LIST_TYPE", profileMovieListDto != null ? profileMovieListDto.getKey() : null), new Pair("BUNDLE_KEY_IS_APP", Boolean.FALSE));
            String strL = L(rs6.profile_list_report_title);
            js3.o(strL, "getString(...)");
            pk5.g(this.J0, new NavIntentDirections.Report(new f(new DialogDataModel(Q1(), "DIALOG_KEY_REPORT_LIST", bundleG, 8), null, L(rs6.report_message), -1, sj8.b().c, sj8.b().d, sj8.b(), false, new ReportDialogFragment.Option[]{new ReportDialogFragment.Option(strL)})), -1);
        }
        return false;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final ir.mservices.market.version2.ui.recycler.adapter.a j1() {
        vk6 vk6Var = new vk6((K().getDimensionPixelSize(pq6.item_space) + t61.e(K(), pq6.horizontal_space_outer, 2, p3.g(F()).a)) / v1(), v1(), 1);
        vk6Var.o = new ts5(8, this);
        return vk6Var;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new ProfileMovieListMoreFragment$onViewCreated$1(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new ProfileMovieListMoreFragment$onViewCreated$2(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new ProfileMovieListMoreFragment$onViewCreated$3(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new ProfileMovieListMoreFragment$onViewCreated$4(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new ProfileMovieListMoreFragment$onViewCreated$5(this, null));
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final c l1() {
        return S1();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final h t1() {
        return new d16(0, 0, K().getDimensionPixelSize(pq6.space_16), 0, v1(), false, this.F0.f());
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final PaddingLayoutManager$Padding u1() {
        int dimensionPixelSize = K().getDimensionPixelSize(pq6.space_s);
        int dimensionPixelSize2 = K().getDimensionPixelSize(pq6.horizontal_space_outer);
        int dimensionPixelSize3 = K().getDimensionPixelSize(pq6.horizontal_space_outer);
        if (this.F0.f()) {
            dimensionPixelSize2 -= K().getDimensionPixelSize(pq6.item_space);
        } else {
            dimensionPixelSize3 -= K().getDimensionPixelSize(pq6.item_space);
        }
        return new PaddingLayoutManager$Padding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize3, dimensionPixelSize);
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int v1() {
        return K().getInteger(ds6.profile_movie_list_more_max_span);
    }
}
