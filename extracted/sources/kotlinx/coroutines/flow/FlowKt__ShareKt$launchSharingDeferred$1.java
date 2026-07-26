package kotlinx.coroutines.flow;

import defpackage.e71;
import defpackage.e9;
import defpackage.g51;
import defpackage.hx0;
import defpackage.qp2;
import defpackage.rx0;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xe2;
import java.util.NoSuchElementException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", f = "Share.kt", l = {337}, m = "invokeSuspend")
final class FlowKt__ShareKt$launchSharingDeferred$1 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ xe2 c;
    public final /* synthetic */ hx0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ShareKt$launchSharingDeferred$1(xe2 xe2Var, hx0 hx0Var, g51 g51Var) {
        super(2, g51Var);
        this.c = xe2Var;
        this.d = hx0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        FlowKt__ShareKt$launchSharingDeferred$1 flowKt__ShareKt$launchSharingDeferred$1 = new FlowKt__ShareKt$launchSharingDeferred$1(this.c, this.d, g51Var);
        flowKt__ShareKt$launchSharingDeferred$1.b = obj;
        return flowKt__ShareKt$launchSharingDeferred$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowKt__ShareKt$launchSharingDeferred$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ref$ObjectRef ref$ObjectRef;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        hx0 hx0Var = this.d;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                e71 e71Var = (e71) this.b;
                Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                xe2 xe2Var = this.c;
                e9 e9Var = new e9(ref$ObjectRef2, e71Var, hx0Var, 2);
                this.b = ref$ObjectRef2;
                this.a = 1;
                if (xe2Var.a(e9Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ref$ObjectRef = ref$ObjectRef2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ref$ObjectRef = (Ref$ObjectRef) this.b;
                kotlin.b.b(obj);
            }
            if (ref$ObjectRef.a == null) {
                hx0Var.V(new Result(kotlin.b.a(new NoSuchElementException("Flow is empty"))));
            }
            return tx8.a;
        } catch (Throwable th) {
            hx0Var.V(new rx0(th, false));
            throw th;
        }
    }
}
