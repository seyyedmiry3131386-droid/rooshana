package androidx.navigation.serialization;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class InternalType {
    public static final /* synthetic */ InternalType[] a;

    static {
        InternalType[] internalTypeArr = {new InternalType("INT", 0), new InternalType("INT_NULLABLE", 1), new InternalType("BOOL", 2), new InternalType("BOOL_NULLABLE", 3), new InternalType("DOUBLE", 4), new InternalType("DOUBLE_NULLABLE", 5), new InternalType("FLOAT", 6), new InternalType("FLOAT_NULLABLE", 7), new InternalType("LONG", 8), new InternalType("LONG_NULLABLE", 9), new InternalType("STRING", 10), new InternalType("STRING_NULLABLE", 11), new InternalType("INT_ARRAY", 12), new InternalType("BOOL_ARRAY", 13), new InternalType("DOUBLE_ARRAY", 14), new InternalType("FLOAT_ARRAY", 15), new InternalType("LONG_ARRAY", 16), new InternalType("ARRAY", 17), new InternalType("LIST", 18), new InternalType("ENUM", 19), new InternalType("ENUM_NULLABLE", 20), new InternalType("UNKNOWN", 21)};
        a = internalTypeArr;
        a.a(internalTypeArr);
    }

    public static InternalType valueOf(String str) {
        return (InternalType) Enum.valueOf(InternalType.class, str);
    }

    public static InternalType[] values() {
        return (InternalType[]) a.clone();
    }
}
