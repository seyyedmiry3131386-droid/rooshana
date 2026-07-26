package ir.mservices.market.app.home.ui.recycler;

import defpackage.br9;
import defpackage.bz6;
import defpackage.dp2;
import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import ir.mservices.market.app.home.data.HomeVideoListDto;
import ir.mservices.market.version2.ui.recycler.NestedRecyclerData;
import ir.mservices.market.version2.ui.recycler.filter.GeneralFilter;
import ir.mservices.market.version2.webapi.responsedto.VideoRowDto;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class HomeVideoListData extends NestedRecyclerData implements g32 {
    public static final int i = js6.video_banner_list_view;
    public static final int j = js6.video_banner_single_view;
    public static final int k = js6.video_banner_list_digested_view;
    public static final int l = js6.video_banner_single_digested_view;
    public final HomeVideoListDto g;
    public final long h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeVideoListData(HomeVideoListDto homeVideoListDto, bz6 bz6Var, long j2, dp2 dp2Var) {
        super(bz6Var, dp2Var);
        js3.p(bz6Var, "homeVideos");
        this.g = homeVideoListDto;
        this.h = j2;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return this.g.isDigested() ? f() ? l : k : f() ? j : i;
    }

    @Override // ir.mservices.market.version2.ui.recycler.NestedRecyclerData
    public final int c() {
        return 1;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return 1;
    }

    @Override // ir.mservices.market.version2.ui.recycler.NestedRecyclerData
    public final boolean e() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HomeVideoListData) {
            return this.h == ((HomeVideoListData) obj).h;
        }
        return false;
    }

    @Override // ir.mservices.market.version2.ui.recycler.NestedRecyclerData
    public final boolean f() {
        int i2;
        HomeVideoListDto homeVideoListDto = this.g;
        GeneralFilter generalFilterA = ir.mservices.market.version2.ui.recycler.filter.a.a(homeVideoListDto.getIgnoreConditions());
        List<VideoRowDto> videos = homeVideoListDto.getVideos();
        if (videos == null || videos.isEmpty()) {
            i2 = 0;
        } else {
            i2 = 0;
            for (VideoRowDto videoRowDto : videos) {
                if (generalFilterA != null && generalFilterA.u(new BaseHomeVideoData(videoRowDto, false)) && (i2 = i2 + 1) < 0) {
                    br9.O();
                    throw null;
                }
            }
        }
        List<VideoRowDto> videos2 = homeVideoListDto.getVideos();
        return videos2 != null && (videos2.size() == 1 || videos2.size() - i2 == 1);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(this.h);
    }

    public final int hashCode() {
        long j2 = this.h;
        return (int) (j2 ^ (j2 >>> 32));
    }
}
