package ir.mservices.market.feedback.recycler;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import defpackage.ca2;
import defpackage.e71;
import defpackage.g51;
import defpackage.js3;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xb5;
import defpackage.z92;
import ir.mservices.market.views.MyketTextView;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.feedback.recycler.FeedbackBodyViewHolder$onAttach$1", f = "FeedbackBody.kt", l = {110}, m = "invokeSuspend", v = 1)
final class FeedbackBodyViewHolder$onAttach$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ FeedbackBodyData b;
    public final /* synthetic */ b c;

    /* JADX INFO: renamed from: ir.mservices.market.feedback.recycler.FeedbackBodyViewHolder$onAttach$1$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.feedback.recycler.FeedbackBodyViewHolder$onAttach$1$1", f = "FeedbackBody.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ b b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b bVar, g51 g51Var) {
            super(2, g51Var);
            this.b = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((ca2) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            ca2 ca2Var = (ca2) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            kotlin.b.b(obj);
            int i = ca2Var.b;
            int i2 = b.z;
            b bVar = this.b;
            bVar.x().w.getBackground().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
            MyketTextView myketTextView = bVar.x().v;
            js3.o(myketTextView, "errorTxt");
            myketTextView.setVisibility(!(ca2Var instanceof z92) ? 4 : 0);
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackBodyViewHolder$onAttach$1(FeedbackBodyData feedbackBodyData, b bVar, g51 g51Var) {
        super(2, g51Var);
        this.b = feedbackBodyData;
        this.c = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new FeedbackBodyViewHolder$onAttach$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((FeedbackBodyViewHolder$onAttach$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            xb5 xb5Var = this.b.a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.c, null);
            this.a = 1;
            if (kotlinx.coroutines.flow.d.f(xb5Var, anonymousClass1, this) == coroutineSingletons) {
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
