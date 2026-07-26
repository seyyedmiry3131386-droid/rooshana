package ir.mservices.market.app.home.ui.recycler;

import defpackage.fm3;
import defpackage.jb7;
import defpackage.js3;
import defpackage.js6;
import defpackage.kz8;
import defpackage.m88;
import defpackage.pg;
import defpackage.pv1;
import defpackage.tn0;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.version2.webapi.responsedto.HomeBannerAppDto;
import ir.mservices.market.version2.webapi.responsedto.HomeBannerAppsDto;

/* JADX INFO: loaded from: classes3.dex */
public class BaseHomeBannerAppData implements MyketRecyclerData, kz8, jb7, fm3 {
    public static final int c = js6.holder_home_banner_app_inner;
    public static final int d = js6.holder_home_banner_app_outer;
    public static final int e = js6.holder_home_banner_app_inner_digested;
    public static final int f = js6.holder_home_banner_app_outer_digested;
    public final HomeBannerAppDto a;
    public final String b;

    public BaseHomeBannerAppData(HomeBannerAppDto homeBannerAppDto, String str) {
        js3.p(homeBannerAppDto, "homeBannerApp");
        this.a = homeBannerAppDto;
        this.b = str;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        String str = this.b;
        if (m88.T(str, HomeBannerAppsDto.INNER_APP, true)) {
            return c;
        }
        if (!m88.T(str, HomeBannerAppsDto.OUTER_APP, true)) {
            if (m88.T(str, HomeBannerAppsDto.INNER_APP_DIGESTED, true)) {
                return e;
            }
            if (m88.T(str, HomeBannerAppsDto.OUTER_APP_DIGESTED, true)) {
                return f;
            }
        }
        return d;
    }

    @Override // defpackage.fm3
    public final pv1 a() {
        return new pv1(2, this.a.getApp().isIncompatible());
    }

    @Override // defpackage.jb7
    public final pg b() {
        HomeBannerAppDto homeBannerAppDto = this.a;
        return new pg(homeBannerAppDto.getApp().getPackageName(), homeBannerAppDto.getApp().getVersionCode(), homeBannerAppDto.getApp().getForceUpdate());
    }

    @Override // defpackage.kz8
    public final tn0 c() {
        HomeBannerAppDto homeBannerAppDto = this.a;
        return new tn0(homeBannerAppDto.getApp().getPackageName(), homeBannerAppDto.getApp().getVersionCode(), homeBannerAppDto.getApp().getForceUpdate());
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return 1;
    }
}
