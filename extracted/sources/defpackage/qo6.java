package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class qo6 implements ax4 {
    public final Context a;
    public final ax4 b;
    public final ax4 c;
    public final Class d;

    public qo6(Context context, ax4 ax4Var, ax4 ax4Var2, Class cls) {
        this.a = context.getApplicationContext();
        this.b = ax4Var;
        this.c = ax4Var2;
        this.d = cls;
    }

    @Override // defpackage.ax4
    public final zw4 a(Object obj, int i, int i2, sv5 sv5Var) {
        Uri uri = (Uri) obj;
        return new zw4(new yq5(uri), new po6(this.a, this.b, this.c, uri, i, i2, sv5Var, this.d));
    }

    @Override // defpackage.ax4
    public final boolean b(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && r3.g((Uri) obj);
    }
}
