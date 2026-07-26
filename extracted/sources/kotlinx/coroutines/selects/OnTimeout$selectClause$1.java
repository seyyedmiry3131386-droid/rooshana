package kotlinx.coroutines.selects;

import defpackage.jm7;
import defpackage.js3;
import defpackage.lo4;
import defpackage.rp2;
import defpackage.tx8;
import defpackage.ut5;
import defpackage.w61;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class OnTimeout$selectClause$1 extends FunctionReferenceImpl implements rp2 {
    public static final OnTimeout$selectClause$1 a = new OnTimeout$selectClause$1();

    public OnTimeout$selectClause$1() {
        super(3, ut5.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        ut5 ut5Var = (ut5) obj;
        jm7 jm7Var = (jm7) obj2;
        long j = ut5Var.a;
        tx8 tx8Var = tx8.a;
        if (j <= 0) {
            jm7Var.e(tx8Var);
            return tx8Var;
        }
        lo4 lo4Var = new lo4(jm7Var, ut5Var, 19);
        js3.n(jm7Var, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
        b bVar = (b) jm7Var;
        w61 w61Var = bVar.a;
        bVar.c = kotlinx.coroutines.a.g(w61Var).d(j, lo4Var, w61Var);
        return tx8Var;
    }
}
