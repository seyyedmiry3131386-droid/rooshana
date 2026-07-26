package ir.mservices.market.social.profile.listMore.movie.list;

import defpackage.dp2;
import defpackage.g51;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xk6;
import kotlin.KotlinNothingValueException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.profile.listMore.movie.list.ProfileMovieListMoreFragment$onViewCreated$5", f = "ProfileMovieListMoreFragment.kt", l = {227}, m = "invokeSuspend", v = 1)
final class ProfileMovieListMoreFragment$onViewCreated$5 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ ProfileMovieListMoreFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileMovieListMoreFragment$onViewCreated$5(ProfileMovieListMoreFragment profileMovieListMoreFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = profileMovieListMoreFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new ProfileMovieListMoreFragment$onViewCreated$5(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        ((ProfileMovieListMoreFragment$onViewCreated$5) create((g51) obj)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = ProfileMovieListMoreFragment.l1;
            ProfileMovieListMoreFragment profileMovieListMoreFragment = this.b;
            rv6 rv6Var = profileMovieListMoreFragment.S1().C;
            xk6 xk6Var = new xk6(3, profileMovieListMoreFragment);
            this.a = 1;
            if (rv6Var.a.a(xk6Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
