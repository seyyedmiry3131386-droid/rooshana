package androidx.paging;

import defpackage.ja4;
import defpackage.js3;
import defpackage.qp2;
import defpackage.s44;
import defpackage.tx8;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class AsyncPagedListDiffer$loadStateListener$1 extends FunctionReferenceImpl implements qp2 {
    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        LoadType loadType = (LoadType) obj;
        ja4 ja4Var = (ja4) obj2;
        js3.p(loadType, "p0");
        js3.p(ja4Var, "p1");
        s44 s44Var = (s44) this.receiver;
        s44Var.getClass();
        int iOrdinal = loadType.ordinal();
        if (iOrdinal == 0) {
            if (!js3.i(s44Var.a, ja4Var)) {
                s44Var.a = ja4Var;
                throw null;
            }
            return tx8.a;
        }
        if (iOrdinal == 1) {
            if (!js3.i(s44Var.b, ja4Var)) {
                s44Var.b = ja4Var;
                throw null;
            }
            return tx8.a;
        }
        if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (!js3.i(s44Var.c, ja4Var)) {
            s44Var.c = ja4Var;
            throw null;
        }
        return tx8.a;
    }
}
