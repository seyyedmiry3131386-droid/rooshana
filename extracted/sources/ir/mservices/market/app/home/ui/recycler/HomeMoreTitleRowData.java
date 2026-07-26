package ir.mservices.market.app.home.ui.recycler;

import defpackage.g32;
import defpackage.gv;
import defpackage.js3;
import defpackage.js6;
import defpackage.rm7;
import defpackage.wo2;
import ir.mservices.market.app.detail.data.AdInfoDto;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class HomeMoreTitleRowData implements MyketRecyclerData, g32, wo2 {
    public static final gv i = new gv(26);
    public static final int j = js6.home_more_title_view;
    public final String a;
    public final String b;
    public final AdInfoDto c;
    public final boolean d;
    public final String e;
    public final List f;
    public final List g;
    public final String h;

    public HomeMoreTitleRowData(String str, String str2, AdInfoDto adInfoDto, boolean z, String str3, List list, List list2, String str4, int i2) {
        if ((i2 & 8) != 0) {
            z = true ^ (str2 == null || str2.length() == 0);
        }
        str3 = (i2 & 16) != 0 ? null : str3;
        list = (i2 & 32) != 0 ? new ArrayList() : list;
        list2 = (i2 & 64) != 0 ? null : list2;
        str4 = (i2 & 128) != 0 ? String.valueOf(i.hashCode()) : str4;
        js3.p(str4, "id");
        this.a = str;
        this.b = str2;
        this.c = adInfoDto;
        this.d = z;
        this.e = str3;
        this.f = list;
        this.g = list2;
        this.h = str4;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return j;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeMoreTitleRowData)) {
            return false;
        }
        HomeMoreTitleRowData homeMoreTitleRowData = (HomeMoreTitleRowData) obj;
        return js3.i(this.a, homeMoreTitleRowData.a) && js3.i(this.b, homeMoreTitleRowData.b) && js3.i(this.c, homeMoreTitleRowData.c) && this.d == homeMoreTitleRowData.d && js3.i(this.f, homeMoreTitleRowData.f) && js3.i(this.g, homeMoreTitleRowData.g);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.h;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        AdInfoDto adInfoDto = this.c;
        int i2 = rm7.i((((iHashCode2 + (adInfoDto != null ? adInfoDto.hashCode() : 0)) * 31) + (this.d ? 1231 : 1237)) * 31, 31, this.f);
        List list = this.g;
        return i2 + (list != null ? list.hashCode() : 0);
    }
}
