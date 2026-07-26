package ir.mservices.market.movie.ui.ibex;

import defpackage.bj2;
import defpackage.bt2;
import defpackage.e71;
import defpackage.g51;
import defpackage.ja1;
import defpackage.jd7;
import defpackage.js3;
import defpackage.pt1;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.y97;
import ir.mservices.market.movie.ui.ibex.IbexAction;
import ir.mservices.market.viewModel.a;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class IbexViewModel extends a {
    public final l v;
    public final rv6 w;
    public final l x;
    public final rv6 y;

    /* JADX INFO: renamed from: ir.mservices.market.movie.ui.ibex.IbexViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.movie.ui.ibex.IbexViewModel$1", f = "IbexViewModel.kt", l = {51}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return IbexViewModel.this.new AnonymousClass1(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            tx8 tx8Var = tx8.a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
                return tx8Var;
            }
            b.b(obj);
            IbexViewModel ibexViewModel = IbexViewModel.this;
            pv6 pv6Var = ibexViewModel.u;
            bj2 bj2Var = new bj2(3, ibexViewModel);
            this.a = 1;
            Object objA = pv6Var.a.a(new pt1(bj2Var, 7), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IbexViewModel(jd7 jd7Var) {
        super(false);
        js3.p(jd7Var, "savedStateHandle");
        if (!jd7Var.a("startCallback")) {
            throw new IllegalArgumentException("Required argument \"startCallback\" is missing and does not have an android:defaultValue");
        }
        if (!jd7Var.a("packageName")) {
            throw new IllegalArgumentException("Required argument \"packageName\" is missing and does not have an android:defaultValue");
        }
        if (!jd7Var.a("videoUrl")) {
            throw new IllegalArgumentException("Required argument \"videoUrl\" is missing and does not have an android:defaultValue");
        }
        if (!jd7Var.a("aparatVideoId")) {
            throw new IllegalArgumentException("Required argument \"aparatVideoId\" is missing and does not have an android:defaultValue");
        }
        if (!jd7Var.a("videoType")) {
            throw new IllegalArgumentException("Required argument \"videoType\" is missing and does not have an android:defaultValue");
        }
        if (((String) jd7Var.b("videoType")) == null) {
            throw new IllegalArgumentException("Argument \"videoType\" is marked as non-null but was passed a null value");
        }
        if (!jd7Var.a("videoDuration")) {
            throw new IllegalArgumentException("Required argument \"videoDuration\" is missing and does not have an android:defaultValue");
        }
        Long l = (Long) jd7Var.b("videoDuration");
        if (l == null) {
            throw new IllegalArgumentException("Argument \"videoDuration\" of type long does not support null values");
        }
        if (!jd7Var.a("orientation")) {
            throw new IllegalArgumentException("Required argument \"orientation\" is missing and does not have an android:defaultValue");
        }
        if (((Integer) jd7Var.b("orientation")) == null) {
            throw new IllegalArgumentException("Argument \"orientation\" of type integer does not support null values");
        }
        l lVarB = ja1.b(Boolean.FALSE);
        this.v = lVarB;
        this.w = new rv6(lVarB);
        l lVarB2 = ja1.b(l);
        this.x = lVarB2;
        this.y = new rv6(lVarB2);
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCallbackCalledAction(IbexAction.CallbackCalledAction callbackCalledAction) {
        l lVar;
        Object value;
        do {
            lVar = this.v;
            value = lVar.getValue();
            ((Boolean) value).getClass();
        } while (!lVar.n(value, Boolean.TRUE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onResetVideoDurationAction(IbexAction.ResetVideoDurationAction resetVideoDurationAction) {
        l lVar;
        Object value;
        do {
            lVar = this.x;
            value = lVar.getValue();
            ((Number) value).longValue();
        } while (!lVar.n(value, -1L));
    }
}
