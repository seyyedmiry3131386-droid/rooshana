package ir.mservices.market.app.update;

import defpackage.bl4;
import defpackage.bz6;
import defpackage.g51;
import defpackage.l99;
import defpackage.q30;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wu0;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.version2.ui.recycler.filter.GeneralFilter;
import ir.mservices.market.version2.webapi.responsedto.ApplicationStateListDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.update.UpdateViewModel$fillData$6$1", f = "UpdateViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
public final class UpdateViewModel$fillData$6$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ UpdateViewModel a;
    public final /* synthetic */ l99 b;
    public final /* synthetic */ Map c;

    /* JADX INFO: renamed from: ir.mservices.market.app.update.UpdateViewModel$fillData$6$1$2, reason: invalid class name */
    final /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements qp2 {
        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((UpdateViewModel) this.receiver).setDivider((RecyclerItem) obj, (RecyclerItem) obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateViewModel$fillData$6$1(UpdateViewModel updateViewModel, l99 l99Var, Map map, g51 g51Var) {
        super(2, g51Var);
        this.a = updateViewModel;
        this.b = l99Var;
        this.c = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new UpdateViewModel$fillData$6$1(this.a, this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((UpdateViewModel$fillData$6$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        Object obj2 = this.b.a;
        Map map = this.c;
        q30 q30Var = new q30((ApplicationStateListDto) obj2, kotlin.collections.b.U(map));
        UpdateViewModel updateViewModel = this.a;
        updateViewModel.Z = q30Var;
        List listFillUpdateResult = updateViewModel.fillUpdateResult((ApplicationStateListDto) obj2, map);
        ArrayList arrayList = new ArrayList(wu0.V(listFillUpdateResult, 10));
        Iterator it = listFillUpdateResult.iterator();
        while (it.hasNext()) {
            bl4.G((MyketRecyclerData) it.next(), arrayList);
        }
        return new bz6(arrayList, (GeneralFilter) null, new AnonymousClass2(2, updateViewModel, UpdateViewModel.class, "setDivider", "setDivider(Lir/mservices/market/common/ui/recycler/RecyclerItem;Lir/mservices/market/common/ui/recycler/RecyclerItem;)Lir/mservices/market/common/ui/recycler/RecyclerItem;", 0), 2);
    }
}
