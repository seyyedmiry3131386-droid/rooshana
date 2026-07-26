package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class r6 extends WeakReference {
    public final sx3 a;
    public final boolean b;
    public g67 c;

    public r6(sx3 sx3Var, i22 i22Var, ReferenceQueue referenceQueue) {
        super(i22Var, referenceQueue);
        ok4.p(sx3Var, "Argument must not be null");
        this.a = sx3Var;
        boolean z = i22Var.a;
        this.c = null;
        this.b = z;
    }
}
