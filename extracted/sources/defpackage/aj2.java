package defpackage;

import ir.mservices.market.core.Font$FontStyle;
import ir.mservices.market.setting.fontStyle.ui.FontStyleItemData;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class aj2 extends c16 {
    public final v48 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj2(v48 v48Var) {
        super(0);
        js3.p(v48Var, "selectedFont");
        this.c = v48Var;
    }

    @Override // defpackage.c16
    public final List e() {
        List list = Font$FontStyle.g;
        ArrayList arrayList = new ArrayList(wu0.V(list, 10));
        w0 w0Var = new w0(0, (z0) list);
        while (w0Var.hasNext()) {
            arrayList.add(new FontStyleItemData((Font$FontStyle) w0Var.next(), this.c));
        }
        return arrayList;
    }
}
