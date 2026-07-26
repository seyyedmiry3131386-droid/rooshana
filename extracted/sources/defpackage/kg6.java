package defpackage;

import android.view.AttachedSurfaceControl;
import android.view.SurfaceControl;
import android.view.SurfaceView;
import android.window.SurfaceSyncGroup;

/* JADX INFO: loaded from: classes.dex */
public final class kg6 {
    public SurfaceSyncGroup a;

    public static /* synthetic */ void a(kg6 kg6Var, SurfaceView surfaceView, u03 u03Var) {
        kg6Var.getClass();
        AttachedSurfaceControl rootSurfaceControl = surfaceView.getRootSurfaceControl();
        if (rootSurfaceControl == null) {
            return;
        }
        SurfaceSyncGroup surfaceSyncGroup = new SurfaceSyncGroup("exo-sync-b-334901521");
        kg6Var.a = surfaceSyncGroup;
        vy2.s(surfaceSyncGroup.add(rootSurfaceControl, new ad(2)));
        u03Var.run();
        rootSurfaceControl.applyTransactionOnDraw(new SurfaceControl.Transaction());
    }

    public final void b() {
        SurfaceSyncGroup surfaceSyncGroup = this.a;
        if (surfaceSyncGroup != null) {
            surfaceSyncGroup.markSyncReady();
            this.a = null;
        }
    }
}
