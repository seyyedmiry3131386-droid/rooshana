package ir.mservices.market.app.update.recycler;

import defpackage.dw1;
import defpackage.fu7;
import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.o30;
import defpackage.v48;
import defpackage.wo2;
import defpackage.xe2;
import ir.mservices.market.common.data.ForceUpdateDto;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.version2.webapi.responsedto.ApplicationStateDto;

/* JADX INFO: loaded from: classes3.dex */
public final class AppUpdateData implements MyketRecyclerData, wo2, g32 {
    public static final int o = js6.update_card;
    public static final int p = js6.update_card_myket;
    public final xe2 a;
    public final fu7 b;
    public final o30 c;
    public final String d;
    public final fu7 e;
    public final xe2 f;
    public final xe2 g;
    public final v48 h;
    public final fu7 i;
    public final boolean j;
    public final ForceUpdateDto k;
    public ApplicationStateDto l;
    public boolean m;
    public float n;

    public AppUpdateData(xe2 xe2Var, fu7 fu7Var, o30 o30Var, String str, fu7 fu7Var2, xe2 xe2Var2, xe2 xe2Var3, v48 v48Var, fu7 fu7Var3, boolean z) {
        js3.p(xe2Var, "downloadInfoFlow");
        js3.p(fu7Var, "installStateFlow");
        js3.p(o30Var, "application");
        js3.p(fu7Var2, "downloadClickFlow");
        js3.p(xe2Var2, "commentStateFlow");
        js3.p(xe2Var3, "commentFlow");
        js3.p(v48Var, "isCommentSubmitted");
        js3.p(fu7Var3, "ratingFlow");
        this.a = xe2Var;
        this.b = fu7Var;
        this.c = o30Var;
        this.d = str;
        this.e = fu7Var2;
        this.f = xe2Var2;
        this.g = xe2Var3;
        this.h = v48Var;
        this.i = fu7Var3;
        this.j = z;
        ForceUpdateDto forceUpdateDto = o30Var.j;
        this.k = forceUpdateDto != null ? new ForceUpdateDto(forceUpdateDto.getFileLength(), forceUpdateDto.getDescription(), false, 4, null) : null;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return js3.i(this.c.n, NearbyRepository.SERVICE_ID) ? p : o;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AppUpdateData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.app.update.recycler.AppUpdateData");
        AppUpdateData appUpdateData = (AppUpdateData) obj;
        return this.n == appUpdateData.n && this.j == appUpdateData.j && this.m == appUpdateData.m;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.c.n;
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        String str = this.d;
        return dw1.g(this.n, (((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + (this.j ? 1231 : 1237)) * 31) + (this.m ? 1231 : 1237)) * 31, 31);
    }
}
