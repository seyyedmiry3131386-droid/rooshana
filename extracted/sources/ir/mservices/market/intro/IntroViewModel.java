package ir.mservices.market.intro;

import defpackage.bj2;
import defpackage.bt2;
import defpackage.e71;
import defpackage.g51;
import defpackage.ja1;
import defpackage.ol3;
import defpackage.pt1;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vy2;
import defpackage.y97;
import ir.mservices.market.intro.IntroAction;
import ir.mservices.market.viewModel.a;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class IntroViewModel extends a {
    public final l A;
    public final rv6 B;
    public final ol3 v;
    public final l w;
    public final rv6 x;
    public final i y;
    public final pv6 z;

    /* JADX INFO: renamed from: ir.mservices.market.intro.IntroViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.intro.IntroViewModel$1", f = "IntroViewModel.kt", l = {86}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return IntroViewModel.this.new AnonymousClass1(g51Var);
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
            IntroViewModel introViewModel = IntroViewModel.this;
            pv6 pv6Var = introViewModel.u;
            bj2 bj2Var = new bj2(6, introViewModel);
            this.a = 1;
            Object objA = pv6Var.a.a(new pt1(bj2Var, 8), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.intro.IntroViewModel$previousStep$3, reason: invalid class name */
    @tb1(c = "ir.mservices.market.intro.IntroViewModel$previousStep$3", f = "IntroViewModel.kt", l = {75}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass3 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass3(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return IntroViewModel.this.new AnonymousClass3(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
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
            i iVar = IntroViewModel.this.y;
            this.a = 1;
            return iVar.emit(tx8Var, this) == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    public IntroViewModel(ol3 ol3Var) {
        super(true);
        this.v = ol3Var;
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
        l lVarB = ja1.b(Boolean.FALSE);
        this.w = lVarB;
        this.x = new rv6(lVarB);
        i iVarE = vy2.e(0, 7, null);
        this.y = iVarE;
        this.z = new pv6(iVarE);
        l lVarB2 = ja1.b(0);
        this.A = lVarB2;
        this.B = new rv6(lVarB2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void nextStep(IntroAction.NextStep nextStep) {
        l lVar;
        Object value;
        l lVar2;
        Object value2;
        int iIntValue = ((Number) this.B.a.getValue()).intValue() + 1;
        do {
            lVar = this.w;
            value = lVar.getValue();
            ((Boolean) value).getClass();
        } while (!lVar.n(value, Boolean.valueOf(iIntValue > 3)));
        if (iIntValue <= 3) {
            do {
                lVar2 = this.A;
                value2 = lVar2.getValue();
                ((Number) value2).intValue();
            } while (!lVar2.n(value2, Integer.valueOf(iIntValue)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void previousStep(IntroAction.PreviousStep previousStep) {
        l lVar;
        Object value;
        l lVar2;
        Object value2;
        int iIntValue = ((Number) this.B.a.getValue()).intValue() - 1;
        do {
            lVar = this.w;
            value = lVar.getValue();
            ((Boolean) value).getClass();
        } while (!lVar.n(value, Boolean.FALSE));
        if (iIntValue < 0) {
            bt2.G(y97.G(this), null, null, new AnonymousClass3(null), 3);
            return;
        }
        do {
            lVar2 = this.A;
            value2 = lVar2.getValue();
            ((Number) value2).intValue();
        } while (!lVar2.n(value2, Integer.valueOf(iIntValue)));
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        p(new IntroViewModel$doRequest$1(this, null));
    }
}
