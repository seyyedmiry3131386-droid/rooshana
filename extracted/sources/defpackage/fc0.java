package defpackage;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.EncodeStrategy;
import io.sentry.config.a;
import j$.util.Objects;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class fc0 implements m67 {
    public static final pv5 b = pv5.a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");
    public static final pv5 c = new pv5("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, pv5.e);
    public final dr3 a;

    public fc0(dr3 dr3Var) {
        this.a = dr3Var;
    }

    @Override // defpackage.m67
    public final EncodeStrategy q(sv5 sv5Var) {
        return EncodeStrategy.b;
    }

    @Override // defpackage.r12
    public final boolean s(Object obj, File file, sv5 sv5Var) {
        boolean z;
        Bitmap bitmap = (Bitmap) ((g67) obj).get();
        pv5 pv5Var = c;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) sv5Var.c(pv5Var);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i = md4.a;
        SystemClock.elapsedRealtimeNanos();
        int iIntValue = ((Integer) sv5Var.c(b)).intValue();
        OutputStream nh0Var = null;
        nh0Var = null;
        try {
            FileOutputStream fileOutputStreamK = a.k(new FileOutputStream(file), file);
            dr3 dr3Var = this.a;
            nh0Var = fileOutputStreamK;
            if (dr3Var != null) {
                nh0Var = new nh0(fileOutputStreamK, dr3Var);
            }
            bitmap.compress(compressFormat, iIntValue, nh0Var);
            nh0Var.close();
            try {
                nh0Var.close();
            } catch (IOException unused) {
            }
            z = true;
        } catch (IOException unused2) {
            if (nh0Var != null) {
                try {
                    nh0Var.close();
                } catch (IOException unused3) {
                }
            }
            z = false;
        } catch (Throwable th) {
            if (nh0Var != null) {
                try {
                    nh0Var.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
        if (Log.isLoggable("BitmapEncoder", 2)) {
            Objects.toString(compressFormat);
            i29.c(bitmap);
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(sv5Var.c(pv5Var));
            bitmap.hasAlpha();
        }
        return z;
    }
}
