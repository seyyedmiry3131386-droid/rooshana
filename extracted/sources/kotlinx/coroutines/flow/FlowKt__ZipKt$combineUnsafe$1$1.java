package kotlinx.coroutines.flow;

import defpackage.js3;
import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineUnsafe$1$1", f = "Zip.kt", l = {258, 258}, m = "invokeSuspend")
public final class FlowKt__ZipKt$combineUnsafe$1$1 extends SuspendLambda implements rp2 {
    public int a;

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        js3.U();
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            throw null;
        }
        if (i == 1) {
            kotlin.b.b(obj);
            this.a = 2;
            throw null;
        }
        if (i != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.b.b(obj);
        return tx8.a;
    }
}
