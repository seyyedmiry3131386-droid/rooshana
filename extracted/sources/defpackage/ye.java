package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class ye implements pt0 {
    public final ze a;

    public ye(ze zeVar) {
        this.a = zeVar;
    }

    public final void a(nt0 nt0Var) {
        ClipboardManager clipboardManager = this.a.a;
        if (nt0Var != null) {
            clipboardManager.setPrimaryClip(nt0Var.a);
        } else if (Build.VERSION.SDK_INT >= 28) {
            ul.d(clipboardManager);
        } else {
            clipboardManager.setPrimaryClip(ClipData.newPlainText("", ""));
        }
    }
}
