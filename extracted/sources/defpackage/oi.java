package defpackage;

import android.view.Choreographer;
import androidx.compose.ui.platform.i;
import kotlin.b;

/* JADX INFO: loaded from: classes.dex */
public final class oi implements Choreographer.FrameCallback {
    public final /* synthetic */ om0 a;
    public final /* synthetic */ dp2 b;

    public oi(om0 om0Var, i iVar, dp2 dp2Var) {
        this.a = om0Var;
        this.b = dp2Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object objA;
        try {
            objA = this.b.invoke(Long.valueOf(j));
        } catch (Throwable th) {
            objA = b.a(th);
        }
        this.a.resumeWith(objA);
    }
}
