package kotlin.jvm.internal;

import defpackage.aq2;
import defpackage.g27;
import defpackage.i27;
import defpackage.js3;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Lambda<R> implements aq2, Serializable {
    private final int arity;

    public Lambda(int i) {
        this.arity = i;
    }

    @Override // defpackage.aq2
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        g27.a.getClass();
        String strA = i27.a(this);
        js3.o(strA, "renderLambdaToString(...)");
        return strA;
    }
}
