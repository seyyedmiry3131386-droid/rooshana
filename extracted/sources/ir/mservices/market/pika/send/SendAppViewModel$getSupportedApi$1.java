package ir.mservices.market.pika.send;

import defpackage.e71;
import defpackage.g51;
import defpackage.js3;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.v48;
import ir.mservices.market.pika.common.model.ByteArrayResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.b;
import kotlin.collections.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.pika.send.SendAppViewModel$getSupportedApi$1", f = "SendAppViewModel.kt", l = {149}, m = "invokeSuspend", v = 1)
final class SendAppViewModel$getSupportedApi$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ SendAppViewModel b;

    /* JADX INFO: renamed from: ir.mservices.market.pika.send.SendAppViewModel$getSupportedApi$1$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.pika.send.SendAppViewModel$getSupportedApi$1$1", f = "SendAppViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ SendAppViewModel b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SendAppViewModel sendAppViewModel, g51 g51Var) {
            super(2, g51Var);
            this.b = sendAppViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.b, g51Var);
            anonymousClass1.a = obj;
            return anonymousClass1;
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((List) obj, (g51) obj2);
            tx8 tx8Var = tx8.a;
            anonymousClass1.invokeSuspend(tx8Var);
            return tx8Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            b.b(obj);
            js3.p(list, "<this>");
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (ByteArrayResult.ConnectHandShake.class.isInstance(obj2)) {
                    arrayList.add(obj2);
                }
            }
            if (!arrayList.isEmpty()) {
                this.b.C = ((ByteArrayResult.ConnectHandShake) a.o0(arrayList)).getSupportedAbi();
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendAppViewModel$getSupportedApi$1(SendAppViewModel sendAppViewModel, g51 g51Var) {
        super(2, g51Var);
        this.b = sendAppViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new SendAppViewModel$getSupportedApi$1(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((SendAppViewModel$getSupportedApi$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            SendAppViewModel sendAppViewModel = this.b;
            v48 receivedByteArray = sendAppViewModel.u.getReceivedByteArray();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(sendAppViewModel, null);
            this.a = 1;
            if (d.f(receivedByteArray, anonymousClass1, this) == coroutineSingletons) {
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
