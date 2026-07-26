package ir.mservices.market.version2.webapi.requestdto;

import defpackage.js3;
import defpackage.r22;
import java.util.Locale;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class SpixDownloadType {
    private static final /* synthetic */ r22 $ENTRIES;
    private static final /* synthetic */ SpixDownloadType[] $VALUES;
    public static final SpixDownloadType POST = new SpixDownloadType("POST", 0);
    public static final SpixDownloadType PRE = new SpixDownloadType("PRE", 1);

    private static final /* synthetic */ SpixDownloadType[] $values() {
        return new SpixDownloadType[]{POST, PRE};
    }

    static {
        SpixDownloadType[] spixDownloadTypeArr$values = $values();
        $VALUES = spixDownloadTypeArr$values;
        $ENTRIES = a.a(spixDownloadTypeArr$values);
    }

    private SpixDownloadType(String str, int i) {
    }

    public static r22 getEntries() {
        return $ENTRIES;
    }

    public static SpixDownloadType valueOf(String str) {
        return (SpixDownloadType) Enum.valueOf(SpixDownloadType.class, str);
    }

    public static SpixDownloadType[] values() {
        return (SpixDownloadType[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        String lowerCase = super.toString().toLowerCase(Locale.ROOT);
        js3.o(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
