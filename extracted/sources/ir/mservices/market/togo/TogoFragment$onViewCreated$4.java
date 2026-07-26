package ir.mservices.market.togo;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import defpackage.b77;
import defpackage.dp2;
import defpackage.g51;
import defpackage.js3;
import defpackage.q39;
import defpackage.qp2;
import defpackage.rv6;
import defpackage.sj8;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.um8;
import defpackage.zk8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.togo.TogoFragment$onViewCreated$4", f = "TogoFragment.kt", l = {372}, m = "invokeSuspend", v = 1)
final class TogoFragment$onViewCreated$4 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ TogoFragment b;
    public final /* synthetic */ View c;

    /* JADX INFO: renamed from: ir.mservices.market.togo.TogoFragment$onViewCreated$4$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.togo.TogoFragment$onViewCreated$4$1", f = "TogoFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ View b;
        public final /* synthetic */ TogoFragment c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(g51 g51Var, View view, TogoFragment togoFragment) {
            super(2, g51Var);
            this.b = view;
            this.c = togoFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(g51Var, this.b, this.c);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((um8) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Drawable drawable;
            zk8 zk8VarP;
            um8 um8Var = (um8) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            kotlin.b.b(obj);
            Resources resources = this.b.getContext().getResources();
            js3.o(resources, "getResources(...)");
            int i = um8Var.a;
            try {
                drawable = q39.a(resources, i, null);
                if (drawable == null) {
                    ThreadLocal threadLocal = b77.a;
                    drawable = resources.getDrawable(i, null);
                    if (drawable == null) {
                        throw new Resources.NotFoundException();
                    }
                }
            } catch (Exception unused) {
                ThreadLocal threadLocal2 = b77.a;
                drawable = resources.getDrawable(i, null);
                if (drawable == null) {
                    throw new Resources.NotFoundException();
                }
            }
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
            FragmentActivity fragmentActivityF = this.c.F();
            AppCompatActivity appCompatActivity = fragmentActivityF instanceof AppCompatActivity ? (AppCompatActivity) fragmentActivityF : null;
            if (appCompatActivity != null && (zk8VarP = appCompatActivity.P()) != null) {
                zk8VarP.g0(drawableMutate);
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TogoFragment$onViewCreated$4(g51 g51Var, View view, TogoFragment togoFragment) {
        super(1, g51Var);
        this.b = togoFragment;
        this.c = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new TogoFragment$onViewCreated$4(g51Var, this.c, this.b);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((TogoFragment$onViewCreated$4) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            int i2 = TogoFragment.o1;
            TogoFragment togoFragment = this.b;
            rv6 rv6Var = togoFragment.n1().J;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, this.c, togoFragment);
            this.a = 1;
            if (kotlinx.coroutines.flow.d.f(rv6Var, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
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
