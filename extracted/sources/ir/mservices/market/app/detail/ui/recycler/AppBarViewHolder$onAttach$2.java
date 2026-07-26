package ir.mservices.market.app.detail.ui.recycler;

import defpackage.e71;
import defpackage.e73;
import defpackage.g51;
import defpackage.js3;
import defpackage.km;
import defpackage.o4;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.views.MyketTextView;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.detail.ui.recycler.AppBarViewHolder$onAttach$2", f = "AppBar.kt", l = {160}, m = "invokeSuspend", v = 1)
final class AppBarViewHolder$onAttach$2 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ AppBarData b;
    public final /* synthetic */ a c;

    /* JADX INFO: renamed from: ir.mservices.market.app.detail.ui.recycler.AppBarViewHolder$onAttach$2$2, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.detail.ui.recycler.AppBarViewHolder$onAttach$2$2", f = "AppBar.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public final /* synthetic */ a a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(a aVar, g51 g51Var) {
            super(2, g51Var);
            this.a = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass2(this.a, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create(bool, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass2.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            kotlin.b.b(obj);
            a aVar = this.a;
            float f = !aVar.x ? -10.0f : 10.0f;
            e73 e73Var = aVar.Q;
            if (e73Var == null) {
                js3.V("binding");
                throw null;
            }
            MyketTextView myketTextView = e73Var.w;
            myketTextView.setTranslationX(f);
            myketTextView.setAlpha(0.0f);
            myketTextView.animate().translationX(0.0f).alpha(1.0f).setStartDelay(200L).setDuration(300L).start();
            e73 e73Var2 = aVar.Q;
            if (e73Var2 == null) {
                js3.V("binding");
                throw null;
            }
            MyketTextView myketTextView2 = e73Var2.z;
            myketTextView2.setTranslationX(f);
            myketTextView2.setAlpha(0.0f);
            myketTextView2.animate().translationX(0.0f).alpha(1.0f).setStartDelay(400L).setDuration(300L).start();
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarViewHolder$onAttach$2(g51 g51Var, AppBarData appBarData, a aVar) {
        super(2, g51Var);
        this.b = appBarData;
        this.c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new AppBarViewHolder$onAttach$2(g51Var, this.b, this.c);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((AppBarViewHolder$onAttach$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            km kmVar = new km(new o4(this.b.h, 9), 0);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.c, null);
            this.a = 1;
            if (kotlinx.coroutines.flow.d.f(kmVar, anonymousClass2, this) == coroutineSingletons) {
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
