package androidx.room;

import defpackage.bp2;
import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.room.TriggerBasedInvalidationTracker$refreshInvalidationAsync$3", f = "InvalidationTracker.kt", l = {394}, m = "invokeSuspend")
final class TriggerBasedInvalidationTracker$refreshInvalidationAsync$3 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ h b;
    public final /* synthetic */ bp2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TriggerBasedInvalidationTracker$refreshInvalidationAsync$3(h hVar, bp2 bp2Var, g51 g51Var) {
        super(2, g51Var);
        this.b = hVar;
        this.c = bp2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new TriggerBasedInvalidationTracker$refreshInvalidationAsync$3(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((TriggerBasedInvalidationTracker$refreshInvalidationAsync$3) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        bp2 bp2Var = this.c;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                h hVar = this.b;
                this.a = 1;
                obj = hVar.d(this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            bp2Var.invoke();
            return tx8.a;
        } catch (Throwable th) {
            bp2Var.invoke();
            throw th;
        }
    }
}
