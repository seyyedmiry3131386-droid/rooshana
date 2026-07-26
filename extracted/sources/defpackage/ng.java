package defpackage;

import android.content.Context;
import android.os.Build;
import androidx.compose.ui.graphics.layer.a;
import androidx.compose.ui.graphics.layer.c;
import androidx.compose.ui.graphics.layer.d;
import androidx.compose.ui.graphics.layer.view.ViewLayerContainer;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class ng implements ev2 {
    public static boolean f = true;
    public final AndroidComposeView a;
    public final Object b = new Object();
    public ViewLayerContainer c;
    public boolean d;
    public final lg e;

    public ng(AndroidComposeView androidComposeView) {
        this.a = androidComposeView;
        lg lgVar = new lg(0, this);
        this.e = lgVar;
        if (androidComposeView.isAttachedToWindow()) {
            Context context = androidComposeView.getContext();
            if (!this.d) {
                context.getApplicationContext().registerComponentCallbacks(lgVar);
                this.d = true;
            }
        }
        androidComposeView.addOnAttachStateChangeListener(new mg(0, this));
    }

    @Override // defpackage.ev2
    public final void a(a aVar) {
        synchronized (this.b) {
            if (!aVar.s) {
                aVar.s = true;
                aVar.b();
            }
        }
    }

    @Override // defpackage.ev2
    public final a b() {
        fv2 iv2Var;
        a aVar;
        synchronized (this.b) {
            try {
                AndroidComposeView androidComposeView = this.a;
                int i = Build.VERSION.SDK_INT;
                if (i >= 29) {
                    te.B(androidComposeView);
                }
                if (i >= 29) {
                    iv2Var = new d();
                } else if (f) {
                    try {
                        iv2Var = new c(this.a, new wm0(), new vm0());
                    } catch (Throwable unused) {
                        f = false;
                        AndroidComposeView androidComposeView2 = this.a;
                        ViewLayerContainer viewLayerContainer = this.c;
                        if (viewLayerContainer == null) {
                            ViewLayerContainer viewLayerContainer2 = new ViewLayerContainer(androidComposeView2.getContext());
                            androidComposeView2.addView(viewLayerContainer2, -1);
                            this.c = viewLayerContainer2;
                            viewLayerContainer = viewLayerContainer2;
                        }
                        iv2Var = new iv2(viewLayerContainer);
                    }
                } else {
                    AndroidComposeView androidComposeView3 = this.a;
                    ViewLayerContainer viewLayerContainer3 = this.c;
                    if (viewLayerContainer3 == null) {
                        ViewLayerContainer viewLayerContainer4 = new ViewLayerContainer(androidComposeView3.getContext());
                        androidComposeView3.addView(viewLayerContainer4, -1);
                        this.c = viewLayerContainer4;
                        viewLayerContainer3 = viewLayerContainer4;
                    }
                    iv2Var = new iv2(viewLayerContainer3);
                }
                aVar = new a(iv2Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }
}
