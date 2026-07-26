package ir.mservices.market.version2.fragments.dialog;

import android.app.Dialog;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.a79;
import defpackage.fa1;
import defpackage.hm1;
import defpackage.js6;
import defpackage.lw;
import defpackage.nt6;
import defpackage.pq6;
import defpackage.sj8;
import defpackage.yq6;
import ir.mservices.market.version2.fragments.base.BaseDialogFragment;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.DialogHeaderComponent;

/* JADX INFO: loaded from: classes3.dex */
public class AppInstallProgressDialogFragment extends BaseDialogFragment {
    public hm1 c1;

    public static class OnAppInstalledDialogResultEvent extends BaseDialogFragment.OnDialogResultEvent implements Parcelable {
        public static final Parcelable.Creator<OnAppInstalledDialogResultEvent> CREATOR = new b();
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
        this.c1 = hm1Var;
        dialog.setContentView(hm1Var.l);
        this.c1.y.getBackground().setColorFilter(sj8.b().l, PorterDuff.Mode.MULTIPLY);
        this.c1.z.setIndicatorColor(sj8.b().c);
        this.c1.z.setTrackColor(sj8.b().e);
        String string = this.g.getString("BUNDLE_KEY_TITLE");
        String string2 = this.g.getString("BUNDLE_KEY_ICON_PATH");
        String string3 = this.g.getString("BUNDLE_KEY_DESCRIPTION", "");
        this.c1.w.setTitle(string);
        AppIconView appIconView = new AppIconView(F());
        int dimensionPixelSize = K().getDimensionPixelSize(pq6.dialog_header_side_image_size);
        appIconView.setLayoutParams(new ViewGroup.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        appIconView.setErrorImageResId(yq6.icon);
        appIconView.setImageUrl(string2);
        this.c1.w.setImageView(appIconView);
        this.c1.w.setComponentGravity(DialogHeaderComponent.ComponentGravity.b);
        if (!TextUtils.isEmpty(string3)) {
            this.c1.x.setText(string3);
        }
        return dialog;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseDialogFragment
    public final String I0() {
        return "AppInstall";
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void b0() {
        this.c1 = null;
        super.b0();
    }
}
