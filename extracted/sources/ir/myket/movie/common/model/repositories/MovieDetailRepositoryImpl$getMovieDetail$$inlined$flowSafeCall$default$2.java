package ir.myket.movie.common.model.repositories;

import defpackage.g51;
import defpackage.js3;
import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ze2;
import defpackage.zm5;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.network.model.SafeApiCallKt$flowSafeCall$3", f = "SafeApiCall.kt", l = {51}, m = "invokeSuspend", v = 1)
public final class MovieDetailRepositoryImpl$getMovieDetail$$inlined$flowSafeCall$default$2 extends SuspendLambda implements rp2 {
    public int a;
    public /* synthetic */ ze2 b;
    public /* synthetic */ Throwable c;

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        MovieDetailRepositoryImpl$getMovieDetail$$inlined$flowSafeCall$default$2 movieDetailRepositoryImpl$getMovieDetail$$inlined$flowSafeCall$default$2 = new MovieDetailRepositoryImpl$getMovieDetail$$inlined$flowSafeCall$default$2(3, (g51) obj3);
        movieDetailRepositoryImpl$getMovieDetail$$inlined$flowSafeCall$default$2.b = (ze2) obj;
        movieDetailRepositoryImpl$getMovieDetail$$inlined$flowSafeCall$default$2.c = (Throwable) obj2;
        return movieDetailRepositoryImpl$getMovieDetail$$inlined$flowSafeCall$default$2.invokeSuspend(tx8.a);
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
            zm5 zm5Var = new zm5(js3.B(th));
            this.b = null;
            this.c = null;
            this.a = 1;
            if (ze2Var.emit(zm5Var, this) == coroutineSingletons) {
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
