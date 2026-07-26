package defpackage;

import android.graphics.PathMeasure;

/* JADX INFO: loaded from: classes.dex */
public final class fh {
    public final PathMeasure a;

    public fh(PathMeasure pathMeasure) {
        this.a = pathMeasure;
    }

    public final boolean a(float f, float f2, eh ehVar) {
        if (!o40.O(ehVar)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        return this.a.getSegment(f, f2, ehVar.a, true);
    }
}
