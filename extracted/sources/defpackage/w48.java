package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class w48 extends v2 {
    public final AtomicReference a = new AtomicReference(null);

    @Override // defpackage.v2
    public final boolean a(u2 u2Var) {
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(ja1.n);
        return true;
    }

    @Override // defpackage.v2
    public final g51[] b(u2 u2Var) {
        this.a.set(null);
        return m91.a;
    }
}
