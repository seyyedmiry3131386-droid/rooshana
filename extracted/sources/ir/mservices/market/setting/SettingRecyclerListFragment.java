package ir.mservices.market.setting;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.h;
import defpackage.bp2;
import defpackage.bt2;
import defpackage.c24;
import defpackage.cr7;
import defpackage.d16;
import defpackage.ds6;
import defpackage.dw1;
import defpackage.fp6;
import defpackage.g27;
import defpackage.j71;
import defpackage.js3;
import defpackage.jx2;
import defpackage.lz3;
import defpackage.mr7;
import defpackage.o79;
import defpackage.og5;
import defpackage.p3;
import defpackage.pq6;
import defpackage.q79;
import defpackage.qg5;
import defpackage.qj8;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.vr1;
import defpackage.x79;
import defpackage.y45;
import defpackage.y97;
import ir.mservices.market.activity.BaseFragmentContentActivity;
import ir.mservices.market.common.ui.recycler.layoutManager.PaddingLayoutManager$Padding;
import ir.mservices.market.setting.recycler.KidsModeData;
import ir.mservices.market.theme.ThemeStyle;
import ir.mservices.market.viewModel.c;
import kotlin.LazyThreadSafetyMode;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class SettingRecyclerListFragment extends Hilt_SettingRecyclerListFragment {
    public static final /* synthetic */ int k1 = 0;
    public final o79 i1;
    public mr7 j1;

    public SettingRecyclerListFragment() {
        final SettingRecyclerListFragment$special$$inlined$viewModels$default$1 settingRecyclerListFragment$special$$inlined$viewModels$default$1 = new SettingRecyclerListFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = kotlin.a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.setting.SettingRecyclerListFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) settingRecyclerListFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.i1 = new o79(g27.a(SettingViewModel.class), new bp2() { // from class: ir.mservices.market.setting.SettingRecyclerListFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.setting.SettingRecyclerListFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.setting.SettingRecyclerListFragment$special$$inlined$viewModels$default$4
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

    /* JADX WARN: Removed duplicated region for block: B:61:0x0156  */
    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, defpackage.mm2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void B(android.os.Bundle r14, java.lang.String r15) {
        /*
            Method dump skipped, instruction units count: 706
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.setting.SettingRecyclerListFragment.B(android.os.Bundle, java.lang.String):void");
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        String strL = L(rs6.page_name_setting);
        js3.o(strL, "getString(...)");
        return strL;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final int H0() {
        return sj8.b().p;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final boolean H1() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final int M0() {
        return sj8.b().p;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final boolean M1() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final int P0() {
        return sj8.b().p;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String Q0(BaseFragmentContentActivity baseFragmentContentActivity) {
        String string = baseFragmentContentActivity.getString(rs6.menu_item_setting);
        js3.o(string, "getString(...)");
        return string;
    }

    public final String Q1() {
        return dw1.n("SettingRecyclerListFragment_", this.H0);
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final int R0() {
        return sj8.b().p;
    }

    public final SettingViewModel R1() {
        return (SettingViewModel) this.i1.getValue();
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean U0() {
        return true;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void b0() throws Exception {
        this.J0.x(Q1());
        super.b0();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final ir.mservices.market.version2.ui.recycler.adapter.a j1() {
        vr1 vr1Var = new vr1(v1(), p3.g(F()), this.F0.f());
        vr1Var.p = new cr7(this, 0);
        vr1Var.q = new y45(29);
        vr1Var.r = new cr7(this, 1);
        vr1Var.s = new cr7(this, 2);
        vr1Var.t = new cr7(this, 3);
        vr1Var.o = new og5() { // from class: ir.mservices.market.setting.a
            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i = SettingRecyclerListFragment.k1;
                js3.p(view, "<unused var>");
                js3.p((lz3) qg5Var, "<unused var>");
                js3.p((KidsModeData) obj, "<unused var>");
                SettingViewModel settingViewModelR1 = this.a.R1();
                bt2.G(y97.G(settingViewModelR1), null, null, new SettingViewModel$toggleKidsMode$1(settingViewModelR1, null), 3);
            }
        };
        return vr1Var;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        this.J0.d(Q1(), this);
        ir.mservices.market.version2.core.utils.a.c(this, 0L, new SettingRecyclerListFragment$onViewCreated$1(this, null));
        ir.mservices.market.version2.core.utils.a.c(this, 0L, new SettingRecyclerListFragment$onViewCreated$2(this, null));
        ir.mservices.market.version2.core.utils.a.c(this, 0L, new SettingRecyclerListFragment$onViewCreated$3(this, null));
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final c l1() {
        return R1();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment
    public void onEvent(qj8 qj8Var) {
        js3.p(qj8Var, "event");
        super.onEvent(qj8Var);
        SettingViewModel settingViewModelR1 = R1();
        l lVar = settingViewModelR1.E;
        ThemeStyle themeStyleC = settingViewModelR1.u.c();
        js3.o(themeStyleC, "getThemeStyle(...)");
        lVar.getClass();
        lVar.p(null, themeStyleC);
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final View p1(ViewGroup viewGroup) {
        return null;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int q1() {
        return fp6.layout_animation_fall_down_fast;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final h t1() {
        return new d16(K().getDimensionPixelSize(pq6.space_l) + K().getDimensionPixelSize(pq6.space_4), 0, K().getDimensionPixelSize(pq6.space_8) + K().getDimensionPixelSize(pq6.space_xs), 0, v1(), false, this.F0.f());
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final PaddingLayoutManager$Padding u1() {
        int dimensionPixelSize = K().getDimensionPixelSize(pq6.horizontal_space_inner) + K().getDimensionPixelSize(pq6.horizontal_space_outer);
        return new PaddingLayoutManager$Padding(dimensionPixelSize, 0, dimensionPixelSize, 0);
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int v1() {
        return K().getInteger(ds6.setting_max_span);
    }
}
