package ir.myket.analytics.tv.movie;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.th0;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.analytics.tv.movie.MovieComposeLoggerDslKt$HomeListScreenShowLoggerEffect$1$1", f = "MovieComposeLoggerDsl.kt", l = {}, m = "invokeSuspend", v = 1)
public final class MovieComposeLoggerDslKt$HomeListScreenShowLoggerEffect$1$1 extends SuspendLambda implements qp2 {
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        throw null;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        th0.k(kotlin.collections.b.M(new Pair(AppMeasurementSdk.ConditionalUserProperty.NAME, "home_list")), "screen_show");
        throw null;
    }
}
