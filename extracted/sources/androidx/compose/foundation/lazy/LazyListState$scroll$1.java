package androidx.compose.foundation.lazy;

import androidx.compose.foundation.MutatePriority;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.lazy.LazyListState", f = "LazyListState.kt", l = {462, 464}, m = "scroll", v = 1)
final class LazyListState$scroll$1 extends ContinuationImpl {
    public MutatePriority a;
    public SuspendLambda b;
    public /* synthetic */ Object c;
    public final /* synthetic */ b d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListState$scroll$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(null, null, this);
    }
}
