package defpackage;

import java.util.Iterator;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
public final class dw implements ho7 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ dw(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [kotlin.coroutines.jvm.internal.RestrictedSuspendLambda, qp2] */
    @Override // defpackage.ho7
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return c26.K((Object[]) this.b);
            case 1:
                return ((Iterable) this.b).iterator();
            case 2:
                return new n74(this);
            case 3:
                return o27.h((RestrictedSuspendLambda) this.b);
            case 4:
                return (Iterator) this.b;
            default:
                return new m74((CharSequence) this.b);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dw(qp2 qp2Var) {
        this.a = 3;
        this.b = (RestrictedSuspendLambda) qp2Var;
    }
}
