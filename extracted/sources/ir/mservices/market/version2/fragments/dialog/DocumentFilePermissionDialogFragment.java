package ir.mservices.market.version2.fragments.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.fa1;
import defpackage.js6;
import defpackage.lw;
import defpackage.nt6;
import defpackage.ql4;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.tn1;
import defpackage.xq1;
import ir.mservices.market.version2.fragments.base.BaseNewDialogFragment;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.DialogHeaderComponent;

/* JADX INFO: loaded from: classes3.dex */
public class DocumentFilePermissionDialogFragment extends BaseNewDialogFragment {
    public xq1 Y0;

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog C0(Bundle bundle) {
        lw.d(null, null, F());
        lw.d(null, null, this.g);
        Dialog dialog = new Dialog(F(), nt6.MyketDialogTheme);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(F());
        int i = tn1.z;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        tn1 tn1Var = (tn1) fa1.c(layoutInflaterFrom, js6.dialog_permission_document_file, null, false);
        dialog.setContentView(tn1Var.l);
        dialog.findViewById(rr6.layout).getBackground().setColorFilter(sj8.b().l, PorterDuff.Mode.MULTIPLY);
        DialogHeaderComponent dialogHeaderComponent = tn1Var.y;
        dialogHeaderComponent.setTitle(L(rs6.get_document_file_permission_title));
        dialogHeaderComponent.setComponentGravity(DialogHeaderComponent.ComponentGravity.b);
        DialogButtonComponent dialogButtonComponent = tn1Var.v;
        dialogButtonComponent.setTitles(K().getString(rs6.proceed), K().getString(rs6.button_cancel));
        dialogButtonComponent.setOnClickListener(new ql4(16, this));
        BaseNewDialogFragment.I0(dialog.getWindow());
        M0(dialog);
        return dialog;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment
    public final DialogDataModel K0() {
        return this.Y0.a;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment
    public final String L0() {
        return getClass().getSimpleName();
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment, ir.mservices.market.version2.fragments.base.Hilt_BaseNewDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void W(Context context) {
        this.Y0 = xq1.fromBundle(p0());
        super.W(context);
    }
}
