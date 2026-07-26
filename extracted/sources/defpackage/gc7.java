package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutComponent;
import io.sentry.android.core.t0;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes.dex */
public final class gc7 {
    public final ClassLoader a;
    public final ql4 b;
    public final xg5 c;

    public gc7(ClassLoader classLoader, ql4 ql4Var) {
        this.a = classLoader;
        this.b = ql4Var;
        this.c = new xg5(9, classLoader);
    }

    public static final boolean e(gc7 gc7Var) throws NoSuchMethodException, ClassNotFoundException {
        Class clsB = gc7Var.b();
        Method method = clsB.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
        Method method2 = clsB.getMethod("removeWindowLayoutInfoListener", Consumer.class);
        js3.m(method);
        if (Modifier.isPublic(method.getModifiers())) {
            js3.m(method2);
            if (Modifier.isPublic(method2.getModifiers())) {
                return true;
            }
        }
        return false;
    }

    public final WindowLayoutComponent a() {
        int iA;
        xg5 xg5Var = this.c;
        xg5Var.getClass();
        boolean zD = false;
        try {
            js3.o(((ClassLoader) xg5Var.b).loadClass("androidx.window.extensions.WindowExtensionsProvider"), "loadClass(...)");
            if (o27.n("WindowExtensionsProvider#getWindowExtensions is not valid", new o06(13, xg5Var)) && o27.n("WindowExtensions#getWindowLayoutComponent is not valid", new fc7(this, 0)) && o27.n("FoldingFeature class is not valid", new fc7(this, 1)) && (iA = t72.a()) >= 1) {
                if (iA == 1) {
                    zD = c();
                } else if (iA < 5) {
                    zD = d();
                } else if (d() && o27.n("DisplayFoldFeature is not valid", new fc7(this, 3)) && o27.n("SupportedWindowFeatures is not valid", new fc7(this, 2)) && o27.n("WindowLayoutComponent#getSupportedWindowFeatures is not valid", new fc7(this, 4))) {
                    zD = true;
                }
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        if (!zD) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused2) {
            return null;
        }
    }

    public final Class b() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        js3.o(clsLoadClass, "loadClass(...)");
        return clsLoadClass;
    }

    public final boolean c() {
        return o27.n("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new fc7(this, 5));
    }

    public final boolean d() {
        boolean zE;
        if (c()) {
            String str = "WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid";
            js3.p(str, "errorMessage");
            try {
                zE = e(this);
                if (!zE) {
                    t0.d("ReflectionGuard", str);
                }
            } catch (ClassNotFoundException unused) {
                t0.d("ReflectionGuard", "ClassNotFound: ".concat(str));
                zE = false;
            } catch (NoSuchFieldException unused2) {
                t0.d("ReflectionGuard", "NoSuchField: ".concat(str));
                zE = false;
            } catch (NoSuchMethodException unused3) {
                t0.d("ReflectionGuard", "NoSuchMethod: ".concat(str));
                zE = false;
            }
            if (zE) {
                return true;
            }
        }
        return false;
    }
}
