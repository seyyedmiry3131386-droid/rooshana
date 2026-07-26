package ir.mservices.market.movie.ui.detail;

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
@tb1(c = "ir.mservices.market.movie.ui.detail.MovieDetailRecyclerListFragment$onViewCreated$15", f = "MovieDetailRecyclerListFragment.kt", l = {1146}, m = "invokeSuspend", v = 1)
final class MovieDetailRecyclerListFragment$onViewCreated$15 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ MovieDetailRecyclerListFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.movie.ui.detail.MovieDetailRecyclerListFragment$onViewCreated$15$2, reason: invalid class name */
    @tb1(c = "ir.mservices.market.movie.ui.detail.MovieDetailRecyclerListFragment$onViewCreated$15$2", f = "MovieDetailRecyclerListFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public final /* synthetic */ MovieDetailRecyclerListFragment a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(MovieDetailRecyclerListFragment movieDetailRecyclerListFragment, g51 g51Var) {
            super(2, g51Var);
            this.a = movieDetailRecyclerListFragment;
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
            int i = MovieDetailRecyclerListFragment.H1;
            MovieDetailRecyclerListFragment movieDetailRecyclerListFragment = this.a;
            DialogDataModel dialogDataModel = new DialogDataModel(movieDetailRecyclerListFragment.W1(), "DIALOG_KEY_NO_RESULT", null, 12);
            String strL = movieDetailRecyclerListFragment.L(rs6.vpn_message_dialog);
            js3.o(strL, "getString(...)");
            pk5.g(movieDetailRecyclerListFragment.J0, new NavIntentDirections.Confirm(new d11(dialogDataModel, strL, null, movieDetailRecyclerListFragment.L(rs6.button_ok), sj8.b().j, sj8.b().k, sj8.b())), -1);
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieDetailRecyclerListFragment$onViewCreated$15(MovieDetailRecyclerListFragment movieDetailRecyclerListFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = movieDetailRecyclerListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new MovieDetailRecyclerListFragment$onViewCreated$15(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((MovieDetailRecyclerListFragment$onViewCreated$15) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            int i2 = MovieDetailRecyclerListFragment.H1;
            MovieDetailRecyclerListFragment movieDetailRecyclerListFragment = this.b;
            o4 o4Var = new o4(movieDetailRecyclerListFragment.Y1().x, 10);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(movieDetailRecyclerListFragment, null);
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
