package defpackage;

import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class wj {
    public final ArrayList a;
    public final dr3 b;

    public wj(ArrayList arrayList, dr3 dr3Var) {
        this.a = arrayList;
        this.b = dr3Var;
    }

    public static uj a(ImageDecoder.Source source, int i, int i2, sv5 sv5Var) throws IOException {
        Drawable drawableDecodeDrawable = ImageDecoder.decodeDrawable(source, new mg1(i, i2, sv5Var));
        if (drawableDecodeDrawable instanceof AnimatedImageDrawable) {
            return new uj((AnimatedImageDrawable) drawableDecodeDrawable);
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + drawableDecodeDrawable);
    }
}
