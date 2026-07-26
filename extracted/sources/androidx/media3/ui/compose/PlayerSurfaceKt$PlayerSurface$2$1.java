package androidx.media3.ui.compose;

import android.view.SurfaceView;
import defpackage.gb6;
import defpackage.js3;
import defpackage.qp2;
import defpackage.tx8;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class PlayerSurfaceKt$PlayerSurface$2$1 extends FunctionReferenceImpl implements qp2 {
    public static final PlayerSurfaceKt$PlayerSurface$2$1 a = new PlayerSurfaceKt$PlayerSurface$2$1();

    public PlayerSurfaceKt$PlayerSurface$2$1() {
        super(2, gb6.class, "setVideoSurfaceView", "setVideoSurfaceView(Landroid/view/SurfaceView;)V", 0);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        gb6 gb6Var = (gb6) obj;
        js3.p(gb6Var, "p0");
        gb6Var.v((SurfaceView) obj2);
        return tx8.a;
    }
}
