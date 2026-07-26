package io.sentry.android.replay;

import defpackage.bp2;
import java.lang.reflect.Field;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y {
    public static final Object a;
    public static final Object b;

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.c;
        a = kotlin.a.b(lazyThreadSafetyMode, new bp2() { // from class: io.sentry.android.replay.WindowSpy$decorViewClass$2
            @Override // defpackage.bp2
            public final Object invoke() {
                try {
                    return Class.forName("com.android.internal.policy.DecorView");
                } catch (Throwable unused) {
                    return null;
                }
            }
        });
        b = kotlin.a.b(lazyThreadSafetyMode, new bp2() { // from class: io.sentry.android.replay.WindowSpy$windowField$2
            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                Class cls = (Class) y.a.getValue();
                if (cls != null) {
                    try {
                        Field declaredField = cls.getDeclaredField("mWindow");
                        declaredField.setAccessible(true);
                        return declaredField;
                    } catch (NoSuchFieldException unused) {
                        cls.toString();
                    }
                }
                return null;
            }
        });
    }
}
