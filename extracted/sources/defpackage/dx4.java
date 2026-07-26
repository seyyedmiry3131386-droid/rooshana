package defpackage;

import ir.mservices.market.version2.webapi.requestdto.UpdateListDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class dx4 {
    public static final rl3 b = new rl3();
    public final dp3 a;

    public dx4(dp3 dp3Var) {
        js3.p(dp3Var, "installManager");
        this.a = dp3Var;
    }

    public final ArrayList a(List list) {
        if ((!list.isEmpty() ? list : null) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(wu0.V(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            rp3 rp3Var = (rp3) it.next();
            String str = rp3Var.a;
            int i = rp3Var.b;
            dp3 dp3Var = this.a;
            arrayList.add(new UpdateListDto(str, i, dp3Var.h(str), dp3Var.v(rp3Var.a)));
        }
        return arrayList;
    }
}
