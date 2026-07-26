package ir.mservices.market.securityShield;

import defpackage.br9;
import defpackage.bz6;
import defpackage.g51;
import defpackage.pq6;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wu0;
import ir.mservices.market.common.ui.recycler.DividerData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.securityShield.recycler.DeviceScanData;
import ir.mservices.market.securityShield.recycler.DeviceScanTipData;
import ir.mservices.market.securityShield.recycler.HarmFulAppViewData;
import ir.mservices.market.version2.ui.recycler.filter.GeneralFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.securityShield.SecurityShieldViewModel$doRequest$1", f = "SecurityShieldViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class SecurityShieldViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ DeviceScanData a;
    public final /* synthetic */ SecurityShieldViewModel b;

    /* JADX INFO: renamed from: ir.mservices.market.securityShield.SecurityShieldViewModel$doRequest$1$2, reason: invalid class name */
    final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements qp2 {
        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            RecyclerItem recyclerItem = (RecyclerItem) obj;
            RecyclerItem recyclerItem2 = (RecyclerItem) obj2;
            ((SecurityShieldViewModel) this.receiver).getClass();
            if (recyclerItem == null || recyclerItem2 == null) {
                return null;
            }
            MyketRecyclerData myketRecyclerData = recyclerItem2.c;
            MyketRecyclerData myketRecyclerData2 = recyclerItem.c;
            if (myketRecyclerData2 instanceof DeviceScanData) {
                DividerData dividerData = new DividerData();
                dividerData.b = false;
                dividerData.g = pq6.security_shield_padding;
                return new RecyclerItem(dividerData);
            }
            boolean z = myketRecyclerData2 instanceof HarmFulAppViewData;
            if (z && (myketRecyclerData instanceof DeviceScanTipData)) {
                DividerData dividerData2 = new DividerData();
                dividerData2.b = false;
                dividerData2.g = pq6.space_16;
                return new RecyclerItem(dividerData2);
            }
            if (!z || !(myketRecyclerData instanceof HarmFulAppViewData)) {
                return null;
            }
            DividerData dividerData3 = new DividerData();
            dividerData3.b = false;
            dividerData3.g = pq6.space_8;
            return new RecyclerItem(dividerData3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityShieldViewModel$doRequest$1(DeviceScanData deviceScanData, SecurityShieldViewModel securityShieldViewModel, g51 g51Var) {
        super(2, g51Var);
        this.a = deviceScanData;
        this.b = securityShieldViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new SecurityShieldViewModel$doRequest$1(this.a, this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((SecurityShieldViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        List listC = br9.C(this.a, new DeviceScanTipData());
        ArrayList arrayList = new ArrayList(wu0.V(listC, 10));
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            arrayList.add(new RecyclerItem((MyketRecyclerData) it.next()));
        }
        return new bz6(arrayList, (GeneralFilter) null, new AnonymousClass2(2, this.b, SecurityShieldViewModel.class, "setDivider", "setDivider(Lir/mservices/market/common/ui/recycler/RecyclerItem;Lir/mservices/market/common/ui/recycler/RecyclerItem;)Lir/mservices/market/common/ui/recycler/RecyclerItem;", 0), 2);
    }
}
