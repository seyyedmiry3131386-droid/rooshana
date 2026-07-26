package androidx.compose.ui.focus;

import defpackage.ug2;
import kotlin.NoWhenBranchMatchedException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class FocusStateImpl implements ug2 {
    public static final FocusStateImpl a;
    public static final FocusStateImpl b;
    public static final FocusStateImpl c;
    public static final /* synthetic */ FocusStateImpl[] d;

    static {
        FocusStateImpl focusStateImpl = new FocusStateImpl("Active", 0);
        a = focusStateImpl;
        FocusStateImpl focusStateImpl2 = new FocusStateImpl("ActiveParent", 1);
        b = focusStateImpl2;
        FocusStateImpl focusStateImpl3 = new FocusStateImpl("Captured", 2);
        FocusStateImpl focusStateImpl4 = new FocusStateImpl("Inactive", 3);
        c = focusStateImpl4;
        FocusStateImpl[] focusStateImplArr = {focusStateImpl, focusStateImpl2, focusStateImpl3, focusStateImpl4};
        d = focusStateImplArr;
        kotlin.enums.a.a(focusStateImplArr);
    }

    public static FocusStateImpl valueOf(String str) {
        return (FocusStateImpl) Enum.valueOf(FocusStateImpl.class, str);
    }

    public static FocusStateImpl[] values() {
        return (FocusStateImpl[]) d.clone();
    }

    public final boolean a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean b() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return false;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return true;
    }
}
