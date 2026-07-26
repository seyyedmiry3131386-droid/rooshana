package io.sentry.android.core;

import android.content.Context;
import io.sentry.util.AutoClosableReentrantLock;
import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r0 {
    public static String a;
    public static final Charset b = Charset.forName("UTF-8");
    public static final AutoClosableReentrantLock c = new AutoClosableReentrantLock();

    public static String a(Context context) {
        io.sentry.r rVarA = c.a();
        try {
            if (a == null) {
                File file = new File(context.getFilesDir(), "INSTALLATION");
                try {
                    boolean zExists = file.exists();
                    Charset charset = b;
                    if (!zExists) {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            String strX = io.sentry.config.a.x();
                            fileOutputStream.write(strX.getBytes(charset));
                            fileOutputStream.flush();
                            fileOutputStream.close();
                            a = strX;
                            rVarA.close();
                            return strX;
                        } finally {
                        }
                    }
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
                    try {
                        byte[] bArr = new byte[(int) randomAccessFile.length()];
                        randomAccessFile.readFully(bArr);
                        String str = new String(bArr, charset);
                        randomAccessFile.close();
                        a = str;
                    } finally {
                    }
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
            String str2 = a;
            rVarA.close();
            return str2;
        } catch (Throwable th2) {
            try {
                rVarA.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }
}
