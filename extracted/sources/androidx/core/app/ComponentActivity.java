package androidx.core.app;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.Lifecycle$State;
import androidx.lifecycle.ReportFragment;
import androidx.lifecycle.d;
import defpackage.cy3;
import defpackage.g64;
import defpackage.i64;
import defpackage.ja1;
import defpackage.js3;

/* JADX INFO: loaded from: classes.dex */
public class ComponentActivity extends Activity implements g64, cy3 {
    public final i64 a = new i64(this, true);

    public i64 D() {
        return this.a;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        js3.p(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        js3.o(decorView, "getDecorView(...)");
        if (ja1.l(decorView, keyEvent)) {
            return true;
        }
        return ja1.m(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        js3.p(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        js3.o(decorView, "getDecorView(...)");
        if (ja1.l(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = ReportFragment.b;
        d.b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        js3.p(bundle, "outState");
        this.a.g(Lifecycle$State.c);
        super.onSaveInstanceState(bundle);
    }

    @Override // defpackage.cy3
    public final boolean t(KeyEvent keyEvent) {
        js3.p(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }
}
