package ir.myket.player.ui.audio;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import androidx.compose.runtime.h;
import defpackage.d;
import defpackage.d20;
import defpackage.g51;
import defpackage.qp2;
import defpackage.t61;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.ui.audio.AutoRetryAsyncImageKt$rememberConnectivityState$1$1", f = "AutoRetryAsyncImage.kt", l = {73}, m = "invokeSuspend", v = 1)
final class AutoRetryAsyncImageKt$rememberConnectivityState$1$1 extends SuspendLambda implements qp2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ConnectivityManager c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoRetryAsyncImageKt$rememberConnectivityState$1$1(ConnectivityManager connectivityManager, g51 g51Var) {
        super(2, g51Var);
        this.c = connectivityManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        AutoRetryAsyncImageKt$rememberConnectivityState$1$1 autoRetryAsyncImageKt$rememberConnectivityState$1$1 = new AutoRetryAsyncImageKt$rememberConnectivityState$1$1(this.c, g51Var);
        autoRetryAsyncImageKt$rememberConnectivityState$1$1.b = obj;
        return autoRetryAsyncImageKt$rememberConnectivityState$1$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        ((AutoRetryAsyncImageKt$rememberConnectivityState$1$1) create((h) obj, (g51) obj2)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        h hVar = (h) this.b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw t61.q(obj);
        }
        kotlin.b.b(obj);
        d20 d20Var = new d20(0, hVar);
        NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addCapability(12).build();
        ConnectivityManager connectivityManager = this.c;
        connectivityManager.registerNetworkCallback(networkRequestBuild, d20Var);
        d dVar = new d(connectivityManager, d20Var, 10);
        this.b = null;
        this.a = 1;
        hVar.a(dVar, this);
        return coroutineSingletons;
    }
}
