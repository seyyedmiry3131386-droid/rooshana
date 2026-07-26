package defpackage;

import android.view.autofill.AutofillManager$AutofillCallback;

/* JADX INFO: loaded from: classes.dex */
public final class h30 extends AutofillManager$AutofillCallback {
    public static final h30 a = new h30();

    public final void a(re reVar) {
        reVar.c.registerCallback(this);
    }

    public final void b(re reVar) {
        reVar.c.unregisterCallback(this);
    }
}
