package defpackage;

import ir.mservices.market.gateway.GatewayItemData;
import ir.mservices.market.version2.webapi.responsedto.GatewayDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class sq2 extends c16 {
    public final List c;
    public final String d;
    public final int e;
    public final v48 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sq2(List list, String str, int i, v48 v48Var) {
        super(0);
        js3.p(str, "layoutMode");
        js3.p(v48Var, "selectedItem");
        this.c = list;
        this.d = str;
        this.e = i;
        this.f = v48Var;
    }

    @Override // defpackage.c16
    public final List e() {
        int size;
        String str = this.d;
        boolean zT = m88.T(str, "v2", true);
        List list = this.c;
        if (zT) {
            size = list.size();
        } else {
            size = list.size();
            int i = this.e;
            if (i <= size) {
                size = i;
            }
        }
        List listSubList = list.subList(0, size);
        ArrayList arrayList = new ArrayList(wu0.V(listSubList, 10));
        Iterator it = listSubList.iterator();
        while (it.hasNext()) {
            arrayList.add(new GatewayItemData((GatewayDTO) it.next(), "v1".equalsIgnoreCase(str) ? GatewayItemData.d : GatewayItemData.e, this.f));
        }
        return arrayList;
    }
}
