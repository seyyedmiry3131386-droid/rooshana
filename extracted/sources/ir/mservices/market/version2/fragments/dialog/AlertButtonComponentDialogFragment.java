package ir.mservices.market.version2.fragments.dialog;

import android.content.Context;
import android.widget.FrameLayout;
import defpackage.dd;
import defpackage.zy2;
import ir.mservices.market.views.DialogButtonComponent;

/* JADX INFO: loaded from: classes3.dex */
public class AlertButtonComponentDialogFragment extends zy2 {
    public DialogButtonComponent c1;
    public dd d1;
    public FrameLayout e1;

    public AlertButtonComponentDialogFragment() {
        super(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0082  */
    @Override // androidx.fragment.app.DialogFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.app.Dialog C0(android.os.Bundle r10) {
        /*
            Method dump skipped, instruction units count: 371
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.version2.fragments.dialog.AlertButtonComponentDialogFragment.C0(android.os.Bundle):android.app.Dialog");
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
        this.d1 = dd.fromBundle(p0());
        super.W(context);
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void b0() {
        super.b0();
        this.c1 = null;
        this.e1 = null;
    }
}
