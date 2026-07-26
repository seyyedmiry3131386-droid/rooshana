package defpackage;

import com.j256.ormlite.stmt.query.SimpleComparison;
import com.sun.jna.Function;
import com.sun.jna.LastErrorException;
import com.sun.jna.Native;
import java.io.File;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class uh5 {
    public static final Logger h = Logger.getLogger(uh5.class.getName());
    public static final Level i;
    public static final HashMap j;
    public static final Map k;
    public static final ArrayList l;
    public static final Method m;
    public long a;
    public final String b;
    public final String c;
    public final HashMap d;
    public final int e;
    public final String f;
    public final HashMap g;

    /* JADX WARN: Removed duplicated region for block: B:103:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b4  */
    static {
        /*
            Method dump skipped, instruction units count: 533
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uh5.<clinit>():void");
    }

    public uh5(String str, String str2, long j2, HashMap map) {
        HashMap map2 = new HashMap();
        this.d = map2;
        String strI = i("---");
        int iIndexOf = strI.indexOf("---");
        if (iIndexOf > 0 && str.startsWith(strI.substring(0, iIndexOf))) {
            str = str.substring(iIndexOf);
        }
        int iIndexOf2 = str.indexOf(strI.substring(iIndexOf + 3));
        str = iIndexOf2 != -1 ? str.substring(0, iIndexOf2) : str;
        this.b = str;
        this.c = str2;
        this.a = j2;
        Object obj = map.get("calling-convention");
        int iIntValue = obj instanceof Number ? ((Number) obj).intValue() : 0;
        this.e = iIntValue;
        this.g = map;
        String str3 = (String) map.get("string-encoding");
        this.f = str3;
        if (str3 == null) {
            this.f = Native.g();
        }
        if (m96.h() && "kernel32".equals(str.toLowerCase())) {
            synchronized (map2) {
                map2.put("GetLastError|" + iIntValue + "|" + this.f, new sh5(this, this, this.f));
            }
        }
    }

    public static String b(String str, ArrayList arrayList) {
        if (new File(str).isAbsolute()) {
            return str;
        }
        String strI = i(str);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            File file = new File(str2, strI);
            if (file.exists()) {
                return file.getAbsolutePath();
            }
            if (m96.f() && strI.endsWith(".dylib")) {
                File file2 = new File(str2, strI.substring(0, strI.lastIndexOf(".dylib")) + ".jnilib");
                if (file2.exists()) {
                    return file2.getAbsolutePath();
                }
            }
        }
        return strI;
    }

    public static final uh5 e(Map map, String str) {
        uh5 uh5VarH;
        HashMap map2 = new HashMap(map);
        if (map2.get("calling-convention") == null) {
            map2.put("calling-convention", 0);
        }
        File file = null;
        if ((m96.e() || m96.d() || m96.c()) && m96.c.equals(str)) {
            str = null;
        }
        HashMap map3 = j;
        synchronized (map3) {
            try {
                Reference reference = (Reference) map3.get(str + map2);
                uh5VarH = reference != null ? (uh5) reference.get() : null;
                if (uh5VarH == null) {
                    if (str == null) {
                        Object obj = map2.get("open-flags");
                        uh5VarH = new uh5("<process>", null, Native.open(null, obj instanceof Number ? ((Number) obj).intValue() : -1), map2);
                    } else {
                        uh5VarH = h(str, map2);
                    }
                    WeakReference weakReference = new WeakReference(uh5VarH);
                    map3.put(uh5VarH.b + map2, weakReference);
                    String str2 = uh5VarH.c;
                    if (str2 != null) {
                        file = new File(str2);
                    }
                    if (file != null) {
                        map3.put(file.getAbsolutePath() + map2, weakReference);
                        map3.put(file.getName() + map2, weakReference);
                    }
                }
            } finally {
            }
        }
        return uh5VarH;
    }

    public static List f(String str) {
        String property = System.getProperty(str, "");
        if ("".equals(property)) {
            return Collections.EMPTY_LIST;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(property, File.pathSeparator);
        ArrayList arrayList = new ArrayList();
        while (stringTokenizer.hasMoreTokens()) {
            String strNextToken = stringTokenizer.nextToken();
            if (!"".equals(strNextToken)) {
                arrayList.add(strNextToken);
            }
        }
        return arrayList;
    }

    public static boolean g(String str) {
        int iLastIndexOf;
        int i2;
        if (!str.startsWith("lib") || (iLastIndexOf = str.lastIndexOf(".so.")) == -1 || (i2 = iLastIndexOf + 4) >= str.length()) {
            return false;
        }
        for (i2 = iLastIndexOf + 4; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (!Character.isDigit(cCharAt) && cCharAt != '.') {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0220 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0355 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.uh5 h(java.lang.String r27, java.util.HashMap r28) {
        /*
            Method dump skipped, instruction units count: 1129
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uh5.h(java.lang.String, java.util.HashMap):uh5");
    }

    public static String i(String str) {
        if (m96.f()) {
            if (str.startsWith("lib") && (str.endsWith(".dylib") || str.endsWith(".jnilib"))) {
                return str;
            }
            String strMapLibraryName = System.mapLibraryName(str);
            if (!strMapLibraryName.endsWith(".jnilib")) {
                return strMapLibraryName;
            }
            return strMapLibraryName.substring(0, strMapLibraryName.lastIndexOf(".jnilib")) + ".dylib";
        }
        if (m96.e() || m96.d()) {
            if (g(str) || str.endsWith(".so")) {
                return str;
            }
        } else if (m96.c()) {
            if (str.startsWith("lib")) {
                return str;
            }
        } else if (m96.h() && (str.endsWith(".drv") || str.endsWith(".dll"))) {
            return str;
        }
        return System.mapLibraryName(str);
    }

    public final void a() {
        HashSet hashSet = new HashSet();
        HashMap map = j;
        synchronized (map) {
            try {
                for (Map.Entry entry : map.entrySet()) {
                    if (((Reference) entry.getValue()).get() == this) {
                        hashSet.add(entry.getKey());
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    j.remove((String) it.next());
                }
            } finally {
            }
        }
        synchronized (this) {
            try {
                long j2 = this.a;
                if (j2 != 0) {
                    Native.close(j2);
                    this.a = 0L;
                }
            } finally {
            }
        }
    }

    public final Function c(int i2, String str) {
        Function function;
        String str2 = this.f;
        if (str == null) {
            throw new NullPointerException("Function name may not be null");
        }
        synchronized (this.d) {
            try {
                String str3 = str + "|" + i2 + "|" + str2;
                function = (Function) this.d.get(str3);
                if (function == null) {
                    function = new Function(this, str, i2, str2);
                    this.d.put(str3, function);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return function;
    }

    public final Function d(String str, Method method) {
        bq2 bq2Var = (bq2) this.g.get("function-mapper");
        if (bq2Var != null) {
            str = bq2Var.getFunctionName(this, method);
        }
        String property = System.getProperty("jna.profiler.prefix", "$$YJP$$");
        if (str.startsWith(property)) {
            str = str.substring(property.length());
        }
        Class<?>[] exceptionTypes = method.getExceptionTypes();
        int i2 = this.e;
        for (Class<?> cls : exceptionTypes) {
            if (LastErrorException.class.isAssignableFrom(cls)) {
                i2 |= 64;
            }
        }
        return c(i2, str);
    }

    public final void finalize() {
        a();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Native Library <");
        sb.append(this.c);
        sb.append("@");
        return bl4.s(this.a, SimpleComparison.GREATER_THAN_OPERATION, sb);
    }
}
