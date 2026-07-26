package ir.mservices.market.pika.receive.model;

import android.content.Context;
import android.net.Uri;
import defpackage.cc2;
import defpackage.g51;
import defpackage.ja1;
import defpackage.js3;
import defpackage.k68;
import defpackage.lu7;
import defpackage.tx8;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public final Context a;
    public final k68 b;
    public final LinkedHashMap c;
    public final l d;

    public b(Context context, k68 k68Var) {
        js3.p(k68Var, "storageUtils");
        this.a = context;
        this.b = k68Var;
        this.c = new LinkedHashMap();
        this.d = ja1.b(new LinkedHashMap());
    }

    public static final void a(b bVar, File file, File file2) throws IOException {
        ZipInputStream zipInputStream = new ZipInputStream(io.sentry.config.a.g(file, new FileInputStream(file)));
        ZipEntry zipEntry = null;
        while (true) {
            try {
                ZipEntry nextEntry = zipInputStream.getNextEntry();
                if (nextEntry != null) {
                    zipEntry = nextEntry;
                } else {
                    nextEntry = null;
                }
                if (nextEntry == null) {
                    zipInputStream.close();
                    return;
                }
                if (zipEntry != null) {
                    File file3 = new File(file2.toString() + File.separator + zipEntry.getName());
                    File parentFile = file3.getParentFile();
                    if (parentFile != null) {
                        parentFile.mkdirs();
                    }
                    FileOutputStream fileOutputStreamK = io.sentry.config.a.k(new FileOutputStream(file3), file3);
                    byte[] bArr = new byte[16384];
                    while (true) {
                        int i = zipInputStream.read(bArr);
                        if (i <= 0) {
                            break;
                        } else {
                            fileOutputStreamK.write(bArr, 0, i);
                        }
                    }
                    fileOutputStreamK.close();
                    zipInputStream.closeEntry();
                }
            } finally {
            }
        }
    }

    public final void b() {
        k68 k68Var = this.b;
        cc2.o0(new File(k68Var.n()));
        String str = lu7.a0;
        js3.o(str, "KEY_DOWNLOAD_DIRECTORY_PATH");
        cc2.o0(new File(k68Var.g(str, "share/send")));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        l lVar = this.d;
        lVar.getClass();
        lVar.p(null, linkedHashMap);
        this.c.clear();
    }

    public final Object c(long j, Uri uri, String str, boolean z, g51 g51Var) {
        Object objV = js3.v(new SaveFileRepositoryImpl$saveFileAsync$2(z, this, str, uri, j, null), g51Var);
        return objV == CoroutineSingletons.a ? objV : tx8.a;
    }
}
