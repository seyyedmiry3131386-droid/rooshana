package defpackage;

import android.text.TextUtils;
import ir.mservices.market.myAccount.city.recycler.EmptyCityData;
import ir.mservices.market.myAccount.city.recycler.SelectCityHeaderData;
import ir.mservices.market.myAccount.city.recycler.SelectCityItemData;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class ks0 extends c16 {
    public final v48 c;
    public final ls0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ks0(v48 v48Var, ls0 ls0Var) {
        super(1);
        js3.p(v48Var, "query");
        js3.p(ls0Var, "citySource");
        this.c = v48Var;
        this.d = ls0Var;
    }

    @Override // defpackage.c16
    public final Object d() {
        ArrayList arrayList;
        v48 v48Var = this.c;
        String str = (String) v48Var.getValue();
        ls0 ls0Var = this.d;
        ls0Var.getClass();
        js3.p(str, "cityFilter");
        if (TextUtils.isEmpty(str)) {
            arrayList = ls0Var.b;
        } else {
            ArrayList arrayList2 = ls0Var.a;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (f88.c0((String) obj, str, false)) {
                    arrayList3.add(obj);
                }
            }
            arrayList = arrayList3;
        }
        ArrayList arrayList4 = new ArrayList();
        if (arrayList.isEmpty()) {
            arrayList4.add(new EmptyCityData());
        } else {
            String str2 = ls0Var.c;
            if (f88.n0(str2) || !f88.n0((CharSequence) v48Var.getValue())) {
                str2 = null;
            }
            if (str2 != null) {
                arrayList4.add(new SelectCityHeaderData(str2));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList4.add(new SelectCityItemData((String) it.next()));
            }
        }
        return new js0(arrayList4);
    }
}
