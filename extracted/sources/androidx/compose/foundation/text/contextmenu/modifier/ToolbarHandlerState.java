package androidx.compose.foundation.text.contextmenu.modifier;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class ToolbarHandlerState {
    public static final ToolbarHandlerState a;
    public static final ToolbarHandlerState b;
    public static final ToolbarHandlerState c;
    public static final /* synthetic */ ToolbarHandlerState[] d;

    static {
        ToolbarHandlerState toolbarHandlerState = new ToolbarHandlerState("Uninitialized", 0);
        a = toolbarHandlerState;
        ToolbarHandlerState toolbarHandlerState2 = new ToolbarHandlerState("Detached", 1);
        b = toolbarHandlerState2;
        ToolbarHandlerState toolbarHandlerState3 = new ToolbarHandlerState("Attached", 2);
        c = toolbarHandlerState3;
        ToolbarHandlerState[] toolbarHandlerStateArr = {toolbarHandlerState, toolbarHandlerState2, toolbarHandlerState3};
        d = toolbarHandlerStateArr;
        kotlin.enums.a.a(toolbarHandlerStateArr);
    }

    public static ToolbarHandlerState valueOf(String str) {
        return (ToolbarHandlerState) Enum.valueOf(ToolbarHandlerState.class, str);
    }

    public static ToolbarHandlerState[] values() {
        return (ToolbarHandlerState[]) d.clone();
    }
}
