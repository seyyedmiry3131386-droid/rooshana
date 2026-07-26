package defpackage;

import java.lang.ref.ReferenceQueue;

/* JADX INFO: loaded from: classes.dex */
public final class wh4 extends xh4 {
    public final xh4 c;

    public wh4(ReferenceQueue referenceQueue, Object obj, int i, xh4 xh4Var) {
        super(referenceQueue, obj, i);
        this.c = xh4Var;
    }

    @Override // defpackage.qh4, defpackage.sh4
    public final sh4 a() {
        return this.c;
    }
}
