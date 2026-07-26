package ir.mservices.market.social.profile.own;

import android.widget.FrameLayout;
import androidx.fragment.app.g;
import defpackage.dp2;
import defpackage.g51;
import defpackage.im2;
import defpackage.js3;
import defpackage.o4;
import defpackage.ol3;
import defpackage.p40;
import defpackage.qp2;
import defpackage.rr6;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.social.profile.list.ProfileListFragment;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.profile.own.OwnProfileFragment$onViewCreated$3", f = "OwnProfileFragment.kt", l = {179}, m = "invokeSuspend", v = 1)
final class OwnProfileFragment$onViewCreated$3 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ OwnProfileFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.social.profile.own.OwnProfileFragment$onViewCreated$3$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.social.profile.own.OwnProfileFragment$onViewCreated$3$1", f = "OwnProfileFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ int a;
        public final /* synthetic */ OwnProfileFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(OwnProfileFragment ownProfileFragment, g51 g51Var) {
            super(2, g51Var);
            this.b = ownProfileFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
            anonymousClass1.a = ((Number) obj).intValue();
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create(Integer.valueOf(((Number) obj).intValue()), (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i = this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            OwnProfileFragment ownProfileFragment = this.b;
            im2 im2Var = ownProfileFragment.Y0;
            js3.m(im2Var);
            im2Var.A.setSelectedTab(i);
            im2 im2Var2 = ownProfileFragment.Y0;
            js3.m(im2Var2);
            im2Var2.y.setSelectedTab(i);
            if (i == 0) {
                im2 im2Var3 = ownProfileFragment.Y0;
                js3.m(im2Var3);
                FrameLayout frameLayout = im2Var3.v;
                js3.o(frameLayout, "apps");
                frameLayout.setVisibility(0);
                im2 im2Var4 = ownProfileFragment.Y0;
                js3.m(im2Var4);
                FrameLayout frameLayout2 = im2Var4.w;
                js3.o(frameLayout2, "movies");
                frameLayout2.setVisibility(8);
                if (!(ownProfileFragment.G().F(rr6.apps) instanceof ProfileListFragment)) {
                    g gVarG = ownProfileFragment.G();
                    gVarG.getClass();
                    p40 p40Var = new p40(gVarG);
                    int i2 = rr6.apps;
                    int i3 = ProfileListFragment.Z0;
                    p40Var.k(i2, ol3.p(null, true), null);
                    p40Var.e();
                }
            } else if (i == 1) {
                im2 im2Var5 = ownProfileFragment.Y0;
                js3.m(im2Var5);
                FrameLayout frameLayout3 = im2Var5.v;
                js3.o(frameLayout3, "apps");
                frameLayout3.setVisibility(8);
                im2 im2Var6 = ownProfileFragment.Y0;
                js3.m(im2Var6);
                FrameLayout frameLayout4 = im2Var6.w;
                js3.o(frameLayout4, "movies");
                frameLayout4.setVisibility(0);
                if (!(ownProfileFragment.G().F(rr6.movies) instanceof ProfileListFragment)) {
                    g gVarG2 = ownProfileFragment.G();
                    gVarG2.getClass();
                    p40 p40Var2 = new p40(gVarG2);
                    int i4 = rr6.movies;
                    int i5 = ProfileListFragment.Z0;
                    p40Var2.k(i4, ol3.p(null, false), null);
                    p40Var2.e();
                }
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OwnProfileFragment$onViewCreated$3(OwnProfileFragment ownProfileFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = ownProfileFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new OwnProfileFragment$onViewCreated$3(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((OwnProfileFragment$onViewCreated$3) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = OwnProfileFragment.d1;
            OwnProfileFragment ownProfileFragment = this.b;
            o4 o4Var = new o4(ownProfileFragment.m1().x, 9);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(ownProfileFragment, null);
            this.a = 1;
            if (d.f(o4Var, anonymousClass1, this) == coroutineSingletons) {
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
