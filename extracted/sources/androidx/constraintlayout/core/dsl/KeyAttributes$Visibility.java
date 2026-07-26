package androidx.constraintlayout.core.dsl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class KeyAttributes$Visibility {
    public static final /* synthetic */ KeyAttributes$Visibility[] a = {new KeyAttributes$Visibility("VISIBLE", 0), new KeyAttributes$Visibility("INVISIBLE", 1), new KeyAttributes$Visibility("GONE", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    KeyAttributes$Visibility EF5;

    public static KeyAttributes$Visibility valueOf(String str) {
        return (KeyAttributes$Visibility) Enum.valueOf(KeyAttributes$Visibility.class, str);
    }

    public static KeyAttributes$Visibility[] values() {
        return (KeyAttributes$Visibility[]) a.clone();
    }
}
