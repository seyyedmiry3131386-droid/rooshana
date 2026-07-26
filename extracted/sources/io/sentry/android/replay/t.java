package io.sentry.android.replay;

import defpackage.bp2;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: loaded from: classes3.dex */
public final class t {
    public static final Object a;
    public static final Object b;
    public static final Object c;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.c;
        a = kotlin.a.b(lazyThreadSafetyMode, new bp2() { // from class: io.sentry.android.replay.WindowManagerSpy$windowManagerClass$2
            @Override // defpackage.bp2
            public final Object invoke() {
                try {
                    return Class.forName("android.view.WindowManagerGlobal");
                } catch (Throwable unused) {
                    return null;
                }
            }
        });
        b = kotlin.a.b(lazyThreadSafetyMode, new bp2() { // from class: io.sentry.android.replay.WindowManagerSpy$windowManagerInstance$2
            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                Method method;
                Class cls = (Class) t.a.getValue();
                if (cls == null || (method = cls.getMethod("getInstance", null)) == null) {
                    return null;
                }
                return method.invoke(null, null);
            }
        });
        c = kotlin.a.b(lazyThreadSafetyMode, new bp2() { // from class: io.sentry.android.replay.WindowManagerSpy$mViewsField$2
            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() throws NoSuchFieldException {
                Class cls = (Class) t.a.getValue();
                if (cls == null) {
                    return null;
                }
                Field declaredField = cls.getDeclaredField("mViews");
                declaredField.setAccessible(true);
                return declaredField;
            }
        });
    }
}
