package ir.mservices.market.movie.ui.home;

import androidx.recyclerview.widget.RecyclerView;
import defpackage.dp2;
import defpackage.f69;
import defpackage.g51;
import defpackage.kp4;
import defpackage.q69;
import defpackage.qp2;
import defpackage.rv6;
import defpackage.sq4;
import defpackage.tb1;
import defpackage.tx8;
import java.util.WeakHashMap;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.ui.home.MovieHomeFragment$onViewCreated$2", f = "MovieHomeFragment.kt", l = {111}, m = "invokeSuspend", v = 1)
final class MovieHomeFragment$onViewCreated$2 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ MovieHomeFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.movie.ui.home.MovieHomeFragment$onViewCreated$2$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.movie.ui.home.MovieHomeFragment$onViewCreated$2$1", f = "MovieHomeFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public final /* synthetic */ MovieHomeFragment a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MovieHomeFragment movieHomeFragment, g51 g51Var) {
            super(2, g51Var);
            this.a = movieHomeFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass1(this.a, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((kp4) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            int i = MovieHomeFragment.F1;
            RecyclerView recyclerViewY1 = this.a.y1();
            WeakHashMap weakHashMap = q69.a;
            f69.c(recyclerViewY1);
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieHomeFragment$onViewCreated$2(MovieHomeFragment movieHomeFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = movieHomeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new MovieHomeFragment$onViewCreated$2(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((MovieHomeFragment$onViewCreated$2) create((g51) obj)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [c24, java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = MovieHomeFragment.F1;
            MovieHomeFragment movieHomeFragment = this.b;
            rv6 rv6Var = ((sq4) movieHomeFragment.E1.getValue()).g;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(movieHomeFragment, null);
            this.a = 1;
            if (d.f(rv6Var, anonymousClass1, this) == coroutineSingletons) {
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
