package ir.mservices.market.version2.fragments.dialog;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.ao7;
import defpackage.b77;
import defpackage.bi5;
import defpackage.bo7;
import defpackage.bp2;
import defpackage.c24;
import defpackage.fa1;
import defpackage.fw0;
import defpackage.g27;
import defpackage.j71;
import defpackage.js3;
import defpackage.js6;
import defpackage.jx2;
import defpackage.mb0;
import defpackage.o79;
import defpackage.q79;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.x79;
import defpackage.xg5;
import defpackage.yq6;
import defpackage.yw6;
import ir.mservices.market.common.comment.CommentViewModel;
import ir.mservices.market.views.MyketEditText;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: loaded from: classes3.dex */
public final class SendReplyBottomDialogFragment extends Hilt_SendReplyBottomDialogFragment {
    public fw0 h1;
    public final bi5 i1 = new bi5(g27.a(ao7.class), new yw6(16, this));
    public final o79 j1;
    public bo7 k1;

    public SendReplyBottomDialogFragment() {
        final SendReplyBottomDialogFragment$special$$inlined$viewModels$default$1 sendReplyBottomDialogFragment$special$$inlined$viewModels$default$1 = new SendReplyBottomDialogFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = kotlin.a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.version2.fragments.dialog.SendReplyBottomDialogFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) sendReplyBottomDialogFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.j1 = new o79(g27.a(CommentViewModel.class), new bp2() { // from class: ir.mservices.market.version2.fragments.dialog.SendReplyBottomDialogFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.version2.fragments.dialog.SendReplyBottomDialogFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.version2.fragments.dialog.SendReplyBottomDialogFragment$special$$inlined$viewModels$default$4
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
    public final DialogDataModel L0() {
        return ((ao7) this.i1.getValue()).e;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final String M0() {
        return "SendReplyBottomDialogFragment";
    }

    public final void V0(String str) {
        bo7 bo7Var = this.k1;
        js3.m(bo7Var);
        bo7Var.w.setCommitButtonEnable(!(str == null || str.length() == 0), sj8.b().d);
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
        int i = bo7.z;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        bo7 bo7Var = (bo7) fa1.c(layoutInflater, js6.send_reply_bottom_dialog_fragment, viewGroup, false);
        this.k1 = bo7Var;
        js3.m(bo7Var);
        View view = bo7Var.l;
        js3.o(view, "getRoot(...)");
        return view;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void b0() {
        this.k1 = null;
        super.b0();
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        Resources resourcesK = K();
        int i = yq6.shape_edittext_tag;
        ThreadLocal threadLocal = b77.a;
        Drawable drawable = resourcesK.getDrawable(i, null);
        if (drawable != null) {
            drawable.setColorFilter(new PorterDuffColorFilter(sj8.b().c, PorterDuff.Mode.MULTIPLY));
        } else {
            drawable = null;
        }
        mb0 mb0Var = new mb0(12, this);
        bo7 bo7Var = this.k1;
        js3.m(bo7Var);
        MyketEditText myketEditText = bo7Var.v;
        myketEditText.setBackground(drawable);
        myketEditText.setTextColor(sj8.b().n);
        myketEditText.setHintTextColor(sj8.b().n);
        myketEditText.addTextChangedListener(mb0Var);
        myketEditText.requestFocus();
        bo7 bo7Var2 = this.k1;
        js3.m(bo7Var2);
        V0(bo7Var2.v.getEditableText().toString());
        bo7 bo7Var3 = this.k1;
        js3.m(bo7Var3);
        bo7Var3.y.setTitle(L(rs6.send_reply));
        bo7 bo7Var4 = this.k1;
        js3.m(bo7Var4);
        bo7Var4.w.setTitles(L(rs6.send), L(rs6.button_cancel));
        bo7 bo7Var5 = this.k1;
        js3.m(bo7Var5);
        bo7Var5.w.setOnClickListener(new xg5(10, this));
        ir.mservices.market.version2.core.utils.a.c(this, 0L, new SendReplyBottomDialogFragment$onViewCreated$3(this, null));
    }
}
