package ir.mservices.market.myAccount.dialog.nickname;

import defpackage.d5;
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
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.views.MyketProgressState;
import ir.mservices.market.views.MyketTextView;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.myAccount.dialog.nickname.NicknameDialogFragment$onViewCreated$6", f = "NicknameDialogFragment.kt", l = {112}, m = "invokeSuspend", v = 1)
final class NicknameDialogFragment$onViewCreated$6 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ NicknameDialogFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.myAccount.dialog.nickname.NicknameDialogFragment$onViewCreated$6$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.myAccount.dialog.nickname.NicknameDialogFragment$onViewCreated$6$1", f = "NicknameDialogFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ NicknameDialogFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NicknameDialogFragment nicknameDialogFragment, g51 g51Var) {
            super(2, g51Var);
            this.b = nicknameDialogFragment;
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
            b.b(obj);
            boolean z = n99Var instanceof l99;
            NicknameDialogFragment nicknameDialogFragment = this.b;
            if (z) {
                nicknameDialogFragment.V0(MyketProgressState.b);
                d5 d5Var = nicknameDialogFragment.j1;
                js3.m(d5Var);
                nicknameDialogFragment.R0(DialogResult.a, is3.g(new Pair("BUNDLE_KEY_NICK_NAME", d5Var.A.getEditableText().toString())));
            } else if (n99Var instanceof h99) {
                d5 d5Var2 = nicknameDialogFragment.j1;
                js3.m(d5Var2);
                d5Var2.z.setErrorEnabled(true);
                d5 d5Var3 = nicknameDialogFragment.j1;
                js3.m(d5Var3);
                MyketTextView myketTextView = d5Var3.y;
                js3.m(myketTextView);
                myketTextView.setVisibility(0);
                myketTextView.setText(((h99) n99Var).a.getTranslatedMessage());
                nicknameDialogFragment.V0(MyketProgressState.b);
            } else {
                nicknameDialogFragment.V0(MyketProgressState.c);
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NicknameDialogFragment$onViewCreated$6(NicknameDialogFragment nicknameDialogFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = nicknameDialogFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new NicknameDialogFragment$onViewCreated$6(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((NicknameDialogFragment$onViewCreated$6) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            NicknameDialogFragment nicknameDialogFragment = this.b;
            pv6 pv6Var = ((NicknameDialogViewModel) nicknameDialogFragment.k1.getValue()).y;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(nicknameDialogFragment, null);
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
