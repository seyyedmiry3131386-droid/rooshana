package defpackage;

import io.sentry.config.a;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import org.apache.commons.io.FileExistsException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zb2 {
    public static final /* synthetic */ int a = 0;

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(1024L);
        bigIntegerValueOf.multiply(bigIntegerValueOf.multiply(bigIntegerValueOf.multiply(bigIntegerValueOf.multiply(bigIntegerValueOf.multiply(bigIntegerValueOf)))));
        bigIntegerValueOf.multiply(BigInteger.valueOf(1024L).multiply(BigInteger.valueOf(1152921504606846976L)));
        Charset.forName("UTF-8");
    }

    public static void a(File file) throws IOException {
        if (!file.exists()) {
            throw new IllegalArgumentException(file + " does not exist");
        }
        if (!file.isDirectory()) {
            throw new IllegalArgumentException(file + " is not a directory");
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            throw new IOException("Failed to list contents of " + file);
        }
        IOException e = null;
        for (File file2 : fileArrListFiles) {
            try {
                g(file2);
            } catch (IOException e2) {
                e = e2;
            }
        }
        if (e != null) {
            throw e;
        }
    }

    public static void b(File file, File file2) throws Throwable {
        Throwable th;
        FileInputStream fileInputStreamG;
        FileOutputStream fileOutputStreamK;
        Closeable closeable;
        long j;
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (!file.exists()) {
            throw new FileNotFoundException(bl4.u("Source '", file, "' does not exist"));
        }
        if (file.isDirectory()) {
            throw new IOException(bl4.u("Source '", file, "' exists but is a directory"));
        }
        if (file.getCanonicalPath().equals(file2.getCanonicalPath())) {
            throw new IOException("Source '" + file + "' and destination '" + file2 + "' are the same");
        }
        File parentFile = file2.getParentFile();
        if (parentFile != null && !parentFile.mkdirs() && !parentFile.isDirectory()) {
            throw new IOException(bl4.u("Destination '", parentFile, "' directory cannot be created"));
        }
        if (file2.exists() && !file2.canWrite()) {
            throw new IOException(bl4.u("Destination '", file2, "' exists but is read-only"));
        }
        if (file2.exists() && file2.isDirectory()) {
            throw new IOException(bl4.u("Destination '", file2, "' exists but is a directory"));
        }
        FileChannel fileChannel = null;
        fileChannel = null;
        fileChannel = null;
        try {
            fileInputStreamG = a.g(file, new FileInputStream(file));
            try {
                fileOutputStreamK = a.k(new FileOutputStream(file2), file2);
                try {
                    FileChannel channel = fileInputStreamG.getChannel();
                    try {
                        FileChannel channel2 = fileOutputStreamK.getChannel();
                        try {
                            long size = channel.size();
                            for (long jTransferFrom = 0; jTransferFrom < size; jTransferFrom += channel2.transferFrom(channel, jTransferFrom, j)) {
                                j = size - jTransferFrom;
                                if (j > 31457280) {
                                    j = 31457280;
                                }
                            }
                            jg3.a(channel2);
                            jg3.a(fileOutputStreamK);
                            jg3.a(channel);
                            jg3.a(fileInputStreamG);
                            if (file.length() == file2.length()) {
                                file2.setLastModified(file.lastModified());
                                return;
                            }
                            throw new IOException("Failed to copy full contents from '" + file + "' to '" + file2 + "'");
                        } catch (Throwable th2) {
                            th = th2;
                            fileChannel = channel2;
                            closeable = channel;
                            jg3.a(fileChannel);
                            jg3.a(fileOutputStreamK);
                            jg3.a(closeable);
                            jg3.a(fileInputStreamG);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        closeable = channel;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    closeable = null;
                }
            } catch (Throwable th5) {
                th = th5;
                fileOutputStreamK = null;
                closeable = fileOutputStreamK;
                jg3.a(fileChannel);
                jg3.a(fileOutputStreamK);
                jg3.a(closeable);
                jg3.a(fileInputStreamG);
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            fileInputStreamG = null;
            fileOutputStreamK = null;
        }
    }

    public static void c(File file, File file2) throws Throwable {
        if (file2.exists() && !file2.isDirectory()) {
            throw new IllegalArgumentException(bl4.u("Destination '", file2, "' is not a directory"));
        }
        b(file, new File(file2, file.getName()));
    }

    public static void d(File file, InputStream inputStream) {
        try {
            FileOutputStream fileOutputStreamK = k(file);
            try {
                int i = jg3.a;
                byte[] bArr = new byte[4096];
                while (true) {
                    int i2 = inputStream.read(bArr);
                    if (-1 == i2) {
                        fileOutputStreamK.close();
                        return;
                    }
                    fileOutputStreamK.write(bArr, 0, i2);
                }
            } finally {
                jg3.a(fileOutputStreamK);
            }
        } finally {
            jg3.a(inputStream);
        }
    }

    public static void e(File file) {
        if (file.exists()) {
            if (!h(file)) {
                a(file);
            }
            if (!file.delete()) {
                throw new IOException(bl4.u("Unable to delete directory ", file, "."));
            }
        }
    }

    public static void f(File file) {
        if (file == null) {
            return;
        }
        try {
            if (file.isDirectory()) {
                a(file);
            }
        } catch (Exception unused) {
        }
        try {
            file.delete();
        } catch (Exception unused2) {
        }
    }

    public static void g(File file) throws IOException {
        if (file.isDirectory()) {
            e(file);
            return;
        }
        boolean zExists = file.exists();
        if (file.delete()) {
            return;
        }
        if (zExists) {
            throw new IOException("Unable to delete file: " + file);
        }
        throw new FileNotFoundException("File does not exist: " + file);
    }

    public static boolean h(File file) {
        if (file == null) {
            throw new NullPointerException("File must not be null");
        }
        if (bc2.a == '\\') {
            return false;
        }
        if (file.getParent() != null) {
            file = new File(file.getParentFile().getCanonicalFile(), file.getName());
        }
        return !file.getCanonicalFile().equals(file.getAbsoluteFile());
    }

    public static void i(File file, File file2) throws Throwable {
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        }
        if (!file.exists()) {
            throw new FileNotFoundException(bl4.u("Source '", file, "' does not exist"));
        }
        if (file.isDirectory()) {
            throw new IOException(bl4.u("Source '", file, "' is a directory"));
        }
        if (file2.exists()) {
            throw new FileExistsException(bl4.u("Destination '", file2, "' already exists"));
        }
        if (file2.isDirectory()) {
            throw new IOException(bl4.u("Destination '", file2, "' is a directory"));
        }
        if (file.renameTo(file2)) {
            return;
        }
        b(file, file2);
        if (file.delete()) {
            return;
        }
        f(file2);
        throw new IOException("Failed to delete original file '" + file + "' after copy to '" + file2 + "'");
    }

    public static FileInputStream j(File file) throws IOException {
        if (!file.exists()) {
            throw new FileNotFoundException(bl4.u("File '", file, "' does not exist"));
        }
        if (file.isDirectory()) {
            throw new IOException(bl4.u("File '", file, "' exists but is a directory"));
        }
        if (file.canRead()) {
            return a.g(file, new FileInputStream(file));
        }
        throw new IOException(bl4.u("File '", file, "' cannot be read"));
    }

    public static FileOutputStream k(File file) throws IOException {
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.mkdirs() && !parentFile.isDirectory()) {
                throw new IOException(bl4.u("Directory '", parentFile, "' could not be created"));
            }
        } else {
            if (file.isDirectory()) {
                throw new IOException(bl4.u("File '", file, "' exists but is a directory"));
            }
            if (!file.canWrite()) {
                throw new IOException(bl4.u("File '", file, "' cannot be written to"));
            }
        }
        return a.j(file, new FileOutputStream(file, false), false);
    }

    public static long l(File file) {
        if (!file.exists()) {
            throw new IllegalArgumentException(file + " does not exist");
        }
        if (!file.isDirectory()) {
            throw new IllegalArgumentException(file + " is not a directory");
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return 0L;
        }
        long jL = 0;
        for (File file2 : fileArrListFiles) {
            try {
                if (!h(file2)) {
                    if (!file2.exists()) {
                        throw new IllegalArgumentException(file2 + " does not exist");
                    }
                    jL += file2.isDirectory() ? l(file2) : file2.length();
                    if (jL < 0) {
                        break;
                    }
                } else {
                    continue;
                }
            } catch (IOException unused) {
            }
        }
        return jL;
    }
}
