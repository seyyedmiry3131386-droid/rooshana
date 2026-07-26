package ir.mservices.market.app.home.data;

import defpackage.r22;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class AddaxType {
    private static final /* synthetic */ r22 $ENTRIES;
    private static final /* synthetic */ AddaxType[] $VALUES;
    private final String type;
    public static final AddaxType NOTIFICATION = new AddaxType("NOTIFICATION", 0, "notification");
    public static final AddaxType INTENT = new AddaxType("INTENT", 1, "intent");
    public static final AddaxType LOW_STORAGE = new AddaxType("LOW_STORAGE", 2, "low_storage");

    private static final /* synthetic */ AddaxType[] $values() {
        return new AddaxType[]{NOTIFICATION, INTENT, LOW_STORAGE};
    }

    static {
        AddaxType[] addaxTypeArr$values = $values();
        $VALUES = addaxTypeArr$values;
        $ENTRIES = a.a(addaxTypeArr$values);
    }

    private AddaxType(String str, int i, String str2) {
        this.type = str2;
    }

    public static r22 getEntries() {
        return $ENTRIES;
    }

    public static AddaxType valueOf(String str) {
        return (AddaxType) Enum.valueOf(AddaxType.class, str);
    }

    public static AddaxType[] values() {
        return (AddaxType[]) $VALUES.clone();
    }

    public final String getType() {
        return this.type;
    }
}
