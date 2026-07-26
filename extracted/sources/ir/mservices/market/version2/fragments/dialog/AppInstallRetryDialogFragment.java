package ir.mservices.market.version2.fragments.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.fa1;
import defpackage.js6;
import defpackage.km1;
import defpackage.lw;
import defpackage.nm5;
import defpackage.nt6;
import defpackage.pq;
import defpackage.pq6;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.yq6;
import ir.mservices.market.version2.fragments.base.BaseNewDialogFragment;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.DialogHeaderComponent;

/* JADX INFO: loaded from: classes3.dex */
public class AppInstallRetryDialogFragment extends BaseNewDialogFragment {
    public km1 Y0;
    public pq Z0;

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog C0(Bundle bundle) {
        lw.d(null, null, F());
        lw.d(null, null, this.g);
        Dialog dialog = new Dialog(F(), nt6.MyketDialogTheme);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(F());
        int i = km1.z;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        km1 km1Var = (km1) fa1.c(layoutInflaterFrom, js6.dialog_app_retry_install, null, false);
        this.Y0 = km1Var;
        dialog.setContentView(km1Var.l);
        this.Y0.y.getBackground().setColorFilter(sj8.b().l, PorterDuff.Mode.MULTIPLY);
        this.Y0.w.setTitle(this.Z0.b);
        AppIconView appIconView = new AppIconView(F());
        int dimensionPixelSize = K().getDimensionPixelSize(pq6.dialog_header_side_image_size);
        appIconView.setLayoutParams(new ViewGroup.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        appIconView.setErrorImageResId(yq6.icon);
        appIconView.setImageUrl(this.Z0.c);
        this.Y0.w.setImageView(appIconView);
        this.Y0.w.setComponentGravity(DialogHeaderComponent.ComponentGravity.b);
        this.Y0.x.setText(K().getString(rs6.install_dialog_status_failure));
        this.Y0.v.setTitles(K().getString(rs6.btn_try_again), K().getString(rs6.button_cancel));
        this.Y0.v.setOnClickListener(new nm5(5, this));
        BaseNewDialogFragment.I0(dialog.getWindow());
        M0(dialog);
        return dialog;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment
    public final DialogDataModel K0() {
        return this.Z0.a;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment
    public final String L0() {
        return getClass().getSimpleName();
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment, ir.mservices.market.version2.fragments.base.Hilt_BaseNewDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void W(Context context) {
        this.Z0 = pq.fromBundle(p0());
        super.W(context);
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void b0() {
        this.Y0 = null;
        super.b0();
    }
}
