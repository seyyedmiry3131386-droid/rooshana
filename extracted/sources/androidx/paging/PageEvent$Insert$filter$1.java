package androidx.paging;

import defpackage.mq8;
import defpackage.qp2;
import defpackage.tb1;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.PageEvent$Insert", f = "PageEvent.kt", l = {170}, m = "filter", v = 1)
final class PageEvent$Insert$filter$1 extends ContinuationImpl {
    public qp2 a;
    public i b;
    public LoadType c;
    public Collection d;
    public Iterator e;
    public mq8 f;
    public List g;
    public List h;
    public Iterator i;
    public Object j;
    public Collection k;
    public int l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ i o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageEvent$Insert$filter$1(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.o = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.a(null, this);
    }
}
