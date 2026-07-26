package io.sentry.cache;

import defpackage.f09;
import io.sentry.SentryLevel;
import io.sentry.b6;
import io.sentry.i1;
import io.sentry.i6;
import io.sentry.r;
import io.sentry.u4;
import io.sentry.util.AutoClosableReentrantLock;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class c implements d {
    public static final Charset i = Charset.forName("UTF-8");
    public final b6 a;
    public final io.sentry.util.e b = new io.sentry.util.e(new f09(21, this));
    public final File c;
    public final int d;
    public final CountDownLatch e;
    public final WeakHashMap f;
    public final AutoClosableReentrantLock g;
    public final AutoClosableReentrantLock h;

    public c(b6 b6Var, String str, int i2) {
        io.sentry.config.a.W(b6Var, "SentryOptions is required.");
        this.a = b6Var;
        this.c = new File(str);
        this.d = i2;
        this.f = new WeakHashMap();
        this.g = new AutoClosableReentrantLock();
        this.h = new AutoClosableReentrantLock();
        this.e = new CountDownLatch(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00db  */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v49 */
    /* JADX WARN: Type inference failed for: r6v50 */
    /* JADX WARN: Type inference failed for: r7v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v57 */
    /* JADX WARN: Type inference failed for: r7v58 */
    @Override // io.sentry.cache.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean R(io.sentry.internal.debugmeta.c r26, io.sentry.h0 r27) {
        /*
            Method dump skipped, instruction units count: 1403
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.cache.c.R(io.sentry.internal.debugmeta.c, io.sentry.h0):boolean");
    }

    public final File[] a() {
        File file = this.c;
        if (file.isDirectory() && file.canWrite() && file.canRead()) {
            File[] fileArrListFiles = file.listFiles(new b());
            if (fileArrListFiles != null) {
                return fileArrListFiles;
            }
        } else {
            this.a.getLogger().i(SentryLevel.ERROR, "The directory for caching files is inaccessible.: %s", file.getAbsolutePath());
        }
        return new File[0];
    }

    public final File c(io.sentry.internal.debugmeta.c cVar) {
        String str;
        WeakHashMap weakHashMap = this.f;
        r rVarA = this.g.a();
        try {
            if (weakHashMap.containsKey(cVar)) {
                str = (String) weakHashMap.get(cVar);
            } else {
                String strConcat = io.sentry.config.a.x().concat(".envelope");
                weakHashMap.put(cVar, strConcat);
                str = strConcat;
            }
            File file = new File(this.c.getAbsolutePath(), str);
            rVarA.close();
            return file;
        } catch (Throwable th) {
            try {
                rVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void d(File file, File file2) {
        r rVarA = this.h.a();
        try {
            if (!file.exists()) {
                rVarA.close();
                return;
            }
            boolean zExists = file2.exists();
            b6 b6Var = this.a;
            if (zExists) {
                b6Var.getLogger().i(SentryLevel.DEBUG, "Previous session file already exists, deleting it.", new Object[0]);
                if (!file2.delete()) {
                    b6Var.getLogger().i(SentryLevel.WARNING, "Unable to delete previous session file: %s", file2);
                }
            }
            b6Var.getLogger().i(SentryLevel.INFO, "Moving current session to previous session.", new Object[0]);
            try {
                if (!file.renameTo(file2)) {
                    b6Var.getLogger().i(SentryLevel.WARNING, "Unable to move current session to previous session.", new Object[0]);
                }
            } catch (Throwable th) {
                b6Var.getLogger().f(SentryLevel.ERROR, "Error moving current session to previous session.", th);
            }
            rVarA.close();
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final io.sentry.internal.debugmeta.c e(File file) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                io.sentry.internal.debugmeta.c cVarD = ((i1) this.b.a()).d(bufferedInputStream);
                bufferedInputStream.close();
                return cVarD;
            } finally {
            }
        } catch (IOException e) {
            this.a.getLogger().f(SentryLevel.ERROR, "Failed to deserialize the envelope.", e);
            return null;
        }
    }

    public final i6 f(u4 u4Var) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(u4Var.f()), i));
            try {
                i6 i6Var = (i6) ((i1) this.b.a()).c(bufferedReader, i6.class);
                bufferedReader.close();
                return i6Var;
            } finally {
            }
        } catch (Throwable th) {
            this.a.getLogger().f(SentryLevel.ERROR, "Failed to deserialize the session.", th);
            return null;
        }
    }

    public final boolean h() {
        b6 b6Var = this.a;
        try {
            return this.e.await(b6Var.getSessionFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            b6Var.getLogger().i(SentryLevel.DEBUG, "Timed out waiting for previous session to flush.", new Object[0]);
            return false;
        }
    }

    public final void i(File file, i6 i6Var) {
        String str = i6Var.e;
        b6 b6Var = this.a;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, i));
                try {
                    b6Var.getLogger().i(SentryLevel.DEBUG, "Overwriting session to offline storage: %s", str);
                    ((i1) this.b.a()).a(i6Var, bufferedWriter);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            b6Var.getLogger().e(SentryLevel.ERROR, th, "Error writing Session to offline storage: %s", str);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        b6 b6Var = this.a;
        File[] fileArrA = a();
        ArrayList arrayList = new ArrayList(fileArrA.length);
        for (File file : fileArrA) {
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    arrayList.add(((i1) this.b.a()).d(bufferedInputStream));
                    bufferedInputStream.close();
                } catch (Throwable th) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused) {
                b6Var.getLogger().i(SentryLevel.DEBUG, "Envelope file '%s' disappeared while converting all cached files to envelopes.", file.getAbsolutePath());
            } catch (IOException e) {
                b6Var.getLogger().f(SentryLevel.ERROR, "Error while reading cached envelope from file " + file.getAbsolutePath(), e);
            }
        }
        return arrayList.iterator();
    }

    @Override // io.sentry.cache.d
    public final void l1(io.sentry.internal.debugmeta.c cVar) {
        io.sentry.config.a.W(cVar, "Envelope is required.");
        File fileC = c(cVar);
        boolean zDelete = fileC.delete();
        b6 b6Var = this.a;
        if (zDelete) {
            b6Var.getLogger().i(SentryLevel.DEBUG, "Discarding envelope from cache: %s", fileC.getAbsolutePath());
        } else {
            b6Var.getLogger().i(SentryLevel.DEBUG, "Envelope was not cached or could not be deleted: %s", fileC.getAbsolutePath());
        }
    }
}
