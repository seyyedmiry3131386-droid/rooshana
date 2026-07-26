package androidx.compose.ui.state;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ToggleableState {
    public static final ToggleableState a;
    public static final ToggleableState b;
    public static final ToggleableState c;
    public static final /* synthetic */ ToggleableState[] d;

    static {
        ToggleableState toggleableState = new ToggleableState("On", 0);
        a = toggleableState;
        ToggleableState toggleableState2 = new ToggleableState("Off", 1);
        b = toggleableState2;
        ToggleableState toggleableState3 = new ToggleableState("Indeterminate", 2);
        c = toggleableState3;
        ToggleableState[] toggleableStateArr = {toggleableState, toggleableState2, toggleableState3};
        d = toggleableStateArr;
        a.a(toggleableStateArr);
    }

    public static ToggleableState valueOf(String str) {
        return (ToggleableState) Enum.valueOf(ToggleableState.class, str);
    }

    public static ToggleableState[] values() {
        return (ToggleableState[]) d.clone();
    }
}
