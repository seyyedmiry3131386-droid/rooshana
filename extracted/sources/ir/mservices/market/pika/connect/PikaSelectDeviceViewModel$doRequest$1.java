package ir.mservices.market.pika.connect;

import defpackage.br9;
import defpackage.bz6;
import defpackage.e71;
import defpackage.g51;
import defpackage.js3;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.v48;
import defpackage.wu0;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.pika.common.model.EndPointInfo;
import ir.mservices.market.pika.connect.recycler.EndPointData;
import ir.mservices.market.pika.connect.recycler.PikaSelectDeviceTitleData;
import ir.mservices.market.version2.ui.recycler.filter.GeneralFilter;
import java.util.ArrayList;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.pika.connect.PikaSelectDeviceViewModel$doRequest$1", f = "PikaSelectDeviceViewModel.kt", l = {22}, m = "invokeSuspend", v = 1)
final class PikaSelectDeviceViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ PikaSelectDeviceViewModel b;

    /* JADX INFO: renamed from: ir.mservices.market.pika.connect.PikaSelectDeviceViewModel$doRequest$1$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.pika.connect.PikaSelectDeviceViewModel$doRequest$1$1", f = "PikaSelectDeviceViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public /* synthetic */ Object a;
        public final /* synthetic */ PikaSelectDeviceViewModel b;

        /* JADX INFO: renamed from: ir.mservices.market.pika.connect.PikaSelectDeviceViewModel$doRequest$1$1$1, reason: invalid class name and collision with other inner class name */
        @tb1(c = "ir.mservices.market.pika.connect.PikaSelectDeviceViewModel$doRequest$1$1$1", f = "PikaSelectDeviceViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
        final class C00271 extends SuspendLambda implements qp2 {
            public final /* synthetic */ List a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00271(List list, g51 g51Var) {
                super(2, g51Var);
                this.a = list;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final g51 create(Object obj, g51 g51Var) {
                return new C00271(this.a, g51Var);
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                return ((C00271) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                b.b(obj);
                ArrayList arrayListE = br9.E(new RecyclerItem(new PikaSelectDeviceTitleData()));
                List<EndPointInfo> list = this.a;
                ArrayList arrayList = new ArrayList(wu0.V(list, 10));
                for (EndPointInfo endPointInfo : list) {
                    String endPintId = endPointInfo.getEndPintId();
                    String str = endPointInfo.getInfo().a;
                    js3.o(str, "getEndpointName(...)");
                    arrayList.add(new RecyclerItem(new EndPointData(endPintId, str)));
                }
                arrayListE.addAll(arrayList);
                return new bz6(arrayListE, (GeneralFilter) null, (qp2) null, 6);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PikaSelectDeviceViewModel pikaSelectDeviceViewModel, g51 g51Var) {
            super(2, g51Var);
            this.b = pikaSelectDeviceViewModel;
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
            this.b.p(new C00271(list, null));
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PikaSelectDeviceViewModel$doRequest$1(PikaSelectDeviceViewModel pikaSelectDeviceViewModel, g51 g51Var) {
        super(2, g51Var);
        this.b = pikaSelectDeviceViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new PikaSelectDeviceViewModel$doRequest$1(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((PikaSelectDeviceViewModel$doRequest$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            PikaSelectDeviceViewModel pikaSelectDeviceViewModel = this.b;
            v48 endPoints = pikaSelectDeviceViewModel.t.getEndPoints();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(pikaSelectDeviceViewModel, null);
            this.a = 1;
            if (d.f(endPoints, anonymousClass1, this) == coroutineSingletons) {
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
