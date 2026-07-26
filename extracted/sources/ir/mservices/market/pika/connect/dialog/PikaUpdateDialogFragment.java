package ir.mservices.market.pika.connect.dialog;

import android.app.Dialog;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.bi5;
import defpackage.c35;
import defpackage.fa1;
import defpackage.g27;
import defpackage.js3;
import defpackage.js6;
import defpackage.k86;
import defpackage.n15;
import defpackage.nt6;
import defpackage.qw6;
import defpackage.rs6;
import defpackage.sj8;
import ir.mservices.market.version2.fragments.base.BaseNewDialogFragment;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class PikaUpdateDialogFragment extends Hilt_PikaUpdateDialogFragment {
    public qw6 b1;
    public final bi5 c1 = new bi5(g27.a(k86.class), new n15(20, this));

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog C0(Bundle bundle) {
        Dialog dialog = new Dialog(o0(), nt6.MyketDialogTheme);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(H());
        int i = qw6.y;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        qw6 qw6Var = (qw6) fa1.c(layoutInflaterFrom, js6.receive_update_require_dialog, null, false);
        this.b1 = qw6Var;
        js3.m(qw6Var);
        dialog.setContentView(qw6Var.l);
        qw6 qw6Var2 = this.b1;
        js3.m(qw6Var2);
        qw6Var2.x.getBackground().setColorFilter(new PorterDuffColorFilter(sj8.b().l, PorterDuff.Mode.MULTIPLY));
        qw6 qw6Var3 = this.b1;
        js3.m(qw6Var3);
        MyketTextView myketTextView = qw6Var3.v;
        bi5 bi5Var = this.c1;
        myketTextView.setText(((k86) bi5Var.getValue()).b);
        qw6 qw6Var4 = this.b1;
        js3.m(qw6Var4);
        qw6Var4.w.setTitles(((k86) bi5Var.getValue()).c, K().getString(rs6.dismiss));
        qw6 qw6Var5 = this.b1;
        js3.m(qw6Var5);
        qw6Var5.w.setOnClickListener(new c35(5, this));
        BaseNewDialogFragment.I0(dialog.getWindow());
        M0(dialog);
        return dialog;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment
    public final DialogDataModel K0() {
        return ((k86) this.c1.getValue()).a;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment
    public final String L0() {
        return "PikaUpdateDialogFragment";
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void b0() {
        this.b1 = null;
        super.b0();
    }
}
