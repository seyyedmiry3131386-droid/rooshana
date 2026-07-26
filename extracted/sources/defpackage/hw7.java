package defpackage;

import android.database.SQLException;
import android.os.ConditionVariable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.media3.database.DatabaseIOException;
import androidx.media3.datasource.cache.Cache$CacheException;
import com.google.common.collect.ImmutableSet;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public final class hw7 implements dk0 {
    public static final HashSet k = new HashSet();
    public final File a;
    public final m44 b;
    public final on c;
    public final qq4 d;
    public final HashMap e;
    public final Random f;
    public final boolean g;
    public long h;
    public boolean i;
    public Cache$CacheException j;

    public hw7(File file, m44 m44Var, h48 h48Var) {
        ai0 ai0Var;
        boolean zAdd;
        on onVar = new on();
        onVar.a = new HashMap();
        onVar.b = new SparseArray();
        onVar.c = new SparseBooleanArray();
        onVar.d = new SparseBooleanArray();
        vp7 vp7Var = new vp7(h48Var);
        if (file != null) {
            File file2 = new File(file, "cached_content_index.exi");
            ai0Var = new ai0();
            ai0Var.b = null;
            ai0Var.c = null;
            do3 do3Var = new do3();
            do3Var.a = file2;
            do3Var.b = new File(file2.getPath() + ".bak");
            ai0Var.d = do3Var;
        } else {
            ai0Var = null;
        }
        onVar.e = vp7Var;
        onVar.f = ai0Var;
        qq4 qq4Var = new qq4(h48Var);
        synchronized (hw7.class) {
            zAdd = k.add(file.getAbsoluteFile());
        }
        if (!zAdd) {
            throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
        }
        this.a = file;
        this.b = m44Var;
        this.c = onVar;
        this.d = qq4Var;
        this.e = new HashMap();
        this.f = new Random();
        this.g = true;
        this.h = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new gw7(this, conditionVariable).start();
        conditionVariable.block();
    }

    public static void a(hw7 hw7Var) {
        long j;
        qq4 qq4Var = hw7Var.d;
        on onVar = hw7Var.c;
        File file = hw7Var.a;
        if (!file.exists()) {
            try {
                e(file);
            } catch (Cache$CacheException e) {
                hw7Var.j = e;
                return;
            }
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            String str = "Failed to list cache directory files: " + file;
            wn5.F("SimpleCache", str);
            hw7Var.j = new Cache$CacheException(str);
            return;
        }
        int length = fileArrListFiles.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                j = -1;
                break;
            }
            File file2 = fileArrListFiles[i];
            String name = file2.getName();
            if (name.endsWith(".uid")) {
                try {
                    j = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                    break;
                } catch (NumberFormatException unused) {
                    wn5.F("SimpleCache", "Malformed UID file: " + file2);
                    file2.delete();
                }
            }
            i++;
        }
        hw7Var.h = j;
        if (j == -1) {
            try {
                hw7Var.h = f(file);
            } catch (IOException e2) {
                String str2 = "Failed to create cache UID: " + file;
                wn5.H("SimpleCache", str2, e2);
                hw7Var.j = new Cache$CacheException(str2, e2);
                return;
            }
        }
        try {
            onVar.p(hw7Var.h);
            if (qq4Var != null) {
                qq4Var.u(hw7Var.h);
                HashMap mapM = qq4Var.m();
                hw7Var.i(file, true, fileArrListFiles, mapM);
                qq4Var.B(mapM.keySet());
            } else {
                hw7Var.i(file, true, fileArrListFiles, null);
            }
            zx8 it = ImmutableSet.n(((HashMap) onVar.a).keySet()).iterator();
            while (it.hasNext()) {
                onVar.s((String) it.next());
            }
            try {
                onVar.x();
            } catch (IOException e3) {
                wn5.H("SimpleCache", "Storing index file failed", e3);
            }
        } catch (IOException e4) {
            String str3 = "Failed to initialize cache indices: " + file;
            wn5.H("SimpleCache", str3, e4);
            hw7Var.j = new Cache$CacheException(str3, e4);
        }
    }

    public static void e(File file) throws Cache$CacheException {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        wn5.F("SimpleCache", str);
        throw new Cache$CacheException(str);
    }

    public static long f(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        File file2 = new File(file, t61.i(Long.toString(jAbs, 16), ".uid"));
        if (file2.createNewFile()) {
            return jAbs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    public static synchronized void o(File file) {
        k.remove(file.getAbsoluteFile());
    }

    public final void b(iw7 iw7Var) {
        String str = iw7Var.a;
        this.c.m(str).c.add(iw7Var);
        ArrayList arrayList = (ArrayList) this.e.get(str);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((m44) arrayList.get(size)).b(this, iw7Var);
            }
        }
        this.b.b(this, iw7Var);
    }

    public final synchronized void c(String str, k41 k41Var) {
        vy2.s(!this.i);
        d();
        on onVar = this.c;
        vk0 vk0VarM = onVar.m(str);
        zd1 zd1Var = vk0VarM.e;
        zd1 zd1VarA = zd1Var.a(k41Var);
        vk0VarM.e = zd1VarA;
        if (!zd1VarA.equals(zd1Var)) {
            ((wk0) onVar.e).e(vk0VarM);
        }
        try {
            this.c.x();
        } catch (IOException e) {
            throw new Cache$CacheException(e);
        }
    }

    public final synchronized void d() {
        Cache$CacheException cache$CacheException = this.j;
        if (cache$CacheException != null) {
            throw cache$CacheException;
        }
    }

    public final synchronized zd1 g(String str) {
        vk0 vk0VarL;
        vy2.s(!this.i);
        vk0VarL = this.c.l(str);
        return vk0VarL != null ? vk0VarL.e : zd1.c;
    }

    public final iw7 h(long j, long j2, String str) {
        iw7 iw7Var;
        long j3;
        vk0 vk0VarL = this.c.l(str);
        if (vk0VarL == null) {
            return new iw7(str, j, j2, -9223372036854775807L, null);
        }
        while (true) {
            iw7 iw7Var2 = new iw7(vk0VarL.b, j, -1L, -9223372036854775807L, null);
            TreeSet treeSet = vk0VarL.c;
            iw7Var = (iw7) treeSet.floor(iw7Var2);
            if (iw7Var == null || iw7Var.b + iw7Var.c <= j) {
                iw7 iw7Var3 = (iw7) treeSet.ceiling(iw7Var2);
                if (iw7Var3 != null) {
                    long jMin = iw7Var3.b - j;
                    if (j2 != -1) {
                        jMin = Math.min(jMin, j2);
                    }
                    j3 = jMin;
                } else {
                    j3 = j2;
                }
                iw7Var = new iw7(vk0VarL.b, j, j3, -9223372036854775807L, null);
            }
            if (!iw7Var.d) {
                break;
            }
            File file = iw7Var.e;
            file.getClass();
            if (file.length() == iw7Var.c) {
                break;
            }
            l();
        }
        return iw7Var;
    }

    public final void i(File file, boolean z, File[] fileArr, Map map) {
        long j;
        long j2;
        if (fileArr == null || fileArr.length == 0) {
            if (z) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z && name.indexOf(46) == -1) {
                i(file2, false, file2.listFiles(), map);
            } else if (!z || (!name.startsWith("cached_content_index.exi") && !name.endsWith(".uid"))) {
                nk0 nk0Var = map != null ? (nk0) map.remove(name) : null;
                if (nk0Var != null) {
                    j = nk0Var.a;
                    j2 = nk0Var.b;
                } else {
                    j = -1;
                    j2 = -9223372036854775807L;
                }
                iw7 iw7VarB = iw7.b(file2, j, j2, this.c);
                if (iw7VarB != null) {
                    b(iw7VarB);
                } else {
                    file2.delete();
                }
            }
        }
    }

    public final synchronized void j(iw7 iw7Var) {
        vy2.s(!this.i);
        vk0 vk0VarL = this.c.l(iw7Var.a);
        vk0VarL.getClass();
        long j = iw7Var.b;
        ArrayList arrayList = vk0VarL.d;
        for (int i = 0; i < arrayList.size(); i++) {
            if (((uk0) arrayList.get(i)).a == j) {
                arrayList.remove(i);
                this.c.s(vk0VarL.b);
                notifyAll();
            }
        }
        throw new IllegalStateException();
    }

    public final void k(qk0 qk0Var) {
        String str = qk0Var.a;
        long j = qk0Var.c;
        File file = qk0Var.e;
        on onVar = this.c;
        vk0 vk0VarL = onVar.l(str);
        if (vk0VarL == null || !vk0VarL.c.remove(qk0Var)) {
            return;
        }
        if (file != null) {
            file.delete();
        }
        qq4 qq4Var = this.d;
        if (qq4Var != null) {
            file.getClass();
            String name = file.getName();
            try {
                ((String) qq4Var.b).getClass();
                try {
                    ((h48) qq4Var.a).getWritableDatabase().delete((String) qq4Var.b, "name = ?", new String[]{name});
                } catch (SQLException e) {
                    throw new DatabaseIOException(e);
                }
            } catch (IOException unused) {
                o40.H("Failed to remove file index entry for: ", name, "SimpleCache");
            }
        }
        onVar.s(vk0VarL.b);
        ArrayList arrayList = (ArrayList) this.e.get(qk0Var.a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                m44 m44Var = (m44) arrayList.get(size);
                m44Var.b.remove(qk0Var);
                m44Var.c -= j;
            }
        }
        m44 m44Var2 = this.b;
        m44Var2.b.remove(qk0Var);
        m44Var2.c -= j;
    }

    public final void l() {
        ArrayList arrayList = new ArrayList();
        Iterator it = DesugarCollections.unmodifiableCollection(((HashMap) this.c.a).values()).iterator();
        while (it.hasNext()) {
            for (qk0 qk0Var : ((vk0) it.next()).c) {
                File file = qk0Var.e;
                file.getClass();
                if (file.length() != qk0Var.c) {
                    arrayList.add(qk0Var);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            k((qk0) arrayList.get(i));
        }
    }

    public final synchronized iw7 m(long j, long j2, String str) {
        vy2.s(!this.i);
        d();
        iw7 iw7VarH = h(j, j2, str);
        if (iw7VarH.d) {
            return n(str, iw7VarH);
        }
        vk0 vk0VarM = this.c.m(str);
        long j3 = iw7VarH.c;
        ArrayList arrayList = vk0VarM.d;
        for (int i = 0; i < arrayList.size(); i++) {
            uk0 uk0Var = (uk0) arrayList.get(i);
            long j4 = uk0Var.a;
            if (j4 <= j) {
                long j5 = uk0Var.b;
                if (j5 == -1 || j4 + j5 > j) {
                    return null;
                }
            } else {
                if (j3 == -1 || j + j3 > j4) {
                    return null;
                }
            }
        }
        arrayList.add(new uk0(j, j3));
        return iw7VarH;
    }

    public final iw7 n(String str, iw7 iw7Var) {
        boolean z;
        File file;
        long j = iw7Var.c;
        File file2 = iw7Var.e;
        if (!this.g) {
            return iw7Var;
        }
        file2.getClass();
        String name = file2.getName();
        long j2 = iw7Var.c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        qq4 qq4Var = this.d;
        if (qq4Var != null) {
            try {
                qq4Var.D(j2, jCurrentTimeMillis, name);
            } catch (IOException unused) {
                jCurrentTimeMillis = jCurrentTimeMillis;
                wn5.k0("SimpleCache", "Failed to update index with new touch timestamp.");
            }
            z = false;
        } else {
            z = true;
        }
        vk0 vk0VarL = this.c.l(str);
        vk0VarL.getClass();
        TreeSet treeSet = vk0VarL.c;
        vy2.s(treeSet.remove(iw7Var));
        file2.getClass();
        if (z) {
            File parentFile = file2.getParentFile();
            parentFile.getClass();
            File fileC = iw7.c(parentFile, vk0VarL.a, iw7Var.b, jCurrentTimeMillis);
            if (file2.renameTo(fileC)) {
                file = fileC;
            } else {
                wn5.k0("CachedContent", "Failed to rename " + file2 + " to " + fileC);
                file = file2;
            }
        } else {
            file = file2;
        }
        vy2.s(iw7Var.d);
        iw7 iw7Var2 = new iw7(iw7Var.a, iw7Var.b, iw7Var.c, jCurrentTimeMillis, file);
        treeSet.add(iw7Var2);
        ArrayList arrayList = (ArrayList) this.e.get(iw7Var.a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                m44 m44Var = (m44) arrayList.get(size);
                m44Var.b.remove(iw7Var);
                m44Var.c -= j;
                m44Var.b(this, iw7Var2);
            }
        }
        m44 m44Var2 = this.b;
        m44Var2.b.remove(iw7Var);
        m44Var2.c -= j;
        m44Var2.b(this, iw7Var2);
        return iw7Var2;
    }
}
