package ir.mservices.market.setting.fontStyle.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.bi5;
import defpackage.bp2;
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
import defpackage.m91;
import defpackage.nm5;
import defpackage.nw7;
import defpackage.o79;
import defpackage.pq6;
import defpackage.q79;
import defpackage.qz6;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.ti2;
import defpackage.ui2;
import defpackage.x79;
import defpackage.yi2;
import ir.mservices.market.common.ui.recycler.layoutManager.MyketGridLayoutManager;
import ir.mservices.market.setting.fontStyle.ui.FontStyleDialogFragment;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.views.DialogButtonComponent;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: loaded from: classes3.dex */
public final class FontStyleDialogFragment extends Hilt_FontStyleDialogFragment {
    public d04 h1;
    public ui2 i1;
    public final bi5 j1 = new bi5(g27.a(yi2.class), new de(19, this));
    public final o79 k1;
    public final c24 l1;
    public final c24 m1;

    public FontStyleDialogFragment() {
        final FontStyleDialogFragment$special$$inlined$viewModels$default$1 fontStyleDialogFragment$special$$inlined$viewModels$default$1 = new FontStyleDialogFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = kotlin.a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.setting.fontStyle.ui.FontStyleDialogFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) fontStyleDialogFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.k1 = new o79(g27.a(FontStyleViewModel.class), new bp2() { // from class: ir.mservices.market.setting.fontStyle.ui.FontStyleDialogFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.setting.fontStyle.ui.FontStyleDialogFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.setting.fontStyle.ui.FontStyleDialogFragment$special$$inlined$viewModels$default$4
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
        this.l1 = kotlin.a.a(new bp2(this) { // from class: wi2
            public final /* synthetic */ FontStyleDialogFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                switch (i) {
                    case 0:
                        FontStyleDialogFragment fontStyleDialogFragment = this.b;
                        ti2 ti2Var = new ti2(((Number) fontStyleDialogFragment.m1.getValue()).intValue());
                        ti2Var.l = new v4(27, fontStyleDialogFragment);
                        return ti2Var;
                    default:
                        return Integer.valueOf(this.b.K().getInteger(ds6.font_style_max_span));
                }
            }
        });
        final int i2 = 1;
        this.m1 = kotlin.a.a(new bp2(this) { // from class: wi2
            public final /* synthetic */ FontStyleDialogFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        FontStyleDialogFragment fontStyleDialogFragment = this.b;
                        ti2 ti2Var = new ti2(((Number) fontStyleDialogFragment.m1.getValue()).intValue());
                        ti2Var.l = new v4(27, fontStyleDialogFragment);
                        return ti2Var;
                    default:
                        return Integer.valueOf(this.b.K().getInteger(ds6.font_style_max_span));
                }
            }
        });
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final DialogDataModel L0() {
        return ((yi2) this.j1.getValue()).a;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final String M0() {
        return "FontStyleDialogFragment";
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
        int i = ui2.z;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        ui2 ui2Var = (ui2) fa1.c(layoutInflater, js6.font_style_dialog, viewGroup, false);
        this.i1 = ui2Var;
        js3.m(ui2Var);
        View view = ui2Var.l;
        js3.o(view, "getRoot(...)");
        view.setLayoutDirection(0);
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
        ui2 ui2Var = this.i1;
        js3.m(ui2Var);
        ui2Var.y.setTitle(L(rs6.choose_font));
        ui2Var.w.setBackgroundColor(sj8.b().v);
        DialogButtonComponent dialogButtonComponent = ui2Var.v;
        js3.m(dialogButtonComponent);
        DialogButtonComponent.setTitles$default(dialogButtonComponent, dialogButtonComponent.getResources().getString(rs6.choose_txt), null, 2, null);
        dialogButtonComponent.setOnClickListener(new nm5(20, this));
        RecyclerView recyclerView = ui2Var.x;
        recyclerView.setLayoutDirection(3);
        recyclerView.setNestedScrollingEnabled(false);
        c24 c24Var = this.m1;
        recyclerView.setLayoutManager(new MyketGridLayoutManager(((Number) c24Var.getValue()).intValue()));
        c24 c24Var2 = this.l1;
        recyclerView.setAdapter((ti2) c24Var2.getValue());
        m91.l((ti2) c24Var2.getValue(), new d(recyclerView, this, 24));
        int dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(pq6.space_12);
        int dimensionPixelSize2 = recyclerView.getResources().getDimensionPixelSize(pq6.space_16);
        int dimensionPixelSize3 = recyclerView.getResources().getDimensionPixelSize(pq6.space_12) / 2;
        int dimensionPixelSize4 = recyclerView.getResources().getDimensionPixelSize(pq6.space_12) / 2;
        int iIntValue = ((Number) c24Var.getValue()).intValue();
        d04 d04Var = this.h1;
        if (d04Var == null) {
            js3.V("languageHelper");
            throw null;
        }
        recyclerView.i(new co1(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize3, dimensionPixelSize4, iIntValue, d04Var.f()));
        qz6 itemAnimator = recyclerView.getItemAnimator();
        nw7 nw7Var = itemAnimator instanceof nw7 ? (nw7) itemAnimator : null;
        if (nw7Var != null) {
            nw7Var.g = false;
        }
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new FontStyleDialogFragment$onViewCreated$1$3(this, null));
    }
}
