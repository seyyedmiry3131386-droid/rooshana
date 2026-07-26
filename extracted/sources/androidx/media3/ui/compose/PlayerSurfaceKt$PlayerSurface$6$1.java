package androidx.media3.ui.compose;

import android.view.TextureView;
import defpackage.gb6;
import defpackage.js3;
import defpackage.qp2;
import defpackage.tx8;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class PlayerSurfaceKt$PlayerSurface$6$1 extends FunctionReferenceImpl implements qp2 {
    static {
        new PlayerSurfaceKt$PlayerSurface$6$1();
    }

    public PlayerSurfaceKt$PlayerSurface$6$1() {
        super(2, gb6.class, "clearVideoTextureView", "clearVideoTextureView(Landroid/view/TextureView;)V", 0);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        gb6 gb6Var = (gb6) obj;
        js3.p(gb6Var, "p0");
        gb6Var.q((TextureView) obj2);
        return tx8.a;
    }
}
