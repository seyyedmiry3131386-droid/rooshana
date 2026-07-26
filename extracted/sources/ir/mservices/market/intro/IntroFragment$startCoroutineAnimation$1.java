package ir.mservices.market.intro;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.intro.IntroFragment$startCoroutineAnimation$1", f = "IntroFragment.kt", l = {143}, m = "invokeSuspend", v = 1)
final class IntroFragment$startCoroutineAnimation$1 extends SuspendLambda implements qp2 {
    public long a;
    public int b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ IntroFragment e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntroFragment$startCoroutineAnimation$1(IntroFragment introFragment, g51 g51Var) {
        super(2, g51Var);
        this.e = introFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        IntroFragment$startCoroutineAnimation$1 introFragment$startCoroutineAnimation$1 = new IntroFragment$startCoroutineAnimation$1(this.e, g51Var);
        introFragment$startCoroutineAnimation$1.d = obj;
        return introFragment$startCoroutineAnimation$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((IntroFragment$startCoroutineAnimation$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0045 -> B:17:0x0048). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.d
            e71 r0 = (defpackage.e71) r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r8.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L1e
            if (r2 != r4) goto L16
            int r2 = r8.b
            long r5 = r8.a
            kotlin.b.b(r9)
            goto L48
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            kotlin.b.b(r9)
            r5 = 60
            r2 = r3
        L24:
            r9 = 101(0x65, float:1.42E-43)
            ir.mservices.market.intro.IntroFragment r7 = r8.e
            if (r2 >= r9) goto L4a
            boolean r9 = defpackage.js3.C(r0)
            if (r9 == 0) goto L39
            int r9 = ir.mservices.market.intro.IntroFragment.Z0
            int r9 = r7.k1()
            r7.n1(r9, r2)
        L39:
            r8.d = r0
            r8.a = r5
            r8.b = r2
            r8.c = r4
            java.lang.Object r9 = kotlinx.coroutines.a.e(r5, r8)
            if (r9 != r1) goto L48
            return r1
        L48:
            int r2 = r2 + r4
            goto L24
        L4a:
            int r9 = ir.mservices.market.intro.IntroFragment.Z0
            ir.mservices.market.intro.IntroViewModel r9 = r7.l1()
            r50[] r0 = new defpackage.r50[r4]
            ir.mservices.market.intro.IntroAction$NextStep r1 = ir.mservices.market.intro.IntroAction.NextStep.INSTANCE
            r0[r3] = r1
            r9.r(r0)
            ir.mservices.market.core.analytics.ClickEventBuilder r9 = new ir.mservices.market.core.analytics.ClickEventBuilder
            r9.<init>()
            int r0 = r7.k1()
            int r0 = r0 + r4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "intro_next_p"
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r9.b(r0)
            r9.a()
            tx8 r9 = defpackage.tx8.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.intro.IntroFragment$startCoroutineAnimation$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
