package androidx.compose.material3.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class InputPhase {
    public static final InputPhase a;
    public static final InputPhase b;
    public static final InputPhase c;
    public static final /* synthetic */ InputPhase[] d;

    static {
        InputPhase inputPhase = new InputPhase("Focused", 0);
        a = inputPhase;
        InputPhase inputPhase2 = new InputPhase("UnfocusedEmpty", 1);
        b = inputPhase2;
        InputPhase inputPhase3 = new InputPhase("UnfocusedNotEmpty", 2);
        c = inputPhase3;
        InputPhase[] inputPhaseArr = {inputPhase, inputPhase2, inputPhase3};
        d = inputPhaseArr;
        kotlin.enums.a.a(inputPhaseArr);
    }

    public static InputPhase valueOf(String str) {
        return (InputPhase) Enum.valueOf(InputPhase.class, str);
    }

    public static InputPhase[] values() {
        return (InputPhase[]) d.clone();
    }
}
