package androidx.media3.ui.compose;

import android.content.Context;
import android.view.TextureView;
import defpackage.dp2;
import defpackage.js3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class PlayerSurfaceKt$PlayerSurface$4$1 extends FunctionReferenceImpl implements dp2 {
    static {
        new PlayerSurfaceKt$PlayerSurface$4$1();
    }

    public PlayerSurfaceKt$PlayerSurface$4$1() {
        super(1, TextureView.class, "<init>", "<init>(Landroid/content/Context;)V", 0);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        Context context = (Context) obj;
        js3.p(context, "p0");
        return new TextureView(context);
    }
}
