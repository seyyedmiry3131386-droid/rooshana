package ir.myket.player.provider;

import android.os.Bundle;
import defpackage.j97;
import defpackage.qf9;
import defpackage.sa7;
import org.koin.androidx.scope.RetainedScopeActivity;

/* JADX INFO: loaded from: classes3.dex */
public class FullscreenActivity extends RetainedScopeActivity {
    public qf9 D;

    public FullscreenActivity() {
        super(0);
    }

    @Override // org.koin.androidx.scope.RetainedScopeActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        j97.d(getWindow(), false);
        this.D = new qf9(getWindow(), getWindow().getDecorView());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        qf9 qf9Var = this.D;
        if (qf9Var != null) {
            sa7 sa7Var = qf9Var.a;
            sa7Var.n();
            sa7Var.g(519);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        qf9 qf9Var = this.D;
        if (qf9Var != null) {
            qf9Var.a.o(519);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        qf9 qf9Var;
        super.onWindowFocusChanged(z);
        if (!z || (qf9Var = this.D) == null) {
            return;
        }
        sa7 sa7Var = qf9Var.a;
        sa7Var.n();
        sa7Var.g(519);
    }
}
