package androidx.compose.material3.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class TextFieldType {
    public static final /* synthetic */ TextFieldType[] a;

    static {
        TextFieldType[] textFieldTypeArr = {new TextFieldType("Filled", 0), new TextFieldType("Outlined", 1)};
        a = textFieldTypeArr;
        kotlin.enums.a.a(textFieldTypeArr);
    }

    public static TextFieldType valueOf(String str) {
        return (TextFieldType) Enum.valueOf(TextFieldType.class, str);
    }

    public static TextFieldType[] values() {
        return (TextFieldType[]) a.clone();
    }
}
