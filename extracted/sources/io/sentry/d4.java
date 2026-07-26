package io.sentry;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d4 {
    public final /* synthetic */ u0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ w c;
    public final /* synthetic */ File d;

    public /* synthetic */ d4(u0 u0Var, String str, w wVar, File file) {
        this.a = u0Var;
        this.b = str;
        this.c = wVar;
        this.d = file;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a() {
        int i;
        int i2;
        File[] fileArrListFiles;
        int i3;
        File file = this.d;
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        int i4 = 1;
        int i5 = 0;
        String str = this.b;
        u0 u0Var = this.a;
        u0Var.i(sentryLevel, "Started processing cached files from %s", str);
        final w wVar = this.c;
        Queue queue = wVar.d;
        u0 u0Var2 = wVar.b;
        try {
            u0Var2.i(sentryLevel, "Processing dir. %s", file.getAbsolutePath());
            fileArrListFiles = file.listFiles(new FilenameFilter() { // from class: io.sentry.u
                @Override // java.io.FilenameFilter
                public final boolean accept(File file2, String str2) {
                    return wVar.a(str2);
                }
            });
        } catch (Throwable th) {
            th = th;
            i = 0;
        }
        if (fileArrListFiles != null) {
            u0Var2.i(sentryLevel, "Processing %d items from cache dir %s", Integer.valueOf(fileArrListFiles.length), file.getAbsolutePath());
            int length = fileArrListFiles.length;
            int i6 = 0;
            while (i6 < length) {
                File file2 = fileArrListFiles[i6];
                if (file2.isFile()) {
                    String absolutePath = file2.getAbsolutePath();
                    if (((SynchronizedCollection) queue).contains(absolutePath)) {
                        SentryLevel sentryLevel2 = SentryLevel.DEBUG;
                        Object[] objArr = new Object[i4];
                        objArr[i5] = absolutePath;
                        u0Var2.i(sentryLevel2, "File '%s' has already been processed so it will not be processed again.", objArr);
                    } else {
                        io.sentry.transport.p pVarE = wVar.a.e();
                        if (pVarE == null || !pVarE.d(DataCategory.All)) {
                            SentryLevel sentryLevel3 = SentryLevel.DEBUG;
                            i = i5;
                            try {
                                Object[] objArr2 = new Object[i4];
                                objArr2[i] = absolutePath;
                                u0Var2.i(sentryLevel3, "Processing file: %s", objArr2);
                                i3 = i6;
                                wVar.b(file2, io.sentry.config.a.o(new v(wVar.c, wVar.b, absolutePath, queue)));
                                Thread.sleep(100L);
                                i6 = i3 + 1;
                                i5 = i;
                                i4 = 1;
                            } catch (Throwable th2) {
                                th = th2;
                                SentryLevel sentryLevel4 = SentryLevel.ERROR;
                                i2 = 1;
                                Object[] objArr3 = new Object[1];
                                objArr3[i] = file.getAbsolutePath();
                                u0Var2.e(sentryLevel4, th, "Failed processing '%s'", objArr3);
                                SentryLevel sentryLevel5 = SentryLevel.DEBUG;
                                Object[] objArr4 = new Object[i2];
                                objArr4[i] = str;
                                u0Var.i(sentryLevel5, "Finished processing cached files from %s", objArr4);
                            }
                        } else {
                            u0Var2.i(SentryLevel.INFO, "DirectoryProcessor, rate limiting active.", new Object[i5]);
                        }
                    }
                } else {
                    SentryLevel sentryLevel6 = SentryLevel.DEBUG;
                    Object[] objArr5 = new Object[i4];
                    objArr5[i5] = file2.getAbsolutePath();
                    u0Var2.i(sentryLevel6, "File %s is not a File.", objArr5);
                }
                i = i5;
                i3 = i6;
                i6 = i3 + 1;
                i5 = i;
                i4 = 1;
            }
            i = i5;
            i2 = i4;
            SentryLevel sentryLevel52 = SentryLevel.DEBUG;
            Object[] objArr42 = new Object[i2];
            objArr42[i] = str;
            u0Var.i(sentryLevel52, "Finished processing cached files from %s", objArr42);
        }
        u0Var2.i(SentryLevel.ERROR, "Cache dir %s is null or is not a directory.", file.getAbsolutePath());
        i2 = i4;
        i = i5;
        SentryLevel sentryLevel522 = SentryLevel.DEBUG;
        Object[] objArr422 = new Object[i2];
        objArr422[i] = str;
        u0Var.i(sentryLevel522, "Finished processing cached files from %s", objArr422);
    }
}
