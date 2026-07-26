package androidx.compose.ui.window;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class SecureFlagPolicy {
    public static final SecureFlagPolicy a;
    public static final SecureFlagPolicy b;
    public static final /* synthetic */ SecureFlagPolicy[] c;

    static {
        SecureFlagPolicy secureFlagPolicy = new SecureFlagPolicy("Inherit", 0);
        a = secureFlagPolicy;
        SecureFlagPolicy secureFlagPolicy2 = new SecureFlagPolicy("SecureOn", 1);
        b = secureFlagPolicy2;
        SecureFlagPolicy[] secureFlagPolicyArr = {secureFlagPolicy, secureFlagPolicy2, new SecureFlagPolicy("SecureOff", 2)};
        c = secureFlagPolicyArr;
        kotlin.enums.a.a(secureFlagPolicyArr);
    }

    public static SecureFlagPolicy valueOf(String str) {
        return (SecureFlagPolicy) Enum.valueOf(SecureFlagPolicy.class, str);
    }

    public static SecureFlagPolicy[] values() {
        return (SecureFlagPolicy[]) c.clone();
    }
}
