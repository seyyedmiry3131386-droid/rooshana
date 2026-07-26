package kotlin.coroutines.jvm.internal;

import defpackage.aq2;
import defpackage.g27;
import defpackage.g51;
import defpackage.i27;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public abstract class RestrictedSuspendLambda extends RestrictedContinuationImpl implements aq2 {
    public final int a;

    public RestrictedSuspendLambda(int i, g51 g51Var) {
        super(g51Var);
        this.a = i;
    }

    @Override // defpackage.aq2
    public final int getArity() {
        return this.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        g27.a.getClass();
        String strA = i27.a(this);
        js3.o(strA, "renderLambdaToString(...)");
        return strA;
    }
}
