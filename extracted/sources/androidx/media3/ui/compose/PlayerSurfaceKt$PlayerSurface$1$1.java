package androidx.media3.ui.compose;

import android.content.Context;
import android.view.SurfaceView;
import defpackage.dp2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class PlayerSurfaceKt$PlayerSurface$1$1 extends FunctionReferenceImpl implements dp2 {
    public static final PlayerSurfaceKt$PlayerSurface$1$1 a = new PlayerSurfaceKt$PlayerSurface$1$1();

    public PlayerSurfaceKt$PlayerSurface$1$1() {
        super(1, SurfaceView.class, "<init>", "<init>(Landroid/content/Context;)V", 0);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return new SurfaceView((Context) obj);
    }
}
