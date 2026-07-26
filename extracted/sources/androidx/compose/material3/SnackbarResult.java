package androidx.compose.material3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class SnackbarResult {
    public static final /* synthetic */ SnackbarResult[] a;

    static {
        SnackbarResult[] snackbarResultArr = {new SnackbarResult("Dismissed", 0), new SnackbarResult("ActionPerformed", 1)};
        a = snackbarResultArr;
        kotlin.enums.a.a(snackbarResultArr);
    }

    public static SnackbarResult valueOf(String str) {
        return (SnackbarResult) Enum.valueOf(SnackbarResult.class, str);
    }

    public static SnackbarResult[] values() {
        return (SnackbarResult[]) a.clone();
    }
}
