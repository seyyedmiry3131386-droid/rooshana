package ir.mservices.market.social.profile.list;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle$State;
import defpackage.aw0;
import defpackage.bd;
import defpackage.bp2;
import defpackage.c24;
import defpackage.d16;
import defpackage.ds6;
import defpackage.dt2;
import defpackage.dw1;
import defpackage.el6;
import defpackage.em;
import defpackage.f88;
import defpackage.g27;
import defpackage.ga4;
import defpackage.ha4;
import defpackage.ia4;
import defpackage.is3;
import defpackage.j71;
import defpackage.ja4;
import defpackage.js3;
import defpackage.jx2;
import defpackage.mm2;
import defpackage.o79;
import defpackage.og5;
import defpackage.p3;
import defpackage.pk5;
import defpackage.pq6;
import defpackage.q79;
import defpackage.r50;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.x79;
import defpackage.xz4;
import ir.mservices.market.app.common.recycler.AppNestedData;
import ir.mservices.market.app.detail.ui.Tracker;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.data.AppBarSampleData;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.data.StartApplicationData;
import ir.mservices.market.model.paging.MyketPagingError;
import ir.mservices.market.movie.data.webapi.MovieDto;
import ir.mservices.market.movie.ui.common.MovieHomeMovieData;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.social.profile.list.ProfileListAction;
import ir.mservices.market.social.profile.list.ProfileListFragment;
import ir.mservices.market.social.profile.list.app.data.ProfileApplicationListDto;
import ir.mservices.market.social.profile.list.data.ReportListType;
import ir.mservices.market.social.profile.list.data.SocialListPolicies;
import ir.mservices.market.social.profile.list.data.SocialMessagingDto;
import ir.mservices.market.social.profile.list.movie.data.ProfileMovieListDto;
import ir.mservices.market.social.profile.list.recycler.ProfileListAddData;
import ir.mservices.market.social.profile.list.recycler.ProfileListButtonsData;
import ir.mservices.market.social.profile.list.recycler.ProfileListEmptyData;
import ir.mservices.market.social.profile.list.recycler.ProfileListTitleData;
import ir.mservices.market.social.profile.list.recycler.a;
import ir.mservices.market.social.profile.list.recycler.b;
import ir.mservices.market.social.profile.list.recycler.c;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.fragments.dialog.ReportDialogFragment;
import ir.mservices.market.version2.fragments.dialog.f;
import ir.mservices.market.version2.ui.recycler.data.LineMenuItemData;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import ir.mservices.market.views.TryAgainView;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class ProfileListFragment extends Hilt_ProfileListFragment implements mm2 {
    public static final /* synthetic */ int Z0 = 0;
    public final o79 Y0;

    public ProfileListFragment() {
        final ProfileListFragment$special$$inlined$viewModels$default$1 profileListFragment$special$$inlined$viewModels$default$1 = new ProfileListFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = kotlin.a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.social.profile.list.ProfileListFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) profileListFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.Y0 = new o79(g27.a(ProfileListViewModel.class), new bp2() { // from class: ir.mservices.market.social.profile.list.ProfileListFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.social.profile.list.ProfileListFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.social.profile.list.ProfileListFragment$special$$inlined$viewModels$default$4
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
        String string;
        js3.p(str, "requestKey");
        js3.p(bundle, "result");
        if (str.equalsIgnoreCase(U0())) {
            Object objP = dt2.p(bundle, "BUNDLE_KEY_DATA", DialogDataModel.class);
            js3.n(objP, "null cannot be cast to non-null type ir.mservices.market.version2.fragments.dialog.DialogDataModel");
            DialogDataModel dialogDataModel = (DialogDataModel) objP;
            Bundle bundle2 = dialogDataModel.c;
            String str2 = dialogDataModel.b;
            if ("DIALOG_KEY_TITLE_APP".equalsIgnoreCase(str2)) {
                if (dialogDataModel.d == DialogResult.a) {
                    Serializable serializableS = dt2.s(bundle2, "BUNDLE_KEY_POLICY", SocialListPolicies.class);
                    js3.n(serializableS, "null cannot be cast to non-null type ir.mservices.market.social.profile.list.data.SocialListPolicies");
                    SocialListPolicies socialListPolicies = (SocialListPolicies) serializableS;
                    String string2 = bundle.getString("BUNDLE_KEY_TITLE");
                    if (string2 != null) {
                        V0().r(ProfileListAction.ClearAll.INSTANCE);
                        pk5.g(this.J0, new NavIntentDirections.AppAddProfileList(new em(string2, socialListPolicies, null, new DialogDataModel(U0(), "DIALOG_KEY_REFRESH", null, 12))), -1);
                        return;
                    }
                    return;
                }
                return;
            }
            if ("DIALOG_KEY_TITLE_MOVIE".equalsIgnoreCase(str2)) {
                if (dialogDataModel.d == DialogResult.a) {
                    Serializable serializableS2 = dt2.s(bundle2, "BUNDLE_KEY_POLICY", SocialListPolicies.class);
                    js3.n(serializableS2, "null cannot be cast to non-null type ir.mservices.market.social.profile.list.data.SocialListPolicies");
                    SocialListPolicies socialListPolicies2 = (SocialListPolicies) serializableS2;
                    String string3 = bundle.getString("BUNDLE_KEY_TITLE");
                    if (string3 != null) {
                        V0().r(ProfileListAction.ClearAll.INSTANCE);
                        pk5.g(this.J0, new NavIntentDirections.MovieAddProfileList(new xz4(string3, socialListPolicies2, null, new DialogDataModel(U0(), "DIALOG_KEY_REFRESH", null, 12))), -1);
                        return;
                    }
                    return;
                }
                return;
            }
            if ("DIALOG_KEY_LIST_MORE".equalsIgnoreCase(str2)) {
                if (dialogDataModel.d == DialogResult.a) {
                    String string4 = bundle.getString("BUNDLE_KEY_ID");
                    if ("EDIT".equalsIgnoreCase(string4)) {
                        ProfileApplicationListDto profileApplicationListDto = (ProfileApplicationListDto) dt2.s(bundle2, "LIST_DATA_APPS", ProfileApplicationListDto.class);
                        if (profileApplicationListDto != null) {
                            V0().r(new ProfileListAction.EditAppsListAction(profileApplicationListDto));
                        }
                        ProfileMovieListDto profileMovieListDto = (ProfileMovieListDto) dt2.s(bundle2, "LIST_DATA_MOVIES", ProfileMovieListDto.class);
                        if (profileMovieListDto != null) {
                            V0().r(new ProfileListAction.EditMoviesListAction(profileMovieListDto));
                            return;
                        }
                        return;
                    }
                    if ("DELETE".equalsIgnoreCase(string4)) {
                        pk5.g(this.J0, new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(U0(), "DIALOG_KEY_DELETE_LIST", bundle2, 8), null, L(rs6.profile_list_delete_message), L(rs6.profile_list_delete_list), L(rs6.button_cancel), false)), -1);
                        return;
                    }
                    if ("MOVE_TO_TOP".equalsIgnoreCase(string4)) {
                        ProfileApplicationListDto profileApplicationListDto2 = (ProfileApplicationListDto) dt2.s(bundle2, "LIST_DATA_APPS", ProfileApplicationListDto.class);
                        if (profileApplicationListDto2 != null) {
                            V0().r(new ProfileListAction.MoveToTopListAction(profileApplicationListDto2.getKey()));
                        }
                        ProfileMovieListDto profileMovieListDto2 = (ProfileMovieListDto) dt2.s(bundle2, "LIST_DATA_MOVIES", ProfileMovieListDto.class);
                        if (profileMovieListDto2 != null) {
                            V0().r(new ProfileListAction.MoveToTopListAction(profileMovieListDto2.getKey()));
                            return;
                        }
                        return;
                    }
                    if ("REPORT".equalsIgnoreCase(string4)) {
                        ProfileApplicationListDto profileApplicationListDto3 = (ProfileApplicationListDto) dt2.s(bundle2, "LIST_DATA_APPS", ProfileApplicationListDto.class);
                        if (profileApplicationListDto3 != null) {
                            W0(profileApplicationListDto3.getKey(), true);
                        }
                        ProfileMovieListDto profileMovieListDto3 = (ProfileMovieListDto) dt2.s(bundle2, "LIST_DATA_MOVIES", ProfileMovieListDto.class);
                        if (profileMovieListDto3 != null) {
                            W0(profileMovieListDto3.getKey(), false);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if ("DIALOG_KEY_REFRESH".equalsIgnoreCase(str2)) {
                if (dialogDataModel.d == DialogResult.a) {
                    V0().r(new ProfileListAction.RefreshAction(true));
                    return;
                }
                return;
            }
            if ("DIALOG_KEY_DELETE_LIST".equalsIgnoreCase(str2)) {
                if (dialogDataModel.d == DialogResult.a) {
                    ProfileApplicationListDto profileApplicationListDto4 = (ProfileApplicationListDto) dt2.s(bundle2, "LIST_DATA_APPS", ProfileApplicationListDto.class);
                    if (profileApplicationListDto4 != null) {
                        V0().r(new ProfileListAction.DeleteListAction(profileApplicationListDto4.getKey()));
                    }
                    ProfileMovieListDto profileMovieListDto4 = (ProfileMovieListDto) dt2.s(bundle2, "LIST_DATA_MOVIES", ProfileMovieListDto.class);
                    if (profileMovieListDto4 != null) {
                        V0().r(new ProfileListAction.DeleteListAction(profileMovieListDto4.getKey()));
                        return;
                    }
                    return;
                }
                return;
            }
            if ("DIALOG_KEY_REPORT_LIST".equalsIgnoreCase(str2)) {
                if (dialogDataModel.d != DialogResult.a || (string = bundle2.getString("BUNDLE_KEY_LIST_TYPE")) == null) {
                    return;
                }
                ProfileListViewModel profileListViewModelV0 = V0();
                boolean z = bundle2.getBoolean("BUNDLE_KEY_IS_APP");
                int i = bundle.getInt("SELECT_INDEX");
                SparseArray sparseArray = new SparseArray();
                sparseArray.put(0, z ? ReportListType.APP_TITLE : ReportListType.MOVIE_TITLE);
                Object obj = sparseArray.get(i);
                js3.o(obj, "get(...)");
                profileListViewModelV0.r(new ProfileListAction.ReportListAction(string, (ReportListType) obj));
                return;
            }
            if ("DIALOG_KEY_ADD_LIST_TO_OWN".equalsIgnoreCase(str2) && dialogDataModel.d == DialogResult.a) {
                ProfileApplicationListDto profileApplicationListDto5 = (ProfileApplicationListDto) dt2.s(bundle2, "LIST_DATA_APPS", ProfileApplicationListDto.class);
                ProfileMovieListDto profileMovieListDto5 = (ProfileMovieListDto) dt2.s(bundle2, "LIST_DATA_MOVIES", ProfileMovieListDto.class);
                String string5 = bundle2.getString("BUNDLE_KEY_TITLE");
                if (string5 != null) {
                    r50 addAppListToOwnProfileAction = profileApplicationListDto5 != null ? new ProfileListAction.AddAppListToOwnProfileAction(string5, profileApplicationListDto5.getApps()) : profileMovieListDto5 != null ? new ProfileListAction.AddMovieListToOwnProfileAction(string5, profileMovieListDto5.getMovies()) : null;
                    if (addAppListToOwnProfileAction != null) {
                        V0().r(addAppListToOwnProfileAction);
                    }
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [gl6] */
    /* JADX WARN: Type inference failed for: r1v11, types: [gl6] */
    /* JADX WARN: Type inference failed for: r1v12, types: [gl6] */
    /* JADX WARN: Type inference failed for: r1v13, types: [gl6] */
    /* JADX WARN: Type inference failed for: r1v4, types: [gl6] */
    /* JADX WARN: Type inference failed for: r1v5, types: [gl6] */
    /* JADX WARN: Type inference failed for: r1v6, types: [gl6] */
    /* JADX WARN: Type inference failed for: r1v7, types: [gl6] */
    /* JADX WARN: Type inference failed for: r1v8, types: [gl6] */
    /* JADX WARN: Type inference failed for: r1v9, types: [gl6] */
    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final ir.mservices.market.version2.ui.recycler.adapter.a D0() {
        el6 el6Var = new el6(this.F0.f());
        el6Var.w = p3.g(F());
        final int i = 0;
        el6Var.m = new og5(this) { // from class: gl6
            public final /* synthetic */ ProfileListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                LineMenuItemData[] lineMenuItemDataArr;
                RecyclerItem recyclerItem;
                String key;
                String key2;
                int i2 = i;
                ProfileListFragment profileListFragment = this.b;
                switch (i2) {
                    case 0:
                        int i3 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p((ProfileListEmptyData) obj, "<unused var>");
                        profileListFragment.V0().r(ProfileListAction.AddListAction.INSTANCE);
                        break;
                    case 1:
                        int i4 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p((ProfileListAddData) obj, "<unused var>");
                        profileListFragment.V0().r(ProfileListAction.AddListAction.INSTANCE);
                        break;
                    case 2:
                        ProfileListTitleData profileListTitleData = (ProfileListTitleData) obj;
                        int i5 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((ml6) qg5Var, "<unused var>");
                        js3.p(profileListTitleData, "recyclerData");
                        Bundle bundle = profileListFragment.g;
                        if ((bundle != null ? bundle.getString("BUNDLE_KEY_ACCOUNT_KEY") : null) != null) {
                            lineMenuItemDataArr = (LineMenuItemData[]) br9.E(new LineMenuItemData("REPORT", profileListFragment.L(rs6.profile_list_report_list), sj8.b().A)).toArray(new LineMenuItemData[0]);
                        } else {
                            ir.mservices.market.version2.ui.recycler.adapter.a aVar = profileListFragment.P0;
                            MyketRecyclerData myketRecyclerData = (aVar == null || (recyclerItem = (RecyclerItem) kotlin.collections.a.q0(1, (ArrayList) aVar.D().d)) == null) ? null : recyclerItem.c;
                            ProfileListTitleData profileListTitleData2 = myketRecyclerData instanceof ProfileListTitleData ? (ProfileListTitleData) myketRecyclerData : null;
                            boolean zI = js3.i(profileListTitleData2 != null ? profileListTitleData2.getUniqueId() : null, profileListTitleData.getUniqueId());
                            ArrayList arrayListE = br9.E(new LineMenuItemData("EDIT", profileListFragment.L(rs6.profile_list_edit_list)), new LineMenuItemData("DELETE", profileListFragment.L(rs6.profile_list_delete_list), sj8.b().A));
                            if (!zI) {
                                arrayListE.add(1, new LineMenuItemData("MOVE_TO_TOP", profileListFragment.L(rs6.profile_list_move_to_top_list)));
                            }
                            lineMenuItemDataArr = (LineMenuItemData[]) arrayListE.toArray(new LineMenuItemData[0]);
                        }
                        String strU0 = profileListFragment.U0();
                        Bundle bundle2 = new Bundle();
                        bundle2.putSerializable("LIST_DATA_APPS", profileListTitleData.b);
                        bundle2.putSerializable("LIST_DATA_MOVIES", profileListTitleData.c);
                        pk5.g(profileListFragment.J0, new NavIntentDirections.LineMenu(new c74(new DialogDataModel(strU0, "DIALOG_KEY_LIST_MORE", bundle2, 8), lineMenuItemDataArr, null)), -1);
                        break;
                    case 3:
                        bq bqVar = (bq) qg5Var;
                        AppNestedData appNestedData = (AppNestedData) obj;
                        int i6 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p(bqVar, "viewHolder");
                        js3.p(appNestedData, "recyclerData");
                        ApplicationDTO applicationDTO = appNestedData.a;
                        if (applicationDTO != null) {
                            ImageView imageViewX = bqVar.x();
                            Tracker tracker = new Tracker("social", null, "horizontalList");
                            String iconPath = applicationDTO.getIconPath();
                            js3.o(iconPath, "getIconPath(...)");
                            String title = applicationDTO.getTitle();
                            js3.o(title, "getTitle(...)");
                            String packageName = applicationDTO.getPackageName();
                            js3.o(packageName, "getPackageName(...)");
                            StartApplicationData startApplicationData = new StartApplicationData(new AppBarSampleData(iconPath, title, packageName, null, applicationDTO.getTagline(), null, null, null, 232, null), applicationDTO.getInstallCallbackUrl(), applicationDTO.getClickCallback());
                            String packageName2 = applicationDTO.getPackageName();
                            js3.o(packageName2, "getPackageName(...)");
                            boolean z = profileListFragment.G0().b(imageViewX.getDrawable()) != null;
                            String refId = applicationDTO.getRefId();
                            js3.o(refId, "getRefId(...)");
                            pk5.f(profileListFragment.J0, new NavIntentDirections.AppDetail(new hp(packageName2, false, tracker, z, null, refId, applicationDTO.getCallbackUrl(), null, startApplicationData, null, null, null, null)));
                        }
                        break;
                    case 4:
                        ProfileListButtonsData profileListButtonsData = (ProfileListButtonsData) obj;
                        int i7 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(profileListButtonsData, "recyclerData");
                        FragmentActivity fragmentActivityF = profileListFragment.F();
                        SocialMessagingDto socialMessagingDto = profileListButtonsData.d;
                        String intent = socialMessagingDto != null ? socialMessagingDto.getIntent() : null;
                        if (intent != null) {
                            t61.w(intent, "parse(...)", fragmentActivityF, NearbyRepository.SERVICE_ID, null);
                        }
                        break;
                    case 5:
                        ProfileListTitleData profileListTitleData3 = (ProfileListTitleData) obj;
                        int i8 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((ml6) qg5Var, "<unused var>");
                        js3.p(profileListTitleData3, "recyclerData");
                        if (profileListTitleData3.b == null) {
                            DialogDataModel dialogDataModel = new DialogDataModel(profileListFragment.U0(), "DIALOG_KEY_REFRESH", null, 12);
                            Bundle bundle3 = profileListFragment.g;
                            pk5.g(profileListFragment.J0, new NavIntentDirections.ProfileMovieListMore(new pl6(dialogDataModel, profileListTitleData3, bundle3 != null ? bundle3.getString("BUNDLE_KEY_ACCOUNT_KEY") : null)), -1);
                        } else {
                            DialogDataModel dialogDataModel2 = new DialogDataModel(profileListFragment.U0(), "DIALOG_KEY_REFRESH", null, 12);
                            Bundle bundle4 = profileListFragment.g;
                            pk5.g(profileListFragment.J0, new NavIntentDirections.ProfileAppListMore(new yk6(dialogDataModel2, profileListTitleData3, bundle4 != null ? bundle4.getString("BUNDLE_KEY_ACCOUNT_KEY") : null)), -1);
                        }
                        break;
                    case 6:
                        ProfileListButtonsData profileListButtonsData2 = (ProfileListButtonsData) obj;
                        int i9 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(profileListButtonsData2, "recyclerData");
                        pk5.g(profileListFragment.J0, new NavIntentDirections.ProfileAddList(new tk6(new DialogDataModel(profileListFragment.U0(), "DIALOG_KEY_ADD_LIST_TO_OWN", is3.g(new Pair("BUNDLE_KEY_TITLE", profileListButtonsData2.a), new Pair("LIST_DATA_APPS", profileListButtonsData2.b), new Pair("LIST_DATA_MOVIES", profileListButtonsData2.c)), 8))), -1);
                        break;
                    case 7:
                        MovieHomeMovieData movieHomeMovieData = (MovieHomeMovieData) obj;
                        int i10 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((s35) qg5Var, "<unused var>");
                        js3.p(movieHomeMovieData, "recyclerData");
                        MovieDto movieDto = movieHomeMovieData.a;
                        String action = movieDto.getAction();
                        if (action == null || f88.n0(action)) {
                            pk5.g(profileListFragment.J0, new NavIntentDirections.MovieDetail(new v15(movieDto.getId(), movieDto.getRefId(), false, movieDto.getPosterUrl(), null)), -1);
                        } else {
                            FragmentActivity fragmentActivityF2 = profileListFragment.F();
                            String action2 = movieDto.getAction();
                            if (action2 != null) {
                                t61.w(action2, "parse(...)", fragmentActivityF2, null, null);
                            }
                        }
                        break;
                    case 8:
                        ProfileListButtonsData profileListButtonsData3 = (ProfileListButtonsData) obj;
                        int i11 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(profileListButtonsData3, "recyclerData");
                        ProfileApplicationListDto profileApplicationListDto = profileListButtonsData3.b;
                        if (profileApplicationListDto == null || (key = profileApplicationListDto.getKey()) == null) {
                            ProfileMovieListDto profileMovieListDto = profileListButtonsData3.c;
                            if (profileMovieListDto != null) {
                                key = profileMovieListDto.getKey();
                            }
                        } else {
                            key = key;
                        }
                        if (key != null) {
                            profileListFragment.V0().r(new ProfileListAction.LikeListAction(key));
                        }
                        break;
                    default:
                        ProfileListButtonsData profileListButtonsData4 = (ProfileListButtonsData) obj;
                        int i12 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(profileListButtonsData4, "recyclerData");
                        ProfileApplicationListDto profileApplicationListDto2 = profileListButtonsData4.b;
                        if (profileApplicationListDto2 == null || (key2 = profileApplicationListDto2.getKey()) == null) {
                            ProfileMovieListDto profileMovieListDto2 = profileListButtonsData4.c;
                            if (profileMovieListDto2 != null) {
                                key = profileMovieListDto2.getKey();
                            }
                        } else {
                            key = key2;
                        }
                        if (key != null) {
                            profileListFragment.V0().r(new ProfileListAction.RemoveLikeListAction(key));
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        el6Var.n = new og5(this) { // from class: gl6
            public final /* synthetic */ ProfileListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                LineMenuItemData[] lineMenuItemDataArr;
                RecyclerItem recyclerItem;
                String key;
                String key2;
                int i22 = i2;
                ProfileListFragment profileListFragment = this.b;
                switch (i22) {
                    case 0:
                        int i3 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p((ProfileListEmptyData) obj, "<unused var>");
                        profileListFragment.V0().r(ProfileListAction.AddListAction.INSTANCE);
                        break;
                    case 1:
                        int i4 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p((ProfileListAddData) obj, "<unused var>");
                        profileListFragment.V0().r(ProfileListAction.AddListAction.INSTANCE);
                        break;
                    case 2:
                        ProfileListTitleData profileListTitleData = (ProfileListTitleData) obj;
                        int i5 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((ml6) qg5Var, "<unused var>");
                        js3.p(profileListTitleData, "recyclerData");
                        Bundle bundle = profileListFragment.g;
                        if ((bundle != null ? bundle.getString("BUNDLE_KEY_ACCOUNT_KEY") : null) != null) {
                            lineMenuItemDataArr = (LineMenuItemData[]) br9.E(new LineMenuItemData("REPORT", profileListFragment.L(rs6.profile_list_report_list), sj8.b().A)).toArray(new LineMenuItemData[0]);
                        } else {
                            ir.mservices.market.version2.ui.recycler.adapter.a aVar = profileListFragment.P0;
                            MyketRecyclerData myketRecyclerData = (aVar == null || (recyclerItem = (RecyclerItem) kotlin.collections.a.q0(1, (ArrayList) aVar.D().d)) == null) ? null : recyclerItem.c;
                            ProfileListTitleData profileListTitleData2 = myketRecyclerData instanceof ProfileListTitleData ? (ProfileListTitleData) myketRecyclerData : null;
                            boolean zI = js3.i(profileListTitleData2 != null ? profileListTitleData2.getUniqueId() : null, profileListTitleData.getUniqueId());
                            ArrayList arrayListE = br9.E(new LineMenuItemData("EDIT", profileListFragment.L(rs6.profile_list_edit_list)), new LineMenuItemData("DELETE", profileListFragment.L(rs6.profile_list_delete_list), sj8.b().A));
                            if (!zI) {
                                arrayListE.add(1, new LineMenuItemData("MOVE_TO_TOP", profileListFragment.L(rs6.profile_list_move_to_top_list)));
                            }
                            lineMenuItemDataArr = (LineMenuItemData[]) arrayListE.toArray(new LineMenuItemData[0]);
                        }
                        String strU0 = profileListFragment.U0();
                        Bundle bundle2 = new Bundle();
                        bundle2.putSerializable("LIST_DATA_APPS", profileListTitleData.b);
                        bundle2.putSerializable("LIST_DATA_MOVIES", profileListTitleData.c);
                        pk5.g(profileListFragment.J0, new NavIntentDirections.LineMenu(new c74(new DialogDataModel(strU0, "DIALOG_KEY_LIST_MORE", bundle2, 8), lineMenuItemDataArr, null)), -1);
                        break;
                    case 3:
                        bq bqVar = (bq) qg5Var;
                        AppNestedData appNestedData = (AppNestedData) obj;
                        int i6 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p(bqVar, "viewHolder");
                        js3.p(appNestedData, "recyclerData");
                        ApplicationDTO applicationDTO = appNestedData.a;
                        if (applicationDTO != null) {
                            ImageView imageViewX = bqVar.x();
                            Tracker tracker = new Tracker("social", null, "horizontalList");
                            String iconPath = applicationDTO.getIconPath();
                            js3.o(iconPath, "getIconPath(...)");
                            String title = applicationDTO.getTitle();
                            js3.o(title, "getTitle(...)");
                            String packageName = applicationDTO.getPackageName();
                            js3.o(packageName, "getPackageName(...)");
                            StartApplicationData startApplicationData = new StartApplicationData(new AppBarSampleData(iconPath, title, packageName, null, applicationDTO.getTagline(), null, null, null, 232, null), applicationDTO.getInstallCallbackUrl(), applicationDTO.getClickCallback());
                            String packageName2 = applicationDTO.getPackageName();
                            js3.o(packageName2, "getPackageName(...)");
                            boolean z = profileListFragment.G0().b(imageViewX.getDrawable()) != null;
                            String refId = applicationDTO.getRefId();
                            js3.o(refId, "getRefId(...)");
                            pk5.f(profileListFragment.J0, new NavIntentDirections.AppDetail(new hp(packageName2, false, tracker, z, null, refId, applicationDTO.getCallbackUrl(), null, startApplicationData, null, null, null, null)));
                        }
                        break;
                    case 4:
                        ProfileListButtonsData profileListButtonsData = (ProfileListButtonsData) obj;
                        int i7 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(profileListButtonsData, "recyclerData");
                        FragmentActivity fragmentActivityF = profileListFragment.F();
                        SocialMessagingDto socialMessagingDto = profileListButtonsData.d;
                        String intent = socialMessagingDto != null ? socialMessagingDto.getIntent() : null;
                        if (intent != null) {
                            t61.w(intent, "parse(...)", fragmentActivityF, NearbyRepository.SERVICE_ID, null);
                        }
                        break;
                    case 5:
                        ProfileListTitleData profileListTitleData3 = (ProfileListTitleData) obj;
                        int i8 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((ml6) qg5Var, "<unused var>");
                        js3.p(profileListTitleData3, "recyclerData");
                        if (profileListTitleData3.b == null) {
                            DialogDataModel dialogDataModel = new DialogDataModel(profileListFragment.U0(), "DIALOG_KEY_REFRESH", null, 12);
                            Bundle bundle3 = profileListFragment.g;
                            pk5.g(profileListFragment.J0, new NavIntentDirections.ProfileMovieListMore(new pl6(dialogDataModel, profileListTitleData3, bundle3 != null ? bundle3.getString("BUNDLE_KEY_ACCOUNT_KEY") : null)), -1);
                        } else {
                            DialogDataModel dialogDataModel2 = new DialogDataModel(profileListFragment.U0(), "DIALOG_KEY_REFRESH", null, 12);
                            Bundle bundle4 = profileListFragment.g;
                            pk5.g(profileListFragment.J0, new NavIntentDirections.ProfileAppListMore(new yk6(dialogDataModel2, profileListTitleData3, bundle4 != null ? bundle4.getString("BUNDLE_KEY_ACCOUNT_KEY") : null)), -1);
                        }
                        break;
                    case 6:
                        ProfileListButtonsData profileListButtonsData2 = (ProfileListButtonsData) obj;
                        int i9 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(profileListButtonsData2, "recyclerData");
                        pk5.g(profileListFragment.J0, new NavIntentDirections.ProfileAddList(new tk6(new DialogDataModel(profileListFragment.U0(), "DIALOG_KEY_ADD_LIST_TO_OWN", is3.g(new Pair("BUNDLE_KEY_TITLE", profileListButtonsData2.a), new Pair("LIST_DATA_APPS", profileListButtonsData2.b), new Pair("LIST_DATA_MOVIES", profileListButtonsData2.c)), 8))), -1);
                        break;
                    case 7:
                        MovieHomeMovieData movieHomeMovieData = (MovieHomeMovieData) obj;
                        int i10 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((s35) qg5Var, "<unused var>");
                        js3.p(movieHomeMovieData, "recyclerData");
                        MovieDto movieDto = movieHomeMovieData.a;
                        String action = movieDto.getAction();
                        if (action == null || f88.n0(action)) {
                            pk5.g(profileListFragment.J0, new NavIntentDirections.MovieDetail(new v15(movieDto.getId(), movieDto.getRefId(), false, movieDto.getPosterUrl(), null)), -1);
                        } else {
                            FragmentActivity fragmentActivityF2 = profileListFragment.F();
                            String action2 = movieDto.getAction();
                            if (action2 != null) {
                                t61.w(action2, "parse(...)", fragmentActivityF2, null, null);
                            }
                        }
                        break;
                    case 8:
                        ProfileListButtonsData profileListButtonsData3 = (ProfileListButtonsData) obj;
                        int i11 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(profileListButtonsData3, "recyclerData");
                        ProfileApplicationListDto profileApplicationListDto = profileListButtonsData3.b;
                        if (profileApplicationListDto == null || (key = profileApplicationListDto.getKey()) == null) {
                            ProfileMovieListDto profileMovieListDto = profileListButtonsData3.c;
                            if (profileMovieListDto != null) {
                                key = profileMovieListDto.getKey();
                            }
                        } else {
                            key = key;
                        }
                        if (key != null) {
                            profileListFragment.V0().r(new ProfileListAction.LikeListAction(key));
                        }
                        break;
                    default:
                        ProfileListButtonsData profileListButtonsData4 = (ProfileListButtonsData) obj;
                        int i12 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(profileListButtonsData4, "recyclerData");
                        ProfileApplicationListDto profileApplicationListDto2 = profileListButtonsData4.b;
                        if (profileApplicationListDto2 == null || (key2 = profileApplicationListDto2.getKey()) == null) {
                            ProfileMovieListDto profileMovieListDto2 = profileListButtonsData4.c;
                            if (profileMovieListDto2 != null) {
                                key = profileMovieListDto2.getKey();
                            }
                        } else {
                            key = key2;
                        }
                        if (key != null) {
                            profileListFragment.V0().r(new ProfileListAction.RemoveLikeListAction(key));
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        el6Var.o = new og5(this) { // from class: gl6
            public final /* synthetic */ ProfileListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                LineMenuItemData[] lineMenuItemDataArr;
                RecyclerItem recyclerItem;
                String key;
                String key2;
                int i22 = i3;
                ProfileListFragment profileListFragment = this.b;
                switch (i22) {
                    case 0:
                        int i32 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p((ProfileListEmptyData) obj, "<unused var>");
                        profileListFragment.V0().r(ProfileListAction.AddListAction.INSTANCE);
                        break;
                    case 1:
                        int i4 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p((ProfileListAddData) obj, "<unused var>");
                        profileListFragment.V0().r(ProfileListAction.AddListAction.INSTANCE);
                        break;
                    case 2:
                        ProfileListTitleData profileListTitleData = (ProfileListTitleData) obj;
                        int i5 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((ml6) qg5Var, "<unused var>");
                        js3.p(profileListTitleData, "recyclerData");
                        Bundle bundle = profileListFragment.g;
                        if ((bundle != null ? bundle.getString("BUNDLE_KEY_ACCOUNT_KEY") : null) != null) {
                            lineMenuItemDataArr = (LineMenuItemData[]) br9.E(new LineMenuItemData("REPORT", profileListFragment.L(rs6.profile_list_report_list), sj8.b().A)).toArray(new LineMenuItemData[0]);
                        } else {
                            ir.mservices.market.version2.ui.recycler.adapter.a aVar = profileListFragment.P0;
                            MyketRecyclerData myketRecyclerData = (aVar == null || (recyclerItem = (RecyclerItem) kotlin.collections.a.q0(1, (ArrayList) aVar.D().d)) == null) ? null : recyclerItem.c;
                            ProfileListTitleData profileListTitleData2 = myketRecyclerData instanceof ProfileListTitleData ? (ProfileListTitleData) myketRecyclerData : null;
                            boolean zI = js3.i(profileListTitleData2 != null ? profileListTitleData2.getUniqueId() : null, profileListTitleData.getUniqueId());
                            ArrayList arrayListE = br9.E(new LineMenuItemData("EDIT", profileListFragment.L(rs6.profile_list_edit_list)), new LineMenuItemData("DELETE", profileListFragment.L(rs6.profile_list_delete_list), sj8.b().A));
                            if (!zI) {
                                arrayListE.add(1, new LineMenuItemData("MOVE_TO_TOP", profileListFragment.L(rs6.profile_list_move_to_top_list)));
                            }
                            lineMenuItemDataArr = (LineMenuItemData[]) arrayListE.toArray(new LineMenuItemData[0]);
                        }
                        String strU0 = profileListFragment.U0();
                        Bundle bundle2 = new Bundle();
                        bundle2.putSerializable("LIST_DATA_APPS", profileListTitleData.b);
                        bundle2.putSerializable("LIST_DATA_MOVIES", profileListTitleData.c);
                        pk5.g(profileListFragment.J0, new NavIntentDirections.LineMenu(new c74(new DialogDataModel(strU0, "DIALOG_KEY_LIST_MORE", bundle2, 8), lineMenuItemDataArr, null)), -1);
                        break;
                    case 3:
                        bq bqVar = (bq) qg5Var;
                        AppNestedData appNestedData = (AppNestedData) obj;
                        int i6 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p(bqVar, "viewHolder");
                        js3.p(appNestedData, "recyclerData");
                        ApplicationDTO applicationDTO = appNestedData.a;
                        if (applicationDTO != null) {
                            ImageView imageViewX = bqVar.x();
                            Tracker tracker = new Tracker("social", null, "horizontalList");
                            String iconPath = applicationDTO.getIconPath();
                            js3.o(iconPath, "getIconPath(...)");
                            String title = applicationDTO.getTitle();
                            js3.o(title, "getTitle(...)");
                            String packageName = applicationDTO.getPackageName();
                            js3.o(packageName, "getPackageName(...)");
                            StartApplicationData startApplicationData = new StartApplicationData(new AppBarSampleData(iconPath, title, packageName, null, applicationDTO.getTagline(), null, null, null, 232, null), applicationDTO.getInstallCallbackUrl(), applicationDTO.getClickCallback());
                            String packageName2 = applicationDTO.getPackageName();
                            js3.o(packageName2, "getPackageName(...)");
                            boolean z = profileListFragment.G0().b(imageViewX.getDrawable()) != null;
                            String refId = applicationDTO.getRefId();
                            js3.o(refId, "getRefId(...)");
                            pk5.f(profileListFragment.J0, new NavIntentDirections.AppDetail(new hp(packageName2, false, tracker, z, null, refId, applicationDTO.getCallbackUrl(), null, startApplicationData, null, null, null, null)));
                        }
                        break;
                    case 4:
                        ProfileListButtonsData profileListButtonsData = (ProfileListButtonsData) obj;
                        int i7 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(profileListButtonsData, "recyclerData");
                        FragmentActivity fragmentActivityF = profileListFragment.F();
                        SocialMessagingDto socialMessagingDto = profileListButtonsData.d;
                        String intent = socialMessagingDto != null ? socialMessagingDto.getIntent() : null;
                        if (intent != null) {
                            t61.w(intent, "parse(...)", fragmentActivityF, NearbyRepository.SERVICE_ID, null);
                        }
                        break;
                    case 5:
                        ProfileListTitleData profileListTitleData3 = (ProfileListTitleData) obj;
                        int i8 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((ml6) qg5Var, "<unused var>");
                        js3.p(profileListTitleData3, "recyclerData");
                        if (profileListTitleData3.b == null) {
                            DialogDataModel dialogDataModel = new DialogDataModel(profileListFragment.U0(), "DIALOG_KEY_REFRESH", null, 12);
                            Bundle bundle3 = profileListFragment.g;
                            pk5.g(profileListFragment.J0, new NavIntentDirections.ProfileMovieListMore(new pl6(dialogDataModel, profileListTitleData3, bundle3 != null ? bundle3.getString("BUNDLE_KEY_ACCOUNT_KEY") : null)), -1);
                        } else {
                            DialogDataModel dialogDataModel2 = new DialogDataModel(profileListFragment.U0(), "DIALOG_KEY_REFRESH", null, 12);
                            Bundle bundle4 = profileListFragment.g;
                            pk5.g(profileListFragment.J0, new NavIntentDirections.ProfileAppListMore(new yk6(dialogDataModel2, profileListTitleData3, bundle4 != null ? bundle4.getString("BUNDLE_KEY_ACCOUNT_KEY") : null)), -1);
                        }
                        break;
                    case 6:
                        ProfileListButtonsData profileListButtonsData2 = (ProfileListButtonsData) obj;
                        int i9 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(profileListButtonsData2, "recyclerData");
                        pk5.g(profileListFragment.J0, new NavIntentDirections.ProfileAddList(new tk6(new DialogDataModel(profileListFragment.U0(), "DIALOG_KEY_ADD_LIST_TO_OWN", is3.g(new Pair("BUNDLE_KEY_TITLE", profileListButtonsData2.a), new Pair("LIST_DATA_APPS", profileListButtonsData2.b), new Pair("LIST_DATA_MOVIES", profileListButtonsData2.c)), 8))), -1);
                        break;
                    case 7:
                        MovieHomeMovieData movieHomeMovieData = (MovieHomeMovieData) obj;
                        int i10 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((s35) qg5Var, "<unused var>");
                        js3.p(movieHomeMovieData, "recyclerData");
                        MovieDto movieDto = movieHomeMovieData.a;
                        String action = movieDto.getAction();
                        if (action == null || f88.n0(action)) {
                            pk5.g(profileListFragment.J0, new NavIntentDirections.MovieDetail(new v15(movieDto.getId(), movieDto.getRefId(), false, movieDto.getPosterUrl(), null)), -1);
                        } else {
                            FragmentActivity fragmentActivityF2 = profileListFragment.F();
                            String action2 = movieDto.getAction();
                            if (action2 != null) {
                                t61.w(action2, "parse(...)", fragmentActivityF2, null, null);
                            }
                        }
                        break;
                    case 8:
                        ProfileListButtonsData profileListButtonsData3 = (ProfileListButtonsData) obj;
                        int i11 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(profileListButtonsData3, "recyclerData");
                        ProfileApplicationListDto profileApplicationListDto = profileListButtonsData3.b;
                        if (profileApplicationListDto == null || (key = profileApplicationListDto.getKey()) == null) {
                            ProfileMovieListDto profileMovieListDto = profileListButtonsData3.c;
                            if (profileMovieListDto != null) {
                                key = profileMovieListDto.getKey();
                            }
                        } else {
                            key = key;
                        }
                        if (key != null) {
                            profileListFragment.V0().r(new ProfileListAction.LikeListAction(key));
                        }
                        break;
                    default:
                        ProfileListButtonsData profileListButtonsData4 = (ProfileListButtonsData) obj;
                        int i12 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(profileListButtonsData4, "recyclerData");
                        ProfileApplicationListDto profileApplicationListDto2 = profileListButtonsData4.b;
                        if (profileApplicationListDto2 == null || (key2 = profileApplicationListDto2.getKey()) == null) {
                            ProfileMovieListDto profileMovieListDto2 = profileListButtonsData4.c;
                            if (profileMovieListDto2 != null) {
                                key = profileMovieListDto2.getKey();
                            }
                        } else {
                            key = key2;
                        }
                        if (key != null) {
                            profileListFragment.V0().r(new ProfileListAction.RemoveLikeListAction(key));
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        el6Var.u = new og5(this) { // from class: gl6
            public final /* synthetic */ ProfileListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                LineMenuItemData[] lineMenuItemDataArr;
                RecyclerItem recyclerItem;
                String key;
                String key2;
                int i22 = i4;
                ProfileListFragment profileListFragment = this.b;
                switch (i22) {
                    case 0:
                        int i32 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p((ProfileListEmptyData) obj, "<unused var>");
                        profileListFragment.V0().r(ProfileListAction.AddListAction.INSTANCE);
                        break;
                    case 1:
                        int i42 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p((ProfileListAddData) obj, "<unused var>");
                        profileListFragment.V0().r(ProfileListAction.AddListAction.INSTANCE);
                        break;
                    case 2:
                        ProfileListTitleData profileListTitleData = (ProfileListTitleData) obj;
                        int i5 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((ml6) qg5Var, "<unused var>");
                        js3.p(profileListTitleData, "recyclerData");
                        Bundle bundle = profileListFragment.g;
                        if ((bundle != null ? bundle.getString("BUNDLE_KEY_ACCOUNT_KEY") : null) != null) {
                            lineMenuItemDataArr = (LineMenuItemData[]) br9.E(new LineMenuItemData("REPORT", profileListFragment.L(rs6.profile_list_report_list), sj8.b().A)).toArray(new LineMenuItemData[0]);
                        } else {
                            ir.mservices.market.version2.ui.recycler.adapter.a aVar = profileListFragment.P0;
                            MyketRecyclerData myketRecyclerData = (aVar == null || (recyclerItem = (RecyclerItem) kotlin.collections.a.q0(1, (ArrayList) aVar.D().d)) == null) ? null : recyclerItem.c;
                            ProfileListTitleData profileListTitleData2 = myketRecyclerData instanceof ProfileListTitleData ? (ProfileListTitleData) myketRecyclerData : null;
                            boolean zI = js3.i(profileListTitleData2 != null ? profileListTitleData2.getUniqueId() : null, profileListTitleData.getUniqueId());
                            ArrayList arrayListE = br9.E(new LineMenuItemData("EDIT", profileListFragment.L(rs6.profile_list_edit_list)), new LineMenuItemData("DELETE", profileListFragment.L(rs6.profile_list_delete_list), sj8.b().A));
                            if (!zI) {
                                arrayListE.add(1, new LineMenuItemData("MOVE_TO_TOP", profileListFragment.L(rs6.profile_list_move_to_top_list)));
                            }
                            lineMenuItemDataArr = (LineMenuItemData[]) arrayListE.toArray(new LineMenuItemData[0]);
                        }
                        String strU0 = profileListFragment.U0();
                        Bundle bundle2 = new Bundle();
                        bundle2.putSerializable("LIST_DATA_APPS", profileListTitleData.b);
                        bundle2.putSerializable("LIST_DATA_MOVIES", profileListTitleData.c);
                        pk5.g(profileListFragment.J0, new NavIntentDirections.LineMenu(new c74(new DialogDataModel(strU0, "DIALOG_KEY_LIST_MORE", bundle2, 8), lineMenuItemDataArr, null)), -1);
                        break;
                    case 3:
                        bq bqVar = (bq) qg5Var;
                        AppNestedData appNestedData = (AppNestedData) obj;
                        int i6 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p(bqVar, "viewHolder");
                        js3.p(appNestedData, "recyclerData");
                        ApplicationDTO applicationDTO = appNestedData.a;
                        if (applicationDTO != null) {
                            ImageView imageViewX = bqVar.x();
                            Tracker tracker = new Tracker("social", null, "horizontalList");
                            String iconPath = applicationDTO.getIconPath();
                            js3.o(iconPath, "getIconPath(...)");
                            String title = applicationDTO.getTitle();
                            js3.o(title, "getTitle(...)");
                            String packageName = applicationDTO.getPackageName();
                            js3.o(packageName, "getPackageName(...)");
                            StartApplicationData startApplicationData = new StartApplicationData(new AppBarSampleData(iconPath, title, packageName, null, applicationDTO.getTagline(), null, null, null, 232, null), applicationDTO.getInstallCallbackUrl(), applicationDTO.getClickCallback());
                            String packageName2 = applicationDTO.getPackageName();
                            js3.o(packageName2, "getPackageName(...)");
                            boolean z = profileListFragment.G0().b(imageViewX.getDrawable()) != null;
                            String refId = applicationDTO.getRefId();
                            js3.o(refId, "getRefId(...)");
                            pk5.f(profileListFragment.J0, new NavIntentDirections.AppDetail(new hp(packageName2, false, tracker, z, null, refId, applicationDTO.getCallbackUrl(), null, startApplicationData, null, null, null, null)));
                        }
                        break;
                    case 4:
                        ProfileListButtonsData profileListButtonsData = (ProfileListButtonsData) obj;
                        int i7 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(profileListButtonsData, "recyclerData");
                        FragmentActivity fragmentActivityF = profileListFragment.F();
                        SocialMessagingDto socialMessagingDto = profileListButtonsData.d;
                        String intent = socialMessagingDto != null ? socialMessagingDto.getIntent() : null;
                        if (intent != null) {
                            t61.w(intent, "parse(...)", fragmentActivityF, NearbyRepository.SERVICE_ID, null);
                        }
                        break;
                    case 5:
                        ProfileListTitleData profileListTitleData3 = (ProfileListTitleData) obj;
                        int i8 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((ml6) qg5Var, "<unused var>");
                        js3.p(profileListTitleData3, "recyclerData");
                        if (profileListTitleData3.b == null) {
                            DialogDataModel dialogDataModel = new DialogDataModel(profileListFragment.U0(), "DIALOG_KEY_REFRESH", null, 12);
                            Bundle bundle3 = profileListFragment.g;
                            pk5.g(profileListFragment.J0, new NavIntentDirections.ProfileMovieListMore(new pl6(dialogDataModel, profileListTitleData3, bundle3 != null ? bundle3.getString("BUNDLE_KEY_ACCOUNT_KEY") : null)), -1);
                        } else {
                            DialogDataModel dialogDataModel2 = new DialogDataModel(profileListFragment.U0(), "DIALOG_KEY_REFRESH", null, 12);
                            Bundle bundle4 = profileListFragment.g;
                            pk5.g(profileListFragment.J0, new NavIntentDirections.ProfileAppListMore(new yk6(dialogDataModel2, profileListTitleData3, bundle4 != null ? bundle4.getString("BUNDLE_KEY_ACCOUNT_KEY") : null)), -1);
                        }
                        break;
                    case 6:
                        ProfileListButtonsData profileListButtonsData2 = (ProfileListButtonsData) obj;
                        int i9 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(profileListButtonsData2, "recyclerData");
                        pk5.g(profileListFragment.J0, new NavIntentDirections.ProfileAddList(new tk6(new DialogDataModel(profileListFragment.U0(), "DIALOG_KEY_ADD_LIST_TO_OWN", is3.g(new Pair("BUNDLE_KEY_TITLE", profileListButtonsData2.a), new Pair("LIST_DATA_APPS", profileListButtonsData2.b), new Pair("LIST_DATA_MOVIES", profileListButtonsData2.c)), 8))), -1);
                        break;
                    case 7:
                        MovieHomeMovieData movieHomeMovieData = (MovieHomeMovieData) obj;
                        int i10 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((s35) qg5Var, "<unused var>");
                        js3.p(movieHomeMovieData, "recyclerData");
                        MovieDto movieDto = movieHomeMovieData.a;
                        String action = movieDto.getAction();
                        if (action == null || f88.n0(action)) {
                            pk5.g(profileListFragment.J0, new NavIntentDirections.MovieDetail(new v15(movieDto.getId(), movieDto.getRefId(), false, movieDto.getPosterUrl(), null)), -1);
                        } else {
                            FragmentActivity fragmentActivityF2 = profileListFragment.F();
                            String action2 = movieDto.getAction();
                            if (action2 != null) {
                                t61.w(action2, "parse(...)", fragmentActivityF2, null, null);
                            }
                        }
                        break;
                    case 8:
                        ProfileListButtonsData profileListButtonsData3 = (ProfileListButtonsData) obj;
                        int i11 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(profileListButtonsData3, "recyclerData");
                        ProfileApplicationListDto profileApplicationListDto = profileListButtonsData3.b;
                        if (profileApplicationListDto == null || (key = profileApplicationListDto.getKey()) == null) {
                            ProfileMovieListDto profileMovieListDto = profileListButtonsData3.c;
                            if (profileMovieListDto != null) {
                                key = profileMovieListDto.getKey();
                            }
                        } else {
                            key = key;
                        }
                        if (key != null) {
                            profileListFragment.V0().r(new ProfileListAction.LikeListAction(key));
                        }
                        break;
                    default:
                        ProfileListButtonsData profileListButtonsData4 = (ProfileListButtonsData) obj;
                        int i12 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(profileListButtonsData4, "recyclerData");
                        ProfileApplicationListDto profileApplicationListDto2 = profileListButtonsData4.b;
                        if (profileApplicationListDto2 == null || (key2 = profileApplicationListDto2.getKey()) == null) {
                            ProfileMovieListDto profileMovieListDto2 = profileListButtonsData4.c;
                            if (profileMovieListDto2 != null) {
                                key = profileMovieListDto2.getKey();
                            }
                        } else {
                            key = key2;
                        }
                        if (key != null) {
                            profileListFragment.V0().r(new ProfileListAction.RemoveLikeListAction(key));
                        }
                        break;
                }
            }
        };
        final int i5 = 4;
        el6Var.p = new og5(this) { // from class: gl6
            public final /* synthetic */ ProfileListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                LineMenuItemData[] lineMenuItemDataArr;
                RecyclerItem recyclerItem;
                String key;
                String key2;
                int i22 = i5;
                ProfileListFragment profileListFragment = this.b;
                switch (i22) {
                    case 0:
                        int i32 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p((ProfileListEmptyData) obj, "<unused var>");
                        profileListFragment.V0().r(ProfileListAction.AddListAction.INSTANCE);
                        break;
                    case 1:
                        int i42 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p((ProfileListAddData) obj, "<unused var>");
                        profileListFragment.V0().r(ProfileListAction.AddListAction.INSTANCE);
                        break;
                    case 2:
                        ProfileListTitleData profileListTitleData = (ProfileListTitleData) obj;
                        int i52 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((ml6) qg5Var, "<unused var>");
                        js3.p(profileListTitleData, "recyclerData");
                        Bundle bundle = profileListFragment.g;
                        if ((bundle != null ? bundle.getString("BUNDLE_KEY_ACCOUNT_KEY") : null) != null) {
                            lineMenuItemDataArr = (LineMenuItemData[]) br9.E(new LineMenuItemData("REPORT", profileListFragment.L(rs6.profile_list_report_list), sj8.b().A)).toArray(new LineMenuItemData[0]);
                        } else {
                            ir.mservices.market.version2.ui.recycler.adapter.a aVar = profileListFragment.P0;
                            MyketRecyclerData myketRecyclerData = (aVar == null || (recyclerItem = (RecyclerItem) kotlin.collections.a.q0(1, (ArrayList) aVar.D().d)) == null) ? null : recyclerItem.c;
                            ProfileListTitleData profileListTitleData2 = myketRecyclerData instanceof ProfileListTitleData ? (ProfileListTitleData) myketRecyclerData : null;
                            boolean zI = js3.i(profileListTitleData2 != null ? profileListTitleData2.getUniqueId() : null, profileListTitleData.getUniqueId());
                            ArrayList arrayListE = br9.E(new LineMenuItemData("EDIT", profileListFragment.L(rs6.profile_list_edit_list)), new LineMenuItemData("DELETE", profileListFragment.L(rs6.profile_list_delete_list), sj8.b().A));
                            if (!zI) {
                                arrayListE.add(1, new LineMenuItemData("MOVE_TO_TOP", profileListFragment.L(rs6.profile_list_move_to_top_list)));
                            }
                            lineMenuItemDataArr = (LineMenuItemData[]) arrayListE.toArray(new LineMenuItemData[0]);
                        }
                        String strU0 = profileListFragment.U0();
                        Bundle bundle2 = new Bundle();
                        bundle2.putSerializable("LIST_DATA_APPS", profileListTitleData.b);
                        bundle2.putSerializable("LIST_DATA_MOVIES", profileListTitleData.c);
                        pk5.g(profileListFragment.J0, new NavIntentDirections.LineMenu(new c74(new DialogDataModel(strU0, "DIALOG_KEY_LIST_MORE", bundle2, 8), lineMenuItemDataArr, null)), -1);
                        break;
                    case 3:
                        bq bqVar = (bq) qg5Var;
                        AppNestedData appNestedData = (AppNestedData) obj;
                        int i6 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p(bqVar, "viewHolder");
                        js3.p(appNestedData, "recyclerData");
                        ApplicationDTO applicationDTO = appNestedData.a;
                        if (applicationDTO != null) {
                            ImageView imageViewX = bqVar.x();
                            Tracker tracker = new Tracker("social", null, "horizontalList");
                            String iconPath = applicationDTO.getIconPath();
                            js3.o(iconPath, "getIconPath(...)");
                            String title = applicationDTO.getTitle();
                            js3.o(title, "getTitle(...)");
                            String packageName = applicationDTO.getPackageName();
                            js3.o(packageName, "getPackageName(...)");
                            StartApplicationData startApplicationData = new StartApplicationData(new AppBarSampleData(iconPath, title, packageName, null, applicationDTO.getTagline(), null, null, null, 232, null), applicationDTO.getInstallCallbackUrl(), applicationDTO.getClickCallback());
                            String packageName2 = applicationDTO.getPackageName();
                            js3.o(packageName2, "getPackageName(...)");
                            boolean z = profileListFragment.G0().b(imageViewX.getDrawable()) != null;
                            String refId = applicationDTO.getRefId();
                            js3.o(refId, "getRefId(...)");
                            pk5.f(profileListFragment.J0, new NavIntentDirections.AppDetail(new hp(packageName2, false, tracker, z, null, refId, applicationDTO.getCallbackUrl(), null, startApplicationData, null, null, null, null)));
                        }
                        break;
                    case 4:
                        ProfileListButtonsData profileListButtonsData = (ProfileListButtonsData) obj;
                        int i7 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(profileListButtonsData, "recyclerData");
                        FragmentActivity fragmentActivityF = profileListFragment.F();
                        SocialMessagingDto socialMessagingDto = profileListButtonsData.d;
                        String intent = socialMessagingDto != null ? socialMessagingDto.getIntent() : null;
                        if (intent != null) {
                            t61.w(intent, "parse(...)", fragmentActivityF, NearbyRepository.SERVICE_ID, null);
                        }
                        break;
                    case 5:
                        ProfileListTitleData profileListTitleData3 = (ProfileListTitleData) obj;
                        int i8 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((ml6) qg5Var, "<unused var>");
                        js3.p(profileListTitleData3, "recyclerData");
                        if (profileListTitleData3.b == null) {
                            DialogDataModel dialogDataModel = new DialogDataModel(profileListFragment.U0(), "DIALOG_KEY_REFRESH", null, 12);
                            Bundle bundle3 = profileListFragment.g;
                            pk5.g(profileListFragment.J0, new NavIntentDirections.ProfileMovieListMore(new pl6(dialogDataModel, profileListTitleData3, bundle3 != null ? bundle3.getString("BUNDLE_KEY_ACCOUNT_KEY") : null)), -1);
                        } else {
                            DialogDataModel dialogDataModel2 = new DialogDataModel(profileListFragment.U0(), "DIALOG_KEY_REFRESH", null, 12);
                            Bundle bundle4 = profileListFragment.g;
                            pk5.g(profileListFragment.J0, new NavIntentDirections.ProfileAppListMore(new yk6(dialogDataModel2, profileListTitleData3, bundle4 != null ? bundle4.getString("BUNDLE_KEY_ACCOUNT_KEY") : null)), -1);
                        }
                        break;
                    case 6:
                        ProfileListButtonsData profileListButtonsData2 = (ProfileListButtonsData) obj;
                        int i9 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(profileListButtonsData2, "recyclerData");
                        pk5.g(profileListFragment.J0, new NavIntentDirections.ProfileAddList(new tk6(new DialogDataModel(profileListFragment.U0(), "DIALOG_KEY_ADD_LIST_TO_OWN", is3.g(new Pair("BUNDLE_KEY_TITLE", profileListButtonsData2.a), new Pair("LIST_DATA_APPS", profileListButtonsData2.b), new Pair("LIST_DATA_MOVIES", profileListButtonsData2.c)), 8))), -1);
                        break;
                    case 7:
                        MovieHomeMovieData movieHomeMovieData = (MovieHomeMovieData) obj;
                        int i10 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((s35) qg5Var, "<unused var>");
                        js3.p(movieHomeMovieData, "recyclerData");
                        MovieDto movieDto = movieHomeMovieData.a;
                        String action = movieDto.getAction();
                        if (action == null || f88.n0(action)) {
                            pk5.g(profileListFragment.J0, new NavIntentDirections.MovieDetail(new v15(movieDto.getId(), movieDto.getRefId(), false, movieDto.getPosterUrl(), null)), -1);
                        } else {
                            FragmentActivity fragmentActivityF2 = profileListFragment.F();
                            String action2 = movieDto.getAction();
                            if (action2 != null) {
                                t61.w(action2, "parse(...)", fragmentActivityF2, null, null);
                            }
                        }
                        break;
                    case 8:
                        ProfileListButtonsData profileListButtonsData3 = (ProfileListButtonsData) obj;
                        int i11 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(profileListButtonsData3, "recyclerData");
                        ProfileApplicationListDto profileApplicationListDto = profileListButtonsData3.b;
                        if (profileApplicationListDto == null || (key = profileApplicationListDto.getKey()) == null) {
                            ProfileMovieListDto profileMovieListDto = profileListButtonsData3.c;
                            if (profileMovieListDto != null) {
                                key = profileMovieListDto.getKey();
                            }
                        } else {
                            key = key;
                        }
                        if (key != null) {
                            profileListFragment.V0().r(new ProfileListAction.LikeListAction(key));
                        }
                        break;
                    default:
                        ProfileListButtonsData profileListButtonsData4 = (ProfileListButtonsData) obj;
                        int i12 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(profileListButtonsData4, "recyclerData");
                        ProfileApplicationListDto profileApplicationListDto2 = profileListButtonsData4.b;
                        if (profileApplicationListDto2 == null || (key2 = profileApplicationListDto2.getKey()) == null) {
                            ProfileMovieListDto profileMovieListDto2 = profileListButtonsData4.c;
                            if (profileMovieListDto2 != null) {
                                key = profileMovieListDto2.getKey();
                            }
                        } else {
                            key = key2;
                        }
                        if (key != null) {
                            profileListFragment.V0().r(new ProfileListAction.RemoveLikeListAction(key));
                        }
                        break;
                }
            }
        };
        final int i6 = 5;
        el6Var.q = new og5(this) { // from class: gl6
            public final /* synthetic */ ProfileListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                LineMenuItemData[] lineMenuItemDataArr;
                RecyclerItem recyclerItem;
                String key;
                String key2;
                int i22 = i6;
                ProfileListFragment profileListFragment = this.b;
                switch (i22) {
                    case 0:
                        int i32 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p((ProfileListEmptyData) obj, "<unused var>");
                        profileListFragment.V0().r(ProfileListAction.AddListAction.INSTANCE);
                        break;
                    case 1:
                        int i42 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p((ProfileListAddData) obj, "<unused var>");
                        profileListFragment.V0().r(ProfileListAction.AddListAction.INSTANCE);
                        break;
                    case 2:
                        ProfileListTitleData profileListTitleData = (ProfileListTitleData) obj;
                        int i52 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((ml6) qg5Var, "<unused var>");
                        js3.p(profileListTitleData, "recyclerData");
                        Bundle bundle = profileListFragment.g;
                        if ((bundle != null ? bundle.getString("BUNDLE_KEY_ACCOUNT_KEY") : null) != null) {
                            lineMenuItemDataArr = (LineMenuItemData[]) br9.E(new LineMenuItemData("REPORT", profileListFragment.L(rs6.profile_list_report_list), sj8.b().A)).toArray(new LineMenuItemData[0]);
                        } else {
                            ir.mservices.market.version2.ui.recycler.adapter.a aVar = profileListFragment.P0;
                            MyketRecyclerData myketRecyclerData = (aVar == null || (recyclerItem = (RecyclerItem) kotlin.collections.a.q0(1, (ArrayList) aVar.D().d)) == null) ? null : recyclerItem.c;
                            ProfileListTitleData profileListTitleData2 = myketRecyclerData instanceof ProfileListTitleData ? (ProfileListTitleData) myketRecyclerData : null;
                            boolean zI = js3.i(profileListTitleData2 != null ? profileListTitleData2.getUniqueId() : null, profileListTitleData.getUniqueId());
                            ArrayList arrayListE = br9.E(new LineMenuItemData("EDIT", profileListFragment.L(rs6.profile_list_edit_list)), new LineMenuItemData("DELETE", profileListFragment.L(rs6.profile_list_delete_list), sj8.b().A));
                            if (!zI) {
                                arrayListE.add(1, new LineMenuItemData("MOVE_TO_TOP", profileListFragment.L(rs6.profile_list_move_to_top_list)));
                            }
                            lineMenuItemDataArr = (LineMenuItemData[]) arrayListE.toArray(new LineMenuItemData[0]);
                        }
                        String strU0 = profileListFragment.U0();
                        Bundle bundle2 = new Bundle();
                        bundle2.putSerializable("LIST_DATA_APPS", profileListTitleData.b);
                        bundle2.putSerializable("LIST_DATA_MOVIES", profileListTitleData.c);
                        pk5.g(profileListFragment.J0, new NavIntentDirections.LineMenu(new c74(new DialogDataModel(strU0, "DIALOG_KEY_LIST_MORE", bundle2, 8), lineMenuItemDataArr, null)), -1);
                        break;
                    case 3:
                        bq bqVar = (bq) qg5Var;
                        AppNestedData appNestedData = (AppNestedData) obj;
                        int i62 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p(bqVar, "viewHolder");
                        js3.p(appNestedData, "recyclerData");
                        ApplicationDTO applicationDTO = appNestedData.a;
                        if (applicationDTO != null) {
                            ImageView imageViewX = bqVar.x();
                            Tracker tracker = new Tracker("social", null, "horizontalList");
                            String iconPath = applicationDTO.getIconPath();
                            js3.o(iconPath, "getIconPath(...)");
                            String title = applicationDTO.getTitle();
                            js3.o(title, "getTitle(...)");
                            String packageName = applicationDTO.getPackageName();
                            js3.o(packageName, "getPackageName(...)");
                            StartApplicationData startApplicationData = new StartApplicationData(new AppBarSampleData(iconPath, title, packageName, null, applicationDTO.getTagline(), null, null, null, 232, null), applicationDTO.getInstallCallbackUrl(), applicationDTO.getClickCallback());
                            String packageName2 = applicationDTO.getPackageName();
                            js3.o(packageName2, "getPackageName(...)");
                            boolean z = profileListFragment.G0().b(imageViewX.getDrawable()) != null;
                            String refId = applicationDTO.getRefId();
                            js3.o(refId, "getRefId(...)");
                            pk5.f(profileListFragment.J0, new NavIntentDirections.AppDetail(new hp(packageName2, false, tracker, z, null, refId, applicationDTO.getCallbackUrl(), null, startApplicationData, null, null, null, null)));
                        }
                        break;
                    case 4:
                        ProfileListButtonsData profileListButtonsData = (ProfileListButtonsData) obj;
                        int i7 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(profileListButtonsData, "recyclerData");
                        FragmentActivity fragmentActivityF = profileListFragment.F();
                        SocialMessagingDto socialMessagingDto = profileListButtonsData.d;
                        String intent = socialMessagingDto != null ? socialMessagingDto.getIntent() : null;
                        if (intent != null) {
                            t61.w(intent, "parse(...)", fragmentActivityF, NearbyRepository.SERVICE_ID, null);
                        }
                        break;
                    case 5:
                        ProfileListTitleData profileListTitleData3 = (ProfileListTitleData) obj;
                        int i8 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((ml6) qg5Var, "<unused var>");
                        js3.p(profileListTitleData3, "recyclerData");
                        if (profileListTitleData3.b == null) {
                            DialogDataModel dialogDataModel = new DialogDataModel(profileListFragment.U0(), "DIALOG_KEY_REFRESH", null, 12);
                            Bundle bundle3 = profileListFragment.g;
                            pk5.g(profileListFragment.J0, new NavIntentDirections.ProfileMovieListMore(new pl6(dialogDataModel, profileListTitleData3, bundle3 != null ? bundle3.getString("BUNDLE_KEY_ACCOUNT_KEY") : null)), -1);
                        } else {
                            DialogDataModel dialogDataModel2 = new DialogDataModel(profileListFragment.U0(), "DIALOG_KEY_REFRESH", null, 12);
                            Bundle bundle4 = profileListFragment.g;
                            pk5.g(profileListFragment.J0, new NavIntentDirections.ProfileAppListMore(new yk6(dialogDataModel2, profileListTitleData3, bundle4 != null ? bundle4.getString("BUNDLE_KEY_ACCOUNT_KEY") : null)), -1);
                        }
                        break;
                    case 6:
                        ProfileListButtonsData profileListButtonsData2 = (ProfileListButtonsData) obj;
                        int i9 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(profileListButtonsData2, "recyclerData");
                        pk5.g(profileListFragment.J0, new NavIntentDirections.ProfileAddList(new tk6(new DialogDataModel(profileListFragment.U0(), "DIALOG_KEY_ADD_LIST_TO_OWN", is3.g(new Pair("BUNDLE_KEY_TITLE", profileListButtonsData2.a), new Pair("LIST_DATA_APPS", profileListButtonsData2.b), new Pair("LIST_DATA_MOVIES", profileListButtonsData2.c)), 8))), -1);
                        break;
                    case 7:
                        MovieHomeMovieData movieHomeMovieData = (MovieHomeMovieData) obj;
                        int i10 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((s35) qg5Var, "<unused var>");
                        js3.p(movieHomeMovieData, "recyclerData");
                        MovieDto movieDto = movieHomeMovieData.a;
                        String action = movieDto.getAction();
                        if (action == null || f88.n0(action)) {
                            pk5.g(profileListFragment.J0, new NavIntentDirections.MovieDetail(new v15(movieDto.getId(), movieDto.getRefId(), false, movieDto.getPosterUrl(), null)), -1);
                        } else {
                            FragmentActivity fragmentActivityF2 = profileListFragment.F();
                            String action2 = movieDto.getAction();
                            if (action2 != null) {
                                t61.w(action2, "parse(...)", fragmentActivityF2, null, null);
                            }
                        }
                        break;
                    case 8:
                        ProfileListButtonsData profileListButtonsData3 = (ProfileListButtonsData) obj;
                        int i11 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(profileListButtonsData3, "recyclerData");
                        ProfileApplicationListDto profileApplicationListDto = profileListButtonsData3.b;
                        if (profileApplicationListDto == null || (key = profileApplicationListDto.getKey()) == null) {
                            ProfileMovieListDto profileMovieListDto = profileListButtonsData3.c;
                            if (profileMovieListDto != null) {
                                key = profileMovieListDto.getKey();
                            }
                        } else {
                            key = key;
                        }
                        if (key != null) {
                            profileListFragment.V0().r(new ProfileListAction.LikeListAction(key));
                        }
                        break;
                    default:
                        ProfileListButtonsData profileListButtonsData4 = (ProfileListButtonsData) obj;
                        int i12 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(profileListButtonsData4, "recyclerData");
                        ProfileApplicationListDto profileApplicationListDto2 = profileListButtonsData4.b;
                        if (profileApplicationListDto2 == null || (key2 = profileApplicationListDto2.getKey()) == null) {
                            ProfileMovieListDto profileMovieListDto2 = profileListButtonsData4.c;
                            if (profileMovieListDto2 != null) {
                                key = profileMovieListDto2.getKey();
                            }
                        } else {
                            key = key2;
                        }
                        if (key != null) {
                            profileListFragment.V0().r(new ProfileListAction.RemoveLikeListAction(key));
                        }
                        break;
                }
            }
        };
        final int i7 = 6;
        el6Var.t = new og5(this) { // from class: gl6
            public final /* synthetic */ ProfileListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                LineMenuItemData[] lineMenuItemDataArr;
                RecyclerItem recyclerItem;
                String key;
                String key2;
                int i22 = i7;
                ProfileListFragment profileListFragment = this.b;
                switch (i22) {
                    case 0:
                        int i32 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p((ProfileListEmptyData) obj, "<unused var>");
                        profileListFragment.V0().r(ProfileListAction.AddListAction.INSTANCE);
                        break;
                    case 1:
                        int i42 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p((ProfileListAddData) obj, "<unused var>");
                        profileListFragment.V0().r(ProfileListAction.AddListAction.INSTANCE);
                        break;
                    case 2:
                        ProfileListTitleData profileListTitleData = (ProfileListTitleData) obj;
                        int i52 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((ml6) qg5Var, "<unused var>");
                        js3.p(profileListTitleData, "recyclerData");
                        Bundle bundle = profileListFragment.g;
                        if ((bundle != null ? bundle.getString("BUNDLE_KEY_ACCOUNT_KEY") : null) != null) {
                            lineMenuItemDataArr = (LineMenuItemData[]) br9.E(new LineMenuItemData("REPORT", profileListFragment.L(rs6.profile_list_report_list), sj8.b().A)).toArray(new LineMenuItemData[0]);
                        } else {
                            ir.mservices.market.version2.ui.recycler.adapter.a aVar = profileListFragment.P0;
                            MyketRecyclerData myketRecyclerData = (aVar == null || (recyclerItem = (RecyclerItem) kotlin.collections.a.q0(1, (ArrayList) aVar.D().d)) == null) ? null : recyclerItem.c;
                            ProfileListTitleData profileListTitleData2 = myketRecyclerData instanceof ProfileListTitleData ? (ProfileListTitleData) myketRecyclerData : null;
                            boolean zI = js3.i(profileListTitleData2 != null ? profileListTitleData2.getUniqueId() : null, profileListTitleData.getUniqueId());
                            ArrayList arrayListE = br9.E(new LineMenuItemData("EDIT", profileListFragment.L(rs6.profile_list_edit_list)), new LineMenuItemData("DELETE", profileListFragment.L(rs6.profile_list_delete_list), sj8.b().A));
                            if (!zI) {
                                arrayListE.add(1, new LineMenuItemData("MOVE_TO_TOP", profileListFragment.L(rs6.profile_list_move_to_top_list)));
                            }
                            lineMenuItemDataArr = (LineMenuItemData[]) arrayListE.toArray(new LineMenuItemData[0]);
                        }
                        String strU0 = profileListFragment.U0();
                        Bundle bundle2 = new Bundle();
                        bundle2.putSerializable("LIST_DATA_APPS", profileListTitleData.b);
                        bundle2.putSerializable("LIST_DATA_MOVIES", profileListTitleData.c);
                        pk5.g(profileListFragment.J0, new NavIntentDirections.LineMenu(new c74(new DialogDataModel(strU0, "DIALOG_KEY_LIST_MORE", bundle2, 8), lineMenuItemDataArr, null)), -1);
                        break;
                    case 3:
                        bq bqVar = (bq) qg5Var;
                        AppNestedData appNestedData = (AppNestedData) obj;
                        int i62 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p(bqVar, "viewHolder");
                        js3.p(appNestedData, "recyclerData");
                        ApplicationDTO applicationDTO = appNestedData.a;
                        if (applicationDTO != null) {
                            ImageView imageViewX = bqVar.x();
                            Tracker tracker = new Tracker("social", null, "horizontalList");
                            String iconPath = applicationDTO.getIconPath();
                            js3.o(iconPath, "getIconPath(...)");
                            String title = applicationDTO.getTitle();
                            js3.o(title, "getTitle(...)");
                            String packageName = applicationDTO.getPackageName();
                            js3.o(packageName, "getPackageName(...)");
                            StartApplicationData startApplicationData = new StartApplicationData(new AppBarSampleData(iconPath, title, packageName, null, applicationDTO.getTagline(), null, null, null, 232, null), applicationDTO.getInstallCallbackUrl(), applicationDTO.getClickCallback());
                            String packageName2 = applicationDTO.getPackageName();
                            js3.o(packageName2, "getPackageName(...)");
                            boolean z = profileListFragment.G0().b(imageViewX.getDrawable()) != null;
                            String refId = applicationDTO.getRefId();
                            js3.o(refId, "getRefId(...)");
                            pk5.f(profileListFragment.J0, new NavIntentDirections.AppDetail(new hp(packageName2, false, tracker, z, null, refId, applicationDTO.getCallbackUrl(), null, startApplicationData, null, null, null, null)));
                        }
                        break;
                    case 4:
                        ProfileListButtonsData profileListButtonsData = (ProfileListButtonsData) obj;
                        int i72 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(profileListButtonsData, "recyclerData");
                        FragmentActivity fragmentActivityF = profileListFragment.F();
                        SocialMessagingDto socialMessagingDto = profileListButtonsData.d;
                        String intent = socialMessagingDto != null ? socialMessagingDto.getIntent() : null;
                        if (intent != null) {
                            t61.w(intent, "parse(...)", fragmentActivityF, NearbyRepository.SERVICE_ID, null);
                        }
                        break;
                    case 5:
                        ProfileListTitleData profileListTitleData3 = (ProfileListTitleData) obj;
                        int i8 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((ml6) qg5Var, "<unused var>");
                        js3.p(profileListTitleData3, "recyclerData");
                        if (profileListTitleData3.b == null) {
                            DialogDataModel dialogDataModel = new DialogDataModel(profileListFragment.U0(), "DIALOG_KEY_REFRESH", null, 12);
                            Bundle bundle3 = profileListFragment.g;
                            pk5.g(profileListFragment.J0, new NavIntentDirections.ProfileMovieListMore(new pl6(dialogDataModel, profileListTitleData3, bundle3 != null ? bundle3.getString("BUNDLE_KEY_ACCOUNT_KEY") : null)), -1);
                        } else {
                            DialogDataModel dialogDataModel2 = new DialogDataModel(profileListFragment.U0(), "DIALOG_KEY_REFRESH", null, 12);
                            Bundle bundle4 = profileListFragment.g;
                            pk5.g(profileListFragment.J0, new NavIntentDirections.ProfileAppListMore(new yk6(dialogDataModel2, profileListTitleData3, bundle4 != null ? bundle4.getString("BUNDLE_KEY_ACCOUNT_KEY") : null)), -1);
                        }
                        break;
                    case 6:
                        ProfileListButtonsData profileListButtonsData2 = (ProfileListButtonsData) obj;
                        int i9 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(profileListButtonsData2, "recyclerData");
                        pk5.g(profileListFragment.J0, new NavIntentDirections.ProfileAddList(new tk6(new DialogDataModel(profileListFragment.U0(), "DIALOG_KEY_ADD_LIST_TO_OWN", is3.g(new Pair("BUNDLE_KEY_TITLE", profileListButtonsData2.a), new Pair("LIST_DATA_APPS", profileListButtonsData2.b), new Pair("LIST_DATA_MOVIES", profileListButtonsData2.c)), 8))), -1);
                        break;
                    case 7:
                        MovieHomeMovieData movieHomeMovieData = (MovieHomeMovieData) obj;
                        int i10 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((s35) qg5Var, "<unused var>");
                        js3.p(movieHomeMovieData, "recyclerData");
                        MovieDto movieDto = movieHomeMovieData.a;
                        String action = movieDto.getAction();
                        if (action == null || f88.n0(action)) {
                            pk5.g(profileListFragment.J0, new NavIntentDirections.MovieDetail(new v15(movieDto.getId(), movieDto.getRefId(), false, movieDto.getPosterUrl(), null)), -1);
                        } else {
                            FragmentActivity fragmentActivityF2 = profileListFragment.F();
                            String action2 = movieDto.getAction();
                            if (action2 != null) {
                                t61.w(action2, "parse(...)", fragmentActivityF2, null, null);
                            }
                        }
                        break;
                    case 8:
                        ProfileListButtonsData profileListButtonsData3 = (ProfileListButtonsData) obj;
                        int i11 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(profileListButtonsData3, "recyclerData");
                        ProfileApplicationListDto profileApplicationListDto = profileListButtonsData3.b;
                        if (profileApplicationListDto == null || (key = profileApplicationListDto.getKey()) == null) {
                            ProfileMovieListDto profileMovieListDto = profileListButtonsData3.c;
                            if (profileMovieListDto != null) {
                                key = profileMovieListDto.getKey();
                            }
                        } else {
                            key = key;
                        }
                        if (key != null) {
                            profileListFragment.V0().r(new ProfileListAction.LikeListAction(key));
                        }
                        break;
                    default:
                        ProfileListButtonsData profileListButtonsData4 = (ProfileListButtonsData) obj;
                        int i12 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(profileListButtonsData4, "recyclerData");
                        ProfileApplicationListDto profileApplicationListDto2 = profileListButtonsData4.b;
                        if (profileApplicationListDto2 == null || (key2 = profileApplicationListDto2.getKey()) == null) {
                            ProfileMovieListDto profileMovieListDto2 = profileListButtonsData4.c;
                            if (profileMovieListDto2 != null) {
                                key = profileMovieListDto2.getKey();
                            }
                        } else {
                            key = key2;
                        }
                        if (key != null) {
                            profileListFragment.V0().r(new ProfileListAction.RemoveLikeListAction(key));
                        }
                        break;
                }
            }
        };
        final int i8 = 7;
        el6Var.v = new og5(this) { // from class: gl6
            public final /* synthetic */ ProfileListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                LineMenuItemData[] lineMenuItemDataArr;
                RecyclerItem recyclerItem;
                String key;
                String key2;
                int i22 = i8;
                ProfileListFragment profileListFragment = this.b;
                switch (i22) {
                    case 0:
                        int i32 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p((ProfileListEmptyData) obj, "<unused var>");
                        profileListFragment.V0().r(ProfileListAction.AddListAction.INSTANCE);
                        break;
                    case 1:
                        int i42 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p((ProfileListAddData) obj, "<unused var>");
                        profileListFragment.V0().r(ProfileListAction.AddListAction.INSTANCE);
                        break;
                    case 2:
                        ProfileListTitleData profileListTitleData = (ProfileListTitleData) obj;
                        int i52 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((ml6) qg5Var, "<unused var>");
                        js3.p(profileListTitleData, "recyclerData");
                        Bundle bundle = profileListFragment.g;
                        if ((bundle != null ? bundle.getString("BUNDLE_KEY_ACCOUNT_KEY") : null) != null) {
                            lineMenuItemDataArr = (LineMenuItemData[]) br9.E(new LineMenuItemData("REPORT", profileListFragment.L(rs6.profile_list_report_list), sj8.b().A)).toArray(new LineMenuItemData[0]);
                        } else {
                            ir.mservices.market.version2.ui.recycler.adapter.a aVar = profileListFragment.P0;
                            MyketRecyclerData myketRecyclerData = (aVar == null || (recyclerItem = (RecyclerItem) kotlin.collections.a.q0(1, (ArrayList) aVar.D().d)) == null) ? null : recyclerItem.c;
                            ProfileListTitleData profileListTitleData2 = myketRecyclerData instanceof ProfileListTitleData ? (ProfileListTitleData) myketRecyclerData : null;
                            boolean zI = js3.i(profileListTitleData2 != null ? profileListTitleData2.getUniqueId() : null, profileListTitleData.getUniqueId());
                            ArrayList arrayListE = br9.E(new LineMenuItemData("EDIT", profileListFragment.L(rs6.profile_list_edit_list)), new LineMenuItemData("DELETE", profileListFragment.L(rs6.profile_list_delete_list), sj8.b().A));
                            if (!zI) {
                                arrayListE.add(1, new LineMenuItemData("MOVE_TO_TOP", profileListFragment.L(rs6.profile_list_move_to_top_list)));
                            }
                            lineMenuItemDataArr = (LineMenuItemData[]) arrayListE.toArray(new LineMenuItemData[0]);
                        }
                        String strU0 = profileListFragment.U0();
                        Bundle bundle2 = new Bundle();
                        bundle2.putSerializable("LIST_DATA_APPS", profileListTitleData.b);
                        bundle2.putSerializable("LIST_DATA_MOVIES", profileListTitleData.c);
                        pk5.g(profileListFragment.J0, new NavIntentDirections.LineMenu(new c74(new DialogDataModel(strU0, "DIALOG_KEY_LIST_MORE", bundle2, 8), lineMenuItemDataArr, null)), -1);
                        break;
                    case 3:
                        bq bqVar = (bq) qg5Var;
                        AppNestedData appNestedData = (AppNestedData) obj;
                        int i62 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p(bqVar, "viewHolder");
                        js3.p(appNestedData, "recyclerData");
                        ApplicationDTO applicationDTO = appNestedData.a;
                        if (applicationDTO != null) {
                            ImageView imageViewX = bqVar.x();
                            Tracker tracker = new Tracker("social", null, "horizontalList");
                            String iconPath = applicationDTO.getIconPath();
                            js3.o(iconPath, "getIconPath(...)");
                            String title = applicationDTO.getTitle();
                            js3.o(title, "getTitle(...)");
                            String packageName = applicationDTO.getPackageName();
                            js3.o(packageName, "getPackageName(...)");
                            StartApplicationData startApplicationData = new StartApplicationData(new AppBarSampleData(iconPath, title, packageName, null, applicationDTO.getTagline(), null, null, null, 232, null), applicationDTO.getInstallCallbackUrl(), applicationDTO.getClickCallback());
                            String packageName2 = applicationDTO.getPackageName();
                            js3.o(packageName2, "getPackageName(...)");
                            boolean z = profileListFragment.G0().b(imageViewX.getDrawable()) != null;
                            String refId = applicationDTO.getRefId();
                            js3.o(refId, "getRefId(...)");
                            pk5.f(profileListFragment.J0, new NavIntentDirections.AppDetail(new hp(packageName2, false, tracker, z, null, refId, applicationDTO.getCallbackUrl(), null, startApplicationData, null, null, null, null)));
                        }
                        break;
                    case 4:
                        ProfileListButtonsData profileListButtonsData = (ProfileListButtonsData) obj;
                        int i72 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(profileListButtonsData, "recyclerData");
                        FragmentActivity fragmentActivityF = profileListFragment.F();
                        SocialMessagingDto socialMessagingDto = profileListButtonsData.d;
                        String intent = socialMessagingDto != null ? socialMessagingDto.getIntent() : null;
                        if (intent != null) {
                            t61.w(intent, "parse(...)", fragmentActivityF, NearbyRepository.SERVICE_ID, null);
                        }
                        break;
                    case 5:
                        ProfileListTitleData profileListTitleData3 = (ProfileListTitleData) obj;
                        int i82 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((ml6) qg5Var, "<unused var>");
                        js3.p(profileListTitleData3, "recyclerData");
                        if (profileListTitleData3.b == null) {
                            DialogDataModel dialogDataModel = new DialogDataModel(profileListFragment.U0(), "DIALOG_KEY_REFRESH", null, 12);
                            Bundle bundle3 = profileListFragment.g;
                            pk5.g(profileListFragment.J0, new NavIntentDirections.ProfileMovieListMore(new pl6(dialogDataModel, profileListTitleData3, bundle3 != null ? bundle3.getString("BUNDLE_KEY_ACCOUNT_KEY") : null)), -1);
                        } else {
                            DialogDataModel dialogDataModel2 = new DialogDataModel(profileListFragment.U0(), "DIALOG_KEY_REFRESH", null, 12);
                            Bundle bundle4 = profileListFragment.g;
                            pk5.g(profileListFragment.J0, new NavIntentDirections.ProfileAppListMore(new yk6(dialogDataModel2, profileListTitleData3, bundle4 != null ? bundle4.getString("BUNDLE_KEY_ACCOUNT_KEY") : null)), -1);
                        }
                        break;
                    case 6:
                        ProfileListButtonsData profileListButtonsData2 = (ProfileListButtonsData) obj;
                        int i9 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(profileListButtonsData2, "recyclerData");
                        pk5.g(profileListFragment.J0, new NavIntentDirections.ProfileAddList(new tk6(new DialogDataModel(profileListFragment.U0(), "DIALOG_KEY_ADD_LIST_TO_OWN", is3.g(new Pair("BUNDLE_KEY_TITLE", profileListButtonsData2.a), new Pair("LIST_DATA_APPS", profileListButtonsData2.b), new Pair("LIST_DATA_MOVIES", profileListButtonsData2.c)), 8))), -1);
                        break;
                    case 7:
                        MovieHomeMovieData movieHomeMovieData = (MovieHomeMovieData) obj;
                        int i10 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((s35) qg5Var, "<unused var>");
                        js3.p(movieHomeMovieData, "recyclerData");
                        MovieDto movieDto = movieHomeMovieData.a;
                        String action = movieDto.getAction();
                        if (action == null || f88.n0(action)) {
                            pk5.g(profileListFragment.J0, new NavIntentDirections.MovieDetail(new v15(movieDto.getId(), movieDto.getRefId(), false, movieDto.getPosterUrl(), null)), -1);
                        } else {
                            FragmentActivity fragmentActivityF2 = profileListFragment.F();
                            String action2 = movieDto.getAction();
                            if (action2 != null) {
                                t61.w(action2, "parse(...)", fragmentActivityF2, null, null);
                            }
                        }
                        break;
                    case 8:
                        ProfileListButtonsData profileListButtonsData3 = (ProfileListButtonsData) obj;
                        int i11 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(profileListButtonsData3, "recyclerData");
                        ProfileApplicationListDto profileApplicationListDto = profileListButtonsData3.b;
                        if (profileApplicationListDto == null || (key = profileApplicationListDto.getKey()) == null) {
                            ProfileMovieListDto profileMovieListDto = profileListButtonsData3.c;
                            if (profileMovieListDto != null) {
                                key = profileMovieListDto.getKey();
                            }
                        } else {
                            key = key;
                        }
                        if (key != null) {
                            profileListFragment.V0().r(new ProfileListAction.LikeListAction(key));
                        }
                        break;
                    default:
                        ProfileListButtonsData profileListButtonsData4 = (ProfileListButtonsData) obj;
                        int i12 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(profileListButtonsData4, "recyclerData");
                        ProfileApplicationListDto profileApplicationListDto2 = profileListButtonsData4.b;
                        if (profileApplicationListDto2 == null || (key2 = profileApplicationListDto2.getKey()) == null) {
                            ProfileMovieListDto profileMovieListDto2 = profileListButtonsData4.c;
                            if (profileMovieListDto2 != null) {
                                key = profileMovieListDto2.getKey();
                            }
                        } else {
                            key = key2;
                        }
                        if (key != null) {
                            profileListFragment.V0().r(new ProfileListAction.RemoveLikeListAction(key));
                        }
                        break;
                }
            }
        };
        final int i9 = 8;
        el6Var.r = new og5(this) { // from class: gl6
            public final /* synthetic */ ProfileListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                LineMenuItemData[] lineMenuItemDataArr;
                RecyclerItem recyclerItem;
                String key;
                String key2;
                int i22 = i9;
                ProfileListFragment profileListFragment = this.b;
                switch (i22) {
                    case 0:
                        int i32 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p((ProfileListEmptyData) obj, "<unused var>");
                        profileListFragment.V0().r(ProfileListAction.AddListAction.INSTANCE);
                        break;
                    case 1:
                        int i42 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p((ProfileListAddData) obj, "<unused var>");
                        profileListFragment.V0().r(ProfileListAction.AddListAction.INSTANCE);
                        break;
                    case 2:
                        ProfileListTitleData profileListTitleData = (ProfileListTitleData) obj;
                        int i52 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((ml6) qg5Var, "<unused var>");
                        js3.p(profileListTitleData, "recyclerData");
                        Bundle bundle = profileListFragment.g;
                        if ((bundle != null ? bundle.getString("BUNDLE_KEY_ACCOUNT_KEY") : null) != null) {
                            lineMenuItemDataArr = (LineMenuItemData[]) br9.E(new LineMenuItemData("REPORT", profileListFragment.L(rs6.profile_list_report_list), sj8.b().A)).toArray(new LineMenuItemData[0]);
                        } else {
                            ir.mservices.market.version2.ui.recycler.adapter.a aVar = profileListFragment.P0;
                            MyketRecyclerData myketRecyclerData = (aVar == null || (recyclerItem = (RecyclerItem) kotlin.collections.a.q0(1, (ArrayList) aVar.D().d)) == null) ? null : recyclerItem.c;
                            ProfileListTitleData profileListTitleData2 = myketRecyclerData instanceof ProfileListTitleData ? (ProfileListTitleData) myketRecyclerData : null;
                            boolean zI = js3.i(profileListTitleData2 != null ? profileListTitleData2.getUniqueId() : null, profileListTitleData.getUniqueId());
                            ArrayList arrayListE = br9.E(new LineMenuItemData("EDIT", profileListFragment.L(rs6.profile_list_edit_list)), new LineMenuItemData("DELETE", profileListFragment.L(rs6.profile_list_delete_list), sj8.b().A));
                            if (!zI) {
                                arrayListE.add(1, new LineMenuItemData("MOVE_TO_TOP", profileListFragment.L(rs6.profile_list_move_to_top_list)));
                            }
                            lineMenuItemDataArr = (LineMenuItemData[]) arrayListE.toArray(new LineMenuItemData[0]);
                        }
                        String strU0 = profileListFragment.U0();
                        Bundle bundle2 = new Bundle();
                        bundle2.putSerializable("LIST_DATA_APPS", profileListTitleData.b);
                        bundle2.putSerializable("LIST_DATA_MOVIES", profileListTitleData.c);
                        pk5.g(profileListFragment.J0, new NavIntentDirections.LineMenu(new c74(new DialogDataModel(strU0, "DIALOG_KEY_LIST_MORE", bundle2, 8), lineMenuItemDataArr, null)), -1);
                        break;
                    case 3:
                        bq bqVar = (bq) qg5Var;
                        AppNestedData appNestedData = (AppNestedData) obj;
                        int i62 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p(bqVar, "viewHolder");
                        js3.p(appNestedData, "recyclerData");
                        ApplicationDTO applicationDTO = appNestedData.a;
                        if (applicationDTO != null) {
                            ImageView imageViewX = bqVar.x();
                            Tracker tracker = new Tracker("social", null, "horizontalList");
                            String iconPath = applicationDTO.getIconPath();
                            js3.o(iconPath, "getIconPath(...)");
                            String title = applicationDTO.getTitle();
                            js3.o(title, "getTitle(...)");
                            String packageName = applicationDTO.getPackageName();
                            js3.o(packageName, "getPackageName(...)");
                            StartApplicationData startApplicationData = new StartApplicationData(new AppBarSampleData(iconPath, title, packageName, null, applicationDTO.getTagline(), null, null, null, 232, null), applicationDTO.getInstallCallbackUrl(), applicationDTO.getClickCallback());
                            String packageName2 = applicationDTO.getPackageName();
                            js3.o(packageName2, "getPackageName(...)");
                            boolean z = profileListFragment.G0().b(imageViewX.getDrawable()) != null;
                            String refId = applicationDTO.getRefId();
                            js3.o(refId, "getRefId(...)");
                            pk5.f(profileListFragment.J0, new NavIntentDirections.AppDetail(new hp(packageName2, false, tracker, z, null, refId, applicationDTO.getCallbackUrl(), null, startApplicationData, null, null, null, null)));
                        }
                        break;
                    case 4:
                        ProfileListButtonsData profileListButtonsData = (ProfileListButtonsData) obj;
                        int i72 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(profileListButtonsData, "recyclerData");
                        FragmentActivity fragmentActivityF = profileListFragment.F();
                        SocialMessagingDto socialMessagingDto = profileListButtonsData.d;
                        String intent = socialMessagingDto != null ? socialMessagingDto.getIntent() : null;
                        if (intent != null) {
                            t61.w(intent, "parse(...)", fragmentActivityF, NearbyRepository.SERVICE_ID, null);
                        }
                        break;
                    case 5:
                        ProfileListTitleData profileListTitleData3 = (ProfileListTitleData) obj;
                        int i82 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((ml6) qg5Var, "<unused var>");
                        js3.p(profileListTitleData3, "recyclerData");
                        if (profileListTitleData3.b == null) {
                            DialogDataModel dialogDataModel = new DialogDataModel(profileListFragment.U0(), "DIALOG_KEY_REFRESH", null, 12);
                            Bundle bundle3 = profileListFragment.g;
                            pk5.g(profileListFragment.J0, new NavIntentDirections.ProfileMovieListMore(new pl6(dialogDataModel, profileListTitleData3, bundle3 != null ? bundle3.getString("BUNDLE_KEY_ACCOUNT_KEY") : null)), -1);
                        } else {
                            DialogDataModel dialogDataModel2 = new DialogDataModel(profileListFragment.U0(), "DIALOG_KEY_REFRESH", null, 12);
                            Bundle bundle4 = profileListFragment.g;
                            pk5.g(profileListFragment.J0, new NavIntentDirections.ProfileAppListMore(new yk6(dialogDataModel2, profileListTitleData3, bundle4 != null ? bundle4.getString("BUNDLE_KEY_ACCOUNT_KEY") : null)), -1);
                        }
                        break;
                    case 6:
                        ProfileListButtonsData profileListButtonsData2 = (ProfileListButtonsData) obj;
                        int i92 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(profileListButtonsData2, "recyclerData");
                        pk5.g(profileListFragment.J0, new NavIntentDirections.ProfileAddList(new tk6(new DialogDataModel(profileListFragment.U0(), "DIALOG_KEY_ADD_LIST_TO_OWN", is3.g(new Pair("BUNDLE_KEY_TITLE", profileListButtonsData2.a), new Pair("LIST_DATA_APPS", profileListButtonsData2.b), new Pair("LIST_DATA_MOVIES", profileListButtonsData2.c)), 8))), -1);
                        break;
                    case 7:
                        MovieHomeMovieData movieHomeMovieData = (MovieHomeMovieData) obj;
                        int i10 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((s35) qg5Var, "<unused var>");
                        js3.p(movieHomeMovieData, "recyclerData");
                        MovieDto movieDto = movieHomeMovieData.a;
                        String action = movieDto.getAction();
                        if (action == null || f88.n0(action)) {
                            pk5.g(profileListFragment.J0, new NavIntentDirections.MovieDetail(new v15(movieDto.getId(), movieDto.getRefId(), false, movieDto.getPosterUrl(), null)), -1);
                        } else {
                            FragmentActivity fragmentActivityF2 = profileListFragment.F();
                            String action2 = movieDto.getAction();
                            if (action2 != null) {
                                t61.w(action2, "parse(...)", fragmentActivityF2, null, null);
                            }
                        }
                        break;
                    case 8:
                        ProfileListButtonsData profileListButtonsData3 = (ProfileListButtonsData) obj;
                        int i11 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(profileListButtonsData3, "recyclerData");
                        ProfileApplicationListDto profileApplicationListDto = profileListButtonsData3.b;
                        if (profileApplicationListDto == null || (key = profileApplicationListDto.getKey()) == null) {
                            ProfileMovieListDto profileMovieListDto = profileListButtonsData3.c;
                            if (profileMovieListDto != null) {
                                key = profileMovieListDto.getKey();
                            }
                        } else {
                            key = key;
                        }
                        if (key != null) {
                            profileListFragment.V0().r(new ProfileListAction.LikeListAction(key));
                        }
                        break;
                    default:
                        ProfileListButtonsData profileListButtonsData4 = (ProfileListButtonsData) obj;
                        int i12 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(profileListButtonsData4, "recyclerData");
                        ProfileApplicationListDto profileApplicationListDto2 = profileListButtonsData4.b;
                        if (profileApplicationListDto2 == null || (key2 = profileApplicationListDto2.getKey()) == null) {
                            ProfileMovieListDto profileMovieListDto2 = profileListButtonsData4.c;
                            if (profileMovieListDto2 != null) {
                                key = profileMovieListDto2.getKey();
                            }
                        } else {
                            key = key2;
                        }
                        if (key != null) {
                            profileListFragment.V0().r(new ProfileListAction.RemoveLikeListAction(key));
                        }
                        break;
                }
            }
        };
        final int i10 = 9;
        el6Var.s = new og5(this) { // from class: gl6
            public final /* synthetic */ ProfileListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                LineMenuItemData[] lineMenuItemDataArr;
                RecyclerItem recyclerItem;
                String key;
                String key2;
                int i22 = i10;
                ProfileListFragment profileListFragment = this.b;
                switch (i22) {
                    case 0:
                        int i32 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((c) qg5Var, "<unused var>");
                        js3.p((ProfileListEmptyData) obj, "<unused var>");
                        profileListFragment.V0().r(ProfileListAction.AddListAction.INSTANCE);
                        break;
                    case 1:
                        int i42 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p((ProfileListAddData) obj, "<unused var>");
                        profileListFragment.V0().r(ProfileListAction.AddListAction.INSTANCE);
                        break;
                    case 2:
                        ProfileListTitleData profileListTitleData = (ProfileListTitleData) obj;
                        int i52 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((ml6) qg5Var, "<unused var>");
                        js3.p(profileListTitleData, "recyclerData");
                        Bundle bundle = profileListFragment.g;
                        if ((bundle != null ? bundle.getString("BUNDLE_KEY_ACCOUNT_KEY") : null) != null) {
                            lineMenuItemDataArr = (LineMenuItemData[]) br9.E(new LineMenuItemData("REPORT", profileListFragment.L(rs6.profile_list_report_list), sj8.b().A)).toArray(new LineMenuItemData[0]);
                        } else {
                            ir.mservices.market.version2.ui.recycler.adapter.a aVar = profileListFragment.P0;
                            MyketRecyclerData myketRecyclerData = (aVar == null || (recyclerItem = (RecyclerItem) kotlin.collections.a.q0(1, (ArrayList) aVar.D().d)) == null) ? null : recyclerItem.c;
                            ProfileListTitleData profileListTitleData2 = myketRecyclerData instanceof ProfileListTitleData ? (ProfileListTitleData) myketRecyclerData : null;
                            boolean zI = js3.i(profileListTitleData2 != null ? profileListTitleData2.getUniqueId() : null, profileListTitleData.getUniqueId());
                            ArrayList arrayListE = br9.E(new LineMenuItemData("EDIT", profileListFragment.L(rs6.profile_list_edit_list)), new LineMenuItemData("DELETE", profileListFragment.L(rs6.profile_list_delete_list), sj8.b().A));
                            if (!zI) {
                                arrayListE.add(1, new LineMenuItemData("MOVE_TO_TOP", profileListFragment.L(rs6.profile_list_move_to_top_list)));
                            }
                            lineMenuItemDataArr = (LineMenuItemData[]) arrayListE.toArray(new LineMenuItemData[0]);
                        }
                        String strU0 = profileListFragment.U0();
                        Bundle bundle2 = new Bundle();
                        bundle2.putSerializable("LIST_DATA_APPS", profileListTitleData.b);
                        bundle2.putSerializable("LIST_DATA_MOVIES", profileListTitleData.c);
                        pk5.g(profileListFragment.J0, new NavIntentDirections.LineMenu(new c74(new DialogDataModel(strU0, "DIALOG_KEY_LIST_MORE", bundle2, 8), lineMenuItemDataArr, null)), -1);
                        break;
                    case 3:
                        bq bqVar = (bq) qg5Var;
                        AppNestedData appNestedData = (AppNestedData) obj;
                        int i62 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p(bqVar, "viewHolder");
                        js3.p(appNestedData, "recyclerData");
                        ApplicationDTO applicationDTO = appNestedData.a;
                        if (applicationDTO != null) {
                            ImageView imageViewX = bqVar.x();
                            Tracker tracker = new Tracker("social", null, "horizontalList");
                            String iconPath = applicationDTO.getIconPath();
                            js3.o(iconPath, "getIconPath(...)");
                            String title = applicationDTO.getTitle();
                            js3.o(title, "getTitle(...)");
                            String packageName = applicationDTO.getPackageName();
                            js3.o(packageName, "getPackageName(...)");
                            StartApplicationData startApplicationData = new StartApplicationData(new AppBarSampleData(iconPath, title, packageName, null, applicationDTO.getTagline(), null, null, null, 232, null), applicationDTO.getInstallCallbackUrl(), applicationDTO.getClickCallback());
                            String packageName2 = applicationDTO.getPackageName();
                            js3.o(packageName2, "getPackageName(...)");
                            boolean z = profileListFragment.G0().b(imageViewX.getDrawable()) != null;
                            String refId = applicationDTO.getRefId();
                            js3.o(refId, "getRefId(...)");
                            pk5.f(profileListFragment.J0, new NavIntentDirections.AppDetail(new hp(packageName2, false, tracker, z, null, refId, applicationDTO.getCallbackUrl(), null, startApplicationData, null, null, null, null)));
                        }
                        break;
                    case 4:
                        ProfileListButtonsData profileListButtonsData = (ProfileListButtonsData) obj;
                        int i72 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(profileListButtonsData, "recyclerData");
                        FragmentActivity fragmentActivityF = profileListFragment.F();
                        SocialMessagingDto socialMessagingDto = profileListButtonsData.d;
                        String intent = socialMessagingDto != null ? socialMessagingDto.getIntent() : null;
                        if (intent != null) {
                            t61.w(intent, "parse(...)", fragmentActivityF, NearbyRepository.SERVICE_ID, null);
                        }
                        break;
                    case 5:
                        ProfileListTitleData profileListTitleData3 = (ProfileListTitleData) obj;
                        int i82 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((ml6) qg5Var, "<unused var>");
                        js3.p(profileListTitleData3, "recyclerData");
                        if (profileListTitleData3.b == null) {
                            DialogDataModel dialogDataModel = new DialogDataModel(profileListFragment.U0(), "DIALOG_KEY_REFRESH", null, 12);
                            Bundle bundle3 = profileListFragment.g;
                            pk5.g(profileListFragment.J0, new NavIntentDirections.ProfileMovieListMore(new pl6(dialogDataModel, profileListTitleData3, bundle3 != null ? bundle3.getString("BUNDLE_KEY_ACCOUNT_KEY") : null)), -1);
                        } else {
                            DialogDataModel dialogDataModel2 = new DialogDataModel(profileListFragment.U0(), "DIALOG_KEY_REFRESH", null, 12);
                            Bundle bundle4 = profileListFragment.g;
                            pk5.g(profileListFragment.J0, new NavIntentDirections.ProfileAppListMore(new yk6(dialogDataModel2, profileListTitleData3, bundle4 != null ? bundle4.getString("BUNDLE_KEY_ACCOUNT_KEY") : null)), -1);
                        }
                        break;
                    case 6:
                        ProfileListButtonsData profileListButtonsData2 = (ProfileListButtonsData) obj;
                        int i92 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(profileListButtonsData2, "recyclerData");
                        pk5.g(profileListFragment.J0, new NavIntentDirections.ProfileAddList(new tk6(new DialogDataModel(profileListFragment.U0(), "DIALOG_KEY_ADD_LIST_TO_OWN", is3.g(new Pair("BUNDLE_KEY_TITLE", profileListButtonsData2.a), new Pair("LIST_DATA_APPS", profileListButtonsData2.b), new Pair("LIST_DATA_MOVIES", profileListButtonsData2.c)), 8))), -1);
                        break;
                    case 7:
                        MovieHomeMovieData movieHomeMovieData = (MovieHomeMovieData) obj;
                        int i102 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((s35) qg5Var, "<unused var>");
                        js3.p(movieHomeMovieData, "recyclerData");
                        MovieDto movieDto = movieHomeMovieData.a;
                        String action = movieDto.getAction();
                        if (action == null || f88.n0(action)) {
                            pk5.g(profileListFragment.J0, new NavIntentDirections.MovieDetail(new v15(movieDto.getId(), movieDto.getRefId(), false, movieDto.getPosterUrl(), null)), -1);
                        } else {
                            FragmentActivity fragmentActivityF2 = profileListFragment.F();
                            String action2 = movieDto.getAction();
                            if (action2 != null) {
                                t61.w(action2, "parse(...)", fragmentActivityF2, null, null);
                            }
                        }
                        break;
                    case 8:
                        ProfileListButtonsData profileListButtonsData3 = (ProfileListButtonsData) obj;
                        int i11 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(profileListButtonsData3, "recyclerData");
                        ProfileApplicationListDto profileApplicationListDto = profileListButtonsData3.b;
                        if (profileApplicationListDto == null || (key = profileApplicationListDto.getKey()) == null) {
                            ProfileMovieListDto profileMovieListDto = profileListButtonsData3.c;
                            if (profileMovieListDto != null) {
                                key = profileMovieListDto.getKey();
                            }
                        } else {
                            key = key;
                        }
                        if (key != null) {
                            profileListFragment.V0().r(new ProfileListAction.LikeListAction(key));
                        }
                        break;
                    default:
                        ProfileListButtonsData profileListButtonsData4 = (ProfileListButtonsData) obj;
                        int i12 = ProfileListFragment.Z0;
                        js3.p(view, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(profileListButtonsData4, "recyclerData");
                        ProfileApplicationListDto profileApplicationListDto2 = profileListButtonsData4.b;
                        if (profileApplicationListDto2 == null || (key2 = profileApplicationListDto2.getKey()) == null) {
                            ProfileMovieListDto profileMovieListDto2 = profileListButtonsData4.c;
                            if (profileMovieListDto2 != null) {
                                key = profileMovieListDto2.getKey();
                            }
                        } else {
                            key = key2;
                        }
                        if (key != null) {
                            profileListFragment.V0().r(new ProfileListAction.RemoveLikeListAction(key));
                        }
                        break;
                }
            }
        };
        return el6Var;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final ir.mservices.market.viewModel.c E0() {
        return V0();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final d16 H0() {
        return new d16(0, K().getDimensionPixelSize(pq6.space_2xl), K().getDimensionPixelSize(pq6.horizontal_space_outer), K().getDimensionPixelSize(pq6.horizontal_space_outer), 0, 0, I0(), false, this.F0.f());
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final int I0() {
        return K().getInteger(ds6.social_profile_custom_List_max_span);
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final String L0() {
        Bundle bundle = this.g;
        if (bundle == null || !bundle.getBoolean("BUNDLE_KEY_IS_APP")) {
            String strL = L(rs6.page_name_custom_movie_list);
            js3.m(strL);
            return strL;
        }
        String strL2 = L(rs6.page_name_custom_app_list);
        js3.m(strL2);
        return strL2;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final void R0(aw0 aw0Var) {
        TryAgainView tryAgainViewN0;
        ErrorDTO errorDTO;
        TryAgainView tryAgainViewN02;
        js3.p(aw0Var, "it");
        ja4 ja4Var = aw0Var.a;
        if (ja4Var instanceof ha4) {
            ir.mservices.market.version2.ui.recycler.adapter.a aVar = this.P0;
            if (aVar == null || aVar.c() != 0 || (tryAgainViewN02 = N0()) == null) {
                return;
            }
            tryAgainViewN02.t();
            return;
        }
        if (!(ja4Var instanceof ga4)) {
            if (!(ja4Var instanceof ia4)) {
                throw new NoWhenBranchMatchedException();
            }
            TryAgainView tryAgainViewN03 = N0();
            if (tryAgainViewN03 != null) {
                tryAgainViewN03.v();
                return;
            }
            return;
        }
        ir.mservices.market.version2.ui.recycler.adapter.a aVar2 = this.P0;
        if (aVar2 == null || aVar2.c() != 0 || (tryAgainViewN0 = N0()) == null) {
            return;
        }
        Throwable th = ((ga4) ja4Var).b;
        String string = null;
        MyketPagingError myketPagingError = th instanceof MyketPagingError ? (MyketPagingError) th : null;
        if (myketPagingError != null && (errorDTO = myketPagingError.a) != null) {
            string = errorDTO.getTranslatedMessage();
        }
        if (string == null || f88.n0(string)) {
            string = K().getString(rs6.error_dto_default_message);
            js3.o(string, "getString(...)");
        }
        tryAgainViewN0.u(string);
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final boolean S0() {
        return false;
    }

    public final String U0() {
        return dw1.n("ProfileListFragment_", this.H0);
    }

    public final ProfileListViewModel V0() {
        return (ProfileListViewModel) this.Y0.getValue();
    }

    public final void W0(String str, boolean z) {
        Bundle bundleG = is3.g(new Pair("BUNDLE_KEY_LIST_TYPE", str), new Pair("BUNDLE_KEY_IS_APP", Boolean.valueOf(z)));
        String strL = L(rs6.profile_list_report_title);
        js3.o(strL, "getString(...)");
        pk5.g(this.J0, new NavIntentDirections.Report(new f(new DialogDataModel(U0(), "DIALOG_KEY_REPORT_LIST", bundleG, 8), null, L(rs6.report_message), -1, sj8.b().c, sj8.b().d, sj8.b(), false, new ReportDialogFragment.Option[]{new ReportDialogFragment.Option(strL)})), -1);
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        ProfileListViewModel profileListViewModelV0 = V0();
        Bundle bundle2 = this.g;
        profileListViewModelV0.r(new ProfileListAction.Init(bundle2 != null ? bundle2.getBoolean("BUNDLE_KEY_IS_APP") : true));
        J0().setNestedScrollingEnabled(false);
        this.J0.d(U0(), this);
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new ProfileListFragment$onViewCreated$1(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new ProfileListFragment$onViewCreated$2(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new ProfileListFragment$onViewCreated$3(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.e, new ProfileListFragment$onViewCreated$4(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new ProfileListFragment$onViewCreated$5(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new ProfileListFragment$onViewCreated$6(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new ProfileListFragment$onViewCreated$7(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new ProfileListFragment$onViewCreated$8(this, null));
    }
}
