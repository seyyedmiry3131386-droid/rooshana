package ir.mservices.market.core;

import android.view.MenuItem;
import android.widget.ImageView;
import defpackage.e71;
import defpackage.g51;
import defpackage.hi6;
import defpackage.js3;
import defpackage.ki6;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xb5;
import defpackage.xp;
import ir.mservices.market.views.LoadingView;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.core.PopupWindowUtils$handleMoreMenuItem$1$2$2", f = "PopupWindowUtils.kt", l = {146}, m = "invokeSuspend", v = 1)
final class PopupWindowUtils$handleMoreMenuItem$1$2$2 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ xb5 b;
    public final /* synthetic */ MenuItem c;
    public final /* synthetic */ ki6 d;

    /* JADX INFO: renamed from: ir.mservices.market.core.PopupWindowUtils$handleMoreMenuItem$1$2$2$2, reason: invalid class name */
    @tb1(c = "ir.mservices.market.core.PopupWindowUtils$handleMoreMenuItem$1$2$2$2", f = "PopupWindowUtils.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ ki6 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ki6 ki6Var, g51 g51Var) {
            super(2, g51Var);
            this.b = ki6Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.b, g51Var);
            anonymousClass2.a = obj;
            return anonymousClass2;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((hi6) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass2.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            hi6 hi6Var = (hi6) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            if (hi6Var instanceof hi6) {
                ki6 ki6Var = this.b;
                ImageView imageView = ki6Var.v;
                LoadingView loadingView = ki6Var.w;
                js3.o(imageView, "icon");
                imageView.setVisibility(8);
                js3.o(loadingView, "loading");
                loadingView.setVisibility(0);
                loadingView.d(true);
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupWindowUtils$handleMoreMenuItem$1$2$2(xb5 xb5Var, MenuItem menuItem, ki6 ki6Var, g51 g51Var) {
        super(2, g51Var);
        this.b = xb5Var;
        this.c = menuItem;
        this.d = ki6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new PopupWindowUtils$handleMoreMenuItem$1$2$2(this.b, this.c, this.d, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((PopupWindowUtils$handleMoreMenuItem$1$2$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            xp xpVar = new xp(this.b, this.c, 16);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.d, null);
            this.a = 1;
            if (d.f(xpVar, anonymousClass2, this) == coroutineSingletons) {
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
