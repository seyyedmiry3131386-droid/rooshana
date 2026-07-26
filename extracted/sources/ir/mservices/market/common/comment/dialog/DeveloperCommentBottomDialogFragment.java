package ir.mservices.market.common.comment.dialog;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.lifecycle.Lifecycle$State;
import defpackage.al1;
import defpackage.b77;
import defpackage.bi5;
import defpackage.bp2;
import defpackage.c24;
import defpackage.de;
import defpackage.ee;
import defpackage.f88;
import defpackage.fa1;
import defpackage.g27;
import defpackage.iw0;
import defpackage.j71;
import defpackage.js3;
import defpackage.js6;
import defpackage.jx2;
import defpackage.n;
import defpackage.nm5;
import defpackage.o79;
import defpackage.pq6;
import defpackage.q39;
import defpackage.q79;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.w91;
import defpackage.x79;
import defpackage.yq6;
import ir.mservices.market.common.comment.CommentViewModel;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.DialogHeaderComponent;
import ir.mservices.market.views.MyketRatingBar;
import ir.mservices.market.views.MyketTextView;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
public final class DeveloperCommentBottomDialogFragment extends Hilt_DeveloperCommentBottomDialogFragment {
    public final o79 h1;
    public final bi5 i1;
    public iw0 j1;

    public DeveloperCommentBottomDialogFragment() {
        final DeveloperCommentBottomDialogFragment$special$$inlined$viewModels$default$1 developerCommentBottomDialogFragment$special$$inlined$viewModels$default$1 = new DeveloperCommentBottomDialogFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.common.comment.dialog.DeveloperCommentBottomDialogFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) developerCommentBottomDialogFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.h1 = new o79(g27.a(CommentViewModel.class), new bp2() { // from class: ir.mservices.market.common.comment.dialog.DeveloperCommentBottomDialogFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.common.comment.dialog.DeveloperCommentBottomDialogFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.common.comment.dialog.DeveloperCommentBottomDialogFragment$special$$inlined$viewModels$default$4
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
        this.i1 = new bi5(g27.a(al1.class), new de(13, this));
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final String K0() {
        return V0().b;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final DialogDataModel L0() {
        return V0().a;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final String M0() {
        return "DeveloperCommentBottomDialogFragment";
    }

    public final al1 V0() {
        return (al1) this.i1.getValue();
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void X(Bundle bundle) {
        super.X(bundle);
        this.a1 = true;
        this.Z0 = true;
        if (bundle == null) {
            Bundle bundle2 = new Bundle();
            ee eeVar = (ee) ((w91) ApplicationLauncher.o.b()).o.get();
            bundle2.putString("screen_name", "DeveloperCommentBottomDialogFragment");
            eeVar.getClass();
            eeVar.a(bundle2, "screen_show");
        }
    }

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        int i = iw0.B;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        iw0 iw0Var = (iw0) fa1.c(layoutInflater, js6.comment_dialog, viewGroup, false);
        this.j1 = iw0Var;
        js3.m(iw0Var);
        View view = iw0Var.l;
        js3.o(view, "getRoot(...)");
        return view;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void b0() {
        this.j1 = null;
        super.b0();
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        Drawable drawable;
        js3.p(view, "view");
        super.k0(view, bundle);
        iw0 iw0Var = this.j1;
        js3.m(iw0Var);
        DialogButtonComponent dialogButtonComponent = iw0Var.v;
        js3.o(dialogButtonComponent, "dialogButton");
        DialogButtonComponent.setTitles$default(dialogButtonComponent, L(rs6.submit_rate), null, 2, null);
        iw0 iw0Var2 = this.j1;
        js3.m(iw0Var2);
        iw0Var2.z.setStarStyle(sj8.b().c, MyketRatingBar.e, false, K().getDimensionPixelSize(pq6.space_4));
        iw0 iw0Var3 = this.j1;
        js3.m(iw0Var3);
        DialogHeaderComponent dialogHeaderComponent = iw0Var3.x;
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
        dialogHeaderComponent.setImage(drawable, pq6.dialog_header_side_image_size);
        dialogHeaderComponent.setTitle(L(rs6.myket));
        dialogHeaderComponent.setSubtitle(!f88.n0(V0().d) ? dialogHeaderComponent.getResources().getString(rs6.rate_this_app, V0().d) : dialogHeaderComponent.getResources().getString(rs6.rate_app));
        dialogHeaderComponent.setComponentGravity(DialogHeaderComponent.ComponentGravity.b);
        iw0 iw0Var4 = this.j1;
        js3.m(iw0Var4);
        MyketTextView myketTextView = iw0Var4.w;
        js3.o(myketTextView, "editConfirmTxt");
        myketTextView.setVisibility(V0().g ? 0 : 8);
        iw0 iw0Var5 = this.j1;
        js3.m(iw0Var5);
        iw0Var5.z.setRating(V0().f);
        iw0 iw0Var6 = this.j1;
        js3.m(iw0Var6);
        iw0Var6.z.setUpdateRatingListener(new n(26, this));
        iw0 iw0Var7 = this.j1;
        js3.m(iw0Var7);
        iw0Var7.v.setOnClickListener(new nm5(16, this));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new DeveloperCommentBottomDialogFragment$onViewCreated$4(this, null));
    }
}
