package defpackage;

import com.sun.jna.Native;
import com.sun.jna.Pointer;

/* JADX INFO: loaded from: classes3.dex */
public final class zo2 extends gt4 implements ap2 {
    public final Pointer[] d;

    public zo2(Pointer[] pointerArr) {
        super((pointerArr.length + 1) * Native.i);
        this.d = pointerArr;
        for (int i = 0; i < pointerArr.length; i++) {
            A(Native.i * i, pointerArr[i]);
        }
        A(Native.i * pointerArr.length, null);
    }

    @Override // defpackage.ap2
    public final void read() {
        Pointer[] pointerArr = this.d;
        s(0L, pointerArr, pointerArr.length);
    }
}
