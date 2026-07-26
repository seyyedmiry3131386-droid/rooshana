package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.bumptech.glide.load.PreferredColorSpace;
import j$.util.DesugarCollections;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class yt1 {
    public static final pv5 f = pv5.a(DecodeFormat.c, "com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat");
    public static final pv5 g = new pv5("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace", null, pv5.e);
    public static final pv5 h;
    public static final pv5 i;
    public static final Set j;
    public static final gv k;
    public static final ArrayDeque l;
    public final pc0 a;
    public final DisplayMetrics b;
    public final dr3 c;
    public final ArrayList d;
    public final cx2 e = cx2.a();

    static {
        wt1 wt1Var = wt1.b;
        Boolean bool = Boolean.FALSE;
        h = pv5.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize");
        i = pv5.a(bool, "com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode");
        j = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
        k = new gv(15);
        DesugarCollections.unmodifiableSet(EnumSet.of(ImageHeaderParser$ImageType.JPEG, ImageHeaderParser$ImageType.PNG_A, ImageHeaderParser$ImageType.PNG));
        char[] cArr = i29.a;
        l = new ArrayDeque(0);
    }

    public yt1(ArrayList arrayList, DisplayMetrics displayMetrics, pc0 pc0Var, dr3 dr3Var) {
        this.d = arrayList;
        ok4.p(displayMetrics, "Argument must not be null");
        this.b = displayMetrics;
        ok4.p(pc0Var, "Argument must not be null");
        this.a = pc0Var;
        ok4.p(dr3Var, "Argument must not be null");
        this.c = dr3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:?, code lost:
    
        throw r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Bitmap c(defpackage.pa2 r8, android.graphics.BitmapFactory.Options r9, defpackage.xt1 r10, defpackage.pc0 r11) {
        /*
            boolean r0 = r9.inJustDecodeBounds
            if (r0 != 0) goto L20
            r10.g()
            int r0 = r8.a
            switch(r0) {
                case 2: goto L20;
                case 3: goto Ld;
                default: goto Lc;
            }
        Lc:
            goto L20
        Ld:
            java.lang.Object r0 = r8.c
            pt2 r0 = (defpackage.pt2) r0
            java.lang.Object r0 = r0.b
            com.bumptech.glide.load.resource.bitmap.a r0 = (com.bumptech.glide.load.resource.bitmap.a) r0
            monitor-enter(r0)
            byte[] r1 = r0.a     // Catch: java.lang.Throwable -> L1d
            int r1 = r1.length     // Catch: java.lang.Throwable -> L1d
            r0.c = r1     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r0)
            goto L20
        L1d:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r8
        L20:
            int r0 = r9.outWidth
            int r1 = r9.outHeight
            java.lang.String r2 = r9.outMimeType
            java.util.concurrent.locks.Lock r3 = defpackage.qq8.d
            r3.lock()
            android.graphics.Bitmap r8 = r8.o(r9)     // Catch: java.lang.IllegalArgumentException -> L33 java.lang.Throwable -> L6e
            r3.unlock()
            return r8
        L33:
            r3 = move-exception
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Throwable -> L6e
            java.lang.String r5 = "Exception decoding bitmap, outWidth: "
            java.lang.String r6 = ", outHeight: "
            java.lang.String r7 = ", outMimeType: "
            java.lang.StringBuilder r0 = defpackage.bl4.B(r0, r1, r5, r6, r7)     // Catch: java.lang.Throwable -> L6e
            r0.append(r2)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r1 = ", inBitmap: "
            r0.append(r1)     // Catch: java.lang.Throwable -> L6e
            android.graphics.Bitmap r1 = r9.inBitmap     // Catch: java.lang.Throwable -> L6e
            java.lang.String r1 = d(r1)     // Catch: java.lang.Throwable -> L6e
            r0.append(r1)     // Catch: java.lang.Throwable -> L6e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L6e
            r4.<init>(r0, r3)     // Catch: java.lang.Throwable -> L6e
            android.graphics.Bitmap r0 = r9.inBitmap     // Catch: java.lang.Throwable -> L6e
            if (r0 == 0) goto L6d
            r11.c(r0)     // Catch: java.io.IOException -> L6c java.lang.Throwable -> L6e
            r0 = 0
            r9.inBitmap = r0     // Catch: java.io.IOException -> L6c java.lang.Throwable -> L6e
            android.graphics.Bitmap r8 = c(r8, r9, r10, r11)     // Catch: java.io.IOException -> L6c java.lang.Throwable -> L6e
            java.util.concurrent.locks.Lock r9 = defpackage.qq8.d
            r9.unlock()
            return r8
        L6c:
            throw r4     // Catch: java.lang.Throwable -> L6e
        L6d:
            throw r4     // Catch: java.lang.Throwable -> L6e
        L6e:
            r8 = move-exception
            java.util.concurrent.locks.Lock r9 = defpackage.qq8.d
            r9.unlock()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yt1.c(pa2, android.graphics.BitmapFactory$Options, xt1, pc0):android.graphics.Bitmap");
    }

    public static String d(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (" (" + bitmap.getAllocationByteCount() + ")");
    }

    public static void e(BitmapFactory.Options options) {
        f(options);
        ArrayDeque arrayDeque = l;
        synchronized (arrayDeque) {
            arrayDeque.offer(options);
        }
    }

    public static void f(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public final qc0 a(pa2 pa2Var, int i2, int i3, sv5 sv5Var, xt1 xt1Var) {
        BitmapFactory.Options options;
        BitmapFactory.Options options2;
        byte[] bArr = (byte[]) this.c.d(65536, byte[].class);
        synchronized (yt1.class) {
            ArrayDeque arrayDeque = l;
            synchronized (arrayDeque) {
                options = (BitmapFactory.Options) arrayDeque.poll();
            }
            if (options == null) {
                options = new BitmapFactory.Options();
                f(options);
            }
            options2 = options;
        }
        options2.inTempStorage = bArr;
        DecodeFormat decodeFormat = (DecodeFormat) sv5Var.c(f);
        PreferredColorSpace preferredColorSpace = (PreferredColorSpace) sv5Var.c(g);
        wt1 wt1Var = (wt1) sv5Var.c(wt1.g);
        boolean zBooleanValue = ((Boolean) sv5Var.c(h)).booleanValue();
        pv5 pv5Var = i;
        try {
            return qc0.b(this.a, b(pa2Var, options2, wt1Var, decodeFormat, preferredColorSpace, sv5Var.c(pv5Var) != null && ((Boolean) sv5Var.c(pv5Var)).booleanValue(), i2, i3, zBooleanValue, xt1Var));
        } finally {
            e(options2);
            this.c.i(bArr);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02f6  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.Bitmap b(defpackage.pa2 r29, android.graphics.BitmapFactory.Options r30, defpackage.wt1 r31, com.bumptech.glide.load.DecodeFormat r32, com.bumptech.glide.load.PreferredColorSpace r33, boolean r34, int r35, int r36, boolean r37, defpackage.xt1 r38) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1172
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yt1.b(pa2, android.graphics.BitmapFactory$Options, wt1, com.bumptech.glide.load.DecodeFormat, com.bumptech.glide.load.PreferredColorSpace, boolean, int, int, boolean, xt1):android.graphics.Bitmap");
    }
}
