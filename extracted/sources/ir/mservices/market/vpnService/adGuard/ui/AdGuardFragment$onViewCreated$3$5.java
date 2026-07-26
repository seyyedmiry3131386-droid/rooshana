package ir.mservices.market.vpnService.adGuard.ui;

import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import defpackage.bc9;
import defpackage.dc9;
import defpackage.dp2;
import defpackage.ea7;
import defpackage.g51;
import defpackage.js3;
import defpackage.pq6;
import defpackage.qp2;
import defpackage.rs6;
import defpackage.rv6;
import defpackage.sj8;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.uk2;
import defpackage.xb9;
import defpackage.zb9;
import ir.mservices.market.core.ext.a;
import ir.mservices.market.views.MyketTextView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.vpnService.adGuard.ui.AdGuardFragment$onViewCreated$3$5", f = "AdGuardFragment.kt", l = {177}, m = "invokeSuspend", v = 1)
final class AdGuardFragment$onViewCreated$3$5 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ AdGuardFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.vpnService.adGuard.ui.AdGuardFragment$onViewCreated$3$5$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.vpnService.adGuard.ui.AdGuardFragment$onViewCreated$3$5$1", f = "AdGuardFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ AdGuardFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AdGuardFragment adGuardFragment, g51 g51Var) {
            super(2, g51Var);
            this.b = adGuardFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((dc9) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            dc9 dc9Var = (dc9) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            boolean z = dc9Var instanceof xb9;
            AdGuardFragment adGuardFragment = this.b;
            if (z) {
                String str = ((xb9) dc9Var).a;
                uk2 uk2Var = adGuardFragment.W0;
                js3.m(uk2Var);
                MyketTextView myketTextView = uk2Var.z;
                myketTextView.setText(adGuardFragment.L(rs6.vpn_is_active));
                myketTextView.setTextColor(sj8.b().c);
                uk2Var.A.setText(str);
                LottieAnimationView lottieAnimationView = uk2Var.C;
                js3.m(lottieAnimationView);
                lottieAnimationView.setVisibility(0);
                a.j(lottieAnimationView, sj8.b().h);
                if (!lottieAnimationView.h.j()) {
                    lottieAnimationView.setProgress(1.0f);
                }
                ImageView imageView = uk2Var.v;
                ea7 ea7Var = new ea7(adGuardFragment.q0());
                ea7Var.b = sj8.b().b.a.h;
                ea7Var.c(imageView.getResources().getDimensionPixelSize(pq6.vpn_connect_radius));
                ea7Var.i = sj8.b().l;
                ea7Var.h = imageView.getResources().getDimensionPixelSize(pq6.space_4);
                imageView.setBackground(ea7Var.a());
            } else if (dc9Var instanceof bc9) {
                uk2 uk2Var2 = adGuardFragment.W0;
                js3.m(uk2Var2);
                MyketTextView myketTextView2 = uk2Var2.z;
                myketTextView2.setText(adGuardFragment.L(rs6.vpn_is_inactive));
                myketTextView2.setTextColor(sj8.b().m);
                uk2Var2.A.setText(adGuardFragment.L(rs6.ad_guard_status_text));
                LottieAnimationView lottieAnimationView2 = uk2Var2.C;
                js3.m(lottieAnimationView2);
                lottieAnimationView2.setVisibility(8);
                a.j(lottieAnimationView2, sj8.b().b.e.f);
                if (!lottieAnimationView2.h.j()) {
                    lottieAnimationView2.setProgress(1.0f);
                }
                ImageView imageView2 = uk2Var2.v;
                ea7 ea7Var2 = new ea7(adGuardFragment.q0());
                ea7Var2.b = sj8.b().o;
                ea7Var2.c(imageView2.getResources().getDimensionPixelSize(pq6.vpn_connect_radius));
                ea7Var2.i = sj8.b().l;
                ea7Var2.h = imageView2.getResources().getDimensionPixelSize(pq6.space_4);
                imageView2.setBackground(ea7Var2.a());
            } else {
                if (!(dc9Var instanceof zb9)) {
                    throw new NoWhenBranchMatchedException();
                }
                uk2 uk2Var3 = adGuardFragment.W0;
                js3.m(uk2Var3);
                MyketTextView myketTextView3 = uk2Var3.z;
                myketTextView3.setText(adGuardFragment.L(rs6.vpn_connecting));
                myketTextView3.setTextColor(sj8.b().m);
                uk2Var3.A.setText(adGuardFragment.L(rs6.please_wait));
                LottieAnimationView lottieAnimationView3 = uk2Var3.C;
                js3.m(lottieAnimationView3);
                lottieAnimationView3.setVisibility(0);
                lottieAnimationView3.f();
                a.j(lottieAnimationView3, sj8.b().b.e.f);
                ImageView imageView3 = uk2Var3.v;
                ea7 ea7Var3 = new ea7(adGuardFragment.q0());
                ea7Var3.b = sj8.b().o;
                ea7Var3.c(imageView3.getResources().getDimensionPixelSize(pq6.vpn_connect_radius));
                ea7Var3.i = sj8.b().l;
                ea7Var3.h = imageView3.getResources().getDimensionPixelSize(pq6.space_4);
                imageView3.setBackground(ea7Var3.a());
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdGuardFragment$onViewCreated$3$5(AdGuardFragment adGuardFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = adGuardFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new AdGuardFragment$onViewCreated$3$5(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((AdGuardFragment$onViewCreated$3$5) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = AdGuardFragment.a1;
            AdGuardFragment adGuardFragment = this.b;
            rv6 rv6Var = adGuardFragment.l1().D;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(adGuardFragment, null);
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
