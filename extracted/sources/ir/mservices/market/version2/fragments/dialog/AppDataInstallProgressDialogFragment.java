package ir.mservices.market.version2.fragments.dialog;

import android.app.Dialog;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.a79;
import defpackage.az2;
import defpackage.fa1;
import defpackage.hm1;
import defpackage.js6;
import defpackage.lw;
import defpackage.nt6;
import defpackage.pq6;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.wo;
import defpackage.xf5;
import defpackage.yq6;
import ir.mservices.market.version2.fragments.base.BaseDialogFragment;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.DialogHeaderComponent;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public class AppDataInstallProgressDialogFragment extends az2 {
    public static final /* synthetic */ int j1 = 0;
    public int f1;
    public int g1;
    public xf5 h1;
    public hm1 i1;

    public static class OnAppInstalledDialogResultEvent extends BaseDialogFragment.OnDialogResultEvent implements Parcelable {
        public static final Parcelable.Creator<OnAppInstalledDialogResultEvent> CREATOR = new a();
    }

    public AppDataInstallProgressDialogFragment() {
        this.d1 = false;
        this.e1 = false;
        this.f1 = 0;
        this.g1 = 0;
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog C0(Bundle bundle) {
        lw.d(null, null, F());
        lw.d(null, null, this.g);
        Dialog dialog = new Dialog(F(), nt6.MyketDialogTheme);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(F());
        int i = hm1.A;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        hm1 hm1Var = (hm1) a79.f0(layoutInflaterFrom, js6.dialog_app_progress, null, false, null);
        this.i1 = hm1Var;
        dialog.setContentView(hm1Var.l);
        this.i1.y.getBackground().setColorFilter(sj8.b().l, PorterDuff.Mode.MULTIPLY);
        this.i1.z.setIndicatorColor(sj8.b().c);
        this.i1.z.setTrackColor(sj8.b().e);
        this.i1.w.setComponentGravity(DialogHeaderComponent.ComponentGravity.b);
        this.i1.w.setTitle(this.g.getString("BUNDLE_KEY_TITLE"));
        AppIconView appIconView = new AppIconView(F());
        int dimensionPixelSize = K().getDimensionPixelSize(pq6.dialog_header_side_image_size);
        appIconView.setLayoutParams(new ViewGroup.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        appIconView.setErrorImageResId(yq6.icon);
        appIconView.setImageUrl(this.g.getString("BUNDLE_KEY_ICON_PATH"));
        this.i1.w.setImageView(appIconView);
        this.i1.v.setOnClickListener(new wo(this));
        if (bundle != null && !bundle.isEmpty()) {
            this.f1 = bundle.getInt("BUNDLE_KEY_VIEW_STATE", 0);
            this.g1 = bundle.getInt("BUNDLE_KEY_RESULT_CODE", 0);
        }
        M0(this.f1);
        return dialog;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseDialogFragment
    public final String I0() {
        return "AppDataInstall";
    }

    public final void M0(int i) {
        int i2;
        if (i == 0) {
            this.i1.x.setText(K().getString(rs6.installing));
            this.i1.v.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.i1.x.setText(K().getString(rs6.install_status_copying));
            this.i1.v.setVisibility(8);
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            this.i1.x.setText(K().getString(rs6.get_unknown_permission));
            this.i1.v.setTitle(K().getString(rs6.settings));
            this.i1.v.setVisibility(0);
            this.i1.z.setVisibility(8);
            this.G0 = true;
            Dialog dialog = this.L0;
            if (dialog != null) {
                dialog.setCancelable(true);
                return;
            }
            return;
        }
        MyketTextView myketTextView = this.i1.x;
        xf5 xf5Var = this.h1;
        int i3 = this.g1;
        xf5Var.getClass();
        if (i3 == 0) {
            i2 = rs6.install_error_something_wrong;
        } else if (i3 == 1) {
            i2 = rs6.install_error_file_cannot_be_moved;
        } else if (i3 == 2) {
            i2 = rs6.install_error_cannot_create_folder;
        } else if (i3 != 3) {
            if (i3 == 4) {
                lw.g(null, null, null);
            }
            i2 = 0;
        } else {
            i2 = rs6.install_error_file_storage_failure;
        }
        myketTextView.setText(i2);
        this.i1.v.setTitle(K().getString(rs6.button_ok));
        this.i1.v.setVisibility(0);
        this.i1.z.setVisibility(8);
        this.G0 = true;
        Dialog dialog2 = this.L0;
        if (dialog2 != null) {
            dialog2.setCancelable(true);
        }
    }

    public final void N0(int i, int i2) {
        this.f1 = i;
        this.g1 = i2;
        if (this.i1 != null) {
            M0(i);
        }
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void b0() {
        super.b0();
        this.i1 = null;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void h0(Bundle bundle) {
        super.h0(bundle);
        bundle.putInt("BUNDLE_KEY_VIEW_STATE", this.f1);
        bundle.putInt("BUNDLE_KEY_RESULT_CODE", this.g1);
    }
}
