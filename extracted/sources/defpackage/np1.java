package defpackage;

import android.os.Build;
import android.os.StrictMode;
import io.sentry.config.a;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class np1 implements Closeable {
    public final File a;
    public final File b;
    public final File c;
    public final File d;
    public final long f;
    public BufferedWriter i;
    public int k;
    public long h = 0;
    public final LinkedHashMap j = new LinkedHashMap(0, 0.75f, true);
    public long l = 0;
    public final ThreadPoolExecutor m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new cp1());
    public final bp1 n = new bp1(0, this);
    public final int e = 1;
    public final int g = 1;

    public np1(File file, long j) {
        this.a = file;
        this.b = new File(file, "journal");
        this.c = new File(file, "journal.tmp");
        this.d = new File(file, "journal.bkp");
        this.f = j;
    }

    public static np1 I(File file, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                U(file2, file3, false);
            }
        }
        np1 np1Var = new np1(file, j);
        if (np1Var.b.exists()) {
            try {
                np1Var.K();
                np1Var.J();
                return np1Var;
            } catch (IOException e) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                np1Var.close();
                h29.a(np1Var.a);
            }
        }
        file.mkdirs();
        np1 np1Var2 = new np1(file, j);
        np1Var2.R();
        return np1Var2;
    }

    public static void U(File file, File file2, boolean z) throws IOException {
        if (z) {
            g(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public static void b(np1 np1Var, ry ryVar, boolean z) {
        synchronized (np1Var) {
            ep1 ep1Var = (ep1) ryVar.c;
            if (ep1Var.f != ryVar) {
                throw new IllegalStateException();
            }
            if (z && !ep1Var.e) {
                for (int i = 0; i < np1Var.g; i++) {
                    if (!((boolean[]) ryVar.d)[i]) {
                        ryVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                    }
                    if (!ep1Var.d[i].exists()) {
                        ryVar.a();
                        return;
                    }
                }
            }
            for (int i2 = 0; i2 < np1Var.g; i2++) {
                File file = ep1Var.d[i2];
                if (!z) {
                    g(file);
                } else if (file.exists()) {
                    File file2 = ep1Var.c[i2];
                    file.renameTo(file2);
                    long j = ep1Var.b[i2];
                    long length = file2.length();
                    ep1Var.b[i2] = length;
                    np1Var.h = (np1Var.h - j) + length;
                }
            }
            np1Var.k++;
            ep1Var.f = null;
            if (ep1Var.e || z) {
                ep1Var.e = true;
                np1Var.i.append((CharSequence) "CLEAN");
                np1Var.i.append(' ');
                np1Var.i.append((CharSequence) ep1Var.a);
                np1Var.i.append((CharSequence) ep1Var.a());
                np1Var.i.append('\n');
                if (z) {
                    np1Var.l++;
                }
            } else {
                np1Var.j.remove(ep1Var.a);
                np1Var.i.append((CharSequence) "REMOVE");
                np1Var.i.append(' ');
                np1Var.i.append((CharSequence) ep1Var.a);
                np1Var.i.append('\n');
            }
            u(np1Var.i);
            if (np1Var.h > np1Var.f || np1Var.D()) {
                np1Var.m.submit(np1Var.n);
            }
        }
    }

    public static void d(BufferedWriter bufferedWriter) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void g(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void u(BufferedWriter bufferedWriter) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final boolean D() {
        int i = this.k;
        return i >= 2000 && i >= this.j.size();
    }

    public final void J() throws IOException {
        g(this.c);
        Iterator it = this.j.values().iterator();
        while (it.hasNext()) {
            ep1 ep1Var = (ep1) it.next();
            ry ryVar = ep1Var.f;
            int i = this.g;
            int i2 = 0;
            if (ryVar == null) {
                while (i2 < i) {
                    this.h += ep1Var.b[i2];
                    i2++;
                }
            } else {
                ep1Var.f = null;
                while (i2 < i) {
                    g(ep1Var.c[i2]);
                    g(ep1Var.d[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    public final void K() {
        File file = this.b;
        s78 s78Var = new s78(a.g(file, new FileInputStream(file)), h29.a);
        try {
            String strB = s78Var.b();
            String strB2 = s78Var.b();
            String strB3 = s78Var.b();
            String strB4 = s78Var.b();
            String strB5 = s78Var.b();
            if (!"libcore.io.DiskLruCache".equals(strB) || !"1".equals(strB2) || !Integer.toString(this.e).equals(strB3) || !Integer.toString(this.g).equals(strB4) || !"".equals(strB5)) {
                throw new IOException("unexpected journal header: [" + strB + ", " + strB2 + ", " + strB4 + ", " + strB5 + "]");
            }
            int i = 0;
            while (true) {
                try {
                    P(s78Var.b());
                    i++;
                } catch (EOFException unused) {
                    this.k = i - this.j.size();
                    if (s78Var.e == -1) {
                        R();
                    } else {
                        this.i = new BufferedWriter(new OutputStreamWriter(a.j(file, new FileOutputStream(file, true), true), h29.a));
                    }
                    try {
                        s78Var.close();
                        return;
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                s78Var.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final void P(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i);
        LinkedHashMap linkedHashMap = this.j;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i, iIndexOf2);
        }
        ep1 ep1Var = (ep1) linkedHashMap.get(strSubstring);
        if (ep1Var == null) {
            ep1Var = new ep1(this, strSubstring);
            linkedHashMap.put(strSubstring, ep1Var);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                ep1Var.f = new ry(this, ep1Var);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        ep1Var.e = true;
        ep1Var.f = null;
        if (strArrSplit.length != ep1Var.g.g) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
        }
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            try {
                ep1Var.b[i2] = Long.parseLong(strArrSplit[i2]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
        }
    }

    public final synchronized void R() {
        try {
            BufferedWriter bufferedWriter = this.i;
            if (bufferedWriter != null) {
                d(bufferedWriter);
            }
            File file = this.c;
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(a.k(new FileOutputStream(file), file), h29.a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.e));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.g));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (ep1 ep1Var : this.j.values()) {
                    if (ep1Var.f != null) {
                        bufferedWriter2.write("DIRTY " + ep1Var.a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + ep1Var.a + ep1Var.a() + '\n');
                    }
                }
                d(bufferedWriter2);
                if (this.b.exists()) {
                    U(this.b, this.d, true);
                }
                U(this.c, this.b, false);
                this.d.delete();
                File file2 = this.b;
                this.i = new BufferedWriter(new OutputStreamWriter(a.j(file2, new FileOutputStream(file2, true), true), h29.a));
            } catch (Throwable th) {
                d(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.i == null) {
                return;
            }
            Iterator it = new ArrayList(this.j.values()).iterator();
            while (it.hasNext()) {
                ry ryVar = ((ep1) it.next()).f;
                if (ryVar != null) {
                    ryVar.a();
                }
            }
            k0();
            d(this.i);
            this.i = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final ry k(String str) {
        synchronized (this) {
            try {
                if (this.i == null) {
                    throw new IllegalStateException("cache is closed");
                }
                ep1 ep1Var = (ep1) this.j.get(str);
                if (ep1Var == null) {
                    ep1Var = new ep1(this, str);
                    this.j.put(str, ep1Var);
                } else if (ep1Var.f != null) {
                    return null;
                }
                ry ryVar = new ry(this, ep1Var);
                ep1Var.f = ryVar;
                this.i.append((CharSequence) "DIRTY");
                this.i.append(' ');
                this.i.append((CharSequence) str);
                this.i.append('\n');
                u(this.i);
                return ryVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k0() {
        while (this.h > this.f) {
            String str = (String) ((Map.Entry) this.j.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.i == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    ep1 ep1Var = (ep1) this.j.get(str);
                    if (ep1Var != null && ep1Var.f == null) {
                        for (int i = 0; i < this.g; i++) {
                            File file = ep1Var.c[i];
                            if (file.exists() && !file.delete()) {
                                throw new IOException("failed to delete " + file);
                            }
                            long j = this.h;
                            long[] jArr = ep1Var.b;
                            this.h = j - jArr[i];
                            jArr[i] = 0;
                        }
                        this.k++;
                        this.i.append((CharSequence) "REMOVE");
                        this.i.append(' ');
                        this.i.append((CharSequence) str);
                        this.i.append('\n');
                        this.j.remove(str);
                        if (D()) {
                            this.m.submit(this.n);
                        }
                    }
                } finally {
                }
            }
        }
    }

    public final synchronized pj9 y(String str) {
        if (this.i == null) {
            throw new IllegalStateException("cache is closed");
        }
        ep1 ep1Var = (ep1) this.j.get(str);
        if (ep1Var == null) {
            return null;
        }
        if (!ep1Var.e) {
            return null;
        }
        for (File file : ep1Var.c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.k++;
        this.i.append((CharSequence) "READ");
        this.i.append(' ');
        this.i.append((CharSequence) str);
        this.i.append('\n');
        if (D()) {
            this.m.submit(this.n);
        }
        return new pj9(ep1Var.c);
    }
}
