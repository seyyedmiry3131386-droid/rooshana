package ir.mservices.market.social.profile.list.data;

import defpackage.r22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ReportListType {
    private static final /* synthetic */ r22 $ENTRIES;
    private static final /* synthetic */ ReportListType[] $VALUES;
    public static final ReportListType APP_TITLE = new ReportListType("APP_TITLE", 0, "AppListTitle");
    public static final ReportListType MOVIE_TITLE = new ReportListType("MOVIE_TITLE", 1, "MovieListTitle");
    private final String value;

    private static final /* synthetic */ ReportListType[] $values() {
        return new ReportListType[]{APP_TITLE, MOVIE_TITLE};
    }

    static {
        ReportListType[] reportListTypeArr$values = $values();
        $VALUES = reportListTypeArr$values;
        $ENTRIES = a.a(reportListTypeArr$values);
    }

    private ReportListType(String str, int i, String str2) {
        this.value = str2;
    }

    public static r22 getEntries() {
        return $ENTRIES;
    }

    public static ReportListType valueOf(String str) {
        return (ReportListType) Enum.valueOf(ReportListType.class, str);
    }

    public static ReportListType[] values() {
        return (ReportListType[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
