package androidx.compose.ui.text.font;

import defpackage.ce7;
import defpackage.lg4;
import defpackage.p67;
import defpackage.px;
import defpackage.qx;
import defpackage.rb5;
import defpackage.rl3;

/* JADX INFO: loaded from: classes.dex */
public final class c {
    public final lg4 a = new lg4(16);
    public final rb5 b;
    public final rl3 c;

    public c() {
        long[] jArr = ce7.a;
        this.b = new rb5();
        this.c = new rl3();
    }

    public static void a(c cVar, p67 p67Var, a aVar, Object obj) {
        cVar.getClass();
        aVar.getClass();
        qx qxVar = new qx(p67Var);
        synchronized (cVar.c) {
            try {
                if (obj == null) {
                    cVar.b.m(qxVar, new px(null));
                } else {
                    cVar.a.put(qxVar, new px(obj));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
