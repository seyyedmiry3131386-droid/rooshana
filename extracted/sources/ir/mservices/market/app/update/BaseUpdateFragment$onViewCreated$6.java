package ir.mservices.market.app.update;

import defpackage.e71;
import defpackage.g51;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.update.BaseUpdateFragment$onViewCreated$6", f = "UpdateFragment.kt", l = {340}, m = "invokeSuspend", v = 1)
final class BaseUpdateFragment$onViewCreated$6 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ BaseUpdateFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.app.update.BaseUpdateFragment$onViewCreated$6$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.update.BaseUpdateFragment$onViewCreated$6$1", f = "UpdateFragment.kt", l = {342, 343}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public BaseUpdateFragment a;
        public int b;
        public int c;
        public /* synthetic */ Object d;
        public final /* synthetic */ BaseUpdateFragment e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BaseUpdateFragment baseUpdateFragment, g51 g51Var) {
            super(2, g51Var);
            this.e = baseUpdateFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.e, g51Var);
            anonymousClass1.d = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((List) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
        
            if (kotlinx.coroutines.a.e(50, r8) == r1) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = r8.d
                java.util.List r0 = (java.util.List) r0
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
                int r2 = r8.c
                r3 = 0
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L2a
                if (r2 == r5) goto L20
                if (r2 != r4) goto L18
                ir.mservices.market.app.update.BaseUpdateFragment r0 = r8.a
                kotlin.b.b(r9)
                goto L5b
            L18:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L20:
                int r0 = r8.b
                ir.mservices.market.app.update.BaseUpdateFragment r2 = r8.a
                kotlin.b.b(r9)
                r9 = r0
                r0 = r2
                goto L4a
            L2a:
                kotlin.b.b(r9)
                ir.mservices.market.app.update.BaseUpdateFragment r9 = r8.e
                androidx.fragment.app.FragmentActivity r2 = r9.F()
                if (r2 == 0) goto L7e
                ir.mservices.market.version2.manager.a r7 = r9.n1
                if (r7 == 0) goto L78
                r8.d = r6
                r8.a = r9
                r8.b = r3
                r8.c = r5
                java.lang.Object r0 = r7.a(r2, r0, r8)
                if (r0 != r1) goto L48
                goto L5a
            L48:
                r0 = r9
                r9 = r3
            L4a:
                r8.d = r6
                r8.a = r0
                r8.b = r9
                r8.c = r4
                r6 = 50
                java.lang.Object r9 = kotlinx.coroutines.a.e(r6, r8)
                if (r9 != r1) goto L5b
            L5a:
                return r1
            L5b:
                am2 r9 = r0.J0
                androidx.fragment.app.d r9 = r9.g()
                boolean r9 = r9 instanceof ir.mservices.market.version2.fragments.dialog.ProgressDialogFragment
                if (r9 == 0) goto L6a
                am2 r9 = r0.J0
                r9.q()
            L6a:
                ir.mservices.market.app.update.UpdateViewModel r9 = r0.T1()
                r50[] r0 = new defpackage.r50[r5]
                ir.mservices.market.app.update.UpdateAction$FinishedUpdateAction r1 = ir.mservices.market.app.update.UpdateAction.FinishedUpdateAction.INSTANCE
                r0[r3] = r1
                r9.r(r0)
                goto L7e
            L78:
                java.lang.String r9 = "appManager"
                defpackage.js3.V(r9)
                throw r6
            L7e:
                tx8 r9 = defpackage.tx8.a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.app.update.BaseUpdateFragment$onViewCreated$6.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseUpdateFragment$onViewCreated$6(BaseUpdateFragment baseUpdateFragment, g51 g51Var) {
        super(2, g51Var);
        this.b = baseUpdateFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new BaseUpdateFragment$onViewCreated$6(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseUpdateFragment$onViewCreated$6) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            BaseUpdateFragment baseUpdateFragment = this.b;
            pv6 pv6Var = baseUpdateFragment.T1().U;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(baseUpdateFragment, null);
            this.a = 1;
            if (d.f(pv6Var, anonymousClass1, this) == coroutineSingletons) {
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
