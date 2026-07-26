package ir.mservices.market.reels.ui;

import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import defpackage.dp2;
import defpackage.f88;
import defpackage.fp6;
import defpackage.g51;
import defpackage.js3;
import defpackage.kk7;
import defpackage.km2;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.reels.ui.ReelsFragment$onViewCreated$7", f = "ReelsFragment.kt", l = {356}, m = "invokeSuspend", v = 1)
final class ReelsFragment$onViewCreated$7 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ ReelsFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.reels.ui.ReelsFragment$onViewCreated$7$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.reels.ui.ReelsFragment$onViewCreated$7$1", f = "ReelsFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ ReelsFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ReelsFragment reelsFragment, g51 g51Var) {
            super(2, g51Var);
            this.b = reelsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((String) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str = (String) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            if (str != null && !f88.n0(str)) {
                ReelsFragment reelsFragment = this.b;
                km2 km2Var = reelsFragment.a1;
                js3.m(km2Var);
                km2Var.w.setText(str);
                Animation animationLoadAnimation = AnimationUtils.loadAnimation(reelsFragment.H(), fp6.reel_hint_text);
                km2 km2Var2 = reelsFragment.a1;
                js3.m(km2Var2);
                km2Var2.w.setVisibility(0);
                animationLoadAnimation.setAnimationListener(new kk7(reelsFragment, 2));
                km2 km2Var3 = reelsFragment.a1;
                js3.m(km2Var3);
                km2Var3.w.startAnimation(animationLoadAnimation);
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReelsFragment$onViewCreated$7(ReelsFragment reelsFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = reelsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new ReelsFragment$onViewCreated$7(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((ReelsFragment$onViewCreated$7) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = ReelsFragment.i1;
            ReelsFragment reelsFragment = this.b;
            pv6 pv6Var = reelsFragment.o1().D;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(reelsFragment, null);
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
