package kotlinx.coroutines;

import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.TimeoutKt", f = "Timeout.kt", l = {102}, m = "withTimeoutOrNull")
final class TimeoutKt$withTimeoutOrNull$1<T> extends ContinuationImpl {
    public Ref$ObjectRef a;
    public /* synthetic */ Object b;
    public int c;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return a.n(0L, null, this);
    }
}
