package androidx.paging;

import defpackage.tb1;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.SeparatorState", f = "Separators.kt", l = {575}, m = "onStaticList", v = 1)
final class SeparatorState$onStaticList$1 extends ContinuationImpl {
    public j a;
    public List b;
    public Object c;
    public int d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ o g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeparatorState$onStaticList$1(o oVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.g = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.c(null, this);
    }
}
