package defpackage;

import android.os.Bundle;
import android.window.OnBackInvokedCallback;
import ir.mservices.market.login.ui.BaseLoginDialogFragment;
import ir.mservices.market.version2.fragments.dialog.DialogResult;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yl implements OnBackInvokedCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yl(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onBackInvoked() {
        switch (this.a) {
            case 0:
                bp2 bp2Var = (bp2) this.b;
                if (bp2Var != null) {
                    bp2Var.invoke();
                }
                break;
            case 1:
                ((ln) this.b).E();
                break;
            case 2:
                BaseLoginDialogFragment baseLoginDialogFragment = (BaseLoginDialogFragment) this.b;
                if (baseLoginDialogFragment.Y0()) {
                    baseLoginDialogFragment.R0(DialogResult.b, new Bundle());
                }
                break;
            case 3:
                ((lj4) this.b).a();
                break;
            case 4:
                ((ps5) this.b).a();
                break;
            default:
                ((Runnable) this.b).run();
                break;
        }
    }
}
