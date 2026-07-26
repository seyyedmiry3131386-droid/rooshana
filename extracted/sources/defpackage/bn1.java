package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;

/* JADX INFO: loaded from: classes.dex */
public final class bn1 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ DialogFragment a;

    public bn1(DialogFragment dialogFragment) {
        this.a = dialogFragment;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogFragment dialogFragment = this.a;
        Dialog dialog = dialogFragment.L0;
        if (dialog != null) {
            dialogFragment.onDismiss(dialog);
        }
    }
}
