package androidx.compose.foundation.gestures;

import defpackage.bt2;
import defpackage.cp0;
import defpackage.e71;
import defpackage.g51;
import defpackage.iz4;
import defpackage.li1;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wt3;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$busyReceive$2", f = "MouseWheelScrollable.kt", l = {198}, m = "invokeSuspend", v = 1)
final class MouseWheelScrollingLogic$busyReceive$2 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ cp0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MouseWheelScrollingLogic$busyReceive$2(cp0 cp0Var, g51 g51Var) {
        super(2, g51Var);
        this.c = cp0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        MouseWheelScrollingLogic$busyReceive$2 mouseWheelScrollingLogic$busyReceive$2 = new MouseWheelScrollingLogic$busyReceive$2(this.c, g51Var);
        mouseWheelScrollingLogic$busyReceive$2.b = obj;
        return mouseWheelScrollingLogic$busyReceive$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MouseWheelScrollingLogic$busyReceive$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        wt3 wt3Var;
        Throwable th;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            li1 li1VarG = bt2.G((e71) this.b, null, null, new MouseWheelScrollingLogic$busyReceive$2$job$1(2, null), 3);
            try {
                cp0 cp0Var = this.c;
                this.b = li1VarG;
                this.a = 1;
                Object objL = cp0Var.l(this);
                if (objL == coroutineSingletons) {
                    return coroutineSingletons;
                }
                wt3Var = li1VarG;
                obj = objL;
            } catch (Throwable th2) {
                wt3Var = li1VarG;
                th = th2;
                wt3Var.g(null);
                throw th;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            wt3Var = (wt3) this.b;
            try {
                kotlin.b.b(obj);
            } catch (Throwable th3) {
                th = th3;
                wt3Var.g(null);
                throw th;
            }
        }
        iz4 iz4Var = (iz4) obj;
        wt3Var.g(null);
        return iz4Var;
    }
}
