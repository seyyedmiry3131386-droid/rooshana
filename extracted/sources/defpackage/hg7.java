package defpackage;

import androidx.compose.ui.node.m;
import androidx.compose.ui.semantics.c;

/* JADX INFO: loaded from: classes.dex */
public final class hg7 {
    public final c a;
    public final int b;
    public final vq3 c;
    public final m d;

    public hg7(c cVar, int i, vq3 vq3Var, m mVar) {
        this.a = cVar;
        this.b = i;
        this.c = vq3Var;
        this.d = mVar;
    }

    public final String toString() {
        return "ScrollCaptureCandidate(node=" + this.a + ", depth=" + this.b + ", viewportBoundsInWindow=" + this.c + ", coordinates=" + this.d + ')';
    }
}
