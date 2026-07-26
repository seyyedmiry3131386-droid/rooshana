package ir.mservices.market.movie.streamers.recycler;

import defpackage.e71;
import defpackage.g51;
import defpackage.js3;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.views.MyketProgressState;
import ir.mservices.market.views.SmallEmptyMediumTextOvalButton;
import ir.mservices.market.views.SmallFillOvalButton;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.streamers.recycler.StreamerNameViewHolder$onAttach$2", f = "StreamerName.kt", l = {111}, m = "invokeSuspend", v = 1)
final class StreamerNameViewHolder$onAttach$2 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ StreamerNameData b;
    public final /* synthetic */ a c;

    /* JADX INFO: renamed from: ir.mservices.market.movie.streamers.recycler.StreamerNameViewHolder$onAttach$2$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.movie.streamers.recycler.StreamerNameViewHolder$onAttach$2$1", f = "StreamerName.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ boolean a;
        public final /* synthetic */ a b;
        public final /* synthetic */ StreamerNameData c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(g51 g51Var, StreamerNameData streamerNameData, a aVar) {
            super(2, g51Var);
            this.b = aVar;
            this.c = streamerNameData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(g51Var, this.c, this.b);
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
            b.b(obj);
            a aVar = this.b;
            aVar.x().w.setState(MyketProgressState.b);
            this.c.g = !z;
            if (z) {
                SmallEmptyMediumTextOvalButton smallEmptyMediumTextOvalButton = aVar.x().w;
                js3.o(smallEmptyMediumTextOvalButton, "lowState");
                smallEmptyMediumTextOvalButton.setVisibility(8);
                SmallFillOvalButton smallFillOvalButton = aVar.x().v;
                js3.o(smallFillOvalButton, "highState");
                smallFillOvalButton.setVisibility(0);
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamerNameViewHolder$onAttach$2(g51 g51Var, StreamerNameData streamerNameData, a aVar) {
        super(2, g51Var);
        this.b = streamerNameData;
        this.c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new StreamerNameViewHolder$onAttach$2(g51Var, this.b, this.c);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((StreamerNameViewHolder$onAttach$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            StreamerNameData streamerNameData = this.b;
            pv6 pv6Var = streamerNameData.e;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, streamerNameData, this.c);
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
