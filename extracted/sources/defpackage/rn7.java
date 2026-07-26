package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes3.dex */
public final class rn7 extends wl7 {
    public final /* synthetic */ AtomicReferenceArray e;

    public rn7(long j, rn7 rn7Var, int i) {
        super(j, rn7Var, i);
        this.e = new AtomicReferenceArray(qn7.f);
    }

    @Override // defpackage.wl7
    public final int g() {
        return qn7.f;
    }

    @Override // defpackage.wl7
    public final void h(int i, w61 w61Var) {
        this.e.set(i, qn7.e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.c + ", hashCode=" + hashCode() + ']';
    }
}
