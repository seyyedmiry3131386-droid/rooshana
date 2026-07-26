package ir.mservices.market.version2.fragments.dialog;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.c35;
import defpackage.fa1;
import defpackage.js6;
import defpackage.rs6;
import defpackage.s37;
import defpackage.sj8;
import defpackage.us0;
import ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment;

/* JADX INFO: loaded from: classes3.dex */
public class RemoveDownloadDialogFragment extends BaseNewBottomDialogFragment {
    public us0 e1;
    public s37 f1;

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final DialogDataModel L0() {
        return this.f1.a;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment
    public final String M0() {
        return getClass().getSimpleName();
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, ir.mservices.market.version2.fragments.base.Hilt_BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void W(Context context) {
        this.f1 = s37.fromBundle(p0());
        super.W(context);
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void X(Bundle bundle) {
        super.X(bundle);
        this.a1 = true;
        this.Z0 = true;
    }

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = us0.y;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        us0 us0Var = (us0) fa1.c(layoutInflater, js6.clear_all_dialogs, null, false);
        this.e1 = us0Var;
        return us0Var.l;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void b0() {
        this.e1 = null;
        super.b0();
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        super.k0(view, bundle);
        this.e1.w.setTitles(L(rs6.remove_from_list), L(rs6.return_change));
        this.e1.v.setText(this.f1.b);
        this.e1.v.setVisibility(0);
        this.e1.v.setTextColor(sj8.b().n);
        this.e1.w.setOnClickListener(new c35(9, this));
    }
}
