package ir.mservices.market.feedback;

import android.content.Context;
import android.os.Parcelable;
import defpackage.ba2;
import defpackage.bt2;
import defpackage.c5;
import defpackage.ca2;
import defpackage.dp2;
import defpackage.e71;
import defpackage.fw4;
import defpackage.g51;
import defpackage.ja1;
import defpackage.jd7;
import defpackage.js3;
import defpackage.lw8;
import defpackage.pa2;
import defpackage.pt1;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.qq4;
import defpackage.qu2;
import defpackage.r4;
import defpackage.r92;
import defpackage.rs6;
import defpackage.ru7;
import defpackage.rv6;
import defpackage.sj8;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vy2;
import defpackage.y92;
import defpackage.y97;
import ir.mservices.market.data.SpinnerItem;
import ir.mservices.market.feedback.FeedbackAction;
import ir.mservices.market.feedback.data.TransactionData;
import ir.mservices.market.viewModel.a;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.h;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class FeedbackViewModel extends a {
    public int A;
    public final ArrayList B;
    public final boolean C;
    public final ca2 D;
    public final r92 E;
    public final l F;
    public final i G;
    public final pv6 H;
    public final i I;
    public final pv6 J;
    public final l K;
    public final i L;
    public final l M;
    public final l N;
    public final l O;
    public final l P;
    public final l Q;
    public final rv6 R;
    public final qq4 v;
    public final lw8 w;
    public final qu2 x;
    public final c5 y;
    public final fw4 z;

    /* JADX INFO: renamed from: ir.mservices.market.feedback.FeedbackViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.feedback.FeedbackViewModel$1", f = "FeedbackViewModel.kt", l = {311}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return FeedbackViewModel.this.new AnonymousClass1(g51Var);
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
            FeedbackViewModel feedbackViewModel = FeedbackViewModel.this;
            pv6 pv6Var = feedbackViewModel.u;
            r4 r4Var = new r4(28, feedbackViewModel);
            this.a = 1;
            Object objA = pv6Var.a.a(new pt1(r4Var, 2), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.feedback.FeedbackViewModel$2, reason: invalid class name */
    @tb1(c = "ir.mservices.market.feedback.FeedbackViewModel$2", f = "FeedbackViewModel.kt", l = {105}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public int a;

        /* JADX INFO: renamed from: ir.mservices.market.feedback.FeedbackViewModel$2$1, reason: invalid class name */
        @tb1(c = "ir.mservices.market.feedback.FeedbackViewModel$2$1", f = "FeedbackViewModel.kt", l = {120}, m = "invokeSuspend", v = 1)
        final class AnonymousClass1 extends SuspendLambda implements qp2 {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ FeedbackViewModel c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(FeedbackViewModel feedbackViewModel, g51 g51Var) {
                super(2, g51Var);
                this.c = feedbackViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final g51 create(Object obj, g51 g51Var) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.c, g51Var);
                anonymousClass1.b = obj;
                return anonymousClass1;
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass1) create((SpinnerItem) obj, (g51) obj2)).invokeSuspend(tx8.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object value;
                Object ba2Var;
                String value2;
                SpinnerItem spinnerItem = (SpinnerItem) this.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                int i = this.a;
                if (i == 0) {
                    b.b(obj);
                    FeedbackViewModel feedbackViewModel = this.c;
                    if (spinnerItem != null && (value2 = spinnerItem.getValue()) != null) {
                        String string = ((Context) feedbackViewModel.v.b).getString(rs6.feedback_spinner_value_payment);
                        js3.o(string, "getString(...)");
                        if (value2.equalsIgnoreCase(string)) {
                            value2 = null;
                        }
                        if (value2 != null) {
                            feedbackViewModel.F.o(null);
                        }
                    }
                    l lVar = feedbackViewModel.O;
                    do {
                        value = lVar.getValue();
                        ba2Var = (ca2) value;
                        if (!(feedbackViewModel.D instanceof y92)) {
                            ba2Var = new ba2(spinnerItem != null ? spinnerItem.getTitle() : null);
                        }
                    } while (!lVar.n(value, ba2Var));
                    i iVar = feedbackViewModel.G;
                    Boolean bool = Boolean.TRUE;
                    this.b = null;
                    this.a = 1;
                    if (iVar.emit(bool, this) == coroutineSingletons) {
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

        public AnonymousClass2(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return FeedbackViewModel.this.new AnonymousClass2(g51Var);
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
                FeedbackViewModel feedbackViewModel = FeedbackViewModel.this;
                l lVar = feedbackViewModel.K;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(feedbackViewModel, null);
                this.a = 1;
                if (d.f(lVar, anonymousClass1, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: ir.mservices.market.feedback.FeedbackViewModel$onRemoveImageAction$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.feedback.FeedbackViewModel$onRemoveImageAction$1", f = "FeedbackViewModel.kt", l = {299}, m = "invokeSuspend", v = 1)
    public static final class C01861 extends SuspendLambda implements qp2 {
        public int a;

        public C01861(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return FeedbackViewModel.this.new C01861(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C01861) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            FeedbackViewModel feedbackViewModel = FeedbackViewModel.this;
            if (i == 0) {
                b.b(obj);
                i iVar = feedbackViewModel.L;
                Boolean bool = Boolean.TRUE;
                this.a = 1;
                if (iVar.emit(bool, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
            }
            l lVar = feedbackViewModel.P;
            do {
                value = lVar.getValue();
                ((Boolean) value).getClass();
            } while (!lVar.n(value, Boolean.FALSE));
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeedbackViewModel(jd7 jd7Var, qq4 qq4Var, lw8 lw8Var, qu2 qu2Var, c5 c5Var, fw4 fw4Var) {
        ca2 ba2Var;
        super(true);
        js3.p(jd7Var, "savedStateHandle");
        js3.p(lw8Var, "uiUtils");
        js3.p(qu2Var, "googleUtils");
        js3.p(c5Var, "accountManager");
        js3.p(fw4Var, "miuiUtils");
        this.v = qq4Var;
        this.w = lw8Var;
        this.x = qu2Var;
        this.y = c5Var;
        this.z = fw4Var;
        this.A = -1;
        this.B = new ArrayList();
        if (!jd7Var.a("packageName")) {
            throw new IllegalArgumentException("Required argument \"packageName\" is missing and does not have an android:defaultValue");
        }
        String str = (String) jd7Var.b("packageName");
        if (!jd7Var.a("title")) {
            throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
        }
        String str2 = (String) jd7Var.b("title");
        if (!jd7Var.a("scenario")) {
            throw new IllegalArgumentException("Required argument \"scenario\" is missing and does not have an android:defaultValue");
        }
        String str3 = (String) jd7Var.b("scenario");
        if (!jd7Var.a("select")) {
            throw new IllegalArgumentException("Required argument \"select\" is missing and does not have an android:defaultValue");
        }
        String str4 = (String) jd7Var.b("select");
        if (!jd7Var.a("focus")) {
            throw new IllegalArgumentException("Required argument \"focus\" is missing and does not have an android:defaultValue");
        }
        Boolean bool = (Boolean) jd7Var.b("focus");
        if (bool == null) {
            throw new IllegalArgumentException("Argument \"focus\" of type boolean does not support null values");
        }
        if (!jd7Var.a("transactionData")) {
            throw new IllegalArgumentException("Required argument \"transactionData\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(TransactionData.class) && !Serializable.class.isAssignableFrom(TransactionData.class)) {
            throw new UnsupportedOperationException(TransactionData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        TransactionData transactionData = (TransactionData) jd7Var.b("transactionData");
        this.E = new r92(str, str2, str3, str4, bool.booleanValue(), transactionData);
        this.C = transactionData == null;
        if (transactionData != null) {
            String string = ((Context) qq4Var.b).getString(rs6.feedback_spinner_title_payment);
            js3.o(string, "getString(...)");
            ba2Var = new y92(string);
        } else {
            ba2Var = new ba2(null);
        }
        this.D = ba2Var;
        this.F = ja1.b(transactionData);
        i iVarE = vy2.e(0, 7, null);
        this.G = iVarE;
        this.H = new pv6(iVarE);
        i iVarE2 = vy2.e(0, 7, null);
        this.I = iVarE2;
        this.J = new pv6(iVarE2);
        this.K = ja1.b(null);
        this.L = vy2.e(0, 7, null);
        l lVarB = ja1.b(new ba2(null));
        this.M = lVarB;
        this.N = ja1.b(new ba2(null));
        this.O = ja1.b(ba2Var);
        Boolean bool2 = Boolean.FALSE;
        l lVarB2 = ja1.b(bool2);
        this.P = lVarB2;
        this.Q = ja1.b(null);
        this.R = d.A(new h(lVarB, lVarB2, new FeedbackViewModel$viewIsDirty$1(3, null)), y97.G(this), ru7.a, bool2);
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
        bt2.G(y97.G(this), null, null, new AnonymousClass2(null), 3);
    }

    private final void getInfo(String str, dp2 dp2Var) {
        this.x.a(new pa2(this, str, dp2Var, 0), 5000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRemoveImageAction(FeedbackAction.RemoveImageAction removeImageAction) {
        bt2.G(y97.G(this), null, null, new C01861(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSelectImageAction(FeedbackAction.SelectImageAction selectImageAction) {
        l lVar;
        Object value;
        l lVar2;
        Object value2;
        do {
            lVar = this.Q;
            value = lVar.getValue();
        } while (!lVar.n(value, selectImageAction.getSelectedImage()));
        do {
            lVar2 = this.P;
            value2 = lVar2.getValue();
            ((Boolean) value2).getClass();
        } while (!lVar2.n(value2, Boolean.valueOf(selectImageAction.getSelectedImage() != null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tx8 sendFeedback$lambda$2(FeedbackViewModel feedbackViewModel, String str, TransactionData transactionData, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        js3.p(str8, "info");
        bt2.G(y97.G(feedbackViewModel), null, null, new FeedbackViewModel$sendFeedback$4$1(str, transactionData, str2, str3, str4, str8, feedbackViewModel, str5, str6, str7, null), 3);
        return tx8.a;
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        p(new FeedbackViewModel$doRequest$1(this, null));
    }

    public final void v() {
        l lVar;
        Object value;
        l lVar2;
        Object value2;
        l lVar3;
        Object value3;
        l lVar4;
        Object value4;
        do {
            lVar = this.P;
            value = lVar.getValue();
            ((Boolean) value).getClass();
        } while (!lVar.n(value, Boolean.FALSE));
        sj8.b();
        do {
            lVar2 = this.N;
            value2 = lVar2.getValue();
        } while (!lVar2.n(value2, (ca2) value2));
        do {
            lVar3 = this.O;
            value3 = lVar3.getValue();
        } while (!lVar3.n(value3, (ca2) value3));
        do {
            lVar4 = this.M;
            value4 = lVar4.getValue();
        } while (!lVar4.n(value4, (ca2) value4));
    }

    public final void w() {
        bt2.G(y97.G(this), null, null, new FeedbackViewModel$refreshState$1(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(final java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.feedback.FeedbackViewModel.x(java.lang.String):void");
    }
}
