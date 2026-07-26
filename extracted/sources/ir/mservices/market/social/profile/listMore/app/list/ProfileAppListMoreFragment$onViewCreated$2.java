package ir.mservices.market.social.profile.listMore.app.list;

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
@tb1(c = "ir.mservices.market.social.profile.listMore.app.list.ProfileAppListMoreFragment$onViewCreated$2", f = "ProfileAppListMoreFragment.kt", l = {164}, m = "invokeSuspend", v = 1)
final class ProfileAppListMoreFragment$onViewCreated$2 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ ProfileAppListMoreFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.social.profile.listMore.app.list.ProfileAppListMoreFragment$onViewCreated$2$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.social.profile.listMore.app.list.ProfileAppListMoreFragment$onViewCreated$2$1", f = "ProfileAppListMoreFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ boolean a;
        public final /* synthetic */ ProfileAppListMoreFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ProfileAppListMoreFragment profileAppListMoreFragment, g51 g51Var) {
            super(2, g51Var);
            this.b = profileAppListMoreFragment;
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
            ProfileAppListMoreFragment profileAppListMoreFragment = this.b;
            if (z) {
                int i = ProfileAppListMoreFragment.l1;
                if (profileAppListMoreFragment.J0.g() instanceof AlertBottomDialogFragment) {
                    profileAppListMoreFragment.J0.q();
                    DialogDataModel dialogDataModel = profileAppListMoreFragment.R1().a;
                    dialogDataModel.d = DialogResult.a;
                    profileAppListMoreFragment.J0.k(is3.g(new Pair("BUNDLE_KEY_DATA", dialogDataModel)), dialogDataModel.a);
                    profileAppListMoreFragment.J0.q();
                }
            } else {
                int i2 = ProfileAppListMoreFragment.l1;
                d dVarG = profileAppListMoreFragment.J0.g();
                AlertBottomDialogFragment alertBottomDialogFragment = dVarG instanceof AlertBottomDialogFragment ? (AlertBottomDialogFragment) dVarG : null;
                if (alertBottomDialogFragment != null) {
                    alertBottomDialogFragment.e1.setStateCommit(MyketProgressState.b);
                }
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileAppListMoreFragment$onViewCreated$2(ProfileAppListMoreFragment profileAppListMoreFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = profileAppListMoreFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new ProfileAppListMoreFragment$onViewCreated$2(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((ProfileAppListMoreFragment$onViewCreated$2) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = ProfileAppListMoreFragment.l1;
            ProfileAppListMoreFragment profileAppListMoreFragment = this.b;
            rv6 rv6Var = profileAppListMoreFragment.S1().L;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(profileAppListMoreFragment, null);
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
