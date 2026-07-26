package androidx.compose.foundation.text.input.internal.selection;

import ir.mservices.market.version2.webapi.responsedto.ApplicationStateDto;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class TextFieldSelectionState$InputType {
    public static final /* synthetic */ TextFieldSelectionState$InputType[] a;

    static {
        TextFieldSelectionState$InputType[] textFieldSelectionState$InputTypeArr = {new TextFieldSelectionState$InputType(ApplicationStateDto.STATE_NONE, 0), new TextFieldSelectionState$InputType("Touch", 1), new TextFieldSelectionState$InputType("Mouse", 2)};
        a = textFieldSelectionState$InputTypeArr;
        a.a(textFieldSelectionState$InputTypeArr);
    }

    public static TextFieldSelectionState$InputType valueOf(String str) {
        return (TextFieldSelectionState$InputType) Enum.valueOf(TextFieldSelectionState$InputType.class, str);
    }

    public static TextFieldSelectionState$InputType[] values() {
        return (TextFieldSelectionState$InputType[]) a.clone();
    }
}
