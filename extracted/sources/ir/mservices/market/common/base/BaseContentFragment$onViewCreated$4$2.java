package ir.mservices.market.common.base;

import android.animation.ValueAnimator;
import defpackage.dp2;
import defpackage.g51;
import defpackage.m60;
import defpackage.qj;
import defpackage.qp2;
import defpackage.rv6;
import defpackage.t95;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.viewModel.BaseMultiSelectViewModel;
import ir.mservices.market.views.MultiSelectTitleView;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.common.base.BaseContentFragment$onViewCreated$4$2", f = "BaseContentFragment.kt", l = {247}, m = "invokeSuspend", v = 1)
final class BaseContentFragment$onViewCreated$4$2 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ BaseMultiSelectViewModel b;
    public final /* synthetic */ BaseContentFragment c;

    /* JADX INFO: renamed from: ir.mservices.market.common.base.BaseContentFragment$onViewCreated$4$2$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.common.base.BaseContentFragment$onViewCreated$4$2$1", f = "BaseContentFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ BaseContentFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BaseContentFragment baseContentFragment, g51 g51Var) {
            super(2, g51Var);
            this.b = baseContentFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((t95) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            t95 t95Var = (t95) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            boolean z = t95Var.b;
            BaseContentFragment baseContentFragment = this.b;
            MultiSelectTitleView multiSelectTitleView = baseContentFragment.M0;
            if (multiSelectTitleView != null) {
                if ((multiSelectTitleView.getVisibility() == 0) != z) {
                    multiSelectTitleView.setVisibility(0);
                    multiSelectTitleView.setAlpha(z ? 0.0f : 1.0f);
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
                    valueAnimatorOfFloat.setDuration(400L);
                    valueAnimatorOfFloat.addUpdateListener(new qj(1, multiSelectTitleView));
                    valueAnimatorOfFloat.addListener(new m60(multiSelectTitleView, z, baseContentFragment));
                    valueAnimatorOfFloat.start();
                    baseContentFragment.N0 = valueAnimatorOfFloat;
                }
            }
            MultiSelectTitleView multiSelectTitleView2 = baseContentFragment.M0;
            if (multiSelectTitleView2 != null) {
                multiSelectTitleView2.setMaxItemCount(t95Var.c);
                multiSelectTitleView2.setItemCount(t95Var.a);
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseContentFragment$onViewCreated$4$2(BaseMultiSelectViewModel baseMultiSelectViewModel, BaseContentFragment baseContentFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = baseMultiSelectViewModel;
        this.c = baseContentFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new BaseContentFragment$onViewCreated$4$2(this.b, this.c, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((BaseContentFragment$onViewCreated$4$2) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            rv6 rv6Var = this.b.w;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.c, null);
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
