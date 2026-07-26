package defpackage;

import android.content.ClipboardManager;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class ze implements qt0 {
    public final ClipboardManager a;

    public ze(Context context) {
        Object systemService = context.getSystemService("clipboard");
        js3.n(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.a = (ClipboardManager) systemService;
    }
}
