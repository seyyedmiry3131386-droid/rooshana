package io.sentry.android.replay.screenshot;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c b;

    public /* synthetic */ a(c cVar, int i) {
        this.a = i;
        this.b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c.d(this.b);
                return;
            default:
                c cVar = this.b;
                Bitmap bitmap = cVar.e;
                if (bitmap != null) {
                    synchronized (bitmap) {
                        if (!bitmap.isRecycled()) {
                            bitmap.recycle();
                        }
                        break;
                    }
                }
                cVar.m.release();
                cVar.l.release();
                return;
        }
    }
}
