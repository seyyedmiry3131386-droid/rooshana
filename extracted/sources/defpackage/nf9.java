package defpackage;

import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class nf9 extends mf9 {
    @Override // defpackage.sa7
    public final void l(boolean z) {
        if (!z) {
            v(16);
            return;
        }
        Window window = this.b;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        u(16);
    }
}
