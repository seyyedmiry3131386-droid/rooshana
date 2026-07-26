package ir.myket.persistent.model;

import defpackage.g51;
import defpackage.mb1;
import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ze2;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.persistent.model.SafeDatabaseCallKt$safeDbFlow$2", f = "SafeDatabaseCall.kt", l = {49}, m = "invokeSuspend", v = 1)
public final class SafeDatabaseCallKt$safeDbFlow$2 extends SuspendLambda implements rp2 {
    public int a;
    public /* synthetic */ ze2 b;
    public /* synthetic */ Throwable c;

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        SafeDatabaseCallKt$safeDbFlow$2 safeDatabaseCallKt$safeDbFlow$2 = new SafeDatabaseCallKt$safeDbFlow$2(3, (g51) obj3);
        safeDatabaseCallKt$safeDbFlow$2.b = (ze2) obj;
        safeDatabaseCallKt$safeDbFlow$2.c = (Throwable) obj2;
        return safeDatabaseCallKt$safeDbFlow$2.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ze2 ze2Var = this.b;
        Throwable th = this.c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            th.printStackTrace();
            mb1 mb1Var = new mb1(th);
            this.b = null;
            this.c = null;
            this.a = 1;
            if (ze2Var.emit(mb1Var, this) == coroutineSingletons) {
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
