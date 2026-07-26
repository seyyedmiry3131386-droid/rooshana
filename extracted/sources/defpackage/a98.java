package defpackage;

import com.sun.jna.Callback;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class a98 extends f98 {
    public static final WeakHashMap b = new WeakHashMap();
    public gt4 a;

    static {
        if (Native.i == 0) {
            throw new Error("Native library not initialized");
        }
        throw new Error("FFI types not initialized");
    }

    public static Pointer g(Class cls, Object obj) {
        if (Native.i(cls).get("type-mapper") != null) {
            throw new ClassCastException();
        }
        WeakHashMap weakHashMap = b;
        synchronized (weakHashMap) {
            try {
                Object obj2 = weakHashMap.get(cls);
                if (obj2 instanceof Pointer) {
                    return (Pointer) obj2;
                }
                if (obj2 instanceof a98) {
                    return ((a98) obj2).getPointer();
                }
                Object objA = null;
                if ((m96.b && Buffer.class.isAssignableFrom(cls)) || Callback.class.isAssignableFrom(cls)) {
                    weakHashMap.put(cls, null);
                    return null;
                }
                int i = 0;
                if (f98.class.isAssignableFrom(cls)) {
                    if (obj == null) {
                        obj = f98.newInstance(cls, f98.PLACEHOLDER_MEMORY);
                    }
                    if (y88.class.isAssignableFrom(cls)) {
                        weakHashMap.put(cls, null);
                        return null;
                    }
                    f98 f98Var = (f98) obj;
                    a98 a98Var = new a98();
                    f98Var.a(true);
                    int size = f98Var.fields().size() + 1;
                    Pointer[] pointerArr = new Pointer[size];
                    Iterator<d98> it = f98Var.fields().values().iterator();
                    while (it.hasNext()) {
                        pointerArr[i] = f98Var.getFieldTypeInfo(it.next());
                        i++;
                    }
                    gt4 gt4Var = new gt4(Native.i * size);
                    a98Var.a = gt4Var;
                    gt4Var.M(0L, pointerArr, size);
                    a98Var.write();
                    b.put(cls, a98Var);
                    return a98Var.getPointer();
                }
                if (vh5.class.isAssignableFrom(cls)) {
                    wh5 wh5VarB = wh5.b(cls);
                    if (obj != null) {
                        objA = ((vh5) obj).a();
                    } else if (!Pointer.class.isAssignableFrom(wh5VarB.b)) {
                        obj = wh5VarB.a();
                        objA = ((vh5) obj).a();
                    }
                    return g(wh5VarB.b, objA);
                }
                if (!cls.isArray()) {
                    throw new IllegalArgumentException("Unsupported type " + cls);
                }
                a98 a98Var2 = new a98();
                int length = Array.getLength(obj);
                int i2 = length + 1;
                Pointer[] pointerArr2 = new Pointer[i2];
                Pointer pointerG = g(cls.getComponentType(), null);
                while (i < length) {
                    pointerArr2[i] = pointerG;
                    i++;
                }
                gt4 gt4Var2 = new gt4(Native.i * i2);
                a98Var2.a = gt4Var2;
                gt4Var2.M(0L, pointerArr2, i2);
                a98Var2.write();
                b.put(obj, a98Var2);
                return a98Var2.getPointer();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Pointer h(Object obj) {
        if (obj == null) {
            return null;
        }
        return obj instanceof Class ? g((Class) obj, null) : g(obj.getClass(), obj);
    }
}
