package defpackage;

import com.sun.jna.Native;

/* JADX INFO: loaded from: classes3.dex */
public final class yo2 extends gt4 implements ap2 {
    public final vh5[] d;

    public yo2(vh5[] vh5VarArr) {
        super(Native.k(vh5VarArr.getClass(), vh5VarArr));
        this.d = vh5VarArr;
        C(0L, vh5VarArr.getClass(), vh5VarArr);
    }

    @Override // defpackage.ap2
    public final void read() {
        vh5[] vh5VarArr = this.d;
        k(0L, vh5VarArr.getClass(), vh5VarArr);
    }
}
