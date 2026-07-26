package androidx.paging;

import defpackage.dc5;
import defpackage.tb1;
import defpackage.wt3;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.SingleRunner$Holder", f = "SingleRunner.kt", l = {120, 91}, m = "tryEnqueue", v = 1)
final class SingleRunner$Holder$tryEnqueue$1 extends ContinuationImpl {
    public wt3 a;
    public dc5 b;
    public /* synthetic */ Object c;
    public final /* synthetic */ p d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SingleRunner$Holder$tryEnqueue$1(p pVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(null, this);
    }
}
