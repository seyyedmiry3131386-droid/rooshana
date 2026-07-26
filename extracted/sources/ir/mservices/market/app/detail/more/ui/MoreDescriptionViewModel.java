package ir.mservices.market.app.detail.more.ui;

import android.os.Parcelable;
import defpackage.a77;
import defpackage.bt2;
import defpackage.dp3;
import defpackage.e71;
import defpackage.f88;
import defpackage.g51;
import defpackage.ja1;
import defpackage.jd7;
import defpackage.js3;
import defpackage.k68;
import defpackage.kf1;
import defpackage.lw;
import defpackage.qp2;
import defpackage.sl3;
import defpackage.tb1;
import defpackage.tx4;
import defpackage.tx8;
import defpackage.ug1;
import defpackage.up1;
import defpackage.y97;
import ir.mservices.market.app.detail.data.MoreDescriptionData;
import ir.mservices.market.appDetail.ToolbarData;
import ir.mservices.market.viewModel.c;
import java.io.Serializable;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class MoreDescriptionViewModel extends c {
    public final sl3 t;
    public final tx4 u;
    public final l v;

    /* JADX INFO: renamed from: ir.mservices.market.app.detail.more.ui.MoreDescriptionViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.detail.more.ui.MoreDescriptionViewModel$1", f = "MoreDescriptionViewModel.kt", l = {36}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        /* JADX INFO: renamed from: ir.mservices.market.app.detail.more.ui.MoreDescriptionViewModel$1$1, reason: invalid class name and collision with other inner class name */
        @tb1(c = "ir.mservices.market.app.detail.more.ui.MoreDescriptionViewModel$1$1", f = "MoreDescriptionViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
        final class C00161 extends SuspendLambda implements qp2 {
            public final /* synthetic */ MoreDescriptionViewModel a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00161(MoreDescriptionViewModel moreDescriptionViewModel, g51 g51Var) {
                super(2, g51Var);
                this.a = moreDescriptionViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final g51 create(Object obj, g51 g51Var) {
                return new C00161(this.a, g51Var);
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                C00161 c00161 = (C00161) create((e71) obj, (g51) obj2);
                tx8 tx8Var = tx8.a;
                c00161.invokeSuspend(tx8Var);
                return tx8Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                String strI;
                String diffCheckSum;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                b.b(obj);
                MoreDescriptionViewModel moreDescriptionViewModel = this.a;
                MoreDescriptionData moreDescriptionData = moreDescriptionViewModel.u.a;
                String diffSize = moreDescriptionData.getDiffSize();
                if (diffSize == null || f88.n0(diffSize) || (diffCheckSum = moreDescriptionData.getDiffCheckSum()) == null || f88.n0(diffCheckSum)) {
                    moreDescriptionData = null;
                }
                if (moreDescriptionData != null) {
                    l lVar = moreDescriptionViewModel.v;
                    String packageName = moreDescriptionData.getPackageName();
                    try {
                        String strB = dp3.B(packageName);
                        try {
                            String str = k68.e;
                            strI = a77.i(strB);
                        } catch (Exception e) {
                            lw.g(e, "Exception in computing checksum", "packageName=".concat(packageName));
                            strI = null;
                        }
                    } catch (Exception unused) {
                    }
                    Boolean boolValueOf = Boolean.valueOf(strI != null ? strI.equals(moreDescriptionData.getDiffCheckSum()) : false);
                    lVar.getClass();
                    lVar.p(null, boolValueOf);
                }
                return tx8.a;
            }
        }

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return MoreDescriptionViewModel.this.new AnonymousClass1(g51Var);
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
                ug1 ug1Var = up1.a;
                kf1 kf1Var = kf1.c;
                C00161 c00161 = new C00161(MoreDescriptionViewModel.this, null);
                this.a = 1;
                if (bt2.Z(kf1Var, c00161, this) == coroutineSingletons) {
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
    public MoreDescriptionViewModel(jd7 jd7Var, sl3 sl3Var) {
        super(true);
        js3.p(jd7Var, "savedStateHandle");
        this.t = sl3Var;
        if (!jd7Var.a("descriptionData")) {
            throw new IllegalArgumentException("Required argument \"descriptionData\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(MoreDescriptionData.class) && !Serializable.class.isAssignableFrom(MoreDescriptionData.class)) {
            throw new UnsupportedOperationException(MoreDescriptionData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        MoreDescriptionData moreDescriptionData = (MoreDescriptionData) jd7Var.b("descriptionData");
        if (moreDescriptionData == null) {
            throw new IllegalArgumentException("Argument \"descriptionData\" is marked as non-null but was passed a null value");
        }
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
        this.u = new tx4(moreDescriptionData, toolbarData);
        this.v = ja1.b(Boolean.FALSE);
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        p(new MoreDescriptionViewModel$doRequest$1(this, null));
    }
}
