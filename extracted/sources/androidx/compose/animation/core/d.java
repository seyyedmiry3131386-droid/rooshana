package androidx.compose.animation.core;

import defpackage.dp2;
import defpackage.g51;
import defpackage.js3;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final AtomicReference a = new AtomicReference(null);
    public final kotlinx.coroutines.sync.a b = new kotlinx.coroutines.sync.a();

    public static Object a(d dVar, dp2 dp2Var, g51 g51Var) {
        MutatePriority mutatePriority = MutatePriority.a;
        dVar.getClass();
        return js3.v(new MutatorMutex$mutate$2(dVar, dp2Var, null), g51Var);
    }
}
