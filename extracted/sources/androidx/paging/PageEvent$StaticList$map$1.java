package androidx.paging;

import defpackage.qp2;
import defpackage.tb1;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.PageEvent$StaticList", f = "PageEvent.kt", l = {50}, m = "map", v = 1)
final class PageEvent$StaticList$map$1<R> extends ContinuationImpl {
    public qp2 a;
    public Collection b;
    public Iterator c;
    public Collection d;
    public /* synthetic */ Object e;
    public final /* synthetic */ j f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageEvent$StaticList$map$1(j jVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.c(null, this);
    }
}
