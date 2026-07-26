package defpackage;

import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class e27 extends sl3 {
    @Override // defpackage.sl3
    public final boolean A(Method method) {
        return method.isDefault();
    }

    @Override // defpackage.sl3
    public final Object z(Method method, Class cls, Object obj, Object[] objArr) {
        if (Build.VERSION.SDK_INT >= 26) {
            return aq3.m(method, cls, obj, objArr);
        }
        throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
    }
}
