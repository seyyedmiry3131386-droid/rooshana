package ir.mservices.market.app.bookmark;

import defpackage.dp2;
import defpackage.g51;
import defpackage.js3;
import defpackage.qp2;
import defpackage.rv6;
import defpackage.t95;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vd0;
import ir.mservices.market.viewModel.BaseMultiSelectViewModel;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.bookmark.BookmarkContentFragment$onViewCreated$1$1", f = "BookmarkContentFragment.kt", l = {67}, m = "invokeSuspend", v = 1)
final class BookmarkContentFragment$onViewCreated$1$1 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ BaseMultiSelectViewModel b;
    public final /* synthetic */ BookmarkContentFragment c;

    /* JADX INFO: renamed from: ir.mservices.market.app.bookmark.BookmarkContentFragment$onViewCreated$1$1$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.bookmark.BookmarkContentFragment$onViewCreated$1$1$1", f = "BookmarkContentFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ BookmarkContentFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BookmarkContentFragment bookmarkContentFragment, g51 g51Var) {
            super(2, g51Var);
            this.b = bookmarkContentFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((t95) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            t95 t95Var = (t95) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            vd0 vd0Var = this.b.S0;
            js3.m(vd0Var);
            vd0Var.w.setUserInputEnabled(!t95Var.b);
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BookmarkContentFragment$onViewCreated$1$1(BaseMultiSelectViewModel baseMultiSelectViewModel, BookmarkContentFragment bookmarkContentFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = baseMultiSelectViewModel;
        this.c = bookmarkContentFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new BookmarkContentFragment$onViewCreated$1$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((BookmarkContentFragment$onViewCreated$1$1) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            rv6 rv6Var = this.b.w;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.c, null);
            this.a = 1;
            if (d.f(rv6Var, anonymousClass1, this) == coroutineSingletons) {
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
