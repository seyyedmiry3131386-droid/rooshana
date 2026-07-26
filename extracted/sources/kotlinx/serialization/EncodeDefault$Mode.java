package kotlinx.serialization;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class EncodeDefault$Mode {
    public static final /* synthetic */ EncodeDefault$Mode[] a;

    static {
        EncodeDefault$Mode[] encodeDefault$ModeArr = {new EncodeDefault$Mode("ALWAYS", 0), new EncodeDefault$Mode("NEVER", 1)};
        a = encodeDefault$ModeArr;
        a.a(encodeDefault$ModeArr);
    }

    public static EncodeDefault$Mode valueOf(String str) {
        return (EncodeDefault$Mode) Enum.valueOf(EncodeDefault$Mode.class, str);
    }

    public static EncodeDefault$Mode[] values() {
        return (EncodeDefault$Mode[]) a.clone();
    }
}
