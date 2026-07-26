package defpackage;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/* JADX INFO: loaded from: classes4.dex */
public final class f27 extends sl3 {
    @Override // defpackage.sl3
    public final boolean A(Method method) {
        return method.isDefault();
    }

    @Override // defpackage.sl3
    public final String v(int i, Method method) {
        Parameter parameter = method.getParameters()[i];
        if (!parameter.isNamePresent()) {
            return super.v(i, method);
        }
        return "parameter '" + parameter.getName() + '\'';
    }

    @Override // defpackage.sl3
    public final Object z(Method method, Class cls, Object obj, Object[] objArr) {
        return aq3.m(method, cls, obj, objArr);
    }
}
