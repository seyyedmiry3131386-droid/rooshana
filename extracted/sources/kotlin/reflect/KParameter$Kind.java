package kotlin.reflect;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class KParameter$Kind {
    public static final /* synthetic */ KParameter$Kind[] a;

    static {
        KParameter$Kind[] kParameter$KindArr = {new KParameter$Kind("INSTANCE", 0), new KParameter$Kind("CONTEXT", 1), new KParameter$Kind("EXTENSION_RECEIVER", 2), new KParameter$Kind("VALUE", 3)};
        a = kParameter$KindArr;
        a.a(kParameter$KindArr);
    }

    public static KParameter$Kind valueOf(String str) {
        return (KParameter$Kind) Enum.valueOf(KParameter$Kind.class, str);
    }

    public static KParameter$Kind[] values() {
        return (KParameter$Kind[]) a.clone();
    }
}
