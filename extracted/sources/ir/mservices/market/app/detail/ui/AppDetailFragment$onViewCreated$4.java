package ir.mservices.market.app.detail.ui;

import android.content.Context;
import defpackage.co6;
import defpackage.dp2;
import defpackage.g51;
import defpackage.js3;
import defpackage.o4;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.app.detail.ui.AppDetailAction;
import ir.mservices.market.core.notification.PushMessage;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.detail.ui.AppDetailFragment$onViewCreated$4", f = "AppDetailFragment.kt", l = {459}, m = "invokeSuspend", v = 1)
final class AppDetailFragment$onViewCreated$4 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ AppDetailFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.app.detail.ui.AppDetailFragment$onViewCreated$4$2, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.detail.ui.AppDetailFragment$onViewCreated$4$2", f = "AppDetailFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ AppDetailFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(AppDetailFragment appDetailFragment, g51 g51Var) {
            super(2, g51Var);
            this.b = appDetailFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.b, g51Var);
            anonymousClass2.a = obj;
            return anonymousClass2;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((Pair) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass2.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Pair pair = (Pair) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            kotlin.b.b(obj);
            AppDetailFragment appDetailFragment = this.b;
            Context contextH = appDetailFragment.H();
            if (contextH != null) {
                co6 co6Var = appDetailFragment.s1;
                if (co6Var == null) {
                    js3.V("pushMessageListener");
                    throw null;
                }
                co6Var.b(contextH, (PushMessage) pair.a);
            }
            appDetailFragment.R1().r(AppDetailAction.DisableNotification.INSTANCE);
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppDetailFragment$onViewCreated$4(AppDetailFragment appDetailFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = appDetailFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new AppDetailFragment$onViewCreated$4(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((AppDetailFragment$onViewCreated$4) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            int i2 = AppDetailFragment.M1;
            AppDetailFragment appDetailFragment = this.b;
            o4 o4Var = new o4(appDetailFragment.R1().S, 2);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(appDetailFragment, null);
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
