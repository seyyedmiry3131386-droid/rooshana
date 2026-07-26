package ir.mservices.market.app.detail.subReviews;

import android.os.Parcelable;
import defpackage.bt2;
import defpackage.c5;
import defpackage.e71;
import defpackage.g51;
import defpackage.ht;
import defpackage.ja1;
import defpackage.jd7;
import defpackage.js3;
import defpackage.nm5;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.r4;
import defpackage.rn6;
import defpackage.t32;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vb7;
import defpackage.vr2;
import defpackage.vy2;
import defpackage.y97;
import defpackage.ys5;
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
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class AppSubReviewsViewModel extends c {
    public final l A;
    public final l B;
    public final vb7 C;
    public final vb7 D;
    public final pv6 E;
    public final rn6 t;
    public final c5 u;
    public final ht v;
    public boolean w;
    public final i x;
    public final pv6 y;
    public final l z;

    /* JADX INFO: renamed from: ir.mservices.market.app.detail.subReviews.AppSubReviewsViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.detail.subReviews.AppSubReviewsViewModel$1", f = "AppSubReviewsViewModel.kt", l = {67}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return AppSubReviewsViewModel.this.new AnonymousClass1(g51Var);
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
                AppSubReviewsViewModel appSubReviewsViewModel = AppSubReviewsViewModel.this;
                pv6 pv6Var = appSubReviewsViewModel.E;
                r4 r4Var = new r4(7, appSubReviewsViewModel);
                this.a = 1;
                if (pv6Var.a.a(r4Var, this) == coroutineSingletons) {
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
    public AppSubReviewsViewModel(rn6 rn6Var, c5 c5Var, vr2 vr2Var, vr2 vr2Var2, nm5 nm5Var, jd7 jd7Var) {
        super(true);
        js3.p(c5Var, "accountManager");
        js3.p(jd7Var, "savedStateHandle");
        this.t = rn6Var;
        this.u = c5Var;
        if (!jd7Var.a("packageName")) {
            throw new IllegalArgumentException("Required argument \"packageName\" is missing and does not have an android:defaultValue");
        }
        String str = (String) jd7Var.b("packageName");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"packageName\" is marked as non-null but was passed a null value");
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
        if (!jd7Var.a("launchSource")) {
            throw new IllegalArgumentException("Required argument \"launchSource\" is missing and does not have an android:defaultValue");
        }
        String str2 = (String) jd7Var.b("launchSource");
        if (!jd7Var.a("detailSubscriberId")) {
            throw new IllegalArgumentException("Required argument \"detailSubscriberId\" is missing and does not have an android:defaultValue");
        }
        String str3 = (String) jd7Var.b("detailSubscriberId");
        if (!jd7Var.a("reviewId")) {
            throw new IllegalArgumentException("Required argument \"reviewId\" is missing and does not have an android:defaultValue");
        }
        this.v = new ht(str, reviewDto, toolbarData, str2, str3, (String) jd7Var.b("reviewId"));
        this.w = true;
        i iVarE = vy2.e(0, 7, null);
        this.x = iVarE;
        this.y = new pv6(iVarE);
        this.z = ja1.b(reviewDto);
        this.A = ja1.b(null);
        this.B = ja1.b(0);
        this.C = new vb7(new SubmitCommentRepository$getCommentFlow$$inlined$transform$1(vr2Var.g.f, null, str));
        ir.mservices.market.common.model.a aVar = vr2Var2.g;
        this.D = new vb7(new SubmitCommentRepository$getSubmitCommentStateFlow$$inlined$transform$1(aVar.h, null, str, aVar));
        this.E = ((ir.mservices.market.common.model.a) nm5Var.b).l;
        t32.b().l(this, false);
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
    }

    @Override // ir.mservices.market.viewModel.c, defpackage.k79
    public final void d() {
        t32.b().o(this);
        super.d();
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        this.w = true;
        p(new AppSubReviewsViewModel$doRequest$1(this, null));
        bt2.G(y97.G(this), null, null, new AppSubReviewsViewModel$doRequest$2(this, null), 3);
    }

    public final void onEvent(ys5 ys5Var) {
        js3.p(ys5Var, "event");
        l lVar = this.A;
        lVar.getClass();
        lVar.p(null, ys5Var);
    }
}
