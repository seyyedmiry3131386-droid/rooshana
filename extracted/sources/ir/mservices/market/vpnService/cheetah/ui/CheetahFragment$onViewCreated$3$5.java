package ir.mservices.market.vpnService.cheetah.ui;

import android.content.Context;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import defpackage.ac9;
import defpackage.al2;
import defpackage.cc9;
import defpackage.dp2;
import defpackage.ea7;
import defpackage.f88;
import defpackage.g51;
import defpackage.js3;
import defpackage.pq6;
import defpackage.qp2;
import defpackage.rs6;
import defpackage.rv6;
import defpackage.sj8;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wb9;
import defpackage.yb9;
import ir.mservices.market.core.ext.a;
import ir.mservices.market.views.BigFillOvalButton;
import ir.mservices.market.views.MyketTextView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.vpnService.cheetah.ui.CheetahFragment$onViewCreated$3$5", f = "CheetahFragment.kt", l = {158}, m = "invokeSuspend", v = 1)
final class CheetahFragment$onViewCreated$3$5 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ CheetahFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.vpnService.cheetah.ui.CheetahFragment$onViewCreated$3$5$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.vpnService.cheetah.ui.CheetahFragment$onViewCreated$3$5$1", f = "CheetahFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ CheetahFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CheetahFragment cheetahFragment, g51 g51Var) {
            super(2, g51Var);
            this.b = cheetahFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((cc9) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            cc9 cc9Var = (cc9) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            boolean z = cc9Var instanceof wb9;
            CheetahFragment cheetahFragment = this.b;
            if (z) {
                wb9 wb9Var = (wb9) cc9Var;
                al2 al2Var = cheetahFragment.W0;
                js3.m(al2Var);
                MyketTextView myketTextView = al2Var.D;
                myketTextView.setTextColor(sj8.b().c);
                myketTextView.setText(cheetahFragment.L(rs6.vpn_is_active));
                al2Var.E.setText(wb9Var.a);
                BigFillOvalButton bigFillOvalButton = al2Var.w;
                bigFillOvalButton.setDisable(false);
                String string = wb9Var.b;
                if (string == null || f88.n0(string)) {
                    string = bigFillOvalButton.getContext().getResources().getString(rs6.cheetah_app_status_text);
                }
                bigFillOvalButton.setText(string);
                LottieAnimationView lottieAnimationView = al2Var.G;
                js3.m(lottieAnimationView);
                lottieAnimationView.setVisibility(0);
                a.j(lottieAnimationView, sj8.b().h);
                if (!lottieAnimationView.h.j()) {
                    lottieAnimationView.setProgress(1.0f);
                }
                Context contextH = cheetahFragment.H();
                if (contextH != null) {
                    ImageView imageView = al2Var.y;
                    ea7 ea7Var = new ea7(contextH);
                    ea7Var.b = sj8.b().b.a.h;
                    ea7Var.c(cheetahFragment.K().getDimensionPixelSize(pq6.vpn_connect_radius));
                    ea7Var.i = sj8.b().l;
                    ea7Var.h = cheetahFragment.K().getDimensionPixelSize(pq6.space_4);
                    imageView.setBackground(ea7Var.a());
                }
            } else if (cc9Var instanceof ac9) {
                al2 al2Var2 = cheetahFragment.W0;
                js3.m(al2Var2);
                MyketTextView myketTextView2 = al2Var2.D;
                myketTextView2.setTextColor(sj8.b().m);
                myketTextView2.setText(cheetahFragment.L(rs6.vpn_is_inactive));
                al2Var2.E.setText(cheetahFragment.L(rs6.cheetah_status_text));
                BigFillOvalButton bigFillOvalButton2 = al2Var2.w;
                bigFillOvalButton2.setDisable(true);
                bigFillOvalButton2.setText(bigFillOvalButton2.getContext().getResources().getString(rs6.cheetah_app_status_text));
                LottieAnimationView lottieAnimationView2 = al2Var2.G;
                js3.m(lottieAnimationView2);
                lottieAnimationView2.setVisibility(8);
                a.j(lottieAnimationView2, sj8.b().b.e.f);
                if (!lottieAnimationView2.h.j()) {
                    lottieAnimationView2.setProgress(1.0f);
                }
                Context contextH2 = cheetahFragment.H();
                if (contextH2 != null) {
                    ImageView imageView2 = al2Var2.y;
                    ea7 ea7Var2 = new ea7(contextH2);
                    ea7Var2.b = sj8.b().o;
                    ea7Var2.c(cheetahFragment.K().getDimensionPixelSize(pq6.vpn_connect_radius));
                    ea7Var2.i = sj8.b().l;
                    ea7Var2.h = cheetahFragment.K().getDimensionPixelSize(pq6.space_4);
                    imageView2.setBackground(ea7Var2.a());
                }
            } else {
                if (!(cc9Var instanceof yb9)) {
                    throw new NoWhenBranchMatchedException();
                }
                al2 al2Var3 = cheetahFragment.W0;
                js3.m(al2Var3);
                MyketTextView myketTextView3 = al2Var3.D;
                myketTextView3.setText(cheetahFragment.L(rs6.vpn_connecting));
                myketTextView3.setTextColor(sj8.b().m);
                al2Var3.E.setText(cheetahFragment.L(rs6.please_wait));
                BigFillOvalButton bigFillOvalButton3 = al2Var3.w;
                bigFillOvalButton3.setDisable(true);
                bigFillOvalButton3.setText(bigFillOvalButton3.getContext().getResources().getString(rs6.cheetah_app_status_text));
                LottieAnimationView lottieAnimationView3 = al2Var3.G;
                js3.m(lottieAnimationView3);
                a.j(lottieAnimationView3, sj8.b().b.e.f);
                lottieAnimationView3.setVisibility(0);
                lottieAnimationView3.f();
                Context contextH3 = cheetahFragment.H();
                if (contextH3 != null) {
                    ImageView imageView3 = al2Var3.y;
                    ea7 ea7Var3 = new ea7(contextH3);
                    ea7Var3.b = sj8.b().o;
                    ea7Var3.c(cheetahFragment.K().getDimensionPixelSize(pq6.vpn_connect_radius));
                    ea7Var3.i = sj8.b().l;
                    ea7Var3.h = cheetahFragment.K().getDimensionPixelSize(pq6.space_4);
                    imageView3.setBackground(ea7Var3.a());
                }
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheetahFragment$onViewCreated$3$5(CheetahFragment cheetahFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = cheetahFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new CheetahFragment$onViewCreated$3$5(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((CheetahFragment$onViewCreated$3$5) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = CheetahFragment.b1;
            CheetahFragment cheetahFragment = this.b;
            rv6 rv6Var = cheetahFragment.l1().F;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(cheetahFragment, null);
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
