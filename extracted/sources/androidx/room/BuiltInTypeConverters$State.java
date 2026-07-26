package androidx.room;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class BuiltInTypeConverters$State {
    public static final /* synthetic */ BuiltInTypeConverters$State[] a;

    static {
        BuiltInTypeConverters$State[] builtInTypeConverters$StateArr = {new BuiltInTypeConverters$State("ENABLED", 0), new BuiltInTypeConverters$State("DISABLED", 1), new BuiltInTypeConverters$State("INHERITED", 2)};
        a = builtInTypeConverters$StateArr;
        kotlin.enums.a.a(builtInTypeConverters$StateArr);
    }

    public static BuiltInTypeConverters$State valueOf(String str) {
        return (BuiltInTypeConverters$State) Enum.valueOf(BuiltInTypeConverters$State.class, str);
    }

    public static BuiltInTypeConverters$State[] values() {
        return (BuiltInTypeConverters$State[]) a.clone();
    }
}
