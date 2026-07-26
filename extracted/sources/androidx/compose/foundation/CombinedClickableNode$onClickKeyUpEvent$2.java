package androidx.compose.foundation;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.v69;
import defpackage.y97;
import defpackage.yv0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.CombinedClickableNode$onClickKeyUpEvent$2", f = "Clickable.kt", l = {1194, 1198}, m = "invokeSuspend", v = 1)
final class CombinedClickableNode$onClickKeyUpEvent$2 extends SuspendLambda implements qp2 {
    public long a;
    public long b;
    public int c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CombinedClickableNode$onClickKeyUpEvent$2(yv0 yv0Var, long j, g51 g51Var) {
        super(2, g51Var);
        this.d = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new CombinedClickableNode$onClickKeyUpEvent$2(null, this.d, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((CombinedClickableNode$onClickKeyUpEvent$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.c;
        if (i == 0) {
            kotlin.b.b(obj);
            v69 v69Var = (v69) y97.t(null, androidx.compose.ui.platform.l.s);
            v69Var.getClass();
            long jA = v69Var.a();
            this.a = 40L;
            this.b = jA;
            this.c = 1;
            if (kotlinx.coroutines.a.e(40L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                throw null;
            }
            kotlin.b.b(obj);
        }
        throw null;
    }
}
