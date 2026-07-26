package com.sun.jna;

import defpackage.bl4;
import defpackage.d77;
import defpackage.f98;
import defpackage.fc9;
import defpackage.m96;
import defpackage.nl0;
import defpackage.vh5;
import defpackage.wh5;
import defpackage.y88;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public class Pointer {
    public long a;

    public Pointer(long j) {
        this.a = j;
    }

    public void A(long j, Pointer pointer) {
        Native.setPointer(this, this.a, j, pointer != null ? pointer.a : 0L);
    }

    public void B(long j, short s) {
        Native.setShort(this, this.a, j, s);
    }

    public final void C(long j, Class cls, Object obj) {
        Object objA;
        Object objA2;
        if (cls == Boolean.TYPE || cls == Boolean.class) {
            y(Boolean.TRUE.equals(obj) ? -1 : 0, j);
            return;
        }
        Class<?> cls2 = Byte.TYPE;
        if (cls == cls2 || cls == Byte.class) {
            u(j, obj == null ? (byte) 0 : ((Byte) obj).byteValue());
            return;
        }
        Class<?> cls3 = Short.TYPE;
        if (cls == cls3 || cls == Short.class) {
            B(j, obj == null ? (short) 0 : ((Short) obj).shortValue());
            return;
        }
        Class<?> cls4 = Character.TYPE;
        if (cls == cls4 || cls == Character.class) {
            v(j, obj == null ? (char) 0 : ((Character) obj).charValue());
            return;
        }
        Class<?> cls5 = Integer.TYPE;
        if (cls == cls5 || cls == Integer.class) {
            y(obj == null ? 0 : ((Integer) obj).intValue(), j);
            return;
        }
        Class<?> cls6 = Long.TYPE;
        if (cls == cls6 || cls == Long.class) {
            z(j, obj == null ? 0L : ((Long) obj).longValue());
            return;
        }
        Class<?> cls7 = Float.TYPE;
        if (cls == cls7 || cls == Float.class) {
            x(obj == null ? 0.0f : ((Float) obj).floatValue(), j);
            return;
        }
        Class<?> cls8 = Double.TYPE;
        if (cls == cls8 || cls == Double.class) {
            w(j, obj == null ? 0.0d : ((Double) obj).doubleValue());
            return;
        }
        if (cls == Pointer.class) {
            A(j, (Pointer) obj);
            return;
        }
        if (cls == String.class) {
            A(j, (Pointer) obj);
            return;
        }
        if (cls == fc9.class) {
            A(j, (Pointer) obj);
            return;
        }
        if (f98.class.isAssignableFrom(cls)) {
            f98 f98Var = (f98) obj;
            if (!y88.class.isAssignableFrom(cls)) {
                f98Var.useMemory(this, (int) j, true);
                f98Var.write();
                return;
            } else {
                A(j, f98Var != null ? f98Var.getPointer() : null);
                if (f98Var != null) {
                    f98Var.autoWrite();
                    return;
                }
                return;
            }
        }
        if (Callback.class.isAssignableFrom(cls)) {
            A(j, nl0.e((Callback) obj));
            return;
        }
        if (m96.b && Buffer.class.isAssignableFrom(cls)) {
            A(j, obj != null ? Native.h((Buffer) obj) : null);
            return;
        }
        if (vh5.class.isAssignableFrom(cls)) {
            wh5 wh5VarB = wh5.b(cls);
            Class cls9 = wh5VarB.b;
            if (obj == null) {
                if (!Pointer.class.isAssignableFrom(cls9)) {
                    objA2 = wh5VarB.a();
                }
                C(j, cls9, objA);
                return;
            }
            objA2 = obj;
            objA = ((vh5) objA2).a();
            C(j, cls9, objA);
            return;
        }
        if (!cls.isArray()) {
            throw new IllegalArgumentException(bl4.t(cls, "Writing ", " to memory is not supported"));
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType == cls2) {
            byte[] bArr = (byte[]) obj;
            G(bArr.length, j, bArr);
            return;
        }
        if (componentType == cls3) {
            short[] sArr = (short[]) obj;
            N(j, sArr, sArr.length);
            return;
        }
        if (componentType == cls4) {
            char[] cArr = (char[]) obj;
            I(j, cArr, cArr.length);
            return;
        }
        if (componentType == cls5) {
            int[] iArr = (int[]) obj;
            L(j, iArr, iArr.length);
            return;
        }
        if (componentType == cls6) {
            long[] jArr = (long[]) obj;
            H(jArr.length, j, jArr);
            return;
        }
        if (componentType == cls7) {
            float[] fArr = (float[]) obj;
            K(j, fArr, fArr.length);
            return;
        }
        if (componentType == cls8) {
            double[] dArr = (double[]) obj;
            J(j, dArr, dArr.length);
            return;
        }
        if (Pointer.class.isAssignableFrom(componentType)) {
            Pointer[] pointerArr = (Pointer[]) obj;
            M(j, pointerArr, pointerArr.length);
            return;
        }
        if (!f98.class.isAssignableFrom(componentType)) {
            if (!vh5.class.isAssignableFrom(componentType)) {
                throw new IllegalArgumentException(bl4.t(componentType, "Writing array of ", " to memory not supported"));
            }
            vh5[] vh5VarArr = (vh5[]) obj;
            wh5 wh5VarB2 = wh5.b(componentType);
            Class cls10 = wh5VarB2.b;
            int iK = Native.k(obj.getClass(), obj) / vh5VarArr.length;
            for (int i = 0; i < vh5VarArr.length; i++) {
                vh5 vh5VarA = vh5VarArr[i];
                if (vh5VarA != null) {
                    objA = vh5VarA.a();
                } else if (Pointer.class.isAssignableFrom(cls10)) {
                    objA = null;
                } else {
                    vh5VarA = wh5VarB2.a();
                    objA = vh5VarA.a();
                }
                C(((long) (i * iK)) + j, cls10, objA);
            }
            return;
        }
        f98[] f98VarArr = (f98[]) obj;
        if (y88.class.isAssignableFrom(componentType)) {
            int length = f98VarArr.length;
            Pointer[] pointerArr2 = new Pointer[length];
            for (int i2 = 0; i2 < f98VarArr.length; i2++) {
                f98 f98Var2 = f98VarArr[i2];
                if (f98Var2 == null) {
                    pointerArr2[i2] = null;
                } else {
                    pointerArr2[i2] = f98Var2.getPointer();
                    f98VarArr[i2].write();
                }
            }
            M(j, pointerArr2, length);
            return;
        }
        f98 f98VarNewInstance = f98VarArr[0];
        if (f98VarNewInstance == null) {
            f98VarNewInstance = f98.newInstance(componentType, E(j));
            f98VarArr[0] = f98VarNewInstance;
        } else {
            f98VarNewInstance.useMemory(this, (int) j, true);
        }
        f98VarNewInstance.write();
        f98[] array = f98VarNewInstance.toArray(f98VarArr.length);
        for (int i3 = 1; i3 < f98VarArr.length; i3++) {
            f98 f98Var3 = f98VarArr[i3];
            if (f98Var3 == null) {
                f98VarArr[i3] = array[i3];
            } else {
                f98Var3.useMemory(this, (int) (((long) (f98Var3.size() * i3)) + j), true);
            }
            f98VarArr[i3].write();
        }
    }

    public void D(String str) {
        Native.setWideString(this, this.a, 0L, str);
    }

    public Pointer E(long j) {
        return F(j, 0L);
    }

    public Pointer F(long j, long j2) {
        return j == 0 ? this : new Pointer(this.a + j);
    }

    public void G(int i, long j, byte[] bArr) {
        Native.write(this, this.a, j, bArr, 0, i);
    }

    public void H(int i, long j, long[] jArr) {
        Native.write(this, this.a, j, jArr, 0, i);
    }

    public void I(long j, char[] cArr, int i) {
        Native.write(this, this.a, j, cArr, 0, i);
    }

    public void J(long j, double[] dArr, int i) {
        Native.write(this, this.a, j, dArr, 0, i);
    }

    public void K(long j, float[] fArr, int i) {
        Native.write(this, this.a, j, fArr, 0, i);
    }

    public void L(long j, int[] iArr, int i) {
        Native.write(this, this.a, j, iArr, 0, i);
    }

    public final void M(long j, Pointer[] pointerArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            A(((long) (Native.i * i2)) + j, pointerArr[i2]);
        }
    }

    public void N(long j, short[] sArr, int i) {
        Native.write(this, this.a, j, sArr, 0, i);
    }

    public byte a(long j) {
        return Native.getByte(this, this.a, j);
    }

    public char b(long j) {
        return Native.getChar(this, this.a, j);
    }

    public double c(long j) {
        return Native.getDouble(this, this.a, j);
    }

    public float d(long j) {
        return Native.getFloat(this, this.a, j);
    }

    public int e(long j) {
        return Native.getInt(this, this.a, j);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && (obj instanceof Pointer) && ((Pointer) obj).a == this.a;
    }

    public long f(long j) {
        return Native.getLong(this, this.a, j);
    }

    public Pointer g(long j) {
        return Native.l(this.a + j);
    }

    public short h(long j) {
        return Native.getShort(this, this.a, j);
    }

    public int hashCode() {
        long j = this.a;
        return (int) ((j >>> 32) + j);
    }

    public String i(String str) {
        Logger logger = Native.a;
        byte[] stringBytes = Native.getStringBytes(this, this.a, 0L);
        if (str != null) {
            try {
                return new String(stringBytes, str);
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return new String(stringBytes);
    }

    public final String[] j(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            Pointer pointerG = g(i);
            if (pointerG == null) {
                return (String[]) arrayList.toArray(new String[0]);
            }
            arrayList.add("--WIDE-STRING--".equals(str) ? pointerG.l() : pointerG.i(str));
            i += Native.i;
        }
    }

    public final Object k(long j, Class cls, Object obj) {
        if (f98.class.isAssignableFrom(cls)) {
            f98 f98Var = (f98) obj;
            if (y88.class.isAssignableFrom(cls)) {
                return f98.updateStructureByReference(cls, f98Var, g(j));
            }
            f98Var.useMemory(this, (int) j, true);
            f98Var.read();
            return f98Var;
        }
        if (cls == Boolean.TYPE || cls == Boolean.class) {
            boolean z = e(j) != 0;
            d77 d77Var = Function.g;
            return z ? Boolean.TRUE : Boolean.FALSE;
        }
        Class<?> cls2 = Byte.TYPE;
        if (cls == cls2 || cls == Byte.class) {
            return Byte.valueOf(a(j));
        }
        Class<?> cls3 = Short.TYPE;
        if (cls == cls3 || cls == Short.class) {
            return Short.valueOf(h(j));
        }
        Class<?> cls4 = Character.TYPE;
        if (cls == cls4 || cls == Character.class) {
            return Character.valueOf(b(j));
        }
        Class<?> cls5 = Integer.TYPE;
        if (cls == cls5 || cls == Integer.class) {
            return Integer.valueOf(e(j));
        }
        Class<?> cls6 = Long.TYPE;
        if (cls == cls6 || cls == Long.class) {
            return Long.valueOf(f(j));
        }
        Class<?> cls7 = Float.TYPE;
        if (cls == cls7 || cls == Float.class) {
            return Float.valueOf(d(j));
        }
        Class<?> cls8 = Double.TYPE;
        if (cls == cls8 || cls == Double.class) {
            return Double.valueOf(c(j));
        }
        if (Pointer.class.isAssignableFrom(cls)) {
            Pointer pointerG = g(j);
            if (pointerG == null) {
                return null;
            }
            Pointer pointer = obj instanceof Pointer ? (Pointer) obj : null;
            return (pointer == null || pointerG.a != pointer.a) ? pointerG : pointer;
        }
        if (cls == String.class) {
            Pointer pointerG2 = g(j);
            if (pointerG2 != null) {
                return pointerG2.i(Native.g());
            }
            return null;
        }
        if (cls == fc9.class) {
            Pointer pointerG3 = g(j);
            if (pointerG3 != null) {
                return new fc9(pointerG3.l());
            }
            return null;
        }
        if (Callback.class.isAssignableFrom(cls)) {
            Pointer pointerG4 = g(j);
            if (pointerG4 == null) {
                return null;
            }
            Callback callback = (Callback) obj;
            return !pointerG4.equals(nl0.e(callback)) ? nl0.c(cls, pointerG4) : callback;
        }
        if (m96.b && Buffer.class.isAssignableFrom(cls)) {
            Pointer pointerG5 = g(j);
            if (pointerG5 == null) {
                return null;
            }
            Pointer pointerH = obj == null ? null : Native.h((Buffer) obj);
            if (pointerH == null || !pointerH.equals(pointerG5)) {
                throw new IllegalStateException("Can't autogenerate a direct buffer on memory read");
            }
            return obj;
        }
        if (vh5.class.isAssignableFrom(cls)) {
            vh5 vh5Var = (vh5) obj;
            if (vh5Var != null) {
                Object objB = vh5Var.b(k(j, vh5Var.c(), null));
                return vh5Var.equals(objB) ? vh5Var : objB;
            }
            wh5 wh5VarB = wh5.b(cls);
            return wh5VarB.c.b(k(j, wh5VarB.b, null));
        }
        if (!cls.isArray()) {
            throw new IllegalArgumentException(bl4.t(cls, "Reading \"", "\" from memory is not supported"));
        }
        if (obj == null) {
            throw new IllegalStateException("Need an initialized array");
        }
        Class<?> componentType = cls.getComponentType();
        int length = Array.getLength(obj);
        if (componentType == cls2) {
            m(length, j, (byte[]) obj);
            return obj;
        }
        if (componentType == cls3) {
            t(j, (short[]) obj, length);
            return obj;
        }
        if (componentType == cls4) {
            o(j, (char[]) obj, length);
            return obj;
        }
        if (componentType == cls5) {
            r(j, (int[]) obj, length);
            return obj;
        }
        if (componentType == cls6) {
            n(length, j, (long[]) obj);
            return obj;
        }
        if (componentType == cls7) {
            q(j, (float[]) obj, length);
            return obj;
        }
        if (componentType == cls8) {
            p(j, (double[]) obj, length);
            return obj;
        }
        if (Pointer.class.isAssignableFrom(componentType)) {
            s(j, (Pointer[]) obj, length);
            return obj;
        }
        if (!f98.class.isAssignableFrom(componentType)) {
            if (!vh5.class.isAssignableFrom(componentType)) {
                throw new IllegalArgumentException(bl4.t(componentType, "Reading array of ", " from memory not supported"));
            }
            vh5[] vh5VarArr = (vh5[]) obj;
            wh5 wh5VarB2 = wh5.b(componentType);
            int iK = Native.k(obj.getClass(), obj) / vh5VarArr.length;
            for (int i = 0; i < vh5VarArr.length; i++) {
                vh5VarArr[i] = (vh5) wh5VarB2.c.b(k(((long) (iK * i)) + j, wh5VarB2.b, vh5VarArr[i]));
            }
            return obj;
        }
        f98[] f98VarArr = (f98[]) obj;
        if (y88.class.isAssignableFrom(componentType)) {
            int length2 = f98VarArr.length;
            Pointer[] pointerArr = new Pointer[length2];
            s(j, pointerArr, length2);
            for (int i2 = 0; i2 < f98VarArr.length; i2++) {
                f98VarArr[i2] = f98.updateStructureByReference(componentType, f98VarArr[i2], pointerArr[i2]);
            }
        } else {
            f98 f98VarNewInstance = f98VarArr[0];
            if (f98VarNewInstance == null) {
                f98VarNewInstance = f98.newInstance(componentType, E(j));
                f98VarNewInstance.conditionalAutoRead();
                f98VarArr[0] = f98VarNewInstance;
            } else {
                f98VarNewInstance.useMemory(this, (int) j, true);
                f98VarNewInstance.read();
            }
            f98[] array = f98VarNewInstance.toArray(f98VarArr.length);
            for (int i3 = 1; i3 < f98VarArr.length; i3++) {
                f98 f98Var2 = f98VarArr[i3];
                if (f98Var2 == null) {
                    f98VarArr[i3] = array[i3];
                } else {
                    f98Var2.useMemory(this, (int) (((long) (f98Var2.size() * i3)) + j), true);
                    f98VarArr[i3].read();
                }
            }
        }
        return obj;
    }

    public String l() {
        return Native.getWideString(this, this.a, 0L);
    }

    public void m(int i, long j, byte[] bArr) {
        Native.read(this, this.a, j, bArr, 0, i);
    }

    public void n(int i, long j, long[] jArr) {
        Native.read(this, this.a, j, jArr, 0, i);
    }

    public void o(long j, char[] cArr, int i) {
        Native.read(this, this.a, j, cArr, 0, i);
    }

    public void p(long j, double[] dArr, int i) {
        Native.read(this, this.a, j, dArr, 0, i);
    }

    public void q(long j, float[] fArr, int i) {
        Native.read(this, this.a, j, fArr, 0, i);
    }

    public void r(long j, int[] iArr, int i) {
        Native.read(this, this.a, j, iArr, 0, i);
    }

    public final void s(long j, Pointer[] pointerArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            Pointer pointerG = g(((long) (Native.i * i2)) + j);
            Pointer pointer = pointerArr[i2];
            if (pointer == null || pointerG == null || pointerG.a != pointer.a) {
                pointerArr[i2] = pointerG;
            }
        }
    }

    public void t(long j, short[] sArr, int i) {
        Native.read(this, this.a, j, sArr, 0, i);
    }

    public String toString() {
        return "native@0x" + Long.toHexString(this.a);
    }

    public void u(long j, byte b) {
        Native.setByte(this, this.a, j, b);
    }

    public void v(long j, char c) {
        Native.setChar(this, this.a, j, c);
    }

    public void w(long j, double d) {
        Native.setDouble(this, this.a, j, d);
    }

    public void x(float f, long j) {
        Native.setFloat(this, this.a, j, f);
    }

    public void y(int i, long j) {
        Native.setInt(this, this.a, j, i);
    }

    public void z(long j, long j2) {
        Native.setLong(this, this.a, j, j2);
    }
}
