package androidx.paging;

import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.PageFetcherSnapshotState$Holder", f = "PageFetcherSnapshotState.kt", l = {431}, m = "withLock", v = 1)
final class PageFetcherSnapshotState$Holder$withLock$1<T> extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        throw null;
    }
}
