package ir.myket.network.server;

import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ze2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.network.server.ServerMonitor$provideBaseUrl$1", f = "ServerMonitor.kt", l = {59, 59}, m = "invokeSuspend", v = 1)
public final class ServerMonitor$provideBaseUrl$1 extends SuspendLambda implements rp2 {
    public ze2 a;
    public int b;
    public int c;

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.c;
        if (i == 0) {
            kotlin.b.b(obj);
            throw null;
        }
        if (i == 1) {
            int i2 = this.b;
            ze2 ze2Var = this.a;
            kotlin.b.b(obj);
            this.a = null;
            this.b = i2;
            this.c = 2;
            if (ze2Var.emit(obj, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return tx8.a;
    }
}
