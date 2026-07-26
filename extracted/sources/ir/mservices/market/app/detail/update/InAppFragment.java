package ir.mservices.market.app.detail.update;

import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.bp2;
import defpackage.bt2;
import defpackage.c24;
import defpackage.dp3;
import defpackage.ds6;
import defpackage.f88;
import defpackage.g27;
import defpackage.j71;
import defpackage.js3;
import defpackage.jx2;
import defpackage.m92;
import defpackage.o79;
import defpackage.og5;
import defpackage.p3;
import defpackage.pq6;
import defpackage.q79;
import defpackage.qg5;
import defpackage.vj3;
import defpackage.wq2;
import defpackage.x79;
import defpackage.y97;
import ir.mservices.market.app.detail.data.AppVersionDto;
import ir.mservices.market.app.detail.ui.recycler.AppDownloadData;
import ir.mservices.market.app.detail.ui.recycler.b;
import ir.mservices.market.app.detail.update.InAppFragment;
import ir.mservices.market.app.detail.update.InAppUpdateViewModel;
import ir.mservices.market.app.detail.update.data.InAppUpdateData;
import ir.mservices.market.download.common.data.AppDownloadInfo;
import ir.mservices.market.version2.download.DownloadDataModel;
import ir.mservices.market.version2.manager.a;
import ir.mservices.market.version2.model.AppDownloadFlowStatus;
import ir.mservices.market.viewModel.c;
import java.util.AbstractMap;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: loaded from: classes3.dex */
public final class InAppFragment extends Hilt_InAppFragment {
    public static final /* synthetic */ int a1 = 0;
    public ir.mservices.market.version2.manager.a Y0;
    public final o79 Z0;

