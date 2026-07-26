package androidx.compose.foundation;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.v69;
import defpackage.y97;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.CombinedClickableNode$onClickKeyDownEvent$1", f = "Clickable.kt", l = {1138}, m = "invokeSuspend", v = 1)
final class CombinedClickableNode$onClickKeyDownEvent$1 extends SuspendLambda implements qp2 {
    public int a;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new CombinedClickableNode$onClickKeyDownEvent$1(2, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((CombinedClickableNode$onClickKeyDownEvent$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            long jB = ((v69) y97.t(null, androidx.compose.ui.platform.l.s)).b();
            this.a = 1;
            if (kotlinx.coroutines.a.e(jB, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return tx8.a;
    }
}
