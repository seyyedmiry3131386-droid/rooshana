package ir.mservices.market.movie.download.quality;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.bi5;
import defpackage.bp2;
import defpackage.bt1;
import defpackage.c24;
import defpackage.co1;
import defpackage.d;
import defpackage.d04;
import defpackage.de;
import defpackage.fa1;
import defpackage.g27;
import defpackage.j71;
import defpackage.js3;
import defpackage.js6;
import defpackage.jx2;
import defpackage.k68;
import defpackage.lm7;
import defpackage.m91;
import defpackage.nw7;
import defpackage.o79;
import defpackage.pq6;
import defpackage.q79;
import defpackage.qz6;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.ws1;
import defpackage.x79;
import ir.mservices.market.common.ui.recycler.layoutManager.MyketGridLayoutManager;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.movie.download.core.DownloadAction;
import ir.mservices.market.movie.download.core.MovieDownloadViewModel;
import ir.mservices.market.movie.download.core.model.MovieDownloadMetaData;
import ir.mservices.market.movie.download.quality.DownloadQualityDialogFragment;
import ir.mservices.market.movie.download.quality.recycler.DownloadQualityData;
import ir.mservices.market.movie.download.quality.recycler.DownloadQualityRecentData;
import ir.mservices.market.movie.download.quality.recycler.a;
import ir.mservices.market.movie.download.quality.recycler.b;
import ir.mservices.market.movie.uri.downloadInfo.data.DownloadInfoResponse;
import ir.mservices.market.movie.uri.downloadInfo.data.QualityItem;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.views.DialogHeaderComponent;
import java.util.Locale;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: loaded from: classes3.dex */
public final class DownloadQualityDialogFragment extends Hilt_DownloadQualityDialogFragment {
    public d04 h1;
    public k68 i1;
    public final o79 j1;
    public final o79 k1;
    public final bi5 l1;
    public lm7 m1;
    public final c24 n1;
    public final c24 o1;

