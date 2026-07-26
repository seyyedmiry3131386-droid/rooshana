package androidx.window.layout;

import android.app.Activity;
import defpackage.g51;
import defpackage.qa;
import defpackage.qp2;
import defpackage.rk6;
import defpackage.sk2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xv3;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.window.layout.WindowInfoTrackerImpl$windowLayoutInfo$2", f = "WindowInfoTrackerImpl.kt", l = {62}, m = "invokeSuspend")
final class WindowInfoTrackerImpl$windowLayoutInfo$2 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ a c;
    public final /* synthetic */ Activity d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInfoTrackerImpl$windowLayoutInfo$2(a aVar, Activity activity2, g51 g51Var) {
        super(2, g51Var);
        this.c = aVar;
        this.d = activity2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        WindowInfoTrackerImpl$windowLayoutInfo$2 windowInfoTrackerImpl$windowLayoutInfo$2 = new WindowInfoTrackerImpl$windowLayoutInfo$2(this.c, this.d, g51Var);
        windowInfoTrackerImpl$windowLayoutInfo$2.b = obj;
        return windowInfoTrackerImpl$windowLayoutInfo$2;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((WindowInfoTrackerImpl$windowLayoutInfo$2) create((rk6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            rk6 rk6Var = (rk6) this.b;
            sk2 sk2Var = new sk2(2, rk6Var);
            a aVar = this.c;
            aVar.b.b(this.d, new qa(0), sk2Var);
            xv3 xv3Var = new xv3(aVar, sk2Var, 29);
            this.a = 1;
            if (kotlinx.coroutines.channels.b.a(rk6Var, xv3Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        return tx8.a;
    }
}
