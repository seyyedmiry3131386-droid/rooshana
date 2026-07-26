package androidx.lifecycle;

import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.lifecycle.CoroutineLiveData", f = "CoroutineLiveData.kt", l = {221, 222}, m = "emitSource$lifecycle_livedata", v = 1)
final class CoroutineLiveData$emitSource$1 extends ContinuationImpl {
    public /* synthetic */ Object a;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        throw null;
    }
}
