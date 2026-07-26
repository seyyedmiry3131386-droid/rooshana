package defpackage;

import androidx.window.core.VerificationMode;
import androidx.window.extensions.WindowExtensionsProvider;

/* JADX INFO: loaded from: classes.dex */
public abstract class t72 {
    static {
        g27.a(t72.class).d();
    }

    public static int a() {
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError unused) {
            int i = rh0.a;
            VerificationMode verificationMode = VerificationMode.a;
            return 0;
        } catch (NullPointerException unused2) {
            int i2 = rh0.a;
            VerificationMode verificationMode2 = VerificationMode.a;
            return 0;
        } catch (UnsupportedOperationException unused3) {
            int i3 = rh0.a;
            VerificationMode verificationMode3 = VerificationMode.a;
            return 0;
        }
    }
}
