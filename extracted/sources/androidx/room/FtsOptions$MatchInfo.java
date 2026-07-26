package androidx.room;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class FtsOptions$MatchInfo {
    public static final /* synthetic */ FtsOptions$MatchInfo[] a;

    static {
        FtsOptions$MatchInfo[] ftsOptions$MatchInfoArr = {new FtsOptions$MatchInfo("FTS3", 0), new FtsOptions$MatchInfo("FTS4", 1)};
        a = ftsOptions$MatchInfoArr;
        kotlin.enums.a.a(ftsOptions$MatchInfoArr);
    }

    public static FtsOptions$MatchInfo valueOf(String str) {
        return (FtsOptions$MatchInfo) Enum.valueOf(FtsOptions$MatchInfo.class, str);
    }

    public static FtsOptions$MatchInfo[] values() {
        return (FtsOptions$MatchInfo[]) a.clone();
    }
}
