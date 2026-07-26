package kotlin.coroutines.jvm.internal;

import defpackage.aq2;
import defpackage.g27;
import defpackage.g51;
import defpackage.i27;
import defpackage.js3;

/* JADX INFO: loaded from: classes3.dex */
public abstract class SuspendLambda extends ContinuationImpl implements aq2 {
    private final int arity;

    public SuspendLambda(int i, g51 g51Var) {
        super(g51Var);
        this.arity = i;
    }

    @Override // defpackage.aq2
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        g27.a.getClass();
        String strA = i27.a(this);
        js3.o(strA, "renderLambdaToString(...)");
        return strA;
    }
}
