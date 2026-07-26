package androidx.paging;

import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.SeparatorState", f = "Separators.kt", l = {217, 219, 220}, m = "onEvent", v = 1)
final class SeparatorState$onEvent$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ o b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeparatorState$onEvent$1(o oVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(null, this);
    }
}
