package ir.myket.movie.common.model.repositories;

import androidx.room.util.a;
import defpackage.at2;
import defpackage.e71;
import defpackage.g51;
import defpackage.k85;
import defpackage.kt;
import defpackage.l85;
import defpackage.mb1;
import defpackage.n85;
import defpackage.ob1;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import java.util.concurrent.CancellationException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.movie.common.model.repositories.MovieWatchProgressRepositoryImpl$getMovieWatchProgressByPlayId$$inlined$safeDbCall$default$1", f = "MovieWatchProgressRepositoryImpl.kt", l = {57}, m = "invokeSuspend", v = 1)
public final class MovieWatchProgressRepositoryImpl$getMovieWatchProgressByPlayId$$inlined$safeDbCall$default$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ n85 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieWatchProgressRepositoryImpl$getMovieWatchProgressByPlayId$$inlined$safeDbCall$default$1(g51 g51Var, n85 n85Var, String str) {
        super(2, g51Var);
        this.b = n85Var;
        this.c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new MovieWatchProgressRepositoryImpl$getMovieWatchProgressByPlayId$$inlined$safeDbCall$default$1(g51Var, this.b, this.c);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MovieWatchProgressRepositoryImpl$getMovieWatchProgressByPlayId$$inlined$safeDbCall$default$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        try {
            if (i == 0) {
                b.b(obj);
                k85 k85Var = this.b.a;
                String str = this.c;
                this.a = 1;
                obj = a.b(this, new kt(str, 7), k85Var.a, true, false);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
            }
            l85 l85Var = (l85) obj;
            return new ob1(l85Var != null ? at2.m0(l85Var) : null);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            th.printStackTrace();
            return new mb1(th);
        }
    }
}
