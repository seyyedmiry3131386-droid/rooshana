package androidx.paging;

import android.os.Build;
import android.util.Log;
import defpackage.az5;
import defpackage.g51;
import defpackage.js3;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.PageFetcher$flow$1$3$downstreamFlow$1", f = "PageFetcher.kt", l = {}, m = "invokeSuspend", v = 1)
final class PageFetcher$flow$1$3$downstreamFlow$1 extends SuspendLambda implements qp2 {
    public /* synthetic */ Object a;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        PageFetcher$flow$1$3$downstreamFlow$1 pageFetcher$flow$1$3$downstreamFlow$1 = new PageFetcher$flow$1$3$downstreamFlow$1(2, g51Var);
        pageFetcher$flow$1$3$downstreamFlow$1.a = obj;
        return pageFetcher$flow$1$3$downstreamFlow$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        PageFetcher$flow$1$3$downstreamFlow$1 pageFetcher$flow$1$3$downstreamFlow$1 = (PageFetcher$flow$1$3$downstreamFlow$1) create((az5) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        pageFetcher$flow$1$3$downstreamFlow$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        az5 az5Var = (az5) this.a;
        if (Build.ID != null && Log.isLoggable("Paging", 2)) {
            js3.p("Sent " + az5Var, "message");
        }
        return tx8.a;
    }
}
