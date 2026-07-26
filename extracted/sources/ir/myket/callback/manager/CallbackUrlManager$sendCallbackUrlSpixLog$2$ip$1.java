package ir.myket.callback.manager;

import android.net.Uri;
import defpackage.e71;
import defpackage.g51;
import defpackage.ql0;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import java.net.InetAddress;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.callback.manager.CallbackUrlManager$sendCallbackUrlSpixLog$2$ip$1", f = "CallbackUrlManager.kt", l = {}, m = "invokeSuspend", v = 1)
final class CallbackUrlManager$sendCallbackUrlSpixLog$2$ip$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ ql0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallbackUrlManager$sendCallbackUrlSpixLog$2$ip$1(ql0 ql0Var, g51 g51Var) {
        super(2, g51Var);
        this.a = ql0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new CallbackUrlManager$sendCallbackUrlSpixLog$2$ip$1(this.a, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((CallbackUrlManager$sendCallbackUrlSpixLog$2$ip$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        String str = this.a.a;
        if (str == null) {
            return null;
        }
        try {
            return InetAddress.getByName(Uri.parse(str).getHost()).getHostAddress();
        } catch (Exception unused) {
            return null;
        }
    }
}
