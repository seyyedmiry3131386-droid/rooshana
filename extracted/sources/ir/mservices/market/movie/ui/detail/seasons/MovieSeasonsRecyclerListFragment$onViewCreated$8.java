package ir.mservices.market.movie.ui.detail.seasons;

import defpackage.d11;
import defpackage.dp2;
import defpackage.g51;
import defpackage.js3;
import defpackage.o4;
import defpackage.pk5;
import defpackage.qp2;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.ui.detail.seasons.MovieSeasonsRecyclerListFragment$onViewCreated$8", f = "MovieSeasonsRecyclerListFragment.kt", l = {223}, m = "invokeSuspend", v = 1)
final class MovieSeasonsRecyclerListFragment$onViewCreated$8 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ MovieSeasonsRecyclerListFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.movie.ui.detail.seasons.MovieSeasonsRecyclerListFragment$onViewCreated$8$2, reason: invalid class name */
    @tb1(c = "ir.mservices.market.movie.ui.detail.seasons.MovieSeasonsRecyclerListFragment$onViewCreated$8$2", f = "MovieSeasonsRecyclerListFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public final /* synthetic */ MovieSeasonsRecyclerListFragment a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MovieSeasonsRecyclerListFragment movieSeasonsRecyclerListFragment, g51 g51Var) {
            super(2, g51Var);
            this.a = movieSeasonsRecyclerListFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass2(this.a, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create(bool, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass2.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            kotlin.b.b(obj);
            int i = MovieSeasonsRecyclerListFragment.s1;
            MovieSeasonsRecyclerListFragment movieSeasonsRecyclerListFragment = this.a;
            DialogDataModel dialogDataModel = new DialogDataModel(movieSeasonsRecyclerListFragment.Q1(), "DIALOG_KEY_NO_RESULT", null, 12);
            String strL = movieSeasonsRecyclerListFragment.L(rs6.vpn_message_dialog);
            js3.o(strL, "getString(...)");
            pk5.g(movieSeasonsRecyclerListFragment.J0, new NavIntentDirections.Confirm(new d11(dialogDataModel, strL, null, movieSeasonsRecyclerListFragment.L(rs6.button_ok), sj8.b().j, sj8.b().k, sj8.b())), -1);
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieSeasonsRecyclerListFragment$onViewCreated$8(MovieSeasonsRecyclerListFragment movieSeasonsRecyclerListFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = movieSeasonsRecyclerListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new MovieSeasonsRecyclerListFragment$onViewCreated$8(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((MovieSeasonsRecyclerListFragment$onViewCreated$8) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            int i2 = MovieSeasonsRecyclerListFragment.s1;
            MovieSeasonsRecyclerListFragment movieSeasonsRecyclerListFragment = this.b;
            o4 o4Var = new o4(movieSeasonsRecyclerListFragment.S1().x, 11);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(movieSeasonsRecyclerListFragment, null);
            this.a = 1;
            if (d.f(o4Var, anonymousClass2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return tx8.a;
    }
}
