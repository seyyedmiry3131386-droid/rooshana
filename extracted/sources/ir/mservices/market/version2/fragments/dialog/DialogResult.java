package ir.mservices.market.version2.fragments.dialog;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class DialogResult {
    public static final DialogResult a;
    public static final DialogResult b;
    public static final /* synthetic */ DialogResult[] c;

    static {
        DialogResult dialogResult = new DialogResult("COMMIT", 0);
        a = dialogResult;
        DialogResult dialogResult2 = new DialogResult("CANCEL", 1);
        b = dialogResult2;
        DialogResult[] dialogResultArr = {dialogResult, dialogResult2};
        c = dialogResultArr;
        kotlin.enums.a.a(dialogResultArr);
    }

    public static DialogResult valueOf(String str) {
        return (DialogResult) Enum.valueOf(DialogResult.class, str);
    }

    public static DialogResult[] values() {
        return (DialogResult[]) c.clone();
    }
}
