package defpackage;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class q02 extends xz1 implements Runnable {
    public final WeakReference a;

    public q02(EditText editText) {
        this.a = new WeakReference(editText);
    }

    @Override // defpackage.xz1
    public final void b() {
        Handler handler;
        EditText editText = (EditText) this.a.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        r02.a((EditText) this.a.get(), 1);
    }
}
