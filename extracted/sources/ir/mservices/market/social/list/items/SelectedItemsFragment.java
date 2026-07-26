package ir.mservices.market.social.list.items;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import defpackage.bd;
import defpackage.bp2;
import defpackage.c24;
import defpackage.c90;
import defpackage.d16;
import defpackage.ds6;
import defpackage.dt2;
import defpackage.dw1;
import defpackage.g27;
import defpackage.is3;
import defpackage.j71;
import defpackage.js3;
import defpackage.jx2;
import defpackage.mm2;
import defpackage.o06;
import defpackage.o79;
import defpackage.og5;
import defpackage.pk5;
import defpackage.pq6;
import defpackage.q79;
import defpackage.rs6;
import defpackage.x79;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.social.list.common.app.recycler.ProfileAppData;
import ir.mservices.market.social.list.common.movie.recycler.ProfileMovieData;
import ir.mservices.market.social.list.items.SelectedItemsAction;
import ir.mservices.market.social.list.items.SelectedItemsFragment;
import ir.mservices.market.social.list.items.recycler.ProfileListAddTitleData;
import ir.mservices.market.social.list.items.recycler.SelectableRecyclerData;
import ir.mservices.market.social.list.items.recycler.SelectedListAddItemData;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.viewModel.c;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
public final class SelectedItemsFragment extends Hilt_SelectedItemsFragment implements mm2 {
    public static final /* synthetic */ int Z0 = 0;
    public final o79 Y0;

