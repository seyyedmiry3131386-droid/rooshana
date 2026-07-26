package defpackage;

import android.os.Handler;
import android.view.inputmethod.InputConnection;

/* JADX INFO: loaded from: classes.dex */
public class vp5 extends up5 {
    @Override // defpackage.up5
    public final void a(InputConnection inputConnection) {
        inputConnection.closeConnection();
    }

    @Override // defpackage.up5, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        InputConnection inputConnection = this.b;
        if (inputConnection != null) {
            return inputConnection.deleteSurroundingTextInCodePoints(i, i2);
        }
        return false;
    }

    @Override // defpackage.up5, android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        InputConnection inputConnection = this.b;
        if (inputConnection != null) {
            return inputConnection.getHandler();
        }
        return null;
    }
}
