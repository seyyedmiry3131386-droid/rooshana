package defpackage;

import android.view.Choreographer;
import androidx.compose.ui.platform.h;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ni implements Choreographer.FrameCallback, Runnable {
    public final /* synthetic */ h a;

    public ni(h hVar) {
        this.a = hVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.a.d.removeCallbacks(this);
        h.H0(this.a);
        h hVar = this.a;
        synchronized (hVar.e) {
            if (hVar.j) {
                hVar.j = false;
                ArrayList arrayList = hVar.g;
                hVar.g = hVar.h;
                hVar.h = arrayList;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((Choreographer.FrameCallback) arrayList.get(i)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        h.H0(this.a);
        h hVar = this.a;
        synchronized (hVar.e) {
            if (hVar.g.isEmpty()) {
                hVar.c.removeFrameCallback(this);
                hVar.j = false;
            }
        }
    }
}
