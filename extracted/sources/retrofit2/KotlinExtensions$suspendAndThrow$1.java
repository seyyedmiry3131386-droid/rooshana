package retrofit2;

import defpackage.tb1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes4.dex */
@tb1(c = "retrofit2.KotlinExtensions", f = "KotlinExtensions.kt", l = {119}, m = "suspendAndThrow")
final class KotlinExtensions$suspendAndThrow$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        a.c(null, this);
        return CoroutineSingletons.a;
    }
}
