package ir.mservices.market.versionNote.ui;

import android.app.Dialog;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.b77;
import defpackage.bi5;
import defpackage.bp2;
import defpackage.c24;
import defpackage.fa1;
import defpackage.g27;
import defpackage.j71;
import defpackage.js3;
import defpackage.js6;
import defpackage.jx2;
import defpackage.k49;
import defpackage.kn5;
import defpackage.lw8;
import defpackage.m49;
import defpackage.mw7;
import defpackage.nw7;
import defpackage.o79;
import defpackage.pq6;
import defpackage.q39;
import defpackage.q79;
import defpackage.qz6;
import defpackage.rf1;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.t15;
import defpackage.x79;
import defpackage.yq6;
import defpackage.yw6;
import ir.mservices.market.version2.fragments.base.BaseNewDialogFragment;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.DialogHeaderComponent;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
public final class VersionNoteDialogFragment extends Hilt_VersionNoteDialogFragment {
    public final bi5 b1 = new bi5(g27.a(m49.class), new yw6(29, this));
    public final o79 c1;
    public kn5 d1;
    public final c24 e1;

    public VersionNoteDialogFragment() {
        final VersionNoteDialogFragment$special$$inlined$viewModels$default$1 versionNoteDialogFragment$special$$inlined$viewModels$default$1 = new VersionNoteDialogFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.versionNote.ui.VersionNoteDialogFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) versionNoteDialogFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.c1 = new o79(g27.a(VersionNoteViewModel.class), new bp2() { // from class: ir.mservices.market.versionNote.ui.VersionNoteDialogFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.versionNote.ui.VersionNoteDialogFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.versionNote.ui.VersionNoteDialogFragment$special$$inlined$viewModels$default$4
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
        this.e1 = a.a(new mw7(20));
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment
    public final DialogDataModel K0() {
        return ((m49) this.b1.getValue()).a;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment
    public final String L0() {
        return "VersionNoteDialogFragment";
    }

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        int i = kn5.z;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        kn5 kn5Var = (kn5) fa1.c(layoutInflater, js6.new_ver_note, null, false);
        this.d1 = kn5Var;
        js3.m(kn5Var);
        View view = kn5Var.l;
        js3.o(view, "getRoot(...)");
        return view;
    }

    @Override // androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        Drawable drawable;
        js3.p(view, "view");
        kn5 kn5Var = this.d1;
        js3.m(kn5Var);
        kn5Var.x.getBackground().setColorFilter(new PorterDuffColorFilter(sj8.b().l, PorterDuff.Mode.MULTIPLY));
        kn5 kn5Var2 = this.d1;
        js3.m(kn5Var2);
        DialogHeaderComponent dialogHeaderComponent = kn5Var2.w;
        dialogHeaderComponent.setTitle(L(rs6.Congratulate_update));
        Resources resources = dialogHeaderComponent.getResources();
        js3.o(resources, "getResources(...)");
        int i = yq6.app_icon_gradient;
        try {
            drawable = q39.a(resources, i, null);
            if (drawable == null) {
                ThreadLocal threadLocal = b77.a;
                drawable = resources.getDrawable(i, null);
                if (drawable == null) {
                    throw new Resources.NotFoundException();
                }
            }
        } catch (Exception unused) {
            ThreadLocal threadLocal2 = b77.a;
            drawable = resources.getDrawable(i, null);
            if (drawable == null) {
                throw new Resources.NotFoundException();
            }
        }
        dialogHeaderComponent.setImage(drawable, pq6.dialog_header_circle_image_size);
        dialogHeaderComponent.setComponentGravity(DialogHeaderComponent.ComponentGravity.a);
        Resources resources2 = dialogHeaderComponent.getResources();
        int i2 = rs6.my_market_version;
        lw8 lw8Var = this.W0;
        if (lw8Var == null) {
            js3.V("uiUtils");
            throw null;
        }
        dialogHeaderComponent.setSubtitle(resources2.getString(i2, lw8.e(lw8Var, "10.2.8")));
        kn5 kn5Var3 = this.d1;
        js3.m(kn5Var3);
        DialogButtonComponent dialogButtonComponent = kn5Var3.v;
        dialogButtonComponent.setTitles(null, L(rs6.button_ok));
        dialogButtonComponent.setOnClickListener(new t15(17, this));
        kn5 kn5Var4 = this.d1;
        js3.m(kn5Var4);
        RecyclerView recyclerView = kn5Var4.y;
        H();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        recyclerView.setItemAnimator(new rf1());
        recyclerView.setAdapter((k49) this.e1.getValue());
        qz6 itemAnimator = recyclerView.getItemAnimator();
        js3.n(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
        ((nw7) itemAnimator).g = false;
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new VersionNoteDialogFragment$onViewCreated$4(this, null));
        Dialog dialog = this.L0;
        BaseNewDialogFragment.I0(dialog != null ? dialog.getWindow() : null);
        M0(this.L0);
    }
}
