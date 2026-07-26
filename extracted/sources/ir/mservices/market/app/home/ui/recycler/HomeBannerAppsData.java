package ir.mservices.market.app.home.ui.recycler;

import defpackage.br9;
import defpackage.bz6;
import defpackage.dp2;
import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.m88;
import ir.mservices.market.version2.ui.recycler.NestedRecyclerData;
import ir.mservices.market.version2.ui.recycler.filter.GeneralFilter;
import ir.mservices.market.version2.webapi.responsedto.HomeBannerAppDto;
import ir.mservices.market.version2.webapi.responsedto.HomeBannerAppsDto;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class HomeBannerAppsData extends NestedRecyclerData implements g32 {
    public static final int j = js6.holder_home_banner_apps_inner;
    public static final int k = js6.holder_home_banner_apps_outer;
    public static final int l = js6.holder_home_banner_apps_inner_digested;
    public static final int m = js6.holder_home_banner_apps_outer_digested;
    public static final int n = js6.holder_home_banner_apps_outer_single;
    public static final int o = js6.holder_home_banner_apps_inner_single;
    public static final int p = js6.holder_home_banner_apps_outer_single_digested;
    public static final int q = js6.holder_home_banner_apps_inner_single_digested;
    public final HomeBannerAppsDto g;
    public final long h;
    public final boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeBannerAppsData(HomeBannerAppsDto homeBannerAppsDto, bz6 bz6Var, long j2, boolean z, dp2 dp2Var) {
        super(bz6Var, dp2Var);
        js3.p(bz6Var, "bannerFlowData");
        this.g = homeBannerAppsDto;
        this.h = j2;
        this.i = z;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        HomeBannerAppsDto homeBannerAppsDto = this.g;
        if (m88.T(homeBannerAppsDto.getDisplayMode(), HomeBannerAppsDto.INNER_APP, true)) {
            return !f() ? j : o;
        }
        if (m88.T(homeBannerAppsDto.getDisplayMode(), HomeBannerAppsDto.OUTER_APP, true)) {
            if (f()) {
                return n;
            }
        } else {
            if (m88.T(homeBannerAppsDto.getDisplayMode(), HomeBannerAppsDto.INNER_APP_DIGESTED, true)) {
                return !f() ? l : q;
            }
            if (m88.T(homeBannerAppsDto.getDisplayMode(), HomeBannerAppsDto.OUTER_APP_DIGESTED, true)) {
                return !f() ? m : p;
            }
        }
        return k;
    }

    @Override // ir.mservices.market.version2.ui.recycler.NestedRecyclerData
    public final int c() {
        return 1;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    @Override // ir.mservices.market.version2.ui.recycler.NestedRecyclerData
    public final boolean e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeBannerAppsData)) {
            return false;
        }
        HomeBannerAppsData homeBannerAppsData = (HomeBannerAppsData) obj;
        return js3.i(this.g, homeBannerAppsData.g) && this.h == homeBannerAppsData.h;
    }

    @Override // ir.mservices.market.version2.ui.recycler.NestedRecyclerData
    public final boolean f() {
        int i;
        HomeBannerAppsDto homeBannerAppsDto = this.g;
        GeneralFilter generalFilterA = ir.mservices.market.version2.ui.recycler.filter.a.a(homeBannerAppsDto.getIgnoreConditions());
        List<HomeBannerAppDto> apps = homeBannerAppsDto.getApps();
        if (apps == null || apps.isEmpty()) {
            i = 0;
        } else {
            i = 0;
            for (HomeBannerAppDto homeBannerAppDto : apps) {
                if (generalFilterA != null && generalFilterA.u(new BaseHomeBannerAppData(homeBannerAppDto, homeBannerAppsDto.getDisplayMode())) && (i = i + 1) < 0) {
                    br9.O();
                    throw null;
                }
            }
        }
        return homeBannerAppsDto.getApps() != null && (homeBannerAppsDto.getApps().size() == 1 || homeBannerAppsDto.getApps().size() - i == 1);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(this.h);
    }

    public final int hashCode() {
        int iHashCode = this.g.hashCode() * 31;
        long j2 = this.h;
        return iHashCode + ((int) (j2 ^ (j2 >>> 32)));
    }
}
