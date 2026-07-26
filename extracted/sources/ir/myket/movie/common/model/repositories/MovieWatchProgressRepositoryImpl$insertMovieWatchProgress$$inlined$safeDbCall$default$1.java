package ir.myket.movie.common.model.repositories;

import androidx.room.util.a;
import defpackage.e71;
import defpackage.g51;
import defpackage.h85;
import defpackage.k85;
import defpackage.l85;
import defpackage.mb1;
import defpackage.n85;
import defpackage.ob1;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.v25;
import java.util.concurrent.CancellationException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.movie.common.model.repositories.MovieWatchProgressRepositoryImpl$insertMovieWatchProgress$$inlined$safeDbCall$default$1", f = "MovieWatchProgressRepositoryImpl.kt", l = {57}, m = "invokeSuspend", v = 1)
public final class MovieWatchProgressRepositoryImpl$insertMovieWatchProgress$$inlined$safeDbCall$default$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ n85 b;
    public final /* synthetic */ h85 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieWatchProgressRepositoryImpl$insertMovieWatchProgress$$inlined$safeDbCall$default$1(g51 g51Var, n85 n85Var, h85 h85Var) {
        super(2, g51Var);
        this.b = n85Var;
        this.c = h85Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new MovieWatchProgressRepositoryImpl$insertMovieWatchProgress$$inlined$safeDbCall$default$1(g51Var, this.b, this.c);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MovieWatchProgressRepositoryImpl$insertMovieWatchProgress$$inlined$safeDbCall$default$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        tx8 tx8Var = tx8.a;
        try {
            if (i == 0) {
                b.b(obj);
                k85 k85Var = this.b.a;
                h85 h85Var = this.c;
                l85 l85Var = new l85(h85Var.c, h85Var.d, h85Var.e, h85Var.a, h85Var.b);
                this.a = 1;
                Object objB = a.b(this, new v25(k85Var, l85Var, 2), k85Var.a, false, true);
                if (objB != coroutineSingletons) {
                    objB = tx8Var;
                }
                if (objB == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
            }
            return new ob1(tx8Var);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            th.printStackTrace();
            return new mb1(th);
        }
    }
}
