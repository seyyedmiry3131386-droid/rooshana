package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import defpackage.nn;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatDialogFragment extends DialogFragment {
    @Override // androidx.fragment.app.DialogFragment
    public Dialog C0(Bundle bundle) {
        return new nn(H(), this.F0);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void E0(Dialog dialog, int i) {
        if (!(dialog instanceof nn)) {
            super.E0(dialog, i);
            return;
        }
        nn nnVar = (nn) dialog;
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        nnVar.e().g(1);
    }
}
