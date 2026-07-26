package androidx.compose.foundation.text.selection;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class SelectedTextType {
    public static final SelectedTextType a;
    public static final /* synthetic */ SelectedTextType[] b;

    static {
        SelectedTextType selectedTextType = new SelectedTextType("EditableText", 0);
        a = selectedTextType;
        SelectedTextType[] selectedTextTypeArr = {selectedTextType, new SelectedTextType("StaticText", 1)};
        b = selectedTextTypeArr;
        kotlin.enums.a.a(selectedTextTypeArr);
    }

    public static SelectedTextType valueOf(String str) {
        return (SelectedTextType) Enum.valueOf(SelectedTextType.class, str);
    }

    public static SelectedTextType[] values() {
        return (SelectedTextType[]) b.clone();
    }
}
