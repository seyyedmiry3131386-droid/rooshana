package ir.mservices.market.app.update.recycler;

import android.view.View;
import defpackage.e71;
import defpackage.g51;
import defpackage.js3;
import defpackage.lw8;
import defpackage.qp2;
import defpackage.rs6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.v48;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.update.recycler.UpdateHeaderViewHolder$onAttach$1", f = "UpdateHeader.kt", l = {113}, m = "invokeSuspend", v = 1)
final class UpdateHeaderViewHolder$onAttach$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ UpdateHeaderData b;
    public final /* synthetic */ b c;

    /* JADX INFO: renamed from: ir.mservices.market.app.update.recycler.UpdateHeaderViewHolder$onAttach$1$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.update.recycler.UpdateHeaderViewHolder$onAttach$1$1", f = "UpdateHeader.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ int a;
        public final /* synthetic */ b b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b bVar, g51 g51Var) {
            super(2, g51Var);
            this.b = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
            anonymousClass1.a = ((Number) obj).intValue();
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create(Integer.valueOf(((Number) obj).intValue()), (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            kotlin.b.b(obj);
            b bVar = this.b;
            View view = bVar.a;
            lw8 lw8Var = bVar.x;
            if (lw8Var == null) {
                js3.V("uiUtils");
                throw null;
            }
            String string = i > 0 ? view.getResources().getString(rs6.update_all_header_title, lw8.e(lw8Var, String.valueOf(i))) : view.getResources().getString(rs6.update_all_default_desc);
            js3.m(string);
            bVar.x().v.setText(string);
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateHeaderViewHolder$onAttach$1(UpdateHeaderData updateHeaderData, b bVar, g51 g51Var) {
        super(2, g51Var);
        this.b = updateHeaderData;
        this.c = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new UpdateHeaderViewHolder$onAttach$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((UpdateHeaderViewHolder$onAttach$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
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
