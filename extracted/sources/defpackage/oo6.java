package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class oo6 implements bx4 {
    public final Context a;
    public final Class b;

    public oo6(Context context, Class cls) {
        this.a = context;
        this.b = cls;
    }

    @Override // defpackage.bx4
    public final ax4 a(vp7 vp7Var) {
        Class cls = this.b;
        return new qo6(this.a, vp7Var.t(File.class, cls), vp7Var.t(Uri.class, cls), cls);
    }
}
