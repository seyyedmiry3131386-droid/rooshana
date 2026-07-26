package androidx.compose.animation;

import androidx.compose.animation.core.AnimationEndReason;
import defpackage.e71;
import defpackage.g51;
import defpackage.gy7;
import defpackage.qk;
import defpackage.qp2;
import defpackage.s08;
import defpackage.sk;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.zq3;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.animation.SizeAnimationModifierNode$animateTo$data$1$1", f = "AnimationModifier.kt", l = {242}, m = "invokeSuspend", v = 1)
final class SizeAnimationModifierNode$animateTo$data$1$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ gy7 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ p d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SizeAnimationModifierNode$animateTo$data$1$1(gy7 gy7Var, long j, p pVar, g51 g51Var) {
        super(2, g51Var);
        this.b = gy7Var;
        this.c = j;
        this.d = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new SizeAnimationModifierNode$animateTo$data$1$1(this.b, this.c, this.d, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((SizeAnimationModifierNode$animateTo$data$1$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        qp2 qp2Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        p pVar = this.d;
        gy7 gy7Var = this.b;
        if (i == 0) {
            kotlin.b.b(obj);
            androidx.compose.animation.core.a aVar = gy7Var.a;
            zq3 zq3Var = new zq3(this.c);
            sk skVar = pVar.p;
            this.a = 1;
            obj = androidx.compose.animation.core.a.b(aVar, zq3Var, skVar, null, null, this, 12);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        qk qkVar = (qk) obj;
        if (qkVar.b == AnimationEndReason.b && (qp2Var = pVar.q) != null) {
            qp2Var.invoke(new zq3(gy7Var.b), ((s08) qkVar.a.b).getValue());
        }
        return tx8.a;
    }
}
