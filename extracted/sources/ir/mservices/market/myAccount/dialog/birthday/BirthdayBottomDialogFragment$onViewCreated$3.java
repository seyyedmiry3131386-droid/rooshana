package ir.mservices.market.myAccount.dialog.birthday;

import defpackage.dp2;
import defpackage.g51;
import defpackage.h99;
import defpackage.is3;
import defpackage.js3;
import defpackage.l99;
import defpackage.n99;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.myAccount.data.MyAccountInfoDto;
import ir.mservices.market.myAccount.dialog.birthday.BirthDayAction;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.views.MyketProgressState;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.myAccount.dialog.birthday.BirthdayBottomDialogFragment$onViewCreated$3", f = "BirthdayBottomDialogFragment.kt", l = {103}, m = "invokeSuspend", v = 1)
final class BirthdayBottomDialogFragment$onViewCreated$3 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ BirthdayBottomDialogFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.myAccount.dialog.birthday.BirthdayBottomDialogFragment$onViewCreated$3$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.myAccount.dialog.birthday.BirthdayBottomDialogFragment$onViewCreated$3$1", f = "BirthdayBottomDialogFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ BirthdayBottomDialogFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BirthdayBottomDialogFragment birthdayBottomDialogFragment, g51 g51Var) {
            super(2, g51Var);
            this.b = birthdayBottomDialogFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((Pair) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Pair pair = (Pair) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            n99 n99Var = (n99) pair.a;
            boolean z = n99Var instanceof l99;
            BirthdayBottomDialogFragment birthdayBottomDialogFragment = this.b;
            if (z) {
                birthdayBottomDialogFragment.V0(MyketProgressState.b);
                BirthdayDialogViewModel birthdayDialogViewModel = (BirthdayDialogViewModel) birthdayBottomDialogFragment.j1.getValue();
                Object obj2 = pair.a;
                js3.n(obj2, "null cannot be cast to non-null type ir.mservices.market.version2.services.ViewState.Success<ir.mservices.market.myAccount.data.MyAccountInfoDto>");
                birthdayDialogViewModel.r(new BirthDayAction.SaveMiladiBirthDateAction(((MyAccountInfoDto) ((l99) obj2).a).getMiladiBirthDate()));
                birthdayBottomDialogFragment.R0(DialogResult.a, is3.g(new Pair("DATE", pair.b)));
            } else if (n99Var instanceof h99) {
                birthdayBottomDialogFragment.V0(MyketProgressState.b);
            } else {
                birthdayBottomDialogFragment.V0(MyketProgressState.c);
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BirthdayBottomDialogFragment$onViewCreated$3(BirthdayBottomDialogFragment birthdayBottomDialogFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = birthdayBottomDialogFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new BirthdayBottomDialogFragment$onViewCreated$3(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((BirthdayBottomDialogFragment$onViewCreated$3) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            BirthdayBottomDialogFragment birthdayBottomDialogFragment = this.b;
            pv6 pv6Var = ((BirthdayDialogViewModel) birthdayBottomDialogFragment.j1.getValue()).A;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(birthdayBottomDialogFragment, null);
            this.a = 1;
            if (d.f(pv6Var, anonymousClass1, this) == coroutineSingletons) {
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
