package androidx.compose.foundation.text.input.internal.selection;

import ir.mservices.market.version2.webapi.responsedto.ApplicationStateDto;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class TextToolbarState {
    public static final /* synthetic */ TextToolbarState[] a;

    static {
        TextToolbarState[] textToolbarStateArr = {new TextToolbarState(ApplicationStateDto.STATE_NONE, 0), new TextToolbarState("Cursor", 1), new TextToolbarState("Selection", 2)};
        a = textToolbarStateArr;
        a.a(textToolbarStateArr);
    }

    public static TextToolbarState valueOf(String str) {
        return (TextToolbarState) Enum.valueOf(TextToolbarState.class, str);
    }

    public static TextToolbarState[] values() {
        return (TextToolbarState[]) a.clone();
    }
}
