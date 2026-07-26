package defpackage;

import io.sentry.config.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ww3 extends tb2 {
    public static ArrayList l0(s26 s26Var, boolean z) throws IOException {
        File file = s26Var.toFile();
        String[] list = file.list();
        if (list == null) {
            if (!z) {
                return null;
            }
            if (file.exists()) {
                throw new IOException("failed to list " + s26Var);
            }
            throw new FileNotFoundException("no such file: " + s26Var);
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            js3.m(str);
            arrayList.add(s26Var.e(str));
        }
        yu0.X(arrayList);
        return arrayList;
    }

    @Override // defpackage.tb2
    public final List I(s26 s26Var) throws IOException {
        ArrayList arrayListL0 = l0(s26Var, true);
        js3.m(arrayListL0);
        return arrayListL0;
    }

    @Override // defpackage.tb2
    public final List J(s26 s26Var) {
        js3.p(s26Var, "dir");
        return l0(s26Var, false);
    }

    @Override // defpackage.tb2
    public xj1 P(s26 s26Var) {
        js3.p(s26Var, "path");
        File file = s26Var.toFile();
        boolean zIsFile = file.isFile();
        boolean zIsDirectory = file.isDirectory();
        long jLastModified = file.lastModified();
        long length = file.length();
        if (!zIsFile && !zIsDirectory && jLastModified == 0 && length == 0 && !file.exists()) {
            return null;
        }
        return new xj1(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null);
    }

    @Override // defpackage.tb2
    public final vw3 R(s26 s26Var) {
        return new vw3(new RandomAccessFile(s26Var.toFile(), "r"));
    }

    @Override // defpackage.tb2
    public final by7 U(s26 s26Var, boolean z) throws IOException {
        js3.p(s26Var, "file");
        if (!z || !D(s26Var)) {
            File file = s26Var.toFile();
            return new kx5(a.j(file, new FileOutputStream(file, false), false), new dm8());
        }
        throw new IOException(s26Var + " already exists.");
    }

    @Override // defpackage.tb2
    public final by7 b(s26 s26Var) {
        js3.p(s26Var, "file");
        File file = s26Var.toFile();
        return new kx5(a.j(file, new FileOutputStream(file, true), true), new dm8());
    }

    @Override // defpackage.tb2
    public void d(s26 s26Var, s26 s26Var2) throws IOException {
        js3.p(s26Var, "source");
        js3.p(s26Var2, "target");
        if (s26Var.toFile().renameTo(s26Var2.toFile())) {
            return;
        }
        throw new IOException("failed to move " + s26Var + " to " + s26Var2);
    }

    @Override // defpackage.tb2
    public final void k(s26 s26Var) throws IOException {
        js3.p(s26Var, "dir");
        if (s26Var.toFile().mkdir()) {
            return;
        }
        xj1 xj1VarP = P(s26Var);
        if (xj1VarP == null || !xj1VarP.c) {
            throw new IOException("failed to create directory: " + s26Var);
        }
    }

    @Override // defpackage.tb2
    public final t18 k0(s26 s26Var) {
        js3.p(s26Var, "file");
        File file = s26Var.toFile();
        return new jo3(a.g(file, new FileInputStream(file)), dm8.d);
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }

    @Override // defpackage.tb2
    public final void u(s26 s26Var) throws IOException {
        js3.p(s26Var, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File file = s26Var.toFile();
        if (file.delete() || !file.exists()) {
            return;
        }
        throw new IOException("failed to delete " + s26Var);
    }
}
