package ir.mservices.market.pika.connect.dialog;

import android.app.Dialog;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.bi5;
import defpackage.ck4;
import defpackage.fa1;
import defpackage.g27;
import defpackage.js3;
import defpackage.js6;
import defpackage.l76;
import defpackage.n15;
import defpackage.n76;
import defpackage.nt6;
import defpackage.rs6;
import defpackage.sj8;
import ir.mservices.market.version2.fragments.base.BaseNewDialogFragment;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class PikaConfirmDialogFragment extends Hilt_PikaConfirmDialogFragment {
    public l76 b1;
    public final bi5 c1 = new bi5(g27.a(n76.class), new n15(15, this));

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog C0(Bundle bundle) {
        Dialog dialog = new Dialog(o0(), nt6.MyketDialogTheme);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(H());
        int i = l76.z;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        l76 l76Var = (l76) fa1.c(layoutInflaterFrom, js6.pika_confirm_connect_dialog, null, false);
        this.b1 = l76Var;
        js3.m(l76Var);
        dialog.setContentView(l76Var.l);
        l76 l76Var2 = this.b1;
        js3.m(l76Var2);
        l76Var2.y.getBackground().setColorFilter(new PorterDuffColorFilter(sj8.b().l, PorterDuff.Mode.MULTIPLY));
        l76 l76Var3 = this.b1;
        js3.m(l76Var3);
        MyketTextView myketTextView = l76Var3.w;
        bi5 bi5Var = this.c1;
        myketTextView.setText(((n76) bi5Var.getValue()).b);
        l76 l76Var4 = this.b1;
        js3.m(l76Var4);
        l76Var4.v.setText(((n76) bi5Var.getValue()).c);
        l76 l76Var5 = this.b1;
        js3.m(l76Var5);
        l76Var5.x.setTitles(((n76) bi5Var.getValue()).d, K().getString(rs6.dismiss));
        l76 l76Var6 = this.b1;
        js3.m(l76Var6);
        l76Var6.x.setOnClickListener(new ck4(9, this));
        BaseNewDialogFragment.I0(dialog.getWindow());
        M0(dialog);
        return dialog;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment
    public final DialogDataModel K0() {
        return ((n76) this.c1.getValue()).a;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment
    public final String L0() {
        return "PikaConfirmDialogFragment";
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void b0() {
        this.b1 = null;
        super.b0();
    }
}
