package defpackage;

import ir.mservices.market.version2.download.DownloadTag;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import nene.downloadmanager.downloader.async.AsyncTaskCanceledException;
import nene.downloadmanager.exceptions.downloadfail.NeneDownloadFailException;
import nene.downloadmanager.exceptions.downloadfail.NeneNetworkException;
import nene.downloadmanager.exceptions.downloadfail.NenePreProcessErrorException;
import nene.downloadmanager.exceptions.downloadfail.NenePreProcessNoCategoryException;
import nene.downloadmanager.exceptions.downloadfail.NeneStorageException;

/* JADX INFO: loaded from: classes3.dex */
public final class qi6 extends vl5 {
    public final tt1 h;
    public final vs1 i;
    public final int j;
    public final es1 k;
    public ArrayList l;

    static {
        eh5.a("PreProcessAsyncTask");
    }

    public qi6(tt1 tt1Var, es1 es1Var, vs1 vs1Var, int i) {
        this.h = tt1Var;
        this.k = es1Var;
        this.i = vs1Var;
        this.j = i;
    }

    @Override // defpackage.vl5
    public final Object b(Object[] objArr) {
        try {
            i();
            j();
            h();
            return null;
        } catch (AsyncTaskCanceledException unused) {
            this.e.get();
            return null;
        } catch (NeneDownloadFailException e) {
            this.a = e;
            return null;
        } catch (Exception e2) {
            this.a = new NeneDownloadFailException(e2, "Unexpected error");
            return null;
        }
    }

    @Override // defpackage.vl5
    public final void d(Object obj) {
        tt1 tt1Var = this.h;
        tt1Var.h = null;
        tt1Var.h();
    }

    @Override // defpackage.vl5
    public final void e(Object obj) throws Throwable {
        NeneDownloadFailException neneDownloadFailException = this.a;
        tt1 tt1Var = this.h;
        if (neneDownloadFailException != null) {
            if (o40.O(neneDownloadFailException)) {
                int[] iArr = NeneDownloadFailException.a;
            } else {
                neneDownloadFailException = new NeneDownloadFailException(neneDownloadFailException, "Exception type is not valid");
            }
            tt1Var.h = null;
            tt1Var.d(neneDownloadFailException);
            return;
        }
        ArrayList arrayList = this.l;
        es1 es1Var = tt1Var.f;
        int i = es1Var.a;
        es1 es1Var2 = this.k;
        int i2 = es1Var2.a;
        arrayList.size();
        tt1Var.h = null;
        es1Var.b = es1Var2.b;
        es1Var.c = es1Var2.c;
        long j = es1Var2.i;
        es1Var.i = j;
        long j2 = es1Var2.h;
        es1Var.h = j2;
        es1Var.e = es1Var2.e;
        if (j2 < 0 || j != j2) {
            tt1Var.i(102);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                tt1Var.a((zl7) it.next(), false);
            }
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            tt1Var.a((zl7) it2.next(), true);
        }
        tt1Var.c();
    }

    public final void h() throws NeneStorageException, AsyncTaskCanceledException {
        a();
        es1 es1Var = this.k;
        File file = new File(es1Var.c);
        File parentFile = file.getParentFile();
        if (!parentFile.exists() && !parentFile.mkdirs()) {
            throw new NeneStorageException("Couldn't create dir: " + parentFile);
        }
        long j = es1Var.h;
        long j2 = 0;
        int i = this.j;
        if (j < 0) {
            ArrayList arrayListA = zl7.a(es1Var.b, i, -1L, es1Var.c);
            this.l = arrayListA;
            arrayListA.size();
            zl7 zl7Var = (zl7) this.l.get(0);
            String str = zl7Var.f;
            int i2 = am5.a;
            am5.a(new File(str));
            zl7Var.b(0L);
            am5.a(file);
        } else {
            ArrayList<zl7> arrayListA2 = zl7.a(es1Var.b, i, j, es1Var.c);
            this.l = arrayListA2;
            for (zl7 zl7Var2 : arrayListA2) {
                File file2 = new File(zl7Var2.f);
                if (file2.exists() && !file2.isFile()) {
                    am5.a(file2);
                }
                zl7Var2.b(file2.length());
                zl7Var2.c(zl7Var2.d);
                j2 += zl7Var2.g;
            }
        }
        if (file.exists()) {
            j2 = es1Var.h;
        }
        if (es1Var.i != j2) {
            es1Var.i = j2;
        }
    }

    public final void i() throws AsyncTaskCanceledException {
        es1 es1Var = this.k;
        if (es1Var.c == null) {
            return;
        }
        pb2 pb2VarD = pb2.d();
        boolean zF = false;
        while (!zF) {
            a();
            try {
                String str = es1Var.c;
                pb2VarD.getClass();
                zF = pb2.f(100L, str);
            } catch (InterruptedException unused) {
                this.e.get();
            }
        }
    }

    public final void j() throws NenePreProcessErrorException, AsyncTaskCanceledException, NeneNetworkException {
        es1 es1Var = this.k;
        a();
        vs1 vs1Var = this.i;
        if (vs1Var == null) {
            return;
        }
        try {
            us1 us1VarA = vs1Var.a(es1Var);
            if (us1VarA == null) {
                throw new NenePreProcessErrorException("Pre-process returned null, URL: " + es1Var);
            }
            String str = us1VarA.a;
            if (str != null) {
                es1Var.b = str;
            } else if (es1Var.b == null) {
                throw new NenePreProcessErrorException("No URL for download provided: " + es1Var);
            }
            if (us1VarA.b != null) {
                String str2 = es1Var.c;
                if (str2 != null) {
                    try {
                        pb2.a(str2, true, true);
                    } catch (NeneStorageException unused) {
                    }
                    pb2.d().e(es1Var.c);
                    es1Var.i = 0L;
                    es1Var.h = -1L;
                }
                es1Var.c = us1VarA.b;
                i();
            } else if (es1Var.c == null) {
                throw new NenePreProcessErrorException("No file path provided to store download: " + es1Var);
            }
            DownloadTag downloadTag = us1VarA.c;
            if (downloadTag != null) {
                es1Var.e = downloadTag;
                Objects.toString(downloadTag);
            }
        } catch (InterruptedException e) {
            a();
            throw new NenePreProcessErrorException(e, "Pre-process thread interrupted but is not canceled");
        } catch (NeneNetworkException e2) {
            throw e2;
        } catch (NenePreProcessErrorException e3) {
        } catch (NenePreProcessNoCategoryException e4) {
        } catch (NeneStorageException e5) {
        } catch (Exception e6) {
            throw new NenePreProcessErrorException(e6, "Something is wrong with this pre-processor!");
        }
    }
}
