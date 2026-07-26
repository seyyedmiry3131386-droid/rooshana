package kotlinx.serialization.json;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class DecodeSequenceMode {
    public static final /* synthetic */ DecodeSequenceMode[] a;

    static {
        DecodeSequenceMode[] decodeSequenceModeArr = {new DecodeSequenceMode("WHITESPACE_SEPARATED", 0), new DecodeSequenceMode("ARRAY_WRAPPED", 1), new DecodeSequenceMode("AUTO_DETECT", 2)};
        a = decodeSequenceModeArr;
        a.a(decodeSequenceModeArr);
    }

    public static DecodeSequenceMode valueOf(String str) {
        return (DecodeSequenceMode) Enum.valueOf(DecodeSequenceMode.class, str);
    }

    public static DecodeSequenceMode[] values() {
        return (DecodeSequenceMode[]) a.clone();
    }
}
