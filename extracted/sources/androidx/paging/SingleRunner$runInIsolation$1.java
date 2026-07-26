package androidx.paging;

import defpackage.g51;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.SingleRunner", f = "SingleRunner.kt", l = {43}, m = "runInIsolation", v = 1)
final class SingleRunner$runInIsolation$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ m b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleRunner$runInIsolation$1(m mVar, g51 g51Var) {
        super(g51Var);
        this.b = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this, null);
    }
}
