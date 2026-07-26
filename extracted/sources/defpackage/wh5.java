package defpackage;

import com.sun.jna.FromNativeConverter;
import com.sun.jna.ToNativeConverter;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class wh5 implements FromNativeConverter, ToNativeConverter {
    public static final WeakHashMap d = new WeakHashMap();
    public final Class a;
    public final Class b;
    public final vh5 c;

    public wh5(Class cls) {
        if (!vh5.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException(bl4.v("Type must derive from ", vh5.class));
        }
        this.a = cls;
        vh5 vh5VarA = a();
        this.c = vh5VarA;
        this.b = vh5VarA.c();
    }

    public static wh5 b(Class cls) {
        wh5 wh5Var;
        WeakHashMap weakHashMap = d;
        synchronized (weakHashMap) {
            try {
                Reference reference = (Reference) weakHashMap.get(cls);
                wh5Var = reference != null ? (wh5) reference.get() : null;
                if (wh5Var == null) {
                    wh5Var = new wh5(cls);
                    weakHashMap.put(cls, new SoftReference(wh5Var));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return wh5Var;
    }

    public final vh5 a() {
        Class cls = this.a;
        return cls.isEnum() ? (vh5) cls.getEnumConstants()[0] : (vh5) yq2.r0(cls);
    }
}
