package kotlin.coroutines.jvm.internal;

import defpackage.g51;
import defpackage.w61;
import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
public abstract class RestrictedContinuationImpl extends BaseContinuationImpl {
    public RestrictedContinuationImpl(g51 g51Var) {
        super(g51Var);
        if (g51Var != null && g51Var.getContext() != EmptyCoroutineContext.a) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // defpackage.g51
    public final w61 getContext() {
        return EmptyCoroutineContext.a;
    }
}
