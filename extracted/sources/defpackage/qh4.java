package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class qh4 extends WeakReference implements sh4 {
    public final int a;

    public qh4(ReferenceQueue referenceQueue, Object obj, int i) {
        super(obj, referenceQueue);
        this.a = i;
    }

    @Override // defpackage.sh4
    public sh4 a() {
        return null;
    }

    @Override // defpackage.sh4
    public final int c() {
        return this.a;
    }

    @Override // defpackage.sh4
    public final Object getKey() {
        return get();
    }
}
