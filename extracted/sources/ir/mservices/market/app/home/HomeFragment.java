package ir.mservices.market.app.home;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.h;
import defpackage.ba7;
import defpackage.bn6;
import defpackage.bp2;
import defpackage.bt2;
import defpackage.c24;
import defpackage.d16;
import defpackage.d56;
import defpackage.fp6;
import defpackage.g27;
import defpackage.hp;
import defpackage.j71;
import defpackage.jb3;
import defpackage.js3;
import defpackage.jx2;
import defpackage.lk2;
import defpackage.lw;
import defpackage.o79;
import defpackage.ob3;
import defpackage.pb3;
import defpackage.pk5;
import defpackage.pq6;
import defpackage.q79;
import defpackage.qb3;
import defpackage.ra3;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.s7;
import defpackage.x79;
import defpackage.y97;
import ir.mservices.market.app.detail.ui.Tracker;
import ir.mservices.market.app.home.HomeAction;
import ir.mservices.market.app.home.ui.recycler.HomeExtensionReviewData;
import ir.mservices.market.appDetail.ToolbarData;
import ir.mservices.market.common.comment.data.CommentScenario;
import ir.mservices.market.common.comment.data.SubmitReviewData;
import ir.mservices.market.data.AppBarSampleData;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.data.StartApplicationData;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import ir.mservices.market.version2.webapi.responsedto.InCompleteReviewDto;
import ir.mservices.market.viewModel.c;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class HomeFragment extends Hilt_HomeFragment {
    public static final /* synthetic */ int y1 = 0;
    public ra3 u1;
    public d56 v1;
    public final o79 w1;
    public lk2 x1;

    public HomeFragment() {
        final HomeFragment$special$$inlined$viewModels$default$1 homeFragment$special$$inlined$viewModels$default$1 = new HomeFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.app.home.HomeFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) homeFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.w1 = new o79(g27.a(HomeViewModel.class), new bp2() { // from class: ir.mservices.market.app.home.HomeFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.app.home.HomeFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.app.home.HomeFragment$special$$inlined$viewModels$default$4
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

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final boolean H1() {
        return false;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final void K1(View view) {
        super.K1(view);
        ((TextView) view.findViewById(rr6.empty_message)).setText(rs6.no_item_in_feature_list);
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final boolean M1() {
        return y1().computeVerticalScrollOffset() > 0;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void X(Bundle bundle) {
        super.X(bundle);
        String strF2 = f2();
        lw.c(strF2, null);
        g2().b = strF2;
    }

    @Override // ir.mservices.market.common.search.BaseSearchFragment, ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public void b0() throws Exception {
        this.J0.x(getClass().getSimpleName() + "_" + this.H0);
        lk2 lk2Var = this.x1;
        if (lk2Var != null) {
            lk2Var.b();
        }
        this.x1 = null;
        super.b0();
    }

    public final void e2(HomeExtensionReviewData homeExtensionReviewData, float f) {
        InCompleteReviewDto inCompleteReviewDto = homeExtensionReviewData.a;
        String packageName = inCompleteReviewDto.getPackageName();
        js3.o(packageName, "getPackageName(...)");
        CommentScenario.SubmitReview submitReview = new CommentScenario.SubmitReview(new SubmitReviewData(packageName, f, null, true, true, new ToolbarData(inCompleteReviewDto), "_home", "HOME", 4, null));
        FragmentActivity fragmentActivityF = F();
        if (fragmentActivityF != null) {
            pk5.c(fragmentActivityF, submitReview);
        }
    }

    @Override // ir.mservices.market.common.search.BaseSearchFragment, ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public void f0() {
        HomeViewModel homeViewModelH2 = h2();
        bt2.G(y97.G(homeViewModelH2), null, null, new HomeViewModel$stopPlayingVideoShot$1(homeViewModelH2, null), 3);
        super.f0();
    }

    public abstract String f2();

    public final ra3 g2() {
        ra3 ra3Var = this.u1;
        if (ra3Var != null) {
            return ra3Var;
        }
        js3.V("homeAnalytics");
        throw null;
    }

    public final HomeViewModel h2() {
        return (HomeViewModel) this.w1.getValue();
    }

    public abstract boolean i2();

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final ir.mservices.market.version2.ui.recycler.adapter.a j1() {
        bn6 bn6Var = new bn6(F());
        jb3 jb3Var = new jb3(this.F0.f());
        jb3Var.p = s1().d();
        jb3Var.q = new ob3(this, 11);
        jb3Var.r = new ob3(this, 3);
        jb3Var.s = new ob3(this, 8);
        jb3Var.t = new ob3(this, 9);
        jb3Var.u = new ob3(this, 10);
        jb3Var.v = new ob3(this, 12);
        int i = 2;
        jb3Var.m = new pb3(bn6Var, this, i);
        jb3Var.o = new qb3(bn6Var, this, i);
        jb3Var.w = new ob3(this, 13);
        jb3Var.n = new pb3(bn6Var, this, 0);
        jb3Var.x = new ob3(this, 14);
        jb3Var.y = new qb3(bn6Var, this, 0);
        int i2 = 1;
        jb3Var.G = new pb3(bn6Var, this, i2);
        jb3Var.H = new qb3(bn6Var, this, i2);
        jb3Var.z = new ob3(this, 15);
        jb3Var.A = new ob3(this, 16);
        jb3Var.B = new ob3(this, 17);
        jb3Var.C = new ob3(this, 18);
        jb3Var.D = new ob3(this, 19);
        jb3Var.E = new ob3(this, 20);
        jb3Var.F = new ob3(this, 21);
        jb3Var.I = new ob3(this, 22);
        jb3Var.J = new ob3(this, 23);
        jb3Var.K = new ob3(this, 24);
        jb3Var.O = new ob3(this, 1);
        jb3Var.N = new ob3(this, 2);
        jb3Var.L = new ob3(this, 4);
        jb3Var.M = new ob3(this, 5);
        jb3Var.P = new ob3(this, 6);
        jb3Var.Q = new ob3(this, 7);
        return jb3Var;
    }

    public final void j2(String str, Tracker tracker, String str2, String str3, String str4, String str5) {
        pk5.g(this.J0, new NavIntentDirections.AppDetail(new hp(str, false, tracker, false, null, str2, str3, str4, null, null, null, null, str5)), -1);
    }

    @Override // ir.mservices.market.common.search.BaseSearchFragment, ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        h2().r(new HomeAction.InitAction(f2(), i2()));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new HomeFragment$onViewCreated$1(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new HomeFragment$onViewCreated$2(this, null));
        this.x1 = (lk2) n0(new ob3(this, 0), new s7(1));
    }

    public final void k2(ApplicationDTO applicationDTO, ImageView imageView, Tracker tracker) {
        js3.p(applicationDTO, "app");
        String iconPath = applicationDTO.getIconPath();
        js3.o(iconPath, "getIconPath(...)");
        String title = applicationDTO.getTitle();
        js3.o(title, "getTitle(...)");
        String packageName = applicationDTO.getPackageName();
        js3.o(packageName, "getPackageName(...)");
        StartApplicationData startApplicationData = new StartApplicationData(new AppBarSampleData(iconPath, title, packageName, null, applicationDTO.getTagline(), null, null, null, 232, null), applicationDTO.getInstallCallbackUrl(), applicationDTO.getClickCallback());
        String packageName2 = applicationDTO.getPackageName();
        js3.o(packageName2, "getPackageName(...)");
        boolean z = s1().b(imageView.getDrawable()) != null;
        String refId = applicationDTO.getRefId();
        js3.o(refId, "getRefId(...)");
        pk5.f(this.J0, new NavIntentDirections.AppDetail(new hp(packageName2, false, tracker, z, null, refId, applicationDTO.getCallbackUrl(), null, startApplicationData, null, null, null, null)));
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final c l1() {
        return h2();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int n1() {
        return K().getDimensionPixelSize(pq6.actionbar_size) + (this instanceof ba7 ? K().getDimensionPixelSize(pq6.bottom_navigation_height) : 0);
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int q1() {
        return fp6.layout_animation_fade;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final h t1() {
        return new d16(K().getDimensionPixelSize(pq6.space_s), K().getDimensionPixelSize(pq6.space_l), 0, 0, 0, 0, 1, false, this.F0.f());
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int v1() {
        return 1;
    }
}
