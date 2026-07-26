package ir.mservices.market.version2.fragments.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.dp3;
import defpackage.fa1;
import defpackage.fm1;
import defpackage.js6;
import defpackage.lw;
import defpackage.nt6;
import defpackage.pq6;
import defpackage.qm5;
import defpackage.qq;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.yq6;
import defpackage.zy2;
import ir.mservices.market.version2.fragments.base.BaseNewDialogFragment;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.DialogHeaderComponent;

/* JADX INFO: loaded from: classes3.dex */
public class AppInstallSuccessDialogFragment extends zy2 {
    public fm1 c1;
    public qq d1;
    public dp3 e1;
    public boolean f1;

    public AppInstallSuccessDialogFragment() {
        super(1);
        this.f1 = false;
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog C0(Bundle bundle) {
        lw.d(null, null, F());
        lw.d(null, null, this.d1);
        String string = this.d1.a.c.getString("packageName", null);
        int i = this.d1.a.c.getInt("BUNDLE_KEY_VERSION_CODE", -1);
        Dialog dialog = new Dialog(F(), nt6.MyketDialogTheme);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(F());
        int i2 = fm1.z;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        fm1 fm1Var = (fm1) fa1.c(layoutInflaterFrom, js6.dialog_app_install, null, false);
        this.c1 = fm1Var;
        dialog.setContentView(fm1Var.l);
        this.c1.y.getBackground().setColorFilter(sj8.b().l, PorterDuff.Mode.MULTIPLY);
        this.c1.w.setTitle(this.d1.b);
        AppIconView appIconView = new AppIconView(F());
        int dimensionPixelSize = K().getDimensionPixelSize(pq6.dialog_header_side_image_size);
        appIconView.setLayoutParams(new ViewGroup.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        appIconView.setErrorImageResId(yq6.icon);
        appIconView.setImageUrl(this.d1.c);
        this.c1.w.setImageView(appIconView);
        this.c1.w.setComponentGravity(DialogHeaderComponent.ComponentGravity.b);
        this.c1.x.setText(K().getString(rs6.install_dialog_description_done));
        if (!this.d1.d) {
            this.c1.v.setTitles(K().getString(rs6.install_dialog_cancel), null);
        } else if (TextUtils.isEmpty(this.e1.r(i, string))) {
            this.c1.v.setTitles(K().getString(rs6.install_dialog_commit), K().getString(rs6.install_dialog_cancel));
        } else {
            this.c1.v.setTitles(K().getString(rs6.proceed), K().getString(rs6.install_dialog_cancel));
        }
        this.c1.v.setOnClickListener(new qm5(6, this));
        BaseNewDialogFragment.I0(dialog.getWindow());
        M0(dialog);
        return dialog;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment
    public final DialogDataModel K0() {
        return this.d1.a;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment
    public final String L0() {
        return getClass().getSimpleName();
    }

    @Override // defpackage.zy2, ir.mservices.market.version2.fragments.base.BaseNewDialogFragment, ir.mservices.market.version2.fragments.base.Hilt_BaseNewDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void W(Context context) {
        this.d1 = qq.fromBundle(p0());
        super.W(context);
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void b0() {
        if (!this.f1) {
            N0(DialogResult.b, new Bundle());
        }
        this.c1 = null;
        super.b0();
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f1 = true;
        super.onCancel(dialogInterface);
    }
}
