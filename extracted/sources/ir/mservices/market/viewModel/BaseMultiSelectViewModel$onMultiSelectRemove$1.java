package ir.mservices.market.viewModel;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.version2.ui.recycler.data.MultiSelectRecyclerData;
import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.viewModel.BaseMultiSelectViewModel$onMultiSelectRemove$1", f = "BaseMultiSelectViewModel.kt", l = {146}, m = "invokeSuspend", v = 1)
final class BaseMultiSelectViewModel$onMultiSelectRemove$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ BaseMultiSelectViewModel b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseMultiSelectViewModel$onMultiSelectRemove$1(BaseMultiSelectViewModel baseMultiSelectViewModel, g51 g51Var) {
        super(2, g51Var);
        this.b = baseMultiSelectViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new BaseMultiSelectViewModel$onMultiSelectRemove$1(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseMultiSelectViewModel$onMultiSelectRemove$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            BaseMultiSelectViewModel baseMultiSelectViewModel = this.b;
            i iVar = baseMultiSelectViewModel.x;
            ArrayList arrayList = baseMultiSelectViewModel.F;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                MyketRecyclerData myketRecyclerData = ((RecyclerItem) obj2).c;
                if (myketRecyclerData instanceof MultiSelectRecyclerData) {
                    MultiSelectRecyclerData multiSelectRecyclerData = (MultiSelectRecyclerData) myketRecyclerData;
                    if (multiSelectRecyclerData.f && ((Boolean) multiSelectRecyclerData.e.a.getValue()).booleanValue()) {
                        arrayList2.add(obj2);
                    }
                }
            }
            this.a = 1;
            if (iVar.emit(arrayList2, this) == coroutineSingletons) {
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
