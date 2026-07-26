package kotlin.coroutines.jvm.internal;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.f71;
import defpackage.g51;
import defpackage.js3;
import defpackage.ox4;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.zk8;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseContinuationImpl implements g51<Object>, f71, Serializable {
    private final g51<Object> completion;

    public BaseContinuationImpl(g51 g51Var) {
        this.completion = g51Var;
    }

    public g51<tx8> create(g51<?> g51Var) {
        js3.p(g51Var, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // defpackage.f71
    public f71 getCallerFrame() {
        g51<Object> g51Var = this.completion;
        if (g51Var instanceof f71) {
            return (f71) g51Var;
        }
        return null;
    }

    public final g51<Object> getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        tb1 tb1Var = (tb1) getClass().getAnnotation(tb1.class);
        String str = null;
        if (tb1Var == null || tb1Var.v() < 1) {
            return null;
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i = iIntValue >= 0 ? tb1Var.l()[iIntValue] : -1;
        ox4 ox4Var = zk8.h;
        ox4 ox4Var2 = zk8.i;
        if (ox4Var2 == null) {
            try {
                ox4 ox4Var3 = new ox4(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod(AppMeasurementSdk.ConditionalUserProperty.NAME, null));
                zk8.i = ox4Var3;
                ox4Var2 = ox4Var3;
            } catch (Exception unused2) {
                zk8.i = ox4Var;
                ox4Var2 = ox4Var;
            }
        }
        if (ox4Var2 != ox4Var && (method = ox4Var2.a) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = ox4Var2.b) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = ox4Var2.c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                str = (String) objInvoke3;
            }
        }
        if (str == null) {
            strC = tb1Var.c();
        } else {
            strC = str + '/' + tb1Var.c();
        }
        return new StackTraceElement(strC, tb1Var.m(), tb1Var.f(), i);
    }

    public abstract Object invokeSuspend(Object obj);

    public void releaseIntercepted() {
    }

    @Override // defpackage.g51
    public final void resumeWith(Object obj) {
        g51<Object> g51Var = this;
        while (true) {
            BaseContinuationImpl baseContinuationImpl = (BaseContinuationImpl) g51Var;
            g51<Object> g51Var2 = baseContinuationImpl.completion;
            js3.m(g51Var2);
            try {
                obj = baseContinuationImpl.invokeSuspend(obj);
                if (obj == CoroutineSingletons.a) {
                    return;
                }
            } catch (Throwable th) {
                obj = b.a(th);
            }
            baseContinuationImpl.releaseIntercepted();
            if (!(g51Var2 instanceof BaseContinuationImpl)) {
                g51Var2.resumeWith(obj);
                return;
            }
            g51Var = g51Var2;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    public g51<tx8> create(Object obj, g51<?> g51Var) {
        js3.p(g51Var, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
