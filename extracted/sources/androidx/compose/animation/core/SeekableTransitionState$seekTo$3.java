package androidx.compose.animation.core;

import defpackage.bt2;
import defpackage.dp2;
import defpackage.e71;
import defpackage.g51;
import defpackage.jr8;
import defpackage.js3;
import defpackage.qp2;
import defpackage.s08;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3", f = "Transition.kt", l = {489}, m = "invokeSuspend", v = 1)
final class SeekableTransitionState$seekTo$3 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ e d;
    public final /* synthetic */ jr8 e;
    public final /* synthetic */ float f;

    /* JADX INFO: renamed from: androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1, reason: invalid class name */
    @tb1(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1", f = "Transition.kt", l = {511}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ Object c;
        public final /* synthetic */ Object d;
        public final /* synthetic */ e e;
        public final /* synthetic */ jr8 f;
        public final /* synthetic */ float g;

        /* JADX INFO: renamed from: androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1$1, reason: invalid class name and collision with other inner class name */
        @tb1(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1$1", f = "Transition.kt", l = {507}, m = "invokeSuspend", v = 1)
        final class C00001 extends SuspendLambda implements qp2 {
            public int a;
            public final /* synthetic */ e b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00001(e eVar, g51 g51Var) {
                super(2, g51Var);
                this.b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final g51 create(Object obj, g51 g51Var) {
                return new C00001(this.b, g51Var);
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                return ((C00001) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                int i = this.a;
                if (i == 0) {
                    kotlin.b.b(obj);
                    this.a = 1;
                    if (e.D(this.b, this) == coroutineSingletons) {
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
        public AnonymousClass1(Object obj, Object obj2, e eVar, jr8 jr8Var, float f, g51 g51Var) {
            super(2, g51Var);
            this.c = obj;
            this.d = obj2;
            this.e = eVar;
            this.f = jr8Var;
            this.g = f;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.c, this.d, this.e, this.f, this.g, g51Var);
            anonymousClass1.b = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            tx8 tx8Var = tx8.a;
            e eVar = this.e;
            if (i == 0) {
                kotlin.b.b(obj);
                e71 e71Var = (e71) this.b;
                Object obj2 = this.c;
                Object obj3 = this.d;
                if (js3.i(obj2, obj3)) {
                    eVar.o = null;
                    if (js3.i(((s08) eVar.d).getValue(), obj2)) {
                        return tx8Var;
                    }
                } else {
                    e.C(eVar);
                }
                boolean zI = js3.i(obj2, obj3);
                float f = this.g;
                if (!zI) {
                    jr8 jr8Var = this.f;
                    jr8Var.q(obj2);
                    jr8Var.o(0L);
                    ((s08) eVar.c).setValue(obj2);
                    jr8Var.k(f);
                }
                eVar.N(f);
                if (eVar.n.e()) {
                    bt2.G(e71Var, null, null, new C00001(eVar, null), 3);
                } else {
                    eVar.m = Long.MIN_VALUE;
                }
                this.a = 1;
                if (e.F(eVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            eVar.M();
            return tx8Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeekableTransitionState$seekTo$3(Object obj, Object obj2, e eVar, jr8 jr8Var, float f, g51 g51Var) {
        super(1, g51Var);
        this.b = obj;
        this.c = obj2;
        this.d = eVar;
        this.e = jr8Var;
        this.f = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new SeekableTransitionState$seekTo$3(this.b, this.c, this.d, this.e, this.f, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((SeekableTransitionState$seekTo$3) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, this.c, this.d, this.e, this.f, null);
            this.a = 1;
            if (js3.v(anonymousClass1, this) == coroutineSingletons) {
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
