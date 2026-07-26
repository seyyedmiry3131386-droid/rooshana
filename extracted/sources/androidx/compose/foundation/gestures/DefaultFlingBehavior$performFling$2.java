package androidx.compose.foundation.gestures;

import defpackage.ch7;
import defpackage.e71;
import defpackage.g51;
import defpackage.qe1;
import defpackage.qp2;
import defpackage.s08;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vb1;
import defpackage.vt;
import defpackage.wb1;
import defpackage.wu8;
import defpackage.xk;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$FloatRef;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", f = "Scrollable.kt", l = {1048}, m = "invokeSuspend", v = 1)
final class DefaultFlingBehavior$performFling$2 extends SuspendLambda implements qp2 {
    public Ref$FloatRef a;
    public xk b;
    public int c;
    public final /* synthetic */ float d;
    public final /* synthetic */ qe1 e;
    public final /* synthetic */ ch7 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFlingBehavior$performFling$2(float f, qe1 qe1Var, ch7 ch7Var, g51 g51Var) {
        super(2, g51Var);
        this.d = f;
        this.e = qe1Var;
        this.f = ch7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new DefaultFlingBehavior$performFling$2(this.d, this.e, this.f, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((DefaultFlingBehavior$performFling$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        float f;
        Ref$FloatRef ref$FloatRef;
        xk xkVar;
        Object obj2 = CoroutineSingletons.a;
        int i = this.c;
        if (i == 0) {
            kotlin.b.b(obj);
            f = this.d;
            if (Math.abs(f) > 1.0f) {
                ref$FloatRef = new Ref$FloatRef();
                ref$FloatRef.a = f;
                Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                xk xkVarB = wu8.b(0.0f, f, 28);
                try {
                    qe1 qe1Var = this.e;
                    wb1 wb1Var = qe1Var.a;
                    vt vtVar = new vt(ref$FloatRef2, this.f, ref$FloatRef, qe1Var);
                    this.a = ref$FloatRef;
                    this.b = xkVarB;
                    this.c = 1;
                    Object objB = androidx.compose.animation.core.f.b(xkVarB, new vb1(wb1Var, xkVarB.a, ((s08) xkVarB.b).getValue(), xkVarB.c), Long.MIN_VALUE, vtVar, this);
                    if (objB != CoroutineSingletons.a) {
                        objB = tx8.a;
                    }
                    if (objB == obj2) {
                        return obj2;
                    }
                } catch (CancellationException unused) {
                    xkVar = xkVarB;
                    ref$FloatRef.a = ((Number) xkVar.a()).floatValue();
                }
                f = ref$FloatRef.a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            xkVar = this.b;
            ref$FloatRef = this.a;
            try {
                kotlin.b.b(obj);
            } catch (CancellationException unused2) {
                ref$FloatRef.a = ((Number) xkVar.a()).floatValue();
            }
            f = ref$FloatRef.a;
        }
        return new Float(f);
    }
}
