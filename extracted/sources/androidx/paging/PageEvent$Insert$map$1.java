package androidx.paging;

import defpackage.mq8;
import defpackage.qp2;
import defpackage.tb1;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.PageEvent$Insert", f = "PageEvent.kt", l = {140}, m = "map", v = 1)
final class PageEvent$Insert$map$1<R> extends ContinuationImpl {
    public qp2 a;
    public i b;
    public LoadType c;
    public Collection d;
    public Iterator e;
    public mq8 f;
    public int[] g;
    public Collection h;
    public Iterator i;
    public Collection j;
    public Collection k;
    public /* synthetic */ Object l;
    public final /* synthetic */ i m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageEvent$Insert$map$1(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.m = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.c(null, this);
    }
}