    public DownloadQualityDialogFragment() {
        final DownloadQualityDialogFragment$special$$inlined$viewModels$default$1 downloadQualityDialogFragment$special$$inlined$viewModels$default$1 = new DownloadQualityDialogFragment$special$$inlined$viewModels$default$1(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.c;
        final c24 c24VarB = kotlin.a.b(lazyThreadSafetyMode, new bp2() { // from class: ir.mservices.market.movie.download.quality.DownloadQualityDialogFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) downloadQualityDialogFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.j1 = new o79(g27.a(DownloadQualityViewModel.class), new bp2() { // from class: ir.mservices.market.movie.download.quality.DownloadQualityDialogFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.movie.download.quality.DownloadQualityDialogFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.movie.download.quality.DownloadQualityDialogFragment$special$$inlined$viewModels$default$4
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
        final DownloadQualityDialogFragment$special$$inlined$viewModels$default$6 downloadQualityDialogFragment$special$$inlined$viewModels$default$6 = new DownloadQualityDialogFragment$special$$inlined$viewModels$default$6(this);
        final c24 c24VarB2 = kotlin.a.b(lazyThreadSafetyMode, new bp2() { // from class: ir.mservices.market.movie.download.quality.DownloadQualityDialogFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) downloadQualityDialogFragment$special$$inlined$viewModels$default$6.invoke();
            }
        });
        this.k1 = new o79(g27.a(MovieDownloadViewModel.class), new bp2() { // from class: ir.mservices.market.movie.download.quality.DownloadQualityDialogFragment$special$$inlined$viewModels$default$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB2.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.movie.download.quality.DownloadQualityDialogFragment$special$$inlined$viewModels$default$10
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                q79 q79VarH;
                x79 x79Var = (x79) c24VarB2.getValue();
                jx2 jx2Var = x79Var instanceof jx2 ? (jx2) x79Var : null;
                return (jx2Var == null || (q79VarH = jx2Var.h()) == null) ? this.g.h() : q79VarH;
            }
        }, new bp2() { // from class: ir.mservices.market.movie.download.quality.DownloadQualityDialogFragment$special$$inlined$viewModels$default$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                x79 x79Var = (x79) c24VarB2.getValue();
                jx2 jx2Var = x79Var instanceof jx2 ? (jx2) x79Var : null;
                return jx2Var != null ? jx2Var.i() : j71.b;
            }
        });
        this.l1 = new bi5(g27.a(bt1.class), new de(15, this));
        final int i = 0;
        this.n1 = kotlin.a.a(new bp2(this) { // from class: xs1
            public final /* synthetic */ DownloadQualityDialogFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v4, types: [ys1] */
            /* JADX WARN: Type inference failed for: r2v5, types: [ys1] */
            @Override // defpackage.bp2
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return Integer.valueOf(this.b.K().getInteger(ds6.select_quality_max_span));
                    default:
                        final DownloadQualityDialogFragment downloadQualityDialogFragment = this.b;
                        ws1 ws1Var = new ws1(((Number) downloadQualityDialogFragment.n1.getValue()).intValue());
                        final int i2 = 0;
                        ws1Var.l = new og5() { // from class: ys1
                            @Override // defpackage.og5
                            public final void m(View view, qg5 qg5Var, Object obj) {
                                int i3 = i2;
                                DownloadQualityDialogFragment downloadQualityDialogFragment2 = downloadQualityDialogFragment;
                                switch (i3) {
                                    case 0:
                                        DownloadQualityData downloadQualityData = (DownloadQualityData) obj;
                                        js3.p(view, "<unused var>");
                                        js3.p((b) qg5Var, "<unused var>");
                                        js3.p(downloadQualityData, "recyclerData");
                                        MovieDownloadViewModel movieDownloadViewModel = (MovieDownloadViewModel) downloadQualityDialogFragment2.k1.getValue();
                                        u25 u25Var = (u25) downloadQualityData.b.a.getValue();
                                        String str = downloadQualityDialogFragment2.V0().b;
                                        String str2 = downloadQualityDialogFragment2.V0().c;
                                        QualityItem qualityItem = downloadQualityData.a;
                                        String description = qualityItem.getDescription();
                                        String str3 = description == null ? "" : description;
                                        Long size = qualityItem.getSize();
                                        long jLongValue = size != null ? size.longValue() : 0L;
                                        String title = qualityItem.getTitle();
                                        String str4 = title == null ? "" : title;
                                        Integer quality = qualityItem.getQuality();
                                        int iIntValue = quality != null ? quality.intValue() : 0;
                                        String str5 = downloadQualityDialogFragment2.V0().d;
                                        String str6 = downloadQualityDialogFragment2.V0().e;
                                        movieDownloadViewModel.r(new DownloadAction.ToggleDownloadAction(u25Var, new MovieDownloadMetaData(str, str2, str5, str6 == null ? "" : str6, str4, iIntValue, str3, jLongValue, "", "", downloadQualityDialogFragment2.V0().f)));
                                        break;
                                    default:
                                        js3.p(view, "<unused var>");
                                        js3.p((a) qg5Var, "<unused var>");
                                        js3.p((DownloadQualityRecentData) obj, "<unused var>");
                                        String lowerCase = "MOVIES".toLowerCase(Locale.ROOT);
                                        js3.o(lowerCase, "toLowerCase(...)");
                                        pk5.g(downloadQualityDialogFragment2.J0(), new NavIntentDirections.DownloadList(new rr1(lowerCase)), -1);
                                        break;
                                }
                            }
                        };
                        final int i3 = 1;
                        ws1Var.m = new og5() { // from class: ys1
                            @Override // defpackage.og5
                            public final void m(View view, qg5 qg5Var, Object obj) {
                                int i32 = i3;
                                DownloadQualityDialogFragment downloadQualityDialogFragment2 = downloadQualityDialogFragment;
                                switch (i32) {
                                    case 0:
                                        DownloadQualityData downloadQualityData = (DownloadQualityData) obj;
                                        js3.p(view, "<unused var>");
                                        js3.p((b) qg5Var, "<unused var>");
                                        js3.p(downloadQualityData, "recyclerData");
                                        MovieDownloadViewModel movieDownloadViewModel = (MovieDownloadViewModel) downloadQualityDialogFragment2.k1.getValue();
                                        u25 u25Var = (u25) downloadQualityData.b.a.getValue();
                                        String str = downloadQualityDialogFragment2.V0().b;
                                        String str2 = downloadQualityDialogFragment2.V0().c;
                                        QualityItem qualityItem = downloadQualityData.a;
                                        String description = qualityItem.getDescription();
                                        String str3 = description == null ? "" : description;
                                        Long size = qualityItem.getSize();
                                        long jLongValue = size != null ? size.longValue() : 0L;
                                        String title = qualityItem.getTitle();
                                        String str4 = title == null ? "" : title;
                                        Integer quality = qualityItem.getQuality();
                                        int iIntValue = quality != null ? quality.intValue() : 0;
                                        String str5 = downloadQualityDialogFragment2.V0().d;
                                        String str6 = downloadQualityDialogFragment2.V0().e;
                                        movieDownloadViewModel.r(new DownloadAction.ToggleDownloadAction(u25Var, new MovieDownloadMetaData(str, str2, str5, str6 == null ? "" : str6, str4, iIntValue, str3, jLongValue, "", "", downloadQualityDialogFragment2.V0().f)));
                                        break;
                                    default:
                                        js3.p(view, "<unused var>");
                                        js3.p((a) qg5Var, "<unused var>");
                                        js3.p((DownloadQualityRecentData) obj, "<unused var>");
                                        String lowerCase = "MOVIES".toLowerCase(Locale.ROOT);
                                        js3.o(lowerCase, "toLowerCase(...)");
                                        pk5.g(downloadQualityDialogFragment2.J0(), new NavIntentDirections.DownloadList(new rr1(lowerCase)), -1);
                                        break;
                                }
                            }
                        };
                        return ws1Var;
                }
            }
        });
        final int i2 = 1;
        this.o1 = kotlin.a.a(new bp2(this) { // from class: xs1
            public final /* synthetic */ DownloadQualityDialogFragment b;

            {
                this.b = this;
            }

            /* JADX WARN: Type inference failed for: r2v4, types: [ys1] */
            /* JADX WARN: Type inference failed for: r2v5, types: [ys1] */
            @Override // defpackage.bp2
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return Integer.valueOf(this.b.K().getInteger(ds6.select_quality_max_span));
                    default:
                        final DownloadQualityDialogFragment downloadQualityDialogFragment = this.b;
                        ws1 ws1Var = new ws1(((Number) downloadQualityDialogFragment.n1.getValue()).intValue());
                        final int i22 = 0;
                        ws1Var.l = new og5() { // from class: ys1
                            @Override // defpackage.og5
                            public final void m(View view, qg5 qg5Var, Object obj) {
                                int i32 = i22;
                                DownloadQualityDialogFragment downloadQualityDialogFragment2 = downloadQualityDialogFragment;
                                switch (i32) {
                                    case 0:
                                        DownloadQualityData downloadQualityData = (DownloadQualityData) obj;
                                        js3.p(view, "<unused var>");
                                        js3.p((b) qg5Var, "<unused var>");
                                        js3.p(downloadQualityData, "recyclerData");
                                        MovieDownloadViewModel movieDownloadViewModel = (MovieDownloadViewModel) downloadQualityDialogFragment2.k1.getValue();
                                        u25 u25Var = (u25) downloadQualityData.b.a.getValue();
                                        String str = downloadQualityDialogFragment2.V0().b;
                                        String str2 = downloadQualityDialogFragment2.V0().c;
                                        QualityItem qualityItem = downloadQualityData.a;
                                        String description = qualityItem.getDescription();
                                        String str3 = description == null ? "" : description;
                                        Long size = qualityItem.getSize();
                                        long jLongValue = size != null ? size.longValue() : 0L;
                                        String title = qualityItem.getTitle();
                                        String str4 = title == null ? "" : title;
                                        Integer quality = qualityItem.getQuality();
                                        int iIntValue = quality != null ? quality.intValue() : 0;
                                        String str5 = downloadQualityDialogFragment2.V0().d;
                                        String str6 = downloadQualityDialogFragment2.V0().e;
                                        movieDownloadViewModel.r(new DownloadAction.ToggleDownloadAction(u25Var, new MovieDownloadMetaData(str, str2, str5, str6 == null ? "" : str6, str4, iIntValue, str3, jLongValue, "", "", downloadQualityDialogFragment2.V0().f)));
                                        break;
                                    default:
                                        js3.p(view, "<unused var>");
                                        js3.p((a) qg5Var, "<unused var>");
                                        js3.p((DownloadQualityRecentData) obj, "<unused var>");
                                        String lowerCase = "MOVIES".toLowerCase(Locale.ROOT);
                                        js3.o(lowerCase, "toLowerCase(...)");
                                        pk5.g(downloadQualityDialogFragment2.J0(), new NavIntentDirections.DownloadList(new rr1(lowerCase)), -1);
                                        break;
                                }
                            }
                        };
                        final int i3 = 1;
                        ws1Var.m = new og5() { // from class: ys1
                            @Override // defpackage.og5
                            public final void m(View view, qg5 qg5Var, Object obj) {
                                int i32 = i3;
                                DownloadQualityDialogFragment downloadQualityDialogFragment2 = downloadQualityDialogFragment;
                                switch (i32) {
                                    case 0:
                                        DownloadQualityData downloadQualityData = (DownloadQualityData) obj;
                                        js3.p(view, "<unused var>");
                                        js3.p((b) qg5Var, "<unused var>");
                                        js3.p(downloadQualityData, "recyclerData");
                                        MovieDownloadViewModel movieDownloadViewModel = (MovieDownloadViewModel) downloadQualityDialogFragment2.k1.getValue();
                                        u25 u25Var = (u25) downloadQualityData.b.a.getValue();
                                        String str = downloadQualityDialogFragment2.V0().b;
                                        String str2 = downloadQualityDialogFragment2.V0().c;
                                        QualityItem qualityItem = downloadQualityData.a;
                                        String description = qualityItem.getDescription();
                                        String str3 = description == null ? "" : description;
                                        Long size = qualityItem.getSize();
                                        long jLongValue = size != null ? size.longValue() : 0L;
                                        String title = qualityItem.getTitle();
                                        String str4 = title == null ? "" : title;
                                        Integer quality = qualityItem.getQuality();
                                        int iIntValue = quality != null ? quality.intValue() : 0;
                                        String str5 = downloadQualityDialogFragment2.V0().d;
                                        String str6 = downloadQualityDialogFragment2.V0().e;
                                        movieDownloadViewModel.r(new DownloadAction.ToggleDownloadAction(u25Var, new MovieDownloadMetaData(str, str2, str5, str6 == null ? "" : str6, str4, iIntValue, str3, jLongValue, "", "", downloadQualityDialogFragment2.V0().f)));
                                        break;
                                    default:
                                        js3.p(view, "<unused var>");
                                        js3.p((a) qg5Var, "<unused var>");
                                        js3.p((DownloadQualityRecentData) obj, "<unused var>");
                                        String lowerCase = "MOVIES".toLowerCase(Locale.ROOT);
                                        js3.o(lowerCase, "toLowerCase(...)");
                                        pk5.g(downloadQualityDialogFragment2.J0(), new NavIntentDirections.DownloadList(new rr1(lowerCase)), -1);
                                        break;
                                }
                            }
                        };
                        return ws1Var;
                }
            }
        });
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final DialogDataModel L0() {
        return V0().a;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final String M0() {
        return "DownloadQualityDialogFragment";
    }

    public final bt1 V0() {
        return (bt1) this.l1.getValue();
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void X(Bundle bundle) {
        super.X(bundle);
        this.a1 = true;
        this.Z0 = true;
    }

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        int i = lm7.y;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        lm7 lm7Var = (lm7) fa1.c(layoutInflater, js6.select_quality_dialog, viewGroup, false);
        this.m1 = lm7Var;
        js3.m(lm7Var);
        View view = lm7Var.l;
        js3.o(view, "getRoot(...)");
        return view;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void b0() {
        super.b0();
        this.m1 = null;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        String strL;
        js3.p(view, "view");
        super.k0(view, bundle);
        lm7 lm7Var = this.m1;
        js3.m(lm7Var);
        RecyclerView recyclerView = lm7Var.w;
        c24 c24Var = this.o1;
        recyclerView.setAdapter((ws1) c24Var.getValue());
        m91.l((ws1) c24Var.getValue(), new d(recyclerView, this, 20));
        int dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(pq6.horizontal_space_outer) + recyclerView.getResources().getDimensionPixelSize(pq6.horizontal_space_inner);
        int dimensionPixelSize2 = recyclerView.getResources().getDimensionPixelSize(pq6.space_16);
        int dimensionPixelSize3 = recyclerView.getResources().getDimensionPixelSize(pq6.space_8);
        int dimensionPixelSize4 = recyclerView.getResources().getDimensionPixelSize(pq6.space_8);
        c24 c24Var2 = this.n1;
        int iIntValue = ((Number) c24Var2.getValue()).intValue();
        d04 d04Var = this.h1;
        if (d04Var == null) {
            js3.V("languageHelper");
            throw null;
        }
        recyclerView.i(new co1(dimensionPixelSize3, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize4, iIntValue, d04Var.f()));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setLayoutManager(new MyketGridLayoutManager(((Number) c24Var2.getValue()).intValue()));
        qz6 itemAnimator = recyclerView.getItemAnimator();
        nw7 nw7Var = itemAnimator instanceof nw7 ? (nw7) itemAnimator : null;
        if (nw7Var != null) {
            nw7Var.g = false;
        }
        lm7 lm7Var2 = this.m1;
        js3.m(lm7Var2);
        DialogHeaderComponent dialogHeaderComponent = lm7Var2.x;
        DownloadInfoResponse downloadInfoResponse = V0().g;
        if (downloadInfoResponse == null || (strL = downloadInfoResponse.getTitle()) == null) {
            strL = L(rs6.choose_quality);
            js3.o(strL, "getString(...)");
        }
        dialogHeaderComponent.setTitle(strL);
        lm7 lm7Var3 = this.m1;
        js3.m(lm7Var3);
        lm7Var3.v.setBackgroundColor(sj8.b().v);
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new DownloadQualityDialogFragment$onViewCreated$2(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new DownloadQualityDialogFragment$onViewCreated$3(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new DownloadQualityDialogFragment$onViewCreated$4(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new DownloadQualityDialogFragment$onViewCreated$5(this, null));
    }
}
