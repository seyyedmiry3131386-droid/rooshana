package defpackage;

import com.sun.jna.Native;
import ir.mservices.market.pika.common.model.ByteArrayResult;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m96 {
    public static final boolean a;
    public static final boolean b;
    public static final String c;
    public static final String d;
    public static final int e;
    public static final String f;

    static {
        boolean z;
        String property = System.getProperty("os.name");
        if (property.startsWith("Linux")) {
            if ("dalvik".equals(System.getProperty("java.vm.name").toLowerCase())) {
                e = 8;
                System.setProperty("jna.nounpack", "true");
            } else {
                e = 1;
            }
        } else if (property.startsWith("AIX")) {
            e = 7;
        } else if (property.startsWith("Mac") || property.startsWith("Darwin")) {
            e = 0;
        } else if (property.startsWith("Windows CE")) {
            e = 6;
        } else if (property.startsWith("Windows")) {
            e = 2;
        } else if (property.startsWith("Solaris") || property.startsWith("SunOS")) {
            e = 3;
        } else if (property.startsWith("FreeBSD")) {
            e = 4;
        } else if (property.startsWith("OpenBSD")) {
            e = 5;
        } else if (property.equalsIgnoreCase("gnu")) {
            e = 9;
        } else if (property.equalsIgnoreCase("gnu/kfreebsd")) {
            e = 10;
        } else if (property.equalsIgnoreCase("netbsd")) {
            e = 11;
        } else {
            e = -1;
        }
        try {
            Class.forName("java.nio.Buffer");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        int i = e;
        b = z;
        a = i != 6;
        c = i == 2 ? "msvcrt" : i == 6 ? "coredll" : ByteArrayResult.AppInfo.VERSION_CODE_SERIALISED_NAME;
        f = a(i, System.getProperty("os.arch"));
        String property2 = System.getProperty("jna.prefix");
        if (property2 == null) {
            String property3 = System.getProperty("os.arch");
            String property4 = System.getProperty("os.name");
            String strA = a(i, property3);
            switch (i) {
                case 0:
                    property2 = "darwin";
                    break;
                case 1:
                    property2 = dw1.n("linux-", strA);
                    break;
                case 2:
                    property2 = dw1.n("win32-", strA);
                    break;
                case 3:
                    property2 = dw1.n("sunos-", strA);
                    break;
                case 4:
                    property2 = dw1.n("freebsd-", strA);
                    break;
                case 5:
                    property2 = dw1.n("openbsd-", strA);
                    break;
                case 6:
                    property2 = dw1.n("w32ce-", strA);
                    break;
                case 7:
                case 9:
                default:
                    String lowerCase = property4.toLowerCase();
                    int iIndexOf = lowerCase.indexOf(" ");
                    if (iIndexOf != -1) {
                        lowerCase = lowerCase.substring(0, iIndexOf);
                    }
                    property2 = t61.j(lowerCase, "-", strA);
                    break;
                case 8:
                    if (strA.startsWith("arm")) {
                        strA = "arm";
                    }
                    property2 = "android-".concat(strA);
                    break;
                case 10:
                    property2 = dw1.n("kfreebsd-", strA);
                    break;
                case 11:
                    property2 = dw1.n("netbsd-", strA);
                    break;
            }
        }
        d = property2;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(int r4, java.lang.String r5) {
        /*
            java.lang.String r5 = r5.toLowerCase()
            java.lang.String r5 = r5.trim()
            java.lang.String r0 = "powerpc"
            boolean r0 = r0.equals(r5)
            java.lang.String r1 = "ppc64"
            if (r0 == 0) goto L15
            java.lang.String r5 = "ppc"
            goto L45
        L15:
            java.lang.String r0 = "powerpc64"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L1f
            r5 = r1
            goto L45
        L1f:
            java.lang.String r0 = "i386"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L43
            java.lang.String r0 = "i686"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L30
            goto L43
        L30:
            java.lang.String r0 = "x86_64"
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L40
            java.lang.String r0 = "amd64"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L45
        L40:
            java.lang.String r5 = "x86-64"
            goto L45
        L43:
            java.lang.String r5 = "x86"
        L45:
            boolean r0 = r1.equals(r5)
            if (r0 == 0) goto L5b
            java.lang.String r0 = "sun.cpu.endian"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            java.lang.String r1 = "little"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L5b
            java.lang.String r5 = "ppc64le"
        L5b:
            java.lang.String r0 = "arm"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto Lb0
            r0 = 1
            if (r4 != r0) goto Lb0
            java.lang.Class<m96> r4 = defpackage.m96.class
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch: java.lang.SecurityException -> L89 java.io.IOException -> L8b
            java.lang.String r3 = "/proc/self/exe"
            r2.<init>(r3)     // Catch: java.lang.SecurityException -> L89 java.io.IOException -> L8b
            boolean r3 = r2.exists()     // Catch: java.lang.SecurityException -> L89 java.io.IOException -> L8b
            if (r3 == 0) goto Lac
            java.lang.String r2 = r2.getCanonicalPath()     // Catch: java.lang.SecurityException -> L89 java.io.IOException -> L8b
            wy1 r2 = defpackage.wy1.a(r2)     // Catch: java.lang.SecurityException -> L89 java.io.IOException -> L8b
            boolean r3 = r2.e     // Catch: java.lang.SecurityException -> L89 java.io.IOException -> L8b
            if (r3 != 0) goto L86
            boolean r4 = r2.d     // Catch: java.lang.SecurityException -> L89 java.io.IOException -> L8b
            if (r4 == 0) goto L87
        L86:
            r1 = r0
        L87:
            r1 = r1 ^ r0
            goto Lac
        L89:
            r0 = move-exception
            goto L8d
        L8b:
            r0 = move-exception
            goto L9d
        L8d:
            java.lang.String r4 = r4.getName()
            java.util.logging.Logger r4 = java.util.logging.Logger.getLogger(r4)
            java.util.logging.Level r2 = java.util.logging.Level.INFO
            java.lang.String r3 = "SecurityException while analysing '/proc/self/exe' or the target binary."
            r4.log(r2, r3, r0)
            goto Lac
        L9d:
            java.lang.String r4 = r4.getName()
            java.util.logging.Logger r4 = java.util.logging.Logger.getLogger(r4)
            java.util.logging.Level r2 = java.util.logging.Level.INFO
            java.lang.String r3 = "Failed to read '/proc/self/exe' or the target binary."
            r4.log(r2, r3, r0)
        Lac:
            if (r1 == 0) goto Lb0
            java.lang.String r5 = "armel"
        Lb0:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m96.a(int, java.lang.String):java.lang.String");
    }

    public static final boolean b() {
        String property = System.getProperty("sun.arch.data.model", System.getProperty("com.ibm.vm.bitmode"));
        if (property != null) {
            return "64".equals(property);
        }
        String str = f;
        return "x86-64".equals(str) || "ia64".equals(str) || "ppc64".equals(str) || "ppc64le".equals(str) || "sparcv9".equals(str) || "mips64".equals(str) || "mips64el".equals(str) || "amd64".equals(str) || Native.i == 8;
    }

    public static final boolean c() {
        return e == 7;
    }

    public static final boolean d() {
        return e == 4;
    }

    public static final boolean e() {
        return e == 1;
    }

    public static final boolean f() {
        return e == 0;
    }

    public static final boolean g() {
        return f.startsWith("ppc");
    }

    public static final boolean h() {
        int i = e;
        return i == 2 || i == 6;
    }

    public static final boolean i() {
        return e == 10;
    }
}
