package androidx.compose.foundation.text;

import ir.mservices.market.version2.webapi.responsedto.ApplicationStateDto;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class HandleState {
    public static final HandleState a;
    public static final HandleState b;
    public static final HandleState c;
    public static final /* synthetic */ HandleState[] d;

    static {
        HandleState handleState = new HandleState(ApplicationStateDto.STATE_NONE, 0);
        a = handleState;
        HandleState handleState2 = new HandleState("Selection", 1);
        b = handleState2;
        HandleState handleState3 = new HandleState("Cursor", 2);
        c = handleState3;
        HandleState[] handleStateArr = {handleState, handleState2, handleState3};
        d = handleStateArr;
        kotlin.enums.a.a(handleStateArr);
    }

    public static HandleState valueOf(String str) {
        return (HandleState) Enum.valueOf(HandleState.class, str);
    }

    public static HandleState[] values() {
        return (HandleState[]) d.clone();
    }
}
