package ir.myket.player.ui.client.ad.components;

import defpackage.az1;
import defpackage.bt2;
import defpackage.dp2;
import defpackage.e71;
import defpackage.g51;
import defpackage.lt8;
import defpackage.n08;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.y97;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.ui.client.ad.components.AdEndCardTimerKt$AdEndCardTimer$2$1", f = "AdEndCardTimer.kt", l = {}, m = "invokeSuspend", v = 1)
final class AdEndCardTimerKt$AdEndCardTimer$2$1 extends SuspendLambda implements qp2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ androidx.compose.animation.core.a b;
    public final /* synthetic */ int c;
    public final /* synthetic */ dp2 d;
    public final /* synthetic */ n08 e;

    /* JADX INFO: renamed from: ir.myket.player.ui.client.ad.components.AdEndCardTimerKt$AdEndCardTimer$2$1$1, reason: invalid class name */
    @tb1(c = "ir.myket.player.ui.client.ad.components.AdEndCardTimerKt$AdEndCardTimer$2$1$1", f = "AdEndCardTimer.kt", l = {54}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ androidx.compose.animation.core.a b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(androidx.compose.animation.core.a aVar, int i, g51 g51Var) {
            super(2, g51Var);
            this.b = aVar;
            this.c = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass1(this.b, this.c, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                b.b(obj);
                Float f = new Float(1.0f);
                lt8 lt8VarE0 = y97.e0(this.c * 1000, 0, az1.c, 2);
                this.a = 1;
                if (androidx.compose.animation.core.a.b(this.b, f, lt8VarE0, null, null, this, 12) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: ir.myket.player.ui.client.ad.components.AdEndCardTimerKt$AdEndCardTimer$2$1$2, reason: invalid class name */
    @tb1(c = "ir.myket.player.ui.client.ad.components.AdEndCardTimerKt$AdEndCardTimer$2$1$2", f = "AdEndCardTimer.kt", l = {64}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ dp2 b;
        public final /* synthetic */ n08 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(dp2 dp2Var, n08 n08Var, g51 g51Var) {
            super(2, g51Var);
            this.b = dp2Var;
            this.c = n08Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass2(this.b, this.c, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0028 -> B:14:0x002b). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
                int r1 = r6.a
                r2 = 1
                n08 r3 = r6.c
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.b.b(r7)
                goto L2b
            Lf:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L17:
                kotlin.b.b(r7)
            L1a:
                int r7 = r3.h()
                if (r7 <= 0) goto L35
                r6.a = r2
                r4 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r7 = kotlinx.coroutines.a.e(r4, r6)
                if (r7 != r0) goto L2b
                return r0
            L2b:
                int r7 = r3.h()
                int r7 = r7 + (-1)
                r3.i(r7)
                goto L1a
            L35:
                dp2 r7 = r6.b
                j9 r0 = defpackage.j9.a
                r7.invoke(r0)
                tx8 r7 = defpackage.tx8.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: ir.myket.player.ui.client.ad.components.AdEndCardTimerKt$AdEndCardTimer$2$1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdEndCardTimerKt$AdEndCardTimer$2$1(androidx.compose.animation.core.a aVar, int i, dp2 dp2Var, n08 n08Var, g51 g51Var) {
        super(2, g51Var);
        this.b = aVar;
        this.c = i;
        this.d = dp2Var;
        this.e = n08Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        AdEndCardTimerKt$AdEndCardTimer$2$1 adEndCardTimerKt$AdEndCardTimer$2$1 = new AdEndCardTimerKt$AdEndCardTimer$2$1(this.b, this.c, this.d, this.e, g51Var);
        adEndCardTimerKt$AdEndCardTimer$2$1.a = obj;
        return adEndCardTimerKt$AdEndCardTimer$2$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        AdEndCardTimerKt$AdEndCardTimer$2$1 adEndCardTimerKt$AdEndCardTimer$2$1 = (AdEndCardTimerKt$AdEndCardTimer$2$1) create((e71) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        adEndCardTimerKt$AdEndCardTimer$2$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        e71 e71Var = (e71) this.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        bt2.G(e71Var, null, null, new AnonymousClass1(this.b, this.c, null), 3);
        bt2.G(e71Var, null, null, new AnonymousClass2(this.d, this.e, null), 3);
        return tx8.a;
    }
}
