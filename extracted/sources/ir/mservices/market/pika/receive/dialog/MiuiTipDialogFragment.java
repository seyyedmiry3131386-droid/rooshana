package ir.mservices.market.pika.receive.dialog;

import android.app.Dialog;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.databinding.DataBinderMapperImpl;
import defpackage.bi5;
import defpackage.bw4;
import defpackage.ck4;
import defpackage.de;
import defpackage.dw4;
import defpackage.fa1;
import defpackage.g27;
import defpackage.js3;
import defpackage.js6;
import defpackage.nt6;
import defpackage.rs6;
import defpackage.sj8;
import ir.mservices.market.version2.fragments.base.BaseNewDialogFragment;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;

/* JADX INFO: loaded from: classes3.dex */
public final class MiuiTipDialogFragment extends Hilt_MiuiTipDialogFragment {
    public bw4 b1;
    public final bi5 c1 = new bi5(g27.a(dw4.class), new de(26, this));

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog C0(Bundle bundle) {
        Dialog dialog = new Dialog(o0(), nt6.MyketDialogTheme);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(H());
        int i = bw4.y;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        bw4 bw4Var = (bw4) fa1.c(layoutInflaterFrom, js6.miui_dialog_fragment, null, false);
        this.b1 = bw4Var;
        js3.m(bw4Var);
        dialog.setContentView(bw4Var.l);
        bw4 bw4Var2 = this.b1;
        js3.m(bw4Var2);
        bw4Var2.x.getBackground().setColorFilter(new PorterDuffColorFilter(sj8.b().l, PorterDuff.Mode.MULTIPLY));
        bw4 bw4Var3 = this.b1;
        js3.m(bw4Var3);
        bw4Var3.w.setTitles(K().getString(rs6.help), K().getString(rs6.dismiss));
        bw4 bw4Var4 = this.b1;
        js3.m(bw4Var4);
        bw4Var4.w.setOnClickListener(new ck4(3, this));
        BaseNewDialogFragment.I0(dialog.getWindow());
        M0(dialog);
        return dialog;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment
    public final DialogDataModel K0() {
        return ((dw4) this.c1.getValue()).a;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment
    public final String L0() {
        return "MiuiTipDialogFragment";
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void b0() {
        this.b1 = null;
        super.b0();
    }
}
