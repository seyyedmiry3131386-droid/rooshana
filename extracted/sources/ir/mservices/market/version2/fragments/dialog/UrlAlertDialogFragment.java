package ir.mservices.market.version2.fragments.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import defpackage.js6;
import defpackage.m09;
import defpackage.nt6;
import defpackage.rr6;
import defpackage.sj8;
import defpackage.ut4;
import ir.mservices.market.version2.fragments.base.BaseNewDialogFragment;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.DialogHeaderComponent;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public class UrlAlertDialogFragment extends BaseNewDialogFragment {
    public m09 Y0;

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog C0(Bundle bundle) {
        Dialog dialog = new Dialog(F(), nt6.MyketDialogTheme);
        dialog.setContentView(js6.url_dialog);
        dialog.findViewById(rr6.layout).getBackground().setColorFilter(sj8.b().l, PorterDuff.Mode.MULTIPLY);
        DialogHeaderComponent dialogHeaderComponent = (DialogHeaderComponent) dialog.findViewById(rr6.title);
        MyketTextView myketTextView = (MyketTextView) dialog.findViewById(rr6.description);
        DialogButtonComponent dialogButtonComponent = (DialogButtonComponent) dialog.findViewById(rr6.dialog_button);
        dialog.findViewById(rr6.scroll_view).setVerticalScrollBarEnabled(false);
        dialogHeaderComponent.setVisibility(8);
        SpannableString spannableString = this.Y0.b.a;
        if (TextUtils.isEmpty(spannableString)) {
            myketTextView.setVisibility(8);
        } else {
            myketTextView.setTextColor(sj8.b().n);
            myketTextView.setGravity(3);
            myketTextView.setText(spannableString);
            myketTextView.setVisibility(0);
        }
        dialogButtonComponent.setTitles(null, this.Y0.c);
        dialogButtonComponent.setOnClickListener(new ut4(17, this));
        BaseNewDialogFragment.I0(dialog.getWindow());
        M0(dialog);
        return dialog;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment
    public final DialogDataModel K0() {
        return this.Y0.a;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment
    public final String L0() {
        return getClass().getSimpleName();
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment, ir.mservices.market.version2.fragments.base.Hilt_BaseNewDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void W(Context context) {
        this.Y0 = m09.fromBundle(p0());
        super.W(context);
    }
}
