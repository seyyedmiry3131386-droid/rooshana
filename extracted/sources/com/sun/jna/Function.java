package com.sun.jna;

import defpackage.d39;
import defpackage.d77;
import defpackage.f98;
import defpackage.fc9;
import defpackage.nl0;
import defpackage.rm7;
import defpackage.t61;
import defpackage.uh5;
import defpackage.z88;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class Function extends Pointer {
    public static final d77 g;
    public final uh5 b;
    public final String c;
    public final String d;
    public final int e;
    public final Map f;

    static {
        d39 d39Var;
        try {
            d39Var = Method.class.getMethod("isVarArgs", null) != null ? new d39(1) : new d39(0);
        } catch (NoSuchMethodException unused) {
            d39Var = new d39(0);
        } catch (SecurityException unused2) {
            d39Var = new d39(0);
        }
        g = d39Var;
    }

    public Function(uh5 uh5Var, String str, int i, String str2) {
        int i2 = i & 63;
        if ((i & 63) != i2) {
            throw new IllegalArgumentException(rm7.n(i2, "Unrecognized calling convention: "));
        }
        if (str == null) {
            throw new NullPointerException("Function name must not be null");
        }
        this.b = uh5Var;
        this.c = str;
        this.e = i;
        this.f = uh5Var.g;
        this.d = str2 == null ? Native.g() : str2;
        try {
            long j = uh5Var.a;
            if (j == 0) {
                throw new UnsatisfiedLinkError("Library has been unloaded");
            }
            this.a = Native.findSymbol(j, str);
        } catch (UnsatisfiedLinkError e) {
            StringBuilder sbN = t61.n("Error looking up function '", str, "': ");
            sbN.append(e.getMessage());
            throw new UnsatisfiedLinkError(sbN.toString());
        }
    }

    public static Object[] O(Object[] objArr) {
        if (objArr != null && objArr.length > 0) {
            Object obj = objArr[objArr.length - 1];
            Class<?> cls = obj != null ? obj.getClass() : null;
            if (cls != null && cls.isArray()) {
                Object[] objArr2 = (Object[]) obj;
                for (int i = 0; i < objArr2.length; i++) {
                    if (objArr2[i] instanceof Float) {
                        objArr2[i] = Double.valueOf(((Float) r4).floatValue());
                    }
                }
                int length = objArr.length + objArr2.length;
                Object[] objArr3 = new Object[length];
                System.arraycopy(objArr, 0, objArr3, 0, objArr.length - 1);
                System.arraycopy(objArr2, 0, objArr3, objArr.length - 1, objArr2.length);
                objArr3[length - 1] = null;
                return objArr3;
            }
        }
        return objArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a4 A[PHI: r13
      0x00a4: PHI (r13v2 java.lang.Object) = 
      (r13v1 java.lang.Object)
      (r13v14 java.lang.Object)
      (r13v15 java.lang.Object)
      (r13v16 java.lang.Object)
      (r13v18 java.lang.Object)
      (r13v20 java.lang.Object)
      (r13v22 java.lang.Object)
      (r13v1 java.lang.Object)
     binds: [B:41:0x008e, B:64:0x00f6, B:63:0x00f0, B:58:0x00d7, B:55:0x00c9, B:52:0x00be, B:49:0x00b0, B:45:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v16, types: [int] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object P(java.lang.reflect.Method r19, java.lang.Class[] r20, java.lang.Class r21, java.lang.Object[] r22, java.util.Map r23) {
        /*
            Method dump skipped, instruction units count: 735
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.jna.Function.P(java.lang.reflect.Method, java.lang.Class[], java.lang.Class, java.lang.Object[], java.util.Map):java.lang.Object");
    }

    public Object Q(Object[] objArr, Class cls, boolean z, int i) {
        int i2 = this.e | ((i & 3) << 7);
        if (cls == null || cls == Void.TYPE || cls == Void.class) {
            Native.invokeVoid(this, this.a, i2, objArr);
            return null;
        }
        if (cls == Boolean.TYPE || cls == Boolean.class) {
            return Native.invokeInt(this, this.a, i2, objArr) != 0 ? Boolean.TRUE : Boolean.FALSE;
        }
        if (cls == Byte.TYPE || cls == Byte.class) {
            return Byte.valueOf((byte) Native.invokeInt(this, this.a, i2, objArr));
        }
        if (cls == Short.TYPE || cls == Short.class) {
            return Short.valueOf((short) Native.invokeInt(this, this.a, i2, objArr));
        }
        if (cls == Character.TYPE || cls == Character.class) {
            return Character.valueOf((char) Native.invokeInt(this, this.a, i2, objArr));
        }
        if (cls == Integer.TYPE || cls == Integer.class) {
            return Integer.valueOf(Native.invokeInt(this, this.a, i2, objArr));
        }
        if (cls == Long.TYPE || cls == Long.class) {
            return Long.valueOf(Native.invokeLong(this, this.a, i2, objArr));
        }
        if (cls == Float.TYPE || cls == Float.class) {
            return Float.valueOf(Native.invokeFloat(this, this.a, i2, objArr));
        }
        if (cls == Double.TYPE || cls == Double.class) {
            return Double.valueOf(Native.invokeDouble(this, this.a, i2, objArr));
        }
        String str = this.d;
        if (cls == String.class) {
            Pointer pointerR = R(i2, objArr);
            if (pointerR != null) {
                return pointerR.i(str);
            }
            return null;
        }
        if (cls == fc9.class) {
            Pointer pointerR2 = R(i2, objArr);
            String wideString = pointerR2 != null ? Native.getWideString(pointerR2, pointerR2.a, 0L) : null;
            if (wideString != null) {
                return new fc9(wideString);
            }
        } else {
            if (Pointer.class.isAssignableFrom(cls)) {
                return R(i2, objArr);
            }
            if (f98.class.isAssignableFrom(cls)) {
                if (z88.class.isAssignableFrom(cls)) {
                    long j = this.a;
                    f98 f98VarNewInstance = f98.newInstance(cls);
                    Native.p(this, j, i2, objArr, f98VarNewInstance);
                    f98VarNewInstance.autoRead();
                    return f98VarNewInstance;
                }
                Pointer pointerR3 = R(i2, objArr);
                if (pointerR3 == null) {
                    return pointerR3;
                }
                f98 f98VarNewInstance2 = f98.newInstance(cls, pointerR3);
                f98VarNewInstance2.conditionalAutoRead();
                return f98VarNewInstance2;
            }
            if (Callback.class.isAssignableFrom(cls)) {
                Pointer pointerR4 = R(i2, objArr);
                return pointerR4 != null ? nl0.c(cls, pointerR4) : pointerR4;
            }
            if (cls == String[].class) {
                Pointer pointerR5 = R(i2, objArr);
                if (pointerR5 != null) {
                    return pointerR5.j(str);
                }
            } else {
                if (cls == fc9[].class) {
                    Pointer pointerR6 = R(i2, objArr);
                    if (pointerR6 != null) {
                        String[] strArrJ = pointerR6.j("--WIDE-STRING--");
                        fc9[] fc9VarArr = new fc9[strArrJ.length];
                        for (int i3 = 0; i3 < strArrJ.length; i3++) {
                            fc9VarArr[i3] = new fc9(strArrJ[i3]);
                        }
                        return fc9VarArr;
                    }
                } else {
                    if (cls != Pointer[].class) {
                        if (!z) {
                            throw new IllegalArgumentException("Unsupported return type " + cls + " in function " + this.c);
                        }
                        Object objInvokeObject = Native.invokeObject(this, this.a, i2, objArr);
                        if (objInvokeObject == null || cls.isAssignableFrom(objInvokeObject.getClass())) {
                            return objInvokeObject;
                        }
                        throw new ClassCastException("Return type " + cls + " does not match result " + objInvokeObject.getClass());
                    }
                    Pointer pointerR7 = R(i2, objArr);
                    if (pointerR7 != null) {
                        ArrayList arrayList = new ArrayList();
                        Pointer pointerG = pointerR7.g(0L);
                        int i4 = 0;
                        while (pointerG != null) {
                            arrayList.add(pointerG);
                            i4 += Native.i;
                            pointerG = pointerR7.g(i4);
                        }
                        return (Pointer[]) arrayList.toArray(new Pointer[0]);
                    }
                }
            }
        }
        return null;
    }

    public final Pointer R(int i, Object[] objArr) {
        long jInvokePointer = Native.invokePointer(this, this.a, i, objArr);
        if (jInvokePointer == 0) {
            return null;
        }
        return new Pointer(jInvokePointer);
    }

    @Override // com.sun.jna.Pointer
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            Function function = (Function) obj;
            if (function.e == this.e && function.f.equals(this.f) && function.a == this.a) {
                return true;
            }
        }
        return false;
    }

    @Override // com.sun.jna.Pointer
    public final int hashCode() {
        return this.f.hashCode() + this.e + super.hashCode();
    }

    @Override // com.sun.jna.Pointer
    public final String toString() {
        uh5 uh5Var = this.b;
        if (uh5Var == null) {
            return "native function@0x" + Long.toHexString(this.a);
        }
        return "native function " + this.c + "(" + uh5Var.b + ")@0x" + Long.toHexString(this.a);
    }

    public Function(Pointer pointer, int i, String str) {
        int i2 = i & 63;
        if ((i & 63) != i2) {
            throw new IllegalArgumentException(rm7.n(i2, "Unrecognized calling convention: "));
        }
        if (pointer.a != 0) {
            this.c = pointer.toString();
            this.e = i;
            this.a = pointer.a;
            this.f = Collections.EMPTY_MAP;
            this.d = str == null ? Native.g() : str;
            return;
        }
        throw new NullPointerException("Function address may not be null");
    }
}
