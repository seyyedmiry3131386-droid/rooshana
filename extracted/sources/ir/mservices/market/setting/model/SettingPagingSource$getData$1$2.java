package ir.mservices.market.setting.model;

import defpackage.qp2;
import ir.mservices.market.common.ui.recycler.DividerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class SettingPagingSource$getData$1$2 extends FunctionReferenceImpl implements qp2 {
    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        RecyclerItem recyclerItem = (RecyclerItem) obj;
        RecyclerItem recyclerItem2 = (RecyclerItem) obj2;
        ((a) this.receiver).getClass();
        if (recyclerItem == null || recyclerItem2 == null) {
            return null;
        }
        DividerData dividerData = new DividerData();
        dividerData.b = false;
        return new RecyclerItem(dividerData);
    }
}
