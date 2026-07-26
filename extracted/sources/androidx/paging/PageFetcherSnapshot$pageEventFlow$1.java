package androidx.paging;

import defpackage.bj2;
import defpackage.dp0;
import defpackage.e71;
import defpackage.g51;
import defpackage.gz5;
import defpackage.pw7;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xe2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1", f = "PageFetcherSnapshot.kt", l = {647, 177, 659}, m = "invokeSuspend", v = 1)
final class PageFetcherSnapshot$pageEventFlow$1 extends SuspendLambda implements qp2 {
    public gz5 a;
    public kotlinx.coroutines.sync.a b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ l e;

    /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2, reason: invalid class name */
    @tb1(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2", f = "PageFetcherSnapshot.kt", l = {91}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ l b;
        public final /* synthetic */ pw7 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(l lVar, pw7 pw7Var, g51 g51Var) {
            super(2, g51Var);
            this.b = lVar;
            this.c = pw7Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass2(this.b, this.c, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                kotlin.b.b(obj);
                dp0 dp0VarH = kotlinx.coroutines.flow.d.h(this.b.h);
                c cVar = new c(2, this.c);
                this.a = 1;
                if (dp0VarH.a(cVar, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$3, reason: invalid class name */
    @tb1(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$3", f = "PageFetcherSnapshot.kt", l = {107}, m = "invokeSuspend", v = 1)
    final class AnonymousClass3 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ l b;
        public final /* synthetic */ kotlinx.coroutines.channels.a c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(g51 g51Var, l lVar, kotlinx.coroutines.channels.a aVar) {
            super(2, g51Var);
            this.b = lVar;
            this.c = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass3(g51Var, this.b, this.c);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                kotlin.b.b(obj);
                xe2 xe2Var = this.b.d;
                bj2 bj2Var = new bj2(26, this.c);
                this.a = 1;
                if (xe2Var.a(bj2Var, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4, reason: invalid class name */
    @tb1(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4", f = "PageFetcherSnapshot.kt", l = {111}, m = "invokeSuspend", v = 1)
    final class AnonymousClass4 extends SuspendLambda implements qp2 {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ kotlinx.coroutines.channels.a c;
        public final /* synthetic */ l d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(g51 g51Var, l lVar, kotlinx.coroutines.channels.a aVar) {
            super(2, g51Var);
            this.c = aVar;
            this.d = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(g51Var, this.d, this.c);
            anonymousClass4.b = obj;
            return anonymousClass4;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass4) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                kotlin.b.b(obj);
                e71 e71Var = (e71) this.b;
                dp0 dp0VarH = kotlinx.coroutines.flow.d.h(this.c);
                b bVar = new b(this.d, e71Var, 2);
                this.a = 1;
                if (dp0VarH.a(bVar, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageFetcherSnapshot$pageEventFlow$1(l lVar, g51 g51Var) {
        super(2, g51Var);
        this.e = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        PageFetcherSnapshot$pageEventFlow$1 pageFetcherSnapshot$pageEventFlow$1 = new PageFetcherSnapshot$pageEventFlow$1(this.e, g51Var);
        pageFetcherSnapshot$pageEventFlow$1.d = obj;
        return pageFetcherSnapshot$pageEventFlow$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((PageFetcherSnapshot$pageEventFlow$1) create((pw7) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r8.c
            r2 = 3
            r3 = 2
            r4 = 1
            androidx.paging.l r5 = r8.e
            r6 = 0
            if (r1 == 0) goto L4c
            if (r1 == r4) goto L30
            if (r1 == r3) goto L27
            if (r1 != r2) goto L1f
            kotlinx.coroutines.sync.a r0 = r8.b
            gz5 r1 = r8.a
            java.lang.Object r2 = r8.d
            pw7 r2 = (defpackage.pw7) r2
            kotlin.b.b(r9)
            goto L9d
        L1f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L27:
            java.lang.Object r1 = r8.d
            pw7 r1 = (defpackage.pw7) r1
            kotlin.b.b(r9)
            r9 = r1
            goto L88
        L30:
            kotlinx.coroutines.sync.a r0 = r8.b
            gz5 r0 = (defpackage.gz5) r0
            gz5 r1 = r8.a
            if (r1 != 0) goto L46
            java.lang.Object r1 = r8.d
            pw7 r1 = (defpackage.pw7) r1
            kotlin.b.b(r9)
            hz5 r9 = r0.b     // Catch: java.lang.Throwable -> L45
            r9.a(r6)     // Catch: java.lang.Throwable -> L45
            throw r6
        L45:
            throw r6
        L46:
            java.lang.ClassCastException r9 = new java.lang.ClassCastException
            r9.<init>()
            throw r9
        L4c:
            kotlin.b.b(r9)
            java.lang.Object r9 = r8.d
            pw7 r9 = (defpackage.pw7) r9
            java.util.concurrent.atomic.AtomicBoolean r1 = r5.g
            r7 = 0
            boolean r1 = r1.compareAndSet(r7, r4)
            if (r1 == 0) goto Lb9
            androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2 r1 = new androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2
            r1.<init>(r5, r9, r6)
            defpackage.bt2.G(r9, r6, r6, r1, r2)
            r1 = 6
            kotlinx.coroutines.channels.a r1 = defpackage.dt2.b(r7, r1, r6)
            androidx.paging.PageFetcherSnapshot$pageEventFlow$1$3 r4 = new androidx.paging.PageFetcherSnapshot$pageEventFlow$1$3
            r4.<init>(r6, r5, r1)
            defpackage.bt2.G(r9, r6, r6, r4, r2)
            androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4 r4 = new androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4
            r4.<init>(r6, r5, r1)
            defpackage.bt2.G(r9, r6, r6, r4, r2)
            r8.d = r9
            r8.a = r6
            r8.b = r6
            r8.c = r3
            java.lang.Object r1 = r5.f(r8)
            if (r1 != r0) goto L88
            goto L9a
        L88:
            gz5 r1 = r5.i
            kotlinx.coroutines.sync.a r3 = r1.a
            r8.d = r9
            r8.a = r1
            r8.b = r3
            r8.c = r2
            java.lang.Object r2 = r3.b(r8)
            if (r2 != r0) goto L9b
        L9a:
            return r0
        L9b:
            r2 = r9
            r0 = r3
        L9d:
            hz5 r9 = r1.b     // Catch: java.lang.Throwable -> Lb4
            pa2 r9 = r9.j     // Catch: java.lang.Throwable -> Lb4
            androidx.paging.LoadType r1 = androidx.paging.LoadType.a     // Catch: java.lang.Throwable -> Lb4
            ja4 r9 = r9.p(r1)     // Catch: java.lang.Throwable -> Lb4
            r0.d(r6)
            boolean r9 = r9 instanceof defpackage.ga4
            if (r9 != 0) goto Lb1
            androidx.paging.l.d(r5, r2)
        Lb1:
            tx8 r9 = defpackage.tx8.a
            return r9
        Lb4:
            r9 = move-exception
            r0.d(r6)
            throw r9
        Lb9:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Attempt to collect twice from pageEventFlow, which is an illegal operation. Did you forget to call Flow<PagingData<*>>.cachedIn(coroutineScope)?"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.paging.PageFetcherSnapshot$pageEventFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
