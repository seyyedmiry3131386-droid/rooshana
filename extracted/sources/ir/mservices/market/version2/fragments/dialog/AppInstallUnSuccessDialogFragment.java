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
import defpackage.lw;
import defpackage.nt6;
import defpackage.om1;
import defpackage.pq6;
import defpackage.r79;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.sq;
import defpackage.yq6;
import ir.mservices.market.version2.fragments.base.BaseNewDialogFragment;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.DialogHeaderComponent;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public class AppInstallUnSuccessDialogFragment extends BaseNewDialogFragment {
    public om1 Y0;
    public sq Z0;

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog C0(Bundle bundle) {
        lw.d(null, null, F());
        lw.d(null, null, this.Z0);
        Dialog dialog = new Dialog(F(), nt6.MyketDialogTheme);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(F());
        int i = om1.z;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        om1 om1Var = (om1) fa1.c(layoutInflaterFrom, js6.dialog_app_un_success_install, null, false);
        this.Y0 = om1Var;
        dialog.setContentView(om1Var.l);
        this.Y0.y.getBackground().setColorFilter(sj8.b().l, PorterDuff.Mode.MULTIPLY);
        this.Y0.w.setTitle(this.Z0.b);
        AppIconView appIconView = new AppIconView(F());
        int dimensionPixelSize = K().getDimensionPixelSize(pq6.dialog_header_side_image_size);
        appIconView.setLayoutParams(new ViewGroup.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        appIconView.setErrorImageResId(yq6.icon);
        appIconView.setImageUrl(this.Z0.c);
        this.Y0.w.setImageView(appIconView);
        this.Y0.w.setComponentGravity(DialogHeaderComponent.ComponentGravity.b);
        MyketTextView myketTextView = this.Y0.x;
        String string = "";
        switch (this.Z0.d) {
            case 1:
                string = K().getString(rs6.install_dialog_description_done);
                break;
            case 2:
            case 3:
            case 8:
                lw.g(null, "AppInstallDialogFragment getInstallDescription() illegal installResultType!!!", null);
                break;
            case 5:
                string = K().getString(rs6.install_dialog_status_failure_conflict);
                break;
            case 6:
                string = K().getString(rs6.install_dialog_status_failure_storage);
                break;
            case 7:
                string = K().getString(rs6.install_dialog_status_failure_incompatible);
                break;
        }
        myketTextView.setText(string);
        this.Y0.v.setTitles(null, K().getString(rs6.install_dialog_cancel));
        this.Y0.v.setOnClickListener(new r79(6, this));
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
        this.Z0 = sq.fromBundle(p0());
        super.W(context);
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void b0() {
        this.Y0 = null;
        super.b0();
    }
}
