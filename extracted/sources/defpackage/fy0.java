package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.DefaultLifecycleObserver;

/* JADX INFO: loaded from: classes3.dex */
public final class fy0 implements DefaultLifecycleObserver {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fy0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(g64 g64Var) {
        int i = this.a;
        tf1.a(this, g64Var);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(g64 g64Var) {
        switch (this.a) {
            case 0:
                js3.p(g64Var, "owner");
                ((lf7) this.b).a();
                tf1.b(this, g64Var);
                break;
            case 1:
                tf1.b(this, g64Var);
                break;
            default:
                tf1.b(this, g64Var);
                break;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(g64 g64Var) {
        int i = this.a;
        tf1.c(this, g64Var);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(g64 g64Var) {
        switch (this.a) {
            case 0:
                tf1.d(this, g64Var);
                break;
            case 1:
                (Build.VERSION.SDK_INT >= 28 ? w01.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new b02(0), 500L);
                ((i64) this.b).f(this);
                break;
            default:
                tf1.d(this, g64Var);
                break;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(g64 g64Var) {
        switch (this.a) {
            case 0:
                tf1.e(this, g64Var);
                break;
            case 1:
                tf1.e(this, g64Var);
                break;
            default:
                ((om0) this.b).resumeWith(tx8.a);
                break;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(g64 g64Var) {
        int i = this.a;
        tf1.f(this, g64Var);
    }

    public fy0(EmojiCompatInitializer emojiCompatInitializer, i64 i64Var) {
        this.a = 1;
        this.b = i64Var;
    }
}
