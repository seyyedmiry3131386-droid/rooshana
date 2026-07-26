package defpackage;

import java.lang.reflect.Method;
import java.security.PrivilegedAction;

/* JADX INFO: loaded from: classes3.dex */
public final class ph5 implements PrivilegedAction {
    @Override // java.security.PrivilegedAction
    public final Object run() {
        try {
            Method declaredMethod = ClassLoader.class.getDeclaredMethod("findLibrary", String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Exception unused) {
            return null;
        }
    }
}
