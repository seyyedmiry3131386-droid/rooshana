package ir.mservices.market.movie.streamers;

import android.view.ViewGroup;
import defpackage.d78;
import defpackage.dp2;
import defpackage.f57;
import defpackage.fo0;
import defpackage.g51;
import defpackage.js3;
import defpackage.o4;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.uv1;
import defpackage.zk8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.streamers.StreamerProfileFragment$onViewCreated$1", f = "StreamerProfileFragment.kt", l = {134}, m = "invokeSuspend", v = 1)
final class StreamerProfileFragment$onViewCreated$1 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ StreamerProfileFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.movie.streamers.StreamerProfileFragment$onViewCreated$1$2, reason: invalid class name */
    @tb1(c = "ir.mservices.market.movie.streamers.StreamerProfileFragment$onViewCreated$1$2", f = "StreamerProfileFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ StreamerProfileFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(StreamerProfileFragment streamerProfileFragment, g51 g51Var) {
            super(2, g51Var);
            this.b = streamerProfileFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.b, g51Var);
            anonymousClass2.a = obj;
            return anonymousClass2;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((String) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass2.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str = (String) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            StreamerProfileFragment streamerProfileFragment = this.b;
            d78 d78Var = streamerProfileFragment.l1;
            if (d78Var == null) {
                js3.V("collapseBinding");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams = d78Var.v.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.height = streamerProfileFragment.R1();
            }
            f57 f57Var = (f57) ((f57) zk8.Q(streamerProfileFragment, str).W(uv1.b()).E(5)).G(new fo0());
            d78 d78Var2 = streamerProfileFragment.l1;
            if (d78Var2 != null) {
                f57Var.P(d78Var2.v);
                return tx8.a;
            }
            js3.V("collapseBinding");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamerProfileFragment$onViewCreated$1(StreamerProfileFragment streamerProfileFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = streamerProfileFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new StreamerProfileFragment$onViewCreated$1(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((StreamerProfileFragment$onViewCreated$1) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = StreamerProfileFragment.s1;
            StreamerProfileFragment streamerProfileFragment = this.b;
            o4 o4Var = new o4(streamerProfileFragment.S1().z, 28);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(streamerProfileFragment, null);
            this.a = 1;
            if (d.f(o4Var, anonymousClass2, this) == coroutineSingletons) {
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
