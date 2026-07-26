package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.animation.core.f;
import androidx.compose.foundation.k;
import androidx.compose.foundation.lazy.b;
import androidx.compose.material3.internal.m;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.d;
import androidx.fragment.app.g;
import androidx.lifecycle.Lifecycle$State;
import androidx.navigation.fragment.NavHostFragment;
import androidx.paging.LoadType;
import androidx.paging.i;
import defpackage.j71;
import defpackage.jx2;
import defpackage.q79;
import defpackage.x79;
import ir.mservices.market.app.detail.more.ui.MoreDescriptionFragment;
import ir.mservices.market.app.detail.update.data.InAppUpdateData;
import ir.mservices.market.appDetail.DetailToolbarView;
import ir.mservices.market.download.movie.MovieDownloadRecyclerListFragment;
import ir.mservices.market.movie.download.core.MovieDownloadViewModel;
import ir.mservices.market.movie.ui.bookmark.MovieBookmarkRecyclerListFragment;
import ir.mservices.market.movie.ui.detail.MovieDetailRecyclerListFragment;
import ir.mservices.market.movie.ui.detail.recycler.MovieDescriptionData;
import ir.mservices.market.movie.ui.detail.review.MovieCommentFlowFragment;
import ir.mservices.market.myReview.MyReviewsContentViewModel;
import ir.mservices.market.myReview.incomplete.InCompleteReviewRecyclerListFragment;
import ir.mservices.market.myReview.incomplete.InCompleteReviewRecyclerListFragment$myReviewsViewModel_delegate$lambda$0$$inlined$viewModels$default$1;
import ir.mservices.market.social.profile.common.recycler.ProfileInfoData;
import ir.mservices.market.social.profile.own.OwnProfileHeaderFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hk3 implements bp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hk3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v96, types: [c24, java.lang.Object] */
    @Override // defpackage.bp2
    public final Object invoke() throws Throwable {
        Throwable th;
        i64 i64VarD;
        int i = this.a;
        Throwable th2 = null;
        tx8 tx8Var = tx8.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new lp((InAppUpdateData) obj);
            case 1:
                int i2 = InCompleteReviewRecyclerListFragment.k1;
                final d dVarR0 = ((InCompleteReviewRecyclerListFragment) obj).r0();
                final InCompleteReviewRecyclerListFragment$myReviewsViewModel_delegate$lambda$0$$inlined$viewModels$default$1 inCompleteReviewRecyclerListFragment$myReviewsViewModel_delegate$lambda$0$$inlined$viewModels$default$1 = new InCompleteReviewRecyclerListFragment$myReviewsViewModel_delegate$lambda$0$$inlined$viewModels$default$1(dVarR0);
                final c24 c24VarB = a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.myReview.incomplete.InCompleteReviewRecyclerListFragment$myReviewsViewModel_delegate$lambda$0$$inlined$viewModels$default$2
                    {
                        super(0);
                    }

                    @Override // defpackage.bp2
                    public final Object invoke() {
                        return inCompleteReviewRecyclerListFragment$myReviewsViewModel_delegate$lambda$0$$inlined$viewModels$default$1.g;
                    }
                });
                return new o79(g27.a(MyReviewsContentViewModel.class), new bp2() { // from class: ir.mservices.market.myReview.incomplete.InCompleteReviewRecyclerListFragment$myReviewsViewModel_delegate$lambda$0$$inlined$viewModels$default$3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
                    @Override // defpackage.bp2
                    public final Object invoke() {
                        return ((x79) c24VarB.getValue()).m();
                    }
                }, new bp2() { // from class: ir.mservices.market.myReview.incomplete.InCompleteReviewRecyclerListFragment$myReviewsViewModel_delegate$lambda$0$$inlined$viewModels$default$5
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
                        return (jx2Var == null || (q79VarH = jx2Var.h()) == null) ? dVarR0.h() : q79VarH;
                    }
                }, new bp2() { // from class: ir.mservices.market.myReview.incomplete.InCompleteReviewRecyclerListFragment$myReviewsViewModel_delegate$lambda$0$$inlined$viewModels$default$4
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
            case 2:
                return ((zl3) obj).a.queryBuilder().orderBy("received_date_time", false).query();
            case 3:
                return Float.valueOf(f.h(((e71) obj).getCoroutineContext()));
            case 4:
                Object systemService = ((View) ((do3) obj).a).getContext().getSystemService("input_method");
                js3.n(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                return (InputMethodManager) systemService;
            case 5:
                return bt2.y((Class) obj);
            case 6:
                return Integer.valueOf(((b) obj).g().n);
            case 7:
                return new BaseInputConnection(((y44) obj).a, false);
            case 8:
                k kVar = (k) obj;
                if (kVar.D0() <= kVar.C0()) {
                    return null;
                }
                ((wi4) ((s08) kVar.w).getValue()).getClass();
                return Float.valueOf(kVar.E0() + kVar.D0());
            case 9:
                return new ir.myket.player.provider.service.b((sq4) obj);
            case 10:
                ((lw4) obj).e.invoke();
                return tx8Var;
            case 11:
                int i3 = MoreDescriptionFragment.l1;
                FragmentActivity fragmentActivityF = ((MoreDescriptionFragment) obj).F();
                if (fragmentActivityF == null) {
                    return null;
                }
                DetailToolbarView detailToolbarView = new DetailToolbarView(fragmentActivityF);
                detailToolbarView.setVisibility(8);
                detailToolbarView.setBackgroundColor(sj8.b().l);
                return detailToolbarView;
            case 12:
                return (iz4) jp0.b(((cp0) obj).i());
            case 13:
                int i4 = MovieBookmarkRecyclerListFragment.j1;
                return ((MovieBookmarkRecyclerListFragment) obj).r0();
            case 14:
                MovieCommentFlowFragment movieCommentFlowFragment = (MovieCommentFlowFragment) obj;
                int i5 = MovieCommentFlowFragment.P0;
                return t61.j(movieCommentFlowFragment.getClass().getSimpleName(), "_", movieCommentFlowFragment.H0);
            case 15:
                ((MovieDescriptionData) obj).b = true;
                return tx8Var;
            case 16:
                int i6 = MovieDetailRecyclerListFragment.H1;
                return Boolean.valueOf(((MovieDetailRecyclerListFragment) obj).K().getBoolean(yp6.movie_detail_tablet));
            case 17:
                int i7 = MovieDownloadRecyclerListFragment.l1;
                return ((MovieDownloadRecyclerListFragment) obj).r0();
            case 18:
                return MovieDownloadViewModel.writeStoragePermission_delegate$lambda$0((MovieDownloadViewModel) obj);
            case 19:
                ((bq1) obj).a();
                return tx8Var;
            case 20:
                az5 az5Var = (az5) kotlin.collections.a.p0(((ea5) obj).b.a.a.b());
                if (az5Var != null && (az5Var instanceof i)) {
                    i iVar = (i) az5Var;
                    if (iVar.a == LoadType.a) {
                        return iVar;
                    }
                }
                return null;
            case 21:
                gi5 gi5Var = ((ei5) obj).h;
                if (!gi5Var.i) {
                    throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                }
                if (gi5Var.j.d != Lifecycle$State.a) {
                    return ((fi5) vs8.c(gi5Var.a, (q79) gi5Var.m.getValue()).o(g27.a(fi5.class))).b;
                }
                throw new IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
            case 22:
                NavHostFragment navHostFragment = (NavHostFragment) obj;
                Context contextH = navHostFragment.H();
                if (contextH == null) {
                    throw new IllegalStateException("NavController cannot be created before the fragment is attached");
                }
                ij5 ij5Var = new ij5(contextH);
                ni5 ni5Var = ij5Var.b;
                bm2 bm2Var = ni5Var.q;
                ll5 ll5Var = ni5Var.r;
                if (!navHostFragment.equals(ni5Var.m)) {
                    g64 g64Var = ni5Var.m;
                    if (g64Var != null && (i64VarD = g64Var.D()) != null) {
                        i64VarD.f(bm2Var);
                    }
                    ni5Var.m = navHostFragment;
                    navHostFragment.U.a(bm2Var);
                }
                u79 u79VarM = navHostFragment.m();
                if (!js3.i(ni5Var.n, yh0.t(u79VarM))) {
                    if (!ni5Var.f.isEmpty()) {
                        throw new IllegalStateException("ViewModelStore should be set before setGraph call");
                    }
                    ni5Var.n = yh0.t(u79VarM);
                }
                Context contextQ0 = navHostFragment.q0();
                g gVarG = navHostFragment.G();
                js3.o(gVarG, "getChildFragmentManager(...)");
                ll5Var.a(new hn1(contextQ0, gVarG));
                Context contextQ02 = navHostFragment.q0();
                g gVarG2 = navHostFragment.G();
                js3.o(gVarG2, "getChildFragmentManager(...)");
                int i8 = navHostFragment.z;
                if (i8 == 0 || i8 == -1) {
                    i8 = kr6.nav_host_fragment_container;
                }
                ll5Var.a(new dm2(contextQ02, gVarG2, i8));
                Bundle bundleO = ((bn6) navHostFragment.Y.c).o("android-support-nav:fragment:navControllerState");
                if (bundleO != null) {
                    bundleO.setClassLoader(contextH.getClassLoader());
                    LinkedHashMap linkedHashMap = ni5Var.l;
                    ni5Var.d = bundleO.containsKey("android-support-nav:controller:navigatorState") ? t17.c(bundleO, "android-support-nav:controller:navigatorState") : null;
                    ni5Var.e = bundleO.containsKey("android-support-nav:controller:backStack") ? (Bundle[]) t17.d(bundleO, "android-support-nav:controller:backStack").toArray(new Bundle[0]) : null;
                    linkedHashMap.clear();
                    if (bundleO.containsKey("android-support-nav:controller:backStackDestIds") && bundleO.containsKey("android-support-nav:controller:backStackIds")) {
                        int[] intArray = bundleO.getIntArray("android-support-nav:controller:backStackDestIds");
                        if (intArray == null) {
                            z17.f("android-support-nav:controller:backStackDestIds");
                            throw null;
                        }
                        ArrayList<String> stringArrayList = bundleO.getStringArrayList("android-support-nav:controller:backStackIds");
                        if (stringArrayList == null) {
                            z17.f("android-support-nav:controller:backStackIds");
                            throw null;
                        }
                        int length = intArray.length;
                        int i9 = 0;
                        int i10 = 0;
                        while (i9 < length) {
                            int i11 = i10 + 1;
                            Throwable th3 = th2;
                            ni5Var.k.put(Integer.valueOf(intArray[i9]), !js3.i(stringArrayList.get(i10), "") ? (String) stringArrayList.get(i10) : th3);
                            i9++;
                            i10 = i11;
                            th2 = th3;
                        }
                    }
                    th = th2;
                    if (bundleO.containsKey("android-support-nav:controller:backStackStates")) {
                        ArrayList<String> stringArrayList2 = bundleO.getStringArrayList("android-support-nav:controller:backStackStates");
                        if (stringArrayList2 == null) {
                            z17.f("android-support-nav:controller:backStackStates");
                            throw th;
                        }
                        for (String str : stringArrayList2) {
                            String str2 = "android-support-nav:controller:backStackStates:" + str;
                            js3.p(str2, "key");
                            if (bundleO.containsKey(str2)) {
                                ArrayList arrayListD = t17.d(bundleO, "android-support-nav:controller:backStackStates:" + str);
                                ov ovVar = new ov(arrayListD.size());
                                Iterator it = arrayListD.iterator();
                                while (it.hasNext()) {
                                    ovVar.addLast(new hi5((Bundle) it.next()));
                                }
                                linkedHashMap.put(str, ovVar);
                            }
                        }
                    }
                    boolean z = bundleO.getBoolean("android-support-nav:controller:deepLinkHandled", false);
                    Boolean boolValueOf = (z || !bundleO.getBoolean("android-support-nav:controller:deepLinkHandled", true)) ? Boolean.valueOf(z) : th;
                    ij5Var.e = boolValueOf != 0 ? boolValueOf.booleanValue() : false;
                } else {
                    th = null;
                }
                ((bn6) navHostFragment.Y.c).u("android-support-nav:fragment:navControllerState", new yx0(4, ij5Var));
                Bundle bundleO2 = ((bn6) navHostFragment.Y.c).o("android-support-nav:fragment:graphId");
                if (bundleO2 != null) {
                    navHostFragment.C0 = bundleO2.getInt("android-support-nav:fragment:graphId");
                }
                ((bn6) navHostFragment.Y.c).u("android-support-nav:fragment:graphId", new yx0(5, navHostFragment));
                int i12 = navHostFragment.C0;
                if (i12 != 0) {
                    ij5Var.e(i12);
                } else {
                    Bundle bundle = navHostFragment.g;
                    int i13 = bundle != null ? bundle.getInt("android-support-nav:fragment:graphId") : 0;
                    Bundle bundle2 = bundle != null ? bundle.getBundle("android-support-nav:fragment:startDestinationArgs") : th;
                    if (i13 != 0) {
                        ij5Var.f(i13, bundle2);
                    }
                }
                return ij5Var;
            case 23:
                return (aw6) ((coil3.a) obj).a.e.getValue();
            case 24:
                we6 we6Var = (we6) obj;
                return ja1.B(we6Var.c, we6Var.a, we6Var.b);
            case 25:
                return new au1(wq2.L(m.d, m.e, ((jh8) obj).a()));
            case 26:
                int i14 = OwnProfileHeaderFragment.Z0;
                return ((OwnProfileHeaderFragment) obj).r0();
            case 27:
                ((ProfileInfoData) obj).b = true;
                return tx8Var;
            case 28:
                i iVar2 = i.g;
                return ml9.d(br9.B(new mq8(0, EmptyList.a)), 0, 0, (na4) obj, null);
            default:
                ((androidx.paging.a) obj).l.e(tx8Var);
                return tx8Var;
        }
    }
}
