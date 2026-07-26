package ir.mservices.market.version2.fragments.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.dp3;
import defpackage.fa1;
import defpackage.js6;
import defpackage.lw;
import defpackage.mm1;
import defpackage.nt6;
import defpackage.pq6;
import defpackage.pt2;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.us;
import defpackage.zy2;
import ir.mservices.market.version2.fragments.base.BaseNewDialogFragment;
import ir.mservices.market.views.DialogHeaderComponent;

/* JADX INFO: loaded from: classes3.dex */
public class AppSignNotMatchedDialogFragment extends zy2 {
    public dp3 c1;
    public mm1 d1;
    public us e1;

    public AppSignNotMatchedDialogFragment() {
        super(2);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog C0(Bundle bundle) {
        lw.d(null, null, F());
        lw.d(null, null, this.g);
        Dialog dialog = new Dialog(F(), nt6.MyketDialogTheme);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(F());
        int i = mm1.z;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        mm1 mm1Var = (mm1) fa1.c(layoutInflaterFrom, js6.dialog_app_sign_not_matched, null, false);
        this.d1 = mm1Var;
        dialog.setContentView(mm1Var.l);
        this.d1.y.getBackground().setColorFilter(sj8.b().l, PorterDuff.Mode.MULTIPLY);
        String strU = this.c1.u(this.e1.b);
        Bitmap bitmapK = this.c1.k(this.e1.b);
        this.d1.w.setTitle(strU);
        this.d1.w.setImage(new BitmapDrawable(K(), bitmapK), pq6.dialog_header_side_image_size);
        this.d1.w.setComponentGravity(DialogHeaderComponent.ComponentGravity.b);
        this.d1.x.setText(rs6.install_dialog_sign_not_matched);
        this.d1.v.setTitles(K().getString(rs6.install_dialog_cancel), K().getString(rs6.install_dialog_settings));
        this.d1.v.setOnClickListener(new pt2(8, this));
        BaseNewDialogFragment.I0(dialog.getWindow());
        M0(dialog);
        return dialog;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment
    public final DialogDataModel K0() {
        return this.e1.a;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment
    public final String L0() {
        return getClass().getSimpleName();
    }

    @Override // defpackage.zy2, ir.mservices.market.version2.fragments.base.BaseNewDialogFragment, ir.mservices.market.version2.fragments.base.Hilt_BaseNewDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void W(Context context) {
        this.e1 = us.fromBundle(p0());
        super.W(context);
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void b0() {
        this.d1 = null;
        super.b0();
    }
}
