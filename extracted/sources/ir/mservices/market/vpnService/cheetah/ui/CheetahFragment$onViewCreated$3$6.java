package ir.mservices.market.vpnService.cheetah.ui;

import android.view.View;
import defpackage.al2;
import defpackage.dp2;
import defpackage.eq0;
import defpackage.g51;
import defpackage.h99;
import defpackage.ia;
import defpackage.j99;
import defpackage.js3;
import defpackage.l99;
import defpackage.n99;
import defpackage.o4;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.app.detail.data.MessageBoxDto;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.vpnService.cheetah.data.CheetahDto;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.vpnService.cheetah.ui.CheetahFragment$onViewCreated$3$6", f = "CheetahFragment.kt", l = {167}, m = "invokeSuspend", v = 1)
final class CheetahFragment$onViewCreated$3$6 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ CheetahFragment b;
    public final /* synthetic */ al2 c;
    public final /* synthetic */ View d;

    /* JADX INFO: renamed from: ir.mservices.market.vpnService.cheetah.ui.CheetahFragment$onViewCreated$3$6$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.vpnService.cheetah.ui.CheetahFragment$onViewCreated$3$6$1", f = "CheetahFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ al2 b;
        public final /* synthetic */ CheetahFragment c;
        public final /* synthetic */ View d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(g51 g51Var, al2 al2Var, View view, CheetahFragment cheetahFragment) {
            super(2, g51Var);
            this.b = al2Var;
            this.c = cheetahFragment;
            this.d = view;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            CheetahFragment cheetahFragment = this.c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(g51Var, this.b, this.d, cheetahFragment);
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
            al2 al2Var = this.b;
            if (z) {
                AppIconView appIconView = al2Var.v;
                js3.o(appIconView, "appIcon");
                int i = CheetahFragment.b1;
                AppIconView.setImageUrl$default(appIconView, ((eq0) this.c.X0.getValue()).b, null, false, 6, null);
                al2Var.F.v();
                MyketTextView myketTextView = al2Var.A;
                MessageBoxDto messageBox = ((CheetahDto) ((l99) n99Var).a).getMessageBox();
                myketTextView.setText(messageBox != null ? messageBox.getText() : null);
                al2Var.C.setOnClickListener(new ia(this.d, n99Var, 1));
            } else if (n99Var instanceof h99) {
                al2Var.F.u(((h99) n99Var).a.getTranslatedMessage());
            } else {
                if (!(n99Var instanceof j99)) {
                    throw new NoWhenBranchMatchedException();
                }
                al2Var.F.t();
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheetahFragment$onViewCreated$3$6(g51 g51Var, al2 al2Var, View view, CheetahFragment cheetahFragment) {
        super(1, g51Var);
        this.b = cheetahFragment;
        this.c = al2Var;
        this.d = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new CheetahFragment$onViewCreated$3$6(g51Var, this.c, this.d, this.b);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((CheetahFragment$onViewCreated$3$6) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = CheetahFragment.b1;
            CheetahFragment cheetahFragment = this.b;
            o4 o4Var = new o4(cheetahFragment.l1().D, 9);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, this.c, this.d, cheetahFragment);
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
