package ir.mservices.market.social.list.common.app.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.vb7;
import ir.mservices.market.social.list.items.recycler.SelectableRecyclerData;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class ProfileAppData extends SelectableRecyclerData implements g32 {
    public static final int c = js6.holder_social_app;
    public final ApplicationDTO b;

    public ProfileAppData(ApplicationDTO applicationDTO, vb7 vb7Var) {
        super(vb7Var);
        this.b = applicationDTO;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return c;
    }

    @Override // ir.mservices.market.social.list.items.recycler.SelectableRecyclerData
    public final String a() {
        String packageName = this.b.getPackageName();
        js3.o(packageName, "getPackageName(...)");
        return packageName;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!ProfileAppData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.social.list.common.app.recycler.ProfileAppData");
        return js3.i(this.b, ((ProfileAppData) obj).b);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(this.b.hashCode());
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
