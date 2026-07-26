package androidx.room.coroutines;

import defpackage.bt2;
import defpackage.ct2;
import defpackage.e71;
import defpackage.eq;
import defpackage.g51;
import defpackage.gx0;
import defpackage.hx0;
import defpackage.i51;
import defpackage.js3;
import defpackage.qp2;
import defpackage.rx0;
import defpackage.tb1;
import defpackage.tt2;
import defpackage.tx8;
import defpackage.u61;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1", f = "RunBlockingUninterruptible.android.kt", l = {}, m = "invokeSuspend")
final class RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1 extends SuspendLambda implements qp2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ SuspendLambda b;

    /* JADX INFO: renamed from: androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$1, reason: invalid class name */
    @tb1(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$1", f = "RunBlockingUninterruptible.android.kt", l = {52}, m = "invokeSuspend")
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ hx0 c;
        public final /* synthetic */ SuspendLambda d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(hx0 hx0Var, qp2 qp2Var, g51 g51Var) {
            super(2, g51Var);
            this.c = hx0Var;
            this.d = (SuspendLambda) qp2Var;
        }

        /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, qp2] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.c, this.d, g51Var);
            anonymousClass1.b = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, qp2] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            gx0 gx0Var;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                kotlin.b.b(obj);
                e71 e71Var = (e71) this.b;
                hx0 hx0Var = this.c;
                ?? r3 = this.d;
                try {
                    this.b = hx0Var;
                    this.a = 1;
                    obj = r3.invoke(e71Var, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    gx0Var = hx0Var;
                } catch (Throwable th) {
                    th = th;
                    gx0Var = hx0Var;
                    obj = kotlin.b.a(th);
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gx0Var = (gx0) this.b;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    obj = kotlin.b.a(th);
                }
            }
            Throwable thA = Result.a(obj);
            hx0 hx0Var2 = (hx0) gx0Var;
            if (thA == null) {
                hx0Var2.V(obj);
            } else {
                hx0Var2.getClass();
                hx0Var2.V(new rx0(thA, false));
            }
            return tx8.a;
        }
    }

    /* JADX INFO: renamed from: androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$2, reason: invalid class name */
    @tb1(c = "androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1$2", f = "RunBlockingUninterruptible.android.kt", l = {58}, m = "invokeSuspend")
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ hx0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(hx0 hx0Var, g51 g51Var) {
            super(2, g51Var);
            this.b = hx0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass2(this.b, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                return obj;
            }
            kotlin.b.b(obj);
            this.a = 1;
            Object objS = this.b.s(this);
            return objS == coroutineSingletons ? coroutineSingletons : objS;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1(qp2 qp2Var, g51 g51Var) {
        super(2, g51Var);
        this.b = (SuspendLambda) qp2Var;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, qp2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1 runBlockingUninterruptible_androidKt$runBlockingUninterruptible$1 = new RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1(this.b, g51Var);
        runBlockingUninterruptible_androidKt$runBlockingUninterruptible$1.a = obj;
        return runBlockingUninterruptible_androidKt$runBlockingUninterruptible$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, qp2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        u61 u61VarR0 = ((e71) this.a).getCoroutineContext().r0(eq.u);
        js3.m(u61VarR0);
        i51 i51Var = (i51) u61VarR0;
        hx0 hx0VarB = ct2.b();
        bt2.F(tt2.a, i51Var, CoroutineStart.d, new AnonymousClass1(hx0VarB, this.b, null));
        while (!hx0VarB.T()) {
            try {
                return bt2.Q(i51Var, new AnonymousClass2(hx0VarB, null));
            } catch (InterruptedException unused) {
            }
        }
        return hx0VarB.F();
    }
}