    public InAppFragment() {
        final InAppFragment$special$$inlined$viewModels$default$1 inAppFragment$special$$inlined$viewModels$default$1 = new InAppFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = kotlin.a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.app.detail.update.InAppFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) inAppFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.Z0 = new o79(g27.a(InAppUpdateViewModel.class), new bp2() { // from class: ir.mservices.market.app.detail.update.InAppFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.app.detail.update.InAppFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.app.detail.update.InAppFragment$special$$inlined$viewModels$default$4
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

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final ir.mservices.market.version2.ui.recycler.adapter.a D0() {
        K().getValue(pq6.app_info_height_factor, new TypedValue(), true);
        p3.g(F());
        int iI0 = I0();
        this.F0.f();
        m92 m92Var = new m92(iI0, 1);
        m92Var.m = new vj3(1);
        m92Var.n = new vj3(2);
        m92Var.o = new vj3(3);
        final int i = 0;
        m92Var.p = new og5(this) { // from class: ik3
            public final /* synthetic */ InAppFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i2 = i;
                InAppFragment inAppFragment = this.b;
                b bVar = (b) qg5Var;
                AppDownloadData appDownloadData = (AppDownloadData) obj;
                switch (i2) {
                    case 0:
                        int i3 = InAppFragment.a1;
                        js3.p(view, "<unused var>");
                        js3.p(bVar, "<unused var>");
                        js3.p(appDownloadData, "recyclerData");
                        InAppUpdateViewModel inAppUpdateViewModel = (InAppUpdateViewModel) inAppFragment.Z0.getValue();
                        String str = appDownloadData.g;
                        js3.p(str, "packageName");
                        inAppUpdateViewModel.v.s(str);
                        a aVar = inAppFragment.Y0;
                        String str2 = null;
                        if (aVar == null) {
                            js3.V("appManager");
                            throw null;
                        }
                        int iOrdinal = aVar.d(str, appDownloadData.j, appDownloadData.e, appDownloadData.k).ordinal();
                        if (iOrdinal == 3) {
                            str2 = "detail_button_pause";
                        } else if (iOrdinal == 5) {
                            str2 = "button_install_in_progress";
                        }
                        if (str2 != null) {
                            dw1.y(str2);
                            return;
                        }
                        return;
                    default:
                        int i4 = InAppFragment.a1;
                        js3.p(view, "<unused var>");
                        js3.p(bVar, "<unused var>");
                        js3.p(appDownloadData, "<unused var>");
                        InAppUpdateViewModel inAppUpdateViewModel2 = (InAppUpdateViewModel) inAppFragment.Z0.getValue();
                        InAppUpdateData inAppUpdateData = inAppUpdateViewModel2.x;
                        if (inAppUpdateData != null) {
                            inAppUpdateViewModel2.w.C(new DownloadDataModel(inAppUpdateData, inAppUpdateData.n, inAppUpdateData.o));
                            return;
                        }
                        return;
                }
            }
        };
        final int i2 = 1;
        m92Var.q = new og5(this) { // from class: ik3
            public final /* synthetic */ InAppFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i22 = i2;
                InAppFragment inAppFragment = this.b;
                b bVar = (b) qg5Var;
                AppDownloadData appDownloadData = (AppDownloadData) obj;
                switch (i22) {
                    case 0:
                        int i3 = InAppFragment.a1;
                        js3.p(view, "<unused var>");
                        js3.p(bVar, "<unused var>");
                        js3.p(appDownloadData, "recyclerData");
                        InAppUpdateViewModel inAppUpdateViewModel = (InAppUpdateViewModel) inAppFragment.Z0.getValue();
                        String str = appDownloadData.g;
                        js3.p(str, "packageName");
                        inAppUpdateViewModel.v.s(str);
                        a aVar = inAppFragment.Y0;
                        String str2 = null;
                        if (aVar == null) {
                            js3.V("appManager");
                            throw null;
                        }
                        int iOrdinal = aVar.d(str, appDownloadData.j, appDownloadData.e, appDownloadData.k).ordinal();
                        if (iOrdinal == 3) {
                            str2 = "detail_button_pause";
                        } else if (iOrdinal == 5) {
                            str2 = "button_install_in_progress";
                        }
                        if (str2 != null) {
                            dw1.y(str2);
                            return;
                        }
                        return;
                    default:
                        int i4 = InAppFragment.a1;
                        js3.p(view, "<unused var>");
                        js3.p(bVar, "<unused var>");
                        js3.p(appDownloadData, "<unused var>");
                        InAppUpdateViewModel inAppUpdateViewModel2 = (InAppUpdateViewModel) inAppFragment.Z0.getValue();
                        InAppUpdateData inAppUpdateData = inAppUpdateViewModel2.x;
                        if (inAppUpdateData != null) {
                            inAppUpdateViewModel2.w.C(new DownloadDataModel(inAppUpdateData, inAppUpdateData.n, inAppUpdateData.o));
                            return;
                        }
                        return;
                }
            }
        };
        m92Var.r = new og5() { // from class: ir.mservices.market.app.detail.update.a
            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i3 = InAppFragment.a1;
                js3.p(view, "<unused var>");
                js3.p((ir.mservices.market.app.detail.ui.recycler.b) qg5Var, "<unused var>");
                js3.p((AppDownloadData) obj, "<unused var>");
                InAppUpdateViewModel inAppUpdateViewModel = (InAppUpdateViewModel) this.a.Z0.getValue();
                ir.mservices.market.version2.manager.a aVar = inAppUpdateViewModel.t;
                InAppUpdateData inAppUpdateData = inAppUpdateViewModel.x;
                if (inAppUpdateData != null) {
                    String str = inAppUpdateData.a;
                    AppDownloadInfo appDownloadInfoI = inAppUpdateViewModel.v.i(str, null);
                    if (!wq2.l(inAppUpdateData.g, appDownloadInfoI != null ? appDownloadInfoI.getLocalSize() : 0L)) {
                        String str2 = inAppUpdateData.d;
                        String str3 = inAppUpdateData.c;
                        aVar.getClass();
                        ir.mservices.market.version2.manager.a.e(str2, str3);
                        return;
                    }
                    dp3 dp3Var = inAppUpdateViewModel.w;
                    AppVersionDto appVersionDto = inAppUpdateData.b;
                    AppDownloadFlowStatus appDownloadFlowStatusD = aVar.d(str, appVersionDto.getCode(), inAppUpdateData.j, inAppUpdateData.m);
                    if (appDownloadFlowStatusD == AppDownloadFlowStatus.b || appDownloadFlowStatusD == AppDownloadFlowStatus.c) {
                        String strR = dp3Var.r(appVersionDto.getCode(), str);
                        if (strR != null) {
                            f88.n0(strR);
                        }
                        dp3Var.j.put(new AbstractMap.SimpleEntry(str, Integer.valueOf(appVersionDto.getCode())), "");
                        bt2.G(y97.G(inAppUpdateViewModel), null, null, new InAppUpdateViewModel$startDownloadFlow$1$3(inAppUpdateViewModel, inAppUpdateData, null), 3);
                    }
                }
            }
        };
        m92Var.s = new vj3(4);
        return m92Var;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final c E0() {
        return (InAppUpdateViewModel) this.Z0.getValue();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final int I0() {
        return K().getInteger(ds6.detail_max_span);
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final String L0() {
        return null;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final boolean O0() {
        return false;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment
    public final boolean S0() {
        return false;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        RecyclerView recyclerViewJ0 = J0();
        recyclerViewJ0.getLayoutParams().height = -2;
        recyclerViewJ0.setNestedScrollingEnabled(false);
        view.getLayoutParams().height = -2;
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new InAppFragment$onViewCreated$2(this, null));
    }
}
