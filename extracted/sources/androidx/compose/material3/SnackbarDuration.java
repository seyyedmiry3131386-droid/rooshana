package androidx.compose.material3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class SnackbarDuration {
    public static final /* synthetic */ SnackbarDuration[] a;

    static {
        SnackbarDuration[] snackbarDurationArr = {new SnackbarDuration("Short", 0), new SnackbarDuration("Long", 1), new SnackbarDuration("Indefinite", 2)};
        a = snackbarDurationArr;
        kotlin.enums.a.a(snackbarDurationArr);
    }

    public static SnackbarDuration valueOf(String str) {
        return (SnackbarDuration) Enum.valueOf(SnackbarDuration.class, str);
    }

    public static SnackbarDuration[] values() {
        return (SnackbarDuration[]) a.clone();
    }
}
