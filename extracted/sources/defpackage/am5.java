package defpackage;

import java.io.File;
import java.io.IOException;
import nene.downloadmanager.exceptions.downloadfail.NeneStorageException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class am5 {
    public static final /* synthetic */ int a = 0;

    static {
        eh5.a("NeneIOUtils");
    }

    public static void a(File file) throws NeneStorageException {
        if (file.exists()) {
            if (file.isDirectory()) {
                try {
                    zb2.e(file);
                } catch (IOException e) {
                    throw new NeneStorageException(e, "Could not delete directory: " + file);
                }
            } else if (!file.delete()) {
                throw new NeneStorageException("Could not delete file: " + file);
            }
            file.getName();
        }
    }
}
