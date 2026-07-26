package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import io.sentry.android.core.t0;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class jg4 implements pc0 {
    public static final Bitmap.Config f = Bitmap.Config.ARGB_8888;
    public final jy7 a;
    public final Set b;
    public final sl3 c;
    public final long d;
    public long e;

    public jg4(long j) {
        jy7 jy7Var = new jy7();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(hashSet);
        this.d = j;
        this.a = jy7Var;
        this.b = setUnmodifiableSet;
        this.c = new sl3(3);
    }

    @Override // defpackage.pc0
    public final Bitmap a(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapB = b(i, i2, config);
        if (bitmapB != null) {
            return bitmapB;
        }
        if (config == null) {
            config = f;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    public final synchronized Bitmap b(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapB;
        try {
            if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
            bitmapB = this.a.b(i, i2, config != null ? config : f);
            if (bitmapB != null) {
                long j = this.e;
                this.a.getClass();
                this.e = j - ((long) i29.c(bitmapB));
                this.c.getClass();
                bitmapB.setHasAlpha(true);
                bitmapB.setPremultiplied(true);
            } else if (Log.isLoggable("LruBitmapPool", 3)) {
                this.a.getClass();
                jy7.c(i29.d(config) * i * i2, config);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.a.getClass();
                jy7.c(i29.d(config) * i * i2, config);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Objects.toString(this.a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return bitmapB;
    }

    @Override // defpackage.pc0
    public final synchronized void c(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable()) {
                this.a.getClass();
                if (i29.c(bitmap) <= this.d && this.b.contains(bitmap.getConfig())) {
                    this.a.getClass();
                    int iC = i29.c(bitmap);
                    this.a.e(bitmap);
                    this.c.getClass();
                    this.e += (long) iC;
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        this.a.getClass();
                        jy7.c(i29.c(bitmap), bitmap.getConfig());
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Objects.toString(this.a);
                    }
                    e(this.d);
                    return;
                }
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                this.a.getClass();
                jy7.c(i29.c(bitmap), bitmap.getConfig());
                bitmap.isMutable();
                this.b.contains(bitmap.getConfig());
            }
            bitmap.recycle();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.pc0
    public final Bitmap d(int i, int i2, Bitmap.Config config) {
        Bitmap bitmapB = b(i, i2, config);
        if (bitmapB != null) {
            bitmapB.eraseColor(0);
            return bitmapB;
        }
        if (config == null) {
            config = f;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    public final synchronized void e(long j) {
        while (this.e > j) {
            try {
                jy7 jy7Var = this.a;
                Bitmap bitmap = (Bitmap) jy7Var.b.C();
                if (bitmap != null) {
                    jy7Var.a(Integer.valueOf(i29.c(bitmap)), bitmap);
                }
                if (bitmap == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        t0.m("LruBitmapPool", "Size mismatch, resetting");
                        Objects.toString(this.a);
                    }
                    this.e = 0L;
                    return;
                }
                this.c.getClass();
                long j2 = this.e;
                this.a.getClass();
                this.e = j2 - ((long) i29.c(bitmap));
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    this.a.getClass();
                    jy7.c(i29.c(bitmap), bitmap.getConfig());
                }
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    Objects.toString(this.a);
                }
                bitmap.recycle();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.pc0
    public final void j(int i) {
        if (i >= 40 || i >= 20) {
            l();
        } else if (i >= 20 || i == 15) {
            e(this.d / 2);
        }
    }

    @Override // defpackage.pc0
    public final void l() {
        e(0L);
    }
}
