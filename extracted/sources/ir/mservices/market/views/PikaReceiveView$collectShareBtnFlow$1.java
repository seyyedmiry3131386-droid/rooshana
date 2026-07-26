package ir.mservices.market.views;

import android.widget.ProgressBar;
import defpackage.e71;
import defpackage.g51;
import defpackage.js3;
import defpackage.m86;
import defpackage.n86;
import defpackage.o86;
import defpackage.p86;
import defpackage.q86;
import defpackage.qp2;
import defpackage.r86;
import defpackage.rs6;
import defpackage.s86;
import defpackage.sj8;
import defpackage.t86;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.v48;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.views.PikaReceiveView$collectShareBtnFlow$1", f = "PikaReceiveView.kt", l = {127}, m = "invokeSuspend", v = 1)
final class PikaReceiveView$collectShareBtnFlow$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ PikaReceiveView b;

    /* JADX INFO: renamed from: ir.mservices.market.views.PikaReceiveView$collectShareBtnFlow$1$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.views.PikaReceiveView$collectShareBtnFlow$1$1", f = "PikaReceiveView.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ PikaReceiveView b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PikaReceiveView pikaReceiveView, g51 g51Var) {
            super(2, g51Var);
            this.b = pikaReceiveView;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((t86) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            t86 t86Var = (t86) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            kotlin.b.b(obj);
            PikaReceiveView pikaReceiveView = this.b;
            ProgressBar progressBar = pikaReceiveView.c;
            PikaReceiveView.c(pikaReceiveView, t86Var);
            PikaReceiveView.b(pikaReceiveView, t86Var);
            MyketProgressButton myketProgressButton = pikaReceiveView.d;
            if (js3.i(t86Var, o86.a)) {
                myketProgressButton.setState(MyketProgressState.c);
            } else {
                myketProgressButton.setState(MyketProgressState.b);
            }
            pikaReceiveView.setClickable(!js3.i(t86Var, r3));
            if (t86Var instanceof q86) {
                progressBar.setVisibility(0);
                myketProgressButton.setText(PikaReceiveView.a(pikaReceiveView, rs6.stop_app));
                myketProgressButton.setTextColor(sj8.b().c);
                pikaReceiveView.setPercentage((int) ((q86) t86Var).a);
            } else if (t86Var instanceof m86) {
                myketProgressButton.setText(PikaReceiveView.a(pikaReceiveView, rs6.install_app));
                myketProgressButton.setTextColor(sj8.b().n);
            } else if (t86Var instanceof p86) {
                myketProgressButton.setText(PikaReceiveView.a(pikaReceiveView, rs6.stop_app));
                myketProgressButton.setTextColor(sj8.b().c);
            } else if (t86Var instanceof n86) {
                Integer textColor = pikaReceiveView.getTextColor();
                myketProgressButton.setTextColor(textColor != null ? textColor.intValue() : sj8.b().c);
                myketProgressButton.setText(PikaReceiveView.a(pikaReceiveView, rs6.install_app));
                pikaReceiveView.setPercentage(0);
            } else if (t86Var instanceof o86) {
                progressBar.setVisibility(0);
                pikaReceiveView.setPercentage(100);
                myketProgressButton.setText("");
            } else if (t86Var instanceof r86) {
                myketProgressButton.setText(PikaReceiveView.a(pikaReceiveView, rs6.run_app));
                pikaReceiveView.setPercentage(0);
            } else {
                if (!(t86Var instanceof s86)) {
                    throw new NoWhenBranchMatchedException();
                }
                myketProgressButton.setText(PikaReceiveView.a(pikaReceiveView, rs6.update_app));
                pikaReceiveView.setPercentage(0);
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PikaReceiveView$collectShareBtnFlow$1(PikaReceiveView pikaReceiveView, g51 g51Var) {
        super(2, g51Var);
        this.b = pikaReceiveView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new PikaReceiveView$collectShareBtnFlow$1(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((PikaReceiveView$collectShareBtnFlow$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            PikaReceiveView pikaReceiveView = this.b;
            v48 v48Var = pikaReceiveView.h;
            if (v48Var != null) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(pikaReceiveView, null);
                this.a = 1;
                if (d.f(v48Var, anonymousClass1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
