package androidx.compose.animation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class StateChangeRequest {
    public static final /* synthetic */ StateChangeRequest[] a;

    static {
        StateChangeRequest[] stateChangeRequestArr = {new StateChangeRequest("NoRequest", 0), new StateChangeRequest("MatchFound", 1), new StateChangeRequest("VisibleContentAbsentDuringTransition", 2), new StateChangeRequest("NoMatchFound", 3)};
        a = stateChangeRequestArr;
        kotlin.enums.a.a(stateChangeRequestArr);
    }

    public static StateChangeRequest valueOf(String str) {
        return (StateChangeRequest) Enum.valueOf(StateChangeRequest.class, str);
    }

    public static StateChangeRequest[] values() {
        return (StateChangeRequest[]) a.clone();
    }
}
