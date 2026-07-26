package defpackage;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public final class cp5 extends tt9 {
    public IconCompat c;
    public IconCompat d;
    public boolean e;

    @Override // defpackage.tt9
    public final void f(vp7 vp7Var) {
        Bitmap bitmapA;
        Notification.Builder builder = (Notification.Builder) vp7Var.c;
        Context context = (Context) vp7Var.b;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(builder).setBigContentTitle(null);
        IconCompat iconCompat = this.c;
        if (iconCompat != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                bp5.a(bigContentTitle, iconCompat.f(context));
            } else if (iconCompat.d() == 1) {
                IconCompat iconCompat2 = this.c;
                int i = iconCompat2.a;
                if (i == -1) {
                    Object obj = iconCompat2.b;
                    bitmapA = obj instanceof Bitmap ? (Bitmap) obj : null;
                } else if (i == 1) {
                    bitmapA = (Bitmap) iconCompat2.b;
                } else {
                    if (i != 5) {
                        throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                    }
                    bitmapA = IconCompat.a((Bitmap) iconCompat2.b, true);
                }
                bigContentTitle = bigContentTitle.bigPicture(bitmapA);
            }
        }
        if (this.e) {
            IconCompat iconCompat3 = this.d;
            if (iconCompat3 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                ap5.a(bigContentTitle, iconCompat3.f(context));
            }
        }
        if (Build.VERSION.SDK_INT >= 31) {
            bp5.c(bigContentTitle, false);
            bp5.b(bigContentTitle, null);
        }
    }

    @Override // defpackage.tt9
    public final String i() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
