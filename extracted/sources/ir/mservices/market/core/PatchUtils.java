package ir.mservices.market.core;

import android.content.pm.PackageManager;
import android.text.TextUtils;
import defpackage.a77;
import defpackage.bc2;
import defpackage.bl4;
import defpackage.dp3;
import defpackage.dw1;
import defpackage.jg3;
import defpackage.js3;
import defpackage.k68;
import defpackage.lw;
import defpackage.rm7;
import defpackage.sk6;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes3.dex */
public class PatchUtils {
    public volatile boolean a;

    public static class NotAPatchFileException extends Exception {
    }

    public static class PatchFailedException extends Exception {
    }

    public static class PatchSourceNotFoundException extends Exception {
    }

    public static class PatchZipValidationException extends Exception {
    }

    private static native int applay_patch_lite(String str, String str2, String str3);

    public static boolean c(String str) throws Throwable {
        File file = new File(str);
        byte[] bArr = new byte[8];
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(io.sentry.config.a.g(file, new FileInputStream(file)));
            try {
                if (bufferedInputStream2.read(bArr, 0, 8) <= 0) {
                    jg3.a(bufferedInputStream2);
                    return false;
                }
                boolean zEqualsIgnoreCase = new String(bArr, Charset.forName("UTF-8")).equalsIgnoreCase("BSDIFF40");
                jg3.a(bufferedInputStream2);
                return zEqualsIgnoreCase;
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream2;
                jg3.a(bufferedInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void a(String str, String str2) {
        try {
            String strB = dp3.B(str2);
            if (strB == null) {
                throw new PatchSourceNotFoundException("Source APK file not found: ".concat(str2));
            }
            String strE = e(strB, str, "apk");
            try {
                String str3 = k68.e;
                js3.p(strE, "filePath");
                try {
                    new ZipFile(strE).close();
                } catch (IOException unused) {
                }
            } catch (ZipException e) {
                throw new PatchZipValidationException(dw1.n("Patched file is not a Zip file: ", strE), e);
            }
        } catch (PackageManager.NameNotFoundException e2) {
            if (!c(str)) {
                throw new NotAPatchFileException(dw1.n("Patch file header is not right client check: ", str));
            }
            throw new PatchSourceNotFoundException(dw1.n("Package is not installed: ", str2), e2);
        }
    }

    public final void b(int i, String str, String str2) {
        lw.f(null, null, i != 10);
        String strB = k68.b(i, str2);
        if (!TextUtils.isEmpty(strB)) {
            e(a77.h(str2) + strB, str, "obb");
            return;
        }
        if (!c(str)) {
            throw new NotAPatchFileException(dw1.n("Patch file header is not right: ", str));
        }
        throw new PatchSourceNotFoundException("Cannot find OBB file to patch, Package name: " + str2 + ", File type: " + i);
    }

    public final void d() {
        if (this.a) {
            return;
        }
        try {
            new sk6(2, (byte) 0).A(ApplicationLauncher.o.getApplicationContext().getApplicationContext());
            this.a = true;
        } catch (UnsatisfiedLinkError e) {
            throw new ClassNotFoundException("Cannot load patch library in this device", e);
        } catch (Throwable th) {
            throw new ClassNotFoundException("Cannot load patch library in this device", th);
        }
    }

    public final String e(String str, String str2, String str3) throws NotAPatchFileException, IOException, PatchFailedException {
        String strSubstring;
        String strN;
        d();
        StringBuilder sb = new StringBuilder();
        char c = bc2.a;
        if (str2 == null) {
            strSubstring = null;
        } else {
            int iLastIndexOf = str2.lastIndexOf(46);
            if (Math.max(str2.lastIndexOf(47), str2.lastIndexOf(92)) > iLastIndexOf) {
                iLastIndexOf = -1;
            }
            strSubstring = iLastIndexOf == -1 ? str2 : str2.substring(0, iLastIndexOf);
        }
        String strZ = bl4.z(sb, strSubstring, ".", str3);
        int iApplay_patch_lite = applay_patch_lite(str, strZ, str2);
        if (iApplay_patch_lite == 0) {
            return strZ;
        }
        if (iApplay_patch_lite == -5) {
            throw new NotAPatchFileException(dw1.n("Patch file header is not right library check: ", str2));
        }
        if (iApplay_patch_lite == -24) {
            throw new IOException(dw1.n("Failed to create patched file: ", strZ));
        }
        StringBuilder sb2 = new StringBuilder();
        switch (iApplay_patch_lite) {
            case -243:
                strN = "Error -243 (File I/O): Cannot close new file. This may be a system resource issue or a final write failure.";
                break;
            case -242:
                strN = "Error -242 (File I/O): Cannot write to new file. The disk may be full or permissions may have changed during the operation.";
                break;
            case -241:
                strN = "Error -241 (File I/O): Cannot create new file. Caused by lack of write permission, an invalid path, or a full disk.";
                break;
            default:
                switch (iApplay_patch_lite) {
                    case -176:
                        strN = "Error -176 (File I/O): Cannot close old file due to a system resource issue.";
                        break;
                    case -175:
                        strN = "Error -175 (File I/O): Cannot read the old file completely. It may have been changed during the read.";
                        break;
                    case -174:
                        strN = "Error -174 (File I/O): Cannot seek to the start of the old file.";
                        break;
                    case -173:
                        strN = "Error -173 (Memory): Cannot allocate memory for old file. This applies to the non-lite version only.";
                        break;
                    case -172:
                        strN = "Error -172 (File I/O): Cannot determine old file size.";
                        break;
                    case -171:
                        strN = "Error -171 (File I/O): Cannot open old file. It may not exist, be locked, or have incorrect permissions.";
                        break;
                    default:
                        switch (iApplay_patch_lite) {
                            case -23:
                                strN = "Error -23 (File I/O): Cannot close patch file streams due to a system resource issue.";
                                break;
                            case -22:
                                strN = "Error -22 (Compression): Error reading extra data. The extra block is likely corrupted.";
                                break;
                            case -21:
                                strN = "Error -21 (Validation): Extra data instruction exceeds new file bounds. The patch file is corrupted or mismatched.";
                                break;
                            case -20:
                                strN = "Error -20 (Compression): Error reading diff data. The diff block is likely corrupted.";
                                break;
                            case -19:
                                strN = "Error -19 (Validation): Control instruction exceeds new file bounds. The patch file does not match the old file.";
                                break;
                            case -18:
                                strN = "Error -18 (Processing): Corrupted control data or processing error.";
                                break;
                            default:
                                switch (iApplay_patch_lite) {
                                    case -16:
                                        strN = "Error -16 (Compression): Cannot initialize extra block bzip2 reader. The bzip2 data is likely corrupted.";
                                        break;
                                    case -15:
                                        strN = "Error -15 (File I/O): Cannot seek to extra block. The file is likely corrupted.";
                                        break;
                                    case -14:
                                        strN = "Error -14 (File I/O): Cannot reopen patch file for extra stream.";
                                        break;
                                    case -13:
                                        strN = "Error -13 (Compression): Cannot initialize diff block bzip2 reader. The bzip2 data is likely corrupted.";
                                        break;
                                    case -12:
                                        strN = "Error -12 (File I/O): Cannot seek to diff block. The file is likely corrupted.";
                                        break;
                                    case -11:
                                        strN = "Error -11 (File I/O): Cannot reopen patch file for diff stream.";
                                        break;
                                    case -10:
                                        strN = "Error -10 (Compression): Cannot initialize control block bzip2 reader. The bzip2 data is likely corrupted.";
                                        break;
                                    case -9:
                                        strN = "Error -9 (File I/O): Cannot seek to control block. The file is likely corrupted.";
                                        break;
                                    case -8:
                                        strN = "Error -8 (File I/O): Cannot reopen patch file for control stream. Permissions may have changed.";
                                        break;
                                    case -7:
                                        strN = "Error -7 (File I/O): Cannot close initial patch file handle due to a system resource issue.";
                                        break;
                                    case -6:
                                        strN = "Error -6 (Format): Invalid patch dimensions in header (e.g., negative sizes). The patch file is corrupted.";
                                        break;
                                    case -5:
                                        strN = "Error -5 (Format): Invalid magic number. The file is not a valid BSDIFF40 patch file or is corrupted.";
                                        break;
                                    case -4:
                                        strN = "Error -4 (File I/O): Error reading patch file header. This may be caused by a disk or network issue.";
                                        break;
                                    case ErrorDTO.CODE_REDIRECT_NOT_VALID_LOCATION_ERROR /* -3 */:
                                        strN = "Error -3 (File I/O): Patch file is too short (EOF). It is likely corrupted or incomplete.";
                                        break;
                                    case ErrorDTO.CODE_JSON_ERROR /* -2 */:
                                        strN = "Error -2 (File I/O): Cannot open patch file. The file may not exist, be locked, or have incorrect permissions.";
                                        break;
                                    case -1:
                                        strN = "Error -1 (Arguments): Invalid argument count. This is an internal error and should not occur in normal usage.";
                                        break;
                                    case 0:
                                        strN = "Success: Patch applied successfully.";
                                        break;
                                    default:
                                        strN = rm7.n(iApplay_patch_lite, "Unknown error code: ");
                                        break;
                                }
                                break;
                        }
                        break;
                }
                break;
        }
        sb2.append(strN);
        sb2.append(iApplay_patch_lite);
        sb2.append(", patch file: ");
        sb2.append(str2);
        throw new PatchFailedException(sb2.toString());
    }

    public final void f(String str, String str2, String str3) {
        String str4;
        try {
            String[] strArr = ApplicationLauncher.o.getApplicationContext().getPackageManager().getApplicationInfo(dp3.y(str3), 128).splitPublicSourceDirs;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    str4 = null;
                    break;
                }
                str4 = strArr[i];
                if (str4.contains(str2)) {
                    break;
                } else {
                    i++;
                }
            }
            if (TextUtils.isEmpty(str4)) {
                throw new IOException("Cannot find split path");
            }
            String strE = e(str4, str, "apk");
            try {
                String str5 = k68.e;
                js3.p(strE, "filePath");
                try {
                    new ZipFile(strE).close();
                } catch (IOException unused) {
                }
            } catch (ZipException e) {
                throw new PatchZipValidationException(dw1.n("Patched file is not a Zip file: ", strE), e);
            }
        } catch (PackageManager.NameNotFoundException e2) {
            if (!c(str)) {
                throw new NotAPatchFileException(dw1.n("Patch file header is not right: ", str));
            }
            throw new PatchSourceNotFoundException(dw1.n("Package is not installed: ", str3), e2);
        }
    }
}
