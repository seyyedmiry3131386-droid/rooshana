package ir.mservices.market.social.profile.listMore.movie.list;

import androidx.fragment.app.d;
import defpackage.dp2;
import defpackage.g51;
import defpackage.is3;
import defpackage.qp2;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.version2.fragments.dialog.AlertBottomDialogFragment;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.views.MyketProgressState;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.profile.listMore.movie.list.ProfileMovieListMoreFragment$onViewCreated$2", f = "ProfileMovieListMoreFragment.kt", l = {158}, m = "invokeSuspend", v = 1)
final class ProfileMovieListMoreFragment$onViewCreated$2 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ ProfileMovieListMoreFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.social.profile.listMore.movie.list.ProfileMovieListMoreFragment$onViewCreated$2$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.social.profile.listMore.movie.list.ProfileMovieListMoreFragment$onViewCreated$2$1", f = "ProfileMovieListMoreFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ boolean a;
        public final /* synthetic */ ProfileMovieListMoreFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ProfileMovieListMoreFragment profileMovieListMoreFragment, g51 g51Var) {
            super(2, g51Var);
            this.b = profileMovieListMoreFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
            anonymousClass1.a = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create(bool, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z = this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            ProfileMovieListMoreFragment profileMovieListMoreFragment = this.b;
            if (z) {
                int i = ProfileMovieListMoreFragment.l1;
                if (profileMovieListMoreFragment.J0.g() instanceof AlertBottomDialogFragment) {
                    profileMovieListMoreFragment.J0.q();
                    DialogDataModel dialogDataModel = profileMovieListMoreFragment.R1().a;
                    dialogDataModel.d = DialogResult.a;
                    profileMovieListMoreFragment.J0.k(is3.g(new Pair("BUNDLE_KEY_DATA", dialogDataModel)), dialogDataModel.a);
                    profileMovieListMoreFragment.J0.q();
                }
            } else {
                int i2 = ProfileMovieListMoreFragment.l1;
                d dVarG = profileMovieListMoreFragment.J0.g();
                AlertBottomDialogFragment alertBottomDialogFragment = dVarG instanceof AlertBottomDialogFragment ? (AlertBottomDialogFragment) dVarG : null;
                if (alertBottomDialogFragment != null) {
                    alertBottomDialogFragment.e1.setStateCommit(MyketProgressState.b);
                }
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileMovieListMoreFragment$onViewCreated$2(ProfileMovieListMoreFragment profileMovieListMoreFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = profileMovieListMoreFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new ProfileMovieListMoreFragment$onViewCreated$2(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((ProfileMovieListMoreFragment$onViewCreated$2) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = ProfileMovieListMoreFragment.l1;
            ProfileMovieListMoreFragment profileMovieListMoreFragment = this.b;
            rv6 rv6Var = profileMovieListMoreFragment.S1().J;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(profileMovieListMoreFragment, null);
            this.a = 1;
            if (kotlinx.coroutines.flow.d.f(rv6Var, anonymousClass1, this) == coroutineSingletons) {
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
