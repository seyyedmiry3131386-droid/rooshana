package ir.mservices.market.vpnService.cheetah.ui;

import defpackage.ac9;
import defpackage.bt2;
import defpackage.e71;
import defpackage.g51;
import defpackage.ja1;
import defpackage.jd7;
import defpackage.js3;
import defpackage.kb9;
import defpackage.lb9;
import defpackage.li1;
import defpackage.lw8;
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
import defpackage.vp7;
import defpackage.vy2;
import defpackage.y97;
import ir.mservices.market.viewModel.a;
import ir.mservices.market.vpnService.cheetah.ui.CheetahAction;
import java.util.ArrayList;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class CheetahViewModel extends a {
    public final ArrayList A;
    public final ArrayList B;
    public final l C;
    public final rv6 D;
    public final l E;
    public final rv6 F;
    public final i G;
    public final pv6 H;
    public final i I;
    public final pv6 J;
    public final l K;
    public final rv6 L;
    public final i M;
    public final pv6 N;
    public final i O;
    public final pv6 P;
    public final rv6 Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public final boolean U;
    public final vp7 v;
    public final vl8 w;
    public final lw8 x;
    public final jd7 y;
    public li1 z;

    /* JADX INFO: renamed from: ir.mservices.market.vpnService.cheetah.ui.CheetahViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.vpnService.cheetah.ui.CheetahViewModel$1", f = "CheetahViewModel.kt", l = {227}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return CheetahViewModel.this.new AnonymousClass1(g51Var);
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
            CheetahViewModel cheetahViewModel = CheetahViewModel.this;
            pv6 pv6Var = cheetahViewModel.u;
            r4 r4Var = new r4(17, cheetahViewModel);
            this.a = 1;
            Object objA = pv6Var.a.a(new n4(r4Var, 21), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.vpnService.cheetah.ui.CheetahViewModel$2, reason: invalid class name */
    @tb1(c = "ir.mservices.market.vpnService.cheetah.ui.CheetahViewModel$2", f = "CheetahViewModel.kt", l = {91}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public int a;

        /* JADX INFO: renamed from: ir.mservices.market.vpnService.cheetah.ui.CheetahViewModel$2$1, reason: invalid class name */
        @tb1(c = "ir.mservices.market.vpnService.cheetah.ui.CheetahViewModel$2$1", f = "CheetahViewModel.kt", l = {99, 105}, m = "invokeSuspend", v = 1)
        final class AnonymousClass1 extends SuspendLambda implements qp2 {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ CheetahViewModel c;

            /* JADX INFO: renamed from: ir.mservices.market.vpnService.cheetah.ui.CheetahViewModel$2$1$1, reason: invalid class name and collision with other inner class name */
            @tb1(c = "ir.mservices.market.vpnService.cheetah.ui.CheetahViewModel$2$1$1", f = "CheetahViewModel.kt", l = {115, 119, 125}, m = "invokeSuspend", v = 1)
            final class C00361 extends SuspendLambda implements qp2 {
                public String a;
                public int b;
                public int c;
                public /* synthetic */ Object d;
                public final /* synthetic */ CheetahViewModel e;
                public final /* synthetic */ tb9 f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00361(CheetahViewModel cheetahViewModel, tb9 tb9Var, g51 g51Var) {
                    super(2, g51Var);
                    this.e = cheetahViewModel;
                    this.f = tb9Var;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final g51 create(Object obj, g51 g51Var) {
                    C00361 c00361 = new C00361(this.e, this.f, g51Var);
                    c00361.d = obj;
                    return c00361;
                }

                @Override // defpackage.qp2
                public final Object invoke(Object obj, Object obj2) {
                    return ((C00361) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:27:0x0091, code lost:
                
                    if (r12.emit(r6, r16) == r2) goto L36;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:35:0x00cd, code lost:
                
                    if (kotlinx.coroutines.a.e(1000, r16) != r2) goto L37;
                 */
                /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x00be A[PHI: r3
                  0x00be: PHI (r3v4 int) = (r3v5 int), (r3v11 int) binds: [B:32:0x00bb, B:10:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:38:0x00d4 A[RETURN] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00cd -> B:37:0x00d0). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r17) {
                    /*
                        Method dump skipped, instruction units count: 213
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.vpnService.cheetah.ui.CheetahViewModel.AnonymousClass2.AnonymousClass1.C00361.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(CheetahViewModel cheetahViewModel, g51 g51Var) {
                super(2, g51Var);
                this.c = cheetahViewModel;
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
                    ir.mservices.market.vpnService.cheetah.ui.CheetahViewModel r6 = r8.c
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
                    r6.S = r9
                    java.lang.String r9 = r0.a()
                    java.lang.String r2 = "CHEETAH"
                    boolean r9 = defpackage.js3.i(r9, r2)
                    r6.T = r9
                    if (r9 != 0) goto L3b
                    goto L8f
                L3b:
                    boolean r9 = r0 instanceof defpackage.rb9
                    if (r9 == 0) goto L56
                    li1 r9 = r6.z
                    if (r9 == 0) goto L46
                    r9.g(r7)
                L46:
                    r6.z = r7
                    kotlinx.coroutines.flow.l r9 = r6.E
                    r8.b = r7
                    r8.a = r5
                    ac9 r0 = defpackage.ac9.a
                    r9.emit(r0, r8)
                    if (r4 != r1) goto L8f
                    goto L6b
                L56:
                    boolean r9 = r0 instanceof defpackage.qb9
                    if (r9 != 0) goto L8f
                    boolean r9 = r0 instanceof defpackage.pb9
                    if (r9 == 0) goto L84
                    kotlinx.coroutines.flow.l r9 = r6.K
                    java.lang.Boolean r2 = java.lang.Boolean.TRUE
                    r8.b = r0
                    r8.a = r3
                    r9.emit(r2, r8)
                    if (r4 != r1) goto L6c
                L6b:
                    return r1
                L6c:
                    li1 r9 = r6.z
                    if (r9 == 0) goto L73
                    r9.g(r7)
                L73:
                    fu0 r9 = defpackage.y97.G(r6)
                    ir.mservices.market.vpnService.cheetah.ui.CheetahViewModel$2$1$1 r1 = new ir.mservices.market.vpnService.cheetah.ui.CheetahViewModel$2$1$1
                    r1.<init>(r6, r0, r7)
                    r0 = 3
                    li1 r9 = defpackage.bt2.G(r9, r7, r7, r1, r0)
                    r6.z = r9
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
                throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.vpnService.cheetah.ui.CheetahViewModel.AnonymousClass2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public AnonymousClass2(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return CheetahViewModel.this.new AnonymousClass2(g51Var);
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
                CheetahViewModel cheetahViewModel = CheetahViewModel.this;
                ((lb9) ((kb9) cheetahViewModel.v.d)).getClass();
                rv6 rv6Var = ub9.b;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(cheetahViewModel, null);
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

    /* JADX INFO: renamed from: ir.mservices.market.vpnService.cheetah.ui.CheetahViewModel$onAppStatusClickAction$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.vpnService.cheetah.ui.CheetahViewModel$onAppStatusClickAction$1", f = "CheetahViewModel.kt", l = {203}, m = "invokeSuspend", v = 1)
    public static final class C02541 extends SuspendLambda implements qp2 {
        public int a;

        public C02541(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return CheetahViewModel.this.new C02541(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C02541) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            li1 li1Var;
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
            CheetahViewModel cheetahViewModel = CheetahViewModel.this;
            if (cheetahViewModel.S && cheetahViewModel.T) {
                if (cheetahViewModel.R && (li1Var = cheetahViewModel.z) != null && li1Var.b()) {
                    cheetahViewModel.R = false;
                }
                i iVar = cheetahViewModel.O;
                this.a = 1;
                if (iVar.emit(tx8Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return tx8Var;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.vpnService.cheetah.ui.CheetahViewModel$onDisconnectServiceAction$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.vpnService.cheetah.ui.CheetahViewModel$onDisconnectServiceAction$1", f = "CheetahViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class C02551 extends SuspendLambda implements qp2 {
        public C02551(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return CheetahViewModel.this.new C02551(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            C02551 c02551 = (C02551) create((e71) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            c02551.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            vp7 vp7Var = CheetahViewModel.this.v;
            ((lb9) ((kb9) vp7Var.d)).getClass();
            vp7Var.A0(((tb9) ub9.b.a.getValue()).a());
            return tx8.a;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.vpnService.cheetah.ui.CheetahViewModel$onShouldLaunchAppAction$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.vpnService.cheetah.ui.CheetahViewModel$onShouldLaunchAppAction$1", f = "CheetahViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class C02561 extends SuspendLambda implements qp2 {
        public C02561(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return CheetahViewModel.this.new C02561(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            C02561 c02561 = (C02561) create((e71) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            c02561.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            CheetahViewModel.this.R = true;
            return tx8.a;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.vpnService.cheetah.ui.CheetahViewModel$onStartVpnAction$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.vpnService.cheetah.ui.CheetahViewModel$onStartVpnAction$1", f = "CheetahViewModel.kt", l = {189, 190, 191, 192}, m = "invokeSuspend", v = 1)
    public static final class C02571 extends SuspendLambda implements qp2 {
        public int a;

        public C02571(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return CheetahViewModel.this.new C02571(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C02571) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
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
                Method dump skipped, instruction units count: 333
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.vpnService.cheetah.ui.CheetahViewModel.C02571.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.vpnService.cheetah.ui.CheetahViewModel$onVpnToggleAction$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.vpnService.cheetah.ui.CheetahViewModel$onVpnToggleAction$1", f = "CheetahViewModel.kt", l = {166, 170, 174}, m = "invokeSuspend", v = 1)
    public static final class C02581 extends SuspendLambda implements qp2 {
        public int a;

        public C02581(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return CheetahViewModel.this.new C02581(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C02581) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0057, code lost:
        
            if (r6 == r0) goto L28;
         */
        /* JADX WARN: Removed duplicated region for block: B:25:0x004d A[RETURN] */
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
                ir.mservices.market.vpnService.cheetah.ui.CheetahViewModel r2 = ir.mservices.market.vpnService.cheetah.ui.CheetahViewModel.this
                r3 = 3
                r4 = 2
                r5 = 1
                tx8 r6 = defpackage.tx8.a
                if (r1 == 0) goto L27
                if (r1 == r5) goto L23
                if (r1 == r4) goto L1f
                if (r1 != r3) goto L17
                kotlin.b.b(r8)
                goto L5a
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
                boolean r8 = r2.S
                if (r8 != 0) goto L3c
                r8 = 0
                r2.R = r8
                kotlinx.coroutines.flow.i r8 = r2.M
                r7.a = r5
                java.lang.Object r8 = r8.emit(r6, r7)
                if (r8 != r0) goto L4d
                goto L59
            L3c:
                boolean r1 = r2.T
                if (r1 != 0) goto L4e
                if (r8 == 0) goto L4e
                kotlinx.coroutines.flow.i r8 = r2.G
                r7.a = r4
                java.lang.Object r8 = r8.emit(r6, r7)
                if (r8 != r0) goto L4d
                goto L59
            L4d:
                return r6
            L4e:
                kotlinx.coroutines.flow.l r8 = r2.E
                r7.a = r3
                ac9 r1 = defpackage.ac9.a
                r8.emit(r1, r7)
                if (r6 != r0) goto L5a
            L59:
                return r0
            L5a:
                vp7 r8 = r2.v
                java.lang.String r0 = "CHEETAH"
                r8.A0(r0)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.vpnService.cheetah.ui.CheetahViewModel.C02581.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheetahViewModel(vp7 vp7Var, vl8 vl8Var, lw8 lw8Var, jd7 jd7Var) {
        super(true);
        js3.p(vl8Var, "timeUtils");
        js3.p(lw8Var, "uiUtils");
        js3.p(jd7Var, "savedStateHandle");
        this.v = vp7Var;
        this.w = vl8Var;
        this.x = lw8Var;
        this.y = jd7Var;
        this.A = new ArrayList();
        this.B = new ArrayList();
        if (!jd7Var.a("packageName")) {
            throw new IllegalArgumentException("Required argument \"packageName\" is missing and does not have an android:defaultValue");
        }
        String str = (String) jd7Var.b("packageName");
        if (!jd7Var.a("appIcon")) {
            throw new IllegalArgumentException("Required argument \"appIcon\" is missing and does not have an android:defaultValue");
        }
        String str2 = (String) jd7Var.b("appIcon");
        if (jd7Var.a("stopVpn") && ((Boolean) jd7Var.b("stopVpn")) == null) {
            throw new IllegalArgumentException("Argument \"stopVpn\" of type boolean does not support null values");
        }
        l lVarB = ja1.b(null);
        this.C = lVarB;
        this.D = new rv6(lVarB);
        l lVarB2 = ja1.b(ac9.a);
        this.E = lVarB2;
        this.F = new rv6(lVarB2);
        i iVarE = vy2.e(0, 7, null);
        this.G = iVarE;
        this.H = new pv6(iVarE);
        i iVarE2 = vy2.e(0, 7, null);
        this.I = iVarE2;
        this.J = new pv6(iVarE2);
        l lVarB3 = ja1.b(Boolean.TRUE);
        this.K = lVarB3;
        this.L = new rv6(lVarB3);
        i iVarE3 = vy2.e(0, 7, null);
        this.M = iVarE3;
        this.N = new pv6(iVarE3);
        i iVarE4 = vy2.e(0, 7, null);
        this.O = iVarE4;
        this.P = new pv6(iVarE4);
        this.Q = jd7Var.c(Boolean.FALSE, "stopVpn");
        this.U = (str == null || str2 == null) ? false : true;
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
        bt2.G(y97.G(this), null, null, new AnonymousClass2(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAppStatusClickAction(CheetahAction.AppStatusClickAction appStatusClickAction) {
        bt2.G(y97.G(this), null, null, new C02541(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDisconnectServiceAction(CheetahAction.DisconnectActiveServiceAction disconnectActiveServiceAction) {
        bt2.G(y97.G(this), null, null, new C02551(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onShouldLaunchAppAction(CheetahAction.ShouldLaunchAppAction shouldLaunchAppAction) {
        bt2.G(y97.G(this), null, null, new C02561(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onStartVpnAction(CheetahAction.StartVpnAction startVpnAction) {
        bt2.G(y97.G(this), null, null, new C02571(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onVpnToggleAction(CheetahAction.ToggleVpnAction toggleVpnAction) {
        bt2.G(y97.G(this), null, null, new C02581(null), 3);
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        bt2.G(y97.G(this), null, null, new CheetahViewModel$doRequest$1(this, null), 3);
        bt2.G(y97.G(this), null, null, new CheetahViewModel$doRequest$2(this, null), 3);
    }
}
