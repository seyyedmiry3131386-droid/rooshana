package ir.mservices.market.download.recentDownload;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.bi5;
import defpackage.bp2;
import defpackage.bx6;
import defpackage.c24;
import defpackage.co1;
import defpackage.d04;
import defpackage.fa1;
import defpackage.g27;
import defpackage.gp;
import defpackage.j71;
import defpackage.js3;
import defpackage.js6;
import defpackage.jx2;
import defpackage.m91;
import defpackage.nw7;
import defpackage.o79;
import defpackage.pq6;
import defpackage.q79;
import defpackage.qz6;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.uw6;
import defpackage.x79;
import defpackage.xv3;
import defpackage.yw6;
import defpackage.zw6;
import ir.mservices.market.common.ui.recycler.layoutManager.MyketGridLayoutManager;
import ir.mservices.market.download.recentDownload.RecentDownloadBottomDialogFragment;
import ir.mservices.market.theme.ThemeData;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: loaded from: classes3.dex */
public final class RecentDownloadBottomDialogFragment extends Hilt_RecentDownloadBottomDialogFragment {
    public d04 h1;
    public uw6 i1;
    public final bi5 j1 = new bi5(g27.a(zw6.class), new yw6(0, this));
    public final o79 k1;
    public final c24 l1;
    public final c24 m1;

    public RecentDownloadBottomDialogFragment() {
        final RecentDownloadBottomDialogFragment$special$$inlined$viewModels$default$1 recentDownloadBottomDialogFragment$special$$inlined$viewModels$default$1 = new RecentDownloadBottomDialogFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = kotlin.a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.download.recentDownload.RecentDownloadBottomDialogFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) recentDownloadBottomDialogFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.k1 = new o79(g27.a(RecentDownloadViewModel.class), new bp2() { // from class: ir.mservices.market.download.recentDownload.RecentDownloadBottomDialogFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.download.recentDownload.RecentDownloadBottomDialogFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.download.recentDownload.RecentDownloadBottomDialogFragment$special$$inlined$viewModels$default$4
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
        final int i = 0;
        this.l1 = kotlin.a.a(new bp2(this) { // from class: ww6
            public final /* synthetic */ RecentDownloadBottomDialogFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                switch (i) {
                    case 0:
                        RecentDownloadBottomDialogFragment recentDownloadBottomDialogFragment = this.b;
                        bx6 bx6Var = new bx6(((Number) recentDownloadBottomDialogFragment.m1.getValue()).intValue());
                        bx6Var.l = new ts5(10, recentDownloadBottomDialogFragment);
                        bx6Var.m = new bn6(recentDownloadBottomDialogFragment.F());
                        bx6Var.y(new v25(bx6Var, recentDownloadBottomDialogFragment, 15));
                        return bx6Var;
                    default:
                        return Integer.valueOf(this.b.K().getInteger(ds6.recent_download_max_span));
                }
            }
        });
        final int i2 = 1;
        this.m1 = kotlin.a.a(new bp2(this) { // from class: ww6
            public final /* synthetic */ RecentDownloadBottomDialogFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        RecentDownloadBottomDialogFragment recentDownloadBottomDialogFragment = this.b;
                        bx6 bx6Var = new bx6(((Number) recentDownloadBottomDialogFragment.m1.getValue()).intValue());
                        bx6Var.l = new ts5(10, recentDownloadBottomDialogFragment);
                        bx6Var.m = new bn6(recentDownloadBottomDialogFragment.F());
                        bx6Var.y(new v25(bx6Var, recentDownloadBottomDialogFragment, 15));
                        return bx6Var;
                    default:
                        return Integer.valueOf(this.b.K().getInteger(ds6.recent_download_max_span));
                }
            }
        });
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final DialogDataModel L0() {
        return ((zw6) this.j1.getValue()).a;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final String M0() {
        return "RecentDownloadBottomDialogFragment";
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final ThemeData O0() {
        return sj8.b();
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void X(Bundle bundle) {
        super.X(bundle);
        this.Y0 = true;
        this.a1 = true;
        this.Z0 = true;
    }

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        int i = uw6.y;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        uw6 uw6Var = (uw6) fa1.c(layoutInflater, js6.recent_download_bottom_dialog, viewGroup, false);
        this.i1 = uw6Var;
        js3.m(uw6Var);
        View view = uw6Var.l;
        js3.o(view, "getRoot(...)");
        return view;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void b0() {
        super.b0();
        this.i1 = null;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        uw6 uw6Var = this.i1;
        js3.m(uw6Var);
        uw6Var.x.setTitle(L(rs6.downloads_status));
        uw6Var.v.setBackgroundColor(sj8.b().v);
        RecyclerView recyclerView = uw6Var.w;
        recyclerView.setLayoutDirection(3);
        c24 c24Var = this.m1;
        recyclerView.setLayoutManager(new MyketGridLayoutManager(((Number) c24Var.getValue()).intValue()));
        c24 c24Var2 = this.l1;
        recyclerView.setAdapter((bx6) c24Var2.getValue());
        m91.l((bx6) c24Var2.getValue(), new xv3(recyclerView, this, 15));
        int dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(pq6.space_12);
        int dimensionPixelSize2 = recyclerView.getResources().getDimensionPixelSize(pq6.space_4);
        int iIntValue = ((Number) c24Var.getValue()).intValue();
        d04 d04Var = this.h1;
        if (d04Var == null) {
            js3.V("languageHelper");
            throw null;
        }
        recyclerView.i(new co1(dimensionPixelSize, 0, dimensionPixelSize2, 0, iIntValue, d04Var.f()));
        recyclerView.setLayoutAnimation(null);
        recyclerView.setItemAnimator(null);
        qz6 itemAnimator = recyclerView.getItemAnimator();
        nw7 nw7Var = itemAnimator instanceof nw7 ? (nw7) itemAnimator : null;
        if (nw7Var != null) {
            nw7Var.g = false;
        }
        qz6 itemAnimator2 = recyclerView.getItemAnimator();
        nw7 nw7Var2 = itemAnimator2 instanceof nw7 ? (nw7) itemAnimator2 : null;
        if (nw7Var2 != null) {
            nw7Var2.d = 0L;
        }
        recyclerView.j(new gp(15, this));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new RecentDownloadBottomDialogFragment$onViewCreated$1$2(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new RecentDownloadBottomDialogFragment$onViewCreated$1$3(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new RecentDownloadBottomDialogFragment$onViewCreated$1$4(this, null));
    }
}
