package ir.mservices.market.app.common.recycler;

import defpackage.fm3;
import defpackage.fu7;
import defpackage.g32;
import defpackage.jb7;
import defpackage.js3;
import defpackage.js6;
import defpackage.kz8;
import defpackage.pg;
import defpackage.pv1;
import defpackage.tn0;
import defpackage.vb7;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;

/* JADX INFO: loaded from: classes3.dex */
public class AppData implements MyketRecyclerData, kz8, g32, jb7, fm3 {
    public static final int d = js6.list_application_card;
    public final vb7 a;
    public final fu7 b;
    public final ApplicationDTO c;

    public AppData(vb7 vb7Var, fu7 fu7Var, ApplicationDTO applicationDTO) {
        js3.p(fu7Var, "installStateFlow");
        js3.p(applicationDTO, "application");
        this.a = vb7Var;
        this.b = fu7Var;
        this.c = applicationDTO;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public int U() {
        return d;
    }

    @Override // defpackage.fm3
    public final pv1 a() {
        return new pv1(2, this.c.isIncompatible());
    }

    @Override // defpackage.jb7
    public final pg b() {
        ApplicationDTO applicationDTO = this.c;
        return new pg(applicationDTO.getPackageName(), applicationDTO.getVersionCode(), applicationDTO.getForceUpdate());
    }

    @Override // defpackage.kz8
    public final tn0 c() {
        ApplicationDTO applicationDTO = this.c;
        return new tn0(applicationDTO.getPackageName(), applicationDTO.getVersionCode(), applicationDTO.getForceUpdate());
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public int d() {
        return 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!getClass().equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.app.common.recycler.AppData");
        return js3.i(this.c.getPackageName(), ((AppData) obj).c.getPackageName());
    }

    @Override // defpackage.g32
    public String getUniqueId() {
        String packageName = this.c.getPackageName();
        js3.o(packageName, "getPackageName(...)");
        return packageName;
    }

    public int hashCode() {
        return this.c.hashCode();
    }
}
