package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.google.accompanist.drawablepainter.DrawablePainter;
import ir.mservices.market.pika.common.model.ByteArrayResult;

/* JADX INFO: loaded from: classes.dex */
public final class ek implements Drawable.Callback {
    public final /* synthetic */ int a;
    public Object b;

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.a) {
            case 0:
                ((hk) this.b).invalidateSelf();
                break;
            case 1:
                break;
            default:
                js3.p(drawable, ByteArrayResult.AppInfo.NAME_SERIALISED_NAME);
                DrawablePainter drawablePainter = (DrawablePainter) this.b;
                wb5 wb5Var = drawablePainter.g;
                ((s08) wb5Var).setValue(Integer.valueOf(((Number) ((s08) wb5Var).getValue()).intValue() + 1));
                Drawable drawable2 = drawablePainter.f;
                Object obj = rv1.a;
                ((s08) drawablePainter.h).setValue(new ey7((drawable2.getIntrinsicWidth() < 0 || drawable2.getIntrinsicHeight() < 0) ? 9205357640488583168L : uy6.a(drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight())));
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [c24, java.lang.Object] */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        switch (this.a) {
            case 0:
                ((hk) this.b).scheduleSelf(runnable, j);
                break;
            case 1:
                Drawable.Callback callback = (Drawable.Callback) this.b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j);
                }
                break;
            default:
                js3.p(drawable, ByteArrayResult.AppInfo.NAME_SERIALISED_NAME);
                js3.p(runnable, "what");
                ((Handler) rv1.a.getValue()).postAtTime(runnable, j);
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [c24, java.lang.Object] */
    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.a) {
            case 0:
                ((hk) this.b).unscheduleSelf(runnable);
                break;
            case 1:
                Drawable.Callback callback = (Drawable.Callback) this.b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                }
                break;
            default:
                js3.p(drawable, ByteArrayResult.AppInfo.NAME_SERIALISED_NAME);
                js3.p(runnable, "what");
                ((Handler) rv1.a.getValue()).removeCallbacks(runnable);
                break;
        }
    }

    public /* synthetic */ ek(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(Drawable drawable) {
    }
}
