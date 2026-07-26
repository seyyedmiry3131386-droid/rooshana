package ir.mservices.market.reels.ui.recycler;

import com.airbnb.lottie.LottieAnimationView;
import defpackage.e71;
import defpackage.g51;
import defpackage.gb6;
import defpackage.js3;
import defpackage.q07;
import defpackage.qp2;
import defpackage.qs6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.v48;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.reels.ui.recycler.ReelViewHolder$onAttach$2", f = "Reel.kt", l = {1029}, m = "invokeSuspend", v = 1)
final class ReelViewHolder$onAttach$2 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ ReelData b;
    public final /* synthetic */ b c;

    /* JADX INFO: renamed from: ir.mservices.market.reels.ui.recycler.ReelViewHolder$onAttach$2$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.reels.ui.recycler.ReelViewHolder$onAttach$2$1", f = "Reel.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ boolean a;
        public final /* synthetic */ b b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b bVar, g51 g51Var) {
            super(2, g51Var);
            this.b = bVar;
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
            kotlin.b.b(obj);
            int i = b.B0;
            b bVar = this.b;
            gb6 gb6VarJ = bVar.J();
            float fS = gb6VarJ != null ? gb6VarJ.s() : -1.0f;
            if ((!z || fS != 0.0f) && (z || fS != 1.0f)) {
                q07 q07Var = bVar.M;
                if (q07Var == null) {
                    js3.V("binding");
                    throw null;
                }
                LottieAnimationView lottieAnimationView = q07Var.I;
                lottieAnimationView.setAnimation(z ? qs6.mute : qs6.unmute);
                lottieAnimationView.f();
                gb6 gb6VarJ2 = bVar.J();
                if (gb6VarJ2 != null) {
                    gb6VarJ2.y(z ? 0.0f : 1.0f);
                }
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReelViewHolder$onAttach$2(g51 g51Var, ReelData reelData, b bVar) {
        super(2, g51Var);
        this.b = reelData;
        this.c = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new ReelViewHolder$onAttach$2(g51Var, this.b, this.c);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((ReelViewHolder$onAttach$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            v48 v48Var = this.b.a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.c, null);
            this.a = 1;
            if (d.f(v48Var, anonymousClass1, this) == coroutineSingletons) {
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
