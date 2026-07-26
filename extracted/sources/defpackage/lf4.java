package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import com.airbnb.lottie.parser.moshi.a;
import com.airbnb.lottie.parser.moshi.b;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes.dex */
public abstract class lf4 {
    public static final HashMap a = new HashMap();
    public static final HashSet b = new HashSet();
    public static final byte[] c = {80, 75, 3, 4};
    public static final byte[] d = {31, -117, 8};

    public static cg4 a(final String str, Callable callable, Runnable runnable) {
        gf4 gf4VarA = str == null ? null : hf4.b.a(str);
        cg4 cg4Var = gf4VarA != null ? new cg4(gf4VarA) : null;
        HashMap map = a;
        if (str != null && map.containsKey(str)) {
            cg4Var = (cg4) map.get(str);
        }
        if (cg4Var != null) {
            if (runnable != null) {
                runnable.run();
            }
            return cg4Var;
        }
        cg4 cg4Var2 = new cg4(callable, false);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            final int i = 0;
            cg4Var2.b(new zf4() { // from class: jf4
                @Override // defpackage.zf4
                public final void onResult(Object obj) {
                    switch (i) {
                        case 0:
                            HashMap map2 = lf4.a;
                            map2.remove(str);
                            atomicBoolean.set(true);
                            if (map2.size() == 0) {
                                lf4.j();
                            }
                            break;
                        default:
                            HashMap map3 = lf4.a;
                            map3.remove(str);
                            atomicBoolean.set(true);
                            if (map3.size() == 0) {
                                lf4.j();
                            }
                            break;
                    }
                }
            });
            final int i2 = 1;
            cg4Var2.a(new zf4() { // from class: jf4
                @Override // defpackage.zf4
                public final void onResult(Object obj) {
                    switch (i2) {
                        case 0:
                            HashMap map2 = lf4.a;
                            map2.remove(str);
                            atomicBoolean.set(true);
                            if (map2.size() == 0) {
                                lf4.j();
                            }
                            break;
                        default:
                            HashMap map3 = lf4.a;
                            map3.remove(str);
                            atomicBoolean.set(true);
                            if (map3.size() == 0) {
                                lf4.j();
                            }
                            break;
                    }
                }
            });
            if (!atomicBoolean.get()) {
                map.put(str, cg4Var2);
                if (map.size() == 1) {
                    j();
                }
            }
        }
        return cg4Var2;
    }

    public static bg4 b(Context context, String str, String str2) {
        gf4 gf4VarA = str2 == null ? null : hf4.b.a(str2);
        if (gf4VarA != null) {
            return new bg4(gf4VarA);
        }
        try {
            return c(context, context.getAssets().open(str), str2);
        } catch (IOException e) {
            return new bg4(e);
        }
    }

    public static bg4 c(Context context, InputStream inputStream, String str) {
        gf4 gf4VarA = str == null ? null : hf4.b.a(str);
        if (gf4VarA != null) {
            return new bg4(gf4VarA);
        }
        try {
            tv6 tv6VarJ = rf0.j(rf0.L(inputStream));
            int i = 1;
            if (i(tv6VarJ, c).booleanValue()) {
                return g(context, new ZipInputStream(new fh0(tv6VarJ, i)), str);
            }
            if (i(tv6VarJ, d).booleanValue()) {
                return d(new GZIPInputStream(new fh0(tv6VarJ, i)), str);
            }
            String[] strArr = a.e;
            return e(new b(tv6VarJ), str, true);
        } catch (IOException e) {
            return new bg4(e);
        }
    }

    public static bg4 d(InputStream inputStream, String str) {
        tv6 tv6VarJ = rf0.j(rf0.L(inputStream));
        String[] strArr = a.e;
        return e(new b(tv6VarJ), str, true);
    }

    public static bg4 e(b bVar, String str, boolean z) {
        gf4 gf4VarA;
        try {
            if (str == null) {
                gf4VarA = null;
            } else {
                try {
                    gf4VarA = hf4.b.a(str);
                } catch (Exception e) {
                    bg4 bg4Var = new bg4(e);
                    if (z) {
                        n29.b(bVar);
                    }
                    return bg4Var;
                }
            }
            if (gf4VarA != null) {
                bg4 bg4Var2 = new bg4(gf4VarA);
                if (z) {
                    n29.b(bVar);
                }
                return bg4Var2;
            }
            gf4 gf4VarA2 = mf4.a(bVar);
            if (str != null) {
                hf4.b.a.put(str, gf4VarA2);
            }
            bg4 bg4Var3 = new bg4(gf4VarA2);
            if (z) {
                n29.b(bVar);
            }
            return bg4Var3;
        } catch (Throwable th) {
            if (z) {
                n29.b(bVar);
            }
            throw th;
        }
    }

    public static bg4 f(int i, Context context, String str) {
        gf4 gf4VarA = str == null ? null : hf4.b.a(str);
        if (gf4VarA != null) {
            return new bg4(gf4VarA);
        }
        try {
            tv6 tv6VarJ = rf0.j(rf0.L(context.getResources().openRawResource(i)));
            int i2 = 1;
            if (i(tv6VarJ, c).booleanValue()) {
                return g(context, new ZipInputStream(new fh0(tv6VarJ, i2)), str);
            }
            if (!i(tv6VarJ, d).booleanValue()) {
                String[] strArr = a.e;
                return e(new b(tv6VarJ), str, true);
            }
            try {
                return d(new GZIPInputStream(new fh0(tv6VarJ, i2)), str);
            } catch (IOException e) {
                return new bg4(e);
            }
        } catch (Resources.NotFoundException e2) {
            return new bg4(e2);
        }
    }

    public static bg4 g(Context context, ZipInputStream zipInputStream, String str) {
        try {
            return h(context, zipInputStream, str);
        } finally {
            n29.b(zipInputStream);
        }
    }

    public static bg4 h(Context context, ZipInputStream zipInputStream, String str) {
        gf4 gf4VarA;
        yf4 yf4Var;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        if (str == null) {
            gf4VarA = null;
        } else {
            try {
                gf4VarA = hf4.b.a(str);
            } catch (IOException e) {
                return new bg4(e);
            }
        }
        if (gf4VarA != null) {
            return new bg4(gf4VarA);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        gf4 gf4Var = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                tv6 tv6VarJ = rf0.j(rf0.L(zipInputStream));
                String[] strArr = a.e;
                gf4Var = e(new b(tv6VarJ), null, false).a;
            } else if (name.contains(".png") || name.contains(".webp") || name.contains(".jpg") || name.contains(".jpeg")) {
                String[] strArrSplit = name.split("/");
                map.put(strArrSplit[strArrSplit.length - 1], BitmapFactory.decodeStream(zipInputStream));
            } else if (name.contains(".ttf") || name.contains(".otf")) {
                String[] strArrSplit2 = name.split("/");
                String str2 = strArrSplit2[strArrSplit2.length - 1];
                String str3 = str2.split("\\.")[0];
                if (context == null) {
                    return new bg4(new IllegalStateException("Unable to extract font " + str3 + " please pass a non-null Context parameter"));
                }
                File file = new File(context.getCacheDir(), str2);
                try {
                    FileOutputStream fileOutputStreamK = io.sentry.config.a.k(new FileOutputStream(file), file);
                    try {
                        FileOutputStream fileOutputStreamK2 = io.sentry.config.a.k(new FileOutputStream(file), file);
                        try {
                            byte[] bArr = new byte[4096];
                            while (true) {
                                int i = zipInputStream.read(bArr);
                                if (i == -1) {
                                    break;
                                }
                                fileOutputStreamK2.write(bArr, 0, i);
                            }
                            fileOutputStreamK2.flush();
                            fileOutputStreamK2.close();
                            fileOutputStreamK.close();
                        } catch (Throwable th) {
                            try {
                                fileOutputStreamK2.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            fileOutputStreamK.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    qd4.c("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th5);
                }
                Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                if (!file.delete()) {
                    qd4.b("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                }
                map2.put(str3, typefaceCreateFromFile);
            } else {
                zipInputStream.closeEntry();
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (gf4Var == null) {
            return new bg4(new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : map.entrySet()) {
            String str4 = (String) entry.getKey();
            Iterator it = ((HashMap) gf4Var.c()).values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    yf4Var = null;
                    break;
                }
                yf4Var = (yf4) it.next();
                if (yf4Var.d.equals(str4)) {
                    break;
                }
            }
            if (yf4Var != null) {
                yf4Var.f = n29.d((Bitmap) entry.getValue(), yf4Var.a, yf4Var.b);
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            boolean z = false;
            for (jh2 jh2Var : gf4Var.f.values()) {
                if (jh2Var.a.equals(entry2.getKey())) {
                    jh2Var.d = (Typeface) entry2.getValue();
                    z = true;
                }
            }
            if (!z) {
                qd4.b("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (map.isEmpty()) {
            Iterator it2 = ((HashMap) gf4Var.c()).entrySet().iterator();
            while (it2.hasNext()) {
                yf4 yf4Var2 = (yf4) ((Map.Entry) it2.next()).getValue();
                if (yf4Var2 == null) {
                    return null;
                }
                String str5 = yf4Var2.d;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (str5.startsWith("data:") && str5.indexOf("base64,") > 0) {
                    try {
                        byte[] bArrDecode = Base64.decode(str5.substring(str5.indexOf(44) + 1), 0);
                        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                        if (bitmapDecodeByteArray != null) {
                            yf4Var2.f = n29.d(bitmapDecodeByteArray, yf4Var2.a, yf4Var2.b);
                        }
                    } catch (IllegalArgumentException e2) {
                        qd4.c("data URL did not have correct base64 format.", e2);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            hf4.b.a.put(str, gf4Var);
        }
        return new bg4(gf4Var);
    }

    public static Boolean i(tv6 tv6Var, byte[] bArr) {
        try {
            tv6 tv6VarPeek = tv6Var.peek();
            for (byte b2 : bArr) {
                if (tv6VarPeek.readByte() != b2) {
                    return Boolean.FALSE;
                }
            }
            tv6VarPeek.close();
            return Boolean.TRUE;
        } catch (Exception unused) {
            qd4.a.getClass();
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused2) {
            return Boolean.FALSE;
        }
    }

    public static void j() {
        ArrayList arrayList = new ArrayList(b);
        if (arrayList.size() > 0) {
            throw rm7.l(0, arrayList);
        }
    }

    public static String k(Context context, int i) {
        return rm7.o(i, (context.getResources().getConfiguration().uiMode & 48) == 32 ? "_night_" : "_day_", new StringBuilder("rawRes"));
    }
}
