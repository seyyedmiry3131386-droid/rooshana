package kotlinx.coroutines.selects;

import defpackage.dp2;
import defpackage.im7;
import defpackage.js3;
import defpackage.km7;
import defpackage.ut5;
import defpackage.wu8;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(b bVar, long j, dp2 dp2Var) {
        ut5 ut5Var = new ut5(j);
        OnTimeout$selectClause$1 onTimeout$selectClause$1 = OnTimeout$selectClause$1.a;
        js3.n(onTimeout$selectClause$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        wu8.i(3, onTimeout$selectClause$1);
        im7 im7Var = new im7(bVar, ut5Var, onTimeout$selectClause$1, km7.a, wu8.n, (SuspendLambda) dp2Var, null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b.f;
        bVar.k(im7Var, false);
    }
}
