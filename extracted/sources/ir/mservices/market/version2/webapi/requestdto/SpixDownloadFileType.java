package ir.mservices.market.version2.webapi.requestdto;

import defpackage.js3;
import defpackage.r22;
import java.util.Locale;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class SpixDownloadFileType {
    private static final /* synthetic */ r22 $ENTRIES;
    private static final /* synthetic */ SpixDownloadFileType[] $VALUES;
    public static final SpixDownloadFileType APK = new SpixDownloadFileType("APK", 0);
    public static final SpixDownloadFileType DATA = new SpixDownloadFileType("DATA", 1);
    public static final SpixDownloadFileType SPLIT = new SpixDownloadFileType("SPLIT", 2);

    private static final /* synthetic */ SpixDownloadFileType[] $values() {
        return new SpixDownloadFileType[]{APK, DATA, SPLIT};
    }

    static {
        SpixDownloadFileType[] spixDownloadFileTypeArr$values = $values();
        $VALUES = spixDownloadFileTypeArr$values;
        $ENTRIES = a.a(spixDownloadFileTypeArr$values);
    }

    private SpixDownloadFileType(String str, int i) {
    }

    public static r22 getEntries() {
        return $ENTRIES;
    }

    public static SpixDownloadFileType valueOf(String str) {
        return (SpixDownloadFileType) Enum.valueOf(SpixDownloadFileType.class, str);
    }

    public static SpixDownloadFileType[] values() {
        return (SpixDownloadFileType[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        String lowerCase = super.toString().toLowerCase(Locale.ROOT);
        js3.o(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
