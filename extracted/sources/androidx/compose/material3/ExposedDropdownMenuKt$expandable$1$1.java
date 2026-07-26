package androidx.compose.material3;

import androidx.compose.ui.input.pointer.PointerEventPass;
import defpackage.ah6;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.material3.ExposedDropdownMenuKt$expandable$1$1", f = "ExposedDropdownMenu.kt", l = {1426, 1430}, m = "invokeSuspend")
final class ExposedDropdownMenuKt$expandable$1$1 extends RestrictedSuspendLambda implements qp2 {
    public int b;
    public /* synthetic */ Object c;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        throw null;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((ExposedDropdownMenuKt$expandable$1$1) create((androidx.compose.ui.input.pointer.e) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.b;
        if (i == 0) {
            kotlin.b.b(obj);
            androidx.compose.ui.input.pointer.e eVar = (androidx.compose.ui.input.pointer.e) this.c;
            PointerEventPass pointerEventPass = PointerEventPass.a;
            this.c = eVar;
            this.b = 1;
            obj = androidx.compose.foundation.gestures.p.c(eVar, this, 1);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                if (((ah6) obj) == null) {
                    return tx8.a;
                }
                throw null;
            }
            kotlin.b.b(obj);
        }
        throw null;
    }
}
