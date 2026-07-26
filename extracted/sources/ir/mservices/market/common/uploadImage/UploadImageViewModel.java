package ir.mservices.market.common.uploadImage;

import android.net.Uri;
import defpackage.bt2;
import defpackage.c09;
import defpackage.e71;
import defpackage.f88;
import defpackage.g51;
import defpackage.ja1;
import defpackage.js3;
import defpackage.m88;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.rv6;
import defpackage.s71;
import defpackage.t32;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vc8;
import defpackage.xk6;
import defpackage.y97;
import ir.mservices.market.common.uploadImage.UploadImageAction;
import ir.mservices.market.viewModel.a;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class UploadImageViewModel extends a {
    public final c09 v;
    public String w;
    public final l x;
    public final rv6 y;

    /* JADX INFO: renamed from: ir.mservices.market.common.uploadImage.UploadImageViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.common.uploadImage.UploadImageViewModel$1", f = "UploadImageViewModel.kt", l = {92}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return UploadImageViewModel.this.new AnonymousClass1(g51Var);
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
            UploadImageViewModel uploadImageViewModel = UploadImageViewModel.this;
            pv6 pv6Var = uploadImageViewModel.u;
            xk6 xk6Var = new xk6(26, uploadImageViewModel);
            this.a = 1;
            Object objA = pv6Var.a.a(new vc8(xk6Var, 7), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.common.uploadImage.UploadImageViewModel$onImagePathAction$2, reason: invalid class name */
    @tb1(c = "ir.mservices.market.common.uploadImage.UploadImageViewModel$onImagePathAction$2", f = "UploadImageViewModel.kt", l = {51, 52, 54, 56, 62}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public Object a;
        public int b;
        public final /* synthetic */ UploadImageAction.ImagePathAction d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(UploadImageAction.ImagePathAction imagePathAction, g51 g51Var) {
            super(2, g51Var);
            this.d = imagePathAction;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return UploadImageViewModel.this.new AnonymousClass2(this.d, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:45:0x0194  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x019f  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x01dd A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x01de A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instruction units count: 485
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.common.uploadImage.UploadImageViewModel.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadImageViewModel(c09 c09Var) {
        super(false);
        js3.p(c09Var, "uploadImageRepository");
        this.v = c09Var;
        l lVarB = ja1.b(null);
        this.x = lVarB;
        this.y = new rv6(lVarB);
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
        t32.b().l(this, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onImagePathAction(UploadImageAction.ImagePathAction imagePathAction) {
        l lVar;
        Object value;
        String path = imagePathAction.getPath();
        if (path != null && !f88.n0(path)) {
            bt2.G(y97.G(this), null, null, new AnonymousClass2(imagePathAction, null), 3);
            return;
        }
        do {
            lVar = this.x;
            value = lVar.getValue();
        } while (!lVar.n(value, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSubscriberIdAction(UploadImageAction.SubscriberIdAction subscriberIdAction) {
        this.w = subscriberIdAction.getId();
    }

    @Override // ir.mservices.market.viewModel.c, defpackage.k79
    public final void d() {
        super.d();
        t32.b().o(this);
    }

    public final void onEvent(s71 s71Var) {
        Uri uri;
        js3.p(s71Var, "event");
        if (!m88.T(this.w, s71Var.c, true) || (uri = s71Var.a) == null) {
            return;
        }
        r(new UploadImageAction.ImagePathAction(uri.getPath()));
        t32.b().m(s71Var);
    }
}
