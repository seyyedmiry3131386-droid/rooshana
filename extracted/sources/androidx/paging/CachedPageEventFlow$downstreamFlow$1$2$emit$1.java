package androidx.paging;

import defpackage.g51;
import defpackage.pm3;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.CachedPageEventFlow$downstreamFlow$1$2", f = "CachedPageEventFlow.kt", l = {104}, m = "emit", v = 1)
final class CachedPageEventFlow$downstreamFlow$1$2$emit$1 extends ContinuationImpl {
    public pm3 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ b c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CachedPageEventFlow$downstreamFlow$1$2$emit$1(b bVar, g51 g51Var) {
        super(g51Var);
        this.c = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.c(null, this);
    }
}
