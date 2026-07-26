package ir.mservices.market.download.common;

import defpackage.r22;
import defpackage.rs6;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class RecentDownloadType {
    public static final /* synthetic */ RecentDownloadType[] c;
    public static final /* synthetic */ r22 d;
    public final int a;
    public final int b;

    static {
        RecentDownloadType[] recentDownloadTypeArr = {new RecentDownloadType("APPS", 0, rs6.recent_download_app, rs6.page_name_app_download), new RecentDownloadType("MOVIES", 1, rs6.recent_download_movie, rs6.page_name_movie_download)};
        c = recentDownloadTypeArr;
        d = a.a(recentDownloadTypeArr);
    }

    public RecentDownloadType(String str, int i, int i2, int i3) {
        this.a = i2;
        this.b = i3;
    }

    public static RecentDownloadType valueOf(String str) {
        return (RecentDownloadType) Enum.valueOf(RecentDownloadType.class, str);
    }

    public static RecentDownloadType[] values() {
        return (RecentDownloadType[]) c.clone();
    }
}
