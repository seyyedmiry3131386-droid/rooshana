package ir.mservices.market.version2.fragments.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.bi5;
import defpackage.de;
import defpackage.dm1;
import defpackage.fa1;
import defpackage.g27;
import defpackage.hq;
import defpackage.js3;
import defpackage.js6;
import defpackage.lw;
import defpackage.nt6;
import defpackage.pq6;
import defpackage.ql4;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.yq6;
import ir.mservices.market.version2.fragments.base.BaseNewDialogFragment;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.DialogHeaderComponent;

/* JADX INFO: loaded from: classes3.dex */
public final class AppFailedStorageDialogFragment extends BaseNewDialogFragment {
    public dm1 Y0;
    public final bi5 Z0 = new bi5(g27.a(hq.class), new de(3, this));
    public int a1;

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog C0(Bundle bundle) {
        lw.d(null, null, F());
        lw.d(null, null, O0());
        Dialog dialog = new Dialog(o0(), nt6.MyketDialogTheme);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(F());
        int i = dm1.z;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        dm1 dm1Var = (dm1) fa1.c(layoutInflaterFrom, js6.dialog_app_failed_storage_install, null, false);
        this.Y0 = dm1Var;
        js3.m(dm1Var);
        dialog.setContentView(dm1Var.l);
        dm1 dm1Var2 = this.Y0;
        js3.m(dm1Var2);
        dm1Var2.y.getBackground().setColorFilter(new PorterDuffColorFilter(sj8.b().l, PorterDuff.Mode.MULTIPLY));
        int dimensionPixelSize = K().getDimensionPixelSize(pq6.dialog_header_side_image_size);
        dm1 dm1Var3 = this.Y0;
        js3.m(dm1Var3);
        Context context = dm1Var3.l.getContext();
        js3.o(context, "getContext(...)");
        AppIconView appIconView = new AppIconView(context, null);
        appIconView.setLayoutParams(new ViewGroup.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        appIconView.setErrorImageResId(yq6.icon);
        AppIconView.setImageUrl$default(appIconView, O0().d, null, false, 6, null);
        dm1 dm1Var4 = this.Y0;
        js3.m(dm1Var4);
        DialogHeaderComponent dialogHeaderComponent = dm1Var4.x;
        dialogHeaderComponent.setTitle(O0().b);
        dialogHeaderComponent.setImageView(appIconView);
        dialogHeaderComponent.setComponentGravity(DialogHeaderComponent.ComponentGravity.b);
        dm1 dm1Var5 = this.Y0;
        js3.m(dm1Var5);
        dm1Var5.v.setText(O0().c);
        dm1 dm1Var6 = this.Y0;
        js3.m(dm1Var6);
        DialogButtonComponent dialogButtonComponent = dm1Var6.w;
        dialogButtonComponent.setTitles(O0().e ? dialogButtonComponent.getResources().getString(rs6.application_data) : dialogButtonComponent.getResources().getString(rs6.button_ok), O0().e ? dialogButtonComponent.getResources().getString(rs6.dismiss) : null);
        dialogButtonComponent.setPrimaryColor(sj8.b().c, sj8.b().d);
        dialogButtonComponent.setOnClickListener(new ql4(5, this));
        BaseNewDialogFragment.I0(dialog.getWindow());
        M0(dialog);
        return dialog;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment
    public final DialogDataModel K0() {
        return O0().a;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment
    public final String L0() {
        return "AppFailedStorageDialogFragment";
    }

    public final hq O0() {
        return (hq) this.Z0.getValue();
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void b0() {
        this.Y0 = null;
        super.b0();
    }
}
