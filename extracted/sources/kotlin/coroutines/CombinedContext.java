package kotlin.coroutines;

import defpackage.ae;
import defpackage.bl4;
import defpackage.iz;
import defpackage.js3;
import defpackage.qp2;
import defpackage.sy0;
import defpackage.tx8;
import defpackage.u61;
import defpackage.v61;
import defpackage.w61;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import kotlin.jvm.internal.Ref$IntRef;

/* JADX INFO: loaded from: classes3.dex */
public final class CombinedContext implements w61, Serializable {
    public final w61 a;
    public final u61 b;

    public static final class Serialized implements Serializable {
        private static final long serialVersionUID = 0;
        public final w61[] a;

        public Serialized(w61[] w61VarArr) {
            this.a = w61VarArr;
        }

        private final Object readResolve() {
            w61 w61VarL0 = EmptyCoroutineContext.a;
            for (w61 w61Var : this.a) {
                w61VarL0 = w61VarL0.l0(w61Var);
            }
            return w61VarL0;
        }
    }

    public CombinedContext(u61 u61Var, w61 w61Var) {
        js3.p(w61Var, "left");
        js3.p(u61Var, "element");
        this.a = w61Var;
        this.b = u61Var;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        int iA = a();
        w61[] w61VarArr = new w61[iA];
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        J(new iz(w61VarArr, ref$IntRef, 3), tx8.a);
        if (ref$IntRef.a == iA) {
            return new Serialized(w61VarArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    @Override // defpackage.w61
    public final Object J(qp2 qp2Var, Object obj) {
        return qp2Var.invoke(this.a.J(qp2Var, obj), this.b);
    }

    @Override // defpackage.w61
    public final w61 P(v61 v61Var) {
        js3.p(v61Var, "key");
        u61 u61Var = this.b;
        u61 u61VarR0 = u61Var.r0(v61Var);
        w61 w61Var = this.a;
        if (u61VarR0 != null) {
            return w61Var;
        }
        w61 w61VarP = w61Var.P(v61Var);
        return w61VarP == w61Var ? this : w61VarP == EmptyCoroutineContext.a ? u61Var : new CombinedContext(u61Var, w61VarP);
    }

    public final int a() {
        int i = 2;
        CombinedContext combinedContext = this;
        while (true) {
            w61 w61Var = combinedContext.a;
            combinedContext = w61Var instanceof CombinedContext ? (CombinedContext) w61Var : null;
            if (combinedContext == null) {
                return i;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        boolean zI;
        if (this == obj) {
            return true;
        }
        if (obj instanceof CombinedContext) {
            CombinedContext combinedContext = (CombinedContext) obj;
            if (combinedContext.a() == a()) {
                CombinedContext combinedContext2 = this;
                while (true) {
                    u61 u61Var = combinedContext2.b;
                    if (!js3.i(combinedContext.r0(u61Var.getKey()), u61Var)) {
                        zI = false;
                        break;
                    }
                    w61 w61Var = combinedContext2.a;
                    if (!(w61Var instanceof CombinedContext)) {
                        js3.n(w61Var, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        u61 u61Var2 = (u61) w61Var;
                        zI = js3.i(combinedContext.r0(u61Var2.getKey()), u61Var2);
                        break;
                    }
                    combinedContext2 = (CombinedContext) w61Var;
                }
                if (zI) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + this.a.hashCode();
    }

    @Override // defpackage.w61
    public final w61 l0(w61 w61Var) {
        js3.p(w61Var, "context");
        return w61Var == EmptyCoroutineContext.a ? this : (w61) w61Var.J(new sy0(4), this);
    }

    @Override // defpackage.w61
    public final u61 r0(v61 v61Var) {
        js3.p(v61Var, "key");
        CombinedContext combinedContext = this;
        while (true) {
            u61 u61VarR0 = combinedContext.b.r0(v61Var);
            if (u61VarR0 != null) {
                return u61VarR0;
            }
            w61 w61Var = combinedContext.a;
            if (!(w61Var instanceof CombinedContext)) {
                return w61Var.r0(v61Var);
            }
            combinedContext = (CombinedContext) w61Var;
        }
    }

    public final String toString() {
        return bl4.y(new StringBuilder("["), (String) J(new ae(28), ""), ']');
    }
}
