package ir.mservices.market.pika.receive.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.bi5;
import defpackage.bm1;
import defpackage.fa1;
import defpackage.g27;
import defpackage.hl5;
import defpackage.js3;
import defpackage.js6;
import defpackage.lw;
import defpackage.n15;
import defpackage.nt6;
import defpackage.pq6;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.y76;
import defpackage.yq6;
import ir.mservices.market.version2.fragments.base.BaseNewDialogFragment;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.DialogHeaderComponent;

/* JADX INFO: loaded from: classes3.dex */
public final class PikaInstallFailedDialogFragment extends BaseNewDialogFragment {
    public bm1 Y0;
    public final bi5 Z0 = new bi5(g27.a(y76.class), new n15(17, this));

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog C0(Bundle bundle) {
        lw.d(null, null, F());
        lw.d(null, null, this.g);
        Dialog dialog = new Dialog(q0(), nt6.MyketDialogTheme);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(F());
        int i = bm1.z;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        bm1 bm1Var = (bm1) fa1.c(layoutInflaterFrom, js6.dialog_alert_app_install_failed, null, false);
        this.Y0 = bm1Var;
        js3.m(bm1Var);
        dialog.setContentView(bm1Var.l);
        bm1 bm1Var2 = this.Y0;
        js3.m(bm1Var2);
        bm1Var2.y.getBackground().setColorFilter(new PorterDuffColorFilter(sj8.b().l, PorterDuff.Mode.MULTIPLY));
        bm1 bm1Var3 = this.Y0;
        js3.m(bm1Var3);
        DialogHeaderComponent dialogHeaderComponent = bm1Var3.w;
        bi5 bi5Var = this.Z0;
        dialogHeaderComponent.setTitle(((y76) bi5Var.getValue()).b);
        bm1 bm1Var4 = this.Y0;
        js3.m(bm1Var4);
        Context context = bm1Var4.l.getContext();
        js3.o(context, "getContext(...)");
        AppIconView appIconView = new AppIconView(context, null);
        int dimensionPixelSize = appIconView.getResources().getDimensionPixelSize(pq6.dialog_header_side_image_size);
        appIconView.setLayoutParams(new ViewGroup.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        appIconView.setErrorImageResId(yq6.icon);
        appIconView.setImageBitmap(((y76) bi5Var.getValue()).c);
        bm1 bm1Var5 = this.Y0;
        js3.m(bm1Var5);
        bm1Var5.w.setImageView(appIconView);
        bm1 bm1Var6 = this.Y0;
        js3.m(bm1Var6);
        bm1Var6.w.setComponentGravity(DialogHeaderComponent.ComponentGravity.b);
        bm1 bm1Var7 = this.Y0;
        js3.m(bm1Var7);
        bm1Var7.x.setText(K().getString(rs6.receive_app_install_failed));
        bm1 bm1Var8 = this.Y0;
        js3.m(bm1Var8);
        bm1Var8.v.setTitles(null, K().getString(rs6.button_ok));
        bm1 bm1Var9 = this.Y0;
        js3.m(bm1Var9);
        bm1Var9.v.setOnClickListener(new hl5(3, this));
        BaseNewDialogFragment.I0(dialog.getWindow());
        M0(dialog);
        return dialog;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment
    public final DialogDataModel K0() {
        return ((y76) this.Z0.getValue()).a;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment
    public final String L0() {
        return "PikaInstallFailedDialogFragment";
    }
}
