package androidx.compose.foundation;

import defpackage.ab5;
import defpackage.ad3;
import defpackage.bt2;
import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.zc3;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.AbstractClickableNode$onPointerEvent$2", f = "Clickable.kt", l = {}, m = "invokeSuspend", v = 1)
final class AbstractClickableNode$onPointerEvent$2 extends SuspendLambda implements qp2 {
    public final /* synthetic */ a a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$onPointerEvent$2(a aVar, g51 g51Var) {
        super(2, g51Var);
        this.a = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new AbstractClickableNode$onPointerEvent$2(this.a, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        AbstractClickableNode$onPointerEvent$2 abstractClickableNode$onPointerEvent$2 = (AbstractClickableNode$onPointerEvent$2) create((e71) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        abstractClickableNode$onPointerEvent$2.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        a aVar = this.a;
        zc3 zc3Var = aVar.C;
        if (zc3Var != null) {
            ad3 ad3Var = new ad3(zc3Var);
            ab5 ab5Var = aVar.q;
            if (ab5Var != null) {
                bt2.G(aVar.o0(), null, null, new AbstractClickableNode$emitHoverExit$1$1$1(ab5Var, ad3Var, null), 3);
            }
            aVar.C = null;
        }
        return tx8.a;
    }
}
