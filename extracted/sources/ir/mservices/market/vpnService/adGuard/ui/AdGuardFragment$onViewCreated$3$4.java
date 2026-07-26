package ir.mservices.market.vpnService.adGuard.ui;

import android.view.View;
import defpackage.dp2;
import defpackage.g51;
import defpackage.h99;
import defpackage.ia;
import defpackage.j99;
import defpackage.l99;
import defpackage.n99;
import defpackage.o4;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.uk2;
import ir.mservices.market.app.detail.data.MessageBoxDto;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.vpnService.adGuard.data.AdGuardData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.vpnService.adGuard.ui.AdGuardFragment$onViewCreated$3$4", f = "AdGuardFragment.kt", l = {151}, m = "invokeSuspend", v = 1)
final class AdGuardFragment$onViewCreated$3$4 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ AdGuardFragment b;
    public final /* synthetic */ uk2 c;
    public final /* synthetic */ View d;

    /* JADX INFO: renamed from: ir.mservices.market.vpnService.adGuard.ui.AdGuardFragment$onViewCreated$3$4$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.vpnService.adGuard.ui.AdGuardFragment$onViewCreated$3$4$1", f = "AdGuardFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ uk2 b;
        public final /* synthetic */ View c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(uk2 uk2Var, View view, g51 g51Var) {
            super(2, g51Var);
            this.b = uk2Var;
            this.c = view;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, this.c, g51Var);
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
            uk2 uk2Var = this.b;
            if (z) {
                uk2Var.B.v();
                MyketTextView myketTextView = uk2Var.w;
                MessageBoxDto messageBox = ((AdGuardData) ((l99) n99Var).a).getMessageBox();
                myketTextView.setText(messageBox != null ? messageBox.getText() : null);
                uk2Var.y.setOnClickListener(new ia(this.c, n99Var, 0));
            } else if (n99Var instanceof h99) {
                uk2Var.B.u(((h99) n99Var).a.getTranslatedMessage());
            } else {
                if (!(n99Var instanceof j99)) {
                    throw new NoWhenBranchMatchedException();
                }
                uk2Var.B.t();
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdGuardFragment$onViewCreated$3$4(AdGuardFragment adGuardFragment, uk2 uk2Var, View view, g51 g51Var) {
        super(1, g51Var);
        this.b = adGuardFragment;
        this.c = uk2Var;
        this.d = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new AdGuardFragment$onViewCreated$3$4(this.b, this.c, this.d, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((AdGuardFragment$onViewCreated$3$4) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = AdGuardFragment.a1;
            o4 o4Var = new o4(this.b.l1().B, 9);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.c, this.d, null);
            this.a = 1;
            if (d.f(o4Var, anonymousClass1, this) == coroutineSingletons) {
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
