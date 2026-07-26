package defpackage;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes3.dex */
public final class av0 extends aj3 {
    public final Integer e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av0(ImageView imageView, Integer num) {
        super(imageView);
        js3.p(imageView, "view");
        this.e = num;
    }

    @Override // defpackage.aj3
    public final void l(Object obj) {
        Drawable drawable = (Drawable) obj;
        if (drawable != null) {
            Integer num = this.e;
            if (num == null) {
                drawable = null;
            }
            if (drawable != null) {
                js3.m(num);
                drawable.setColorFilter(new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.MULTIPLY));
                this.a.setImageDrawable(drawable);
            }
        }
    }
}
