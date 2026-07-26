package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ns7 extends ts7 {
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ Matrix d;

    public ns7(ArrayList arrayList, Matrix matrix) {
        this.c = arrayList;
        this.d = matrix;
    }

    @Override // defpackage.ts7
    public final void a(Matrix matrix, vr7 vr7Var, int i, Canvas canvas) {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((ts7) it.next()).a(this.d, vr7Var, i, canvas);
        }
    }
}
