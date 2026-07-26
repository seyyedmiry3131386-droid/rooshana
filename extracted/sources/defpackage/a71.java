package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.ServiceConfigurationError;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a71 {
    public static final List a;

    static {
        try {
            a = mo7.w(mo7.p(Arrays.asList(new fg()).iterator()));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
