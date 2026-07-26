package androidx.paging.compose;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$1$1", f = "LazyPagingItems.kt", l = {194, 196}, m = "invokeSuspend", v = 1)
final class LazyPagingItemsKt$collectAsLazyPagingItems$1$1 extends SuspendLambda implements qp2 {

    /* JADX INFO: renamed from: androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$1$1$1, reason: invalid class name */
    @tb1(c = "androidx.paging.compose.LazyPagingItemsKt$collectAsLazyPagingItems$1$1$1", f = "LazyPagingItems.kt", l = {196}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass1(2, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((e71) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                b.b(obj);
                this.a = 1;
                throw null;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
            return tx8.a;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        throw null;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        throw null;
    }
}
