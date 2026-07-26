package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.view.View;
import io.sentry.android.core.t0;
import io.sentry.config.a;
import java.io.Closeable;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class j27 {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static Thread c;
    public static final /* synthetic */ int d = 0;

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean b(File file, Resources resources, int i) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i);
            try {
                boolean zC = c(file, inputStreamOpenRawResource);
                a(inputStreamOpenRawResource);
                return zC;
            } catch (Throwable th) {
                th = th;
                a(inputStreamOpenRawResource);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    public static boolean c(File file, InputStream inputStream) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStreamJ = null;
        try {
            try {
                fileOutputStreamJ = a.j(file, new FileOutputStream(file, false), false);
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i == -1) {
                        a(fileOutputStreamJ);
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                        return true;
                    }
                    fileOutputStreamJ.write(bArr, 0, i);
                }
            } catch (IOException e) {
                t0.d("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
                a(fileOutputStreamJ);
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                return false;
            }
        } catch (Throwable th) {
            a(fileOutputStreamJ);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            throw th;
        }
    }

    public static final g64 d(View view) {
        js3.p(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(gr6.view_tree_lifecycle_owner);
            g64 g64Var = tag instanceof g64 ? (g64) tag : null;
            if (g64Var != null) {
                return g64Var;
            }
            Object objJ = h27.j(view);
            view = objJ instanceof View ? (View) objJ : null;
        }
        return null;
    }

    public static File h(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static MappedByteBuffer j(Context context, Uri uri) {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        try {
            parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (parcelFileDescriptorOpenFileDescriptor == null) {
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                parcelFileDescriptorOpenFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileDescriptor fileDescriptor = parcelFileDescriptorOpenFileDescriptor.getFileDescriptor();
            FileInputStream fileInputStreamH = a.h(new FileInputStream(fileDescriptor), fileDescriptor);
            try {
                FileChannel channel = fileInputStreamH.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStreamH.close();
                parcelFileDescriptorOpenFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static final void k(View view, g64 g64Var) {
        js3.p(view, "<this>");
        view.setTag(gr6.view_tree_lifecycle_owner, g64Var);
    }

    public static final long l(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static xk9 m(gk9 gk9Var, o77 o77Var, ArrayList arrayList, boolean z) {
        xk9 xk9VarB;
        c67.p(1, "reduce", arrayList);
        c67.q(2, "reduce", arrayList);
        xk9 xk9VarD = ((rn6) o77Var.b).D(o77Var, (xk9) arrayList.get(0));
        if (!(xk9VarD instanceof pk9)) {
            throw new IllegalArgumentException("Callback should be a method");
        }
        if (arrayList.size() == 2) {
            xk9VarB = ((rn6) o77Var.b).D(o77Var, (xk9) arrayList.get(1));
            if (xk9VarB instanceof mk9) {
                throw new IllegalArgumentException("Failed to parse initial value");
            }
        } else {
            if (gk9Var.o() == 0) {
                throw new IllegalStateException("Empty array with no initial value error");
            }
            xk9VarB = null;
        }
        pk9 pk9Var = (pk9) xk9VarD;
        int iO = gk9Var.o();
        int i = z ? 0 : iO - 1;
        int i2 = z ? iO - 1 : 0;
        int i3 = true == z ? 1 : -1;
        if (xk9VarB == null) {
            xk9VarB = gk9Var.p(i);
            i += i3;
        }
        while ((i2 - i) * i3 >= 0) {
            if (gk9Var.r(i)) {
                xk9VarB = pk9Var.b(o77Var, Arrays.asList(xk9VarB, gk9Var.p(i), new nk9(Double.valueOf(i)), gk9Var));
                if (xk9VarB instanceof mk9) {
                    throw new IllegalStateException("Reduce operation failed");
                }
                i += i3;
            } else {
                i += i3;
            }
        }
        return xk9VarB;
    }

    public static gk9 n(gk9 gk9Var, o77 o77Var, vk9 vk9Var, Boolean bool, Boolean bool2) {
        gk9 gk9Var2 = new gk9();
        Iterator itN = gk9Var.n();
        while (itN.hasNext()) {
            int iIntValue = ((Integer) itN.next()).intValue();
            if (gk9Var.r(iIntValue)) {
                xk9 xk9VarB = vk9Var.b(o77Var, Arrays.asList(gk9Var.p(iIntValue), new nk9(Double.valueOf(iIntValue)), gk9Var));
                if (xk9VarB.c().equals(bool)) {
                    break;
                }
                if (bool2 == null || xk9VarB.c().equals(bool2)) {
                    gk9Var2.q(iIntValue, xk9VarB);
                }
            }
        }
        return gk9Var2;
    }

    public abstract Method e(Class cls, Field field);

    public abstract Constructor f(Class cls);

    public abstract String[] g(Class cls);

    public abstract boolean i(Class cls);
}
