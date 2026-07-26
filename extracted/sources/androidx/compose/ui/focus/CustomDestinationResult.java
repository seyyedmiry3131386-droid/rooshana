package androidx.compose.ui.focus;

import ir.mservices.market.version2.webapi.responsedto.ApplicationStateDto;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class CustomDestinationResult {
    public static final CustomDestinationResult a;
    public static final CustomDestinationResult b;
    public static final CustomDestinationResult c;
    public static final /* synthetic */ CustomDestinationResult[] d;

    static {
        CustomDestinationResult customDestinationResult = new CustomDestinationResult(ApplicationStateDto.STATE_NONE, 0);
        a = customDestinationResult;
        CustomDestinationResult customDestinationResult2 = new CustomDestinationResult("Cancelled", 1);
        b = customDestinationResult2;
        CustomDestinationResult customDestinationResult3 = new CustomDestinationResult("Redirected", 2);
        c = customDestinationResult3;
        CustomDestinationResult[] customDestinationResultArr = {customDestinationResult, customDestinationResult2, customDestinationResult3, new CustomDestinationResult("RedirectCancelled", 3)};
        d = customDestinationResultArr;
        kotlin.enums.a.a(customDestinationResultArr);
    }

    public static CustomDestinationResult valueOf(String str) {
        return (CustomDestinationResult) Enum.valueOf(CustomDestinationResult.class, str);
    }

    public static CustomDestinationResult[] values() {
        return (CustomDestinationResult[]) d.clone();
    }
}
