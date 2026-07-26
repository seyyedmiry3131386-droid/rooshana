package coil3.intercept;

import android.content.Context;
import coil3.decode.DataSource;
import defpackage.ai0;
import defpackage.d22;
import defpackage.e71;
import defpackage.g51;
import defpackage.ht4;
import defpackage.hy2;
import defpackage.ib8;
import defpackage.lg;
import defpackage.pi3;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.uv5;
import defpackage.wh3;
import java.lang.ref.WeakReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "coil3.intercept.EngineInterceptor$intercept$2", f = "EngineInterceptor.kt", l = {77}, m = "invokeSuspend")
final class EngineInterceptor$intercept$2 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ a b;
    public final /* synthetic */ pi3 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ uv5 e;
    public final /* synthetic */ hy2 f;
    public final /* synthetic */ ht4 g;
    public final /* synthetic */ c h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$intercept$2(a aVar, pi3 pi3Var, Object obj, uv5 uv5Var, hy2 hy2Var, ht4 ht4Var, c cVar, g51 g51Var) {
        super(2, g51Var);
        this.b = aVar;
        this.c = pi3Var;
        this.d = obj;
        this.e = uv5Var;
        this.f = hy2Var;
        this.g = ht4Var;
        this.h = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new EngineInterceptor$intercept$2(this.b, this.c, this.d, this.e, this.f, this.g, this.h, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((EngineInterceptor$intercept$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objC;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.b;
            pi3 pi3Var = this.c;
            Object obj2 = this.d;
            uv5 uv5Var = this.e;
            hy2 hy2Var = this.f;
            this.a = 1;
            objC = a.c(aVar, pi3Var, obj2, uv5Var, hy2Var, this);
            if (objC == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            objC = obj;
        }
        d22 d22Var = (d22) objC;
        ai0 ai0Var = this.b.b;
        synchronized (ai0Var) {
            try {
                coil3.a aVar2 = (coil3.a) ((WeakReference) ai0Var.b).get();
                if (aVar2 == null) {
                    ai0Var.y();
                } else if (((Context) ai0Var.e) == null) {
                    Context context = aVar2.a.a;
                    ai0Var.e = context;
                    context.registerComponentCallbacks((lg) ai0Var.d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        boolean zS = this.b.d.s(this.g, this.c, d22Var);
        wh3 wh3Var = d22Var.a;
        pi3 pi3Var2 = this.c;
        DataSource dataSource = d22Var.c;
        ht4 ht4Var = this.g;
        if (!zS) {
            ht4Var = null;
        }
        ht4 ht4Var2 = ht4Var;
        String str = d22Var.d;
        boolean z = d22Var.b;
        c cVar = this.h;
        return new ib8(wh3Var, pi3Var2, dataSource, ht4Var2, str, z, (cVar instanceof c) && cVar.g);
    }
}
