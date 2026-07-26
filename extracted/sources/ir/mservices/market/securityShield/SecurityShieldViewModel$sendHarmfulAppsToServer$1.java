package ir.mservices.market.securityShield;

import defpackage.bt2;
import defpackage.e71;
import defpackage.g51;
import defpackage.kf1;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ug1;
import defpackage.up1;
import defpackage.y97;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.securityShield.SecurityShieldViewModel$sendHarmfulAppsToServer$1", f = "SecurityShieldViewModel.kt", l = {410}, m = "invokeSuspend", v = 1)
final class SecurityShieldViewModel$sendHarmfulAppsToServer$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ SecurityShieldViewModel b;
    public final /* synthetic */ List c;

    /* JADX INFO: renamed from: ir.mservices.market.securityShield.SecurityShieldViewModel$sendHarmfulAppsToServer$1$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.securityShield.SecurityShieldViewModel$sendHarmfulAppsToServer$1$1", f = "SecurityShieldViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public final /* synthetic */ SecurityShieldViewModel a;
        public final /* synthetic */ List b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(g51 g51Var, SecurityShieldViewModel securityShieldViewModel, List list) {
            super(2, g51Var);
            this.a = securityShieldViewModel;
            this.b = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass1(g51Var, this.a, this.b);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x007b  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
                kotlin.b.b(r13)
                ir.mservices.market.securityShield.SecurityShieldViewModel r13 = r12.a
                java.util.List r0 = r13.G
                r1 = 0
                if (r0 == 0) goto L95
                java.util.ArrayList r2 = new java.util.ArrayList
                r3 = 10
                int r3 = defpackage.wu0.V(r0, r3)
                r2.<init>(r3)
                java.util.Iterator r0 = r0.iterator()
            L1b:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L94
                java.lang.Object r3 = r0.next()
                rp3 r3 = (defpackage.rp3) r3
                r4 = 0
                java.util.List r5 = r12.b
                if (r5 == 0) goto L4e
                boolean r6 = r5.isEmpty()
                if (r6 == 0) goto L33
                goto L4e
            L33:
                java.util.Iterator r6 = r5.iterator()
            L37:
                boolean r7 = r6.hasNext()
                if (r7 == 0) goto L4e
                java.lang.Object r7 = r6.next()
                com.google.android.gms.safetynet.HarmfulAppsData r7 = (com.google.android.gms.safetynet.HarmfulAppsData) r7
                java.lang.String r7 = r7.a
                java.lang.String r8 = r3.a
                boolean r7 = defpackage.js3.i(r7, r8)
                if (r7 == 0) goto L37
                r4 = 1
            L4e:
                r11 = r4
                if (r5 == 0) goto L7b
                java.util.Iterator r4 = r5.iterator()
            L55:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L6d
                java.lang.Object r5 = r4.next()
                r6 = r5
                com.google.android.gms.safetynet.HarmfulAppsData r6 = (com.google.android.gms.safetynet.HarmfulAppsData) r6
                java.lang.String r6 = r6.a
                java.lang.String r7 = r3.a
                boolean r6 = defpackage.js3.i(r6, r7)
                if (r6 == 0) goto L55
                goto L6e
            L6d:
                r5 = r1
            L6e:
                com.google.android.gms.safetynet.HarmfulAppsData r5 = (com.google.android.gms.safetynet.HarmfulAppsData) r5
                if (r5 == 0) goto L7b
                int r4 = r5.c
                java.lang.Integer r5 = new java.lang.Integer
                r5.<init>(r4)
                r9 = r5
                goto L7c
            L7b:
                r9 = r1
            L7c:
                ir.mservices.market.version2.webapi.requestdto.ShieldAppDTO r6 = new ir.mservices.market.version2.webapi.requestdto.ShieldAppDTO
                java.lang.String r7 = r3.a
                int r8 = r3.b
                dp3 r3 = r13.v
                java.lang.String r10 = r3.q(r7)
                java.lang.String r3 = "getCertificateSHA1Fingerprint(...)"
                defpackage.js3.o(r10, r3)
                r6.<init>(r7, r8, r9, r10, r11)
                r2.add(r6)
                goto L1b
            L94:
                return r2
            L95:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.securityShield.SecurityShieldViewModel$sendHarmfulAppsToServer$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityShieldViewModel$sendHarmfulAppsToServer$1(g51 g51Var, SecurityShieldViewModel securityShieldViewModel, List list) {
        super(2, g51Var);
        this.b = securityShieldViewModel;
        this.c = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new SecurityShieldViewModel$sendHarmfulAppsToServer$1(g51Var, this.b, this.c);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((SecurityShieldViewModel$sendHarmfulAppsToServer$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        ProcessState processState;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        SecurityShieldViewModel securityShieldViewModel = this.b;
        if (i == 0) {
            kotlin.b.b(obj);
            if (securityShieldViewModel.G == null || !(!r7.isEmpty())) {
                securityShieldViewModel.H = ProcessState.d;
                securityShieldViewModel.w();
                return tx8.a;
            }
            ug1 ug1Var = up1.a;
            kf1 kf1Var = kf1.c;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, securityShieldViewModel, this.c);
            this.a = 1;
            obj = bt2.Z(kf1Var, anonymousClass1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        List list = (List) obj;
        if (list == null || !(!list.isEmpty())) {
            processState = ProcessState.d;
        } else {
            bt2.G(y97.G(securityShieldViewModel), null, null, new SecurityShieldViewModel$scanUserApps$1(null, securityShieldViewModel, list), 3);
            processState = ProcessState.b;
        }
        securityShieldViewModel.H = processState;
        securityShieldViewModel.w();
        return tx8.a;
    }
}
