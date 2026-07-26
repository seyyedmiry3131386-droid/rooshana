package androidx.constraintlayout.core.dsl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class KeyCycle$Wave {
    public static final /* synthetic */ KeyCycle$Wave[] a = {new KeyCycle$Wave("SIN", 0), new KeyCycle$Wave("SQUARE", 1), new KeyCycle$Wave("TRIANGLE", 2), new KeyCycle$Wave("SAW", 3), new KeyCycle$Wave("REVERSE_SAW", 4), new KeyCycle$Wave("COS", 5)};

    /* JADX INFO: Fake field, exist only in values array */
    KeyCycle$Wave EF5;

    public static KeyCycle$Wave valueOf(String str) {
        return (KeyCycle$Wave) Enum.valueOf(KeyCycle$Wave.class, str);
    }

    public static KeyCycle$Wave[] values() {
        return (KeyCycle$Wave[]) a.clone();
    }
}
