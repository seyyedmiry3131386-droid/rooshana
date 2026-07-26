package defpackage;

import java.lang.ref.ReferenceQueue;

/* JADX INFO: loaded from: classes.dex */
public class xh4 extends qh4 {
    public volatile Object b;

    public xh4(ReferenceQueue referenceQueue, Object obj, int i) {
        super(referenceQueue, obj, i);
        this.b = null;
    }

    @Override // defpackage.sh4
    public final Object getValue() {
        return this.b;
    }
}
