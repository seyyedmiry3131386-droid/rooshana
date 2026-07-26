package androidx.room.coroutines;

import defpackage.bt2;
import defpackage.c24;
import defpackage.mb7;
import defpackage.nb7;
import defpackage.o06;
import defpackage.q26;
import defpackage.qp2;
import defpackage.s11;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
public final class c implements s11 {
    public final nb7 a;
    public final String b;
    public final FunctionReferenceImpl c;
    public final c24 d = kotlin.a.a(new o06(1, this));

    /* JADX WARN: Multi-variable type inference failed */
    public c(nb7 nb7Var, String str, qp2 qp2Var) {
        this.a = nb7Var;
        this.b = str;
        this.c = (FunctionReferenceImpl) qp2Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.internal.FunctionReferenceImpl, qp2] */
    @Override // defpackage.s11
    public final Object M(boolean z, qp2 qp2Var, ContinuationImpl continuationImpl) {
        q26 q26Var = (q26) continuationImpl.getContext().r0(q26.b);
        b bVar = q26Var != null ? q26Var.a : null;
        if (bVar != null) {
            return qp2Var.invoke(bVar, continuationImpl);
        }
        b bVar2 = new b(this.c, (mb7) this.d.getValue());
        return bt2.Z(new q26(bVar2), new PassthroughConnectionPool$useConnection$2(qp2Var, bVar2, null), continuationImpl);
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws Exception {
        c24 c24Var = this.d;
        if (c24Var.isInitialized()) {
            ((mb7) c24Var.getValue()).close();
        }
    }
}
