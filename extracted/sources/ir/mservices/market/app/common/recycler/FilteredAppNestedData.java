package ir.mservices.market.app.common.recycler;

import defpackage.cs1;
import defpackage.d9;
import defpackage.fm3;
import defpackage.fu7;
import defpackage.jb7;
import defpackage.js3;
import defpackage.kz8;
import defpackage.pg;
import defpackage.pv1;
import defpackage.tn0;
import defpackage.vy2;
import defpackage.xe2;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class FilteredAppNestedData extends AppNestedData implements kz8, fm3, jb7 {
    /* JADX WARN: Illegal instructions before constructor call */
    public FilteredAppNestedData(ApplicationDTO applicationDTO, String str, boolean z, xe2 xe2Var, fu7 fu7Var, boolean z2, int i, int i2) {
        z2 = (i & 32) != 0 ? false : z2;
        js3.p(fu7Var, "installStateFlow");
        super(applicationDTO, str, z, z2, xe2Var, fu7Var, 2);
    }

    @Override // defpackage.fm3
    public final pv1 a() {
        ApplicationDTO applicationDTO = this.a;
        if (applicationDTO != null) {
            return new pv1(2, applicationDTO.isIncompatible());
        }
        return null;
    }

    @Override // defpackage.jb7
    public final pg b() {
        ApplicationDTO applicationDTO = this.a;
        if (applicationDTO != null) {
            return new pg(applicationDTO.getPackageName(), applicationDTO.getVersionCode(), applicationDTO.getForceUpdate());
        }
        return null;
    }

    @Override // defpackage.kz8
    public final tn0 c() {
        ApplicationDTO applicationDTO = this.a;
        if (applicationDTO != null) {
            return new tn0(applicationDTO.getPackageName(), applicationDTO.getVersionCode(), applicationDTO.getForceUpdate());
        }
        return null;
    }

    public FilteredAppNestedData(ApplicationDTO applicationDTO) {
        this(applicationDTO, "", true, new d9(4, new cs1[0]), vy2.e(0, 7, null), false, 64, 0);
    }
}
