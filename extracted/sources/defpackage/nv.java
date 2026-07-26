package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import io.sentry.config.a;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class nv {
    public long a;
    public int b;
    public Object c;
    public final Object d;

    public nv(h72 h72Var) {
        h72Var.getClass();
        this.d = h72Var;
    }

    public static String c(String str) {
        int length = str.length() / 2;
        StringBuilder sbC = bl4.C(String.valueOf(str.substring(0, length).hashCode()));
        sbC.append(String.valueOf(str.substring(length).hashCode()));
        return sbC.toString();
    }

    public static int i(oj0 oj0Var) throws IOException {
        int i = oj0Var.read();
        if (i != -1) {
            return i;
        }
        throw new EOFException();
    }

    public static int j(oj0 oj0Var) {
        return (i(oj0Var) << 24) | i(oj0Var) | (i(oj0Var) << 8) | (i(oj0Var) << 16);
    }

    public static long k(oj0 oj0Var) {
        return (((long) i(oj0Var)) & 255) | ((((long) i(oj0Var)) & 255) << 8) | ((((long) i(oj0Var)) & 255) << 16) | ((((long) i(oj0Var)) & 255) << 24) | ((((long) i(oj0Var)) & 255) << 32) | ((((long) i(oj0Var)) & 255) << 40) | ((((long) i(oj0Var)) & 255) << 48) | ((255 & ((long) i(oj0Var))) << 56);
    }

    public static String l(oj0 oj0Var) {
        return new String(n(oj0Var, k(oj0Var)), "UTF-8");
    }

    public static byte[] n(oj0 oj0Var, long j) throws IOException {
        long j2 = oj0Var.b - oj0Var.c;
        if (j >= 0 && j <= j2) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(oj0Var).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sbS = rm7.s(j, "streamToBytes length=", ", maxLength=");
        sbS.append(j2);
        throw new IOException(sbS.toString());
    }

    public static void o(BufferedOutputStream bufferedOutputStream, int i) throws IOException {
        bufferedOutputStream.write(i & 255);
        bufferedOutputStream.write((i >> 8) & 255);
        bufferedOutputStream.write((i >> 16) & 255);
        bufferedOutputStream.write((i >> 24) & 255);
    }

    public static void p(BufferedOutputStream bufferedOutputStream, long j) throws IOException {
        bufferedOutputStream.write((byte) j);
        bufferedOutputStream.write((byte) (j >>> 8));
        bufferedOutputStream.write((byte) (j >>> 16));
        bufferedOutputStream.write((byte) (j >>> 24));
        bufferedOutputStream.write((byte) (j >>> 32));
        bufferedOutputStream.write((byte) (j >>> 40));
        bufferedOutputStream.write((byte) (j >>> 48));
        bufferedOutputStream.write((byte) (j >>> 56));
    }

    public static void q(BufferedOutputStream bufferedOutputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        p(bufferedOutputStream, bytes.length);
        bufferedOutputStream.write(bytes, 0, bytes.length);
    }

    public synchronized bk0 a(String str) {
        wo1 wo1Var = (wo1) ((LinkedHashMap) this.c).get(str);
        if (wo1Var == null) {
            return null;
        }
        File fileB = b(str);
        try {
            oj0 oj0Var = new oj0(new BufferedInputStream(a.g(fileB, new FileInputStream(fileB))), fileB.length());
            try {
                if (TextUtils.equals(str, wo1.a(oj0Var).b)) {
                    return wo1Var.b(n(oj0Var, oj0Var.b - oj0Var.c));
                }
                fileB.getAbsolutePath();
                wo1 wo1Var2 = (wo1) ((LinkedHashMap) this.c).remove(str);
                if (wo1Var2 != null) {
                    this.a -= wo1Var2.a;
                }
                return null;
            } finally {
                oj0Var.close();
            }
        } catch (IOException e) {
            fileB.getAbsolutePath();
            e.toString();
            m(str);
            return null;
        }
    }

    public File b(String str) {
        return new File(((xo1) this.d).get(), c(str));
    }

    public synchronized void d() {
        File file = ((xo1) this.d).get();
        if (!file.exists()) {
            if (!file.mkdirs()) {
                file.getAbsolutePath();
            }
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            try {
                long length = file2.length();
                oj0 oj0Var = new oj0(new BufferedInputStream(a.g(file2, new FileInputStream(file2))), length);
                try {
                    wo1 wo1VarA = wo1.a(oj0Var);
                    wo1VarA.a = length;
                    h(wo1VarA.b, wo1VarA);
                    oj0Var.close();
                } catch (Throwable th) {
                    oj0Var.close();
                    throw th;
                }
            } catch (IOException unused) {
                file2.delete();
            }
        }
    }

    public synchronized void e(String str) {
        bk0 bk0VarA = a(str);
        if (bk0VarA != null) {
            bk0VarA.f = 0L;
            bk0VarA.e = 0L;
            g(str, bk0VarA);
        }
    }

    public void f() {
        long j = this.a;
        int i = this.b;
        if (j < i) {
            return;
        }
        boolean z = cb9.a;
        SystemClock.elapsedRealtime();
        Iterator it = ((LinkedHashMap) this.c).entrySet().iterator();
        while (it.hasNext()) {
            wo1 wo1Var = (wo1) ((Map.Entry) it.next()).getValue();
            if (b(wo1Var.b).delete()) {
                this.a -= wo1Var.a;
            } else {
                c(wo1Var.b);
            }
            it.remove();
            if (this.a < i * 0.9f) {
                break;
            }
        }
        if (cb9.a) {
            SystemClock.elapsedRealtime();
        }
    }

    public synchronized void g(String str, bk0 bk0Var) {
        BufferedOutputStream bufferedOutputStream;
        wo1 wo1Var;
        long length = this.a + ((long) bk0Var.a.length);
        int i = this.b;
        if (length <= i || r2.length <= i * 0.9f) {
            File fileB = b(str);
            try {
                bufferedOutputStream = new BufferedOutputStream(a.k(new FileOutputStream(fileB), fileB));
                wo1Var = new wo1(str, bk0Var);
            } catch (IOException unused) {
                if (!fileB.delete()) {
                    fileB.getAbsolutePath();
                }
                if (!((xo1) this.d).get().exists()) {
                    ((LinkedHashMap) this.c).clear();
                    this.a = 0L;
                    d();
                }
            }
            if (!wo1Var.c(bufferedOutputStream)) {
                bufferedOutputStream.close();
                fileB.getAbsolutePath();
                throw new IOException();
            }
            bufferedOutputStream.write(bk0Var.a);
            bufferedOutputStream.close();
            wo1Var.a = fileB.length();
            h(str, wo1Var);
            f();
        }
    }

    public void h(String str, wo1 wo1Var) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.c;
        if (linkedHashMap.containsKey(str)) {
            this.a = (wo1Var.a - ((wo1) linkedHashMap.get(str)).a) + this.a;
        } else {
            this.a += wo1Var.a;
        }
        linkedHashMap.put(str, wo1Var);
    }

    public synchronized void m(String str) {
        boolean zDelete = b(str).delete();
        wo1 wo1Var = (wo1) ((LinkedHashMap) this.c).remove(str);
        if (wo1Var != null) {
            this.a -= wo1Var.a;
        }
        if (!zDelete) {
            c(str);
        }
    }

    public nv(File file, int i) {
        this.c = new LinkedHashMap(16, 0.75f, true);
        this.a = 0L;
        this.d = new qm5(17, file);
        this.b = i;
    }

    public nv(bn6 bn6Var) {
        this.c = new LinkedHashMap(16, 0.75f, true);
        this.a = 0L;
        this.d = bn6Var;
        this.b = 5242880;
    }
}
