package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import ir.myket.core.utils.GraphicUtils$Dimension;

/* JADX INFO: loaded from: classes3.dex */
public final class dv2 {
    public final Context a;

    public dv2(Context context) {
        this.a = context;
    }

    public final float a(float f) {
        return (this.a.getResources().getDisplayMetrics().densityDpi / 160.0f) * f;
    }

    public final Bitmap b(Drawable drawable) {
        Bitmap bitmap;
        if (drawable != null) {
            try {
                int iA = drawable.getBounds().right <= 0 ? (int) a(64.0f) : drawable.getBounds().right;
                int iA2 = drawable.getBounds().bottom <= 0 ? (int) a(64.0f) : drawable.getBounds().bottom;
                if (drawable instanceof BitmapDrawable) {
                    bitmap = ((BitmapDrawable) drawable).getBitmap();
                    if (bitmap == null) {
                        return null;
                    }
                } else {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    drawable.draw(canvas);
                    bitmap = bitmapCreateBitmap;
                }
                return Bitmap.createScaledBitmap(bitmap, iA, iA2, false);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final int c() {
        return this.a.getResources().getConfiguration().orientation;
    }

    public final GraphicUtils$Dimension d() {
        Context context = this.a;
        return new GraphicUtils$Dimension(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels);
    }

    public final float e() {
        return r0.widthPixels / this.a.getResources().getDisplayMetrics().density;
    }
}
