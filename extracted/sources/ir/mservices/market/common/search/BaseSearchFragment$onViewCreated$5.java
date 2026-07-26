package ir.mservices.market.common.search;

import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import defpackage.dp2;
import defpackage.f57;
import defpackage.fy1;
import defpackage.g51;
import defpackage.gy1;
import defpackage.hy1;
import defpackage.iy1;
import defpackage.jy1;
import defpackage.lw;
import defpackage.o4;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.uh7;
import defpackage.uv1;
import defpackage.w50;
import defpackage.zk8;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SearchView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.common.search.BaseSearchFragment$onViewCreated$5", f = "BaseSearchFragment.kt", l = {314}, m = "invokeSuspend", v = 1)
final class BaseSearchFragment$onViewCreated$5 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ BaseSearchFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.common.search.BaseSearchFragment$onViewCreated$5$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.common.search.BaseSearchFragment$onViewCreated$5$1", f = "BaseSearchFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ BaseSearchFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BaseSearchFragment baseSearchFragment, g51 g51Var) {
            super(2, g51Var);
            this.b = baseSearchFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((jy1) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            jy1 jy1Var = (jy1) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            kotlin.b.b(obj);
            BaseSearchFragment baseSearchFragment = this.b;
            SearchView searchView = baseSearchFragment.l1;
            if (searchView != null) {
                uh7 binding = searchView.getBinding();
                w50 w50Var = new w50(baseSearchFragment, jy1Var, 1);
                if (jy1Var instanceof fy1) {
                    MyketTextView myketTextView = binding.B;
                    LottieAnimationView lottieAnimationView = binding.y;
                    myketTextView.setVisibility(8);
                    binding.z.setVisibility(8);
                    try {
                        searchView.setDynamicViewVisibility(true);
                        lottieAnimationView.setVisibility(0);
                        lottieAnimationView.setAnimationFromJson(((fy1) jy1Var).c.toString(), null);
                        lottieAnimationView.setRepeatCount(-1);
                        lottieAnimationView.f();
                        lottieAnimationView.setOnClickListener(w50Var);
                    } catch (Exception unused) {
                        searchView.setDynamicViewVisibility(false);
                        lw.g(null, "Could not load actionbar animation: " + ((fy1) jy1Var).b.getAnimationUrl(), null);
                        lottieAnimationView.setVisibility(8);
                    }
                } else if (jy1Var instanceof gy1) {
                    searchView.setDynamicViewVisibility(false);
                    binding.y.setVisibility(8);
                    binding.B.setVisibility(8);
                    binding.z.setVisibility(8);
                } else if (jy1Var instanceof hy1) {
                    MyketTextView myketTextView2 = binding.B;
                    ImageView imageView = binding.z;
                    myketTextView2.setVisibility(8);
                    binding.y.setVisibility(8);
                    imageView.setVisibility(0);
                    imageView.setOnClickListener(w50Var);
                    ((f57) zk8.Q(baseSearchFragment, ((hy1) jy1Var).b.getIconUrl()).m()).W(uv1.b()).P(imageView);
                    searchView.setDynamicViewVisibility(true);
                } else {
                    if (!(jy1Var instanceof iy1)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    MyketTextView myketTextView3 = binding.B;
                    myketTextView3.setVisibility(0);
                    myketTextView3.setText(((iy1) jy1Var).b.getName());
                    myketTextView3.setOnClickListener(w50Var);
                    binding.z.setVisibility(8);
                    binding.y.setVisibility(8);
                    searchView.setDynamicViewVisibility(true);
                }
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSearchFragment$onViewCreated$5(BaseSearchFragment baseSearchFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = baseSearchFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new BaseSearchFragment$onViewCreated$5(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((BaseSearchFragment$onViewCreated$5) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            BaseSearchFragment baseSearchFragment = this.b;
            o4 o4Var = new o4(baseSearchFragment.S1().F, 9);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(baseSearchFragment, null);
            this.a = 1;
            if (d.f(o4Var, anonymousClass1, this) == coroutineSingletons) {
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