    public SelectedItemsFragment() {
        final o06 o06Var = new o06(25, this);
        final c24 c24VarB = a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.social.list.items.SelectedItemsFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) o06Var.invoke();
            }
        });
        this.Y0 = new o79(g27.a(SelectedItemsViewModel.class), new bp2() { // from class: ir.mservices.market.social.list.items.SelectedItemsFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.social.list.items.SelectedItemsFragment$special$$inlined$viewModels$default$4
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
        }, new bp2() { // from class: ir.mservices.market.social.list.items.SelectedItemsFragment$special$$inlined$viewModels$default$3
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

    @Override // defpackage.mm2
    public final void B(Bundle bundle, String str) {
        SelectableRecyclerData selectableRecyclerData;
        String string;
        js3.p(str, "requestKey");
        js3.p(bundle, "result");
        if (str.equalsIgnoreCase(U0())) {
            Object objP = dt2.p(bundle, "BUNDLE_KEY_DATA", DialogDataModel.class);
            js3.n(objP, "null cannot be cast to non-null type ir.mservices.market.version2.fragments.dialog.DialogDataModel");
            DialogDataModel dialogDataModel = (DialogDataModel) objP;
            String str2 = dialogDataModel.b;
            if ("DIALOG_KEY_TITLE".equalsIgnoreCase(str2)) {
                if (dialogDataModel.d != DialogResult.a || (string = bundle.getString("BUNDLE_KEY_TITLE")) == null) {
                    return;
                }
                V0().r(new SelectedItemsAction.SetTitleAction(string));
                return;
            }
            if ("DIALOG_KEY_DELETE".equalsIgnoreCase(str2) && dialogDataModel.d == DialogResult.a && (selectableRecyclerData = (SelectableRecyclerData) dt2.s(dialogDataModel.c, "BUNDLE_KEY_DATA", SelectableRecyclerData.class)) != null) {
                V0().r(new SelectedItemsAction.SelectItemAction(selectableRecyclerData));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [sm7] */
    /* JADX WARN: Type inference failed for: r1v2, types: [sm7] */
    /* JADX WARN: Type inference failed for: r1v3, types: [sm7] */
    /* JADX WARN: Type inference failed for: r1v4, types: [sm7] */
    /* JADX WARN: Type inference failed for: r1v5, types: [sm7] */
    /* JADX WARN: Type inference failed for: r1v6, types: [sm7] */
    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final ir.mservices.market.version2.ui.recycler.adapter.a D0() {
        c90 c90Var = new c90(1);
        final int i = 0;
        c90Var.l = new og5(this) { // from class: sm7
            public final /* synthetic */ SelectedItemsFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i2 = i;
                SelectedItemsFragment selectedItemsFragment = this.b;
                switch (i2) {
                    case 0:
                        ProfileAppData profileAppData = (ProfileAppData) obj;
                        int i3 = SelectedItemsFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.social.list.common.app.recycler.a) qg5Var, "<unused var>");
                        js3.p(profileAppData, "recyclerData");
                        selectedItemsFragment.W0(rs6.profile_list_selected_app_item_delete, profileAppData);
                        break;
                    case 1:
                        ProfileAppData profileAppData2 = (ProfileAppData) obj;
                        int i4 = SelectedItemsFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.social.list.common.app.recycler.a) qg5Var, "<unused var>");
                        js3.p(profileAppData2, "recyclerData");
                        selectedItemsFragment.V0().r(new SelectedItemsAction.MoveToTopItemAction(profileAppData2));
                        break;
                    case 2:
                        ProfileMovieData profileMovieData = (ProfileMovieData) obj;
                        int i5 = SelectedItemsFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.social.list.common.movie.recycler.a) qg5Var, "<unused var>");
                        js3.p(profileMovieData, "recyclerData");
                        selectedItemsFragment.W0(rs6.profile_list_selected_movie_item_delete, profileMovieData);
                        break;
                    case 3:
                        ProfileMovieData profileMovieData2 = (ProfileMovieData) obj;
                        int i6 = SelectedItemsFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.social.list.common.movie.recycler.a) qg5Var, "<unused var>");
                        js3.p(profileMovieData2, "recyclerData");
                        selectedItemsFragment.V0().r(new SelectedItemsAction.MoveToTopItemAction(profileMovieData2));
                        break;
                    case 4:
                        ProfileListAddTitleData profileListAddTitleData = (ProfileListAddTitleData) obj;
                        int i7 = SelectedItemsFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.social.list.items.recycler.a) qg5Var, "<unused var>");
                        js3.p(profileListAddTitleData, "recyclerData");
                        pk5.g(selectedItemsFragment.J0, new NavIntentDirections.ProfileListTitle(new kl6(new DialogDataModel(selectedItemsFragment.U0(), "DIALOG_KEY_TITLE", null, 12), (String) profileListAddTitleData.a.getValue())), -1);
                        break;
                    default:
                        int i8 = SelectedItemsFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((vm7) qg5Var, "<unused var>");
                        js3.p((SelectedListAddItemData) obj, "<unused var>");
                        selectedItemsFragment.V0().r(SelectedItemsAction.AddMoreItem.INSTANCE);
                        break;
                }
            }
        };
        final int i2 = 1;
        c90Var.n = new og5(this) { // from class: sm7
            public final /* synthetic */ SelectedItemsFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i22 = i2;
                SelectedItemsFragment selectedItemsFragment = this.b;
                switch (i22) {
                    case 0:
                        ProfileAppData profileAppData = (ProfileAppData) obj;
                        int i3 = SelectedItemsFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.social.list.common.app.recycler.a) qg5Var, "<unused var>");
                        js3.p(profileAppData, "recyclerData");
                        selectedItemsFragment.W0(rs6.profile_list_selected_app_item_delete, profileAppData);
                        break;
                    case 1:
                        ProfileAppData profileAppData2 = (ProfileAppData) obj;
                        int i4 = SelectedItemsFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.social.list.common.app.recycler.a) qg5Var, "<unused var>");
                        js3.p(profileAppData2, "recyclerData");
                        selectedItemsFragment.V0().r(new SelectedItemsAction.MoveToTopItemAction(profileAppData2));
                        break;
                    case 2:
                        ProfileMovieData profileMovieData = (ProfileMovieData) obj;
                        int i5 = SelectedItemsFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.social.list.common.movie.recycler.a) qg5Var, "<unused var>");
                        js3.p(profileMovieData, "recyclerData");
                        selectedItemsFragment.W0(rs6.profile_list_selected_movie_item_delete, profileMovieData);
                        break;
                    case 3:
                        ProfileMovieData profileMovieData2 = (ProfileMovieData) obj;
                        int i6 = SelectedItemsFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.social.list.common.movie.recycler.a) qg5Var, "<unused var>");
                        js3.p(profileMovieData2, "recyclerData");
                        selectedItemsFragment.V0().r(new SelectedItemsAction.MoveToTopItemAction(profileMovieData2));
                        break;
                    case 4:
                        ProfileListAddTitleData profileListAddTitleData = (ProfileListAddTitleData) obj;
                        int i7 = SelectedItemsFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.social.list.items.recycler.a) qg5Var, "<unused var>");
                        js3.p(profileListAddTitleData, "recyclerData");
                        pk5.g(selectedItemsFragment.J0, new NavIntentDirections.ProfileListTitle(new kl6(new DialogDataModel(selectedItemsFragment.U0(), "DIALOG_KEY_TITLE", null, 12), (String) profileListAddTitleData.a.getValue())), -1);
                        break;
                    default:
                        int i8 = SelectedItemsFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((vm7) qg5Var, "<unused var>");
                        js3.p((SelectedListAddItemData) obj, "<unused var>");
                        selectedItemsFragment.V0().r(SelectedItemsAction.AddMoreItem.INSTANCE);
                        break;
                }
            }
        };
        final int i3 = 2;
        c90Var.m = new og5(this) { // from class: sm7
            public final /* synthetic */ SelectedItemsFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i22 = i3;
                SelectedItemsFragment selectedItemsFragment = this.b;
                switch (i22) {
                    case 0:
                        ProfileAppData profileAppData = (ProfileAppData) obj;
                        int i32 = SelectedItemsFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.social.list.common.app.recycler.a) qg5Var, "<unused var>");
                        js3.p(profileAppData, "recyclerData");
                        selectedItemsFragment.W0(rs6.profile_list_selected_app_item_delete, profileAppData);
                        break;
                    case 1:
                        ProfileAppData profileAppData2 = (ProfileAppData) obj;
                        int i4 = SelectedItemsFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.social.list.common.app.recycler.a) qg5Var, "<unused var>");
                        js3.p(profileAppData2, "recyclerData");
                        selectedItemsFragment.V0().r(new SelectedItemsAction.MoveToTopItemAction(profileAppData2));
                        break;
                    case 2:
                        ProfileMovieData profileMovieData = (ProfileMovieData) obj;
                        int i5 = SelectedItemsFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.social.list.common.movie.recycler.a) qg5Var, "<unused var>");
                        js3.p(profileMovieData, "recyclerData");
                        selectedItemsFragment.W0(rs6.profile_list_selected_movie_item_delete, profileMovieData);
                        break;
                    case 3:
                        ProfileMovieData profileMovieData2 = (ProfileMovieData) obj;
                        int i6 = SelectedItemsFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.social.list.common.movie.recycler.a) qg5Var, "<unused var>");
                        js3.p(profileMovieData2, "recyclerData");
                        selectedItemsFragment.V0().r(new SelectedItemsAction.MoveToTopItemAction(profileMovieData2));
                        break;
                    case 4:
                        ProfileListAddTitleData profileListAddTitleData = (ProfileListAddTitleData) obj;
                        int i7 = SelectedItemsFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.social.list.items.recycler.a) qg5Var, "<unused var>");
                        js3.p(profileListAddTitleData, "recyclerData");
                        pk5.g(selectedItemsFragment.J0, new NavIntentDirections.ProfileListTitle(new kl6(new DialogDataModel(selectedItemsFragment.U0(), "DIALOG_KEY_TITLE", null, 12), (String) profileListAddTitleData.a.getValue())), -1);
                        break;
                    default:
                        int i8 = SelectedItemsFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((vm7) qg5Var, "<unused var>");
                        js3.p((SelectedListAddItemData) obj, "<unused var>");
                        selectedItemsFragment.V0().r(SelectedItemsAction.AddMoreItem.INSTANCE);
                        break;
                }
            }
        };
        final int i4 = 3;
        c90Var.o = new og5(this) { // from class: sm7
            public final /* synthetic */ SelectedItemsFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i22 = i4;
                SelectedItemsFragment selectedItemsFragment = this.b;
                switch (i22) {
                    case 0:
                        ProfileAppData profileAppData = (ProfileAppData) obj;
                        int i32 = SelectedItemsFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.social.list.common.app.recycler.a) qg5Var, "<unused var>");
                        js3.p(profileAppData, "recyclerData");
                        selectedItemsFragment.W0(rs6.profile_list_selected_app_item_delete, profileAppData);
                        break;
                    case 1:
                        ProfileAppData profileAppData2 = (ProfileAppData) obj;
                        int i42 = SelectedItemsFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.social.list.common.app.recycler.a) qg5Var, "<unused var>");
                        js3.p(profileAppData2, "recyclerData");
                        selectedItemsFragment.V0().r(new SelectedItemsAction.MoveToTopItemAction(profileAppData2));
                        break;
                    case 2:
                        ProfileMovieData profileMovieData = (ProfileMovieData) obj;
                        int i5 = SelectedItemsFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.social.list.common.movie.recycler.a) qg5Var, "<unused var>");
                        js3.p(profileMovieData, "recyclerData");
                        selectedItemsFragment.W0(rs6.profile_list_selected_movie_item_delete, profileMovieData);
                        break;
                    case 3:
                        ProfileMovieData profileMovieData2 = (ProfileMovieData) obj;
                        int i6 = SelectedItemsFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.social.list.common.movie.recycler.a) qg5Var, "<unused var>");
                        js3.p(profileMovieData2, "recyclerData");
                        selectedItemsFragment.V0().r(new SelectedItemsAction.MoveToTopItemAction(profileMovieData2));
                        break;
                    case 4:
                        ProfileListAddTitleData profileListAddTitleData = (ProfileListAddTitleData) obj;
                        int i7 = SelectedItemsFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.social.list.items.recycler.a) qg5Var, "<unused var>");
                        js3.p(profileListAddTitleData, "recyclerData");
                        pk5.g(selectedItemsFragment.J0, new NavIntentDirections.ProfileListTitle(new kl6(new DialogDataModel(selectedItemsFragment.U0(), "DIALOG_KEY_TITLE", null, 12), (String) profileListAddTitleData.a.getValue())), -1);
                        break;
                    default:
                        int i8 = SelectedItemsFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((vm7) qg5Var, "<unused var>");
                        js3.p((SelectedListAddItemData) obj, "<unused var>");
                        selectedItemsFragment.V0().r(SelectedItemsAction.AddMoreItem.INSTANCE);
                        break;
                }
            }
        };
        final int i5 = 4;
        c90Var.p = new og5(this) { // from class: sm7
            public final /* synthetic */ SelectedItemsFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i22 = i5;
                SelectedItemsFragment selectedItemsFragment = this.b;
                switch (i22) {
                    case 0:
                        ProfileAppData profileAppData = (ProfileAppData) obj;
                        int i32 = SelectedItemsFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.social.list.common.app.recycler.a) qg5Var, "<unused var>");
                        js3.p(profileAppData, "recyclerData");
                        selectedItemsFragment.W0(rs6.profile_list_selected_app_item_delete, profileAppData);
                        break;
                    case 1:
                        ProfileAppData profileAppData2 = (ProfileAppData) obj;
                        int i42 = SelectedItemsFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.social.list.common.app.recycler.a) qg5Var, "<unused var>");
                        js3.p(profileAppData2, "recyclerData");
                        selectedItemsFragment.V0().r(new SelectedItemsAction.MoveToTopItemAction(profileAppData2));
                        break;
                    case 2:
                        ProfileMovieData profileMovieData = (ProfileMovieData) obj;
                        int i52 = SelectedItemsFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.social.list.common.movie.recycler.a) qg5Var, "<unused var>");
                        js3.p(profileMovieData, "recyclerData");
                        selectedItemsFragment.W0(rs6.profile_list_selected_movie_item_delete, profileMovieData);
                        break;
                    case 3:
                        ProfileMovieData profileMovieData2 = (ProfileMovieData) obj;
                        int i6 = SelectedItemsFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.social.list.common.movie.recycler.a) qg5Var, "<unused var>");
                        js3.p(profileMovieData2, "recyclerData");
                        selectedItemsFragment.V0().r(new SelectedItemsAction.MoveToTopItemAction(profileMovieData2));
                        break;
                    case 4:
                        ProfileListAddTitleData profileListAddTitleData = (ProfileListAddTitleData) obj;
                        int i7 = SelectedItemsFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.social.list.items.recycler.a) qg5Var, "<unused var>");
                        js3.p(profileListAddTitleData, "recyclerData");
                        pk5.g(selectedItemsFragment.J0, new NavIntentDirections.ProfileListTitle(new kl6(new DialogDataModel(selectedItemsFragment.U0(), "DIALOG_KEY_TITLE", null, 12), (String) profileListAddTitleData.a.getValue())), -1);
                        break;
                    default:
                        int i8 = SelectedItemsFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((vm7) qg5Var, "<unused var>");
                        js3.p((SelectedListAddItemData) obj, "<unused var>");
                        selectedItemsFragment.V0().r(SelectedItemsAction.AddMoreItem.INSTANCE);
                        break;
                }
            }
        };
        final int i6 = 5;
        c90Var.q = new og5(this) { // from class: sm7
            public final /* synthetic */ SelectedItemsFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i22 = i6;
                SelectedItemsFragment selectedItemsFragment = this.b;
                switch (i22) {
                    case 0:
                        ProfileAppData profileAppData = (ProfileAppData) obj;
                        int i32 = SelectedItemsFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.social.list.common.app.recycler.a) qg5Var, "<unused var>");
                        js3.p(profileAppData, "recyclerData");
                        selectedItemsFragment.W0(rs6.profile_list_selected_app_item_delete, profileAppData);
                        break;
                    case 1:
                        ProfileAppData profileAppData2 = (ProfileAppData) obj;
                        int i42 = SelectedItemsFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.social.list.common.app.recycler.a) qg5Var, "<unused var>");
                        js3.p(profileAppData2, "recyclerData");
                        selectedItemsFragment.V0().r(new SelectedItemsAction.MoveToTopItemAction(profileAppData2));
                        break;
                    case 2:
                        ProfileMovieData profileMovieData = (ProfileMovieData) obj;
                        int i52 = SelectedItemsFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.social.list.common.movie.recycler.a) qg5Var, "<unused var>");
                        js3.p(profileMovieData, "recyclerData");
                        selectedItemsFragment.W0(rs6.profile_list_selected_movie_item_delete, profileMovieData);
                        break;
                    case 3:
                        ProfileMovieData profileMovieData2 = (ProfileMovieData) obj;
                        int i62 = SelectedItemsFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.social.list.common.movie.recycler.a) qg5Var, "<unused var>");
                        js3.p(profileMovieData2, "recyclerData");
                        selectedItemsFragment.V0().r(new SelectedItemsAction.MoveToTopItemAction(profileMovieData2));
                        break;
                    case 4:
                        ProfileListAddTitleData profileListAddTitleData = (ProfileListAddTitleData) obj;
                        int i7 = SelectedItemsFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((ir.mservices.market.social.list.items.recycler.a) qg5Var, "<unused var>");
                        js3.p(profileListAddTitleData, "recyclerData");
                        pk5.g(selectedItemsFragment.J0, new NavIntentDirections.ProfileListTitle(new kl6(new DialogDataModel(selectedItemsFragment.U0(), "DIALOG_KEY_TITLE", null, 12), (String) profileListAddTitleData.a.getValue())), -1);
                        break;
                    default:
                        int i8 = SelectedItemsFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((vm7) qg5Var, "<unused var>");
                        js3.p((SelectedListAddItemData) obj, "<unused var>");
                        selectedItemsFragment.V0().r(SelectedItemsAction.AddMoreItem.INSTANCE);
                        break;
                }
            }
        };
        return c90Var;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final c E0() {
        return V0();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final View F0(ViewGroup viewGroup) {
        return null;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final d16 H0() {
        return new d16(0, 0, 0, K().getDimensionPixelSize(pq6.space_4), I0(), false, this.F0.f());
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final int I0() {
        return K().getInteger(ds6.social_items_custom_List_max_span);
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final String L0() {
        return null;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final boolean S0() {
        return false;
    }

    public final String U0() {
        return dw1.n("SelectedItemsFragment_", this.H0);
    }

    public final SelectedItemsViewModel V0() {
        return (SelectedItemsViewModel) this.Y0.getValue();
    }

    public final void W0(int i, SelectableRecyclerData selectableRecyclerData) {
        pk5.g(this.J0, new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(U0(), "DIALOG_KEY_DELETE", is3.g(new Pair("BUNDLE_KEY_DATA", selectableRecyclerData)), 8), null, L(i), L(rs6.button_remove), L(rs6.button_cancel), true)), -1);
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment, ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void b0() {
        super.b0();
        this.J0.x(U0());
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        this.J0.d(U0(), this);
    }
}
