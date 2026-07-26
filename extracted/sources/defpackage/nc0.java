package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public final class nc0 extends aj3 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nc0(ImageView imageView, int i) {
        super(imageView);
        this.e = i;
    }

    @Override // defpackage.aj3
    public final void l(Object obj) {
        switch (this.e) {
            case 0:
                this.a.setImageBitmap((Bitmap) obj);
                break;
            default:
                this.a.setImageDrawable((Drawable) obj);
                break;
        }
    }
}
