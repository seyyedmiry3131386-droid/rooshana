package ir.mservices.market.pika.connect.dialog;

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
import defpackage.d04;
import defpackage.f86;
import defpackage.fa1;
import defpackage.fa2;
import defpackage.g27;
import defpackage.g86;
import defpackage.j71;
import defpackage.js3;
import defpackage.js6;
import defpackage.jx2;
import defpackage.m91;
import defpackage.n15;
import defpackage.nq2;
import defpackage.nw7;
import defpackage.o06;
import defpackage.o79;
import defpackage.pq6;
import defpackage.q79;
import defpackage.qz6;
import defpackage.rf1;
import defpackage.ts5;
import defpackage.x79;
import ir.mservices.market.common.ui.recycler.layoutManager.MyketGridLayoutManager;
import ir.mservices.market.common.ui.recycler.layoutManager.PaddingLayoutManager$Padding;
import ir.mservices.market.pika.connect.PikaSelectDeviceViewModel;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
public final class PikaSelectDeviceBottomDialog extends Hilt_PikaSelectDeviceBottomDialog {
    public d04 h1;
    public g86 i1;
    public fa2 j1;
    public final bi5 k1 = new bi5(g27.a(f86.class), new n15(19, this));
    public final o79 l1;

    public PikaSelectDeviceBottomDialog() {
        final PikaSelectDeviceBottomDialog$special$$inlined$viewModels$default$1 pikaSelectDeviceBottomDialog$special$$inlined$viewModels$default$1 = new PikaSelectDeviceBottomDialog$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.pika.connect.dialog.PikaSelectDeviceBottomDialog$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) pikaSelectDeviceBottomDialog$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.l1 = new o79(g27.a(PikaSelectDeviceViewModel.class), new bp2() { // from class: ir.mservices.market.pika.connect.dialog.PikaSelectDeviceBottomDialog$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.pika.connect.dialog.PikaSelectDeviceBottomDialog$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.pika.connect.dialog.PikaSelectDeviceBottomDialog$special$$inlined$viewModels$default$4
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

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final String K0() {
        return "";
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final DialogDataModel L0() {
        return ((f86) this.k1.getValue()).a;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final String M0() {
        return "PikaSelectDeviceBottomDialog";
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
        int i = g86.x;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        g86 g86Var = (g86) fa1.c(layoutInflater, js6.pika_select_device_bottom_dialog, null, false);
        this.i1 = g86Var;
        js3.m(g86Var);
        View view = g86Var.l;
        js3.o(view, "getRoot(...)");
        return view;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void b0() {
        this.i1 = null;
        super.b0();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        g86 g86Var = this.i1;
        js3.m(g86Var);
        RecyclerView recyclerView = g86Var.w;
        int i = 3;
        MyketGridLayoutManager myketGridLayoutManager = new MyketGridLayoutManager(3);
        myketGridLayoutManager.Q = new PaddingLayoutManager$Padding(recyclerView.getResources().getDimensionPixelSize(pq6.margin_default_v2_double), recyclerView.getResources().getDimensionPixelSize(pq6.margin_default_v2), recyclerView.getResources().getDimensionPixelSize(pq6.margin_default_v2_double), recyclerView.getResources().getDimensionPixelSize(pq6.margin_default_v2));
        myketGridLayoutManager.K = new nq2(recyclerView, 1);
        recyclerView.setLayoutManager(myketGridLayoutManager);
        recyclerView.setItemAnimator(new rf1());
        qz6 itemAnimator = recyclerView.getItemAnimator();
        js3.n(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        ((nw7) itemAnimator).g = false;
        qz6 itemAnimator2 = recyclerView.getItemAnimator();
        if (itemAnimator2 != null) {
            itemAnimator2.f = 0L;
        }
        recyclerView.setNestedScrollingEnabled(false);
        d04 d04Var = this.h1;
        if (d04Var == null) {
            js3.V("languageHelper");
            throw null;
        }
        recyclerView.setLayoutDirection(d04Var.c());
        fa2 fa2Var = new fa2(i, 4);
        g86 g86Var2 = this.i1;
        js3.m(g86Var2);
        g86Var2.w.setAdapter(fa2Var);
        fa2Var.m = new ts5(5, this);
        m91.l(fa2Var, new o06(2, this));
        this.j1 = fa2Var;
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new PikaSelectDeviceBottomDialog$onViewCreated$4(this, null));
    }
}
