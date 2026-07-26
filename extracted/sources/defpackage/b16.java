package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public abstract class b16 {
    public final ry a = new ry(new sm5(13));

    public abstract Object a(e16 e16Var);

    public abstract Object b(x06 x06Var, ContinuationImpl continuationImpl);

    public final void c(bp2 bp2Var) {
        ry ryVar = this.a;
        synchronized (((rl3) ryVar.d)) {
            ((ArrayList) ryVar.e).remove(bp2Var);
        }
    }
}
