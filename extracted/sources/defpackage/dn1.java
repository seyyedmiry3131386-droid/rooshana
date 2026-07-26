package defpackage;

import android.app.Dialog;
import android.view.View;
import androidx.fragment.app.DialogFragment;

/* JADX INFO: loaded from: classes.dex */
public final class dn1 extends y40 {
    public final /* synthetic */ ok2 s;
    public final /* synthetic */ DialogFragment t;

    public dn1(DialogFragment dialogFragment, ok2 ok2Var) {
        this.t = dialogFragment;
        this.s = ok2Var;
    }

    @Override // defpackage.y40
    public final View A(int i) {
        ok2 ok2Var = this.s;
        if (ok2Var.B()) {
            return ok2Var.A(i);
        }
        Dialog dialog = this.t.L0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // defpackage.y40
    public final boolean B() {
        return this.s.B() || this.t.P0;
    }
}
