package kotlinx.coroutines.channels;

import defpackage.bp2;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.channels.ProduceKt", f = "Produce.kt", l = {302}, m = "awaitClose")
final class ProduceKt$awaitClose$1 extends ContinuationImpl {
    public bp2 a;
    public /* synthetic */ Object b;
    public int c;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return b.a(null, null, this);
    }
}
