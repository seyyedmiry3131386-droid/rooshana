package androidx.paging;

import defpackage.iz5;
import defpackage.na4;
import defpackage.pz2;
import defpackage.tb1;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.PagingDataPresenter", f = "PagingDataPresenter.kt", l = {468}, m = "presentNewList", v = 1)
final class PagingDataPresenter$presentNewList$1 extends ContinuationImpl {
    public List a;
    public na4 b;
    public na4 c;
    public pz2 d;
    public iz5 e;
    public pz2 f;
    public iz5 g;
    public int h;
    public int i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ a l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagingDataPresenter$presentNewList$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.l = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return a.a(this.l, null, 0, 0, false, null, null, null, this);
    }
}
