package androidx.paging;

import defpackage.g51;
import defpackage.kr2;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.PageFetcherSnapshot", f = "PageFetcherSnapshot.kt", l = {648, 660, 422, 431, 682, 724, 484, 746, 508, 534, 758}, m = "doLoad", v = 1)
final class PageFetcherSnapshot$doLoad$1 extends ContinuationImpl {
    public LoadType a;
    public kr2 b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public kotlinx.coroutines.sync.a j;
    public /* synthetic */ Object k;
    public final /* synthetic */ l l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$doLoad$1(l lVar, g51 g51Var) {
        super(g51Var);
        this.l = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return l.b(this.l, null, null, this);
    }
}
