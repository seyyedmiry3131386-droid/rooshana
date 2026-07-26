package ir.mservices.market.app.detail.reivews;

import android.os.Parcelable;
import defpackage.as;
import defpackage.bt2;
import defpackage.c5;
import defpackage.dp3;
import defpackage.e71;
import defpackage.g51;
import defpackage.ja1;
import defpackage.jd7;
import defpackage.js3;
import defpackage.o4;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.r4;
import defpackage.sk6;
import defpackage.t32;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vb7;
import defpackage.vr2;
import defpackage.vy2;
import defpackage.y97;
import defpackage.yr;
import defpackage.ys5;
import defpackage.yz5;
import ir.mservices.market.appDetail.ToolbarData;
import ir.mservices.market.common.comment.data.response.ReviewDto;
import ir.mservices.market.common.comment.data.response.ReviewResultDto;
import ir.mservices.market.common.model.SubmitCommentRepository$getCommentFlow$$inlined$transform$1;
import ir.mservices.market.common.model.SubmitCommentRepository$getSubmitCommentStateFlow$$inlined$transform$1;
import ir.mservices.market.viewModel.c;
import java.io.Serializable;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class AppReviewsViewModel extends c {
    public final l A;
    public final yr B;
    public ReviewDto C;
    public Integer D;
    public boolean E;
    public final vb7 F;
    public final vb7 G;
    public final sk6 t;
    public final c5 u;
    public final dp3 v;
    public final i w;
    public final pv6 x;
    public final l y;
    public final l z;

    /* JADX INFO: renamed from: ir.mservices.market.app.detail.reivews.AppReviewsViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.detail.reivews.AppReviewsViewModel$1", f = "AppReviewsViewModel.kt", l = {74}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        /* JADX INFO: renamed from: ir.mservices.market.app.detail.reivews.AppReviewsViewModel$1$1, reason: invalid class name and collision with other inner class name */
        @tb1(c = "ir.mservices.market.app.detail.reivews.AppReviewsViewModel$1$1", f = "AppReviewsViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
        final class C00171 extends SuspendLambda implements qp2 {
            public /* synthetic */ Object a;
            public final /* synthetic */ AppReviewsViewModel b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00171(AppReviewsViewModel appReviewsViewModel, g51 g51Var) {
                super(2, g51Var);
                this.b = appReviewsViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final g51 create(Object obj, g51 g51Var) {
                C00171 c00171 = new C00171(this.b, g51Var);
                c00171.a = obj;
                return c00171;
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                C00171 c00171 = (C00171) create((ReviewResultDto) obj, (g51) obj2);
                tx8 tx8Var = tx8.a;
                c00171.invokeSuspend(tx8Var);
                return tx8Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                ReviewResultDto reviewResultDto = (ReviewResultDto) this.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                b.b(obj);
                AppReviewsViewModel appReviewsViewModel = this.b;
                appReviewsViewModel.C = reviewResultDto;
                appReviewsViewModel.g(new yz5(new as(appReviewsViewModel, 0)));
                return tx8.a;
            }
        }

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return AppReviewsViewModel.this.new AnonymousClass1(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                b.b(obj);
                AppReviewsViewModel appReviewsViewModel = AppReviewsViewModel.this;
                o4 o4Var = new o4(appReviewsViewModel.G, 9);
                C00171 c00171 = new C00171(appReviewsViewModel, null);
                this.a = 1;
                if (d.f(o4Var, c00171, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: ir.mservices.market.app.detail.reivews.AppReviewsViewModel$2, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.detail.reivews.AppReviewsViewModel$2", f = "AppReviewsViewModel.kt", l = {79}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass2(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return AppReviewsViewModel.this.new AnonymousClass2(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                b.b(obj);
                AppReviewsViewModel appReviewsViewModel = AppReviewsViewModel.this;
                vb7 vb7Var = appReviewsViewModel.F;
                r4 r4Var = new r4(6, appReviewsViewModel);
                this.a = 1;
                if (vb7Var.a(r4Var, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppReviewsViewModel(sk6 sk6Var, c5 c5Var, dp3 dp3Var, vr2 vr2Var, vr2 vr2Var2, jd7 jd7Var) {
        super(true);
        js3.p(c5Var, "accountManager");
        js3.p(dp3Var, "installManager");
        js3.p(jd7Var, "savedStateHandle");
        this.t = sk6Var;
        this.u = c5Var;
        this.v = dp3Var;
        i iVarE = vy2.e(0, 7, null);
        this.w = iVarE;
        this.x = new pv6(iVarE);
        this.y = ja1.b(null);
        this.z = ja1.b(Float.valueOf(0.0f));
        this.A = ja1.b(null);
        if (!jd7Var.a("packageName")) {
            throw new IllegalArgumentException("Required argument \"packageName\" is missing and does not have an android:defaultValue");
        }
        String str = (String) jd7Var.b("packageName");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"packageName\" is marked as non-null but was passed a null value");
        }
        if (!jd7Var.a("detailSubscriberId")) {
            throw new IllegalArgumentException("Required argument \"detailSubscriberId\" is missing and does not have an android:defaultValue");
        }
        String str2 = (String) jd7Var.b("detailSubscriberId");
        if (str2 == null) {
            throw new IllegalArgumentException("Argument \"detailSubscriberId\" is marked as non-null but was passed a null value");
        }
        if (!jd7Var.a("averageRate")) {
            throw new IllegalArgumentException("Required argument \"averageRate\" is missing and does not have an android:defaultValue");
        }
        Float f = (Float) jd7Var.b("averageRate");
        if (f == null) {
            throw new IllegalArgumentException("Argument \"averageRate\" of type float does not support null values");
        }
        if (!jd7Var.a("rates")) {
            throw new IllegalArgumentException("Required argument \"rates\" is missing and does not have an android:defaultValue");
        }
        int[] iArr = (int[]) jd7Var.b("rates");
        if (iArr == null) {
            throw new IllegalArgumentException("Argument \"rates\" is marked as non-null but was passed a null value");
        }
        if (!jd7Var.a("ratesOnly")) {
            throw new IllegalArgumentException("Required argument \"ratesOnly\" is missing and does not have an android:defaultValue");
        }
        int[] iArr2 = (int[]) jd7Var.b("ratesOnly");
        if (iArr2 == null) {
            throw new IllegalArgumentException("Argument \"ratesOnly\" is marked as non-null but was passed a null value");
        }
        if (!jd7Var.a(ReviewResultDto.REVIEW_POST_ACTION_REVIEW)) {
            throw new IllegalArgumentException("Required argument \"review\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(ReviewDto.class) && !Serializable.class.isAssignableFrom(ReviewDto.class)) {
            throw new UnsupportedOperationException(ReviewDto.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        ReviewDto reviewDto = (ReviewDto) jd7Var.b(ReviewResultDto.REVIEW_POST_ACTION_REVIEW);
        if (!jd7Var.a("application")) {
            throw new IllegalArgumentException("Required argument \"application\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(ToolbarData.class) && !Serializable.class.isAssignableFrom(ToolbarData.class)) {
            throw new UnsupportedOperationException(ToolbarData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        ToolbarData toolbarData = (ToolbarData) jd7Var.b("application");
        if (toolbarData == null) {
            throw new IllegalArgumentException("Argument \"application\" is marked as non-null but was passed a null value");
        }
        this.B = new yr(str, str2, f.floatValue(), iArr, iArr2, reviewDto, toolbarData);
        this.C = reviewDto;
        this.E = true;
        ir.mservices.market.common.model.a aVar = vr2Var2.g;
        this.F = new vb7(new SubmitCommentRepository$getSubmitCommentStateFlow$$inlined$transform$1(aVar.h, null, str, aVar));
        this.G = new vb7(new SubmitCommentRepository$getCommentFlow$$inlined$transform$1(vr2Var.g.f, null, str));
        t32.b().l(this, false);
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
        bt2.G(y97.G(this), null, null, new AnonymousClass2(null), 3);
    }

    @Override // ir.mservices.market.viewModel.c, defpackage.k79
    public final void d() {
        super.d();
        t32.b().o(this);
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        this.E = true;
        p(new AppReviewsViewModel$doRequest$1(this, null));
    }

    public final void onEvent(ys5 ys5Var) {
        js3.p(ys5Var, "event");
        l lVar = this.y;
        lVar.getClass();
        lVar.p(null, ys5Var);
    }

    public final void r(float f) {
        Float fValueOf = Float.valueOf(f);
        l lVar = this.z;
        lVar.getClass();
        lVar.p(null, fValueOf);
        if (this.v.G(this.B.a)) {
            return;
        }
        Float fValueOf2 = Float.valueOf(0.0f);
        lVar.getClass();
        lVar.p(null, fValueOf2);
    }
}
