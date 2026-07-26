package androidx.compose.animation.core;

import defpackage.dp2;
import defpackage.e71;
import defpackage.g51;
import defpackage.jr8;
import defpackage.js3;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.compose.animation.core.SeekableTransitionState$animateTo$2", f = "Transition.kt", l = {600}, m = "invokeSuspend", v = 1)
final class SeekableTransitionState$animateTo$2 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ jr8 b;
    public final /* synthetic */ e c;
    public final /* synthetic */ Object d;

    /* JADX INFO: renamed from: androidx.compose.animation.core.SeekableTransitionState$animateTo$2$1, reason: invalid class name */
    @tb1(c = "androidx.compose.animation.core.SeekableTransitionState$animateTo$2$1", f = "Transition.kt", l = {2174, 613, 615, 669, 671}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public kotlinx.coroutines.sync.a a;
        public e b;
        public int c;
        public final /* synthetic */ e d;
        public final /* synthetic */ Object e;
        public final /* synthetic */ jr8 f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(g51 g51Var, jr8 jr8Var, e eVar, Object obj) {
            super(2, g51Var);
            this.d = eVar;
            this.e = obj;
            this.f = jr8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass1(g51Var, this.f, this.d, this.e);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00b8  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00c2  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0186  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            /*
                Method dump skipped, instruction units count: 401
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.SeekableTransitionState$animateTo$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeekableTransitionState$animateTo$2(g51 g51Var, jr8 jr8Var, e eVar, Object obj) {
        super(1, g51Var);
        this.b = jr8Var;
        this.c = eVar;
        this.d = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new SeekableTransitionState$animateTo$2(g51Var, this.b, this.c, this.d);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((SeekableTransitionState$animateTo$2) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        jr8 jr8Var = this.b;
        if (i == 0) {
            kotlin.b.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, jr8Var, this.c, this.d);
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
        jr8Var.j();
        return tx8.a;
    }
}
