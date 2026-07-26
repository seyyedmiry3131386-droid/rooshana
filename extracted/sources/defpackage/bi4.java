package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class bi4 extends WeakReference implements ai4 {
    public final sh4 a;

    public bi4(ReferenceQueue referenceQueue, Object obj, sh4 sh4Var) {
        super(obj, referenceQueue);
        this.a = sh4Var;
    }

    @Override // defpackage.ai4
    public final ai4 a(ReferenceQueue referenceQueue, zh4 zh4Var) {
        return new bi4(referenceQueue, get(), zh4Var);
    }

    @Override // defpackage.ai4
    public final sh4 c() {
        return this.a;
    }
}
