package ir.mservices.market.social.profile.user.data;

import defpackage.r22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ReportType {
    private static final /* synthetic */ r22 $ENTRIES;
    private static final /* synthetic */ ReportType[] $VALUES;
    public static final ReportType NAME = new ReportType("NAME", 0);
    public static final ReportType AVATAR = new ReportType("AVATAR", 1);
    public static final ReportType COMMENT = new ReportType("COMMENT", 2);
    public static final ReportType BIO = new ReportType("BIO", 3);
    public static final ReportType OTHER = new ReportType("OTHER", 4);

    private static final /* synthetic */ ReportType[] $values() {
        return new ReportType[]{NAME, AVATAR, COMMENT, BIO, OTHER};
    }

    static {
        ReportType[] reportTypeArr$values = $values();
        $VALUES = reportTypeArr$values;
        $ENTRIES = a.a(reportTypeArr$values);
    }

    private ReportType(String str, int i) {
    }

    public static r22 getEntries() {
        return $ENTRIES;
    }

    public static ReportType valueOf(String str) {
        return (ReportType) Enum.valueOf(ReportType.class, str);
    }

    public static ReportType[] values() {
        return (ReportType[]) $VALUES.clone();
    }
}
