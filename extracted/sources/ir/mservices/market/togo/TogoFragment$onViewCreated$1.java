package ir.mservices.market.togo;

import com.google.gson.reflect.TypeToken;
import defpackage.dp2;
import defpackage.g51;
import defpackage.h99;
import defpackage.j99;
import defpackage.l99;
import defpackage.n99;
import defpackage.qp2;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vv2;
import ir.mservices.market.common.uploadImage.UploadImageAction;
import ir.mservices.market.common.uploadImage.data.UploadImageDto;
import ir.mservices.market.togo.TogoAction;
import ir.mservices.market.togo.data.AttachImageCallbackData;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.togo.TogoFragment$onViewCreated$1", f = "TogoFragment.kt", l = {331}, m = "invokeSuspend", v = 1)
final class TogoFragment$onViewCreated$1 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ TogoFragment b;

    /* JADX INFO: renamed from: ir.mservices.market.togo.TogoFragment$onViewCreated$1$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.togo.TogoFragment$onViewCreated$1$1", f = "TogoFragment.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ TogoFragment b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TogoFragment togoFragment, g51 g51Var) {
            super(2, g51Var);
            this.b = togoFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((n99) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            n99 n99Var = (n99) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            kotlin.b.b(obj);
            int i = TogoFragment.o1;
            TogoFragment togoFragment = this.b;
            AttachImageCallbackData attachImageCallbackData = (AttachImageCallbackData) togoFragment.n1().G.a.getValue();
            if (attachImageCallbackData != null) {
                vv2 vv2Var = new vv2();
                int i2 = 1;
                String str = null;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                Object[] objArr3 = 0;
                if (n99Var instanceof l99) {
                    togoFragment.k1(attachImageCallbackData.getSuccessCallback(), vv2Var.g(((l99) n99Var).a, new TypeToken<UploadImageDto>() { // from class: ir.mservices.market.togo.TogoFragment$onViewCreated$1$1$1$successResponse$1
                    }.getType()));
                    togoFragment.o1().r(new UploadImageAction.ImagePathAction(str, i2, objArr3 == true ? 1 : 0));
                    togoFragment.n1().r(new TogoAction.AttachImageAction(null, 1, null));
                } else if (n99Var instanceof h99) {
                    togoFragment.k1(attachImageCallbackData.getErrorCallback(), vv2Var.g(((h99) n99Var).a, new TypeToken<ErrorDTO>() { // from class: ir.mservices.market.togo.TogoFragment$onViewCreated$1$1$1$errorResponse$1
                    }.getType()));
                    togoFragment.o1().r(new UploadImageAction.ImagePathAction(objArr2 == true ? 1 : 0, i2, objArr == true ? 1 : 0));
                    togoFragment.n1().r(new TogoAction.AttachImageAction(null, 1, null));
                } else if (n99Var instanceof j99) {
                    togoFragment.k1(attachImageCallbackData.getStartCallback(), null);
                }
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TogoFragment$onViewCreated$1(TogoFragment togoFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = togoFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new TogoFragment$onViewCreated$1(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((TogoFragment$onViewCreated$1) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            int i2 = TogoFragment.o1;
            TogoFragment togoFragment = this.b;
            rv6 rv6Var = togoFragment.o1().y;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(togoFragment, null);
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
