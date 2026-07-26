package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class u21 implements ho7 {
    public final AtomicReference a;

    public u21(ho7 ho7Var) {
        this.a = new AtomicReference(ho7Var);
    }

    @Override // defpackage.ho7
    public final Iterator iterator() {
        ho7 ho7Var = (ho7) this.a.getAndSet(null);
        if (ho7Var != null) {
            return ho7Var.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
