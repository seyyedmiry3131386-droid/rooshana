package androidx.compose.foundation.text.input.internal;

import androidx.compose.ui.platform.q;
import defpackage.e71;
import defpackage.g51;
import defpackage.q44;
import defpackage.qp2;
import defpackage.t61;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.text.input.internal.LegacyAdaptingPlatformTextInputModifierNode$launchTextInputSession$1", f = "LegacyAdaptingPlatformTextInputModifierNode.kt", l = {137}, m = "invokeSuspend", v = 1)
final class LegacyAdaptingPlatformTextInputModifierNode$launchTextInputSession$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ q44 b;
    public final /* synthetic */ qp2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyAdaptingPlatformTextInputModifierNode$launchTextInputSession$1(q44 q44Var, qp2 qp2Var, g51 g51Var) {
        super(2, g51Var);
        this.b = q44Var;
        this.c = qp2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new LegacyAdaptingPlatformTextInputModifierNode$launchTextInputSession$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        ((LegacyAdaptingPlatformTextInputModifierNode$launchTextInputSession$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw t61.q(obj);
        }
        kotlin.b.b(obj);
        this.a = 1;
        q.a(this.b, this.c, this);
        return coroutineSingletons;
    }
}
