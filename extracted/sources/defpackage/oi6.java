package defpackage;

import io.sentry.config.a;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import nene.downloadmanager.downloader.async.AsyncTaskCanceledException;
import nene.downloadmanager.exceptions.downloadfail.NeneDownloadFailException;
import nene.downloadmanager.exceptions.downloadfail.NeneIntegrityException;
import nene.downloadmanager.exceptions.downloadfail.NeneNetworkException;
import nene.downloadmanager.exceptions.downloadfail.NenePostProcessErrorException;
import nene.downloadmanager.exceptions.downloadfail.NenePostProcessNoCategoryException;
import nene.downloadmanager.exceptions.downloadfail.NeneStorageException;

/* JADX INFO: loaded from: classes3.dex */
public final class oi6 extends vl5 {
    public tt1 h;
    public ArrayList i;
    public ts1 j;
    public es1 k;
    public String l;

    static {
        eh5.a("PostProcessAsyncTask");
    }

    @Override // defpackage.vl5
    public final Object b(Object[] objArr) throws Throwable {
        try {
            h();
            i();
            j();
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
        tt1Var.i = null;
        tt1Var.h();
    }

    @Override // defpackage.vl5
    public final void e(Object obj) throws Throwable {
        tt1 tt1Var = this.h;
        NeneDownloadFailException neneDownloadFailException = this.a;
        if (neneDownloadFailException != null) {
            if (o40.O(neneDownloadFailException)) {
                int[] iArr = NeneDownloadFailException.a;
            } else {
                neneDownloadFailException = new NeneDownloadFailException(neneDownloadFailException, "Exception type is not valid");
            }
            tt1Var.i = null;
            tt1Var.d(neneDownloadFailException);
            return;
        }
        es1 es1Var = tt1Var.f;
        int i = es1Var.g;
        tt1Var.i = null;
        pa1 pa1Var = tt1Var.b;
        pa1Var.d.z(es1Var, false);
        es1Var.c(140);
        pa1Var.c.g(es1Var, 300);
        pa1Var.g(es1Var, 251);
        pa1Var.c();
        tt1Var.h();
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0182 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oi6.h():void");
    }

    public final void i() throws NeneStorageException, NeneIntegrityException, AsyncTaskCanceledException {
        int i;
        a();
        es1 es1Var = this.k;
        String str = this.l;
        if (str == null) {
            return;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            String str2 = es1Var.c;
            BufferedInputStream bufferedInputStream = new BufferedInputStream(a.i(new FileInputStream(str2), str2));
            byte[] bArr = new byte[1024];
            while (true) {
                int i2 = bufferedInputStream.read(bArr);
                if (i2 == -1) {
                    break;
                } else {
                    messageDigest.update(bArr, 0, i2);
                }
            }
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 0) {
                    hexString = "00";
                }
                if (hexString.length() == 1) {
                    hexString = "0" + hexString;
                }
                sb.append(hexString);
            }
            bufferedInputStream.close();
            if (str.equalsIgnoreCase(sb.toString())) {
                return;
            }
            throw new NeneIntegrityException("Checksum doesn't match, Header checksum: " + str + ", File checksum: " + sb.toString() + ", URL: " + es1Var.b);
        } catch (IOException e) {
            throw new NeneStorageException(e, "Exception when checking file integrity: " + es1Var.c);
        } catch (NoSuchAlgorithmException unused) {
        }
    }

    public final void j() throws AsyncTaskCanceledException, NenePostProcessErrorException {
        a();
        ts1 ts1Var = this.j;
        if (ts1Var == null) {
            return;
        }
        try {
            ts1Var.b(this.k);
        } catch (InterruptedException e) {
            a();
            throw new NenePostProcessErrorException(e, "Post-process thread interrupted but is not canceled");
        } catch (NeneIntegrityException e2) {
        } catch (NeneNetworkException e3) {
        } catch (NenePostProcessErrorException e4) {
            throw e4;
        } catch (NenePostProcessNoCategoryException e5) {
        } catch (NeneStorageException e6) {
        } catch (Exception e7) {
            throw new NenePostProcessErrorException(e7, "Something is wrong with this post-processor!");
        }
    }
}
