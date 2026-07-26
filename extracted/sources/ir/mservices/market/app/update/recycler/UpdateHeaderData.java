package ir.mservices.market.app.update.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.rv6;
import defpackage.to2;
import defpackage.v48;
import defpackage.wo2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class UpdateHeaderData implements MyketRecyclerData, wo2, to2, g32 {
    public static final int d = js6.update_header;
    public final v48 a;
    public final v48 b;
    public final boolean c;

    public UpdateHeaderData(l lVar, rv6 rv6Var, boolean z) {
        js3.p(lVar, "updateCountFlow");
        js3.p(rv6Var, "updateProgressCountFlow");
        this.a = lVar;
        this.b = rv6Var;
        this.c = z;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return d;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !UpdateHeaderData.class.equals(obj.getClass())) {
            return false;
        }
        UpdateHeaderData updateHeaderData = (UpdateHeaderData) obj;
        return ((Number) this.a.getValue()).intValue() == ((Number) updateHeaderData.a.getValue()).intValue() && ((Boolean) this.b.getValue()).booleanValue() == ((Boolean) updateHeaderData.b.getValue()).booleanValue() && this.c == updateHeaderData.c;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return "UpdateHeaderData";
    }

    public final int hashCode() {
        return (((((Number) this.a.getValue()).intValue() * 31) + (((Boolean) this.b.getValue()).booleanValue() ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
    }
}
