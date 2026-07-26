package ir.mservices.market.social.profile.own;

import defpackage.bj2;
import defpackage.bt2;
import defpackage.e71;
import defpackage.g51;
import defpackage.ja1;
import defpackage.js3;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.rv6;
import defpackage.t32;
import defpackage.tb1;
import defpackage.tl3;
import defpackage.tx8;
import defpackage.ul3;
import defpackage.y97;
import defpackage.yx5;
import ir.mservices.market.social.profile.own.OwnProfileAction;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class OwnProfileViewModel extends ir.mservices.market.viewModel.a {
    public final l A;
    public final rv6 B;
    public final l C;
    public final rv6 D;
    public final ul3 v;
    public final l w;
    public final rv6 x;
    public final l y;
    public final rv6 z;

    /* JADX INFO: renamed from: ir.mservices.market.social.profile.own.OwnProfileViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.social.profile.own.OwnProfileViewModel$1", f = "OwnProfileViewModel.kt", l = {85}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return OwnProfileViewModel.this.new AnonymousClass1(g51Var);
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
            OwnProfileViewModel ownProfileViewModel = OwnProfileViewModel.this;
            pv6 pv6Var = ownProfileViewModel.u;
            bj2 bj2Var = new bj2(25, ownProfileViewModel);
            this.a = 1;
            Object objA = pv6Var.a.a(new yx5(bj2Var, 3), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.social.profile.own.OwnProfileViewModel$2, reason: invalid class name */
    @tb1(c = "ir.mservices.market.social.profile.own.OwnProfileViewModel$2", f = "OwnProfileViewModel.kt", l = {46}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass2(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return OwnProfileViewModel.this.new AnonymousClass2(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
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
            OwnProfileViewModel ownProfileViewModel = OwnProfileViewModel.this;
            l lVar = ownProfileViewModel.C;
            Boolean boolValueOf = Boolean.valueOf(ownProfileViewModel.v.a());
            this.a = 1;
            lVar.emit(boolValueOf, this);
            return tx8Var == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.social.profile.own.OwnProfileViewModel$onEvent$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.social.profile.own.OwnProfileViewModel$onEvent$1", f = "OwnProfileViewModel.kt", l = {67}, m = "invokeSuspend", v = 1)
    public static final class C02351 extends SuspendLambda implements qp2 {
        public int a;

        public C02351(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return OwnProfileViewModel.this.new C02351(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C02351) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
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
            OwnProfileViewModel ownProfileViewModel = OwnProfileViewModel.this;
            l lVar = ownProfileViewModel.C;
            Boolean boolValueOf = Boolean.valueOf(ownProfileViewModel.v.a());
            this.a = 1;
            lVar.emit(boolValueOf, this);
            return tx8Var == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OwnProfileViewModel(ul3 ul3Var) {
        super(false);
        js3.p(ul3Var, "inboxManager");
        this.v = ul3Var;
        l lVarB = ja1.b(null);
        this.w = lVarB;
        this.x = new rv6(lVarB);
        l lVarB2 = ja1.b(null);
        this.y = lVarB2;
        this.z = new rv6(lVarB2);
        l lVarB3 = ja1.b(null);
        this.A = lVarB3;
        this.B = new rv6(lVarB3);
        l lVarB4 = ja1.b(Boolean.valueOf(ul3Var.a()));
        this.C = lVarB4;
        this.D = new rv6(lVarB4);
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
        t32.b().l(this, false);
        bt2.G(y97.G(this), null, null, new AnonymousClass2(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onScrollYAction(OwnProfileAction.ScrollYAction scrollYAction) {
        l lVar;
        Object value;
        do {
            lVar = this.A;
            value = lVar.getValue();
        } while (!lVar.n(value, scrollYAction.getScrollY()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTabAction(OwnProfileAction.TabAction tabAction) {
        l lVar;
        Object value;
        do {
            lVar = this.w;
            value = lVar.getValue();
        } while (!lVar.n(value, Integer.valueOf(tabAction.getSelectedTab())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTabAnimationAction(OwnProfileAction.TabAnimationAction tabAnimationAction) {
        l lVar;
        Object value;
        Boolean boolValueOf;
        Boolean bool;
        do {
            lVar = this.y;
            value = lVar.getValue();
            boolValueOf = (Boolean) value;
            bool = Boolean.FALSE;
            if (!js3.i(boolValueOf, bool)) {
                boolValueOf = Boolean.valueOf(tabAnimationAction.getAnimation());
            }
        } while (!lVar.n(value, boolValueOf));
        if (js3.i(lVar.getValue(), bool)) {
            Integer num = (Integer) this.w.getValue();
            onTabAction(new OwnProfileAction.TabAction(num != null ? num.intValue() : 0));
        }
    }

    @Override // ir.mservices.market.viewModel.c, defpackage.k79
    public final void d() {
        super.d();
        t32.b().o(this);
    }

    public final void onEvent(tl3 tl3Var) {
        js3.p(tl3Var, "event");
        bt2.G(y97.G(this), null, null, new C02351(null), 3);
    }
}
