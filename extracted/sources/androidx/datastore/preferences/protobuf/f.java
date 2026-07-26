package androidx.datastore.preferences.protobuf;

import defpackage.hf7;
import defpackage.hn6;
import defpackage.r79;
import defpackage.rm7;
import defpackage.vy8;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, f> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected n unknownFields;

    public f() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = n.f;
    }

    public static f d(Class cls) {
        f fVar = defaultInstanceMap.get(cls);
        if (fVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                fVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (fVar != null) {
            return fVar;
        }
        f fVar2 = (f) ((f) vy8.b(cls)).c(GeneratedMessageLite$MethodToInvoke.f);
        if (fVar2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, fVar2);
        return fVar2;
    }

    public static Object e(Method method, f fVar, Object... objArr) {
        try {
            return method.invoke(fVar, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static final boolean f(f fVar, boolean z) {
        byte bByteValue = ((Byte) fVar.c(GeneratedMessageLite$MethodToInvoke.a)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        hn6 hn6Var = hn6.c;
        hn6Var.getClass();
        boolean zC = hn6Var.a(fVar.getClass()).c(fVar);
        if (z) {
            fVar.c(GeneratedMessageLite$MethodToInvoke.b);
        }
        return zC;
    }

    public static void j(Class cls, f fVar) {
        fVar.h();
        defaultInstanceMap.put(cls, fVar);
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public final int a(hf7 hf7Var) {
        int iG;
        int iG2;
        if (g()) {
            if (hf7Var == null) {
                hn6 hn6Var = hn6.c;
                hn6Var.getClass();
                iG2 = hn6Var.a(getClass()).g(this);
            } else {
                iG2 = hf7Var.g(this);
            }
            if (iG2 >= 0) {
                return iG2;
            }
            throw new IllegalStateException(rm7.n(iG2, "serialized size must be non-negative, was "));
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (hf7Var == null) {
            hn6 hn6Var2 = hn6.c;
            hn6Var2.getClass();
            iG = hn6Var2.a(getClass()).g(this);
        } else {
            iG = hf7Var.g(this);
        }
        k(iG);
        return iG;
    }

    @Override // androidx.datastore.preferences.protobuf.a
    public final void b(e eVar) {
        hn6 hn6Var = hn6.c;
        hn6Var.getClass();
        hf7 hf7VarA = hn6Var.a(getClass());
        r79 r79Var = eVar.l;
        if (r79Var == null) {
            r79Var = new r79(eVar);
        }
        hf7VarA.e(this, r79Var);
    }

    public abstract Object c(GeneratedMessageLite$MethodToInvoke generatedMessageLite$MethodToInvoke);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        hn6 hn6Var = hn6.c;
        hn6Var.getClass();
        return hn6Var.a(getClass()).i(this, (f) obj);
    }

    public final boolean g() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void h() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public final int hashCode() {
        if (g()) {
            hn6 hn6Var = hn6.c;
            hn6Var.getClass();
            return hn6Var.a(getClass()).h(this);
        }
        if (this.memoizedHashCode == 0) {
            hn6 hn6Var2 = hn6.c;
            hn6Var2.getClass();
            this.memoizedHashCode = hn6Var2.a(getClass()).h(this);
        }
        return this.memoizedHashCode;
    }

    public final f i() {
        return (f) c(GeneratedMessageLite$MethodToInvoke.d);
    }

    public final void k(int i) {
        if (i < 0) {
            throw new IllegalStateException(rm7.n(i, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = g.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        g.c(this, sb, 0);
        return sb.toString();
    }
}
