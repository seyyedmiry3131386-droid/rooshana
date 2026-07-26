package androidx.compose.material3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class SwipeToDismissBoxValue {
    public static final /* synthetic */ SwipeToDismissBoxValue[] a;

    static {
        SwipeToDismissBoxValue[] swipeToDismissBoxValueArr = {new SwipeToDismissBoxValue("StartToEnd", 0), new SwipeToDismissBoxValue("EndToStart", 1), new SwipeToDismissBoxValue("Settled", 2)};
        a = swipeToDismissBoxValueArr;
        kotlin.enums.a.a(swipeToDismissBoxValueArr);
    }

    public static SwipeToDismissBoxValue valueOf(String str) {
        return (SwipeToDismissBoxValue) Enum.valueOf(SwipeToDismissBoxValue.class, str);
    }

    public static SwipeToDismissBoxValue[] values() {
        return (SwipeToDismissBoxValue[]) a.clone();
    }
}
