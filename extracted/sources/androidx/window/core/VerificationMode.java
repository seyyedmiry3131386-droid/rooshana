package androidx.window.core;

import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class VerificationMode {
    public static final VerificationMode a;
    public static final /* synthetic */ VerificationMode[] b;

    static {
        VerificationMode verificationMode = new VerificationMode("STRICT", 0);
        VerificationMode verificationMode2 = new VerificationMode("LOG", 1);
        VerificationMode verificationMode3 = new VerificationMode("QUIET", 2);
        a = verificationMode3;
        VerificationMode[] verificationModeArr = {verificationMode, verificationMode2, verificationMode3};
        b = verificationModeArr;
        a.a(verificationModeArr);
    }

    public static VerificationMode valueOf(String str) {
        return (VerificationMode) Enum.valueOf(VerificationMode.class, str);
    }

    public static VerificationMode[] values() {
        return (VerificationMode[]) b.clone();
    }
}
