package ir.mservices.market.myAccount.dialog.username;

import defpackage.bt2;
import defpackage.c5;
import defpackage.e4;
import defpackage.e71;
import defpackage.g51;
import defpackage.js3;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vc8;
import defpackage.vy2;
import defpackage.y97;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes3.dex */
public final class UsernameDialogViewModel extends ir.mservices.market.viewModel.a {
    public final e4 v;
    public final c5 w;
    public final i x;
    public final pv6 y;

    /* JADX INFO: renamed from: ir.mservices.market.myAccount.dialog.username.UsernameDialogViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.myAccount.dialog.username.UsernameDialogViewModel$1", f = "UsernameDialogViewModel.kt", l = {55}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return UsernameDialogViewModel.this.new AnonymousClass1(g51Var);
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
                kotlin.b.b(obj);
                return tx8Var;
            }
            kotlin.b.b(obj);
            UsernameDialogViewModel usernameDialogViewModel = UsernameDialogViewModel.this;
            pv6 pv6Var = usernameDialogViewModel.u;
            b bVar = new b(usernameDialogViewModel);
            this.a = 1;
            Object objA = pv6Var.a.a(new vc8(bVar, 13), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UsernameDialogViewModel(e4 e4Var, c5 c5Var) {
        super(false);
        js3.p(c5Var, "accountManager");
        this.v = e4Var;
        this.w = c5Var;
        i iVarE = vy2.e(0, 7, null);
        this.x = iVarE;
        this.y = new pv6(iVarE);
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
    }
}
