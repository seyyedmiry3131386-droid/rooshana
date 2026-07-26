package androidx.datastore.preferences.protobuf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class Value$KindCase {
    public static final /* synthetic */ Value$KindCase[] a = {new Value$KindCase("NULL_VALUE", 0), new Value$KindCase("NUMBER_VALUE", 1), new Value$KindCase("STRING_VALUE", 2), new Value$KindCase("BOOL_VALUE", 3), new Value$KindCase("STRUCT_VALUE", 4), new Value$KindCase("LIST_VALUE", 5), new Value$KindCase("KIND_NOT_SET", 6)};

    /* JADX INFO: Fake field, exist only in values array */
    Value$KindCase EF5;

    public static Value$KindCase valueOf(String str) {
        return (Value$KindCase) Enum.valueOf(Value$KindCase.class, str);
    }

    public static Value$KindCase[] values() {
        return (Value$KindCase[]) a.clone();
    }
}
