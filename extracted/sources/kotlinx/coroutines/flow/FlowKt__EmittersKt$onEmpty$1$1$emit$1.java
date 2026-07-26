package kotlinx.coroutines.flow;

import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$1$1", f = "Emitters.kt", l = {181}, m = "emit")
final class FlowKt__EmittersKt$onEmpty$1$1$emit$1 extends ContinuationImpl {
    public /* synthetic */ Object a;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        throw null;
    }
}
