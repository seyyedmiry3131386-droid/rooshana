package ir.mservices.market.movie.ui.player;

import defpackage.bt2;
import defpackage.e71;
import defpackage.g51;
import defpackage.ja1;
import defpackage.jd7;
import defpackage.js3;
import defpackage.n4;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.r4;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.y97;
import ir.mservices.market.movie.ui.player.BaseMovieAction;
import ir.mservices.market.viewModel.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class BaseMovieViewModel extends a {
    public final l A;
    public final l B;
    public final jd7 v;
    public final rv6 w;
    public final l x;
    public final l y;
    public final l z;

    /* JADX INFO: renamed from: ir.mservices.market.movie.ui.player.BaseMovieViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.movie.ui.player.BaseMovieViewModel$1", f = "BaseMovieViewModel.kt", l = {95}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return BaseMovieViewModel.this.new AnonymousClass1(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            tx8 tx8Var = tx8.a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
                return tx8Var;
            }
            b.b(obj);
            BaseMovieViewModel baseMovieViewModel = BaseMovieViewModel.this;
            pv6 pv6Var = baseMovieViewModel.u;
            r4 r4Var = new r4(10, baseMovieViewModel);
            this.a = 1;
            Object objA = pv6Var.a.a(new n4(r4Var, 12), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseMovieViewModel(jd7 jd7Var) {
        super(false);
        js3.p(jd7Var, "savedStateHandle");
        this.v = jd7Var;
        this.w = jd7Var.c(2, "orientation");
        Boolean bool = Boolean.TRUE;
        this.x = ja1.b(bool);
        this.y = ja1.b(bool);
        this.z = ja1.b(new ArrayList());
        this.A = ja1.b(null);
        this.B = ja1.b(bool);
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCanShowAdAction(BaseMovieAction.CanShowAdAction canShowAdAction) {
        l lVar;
        Object value;
        do {
            lVar = this.y;
            value = lVar.getValue();
            ((Boolean) value).getClass();
        } while (!lVar.n(value, Boolean.valueOf(canShowAdAction.getCanShowAd())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFirstVideoDisplayAction(BaseMovieAction.FirstVideoDisplayAction firstVideoDisplayAction) {
        l lVar;
        Object value;
        do {
            lVar = this.B;
            value = lVar.getValue();
            ((Boolean) value).getClass();
        } while (!lVar.n(value, Boolean.valueOf(firstVideoDisplayAction.isFirstVideoDisplay())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onMoviePlayAction(BaseMovieAction.MoviePlayAction moviePlayAction) {
        l lVar;
        Object value;
        do {
            lVar = this.x;
            value = lVar.getValue();
            ((Boolean) value).getClass();
        } while (!lVar.n(value, Boolean.valueOf(moviePlayAction.isMoviePlaying())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRemoveAdAction(BaseMovieAction.RemoveAdAction removeAdAction) {
        l lVar;
        Object value;
        List list;
        do {
            lVar = this.z;
            value = lVar.getValue();
            list = (List) value;
            list.remove(Integer.valueOf(removeAdAction.getAd()));
        } while (!lVar.n(value, list));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onScreenOrientationChangeAction(BaseMovieAction.ScreenOrientationChangeAction screenOrientationChangeAction) {
        this.v.d(Integer.valueOf(screenOrientationChangeAction.getScreenOrientation()), "orientation");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onUpdateAdTimeAction(BaseMovieAction.UpdateAdTimeAction updateAdTimeAction) {
        l lVar;
        Object value;
        List<Integer> adTimes;
        do {
            lVar = this.z;
            value = lVar.getValue();
            adTimes = updateAdTimeAction.getAdTimes();
        } while (!lVar.n(value, adTimes != null ? kotlin.collections.a.Q0(adTimes) : new ArrayList()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onWatchProgressModelAction(BaseMovieAction.WatchProgressModelAction watchProgressModelAction) {
        l lVar;
        Object value;
        do {
            lVar = this.A;
            value = lVar.getValue();
        } while (!lVar.n(value, watchProgressModelAction.getMovieWatchProgressModel()));
    }
}
