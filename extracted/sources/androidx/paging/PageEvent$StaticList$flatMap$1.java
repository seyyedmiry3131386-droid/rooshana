package androidx.paging;

import defpackage.qp2;
import defpackage.tb1;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.PageEvent$StaticList", f = "PageEvent.kt", l = {62}, m = "flatMap", v = 1)
final class PageEvent$StaticList$flatMap$1<R> extends ContinuationImpl {
    public qp2 a;
    public Collection b;
    public Iterator c;
    public /* synthetic */ Object d;
    public final /* synthetic */ j e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageEvent$StaticList$flatMap$1(j jVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.b(null, this);
    }
}
