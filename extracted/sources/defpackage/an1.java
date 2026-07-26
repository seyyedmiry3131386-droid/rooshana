package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;

/* JADX INFO: loaded from: classes.dex */
public final class an1 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ DialogFragment a;

    public an1(DialogFragment dialogFragment) {
        this.a = dialogFragment;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogFragment dialogFragment = this.a;
        Dialog dialog = dialogFragment.L0;
        if (dialog != null) {
            dialogFragment.onCancel(dialog);
        }
    }
}
