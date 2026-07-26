package ir.mservices.market.version2.fragments.dialog;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.b77;
import defpackage.bi5;
import defpackage.fa1;
import defpackage.g27;
import defpackage.js3;
import defpackage.js6;
import defpackage.m46;
import defpackage.n15;
import defpackage.pq6;
import defpackage.q39;
import defpackage.qn1;
import defpackage.rs6;
import defpackage.ts5;
import defpackage.xg5;
import defpackage.yq6;
import ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class PaymentRetryBottomDialogFragment extends BaseNewBottomDialogFragment {
    public qn1 e1;
    public final bi5 f1 = new bi5(g27.a(m46.class), new n15(13, this));

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final DialogDataModel L0() {
        return ((m46) this.f1.getValue()).a;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final String M0() {
        return "PaymentRetryBottomDialogFragment";
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
        int i = qn1.y;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        qn1 qn1Var = (qn1) fa1.c(layoutInflater, js6.dialog_payment_retry, viewGroup, false);
        this.e1 = qn1Var;
        js3.m(qn1Var);
        View view = qn1Var.l;
        js3.o(view, "getRoot(...)");
        return view;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void b0() {
        super.b0();
        this.e1 = null;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        Drawable drawable;
        js3.p(view, "view");
        super.k0(view, bundle);
        qn1 qn1Var = this.e1;
        js3.m(qn1Var);
        MyketTextView myketTextView = qn1Var.v;
        js3.o(myketTextView, PackageListMetaDataDTO.KEY_DESCRIPTION);
        MyketTextView.setTextFromHtml$default(myketTextView, L(rs6.description_payment_retry), 1, null, new ts5(3, this), true, 4, null);
        Resources resourcesK = K();
        js3.o(resourcesK, "getResources(...)");
        int i = yq6.ic_payment_retry;
        try {
            drawable = q39.a(resourcesK, i, null);
            if (drawable == null) {
                ThreadLocal threadLocal = b77.a;
                drawable = resourcesK.getDrawable(i, null);
                if (drawable == null) {
                    throw new Resources.NotFoundException();
                }
            }
        } catch (Exception unused) {
            ThreadLocal threadLocal2 = b77.a;
            drawable = resourcesK.getDrawable(i, null);
            if (drawable == null) {
                throw new Resources.NotFoundException();
            }
        }
        Drawable drawableMutate = drawable.mutate();
        js3.o(drawableMutate, "mutate(...)");
        qn1 qn1Var2 = this.e1;
        js3.m(qn1Var2);
        qn1Var2.x.setImage(drawableMutate, pq6.dialog_header_bottom_image_size);
        qn1 qn1Var3 = this.e1;
        js3.m(qn1Var3);
        DialogButtonComponent dialogButtonComponent = qn1Var3.w;
        dialogButtonComponent.setTitles(L(rs6.retry), L(rs6.button_cancel));
        dialogButtonComponent.setOnClickListener(new xg5(3, this));
    }
}
