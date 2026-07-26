package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;

/* JADX INFO: loaded from: classes.dex */
public final class sj4 extends LinearLayoutManager {
    public final /* synthetic */ int E;
    public final /* synthetic */ MaterialCalendar F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj4(MaterialCalendar materialCalendar, int i, int i2) {
        super(i);
        this.F = materialCalendar;
        this.E = i2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.k
    public final void D0(RecyclerView recyclerView, int i) {
        q06 q06Var = new q06(recyclerView.getContext(), 1);
        q06Var.a = i;
        E0(q06Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void G0(b07 b07Var, int[] iArr) {
        int i = this.E;
        MaterialCalendar materialCalendar = this.F;
        if (i == 0) {
            iArr[0] = materialCalendar.J0.getWidth();
            iArr[1] = materialCalendar.J0.getWidth();
        } else {
            iArr[0] = materialCalendar.J0.getHeight();
            iArr[1] = materialCalendar.J0.getHeight();
        }
    }
}
