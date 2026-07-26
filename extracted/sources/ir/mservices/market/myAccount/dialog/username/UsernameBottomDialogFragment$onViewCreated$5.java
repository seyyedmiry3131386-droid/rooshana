package ir.mservices.market.myAccount.dialog.username;

import defpackage.dp2;
import defpackage.g51;
import defpackage.h99;
import defpackage.j5;
import defpackage.js3;
import defpackage.l99;
import defpackage.n99;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.views.MyketProgressState;
import ir.mservices.market.views.MyketTextView;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.myAccount.dialog.username.UsernameBottomDialogFragment$onViewCreated$5", f = "UsernameBottomDialogFragment.kt", l = {114}, m = "invokeSuspend", v = 1)
final class UsernameBottomDialogFragment$onViewCreated$5 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ UsernameBottomDialogFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.myAccount.dialog.username.UsernameBottomDialogFragment$onViewCreated$5$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.myAccount.dialog.username.UsernameBottomDialogFragment$onViewCreated$5$1", f = "UsernameBottomDialogFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ UsernameBottomDialogFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(UsernameBottomDialogFragment usernameBottomDialogFragment, g51 g51Var) {
            super(2, g51Var);
            this.b = usernameBottomDialogFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((n99) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            n99 n99Var = (n99) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            kotlin.b.b(obj);
            boolean z = n99Var instanceof l99;
            UsernameBottomDialogFragment usernameBottomDialogFragment = this.b;
            if (z) {
                MyketProgressState myketProgressState = MyketProgressState.b;
                j5 j5Var = usernameBottomDialogFragment.j1;
                js3.m(j5Var);
                j5Var.v.setStateCommit(myketProgressState);
                usernameBottomDialogFragment.V0();
            } else if (n99Var instanceof h99) {
                j5 j5Var2 = usernameBottomDialogFragment.j1;
                js3.m(j5Var2);
                MyketTextView myketTextView = j5Var2.y;
                js3.m(myketTextView);
                myketTextView.setVisibility(0);
                myketTextView.setText(((h99) n99Var).a.getTranslatedMessage());
                MyketProgressState myketProgressState2 = MyketProgressState.b;
                j5 j5Var3 = usernameBottomDialogFragment.j1;
                js3.m(j5Var3);
                j5Var3.v.setStateCommit(myketProgressState2);
            } else {
                MyketProgressState myketProgressState3 = MyketProgressState.c;
                j5 j5Var4 = usernameBottomDialogFragment.j1;
                js3.m(j5Var4);
                j5Var4.v.setStateCommit(myketProgressState3);
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UsernameBottomDialogFragment$onViewCreated$5(UsernameBottomDialogFragment usernameBottomDialogFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = usernameBottomDialogFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new UsernameBottomDialogFragment$onViewCreated$5(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((UsernameBottomDialogFragment$onViewCreated$5) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            UsernameBottomDialogFragment usernameBottomDialogFragment = this.b;
            pv6 pv6Var = ((UsernameDialogViewModel) usernameBottomDialogFragment.k1.getValue()).y;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(usernameBottomDialogFragment, null);
            this.a = 1;
            if (d.f(pv6Var, anonymousClass1, this) == coroutineSingletons) {
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
