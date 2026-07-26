package ir.mservices.market.common.ui.recycler;

import defpackage.bl4;
import defpackage.js3;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class RecyclerItem implements Serializable {
    public int a;
    public final int b;
    public final MyketRecyclerData c;
    public int d;

    public RecyclerItem(MyketRecyclerData myketRecyclerData) {
        js3.p(myketRecyclerData, "data");
        int iD = myketRecyclerData.d();
        int iU = myketRecyclerData.U();
        this.a = iD;
        this.b = iU;
        this.c = myketRecyclerData;
        this.d = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecyclerItem)) {
            return false;
        }
        RecyclerItem recyclerItem = (RecyclerItem) obj;
        return this.a == recyclerItem.a && this.b == recyclerItem.b && js3.i(this.c, recyclerItem.c) && this.d == recyclerItem.d;
    }

    public final int hashCode() {
        return ((this.c.hashCode() + (((this.a * 31) + this.b) * 31)) * 31) + this.d;
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.d;
        StringBuilder sbB = bl4.B(i, this.b, "RecyclerItem(span=", ", viewType=", ", data=");
        sbB.append(this.c);
        sbB.append(", cumulativeSpan=");
        sbB.append(i2);
        sbB.append(")");
        return sbB.toString();
    }
}
