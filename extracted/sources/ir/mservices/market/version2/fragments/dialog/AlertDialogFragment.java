package ir.mservices.market.version2.fragments.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import defpackage.js6;
import defpackage.nt6;
import defpackage.od;
import defpackage.pt2;
import defpackage.rr6;
import defpackage.sj8;
import defpackage.v4;
import ir.mservices.market.version2.fragments.base.BaseNewDialogFragment;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.DialogHeaderComponent;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public class AlertDialogFragment extends BaseNewDialogFragment {
    public DialogButtonComponent Y0;
    public od Z0;

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog C0(Bundle bundle) {
        Dialog dialog = new Dialog(F(), nt6.MyketDialogTheme);
        dialog.setContentView(js6.alert_dialog);
        dialog.findViewById(rr6.layout).getBackground().setColorFilter(sj8.b().l, PorterDuff.Mode.MULTIPLY);
        DialogHeaderComponent dialogHeaderComponent = (DialogHeaderComponent) dialog.findViewById(rr6.title);
        MyketTextView myketTextView = (MyketTextView) dialog.findViewById(rr6.description);
        this.Y0 = (DialogButtonComponent) dialog.findViewById(rr6.buttons);
        myketTextView.setTextColor(sj8.b().n);
        if (TextUtils.isEmpty(this.Z0.b)) {
            dialogHeaderComponent.setVisibility(8);
        } else {
            dialogHeaderComponent.setVisibility(0);
            dialogHeaderComponent.setTitle(this.Z0.b);
            dialogHeaderComponent.setComponentGravity(DialogHeaderComponent.ComponentGravity.b);
        }
        if (TextUtils.isEmpty(this.Z0.c)) {
            myketTextView.setVisibility(8);
        } else {
            od odVar = this.Z0;
            myketTextView.setTextFromHtml(odVar.c, odVar.e, TextView.BufferType.SPANNABLE, new v4(3, this), false);
            myketTextView.setMovementMethod(LinkMovementMethod.getInstance());
            myketTextView.setVisibility(0);
        }
        this.Y0.setTitles(null, this.Z0.d);
        this.Y0.setOnClickListener(new pt2(5, this));
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
        this.Z0 = od.fromBundle(p0());
        super.W(context);
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void b0() {
        super.b0();
        this.Y0 = null;
    }
}
