package ir.mservices.market.virtualKeyboard;

import defpackage.bl4;
import defpackage.bz6;
import defpackage.e71;
import defpackage.g51;
import defpackage.lm;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wu0;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.version2.ui.recycler.filter.GeneralFilter;
import ir.mservices.market.virtualKeyboard.recycler.VirtualKeyboardItemData;
import ir.mservices.market.virtualKeyboard.recycler.VirtualKeyboardRemoveData;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.virtualKeyboard.VirtualKeyboardView$createKeyboard$adapter$1$3", f = "VirtualKeyboardView.kt", l = {76}, m = "invokeSuspend", v = 1)
final class VirtualKeyboardView$createKeyboard$adapter$1$3 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ lm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VirtualKeyboardView$createKeyboard$adapter$1$3(lm lmVar, g51 g51Var) {
        super(2, g51Var);
        this.b = lmVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new VirtualKeyboardView$createKeyboard$adapter$1$3(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((VirtualKeyboardView$createKeyboard$adapter$1$3) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            new ArrayList();
            ArrayList arrayList = new ArrayList();
            for (int i2 = 1; i2 < 10; i2++) {
                arrayList.add(new VirtualKeyboardItemData(String.valueOf(i2), 1));
            }
            arrayList.add(new VirtualKeyboardItemData("0", 2));
            arrayList.add(new VirtualKeyboardRemoveData());
            ArrayList arrayList2 = new ArrayList(wu0.V(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                bl4.G((MyketRecyclerData) it.next(), arrayList2);
            }
            bz6 bz6Var = new bz6(arrayList2, (GeneralFilter) null, (qp2) null, 6);
            this.a = 1;
            if (this.b.L(bz6Var, this) == coroutineSingletons) {
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
