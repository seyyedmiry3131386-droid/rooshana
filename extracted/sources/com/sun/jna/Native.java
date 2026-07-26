package com.sun.jna;

import defpackage.bl4;
import defpackage.dw1;
import defpackage.f98;
import defpackage.fc9;
import defpackage.m96;
import defpackage.nl0;
import defpackage.ol3;
import defpackage.p54;
import defpackage.ph5;
import defpackage.si0;
import defpackage.tt3;
import defpackage.uh5;
import defpackage.vh5;
import defpackage.wh5;
import defpackage.y88;
import defpackage.z88;
import io.sentry.config.a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.Buffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.security.AccessController;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Native {
    public static final Logger a;
    public static final Charset b;
    public static final String c;
    public static final boolean d;
    public static final boolean e;
    public static String f;
    public static final Map g;
    public static final Map h;
    public static final int i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final ol3 m;
    public static final WeakHashMap n;
    public static final WeakHashMap o;

    /* JADX WARN: Removed duplicated region for block: B:110:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0177 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018e  */
    static {
        /*
            Method dump skipped, instruction units count: 893
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.jna.Native.<clinit>():void");
    }

    private static native long _getDirectBufferPointer(Buffer buffer);

    private static native long _getPointer(long j2);

    public static HashMap a(Class cls, Map map, Object obj) {
        HashMap map2 = new HashMap(map);
        map2.put("enclosing-library", cls);
        g.put(cls, map2);
        if (obj != null) {
            h.put(cls, new WeakReference(obj));
        }
        if (!cls.isInterface() && p54.class.isAssignableFrom(cls)) {
            for (Class<?> cls2 : cls.getInterfaces()) {
                if (p54.class.isAssignableFrom(cls2)) {
                    a(cls2, map2, obj);
                    return map2;
                }
            }
        }
        return map2;
    }

    public static void b(File file) {
        if (file.delete()) {
            return;
        }
        try {
            new File(file.getParentFile(), file.getName() + ".x").createNewFile();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    public static File c(ClassLoader classLoader, String str) throws IOException {
        File file;
        Level level = (d || (e && str.contains("jnidispatch"))) ? Level.INFO : Level.FINE;
        if (classLoader == null && (classLoader = Thread.currentThread().getContextClassLoader()) == null) {
            classLoader = Native.class.getClassLoader();
        }
        Logger logger = a;
        logger.log(level, "Looking in classpath from {0} for {1}", new Object[]{classLoader, str});
        String strI = str.startsWith("/") ? str : uh5.i(str);
        String strZ = str.startsWith("/") ? str : bl4.z(new StringBuilder(), m96.d, "/", strI);
        if (strZ.startsWith("/")) {
            strZ = strZ.substring(1);
        }
        URL resource = classLoader.getResource(strZ);
        if (resource == null && strZ.startsWith(m96.d)) {
            resource = classLoader.getResource(strI);
        }
        if (resource == null) {
            String property = System.getProperty("java.class.path");
            if (classLoader instanceof URLClassLoader) {
                property = Arrays.asList(((URLClassLoader) classLoader).getURLs()).toString();
            }
            throw new IOException(bl4.w("Native library (", strZ, ") not found in resource path (", property, ")"));
        }
        logger.log(level, "Found library resource at {0}", resource);
        if (resource.getProtocol().toLowerCase().equals("file")) {
            try {
                file = new File(new URI(resource.toString()));
            } catch (URISyntaxException unused) {
                file = new File(resource.getPath());
            }
            logger.log(level, "Looking in {0}", file.getAbsolutePath());
            if (file.exists()) {
                return file;
            }
            throw new IOException("File URL " + resource + " could not be properly decoded");
        }
        FileOutputStream fileOutputStreamK = null;
        if (Boolean.getBoolean("jna.nounpack")) {
            return null;
        }
        InputStream resourceAsStream = classLoader.getResourceAsStream(strZ);
        try {
            if (resourceAsStream == null) {
                throw new IOException(dw1.n("Can't obtain InputStream for ", strZ));
            }
            try {
                File fileCreateTempFile = File.createTempFile("jna", m96.h() ? ".dll" : null, n());
                if (!Boolean.getBoolean("jnidispatch.preserve")) {
                    fileCreateTempFile.deleteOnExit();
                }
                logger.log(level, "Extracting library to {0}", fileCreateTempFile.getAbsolutePath());
                fileOutputStreamK = a.k(new FileOutputStream(fileCreateTempFile), fileCreateTempFile);
                byte[] bArr = new byte[1024];
                while (true) {
                    int i2 = resourceAsStream.read(bArr, 0, 1024);
                    if (i2 > 0) {
                        fileOutputStreamK.write(bArr, 0, i2);
                    } else {
                        try {
                            break;
                        } catch (IOException unused2) {
                        }
                    }
                }
                resourceAsStream.close();
                try {
                    fileOutputStreamK.close();
                } catch (IOException unused3) {
                }
                return fileCreateTempFile;
            } catch (IOException e2) {
                throw new IOException("Failed to create temporary file for " + str + " library: " + e2.getMessage());
            }
        } finally {
        }
    }

    public static native void close(long j2);

    public static native synchronized long createNativeCallback(Callback callback, Method method, Class<?>[] clsArr, Class<?> cls, int i2, int i3, String str);

    public static Class d(Class cls) {
        if (cls == null) {
            return null;
        }
        Map map = (Map) g.get(cls);
        if (map != null) {
            Class cls2 = (Class) map.get("enclosing-library");
            if (cls2 != null) {
                return cls2;
            }
        } else if (!p54.class.isAssignableFrom(cls)) {
            if (Callback.class.isAssignableFrom(cls)) {
                cls = nl0.b(cls);
            }
            Class clsD = d(cls.getDeclaringClass());
            return clsD != null ? clsD : d(cls.getSuperclass());
        }
        return cls;
    }

    public static Charset e(String str) {
        Charset charsetForName;
        Logger logger = a;
        if (str != null) {
            try {
                charsetForName = Charset.forName(str);
            } catch (IllegalCharsetNameException e2) {
                logger.log(Level.WARNING, "JNA Warning: Encoding ''{0}'' is unsupported ({1})", new Object[]{str, e2.getMessage()});
                charsetForName = null;
            } catch (UnsupportedCharsetException e3) {
                logger.log(Level.WARNING, "JNA Warning: Encoding ''{0}'' is unsupported ({1})", new Object[]{str, e3.getMessage()});
                charsetForName = null;
            }
        } else {
            charsetForName = null;
        }
        if (charsetForName != null) {
            return charsetForName;
        }
        Level level = Level.WARNING;
        Charset charset = b;
        logger.log(level, "JNA Warning: Using fallback encoding {0}", charset);
        return charset;
    }

    public static int f(Class cls, boolean z) {
        if (cls == Void.class) {
            cls = Void.TYPE;
        }
        if (Pointer.class.isAssignableFrom(cls)) {
            return 1;
        }
        if (String.class == cls) {
            return 2;
        }
        if (fc9.class.isAssignableFrom(cls)) {
            return 20;
        }
        if (m96.b && Buffer.class.isAssignableFrom(cls)) {
            return 5;
        }
        if (f98.class.isAssignableFrom(cls)) {
            return z88.class.isAssignableFrom(cls) ? 4 : 3;
        }
        if (cls.isArray()) {
            char cCharAt = cls.getName().charAt(1);
            if (cCharAt == 'F') {
                return 11;
            }
            if (cCharAt == 'S') {
                return 7;
            }
            if (cCharAt == 'Z') {
                return 13;
            }
            if (cCharAt == 'I') {
                return 9;
            }
            if (cCharAt == 'J') {
                return 10;
            }
            switch (cCharAt) {
                case 'B':
                    return 6;
                case 'C':
                    return 8;
                case 'D':
                    return 12;
            }
        }
        if (cls.isPrimitive()) {
            return cls == Boolean.TYPE ? 14 : 0;
        }
        if (Callback.class.isAssignableFrom(cls)) {
            return 15;
        }
        if (IntegerType.class.isAssignableFrom(cls)) {
            return 21;
        }
        if (si0.class.isAssignableFrom(cls)) {
            return 22;
        }
        if (!vh5.class.isAssignableFrom(cls)) {
            if (tt3.class == cls) {
                return 27;
            }
            return z ? 26 : -1;
        }
        Class cls2 = wh5.b(cls).b;
        if (cls2 == String.class) {
            return 18;
        }
        return cls2 == fc9.class ? 19 : 17;
    }

    public static native long findSymbol(long j2, String str);

    public static native void free(long j2);

    public static native synchronized void freeNativeCallback(long j2);

    public static String g() {
        return System.getProperty("jna.encoding", c);
    }

    public static native byte getByte(Pointer pointer, long j2, long j3);

    public static native char getChar(Pointer pointer, long j2, long j3);

    public static native double getDouble(Pointer pointer, long j2, long j3);

    public static native float getFloat(Pointer pointer, long j2, long j3);

    public static native int getInt(Pointer pointer, long j2, long j3);

    public static native int getLastError();

    public static native long getLong(Pointer pointer, long j2, long j3);

    private static native String getNativeVersion();

    public static native short getShort(Pointer pointer, long j2, long j3);

    public static native byte[] getStringBytes(Pointer pointer, long j2, long j3);

    public static native String getWideString(Pointer pointer, long j2, long j3);

    public static Pointer h(Buffer buffer) {
        long j_getDirectBufferPointer = _getDirectBufferPointer(buffer);
        if (j_getDirectBufferPointer == 0) {
            return null;
        }
        return new Pointer(j_getDirectBufferPointer);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        r3.put(r1, new java.lang.ref.WeakReference(r6.get(null)));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Map i(java.lang.Class r8) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.jna.Native.i(java.lang.Class):java.util.Map");
    }

    private static native void initIDs();

    public static native double invokeDouble(Function function, long j2, int i2, Object[] objArr);

    public static native float invokeFloat(Function function, long j2, int i2, Object[] objArr);

    public static native int invokeInt(Function function, long j2, int i2, Object[] objArr);

    public static native long invokeLong(Function function, long j2, int i2, Object[] objArr);

    public static native Object invokeObject(Function function, long j2, int i2, Object[] objArr);

    public static native long invokePointer(Function function, long j2, int i2, Object[] objArr);

    private static native void invokeStructure(Function function, long j2, int i2, Object[] objArr, long j3, long j4);

    public static native void invokeVoid(Function function, long j2, int i2, Object[] objArr);

    public static int j(Class cls) {
        if (vh5.class.isAssignableFrom(cls)) {
            cls = wh5.b(cls).b;
        }
        if (cls == Boolean.TYPE || cls == Boolean.class) {
            return 4;
        }
        if (cls == Byte.TYPE || cls == Byte.class) {
            return 1;
        }
        if (cls == Short.TYPE || cls == Short.class) {
            return 2;
        }
        if (cls == Character.TYPE || cls == Character.class) {
            return k;
        }
        if (cls == Integer.TYPE || cls == Integer.class) {
            return 4;
        }
        if (cls == Long.TYPE || cls == Long.class) {
            return 8;
        }
        if (cls == Float.TYPE || cls == Float.class) {
            return 4;
        }
        if (cls == Double.TYPE || cls == Double.class) {
            return 8;
        }
        if (f98.class.isAssignableFrom(cls)) {
            if (z88.class.isAssignableFrom(cls)) {
                return f98.size(cls);
            }
        } else if (!Pointer.class.isAssignableFrom(cls) && ((!m96.b || !Buffer.class.isAssignableFrom(cls)) && !Callback.class.isAssignableFrom(cls) && String.class != cls && fc9.class != cls)) {
            throw new IllegalArgumentException("Native size for type \"" + cls.getName() + "\" is unknown");
        }
        return i;
    }

    public static int k(Class cls, Object obj) {
        if (cls.isArray()) {
            int length = Array.getLength(obj);
            if (length <= 0) {
                throw new IllegalArgumentException(bl4.v("Arrays of length zero not allowed: ", cls));
            }
            return k(cls.getComponentType(), Array.get(obj, 0)) * length;
        }
        if (f98.class.isAssignableFrom(cls) && !y88.class.isAssignableFrom(cls)) {
            return f98.size(cls, (f98) obj);
        }
        try {
            return j(cls);
        } catch (IllegalArgumentException e2) {
            throw new IllegalArgumentException("The type \"" + cls.getName() + "\" is not supported: " + e2.getMessage());
        }
    }

    public static Pointer l(long j2) {
        long j_getPointer = _getPointer(j2);
        if (j_getPointer == 0) {
            return null;
        }
        return new Pointer(j_getPointer);
    }

    public static String m(Class cls) {
        if (cls.isArray()) {
            return "[" + m(cls.getComponentType());
        }
        if (cls.isPrimitive()) {
            if (cls == Void.TYPE) {
                return "V";
            }
            if (cls == Boolean.TYPE) {
                return "Z";
            }
            if (cls == Byte.TYPE) {
                return "B";
            }
            if (cls == Short.TYPE) {
                return "S";
            }
            if (cls == Character.TYPE) {
                return "C";
            }
            if (cls == Integer.TYPE) {
                return "I";
            }
            if (cls == Long.TYPE) {
                return "J";
            }
            if (cls == Float.TYPE) {
                return "F";
            }
            if (cls == Double.TYPE) {
                return "D";
            }
        }
        StringBuilder sb = new StringBuilder("L");
        String name = cls.getName();
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int iIndexOf = name.indexOf(".");
            if (iIndexOf == -1) {
                sb2.append(name);
                sb.append(sb2.toString());
                sb.append(";");
                return sb.toString();
            }
            sb2.append(name.substring(0, iIndexOf));
            sb2.append("/");
            name = name.substring(1 + iIndexOf);
        }
    }

    public static native long malloc(long j2);

    public static File n() throws IOException {
        File file;
        File file2;
        int i2;
        String property = System.getProperty("jna.tmpdir");
        if (property != null) {
            file = new File(property);
            file.mkdirs();
        } else {
            file = new File(System.getProperty("java.io.tmpdir"));
            if (m96.f()) {
                file2 = new File(System.getProperty("user.home"), "Library/Caches/JNA/temp");
            } else if (m96.e() || (i2 = m96.e) == 3 || m96.c() || m96.d() || i2 == 11 || i2 == 5 || m96.i()) {
                String str = System.getenv("XDG_CACHE_HOME");
                file2 = new File((str == null || str.trim().isEmpty()) ? new File(System.getProperty("user.home"), ".cache") : new File(str), "JNA/temp");
            } else {
                file2 = new File(file, "jna-" + System.getProperty("user.name").hashCode());
            }
            file2.mkdirs();
            if (file2.exists() && file2.canWrite()) {
                file = file2;
            }
        }
        if (!file.exists()) {
            throw new IOException(bl4.u("JNA temporary directory '", file, "' does not exist"));
        }
        if (file.canWrite()) {
            return file;
        }
        throw new IOException(bl4.u("JNA temporary directory '", file, "' is not writable"));
    }

    public static String o(String str) {
        if (System.getProperty("javawebstart.version") == null) {
            return null;
        }
        try {
            String str2 = (String) ((Method) AccessController.doPrivileged(new ph5())).invoke(Native.class.getClassLoader(), str);
            if (str2 != null) {
                return new File(str2).getParent();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static native long open(String str, int i2);

    public static void p(Function function, long j2, int i2, Object[] objArr, f98 f98Var) {
        invokeStructure(function, j2, i2, objArr, f98Var.getPointer().a, f98Var.getTypeInfo().a);
    }

    public static Object q(Class cls, String str, Class cls2) {
        try {
            Field field = cls.getField(str);
            field.setAccessible(true);
            return field.get(null);
        } catch (NoSuchFieldException unused) {
            return null;
        } catch (Exception e2) {
            StringBuilder sbE = bl4.E(str, " must be a public field of type ");
            sbE.append(cls2.getName());
            sbE.append(" (");
            sbE.append(e2);
            sbE.append("): ");
            sbE.append(cls);
            throw new IllegalArgumentException(sbE.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014d A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void r(java.lang.Class r31, defpackage.uh5 r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 700
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sun.jna.Native.r(java.lang.Class, uh5):void");
    }

    public static native void read(Pointer pointer, long j2, long j3, byte[] bArr, int i2, int i3);

    public static native void read(Pointer pointer, long j2, long j3, char[] cArr, int i2, int i3);

    public static native void read(Pointer pointer, long j2, long j3, double[] dArr, int i2, int i3);

    public static native void read(Pointer pointer, long j2, long j3, float[] fArr, int i2, int i3);

    public static native void read(Pointer pointer, long j2, long j3, int[] iArr, int i2, int i3);

    public static native void read(Pointer pointer, long j2, long j3, long[] jArr, int i2, int i3);

    public static native void read(Pointer pointer, long j2, long j3, short[] sArr, int i2, int i3);

    private static native long registerMethod(Class<?> cls, String str, String str2, int[] iArr, long[] jArr, long[] jArr2, int i2, long j2, long j3, Method method, long j4, int i3, boolean z, ToNativeConverter[] toNativeConverterArr, FromNativeConverter fromNativeConverter, String str3);

    public static void s() {
        WeakHashMap weakHashMap = n;
        synchronized (weakHashMap) {
            try {
                for (Map.Entry entry : weakHashMap.entrySet()) {
                    unregister((Class) entry.getKey(), (long[]) entry.getValue());
                }
                n.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static native void setByte(Pointer pointer, long j2, long j3, byte b2);

    public static native void setChar(Pointer pointer, long j2, long j3, char c2);

    public static native void setDouble(Pointer pointer, long j2, long j3, double d2);

    public static native void setFloat(Pointer pointer, long j2, long j3, float f2);

    public static native void setInt(Pointer pointer, long j2, long j3, int i2);

    public static native void setLong(Pointer pointer, long j2, long j3, long j4);

    public static native void setMemory(Pointer pointer, long j2, long j3, long j4, byte b2);

    public static native void setPointer(Pointer pointer, long j2, long j3, long j4);

    public static native synchronized void setProtected(boolean z);

    public static native void setShort(Pointer pointer, long j2, long j3, short s);

    public static native void setWideString(Pointer pointer, long j2, long j3, String str);

    private static native int sizeof(int i2);

    private static native void unregister(Class<?> cls, long[] jArr);

    public static native void write(Pointer pointer, long j2, long j3, byte[] bArr, int i2, int i3);

    public static native void write(Pointer pointer, long j2, long j3, char[] cArr, int i2, int i3);

    public static native void write(Pointer pointer, long j2, long j3, double[] dArr, int i2, int i3);

    public static native void write(Pointer pointer, long j2, long j3, float[] fArr, int i2, int i3);

    public static native void write(Pointer pointer, long j2, long j3, int[] iArr, int i2, int i3);

    public static native void write(Pointer pointer, long j2, long j3, long[] jArr, int i2, int i3);

    public static native void write(Pointer pointer, long j2, long j3, short[] sArr, int i2, int i3);
}
