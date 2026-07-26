package androidx.paging;

import defpackage.pm3;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.FlattenedPageController", f = "CachedPageEventFlow.kt", l = {274}, m = "record", v = 1)
final class FlattenedPageController$record$1 extends ContinuationImpl {
    public pm3 a;
    public kotlinx.coroutines.sync.a b;
    public /* synthetic */ Object c;
    public final /* synthetic */ f d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlattenedPageController$record$1(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(null, this);
    }
}
