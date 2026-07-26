package androidx.compose.material3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class SheetValue {
    public static final SheetValue a;
    public static final SheetValue b;
    public static final SheetValue c;
    public static final /* synthetic */ SheetValue[] d;

    static {
        SheetValue sheetValue = new SheetValue("Hidden", 0);
        a = sheetValue;
        SheetValue sheetValue2 = new SheetValue("Expanded", 1);
        b = sheetValue2;
        SheetValue sheetValue3 = new SheetValue("PartiallyExpanded", 2);
        c = sheetValue3;
        SheetValue[] sheetValueArr = {sheetValue, sheetValue2, sheetValue3};
        d = sheetValueArr;
        kotlin.enums.a.a(sheetValueArr);
    }

    public static SheetValue valueOf(String str) {
        return (SheetValue) Enum.valueOf(SheetValue.class, str);
    }

    public static SheetValue[] values() {
        return (SheetValue[]) d.clone();
    }
}
