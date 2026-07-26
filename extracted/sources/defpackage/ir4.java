package defpackage;

import android.content.ContentResolver;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class ir4 {
    public Context a;
    public ContentResolver b;

    static {
        Object obj = mr4.b;
    }

    public final boolean a(lr4 lr4Var, String str) {
        Context context = this.a;
        int i = lr4Var.b;
        return i < 0 ? context.getPackageManager().checkPermission(str, lr4Var.a) == 0 : context.checkPermission(str, i, lr4Var.c) == 0;
    }
}
