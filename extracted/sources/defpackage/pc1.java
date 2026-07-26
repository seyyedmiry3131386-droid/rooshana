package defpackage;

import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
public final class pc1 implements g51 {
    public rp2 a;
    public g51 b;
    public Object c;

    @Override // defpackage.g51
    public final w61 getContext() {
        return EmptyCoroutineContext.a;
    }

    @Override // defpackage.g51
    public final void resumeWith(Object obj) {
        this.b = null;
        this.c = obj;
    }
}
