package ir.mservices.market.app.detail.more.ui.recycler;

import defpackage.e71;
import defpackage.g51;
import defpackage.js3;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xb5;
import ir.mservices.market.views.MyketTextView;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.detail.more.ui.recycler.MoreSizeViewHolder$onAttach$1", f = "MoreSizeData.kt", l = {87}, m = "invokeSuspend", v = 1)
final class MoreSizeViewHolder$onAttach$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ MoreSizeData b;
    public final /* synthetic */ a c;

    /* JADX INFO: renamed from: ir.mservices.market.app.detail.more.ui.recycler.MoreSizeViewHolder$onAttach$1$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.detail.more.ui.recycler.MoreSizeViewHolder$onAttach$1$1", f = "MoreSizeData.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ boolean a;
        public final /* synthetic */ a b;
        public final /* synthetic */ MoreSizeData c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(g51 g51Var, MoreSizeData moreSizeData, a aVar) {
            super(2, g51Var);
            this.b = aVar;
            this.c = moreSizeData;
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
            int paintFlags;
            boolean z = this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            a aVar = this.b;
            MyketTextView myketTextView = aVar.x().v;
            if (z) {
                aVar.x().w.setText(this.c.b);
                paintFlags = aVar.x().v.getPaintFlags() | 16;
            } else {
                paintFlags = aVar.x().v.getPaintFlags() & (-17);
            }
            myketTextView.setPaintFlags(paintFlags);
            MyketTextView myketTextView2 = aVar.x().w;
            js3.o(myketTextView2, "diffSize");
            myketTextView2.setVisibility(z ? 0 : 8);
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoreSizeViewHolder$onAttach$1(g51 g51Var, MoreSizeData moreSizeData, a aVar) {
        super(2, g51Var);
        this.b = moreSizeData;
        this.c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new MoreSizeViewHolder$onAttach$1(g51Var, this.b, this.c);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MoreSizeViewHolder$onAttach$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            MoreSizeData moreSizeData = this.b;
            xb5 xb5Var = moreSizeData.c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, moreSizeData, this.c);
            this.a = 1;
            if (d.f(xb5Var, anonymousClass1, this) == coroutineSingletons) {
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
