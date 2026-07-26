package androidx.compose.material3;

import androidx.compose.ui.input.pointer.PointerEventPass;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.material3.DragHandleKt$pressable$1$1", f = "DragHandle.kt", l = {341, 343}, m = "invokeSuspend")
final class DragHandleKt$pressable$1$1 extends RestrictedSuspendLambda implements qp2 {
    public int b;
    public /* synthetic */ Object c;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        throw null;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                throw null;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            throw null;
        }
        kotlin.b.b(obj);
        androidx.compose.ui.input.pointer.e eVar = (androidx.compose.ui.input.pointer.e) this.c;
        PointerEventPass pointerEventPass = PointerEventPass.a;
        this.c = eVar;
        this.b = 1;
        if (androidx.compose.foundation.gestures.p.c(eVar, this, 1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        throw null;
    }
}
