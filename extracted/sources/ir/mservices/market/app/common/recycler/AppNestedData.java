package ir.mservices.market.app.common.recycler;

import defpackage.fu7;
import defpackage.g32;
import defpackage.is3;
import defpackage.js3;
import defpackage.js6;
import defpackage.xe2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;

/* JADX INFO: loaded from: classes3.dex */
public class AppNestedData implements MyketRecyclerData, g32 {
    public static final int j = js6.app_card;
    public static final int k = js6.app_card_digested;
    public static final int l = js6.multi_app_card;
    public static final int m = js6.multi_app_card_digested;
    public final ApplicationDTO a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final xe2 e;
    public final fu7 f;
    public final int g;
    public boolean h;
    public final String i;

    public AppNestedData(ApplicationDTO applicationDTO, String str, boolean z, boolean z2, xe2 xe2Var, fu7 fu7Var, int i) {
        js3.p(str, "listName");
        js3.p(fu7Var, "installStateFlow");
        this.a = applicationDTO;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = xe2Var;
        this.f = fu7Var;
        this.g = i;
        long j2 = is3.p + 1;
        is3.p = j2;
        this.i = String.valueOf(j2);
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        boolean z = this.d;
        boolean z2 = this.c;
        return (z2 && z) ? m : z2 ? l : z ? k : j;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.app.common.recycler.AppNestedData");
        AppNestedData appNestedData = (AppNestedData) obj;
        return js3.i(this.a, appNestedData.a) && js3.i(this.b, appNestedData.b);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.i;
    }

    public final int hashCode() {
        ApplicationDTO applicationDTO = this.a;
        return this.b.hashCode() + ((applicationDTO != null ? applicationDTO.hashCode() : 0) * 31);
    }
}
