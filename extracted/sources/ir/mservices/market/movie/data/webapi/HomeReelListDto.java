package ir.mservices.market.movie.data.webapi;

import defpackage.bf5;
import defpackage.js3;
import defpackage.vo7;
import defpackage.yd1;
import ir.mservices.market.reels.data.ReelHomeDto;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class HomeReelListDto implements Serializable, bf5 {
    public static final Companion Companion = new Companion(null);
    public static final String GRID = "Grid";
    public static final String LARGE = "Large";
    public static final String MEDIUM = "Medium";
    public static final String SMALL = "Small";

    @vo7("analyticsName")
    private final String analyticsName;

    @vo7("displayMode")
    private final String displayMode;

    @vo7("headerIconUrl")
    private final String headerIconUrl;

    @vo7("headerTitle")
    private final String headerTitle;

    @vo7("listKey")
    private final String listKey;

    @vo7("reels")
    private final List<ReelHomeDto> reels;

    public static final class Companion {
        public /* synthetic */ Companion(yd1 yd1Var) {
            this();
        }

        private Companion() {
        }
    }

    public HomeReelListDto(String str, String str2, String str3, String str4, String str5, List<ReelHomeDto> list) {
        js3.p(str, "listKey");
        js3.p(str5, "displayMode");
        js3.p(list, "reels");
        this.listKey = str;
        this.headerTitle = str2;
        this.headerIconUrl = str3;
        this.analyticsName = str4;
        this.displayMode = str5;
        this.reels = list;
    }

    @Override // defpackage.bf5
    public boolean endOfList() {
        return true;
    }

    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    public final String getDisplayMode() {
        return this.displayMode;
    }

    public final String getHeaderIconUrl() {
        return this.headerIconUrl;
    }

    public final String getHeaderTitle() {
        return this.headerTitle;
    }

    public final String getListKey() {
        return this.listKey;
    }

    public final List<ReelHomeDto> getReels() {
        return this.reels;
    }
}
