package defpackage;

import android.view.Choreographer;

/* JADX INFO: loaded from: classes.dex */
public final class z69 implements Choreographer.FrameCallback {
    public final /* synthetic */ a79 a;

    public z69(a79 a79Var) {
        this.a = a79Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.a.j.run();
    }
}
