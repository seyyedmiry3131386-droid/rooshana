package ir.mservices.market.vpnService.adGuard.ui;

import defpackage.bc9;
import defpackage.bt2;
import defpackage.e71;
import defpackage.g51;
import defpackage.ja1;
import defpackage.jd7;
import defpackage.js3;
import defpackage.lb9;
import defpackage.li1;
import defpackage.n4;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.r4;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tb9;
import defpackage.tx8;
import defpackage.ub9;
import defpackage.vl8;
import defpackage.vy2;
import defpackage.y97;
import ir.mservices.market.viewModel.a;
import ir.mservices.market.vpnService.adGuard.ui.AdGuardAction;
import java.util.List;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class AdGuardViewModel extends a {
    public final l A;
    public final rv6 B;
    public final l C;
    public final rv6 D;
    public final i E;
    public final pv6 F;
    public final i G;
    public final pv6 H;
    public final l I;
    public final rv6 J;
    public final i K;
    public final pv6 L;
    public final rv6 M;
    public boolean N;
    public boolean O;
    public final ir.mservices.market.vpnService.adGuard.ui.model.a v;
    public final vl8 w;
    public final jd7 x;
    public li1 y;
    public List z;

    /* JADX INFO: renamed from: ir.mservices.market.vpnService.adGuard.ui.AdGuardViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.vpnService.adGuard.ui.AdGuardViewModel$1", f = "AdGuardViewModel.kt", l = {175}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return AdGuardViewModel.this.new AnonymousClass1(g51Var);
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
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
                return tx8Var;
            }
            b.b(obj);
            AdGuardViewModel adGuardViewModel = AdGuardViewModel.this;
            pv6 pv6Var = adGuardViewModel.u;
            r4 r4Var = new r4(2, adGuardViewModel);
            this.a = 1;
            Object objA = pv6Var.a.a(new n4(r4Var, 6), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.vpnService.adGuard.ui.AdGuardViewModel$2, reason: invalid class name */
    @tb1(c = "ir.mservices.market.vpnService.adGuard.ui.AdGuardViewModel$2", f = "AdGuardViewModel.kt", l = {79}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public int a;

        /* JADX INFO: renamed from: ir.mservices.market.vpnService.adGuard.ui.AdGuardViewModel$2$1, reason: invalid class name */
        @tb1(c = "ir.mservices.market.vpnService.adGuard.ui.AdGuardViewModel$2$1", f = "AdGuardViewModel.kt", l = {87, 93}, m = "invokeSuspend", v = 1)
        final class AnonymousClass1 extends SuspendLambda implements qp2 {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ AdGuardViewModel c;

            /* JADX INFO: renamed from: ir.mservices.market.vpnService.adGuard.ui.AdGuardViewModel$2$1$1, reason: invalid class name and collision with other inner class name */
            @tb1(c = "ir.mservices.market.vpnService.adGuard.ui.AdGuardViewModel$2$1$1", f = "AdGuardViewModel.kt", l = {97, 100}, m = "invokeSuspend", v = 1)
            final class C00351 extends SuspendLambda implements qp2 {
                public int a;
                public /* synthetic */ Object b;
                public final /* synthetic */ AdGuardViewModel c;
                public final /* synthetic */ tb9 d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00351(AdGuardViewModel adGuardViewModel, tb9 tb9Var, g51 g51Var) {
                    super(2, g51Var);
                    this.c = adGuardViewModel;
                    this.d = tb9Var;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final g51 create(Object obj, g51 g51Var) {
                    C00351 c00351 = new C00351(this.c, this.d, g51Var);
                    c00351.b = obj;
                    return c00351;
                }

                @Override // defpackage.qp2
                public final Object invoke(Object obj, Object obj2) {
                    return ((C00351) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
                /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
                /* JADX WARN: Removed duplicated region for block: B:19:0x0054 A[RETURN] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0051 -> B:11:0x0020). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                    /*
                        r9 = this;
                        java.lang.Object r0 = r9.b
                        e71 r0 = (defpackage.e71) r0
                        kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
                        int r2 = r9.a
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L1d
                        if (r2 == r4) goto L19
                        if (r2 != r3) goto L11
                        goto L1d
                    L11:
                        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r10.<init>(r0)
                        throw r10
                    L19:
                        kotlin.b.b(r10)
                        goto L47
                    L1d:
                        kotlin.b.b(r10)
                    L20:
                        boolean r10 = defpackage.js3.C(r0)
                        tx8 r2 = defpackage.tx8.a
                        if (r10 == 0) goto L54
                        ir.mservices.market.vpnService.adGuard.ui.AdGuardViewModel r10 = r9.c
                        kotlinx.coroutines.flow.l r5 = r10.C
                        xb9 r6 = new xb9
                        vl8 r10 = r10.w
                        tb9 r7 = r9.d
                        pb9 r7 = (defpackage.pb9) r7
                        long r7 = r7.b
                        java.lang.String r10 = r10.a(r7)
                        r6.<init>(r10)
                        r9.b = r0
                        r9.a = r4
                        r5.emit(r6, r9)
                        if (r2 != r1) goto L47
                        goto L53
                    L47:
                        r9.b = r0
                        r9.a = r3
                        r5 = 1000(0x3e8, double:4.94E-321)
                        java.lang.Object r10 = kotlinx.coroutines.a.e(r5, r9)
                        if (r10 != r1) goto L20
                    L53:
                        return r1
                    L54:
                        return r2
                    */
                    throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.vpnService.adGuard.ui.AdGuardViewModel.AnonymousClass2.AnonymousClass1.C00351.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AdGuardViewModel adGuardViewModel, g51 g51Var) {
                super(2, g51Var);
                this.c = adGuardViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final g51 create(Object obj, g51 g51Var) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.c, g51Var);
                anonymousClass1.b = obj;
                return anonymousClass1;
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass1) create((tb9) obj, (g51) obj2)).invokeSuspend(tx8.a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
            
                if (r4 == r1) goto L28;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                /*
                    r8 = this;
                    java.lang.Object r0 = r8.b
                    tb9 r0 = (defpackage.tb9) r0
                    kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
                    int r2 = r8.a
                    r3 = 2
                    tx8 r4 = defpackage.tx8.a
                    r5 = 1
                    ir.mservices.market.vpnService.adGuard.ui.AdGuardViewModel r6 = r8.c
                    r7 = 0
                    if (r2 == 0) goto L25
                    if (r2 == r5) goto L21
                    if (r2 != r3) goto L19
                    kotlin.b.b(r9)
                    goto L6c
                L19:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L21:
                    kotlin.b.b(r9)
                    return r4
                L25:
                    kotlin.b.b(r9)
                    boolean r9 = r0 instanceof defpackage.pb9
                    r6.N = r9
                    java.lang.String r9 = r0.a()
                    java.lang.String r2 = "AD_GUARD"
                    boolean r9 = defpackage.js3.i(r9, r2)
                    r6.O = r9
                    if (r9 != 0) goto L3b
                    goto L8f
                L3b:
                    boolean r9 = r0 instanceof defpackage.rb9
                    if (r9 == 0) goto L56
                    li1 r9 = r6.y
                    if (r9 == 0) goto L46
                    r9.g(r7)
                L46:
                    r6.y = r7
                    kotlinx.coroutines.flow.l r9 = r6.C
                    r8.b = r7
                    r8.a = r5
                    bc9 r0 = defpackage.bc9.a
                    r9.emit(r0, r8)
                    if (r4 != r1) goto L8f
                    goto L6b
                L56:
                    boolean r9 = r0 instanceof defpackage.qb9
                    if (r9 != 0) goto L8f
                    boolean r9 = r0 instanceof defpackage.pb9
                    if (r9 == 0) goto L84
                    kotlinx.coroutines.flow.l r9 = r6.I
                    java.lang.Boolean r2 = java.lang.Boolean.TRUE
                    r8.b = r0
                    r8.a = r3
                    r9.emit(r2, r8)
                    if (r4 != r1) goto L6c
                L6b:
                    return r1
                L6c:
                    li1 r9 = r6.y
                    if (r9 == 0) goto L73
                    r9.g(r7)
                L73:
                    fu0 r9 = defpackage.y97.G(r6)
                    ir.mservices.market.vpnService.adGuard.ui.AdGuardViewModel$2$1$1 r1 = new ir.mservices.market.vpnService.adGuard.ui.AdGuardViewModel$2$1$1
                    r1.<init>(r6, r0, r7)
                    r0 = 3
                    li1 r9 = defpackage.bt2.G(r9, r7, r7, r1, r0)
                    r6.y = r9
                    return r4
                L84:
                    boolean r9 = r0 instanceof defpackage.sb9
                    if (r9 == 0) goto L89
                    goto L8f
                L89:
                    kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
                    r9.<init>()
                    throw r9
                L8f:
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.vpnService.adGuard.ui.AdGuardViewModel.AnonymousClass2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public AnonymousClass2(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return AdGuardViewModel.this.new AnonymousClass2(g51Var);
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
                b.b(obj);
                AdGuardViewModel adGuardViewModel = AdGuardViewModel.this;
                ((lb9) adGuardViewModel.v.c).getClass();
                rv6 rv6Var = ub9.b;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(adGuardViewModel, null);
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

    /* JADX INFO: renamed from: ir.mservices.market.vpnService.adGuard.ui.AdGuardViewModel$onDisconnectActiveServiceAction$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.vpnService.adGuard.ui.AdGuardViewModel$onDisconnectActiveServiceAction$1", f = "AdGuardViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class C02511 extends SuspendLambda implements qp2 {
        public C02511(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return AdGuardViewModel.this.new C02511(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            C02511 c02511 = (C02511) create((e71) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            c02511.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            AdGuardViewModel.this.v.b(null);
            return tx8.a;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.vpnService.adGuard.ui.AdGuardViewModel$onStartVpnAction$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.vpnService.adGuard.ui.AdGuardViewModel$onStartVpnAction$1", f = "AdGuardViewModel.kt", l = {158, 159, 160, 161}, m = "invokeSuspend", v = 1)
    public static final class C02521 extends SuspendLambda implements qp2 {
        public int a;

        public C02521(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return AdGuardViewModel.this.new C02521(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C02521) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
        
            if (kotlinx.coroutines.a.e(2000, r16) != r1) goto L26;
         */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instruction units count: 314
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.vpnService.adGuard.ui.AdGuardViewModel.C02521.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.vpnService.adGuard.ui.AdGuardViewModel$onVpnToggleAction$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.vpnService.adGuard.ui.AdGuardViewModel$onVpnToggleAction$1", f = "AdGuardViewModel.kt", l = {135, 139, 143}, m = "invokeSuspend", v = 1)
    public static final class C02531 extends SuspendLambda implements qp2 {
        public int a;

        public C02531(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return AdGuardViewModel.this.new C02531(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C02531) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
        
            if (r6 == r0) goto L28;
         */
        /* JADX WARN: Removed duplicated region for block: B:25:0x004a A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
                int r1 = r7.a
                ir.mservices.market.vpnService.adGuard.ui.AdGuardViewModel r2 = ir.mservices.market.vpnService.adGuard.ui.AdGuardViewModel.this
                r3 = 3
                r4 = 2
                r5 = 1
                tx8 r6 = defpackage.tx8.a
                if (r1 == 0) goto L27
                if (r1 == r5) goto L23
                if (r1 == r4) goto L1f
                if (r1 != r3) goto L17
                kotlin.b.b(r8)
                goto L57
            L17:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1f:
                kotlin.b.b(r8)
                return r6
            L23:
                kotlin.b.b(r8)
                return r6
            L27:
                kotlin.b.b(r8)
                boolean r8 = r2.N
                if (r8 != 0) goto L39
                kotlinx.coroutines.flow.i r8 = r2.K
                r7.a = r5
                java.lang.Object r8 = r8.emit(r6, r7)
                if (r8 != r0) goto L4a
                goto L56
            L39:
                boolean r1 = r2.O
                if (r1 != 0) goto L4b
                if (r8 == 0) goto L4b
                kotlinx.coroutines.flow.i r8 = r2.E
                r7.a = r4
                java.lang.Object r8 = r8.emit(r6, r7)
                if (r8 != r0) goto L4a
                goto L56
            L4a:
                return r6
            L4b:
                kotlinx.coroutines.flow.l r8 = r2.C
                r7.a = r3
                bc9 r1 = defpackage.bc9.a
                r8.emit(r1, r7)
                if (r6 != r0) goto L57
            L56:
                return r0
            L57:
                ir.mservices.market.vpnService.adGuard.ui.model.a r8 = r2.v
                java.lang.String r0 = "AD_GUARD"
                r8.b(r0)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.vpnService.adGuard.ui.AdGuardViewModel.C02531.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdGuardViewModel(ir.mservices.market.vpnService.adGuard.ui.model.a aVar, vl8 vl8Var, jd7 jd7Var) {
        super(true);
        js3.p(vl8Var, "timeUtils");
        js3.p(jd7Var, "savedStateHandle");
        this.v = aVar;
        this.w = vl8Var;
        this.x = jd7Var;
        this.z = EmptyList.a;
        l lVarB = ja1.b(null);
        this.A = lVarB;
        this.B = new rv6(lVarB);
        l lVarB2 = ja1.b(bc9.a);
        this.C = lVarB2;
        this.D = new rv6(lVarB2);
        i iVarE = vy2.e(0, 7, null);
        this.E = iVarE;
        this.F = new pv6(iVarE);
        i iVarE2 = vy2.e(0, 7, null);
        this.G = iVarE2;
        this.H = new pv6(iVarE2);
        l lVarB3 = ja1.b(Boolean.TRUE);
        this.I = lVarB3;
        this.J = new rv6(lVarB3);
        i iVarE3 = vy2.e(0, 7, null);
        this.K = iVarE3;
        this.L = new pv6(iVarE3);
        this.M = jd7Var.c(Boolean.FALSE, "stopVpn");
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
        bt2.G(y97.G(this), null, null, new AnonymousClass2(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDisconnectActiveServiceAction(AdGuardAction.DisconnectActiveServiceAction disconnectActiveServiceAction) {
        bt2.G(y97.G(this), null, null, new C02511(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onStartVpnAction(AdGuardAction.StartVpnAction startVpnAction) {
        bt2.G(y97.G(this), null, null, new C02521(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onVpnToggleAction(AdGuardAction.ToggleVpnAction toggleVpnAction) {
        bt2.G(y97.G(this), null, null, new C02531(null), 3);
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        bt2.G(y97.G(this), null, null, new AdGuardViewModel$doRequest$1(this, null), 3);
        bt2.G(y97.G(this), null, null, new AdGuardViewModel$doRequest$2(this, null), 3);
    }
}
