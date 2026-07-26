package ir.mservices.market.app.update;

import defpackage.dp2;
import defpackage.g51;
import defpackage.js3;
import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.u90;
import defpackage.xb5;
import defpackage.xz8;
import ir.mservices.market.views.MyketRecentDownloadView;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.h;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.update.BaseUpdateFragment$onViewCreated$1", f = "UpdateFragment.kt", l = {308}, m = "invokeSuspend", v = 1)
final class BaseUpdateFragment$onViewCreated$1 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ BaseUpdateFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.app.update.BaseUpdateFragment$onViewCreated$1$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.update.BaseUpdateFragment$onViewCreated$1$1", f = "UpdateFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements rp2 {
        public /* synthetic */ boolean a;
        public /* synthetic */ Boolean b;

        @Override // defpackage.rp2
        public final Object a(Object obj, Object obj2, Object obj3) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(3, (g51) obj3);
            anonymousClass1.a = zBooleanValue;
            anonymousClass1.b = (Boolean) obj2;
            return anonymousClass1.invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z = this.a;
            Boolean bool = this.b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            return Boolean.valueOf(js3.i(bool, Boolean.TRUE) && z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseUpdateFragment$onViewCreated$1(BaseUpdateFragment baseUpdateFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = baseUpdateFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new BaseUpdateFragment$onViewCreated$1(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((BaseUpdateFragment$onViewCreated$1) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MyketRecentDownloadView myketRecentDownloadView;
        xb5 onStateChangedFlow;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            BaseUpdateFragment baseUpdateFragment = this.b;
            xz8 xz8Var = baseUpdateFragment.j1;
            if (xz8Var != null && (myketRecentDownloadView = xz8Var.x) != null && (onStateChangedFlow = myketRecentDownloadView.getOnStateChangedFlow()) != null) {
                h hVar = new h(onStateChangedFlow, baseUpdateFragment.l1, new AnonymousClass1(3, null));
                u90 u90Var = new u90(baseUpdateFragment, 0);
                this.a = 1;
                if (hVar.a(u90Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
