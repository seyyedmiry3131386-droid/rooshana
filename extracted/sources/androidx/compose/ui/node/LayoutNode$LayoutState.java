package androidx.compose.ui.node;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class LayoutNode$LayoutState {
    public static final LayoutNode$LayoutState a;
    public static final LayoutNode$LayoutState b;
    public static final LayoutNode$LayoutState c;
    public static final LayoutNode$LayoutState d;
    public static final LayoutNode$LayoutState e;
    public static final /* synthetic */ LayoutNode$LayoutState[] f;

    static {
        LayoutNode$LayoutState layoutNode$LayoutState = new LayoutNode$LayoutState("Measuring", 0);
        a = layoutNode$LayoutState;
        LayoutNode$LayoutState layoutNode$LayoutState2 = new LayoutNode$LayoutState("LookaheadMeasuring", 1);
        b = layoutNode$LayoutState2;
        LayoutNode$LayoutState layoutNode$LayoutState3 = new LayoutNode$LayoutState("LayingOut", 2);
        c = layoutNode$LayoutState3;
        LayoutNode$LayoutState layoutNode$LayoutState4 = new LayoutNode$LayoutState("LookaheadLayingOut", 3);
        d = layoutNode$LayoutState4;
        LayoutNode$LayoutState layoutNode$LayoutState5 = new LayoutNode$LayoutState("Idle", 4);
        e = layoutNode$LayoutState5;
        LayoutNode$LayoutState[] layoutNode$LayoutStateArr = {layoutNode$LayoutState, layoutNode$LayoutState2, layoutNode$LayoutState3, layoutNode$LayoutState4, layoutNode$LayoutState5};
        f = layoutNode$LayoutStateArr;
        kotlin.enums.a.a(layoutNode$LayoutStateArr);
    }

    public static LayoutNode$LayoutState valueOf(String str) {
        return (LayoutNode$LayoutState) Enum.valueOf(LayoutNode$LayoutState.class, str);
    }

    public static LayoutNode$LayoutState[] values() {
        return (LayoutNode$LayoutState[]) f.clone();
    }
}
