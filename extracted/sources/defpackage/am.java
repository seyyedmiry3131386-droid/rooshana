package defpackage;

import android.text.SegmentFinder;

/* JADX INFO: loaded from: classes.dex */
public final class am extends SegmentFinder {
    public final /* synthetic */ bn6 a;

    public am(bn6 bn6Var) {
        this.a = bn6Var;
    }

    public final int nextEndBoundary(int i) {
        return this.a.l(i);
    }

    public final int nextStartBoundary(int i) {
        return this.a.e(i);
    }

    public final int previousEndBoundary(int i) {
        return this.a.f(i);
    }

    public final int previousStartBoundary(int i) {
        return this.a.k(i);
    }
}
